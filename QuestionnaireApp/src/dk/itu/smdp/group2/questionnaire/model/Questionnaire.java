package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * The Questionnaire contains all of the Questions and handles the
 * interaction between them, and makes sure only the necessary
 * (and conditionally satisfied) Questions are visible at any given
 * time.
 * 
 * @author Emil
 *
 */
public class Questionnaire {
	
	private Activity a;
	private ArrayList<Question> questions;
	private String email, title;

	/**
	 * Initializes the Questionnaire with reference to the Android
	 * context and parameters for the Questionnaire in general.
	 * 
	 * @param a The current Android Activity that the children
	 * (Questions) can use to initialize Views.
	 * @param title The overall Title of the Questionnaire.
	 * @param email The email that a successfully answered 
	 * Questionnaire should be sent to.
	 */
	public Questionnaire(Activity a, String title, String email){
		this.a = a;
		this.title = title;
		this.email = email;
		this.questions = new ArrayList<Question>();
	}
	
	/**
	 * Adds the given Question to the current end of the 
	 * Questionnaire.
	 * 
	 * @param q The new Question.
	 */
	public void addQuestion(Question q){
		q.setParent(this);
		questions.add(q);
	}
	
	/**
	 * Adds the given Paragraph to the current end of the 
	 * Questionnaire. This method is just for syntax, since
	 * Paragraph inherits from Question.
	 * 
	 * @param p The new Paragraph.
	 */
	public void addParagraph(Paragraph p){
		addQuestion(p);
	}
	
	/**
	 * Adds the given Heading to the current end of the
	 * Questionnaire. This method is just for syntax, since
	 * Heading inherits from Question.
	 * 
	 * @param h The new Heading.
	 */
	public void addHeading(Heading h){
		addQuestion(h);
	}
	
	/**
	 * Gets the email set as destination
	 * of this Questionnaire's results.
	 * 
	 * @return
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * Gets the title of this Questionnaire.
	 * 
	 * @return The title of this Questionnaire.
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * Gets the Activity for this Questionnaire.
	 * 
	 * @return The Activity for this Questionnaire.
	 */
	public Activity getActivity(){
		return a;
	}
	
	// Untrivial Methods
	
	/**
	 * Generates the Views of all the Questions and
	 * adds them to the given LinearLayout.
	 * 
	 * @param ll The LinearLayout to populate.
	 */
	public void generateAllViews(LinearLayout ll){
		for(Question q : questions){
			ll.addView(q.generateView());
		}
	}

	/**
	 * Finds the first Question that has not been answered
	 * while being mandatory or having satisfied conditions.
	 * 
	 * @return The index of the Question or -1 if all necessary
	 * Questions have been answered.
	 */
	public int getFirstUncomplete() {
		for(int i = 0; i < questions.size(); i++){
			Question q = questions.get(i);
			if(!q.isAnswered() && q.conditionsSatisfied() && q.isMandatory())
				return i;
		}
		return -1;
	}
	
	/**
	 * Gets the number of a Question at a given position,
	 * ignoring Headings and Paragraphs.
	 * 
	 * @param pos The position to find number of.
	 * @return The question number at that position.
	 */
	public int getQuestionNumber(int pos){
		int textsBefore = 0;
		for(int i = 0; i < pos; i++){
			if(questions.get(i) instanceof Heading || questions.get(i) instanceof Paragraph)
				textsBefore++;
		}
		return pos - textsBefore + 1;
	}
	
	/**
	 * Gets the number of the given Question, ignoring
	 * Headings and Paragraphs.
	 * 
	 * @param q The Question to look up.
	 * @return The question number of the Question.
	 */
	public int getQuestionNumber(Question q){
		return getQuestionNumber(questions.indexOf(q));
	}

	/**
	 * Starts the Email intent with the answers of the Questionnaire
	 * for sending to the questionnaire designer.
	 */
	public void sendEmail() {
		Intent i = new Intent(Intent.ACTION_SEND);
		i.setType("message/rfc822");
		i.putExtra(Intent.EXTRA_EMAIL, new String[]{this.getEmail()});
		i.putExtra(Intent.EXTRA_SUBJECT, this.getTitle()+" Answer");
		i.putExtra(Intent.EXTRA_TEXT, this.generateTextResult());
		try{
			getActivity().startActivity(Intent.createChooser(i, "Send answer in mail..."));
		}catch(android.content.ActivityNotFoundException ex){
			Toast.makeText(getActivity(), "No email clients installed.", Toast.LENGTH_SHORT).show();
		}
	}

	/**
	 * Checks if the Questionnaire is correctly answered.
	 * 
	 * @return True, if all mandatory unlocked Questions
	 * have been answered.
	 */
	public boolean isCompleted() {
		return getFirstUncomplete() == -1;
	}

	/**
	 * Checks for satisfaction of the conditions of all
	 * Questions and makes them correctly visible/invisible
	 * depending on the new results.
	 */
	public void checkConditions() {
		System.out.println("check called");
		for(Question q : questions){
			
			boolean sat = q.conditionsSatisfied();
			System.out.println("q "+q.getQuestion()+" "+sat);
			q.setVisible(sat);
		}
	}

	/**
	 * Finds the ChoiceQuestion that contains the option
	 * with the given ID.
	 * 
	 * @param id The ID to find.
	 * @return The containing ChoiceQuestion and null if
	 * no ChoiceQuestion contains an option with the given
	 * ID.
	 */
	public ChoiceQuestion getQuestionWithID(String id) {
		for(Question q : questions){
			if(q instanceof ChoiceQuestion){
				ChoiceQuestion cq = (ChoiceQuestion)q;
				if(cq.containsID(id))
					return cq;
			}
		}
		return null; // no match
	}
	
	/**
	 * Generates the text result for inclusion in the email with
	 * answers from each Question. This is in a human-readable
	 * format with line breaks between questions.
	 * 
	 * @return A String with all the answers of the Questions.
	 */
	public String generateTextResult(){
		if (!isCompleted()) return "";
		String s = "";
		for(int i = 0; i < questions.size(); i++)
			if(!(questions.get(i) instanceof Paragraph) && !(questions.get(i) instanceof Heading))
				s += (s.length() == 0 ? "" : "\n") + getQuestionNumber(i) + ") " + questions.get(i);
		return s;
				
	}
}
