package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import android.app.Activity;
import android.widget.LinearLayout;

public class Questionnaire {
	
	private Activity a;
	private ArrayList<Question> questions;

	public Questionnaire(Activity a){
		this.a = a;
		this.questions = new ArrayList<Question>();
	}
	
	public void addQuestion(Question q){
		q.setParent(this);
		questions.add(q);
	}
	
	public Activity getActivity(){
		return a;
	}
	
	public void generateAllViews(LinearLayout ll){
		for(Question q : questions){
			ll.addView(q.generateView());
		}
	}
}
