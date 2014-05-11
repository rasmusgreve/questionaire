package dk.itu.smdp.group2.questionnaire.model;

import java.util.ArrayList;
import java.util.List;

import android.view.View;

/**
 * The base-class for all Questions with the abstract methods necessary
 * for the Questionnaire to properly control the flow and gather answers.
 * 
 * @author Emil
 *
 */
public abstract class Question {
	
	private Questionnaire qn;
	
	private String question;
	private String description;
	private boolean mandatory;
	private List<String[]> conditions;
	
	/**
	 * Initializes the parameters necessary for all Questions.
	 * 
	 * @param question The question to answer.
	 * @param desc The more detailed description to the question if necessary.
	 * Null or empty string will be seen as no description.
	 * @param mandatory True if the Question should be marked as mandatory for the
	 * Questionnaire to be complete.
	 */
	public Question(String question, String description, boolean mandatory)
	{
		this.question = question;
		this.description = description;
		this.mandatory = mandatory;
		
		this.conditions = new ArrayList<String[]>();
	}
	
	/**
	 * Generates the Android View of the Question, usually
	 * a layout with some interactive components inside.
	 * 
	 * @return The root View of the Question.
	 */
	public abstract View generateView();
	
	/**
	 * Checks if the given Question has been sufficiently
	 * answered by the respondent.
	 * 
	 * @return True, if the Question has been fully answered
	 * and is ready for sending.
	 */
	public abstract boolean isAnswered();
	
	/**
	 * Toggles the visibility of the Question depending on
	 * the given boolean. This will be used to hide Questions
	 * when their conditions have not been satisfied.
	 * 
	 * @param visible True, if the Question should be made
	 * visible, else False for hiding it.
	 */
	public abstract void setVisible(boolean visible);
	
	@Override
	public abstract String toString();

	//// GETTERS AND SETTERS ////
	/**
	 * Returns the wording of the Question.
	 * 
	 * @return A String with the wording of the Question.
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * Returns the description of this Question.
	 * 
	 * @return The description of this Question.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Checks if this Question is mandatory or not
	 * in the Questionnaire.
	 * 
	 * @return True, if answering this Question is
	 * mandatory.
	 */
	public boolean isMandatory() {
		return mandatory;
	}
	
	/**
	 * Sets the containing Questionnaire of this
	 * Question to the one given. This is necessary
	 * for the Question to be able to properly
	 * initialize Android components.
	 * 
	 * @param qn The parent Questionnaire.
	 */
	public void setParent(Questionnaire qn){
		this.qn = qn;
	}
	
	/**
	 * Gets the current parent Questionnaire of
	 * this Question. Through it, it is possible
	 * to get the current Android Context.
	 * 
	 * @return The (containing) parent Questionnaire.
	 */
	public Questionnaire getParent(){
		return qn;
	}
	
	/**
	 * Adds the given condition to this Question where
	 * the answering of any of them previously in the
	 * Questionnaire would mean satisfying this condition.
	 * (But possibly not any other conditions added to
	 * this Question.
	 * 
	 * @param conds Any number of Strings of IDs that would
	 * satisfy this condition.
	 */
	public void addCondition(String... conds){
		this.conditions.add(conds);
	}
	
	/**
	 * Gets all the condition currently added to this
	 * Question.
	 * 
	 * @return A List of Conitions (as String arrays) of
	 * this Question.
	 */
	public List<String[]> getConditions(){
		return conditions;
	}
	
	// Non-trivial methods
	
	/**
	 * Gets the text of this Question as it should be displayed in the app.
	 * This includes the Question number defined by the parent Questionnaire
	 * and an asterisk to indicate a mandatory Question.
	 * 
	 * @return A String with the complete Question text.
	 */
	public String getQuestionText(){
		return getParent().getQuestionNumber(this)+". "+this.getQuestion() + (this.isMandatory() ? " *" : "");
	}
	
	/**
	 * Checks if the conditions of this Question are satisfied
	 * with respect to the current parent Questionnaire and
	 * thereby the other Questions with which it has conditions.
	 * 
	 * @return True, if all conditions have atleast one of their
	 * IDs selected previously in the Questionnaire.
	 */
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
