package dk.itu.smdp.group2.validation

import questionairemodel.IntegerQuestion
import org.eclipse.xtext.validation.Check
import questionairemodel.QuestionairemodelPackage
import questionairemodel.Questionaire
import questionairemodel.MatrixQuestion
import questionairemodel.ChoiceQuestion
import java.util.ArrayList
import questionairemodel.impl.ChoiceQuestionImpl
import java.util.HashSet
import questionairemodel.Question
import questionairemodel.impl.TextQuestionImpl
import questionairemodel.TextQuestion

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class QuestionaireValidator extends AbstractQuestionaireValidator {

	public static val String INTEGERQUESTION_STEP = "integerQuestionStep";
	public static val String INTEGERQUESTION_MINMAX = "integerQuestionMinMax";
	public static val String TEXTQUESTION_SHORTLONG = "textQuestionShortLong";
	public static val String OPTION_NAME_UNIQUE = "optionName";

	@Check
	def checkTextQuestionLength(TextQuestion it) {
		if (lines <= 0)
		{
			error('Must specify a positive number of lines.', 
				QuestionairemodelPackage.Literals.TEXT_QUESTION__LINES,
				TEXTQUESTION_SHORTLONG,
				Integer.toString(lines)
			);
		}
	}

	@Check
	def checkIntegerQuestionRange(IntegerQuestion it) {
		if (maxValue <= minValue)
		{
			error('Maximum value must be higher than minimum value', 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__MAX_VALUE,
				INTEGERQUESTION_MINMAX,
				Integer.toString(minValue)
			);
		}
	}
	
	@Check
	def integerStepMatchesRange(IntegerQuestion it)
	{
		if (step < 1) return; //Don't validate invalid steps (causes exceptions if zero)
		if ((maxValue - minValue) % step != 0)
		{
			warning("The selected step value doesn't match the maximum value", 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__STEP,
				INTEGERQUESTION_STEP,
				Integer.toString(step)
			);
		}
	}
	
	@Check
	def integerStepValid(IntegerQuestion it)
	{
		if (step < 1)
		{
			error("Step must be >= 1", 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__STEP
			);
		}
	}
	
	@Check
	def choiceSelectionRangeValue(ChoiceQuestion it)
	{
		if (minSelections >= maxSelections && maxSelections != 0)
		{
			error("Max selections must be >= min selections", 
				QuestionairemodelPackage.Literals.CHOICE_QUESTION__MAX_SELECTIONS
			);
		}
	}
	
	@Check
	def optionIdUnqiue(Questionaire it)
	{
		//Find all ids
		val ids = new ArrayList<String>();
		elements.filter(ChoiceQuestionImpl).forEach[
			options.filter[name != null].forEach[
				ids.add(name);
			]
		]
		//Check for unique names
		elements.filter(ChoiceQuestionImpl).forEach[elem|
			elem.options.forEach[option|
				val unique = ids.filter[it==option.name].length < 2;
				if (!unique)
				{
					error("Names must be unique! \"" + option.name + "\" is defined elsewhere",
						option, 
						QuestionairemodelPackage.Literals.OPTION__NAME,
						OPTION_NAME_UNIQUE,
						ids
					);
				}
			]
		]
		
	}
	
	@Check
	def conditionalAfterCondition(Questionaire it)
	{
		//Fold an environment of defined ids over all questions
		elements.filter(elem| elem instanceof Question).fold(new HashSet<String>)[env,elem|
			
			//Check conditions
			val base = (elem as Question).questionBase;
			if (!base.conditions.forall[option.forall[env.contains(name)]])
			{
				error("The constraint refer to an invalid option",
					(elem as Question).questionBase, 
					QuestionairemodelPackage.Literals.QUESTION_BASE__CONDITIONS
				);				
			}			
			
			//Add options w/ names to env if choice question
			if (elem instanceof ChoiceQuestion)
			{
				val elem_cq = elem as ChoiceQuestion;
				elem_cq.options.filter[name != null].forEach[
					env.add(name)
				]
			}			
			env
		]
	}
	
	@Check 
	def matrixQuestionMaxPerRowRange(MatrixQuestion it)
	{
		if (maxPerRow < 1)
		{
			error("The number of selections per row must be >= 1", 
				QuestionairemodelPackage.Literals.MATRIX_QUESTION__MAX_PER_ROW
			);
		}
		if (maxPerRow > columnNames.length)
		{
			warning("The number of selections per row should not be more than the number of columns", 
				QuestionairemodelPackage.Literals.MATRIX_QUESTION__MAX_PER_ROW
			);
		}
	}
	
	@Check
	def matrixQuestionMustHaveColumns(MatrixQuestion it)
	{
		if (columnNames.length < 1)
		{
			error("A matrix question must have columns", 
				QuestionairemodelPackage.Literals.MATRIX_QUESTION__COLUMN_NAMES
			);
		}
	}
	
	@Check
	def matrixQuestionShouldHaveMultipleLines(MatrixQuestion it)
	{
		if (rowNames.length <= 1)
		{
			warning("A matrix question should have multiple rows", 
				QuestionairemodelPackage.Literals.MATRIX_QUESTION__ROW_NAMES
			);
		}
	}
	

}
