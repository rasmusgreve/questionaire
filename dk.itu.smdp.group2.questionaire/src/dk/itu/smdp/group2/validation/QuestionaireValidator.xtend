package dk.itu.smdp.group2.validation

import questionairemodel.IntegerQuestion
import org.eclipse.xtext.validation.Check
import questionairemodel.QuestionairemodelPackage
import questionairemodel.Questionaire
import questionairemodel.MatrixQuestion
import questionairemodel.ChoiceQuestion

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class QuestionaireValidator extends AbstractQuestionaireValidator {

	public static val String INTEGERQUESTION_STEP = "integerQuestionStep";

	@Check
	def checkIntegerQuestionRange(IntegerQuestion it) {
		if (maxValue <= minValue)
		{
			error('Maximum value must be higher than minimum value', 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__MAX_VALUE,
				INTEGERQUESTION_STEP,
				Integer.toString(step)
			);
		}
	}
	
	@Check
	def integerStepMatchesRange(IntegerQuestion it)
	{
		if (step < 1) return; //Don't validate invalid steps (causes exceptions if zero)
		if ((maxValue - minValue) % step != 0)
		{
			warning("The selected step value doesn't allow the maximum value to be selected", 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__STEP
			);
		}
	}
	
	@Check
	def integerStepValid(IntegerQuestion it)
	{
		if (step < 0) //0 is default (to be interpreted as 1)
		{
			error("Step must be >= 1", 
				QuestionairemodelPackage.Literals.INTEGER_QUESTION__STEP
			);
		}
	}
	
	@Check
	def optionIdUnqiue(Questionaire it)
	{
		//TODO
	}
	
	@Check
	def conditionalAfterCondition(Questionaire it)
	{
		//TODO
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
