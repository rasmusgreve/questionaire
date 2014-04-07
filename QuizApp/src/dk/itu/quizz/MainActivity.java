/*
 ** 
 * @author scas @ itu.dk
 * There are 4 important files in this project. MainActivity.java(in src folder), activity_main.xml(in res/layout folder)
 * and strings.xml(in res/value folder) and AndroidManifest.xml
 * a) Mainactivity is the activity for our app. Here is defined all the functionality.
 * b) activity_main.xml - here are defined the widgets for our app (Buttons, RadioButtons, TextViews etc).
 * c) strings.xml - here I store my questions and answers as a string resource.
 * d) AndroidManifest.xml - here I define the app's properties. For Internet access, you need
 * to add the following permission <uses-permission android:name="android.permission.INTERNET"/>
 * 
 * Android app for a very simple quiz. There are two questions and 3 answers for each of the questions, 
 * defined in the strings resources.
 * Whenever a button is pressed, some action is taken. 
 * When the previous/next button is pressed, the selected answer of that question is stored. Later,
 * this is used when browsing back and forth between questions to show what was previously selected as the desired answer.
 * Another way to do this is with radioButton onClick listener. 
 **  
 * I use javax.mail for e-mail functionality.
 * E-mail properties are statically defined in the methods. If you want to use this, change the properties
 * to match you e-mail server, and with the appropriate username and password. 
 * 
 * The layout of the app is defined in Activity_main.xml. Take a look there as well.
 */

package dk.itu.quizz;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import dk.itu.quizz.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Button button1;
	private Button button2;
	private Button button3;
	private RadioGroup radioGroup1;
	private RadioButton radioButton1;
	private RadioButton radioButton2;
	private RadioButton radioButton3;
	private TextView textView;
	private int size = 2;
	private int counter = 0;
	private Map<Integer, Integer> selectedAnswers;
	private Map<Integer, String> answers;
	private List<String[]> quizInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        Resources resources = getResources();
        quizInfo = new ArrayList<String []>();
        quizInfo.add(resources.getStringArray(R.array.question1));
        quizInfo.add(resources.getStringArray(R.array.question2));
        textView.setText(quizInfo.get(0)[0]);
        selectedAnswers = new TreeMap<Integer,Integer>();
    	answers = new TreeMap<Integer, String>();    
        for(int i=0; i<size;i++){
        	selectedAnswers.put(i, R.id.radio0);
        }
        // Put initial text for the first question
        radioButton1.setText(quizInfo.get(0)[1]);
        radioButton2.setText(quizInfo.get(0)[2]);
        radioButton3.setText(quizInfo.get(0)[3]);
        // Have initial selection
         for(int i=0;i<quizInfo.size();i++){
        	answers.put(i, quizInfo.get(i)[1]);
        }
        /*
         * When an answer is selected, I store the text of that answer (and later use it when sending it via e-mail)
         */
        radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				int id = radioGroup1.getCheckedRadioButtonId();
				answers.put(counter, (String)((RadioButton) findViewById(id)).getText());
			}
		});
		/*
		 * Action taken when the Next button is pressed. 
		 */
        button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int id = radioGroup1.getCheckedRadioButtonId();
				selectedAnswers.put(counter, id);
				// if i get to the end, start from 0
				if(counter == size-1){
					counter = 0;
					textView.setText(quizInfo.get(counter)[0]);
					
				}// else go to the next question
				else{
					textView.setText(quizInfo.get(++counter)[0]);
				}
				// set the answer that was selected
				setAnswers(counter);
	           	radioGroup1.check(selectedAnswers.get(counter));
			}
		});
        /*
         * Action taken when previous button was pressed.
         */
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int id = radioGroup1.getCheckedRadioButtonId();
                selectedAnswers.put(counter,id);
				if(counter > 0){
					textView.setText(quizInfo.get(--counter)[0]);
				}
				else if(counter == 0 ){
					counter = quizInfo.size()-1;
					textView.setText(quizInfo.get(counter)[0]);
				}
				setAnswers(counter);
				radioGroup1.check(selectedAnswers.get(counter));
			}
		});
        /*
         * This builds a String with the question and the selected answer.
         * This String is then passed for the e-mail as the Message Body.
         */
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				StringBuilder builder = new StringBuilder();
				for(int i=0;i<quizInfo.size();i++){
					builder.append(quizInfo.get(i)[0]+"\n");
					builder.append("\t"+quizInfo.get(i)[1]+"\n");
					builder.append("\t"+quizInfo.get(i)[2]+"\n");
					builder.append("\t"+quizInfo.get(i)[3]+"\n");
					builder.append("\t\t"+"Selected Answer is - "+answers.get(i)+"\n");
				}
				
				sendMail("scas@itu.dk", "Quiz results", builder.toString());
			}
		});
    }
    
    /*
     * This is a weird way for storing the selected answer of a question, to show it later
     */
    
    public void setAnswers(int questionNumber){
    	radioButton1.setText(quizInfo.get(questionNumber)[1]);
    	radioButton2.setText(quizInfo.get(questionNumber)[2]);
    	radioButton3.setText(quizInfo.get(questionNumber)[3]);
    }
    /*
     * Initializing Buttons, RadioButtons and TextView; this is standard initialization in Android
     */
    public void initWidgets(){
    	button1 = (Button) findViewById(R.id.button1);
    	button2 = (Button) findViewById(R.id.button2);
    	button3 = (Button) findViewById(R.id.button3);
    	radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
    	radioButton1 = (RadioButton) findViewById(R.id.radio0);
    	radioButton2 = (RadioButton) findViewById(R.id.radio1);
    	radioButton3 = (RadioButton) findViewById(R.id.radio2);
    	textView = (TextView) findViewById(R.id.textView1);
    }
    /**
     * These are static defined for Google SMTP. If you want to use another
     * e-mail server, change these accordingly
     * @return Session for sending e-mails
     */
	private Session createSessionObject() {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
     
        return Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password"); // change this credentials
            }
        });
    }
   
    private Message createMessage(String email, String subject, String messageBody, Session session) throws MessagingException, UnsupportedEncodingException {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("quizapp@itu.dk", "authorName")); // this e-mail address does not have to be valid :)
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email, email));
        message.setSubject(subject);
        message.setText(messageBody);
        return message;
    }
    /*
     * Send e-mail functionality. Takes as arguments an e-mail address as a String,
     * a subject as a String and a message body as a String. 
     * 
     */
    private void sendMail(String email, String subject, String messageBody) {
        Session session = createSessionObject();
        try {
            Message message = createMessage(email, subject, messageBody, session);
            new SendMailTask().execute(message);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    /*
     * The standard way of creating Threads for different tasks in Android. 
     * In the doInBackground the stuff happens in a different thread than the UI thread. 
     * It is not recommended to have this kind of functionality on the UI thread.
     * Always use an AsyncTask for these kind of things. 
     *
     */
    private class SendMailTask extends AsyncTask<Message, Void, Void> {
        private ProgressDialog progressDialog;
     
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(MainActivity.this, "Please wait", "Sending mail", true, false);
        }
     
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            progressDialog.dismiss();
        }
     
        protected Void doInBackground(Message... messages) {
            try {
                Transport.send(messages[0]);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

