package dk.itu.smdp.group2.questionnaire.model;

import android.content.Context;
import android.view.View;

public abstract class Question {
	private String question;
	private String description;
	private boolean optional;
	private Context context;
	
	public Question(String question, String description, boolean optional, Context context)
	{
		this.question = question;
		this.description = description;
		this.optional = optional;
		this.context = context;
	}
	
	public abstract View generateView();
	
	public abstract String generateTextResult();


	//// GETTERS AND SETTERS ////
	public String getQuestion() {
		return question;
	}

	public String getDescription() {
		return description;
	}
	
	public boolean isOptional() {
		return optional;
	}
	
	public Context getContext(){
		return context;
	}
}
