package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;

import android.view.View;

public abstract class Question {
	
	private Questionnaire qn;
	
	private String question;
	private String description;
	private boolean optional;
	private ArrayList<String[]> conditions;
	
	public Question(String question, String description, boolean optional)
	{
		this.question = question;
		this.description = description;
		this.optional = optional;
	}
	
	public abstract View generateView();
	
	public abstract String generateTextResult();
	
	public abstract boolean isAnswered();
	
	public abstract void setVisible(boolean visible);

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
	
	public void setParent(Questionnaire qn){
		this.qn = qn;
	}
	
	public Questionnaire getParent(){
		return qn;
	}
	
	public void addCondition(String... conds){
		this.conditions.add(conds);
	}
	
	public ArrayList<String[]> getConditions(){
		return conditions;
	}
	
	// Non-trivial methods
	
	public boolean conditionsSatisfied(){
		for(String[] sarr : conditions){
			boolean allIDsChosen = true;
			for(String s : sarr){
				ChoiceQuestion cq = getParent().getQuestionWithID(s);
				allIDsChosen = allIDsChosen && cq.isIDChosen(s);
			}
			if(allIDsChosen)
				return true;
		}
		return false;
		
	}
}
