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

		Questionnaire questionnaire = new Questionnaire(this.getActivity(), "FoodQuestionnaire", "ragr@itu.dk");
		
		questionnaire.addHeading(new Heading("Eating habits"));
		
		questionnaire.addParagraph(new Paragraph("Please describe your eating habits in the following."));
		
		text = new TextQuestion("What is your favorite dish?", "Please enter the entire recipe.", false, 5);
		questionnaire.addQuestion(text);
		
		integer = new IntegerQuestion("How many times per day do you eat?", "", true, 1, 8, 3);
		questionnaire.addQuestion(integer);
		
		choice = new ChoiceQuestion("What do you like the most?", "", true, 1, 1);
		choice.addOption("chocolate", "After Eight and Marabou");
		choice.addOption("fruit", "Bananas, apples and pears");
		choice.addOption("sweets", "Other sweets");
		questionnaire.addQuestion(choice);
		
		calendar = new CalendarQuestion("When did you last visit the dentist?", "", false, true, true, true, false, false);
		calendar.addCondition("chocolate", "sweets");
		questionnaire.addQuestion(calendar);
		
		matrix = new MatrixQuestion("Rate these dishes!", "", true, 1);
		matrix.setColumns("Bad", "Okay", "Good", "Don't know");
		matrix.setRows("Spaghetti Carbonara", "Tiramisu");
		questionnaire.addQuestion(matrix);
		
	
		return questionnaire;
	}
}