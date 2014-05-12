package dk.itu.smdp.group2.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import dk.itu.smdp.group2.validation.QuestionaireValidator
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
//import dk.itu.smdp.group2.Questionaire.IntegerQuestion;
import questionairemodel.IntegerQuestion;
import questionairemodel.TextQuestion
import questionairemodel.Option

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class QuestionaireQuickfixProvider extends DefaultQuickfixProvider {

	/*
	 * Remove the step setting from integer questions
	 */
	@Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
	def removeStep(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove the step setting', 'Remove the step setting from the document', null) [
			context |
			val xtextDocument = context.xtextDocument
			val bad_sub_str = "step " + issue.data;
			val bad_actual_str = xtextDocument.get(issue.offset, issue.length);
			val right_str = bad_actual_str.substring(0,bad_sub_str.length);
			xtextDocument.replace(issue.offset, issue.length, right_str);
		]
	}
	
	/*
	 * Reduce the min settings of an integer question to be max-1
	 */
	@Fix(QuestionaireValidator.INTEGERQUESTION_MINMAX)
	def reduceMin(Issue issue, IssueResolutionAcceptor acceptor) {
		if (!issue.data.get(0).equals("1")) //If min can be reduced
		{
			acceptor.accept(issue, "Reduce the minimum value", "Reduce the minimum value to be below the maximum value", null, 
				[EObject elem, IModificationContext context|
					val iq = (elem as IntegerQuestion);
					iq.minValue = iq.maxValue-1;		
			]);
		}	
	}
	
	/*
	 * Increase the max setting of an integer question to be min+1
	 */
	@Fix(QuestionaireValidator.INTEGERQUESTION_MINMAX)
	def increaseMax(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Increase the maximum value", "Increase the maximum value to be above the minimum", null, 
				[EObject elem, IModificationContext context|
					val iq = (elem as IntegerQuestion);
					iq.maxValue = iq.minValue+1;		
			]);
	}
	
	/*
	 * Change the step value of an integer question to be the nearest good value
	 */
	@Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
	def adjustStep(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Change step to nearest good value", "Change the step value to the closest value that allows selection of both the minimum and maximum value", null, 
			[EObject elem, IModificationContext context|
				val iq = (elem as IntegerQuestion);
				var continue = true;
				for (i : 1 ..< (iq.maxValue-iq.minValue)+iq.step) {
					if (continue)
					{
					    if (validStep(iq.minValue, iq.maxValue, iq.step+i))
						{
							(elem as IntegerQuestion).setStep(iq.step+i);
							continue=false;		
						}
						if (continue && validStep(iq.minValue, iq.maxValue, iq.step-i))
						{
							(elem as IntegerQuestion).setStep(iq.step-i);
							continue=false;
						}
					}
				}			
		]);
	}

	/*
	 * Increase the max setting of an integer question to match the step value
	 */
	@Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
	def adjustMaxForStep(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Increase maximum to match step", "Change the max value such that the chosen step value fits", null, 
			[EObject elem, IModificationContext context|
				val iq = (elem as IntegerQuestion);
				val incr = iq.step - ((iq.maxValue - iq.minValue) % iq.step); //Step shouldn't be 0 here
				iq.maxValue = iq.maxValue+incr;
		]);
	}
	
	/*
	 * Set the length of a text question to be 1 line
	 */
	@Fix(QuestionaireValidator.TEXTQUESTION_SHORTLONG)
	def insertDefaultLength(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set length to 1", "Set the length of the text question answer 1 meaning one line of text", null, 
			[EObject elem, IModificationContext context|
				val tq = (elem as TextQuestion);
				tq.lines = 1;
		]);
	}

	/*
	 * Set the length of a text question to be 5 lines
	 */
	@Fix(QuestionaireValidator.TEXTQUESTION_SHORTLONG)
	def insertDefaultLongLength(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set length to 5", "Set the length of the text question answer 5 meaning five lines of text", null, 
			[EObject elem, IModificationContext context|
				val tq = (elem as TextQuestion);
				tq.lines = 5;
		]);
	}
	
	/*
	 * Make option names unique by appending a number to the name
	 */
	@Fix(QuestionaireValidator.OPTION_NAME_UNIQUE)
	def makeOptionNameUnique(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Make the name of this option unique", "Make the name of this option unique by appending a number", null, 
			[EObject elem, IModificationContext context|
				val op = (elem as Option);
				var id = 1;
				while (issue.data.contains(nameId(op.name,id)))
				{
					id = id + 1;
				}
				op.setName(nameId(op.name,id));
		]);
	}
	
	/*
	 * Append a integer to the end of a string, but inside the quotes if quotes are present
	 */
	def nameId(String name, int id)
	{
		if (name.startsWith("\"")){
			name.substring(0,name.length-1) + id + "\"";
		}
		else
		{
			name + id;
		}
	}
	
	/*
	 * Is a given triple of min, max and step valid
	 * i.e. is it possible to select both min and max with the given step
	 */
	def validStep(int min, int max, int step)
	{
		if (step < 1) 
			false
		else
			((max - min) % step == 0)
	}

}
