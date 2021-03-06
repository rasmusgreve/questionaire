package dk.itu.smdp.group2.generator

import questionairemodel.CalendarQuestion
import questionairemodel.ChoiceQuestion
import questionairemodel.Element
import questionairemodel.Heading
import questionairemodel.IntegerQuestion
import questionairemodel.MatrixQuestion
import questionairemodel.Paragraph
import questionairemodel.Questionaire
import questionairemodel.TextQuestion
import questionairemodel.Question
import questionairemodel.QuestionCondition
import questionairemodel.Option
import java.util.List

class AndroidGenerator {
	
	/*
	 * Compile the model to android code for placement in a file
	 * called 'QuestionsFragment'.
	 */
	def static compileToAndroid(Questionaire it) {
		'''
			package dk.itu.smdp.group2.questionnaire;

			import dk.itu.smdp.group2.questionnaire.model.*;
			
			public class QuestionsFragment extends QuestionsFragmentBase {
				
				@Override
				protected Questionnaire init() {					
					TextQuestion text;
					ChoiceQuestion choice;
					MatrixQuestion matrix;
					CalendarQuestion calendar;
					IntegerQuestion integer;
			
					Questionnaire questionnaire = new Questionnaire(this.getActivity(), "«name»", "«resultEmail»");
					
					«FOR it : elements»
					«buildElement»
					
					«ENDFOR»
				
					return questionnaire;
				}
			}
		'''
	}
	
	/*
	 * Replace linebreaks with correct character escape sequences.
	 */
	def static linebreaks(String it)
	{
		it?.replaceAll("\r","")?.replaceAll("\n","\\\\r\\\\n")
	}	
	
		
	/*
	 * Element generation
	 */
	
	def private static buildElement(Element elem){
		if (elem instanceof Heading) 				buildHeading(elem as Heading)
		else if (elem instanceof Paragraph)			buildParagraph(elem as Paragraph)
		else if (elem instanceof TextQuestion)		buildTextQuestion(elem as TextQuestion)
		else if (elem instanceof ChoiceQuestion)	buildChoiceQuestion(elem as ChoiceQuestion)
		else if (elem instanceof MatrixQuestion)	buildMatrixQuestion(elem as MatrixQuestion)
		else if (elem instanceof CalendarQuestion)	buildCalendarQuestion(elem as CalendarQuestion)
		else if (elem instanceof IntegerQuestion) 	buildIntegerQuestion(elem as IntegerQuestion)
	} 
	/*
	 * Build a heading element
	 */
	def private static buildHeading(Heading it){
		'''
			questionnaire.addHeading(new Heading("«linebreaks(text)»"));
		'''
	}
	
	/*
	 * Build a paragraph element
	 */	
	def private static buildParagraph(Paragraph it){
		'''
			questionnaire.addParagraph(new Paragraph("«linebreaks(text)»"));
		'''
	}
	
	/*
	 * Build a list of conditions for a given question type
	 */
	def private static buildConditions(Question it, String item)	{
		'''
			«FOR it : questionBase.conditions»
			«buildCondition(item)»
			«ENDFOR»
		'''
	}
	
	/*
	 * Build a condition for a given question type
	 */
	def private static buildCondition(QuestionCondition it, String item){
		'''
			«item».addCondition(«FOR it : option SEPARATOR ', '»"«name»"«ENDFOR»);
		'''
	}
	
	/*
	 * Build a text question
	 */
	def private static buildTextQuestion(TextQuestion it){
		'''
			text = new TextQuestion("«linebreaks(questionBase.title)»", "«linebreaks(questionBase.description)»", «questionBase.mandatory», «lines»);
			«buildConditions("text")»
			questionnaire.addQuestion(text);
		'''
	}
	
	/*
	 * Build a choice question
	 */
	def private static buildChoiceQuestion(ChoiceQuestion it){
		'''
			choice = new ChoiceQuestion("«linebreaks(questionBase.title)»", "«linebreaks(questionBase.description)»", «questionBase.mandatory», «minSelections», «maxSelections»);
			«FOR it : options»
			«buildOption»
			«ENDFOR»
			«buildConditions("choice")»
			questionnaire.addQuestion(choice);
		'''
	}
	
	/*
	 * Build an option for a choice question
	 */
	def private static buildOption(Option it){
		'''
			choice.addOption("«name»", "«text»");
		'''
	}
	
	/*
	 * Build a matrix question
	 */
	def private static buildMatrixQuestion(MatrixQuestion it){
		'''
			matrix = new MatrixQuestion("«linebreaks(questionBase.title)»", "«linebreaks(questionBase.description)»", «questionBase.mandatory», «maxPerRow»);
			matrix.setColumns(«FOR it : columnNames SEPARATOR ', '»"«linebreaks»"«ENDFOR»);
			matrix.setRows(«FOR it : rowNames SEPARATOR ', '»"«linebreaks»"«ENDFOR»);
			«buildConditions("matrix")»
			questionnaire.addQuestion(matrix);
		'''
	}
	
	/*
	 * Build a calendar question
	 */
	def private static buildCalendarQuestion(CalendarQuestion it){
		'''
			calendar = new CalendarQuestion("«linebreaks(questionBase.title)»", "«linebreaks(questionBase.description)»", «questionBase.mandatory», «year», «month», «day», «hour», «minute»);
			«buildConditions("calendar")»
			questionnaire.addQuestion(calendar);
		'''
	}
	
	/*
	 * Build an integer question
	 */
	def private static buildIntegerQuestion(IntegerQuestion it){
		'''
			integer = new IntegerQuestion("«linebreaks(questionBase.title)»", "«linebreaks(questionBase.description)»", «questionBase.mandatory», «minValue», «maxValue», «step»);
			«buildConditions("integer")»
			questionnaire.addQuestion(integer);
		'''
	}
	
}