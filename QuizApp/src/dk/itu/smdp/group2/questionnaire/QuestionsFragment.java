package dk.itu.smdp.group2.questionnaire;

import java.util.List;

import dk.itu.smdp.group2.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import dk.itu.smdp.group2.questionnaire.model.*;

public class QuestionsFragment extends Fragment {
	
	private Questionnaire init() {
		// THIS IS WHERE AUTO GENERATED SHOULD CREATE OBJECTS
		// AND PUT THEM IN THE SCROLLVIEW'S LINEAR LAYOUT
		
        Questionnaire questionnaire = new Questionnaire(this.getActivity(), "Food Questions", "ragr@itu.dk");
        
        TextQuestion text;
        ChoiceQuestion choice;
        //MatrixQuestion matrix;
        //CalendarQuestion calendar;
        IntegerQuestion integer;
       
        questionnaire.addHeading(new Heading("Eating habits"));
       
        questionnaire.addParagraph(new Paragraph("Tell me about your eating habits"));
       
        integer = new IntegerQuestion("How often do you eat in a week!?", "", false, 1, 10, 3);
        questionnaire.addQuestion(integer);
       
        text = new TextQuestion("What is your favorite recipe?", "Please enter the entire recipe", true, 4);
        questionnaire.addQuestion(text);
       
        //calendar = new CalendarQuestion("When did you last eat?", "", true, false, true, true, true, true);
        //questionnaire.addQuestion(calendar);
       
        choice = new ChoiceQuestion("Which of the folowing do you like the best?", "", true, 2, 2);
        choice.addOption("pasta", "Pasta");
        choice.addOption("pasta2", "Meat");
        choice.addOption("pasta1", "Whatever");
        choice.addOption("", "Nothing");
        questionnaire.addQuestion(choice);
       
        choice = new ChoiceQuestion("Do you have taste buds?", "", true, 1, 1);
        choice.addOption("yes", "Yes");
        choice.addOption("a_little", "A little");
        choice.addOption("", "No");
        questionnaire.addQuestion(choice);
       
        /*matrix = new MatrixQuestion("How do you like the following dishes?", "Description", true, 1);
        matrix.setColumns("Really well", "Sorta", "Really bad", "Only if my mom made it");
        matrix.setRows("Kebob", "Pizza", "Chocolate");
        matrix.addCondition("a_little", "yes");
        matrix.addCondition("pasta");
        questionnaire.addQuestion(matrix);*/
        
        return questionnaire;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Questionnaire qn = init();
		
		View v = inflater.inflate(R.layout.questions_fragment, container, false);
		TextView title = (TextView) v.findViewById(R.id.tvTitle);
		LinearLayout scroll = (LinearLayout)v.findViewById(R.id.svsLinearLayout);
		
		title.setText(qn.getTitle());
		
		qn.generateAllViews(scroll);
		createButton(qn,scroll);
		
		return v;
	}

	private void createButton(final Questionnaire qn, LinearLayout scroll) {
		Button b = new Button(getActivity());
		b.setText("Send");
		b.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(qn.isCompleted()){
					qn.sendEmail();
				}else{
					int missing = qn.getQuestionNumber(qn.getFirstUncomplete());
					String message = "Question "+missing+" must be answered.";
					Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
				}
			}
		});
		
		scroll.addView(b);
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
