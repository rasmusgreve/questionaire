package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;
import java.util.List;

import android.view.View;

public abstract class Question {
	
	private Questionnaire qn;
	
	private String question;
	private String description;
	private boolean mandatory;
	private List<String[]> conditions;
	
	public Question(String question, String description, boolean mandatory)
	{
		this.question = question;
		this.description = description;
		this.mandatory = mandatory;
		
		this.conditions = new ArrayList<String[]>();
	}
	
	public abstract View generateView();
	
	public abstract boolean isAnswered();
	
	public abstract void setVisible(boolean visible);
	
	@Override
	public abstract String toString();

	//// GETTERS AND SETTERS ////
	public String getQuestion() {
		return question;
	}

	public String getDescription() {
		return description;
	}
	
	public boolean isMandatory() {
		return mandatory;
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
	
	public List<String[]> getConditions(){
		return conditions;
	}
	
	// Non-trivial methods
	
	public String getQuestionText(){
		return getParent().getQuestionNumber(this)+". "+this.getQuestion() + (this.isMandatory() ? " *" : "");
	}
	
	public boolean conditionsSatisfied(){
		for(String[] sarr : conditions){
			boolean anyIDChosen = false;
			for(String s : sarr){
				ChoiceQuestion cq = getParent().getQuestionWithID(s);
				anyIDChosen |= cq.isIDChosen(s);
			}
			if(!anyIDChosen)
				return false;
		}
		return true;
		
	}
}
