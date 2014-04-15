package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import android.app.Activity;
import android.widget.LinearLayout;

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

	public void sendEmail() {
		// TODO Auto-generated method stub
		
	}

	public boolean isCompleted() {
		return getFirstUncomplete() == -1;
	}

	public void checkConditions() {
		for(Question q : questions){
			q.setVisible(q.conditionsSatisfied());
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
}
