package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Questionnaire {
	
	private Activity a;
	private ArrayList<Question> questions;
	private String email, title;

	public Questionnaire(Activity a, String title, String email){
		this.a = a;
		this.title = title;
		this.email = email;
		this.questions = new ArrayList<Question>();
	}
	
	public void addQuestion(Question q){
		q.setParent(this);
		questions.add(q);
	}
	
	public void addParagraph(Paragraph p){
		addQuestion(p);
	}
	
	public void addHeading(Heading h){
		addQuestion(h);
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getTitle(){
		return title;
	}
	
	public Activity getActivity(){
		return a;
	}
	
	// Untrivial Methods
	
	public void generateAllViews(LinearLayout ll){
		for(Question q : questions){
			ll.addView(q.generateView());
		}
	}

	public int getFirstUncomplete() {
		for(int i = 0; i < questions.size(); i++){
			Question q = questions.get(i);
			if(!q.isAnswered() && q.conditionsSatisfied() && !q.isOptional())
				return i;
		}
		return -1;
	}
	
	public int getQuestionNumber(int pos){
		int textsBefore = 0;
		for(int i = 0; i < pos; i++){
			if(questions.get(i) instanceof Heading || questions.get(i) instanceof Paragraph)
				textsBefore++;
		}
		return pos - textsBefore + 1;
	}

	public void sendEmail() {
		// TODO Auto-generated method stub
		Toast.makeText(getActivity(), generateTextResult(),Toast.LENGTH_LONG).show();
	}

	public boolean isCompleted() {
		return getFirstUncomplete() == -1;
	}

	public void checkConditions() {
		System.out.println("check called");
		for(Question q : questions){
			
			boolean sat = q.conditionsSatisfied();
			System.out.println("q "+q.getQuestion()+" "+sat);
			q.setVisible(sat);
		}
	}

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
	
	public String generateTextResult(){
		if (!isCompleted()) return "";
		String s = "";
		for(int i = 0; i < questions.size(); i++)
			if(!(questions.get(i) instanceof Paragraph) && !(questions.get(i) instanceof Heading))
				s += (s.length() == 0 ? "" : "\n") + getQuestionNumber(i) + ") " + questions.get(i);
		return s;
				
	}
}
