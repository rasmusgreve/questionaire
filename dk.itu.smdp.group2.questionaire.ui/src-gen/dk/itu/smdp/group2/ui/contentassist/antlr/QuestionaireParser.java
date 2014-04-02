/*
* generated by Xtext
*/
package dk.itu.smdp.group2.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;

public class QuestionaireParser extends AbstractContentAssistParser {
	
	@Inject
	private QuestionaireGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser createParser() {
		dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser result = new dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getChoiceQuestionAccess().getAlternatives_2(), "rule__ChoiceQuestion__Alternatives_2");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getQuestionaireAccess().getGroup(), "rule__Questionaire__Group__0");
					put(grammarAccess.getQuestionaireAccess().getGroup_3(), "rule__Questionaire__Group_3__0");
					put(grammarAccess.getHeadingAccess().getGroup(), "rule__Heading__Group__0");
					put(grammarAccess.getParagraphAccess().getGroup(), "rule__Paragraph__Group__0");
					put(grammarAccess.getQuestionBaseAccess().getGroup(), "rule__QuestionBase__Group__0");
					put(grammarAccess.getTextQuestionAccess().getGroup(), "rule__TextQuestion__Group__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup(), "rule__ChoiceQuestion__Group__0");
					put(grammarAccess.getChoiceQuestionAccess().getGroup_2_1(), "rule__ChoiceQuestion__Group_2_1__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup(), "rule__MatrixQuestion__Group__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_4(), "rule__MatrixQuestion__Group_4__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_4_1(), "rule__MatrixQuestion__Group_4_1__0");
					put(grammarAccess.getMatrixQuestionAccess().getGroup_5(), "rule__MatrixQuestion__Group_5__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup(), "rule__CalendarQuestion__Group__0");
					put(grammarAccess.getCalendarQuestionAccess().getGroup_2(), "rule__CalendarQuestion__Group_2__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup(), "rule__IntegerQuestion__Group__0");
					put(grammarAccess.getIntegerQuestionAccess().getGroup_5(), "rule__IntegerQuestion__Group_5__0");
					put(grammarAccess.getQuestionConditionAccess().getGroup(), "rule__QuestionCondition__Group__0");
					put(grammarAccess.getQuestionConditionAccess().getGroup_2(), "rule__QuestionCondition__Group_2__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getOptionAccess().getGroup_2(), "rule__Option__Group_2__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getQuestionaireAccess().getNameAssignment_0(), "rule__Questionaire__NameAssignment_0");
					put(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_2(), "rule__Questionaire__ResultEmailAssignment_2");
					put(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_0(), "rule__Questionaire__ElementsAssignment_3_0");
					put(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_1(), "rule__Questionaire__ElementsAssignment_3_1");
					put(grammarAccess.getHeadingAccess().getTextAssignment_1(), "rule__Heading__TextAssignment_1");
					put(grammarAccess.getParagraphAccess().getTextAssignment_1(), "rule__Paragraph__TextAssignment_1");
					put(grammarAccess.getQuestionBaseAccess().getTitleAssignment_1(), "rule__QuestionBase__TitleAssignment_1");
					put(grammarAccess.getQuestionBaseAccess().getMandatoryAssignment_2(), "rule__QuestionBase__MandatoryAssignment_2");
					put(grammarAccess.getQuestionBaseAccess().getDescriptionAssignment_3(), "rule__QuestionBase__DescriptionAssignment_3");
					put(grammarAccess.getQuestionBaseAccess().getConditionsAssignment_4(), "rule__QuestionBase__ConditionsAssignment_4");
					put(grammarAccess.getTextQuestionAccess().getQuestionBaseAssignment_0(), "rule__TextQuestion__QuestionBaseAssignment_0");
					put(grammarAccess.getTextQuestionAccess().getMultilineAssignment_2(), "rule__TextQuestion__MultilineAssignment_2");
					put(grammarAccess.getChoiceQuestionAccess().getQuestionBaseAssignment_0(), "rule__ChoiceQuestion__QuestionBaseAssignment_0");
					put(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_0(), "rule__ChoiceQuestion__MinSelectionsAssignment_2_0");
					put(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_1_0(), "rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0");
					put(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_2_1_2(), "rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2");
					put(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4(), "rule__ChoiceQuestion__OptionsAssignment_4");
					put(grammarAccess.getMatrixQuestionAccess().getQuestionBaseAssignment_0(), "rule__MatrixQuestion__QuestionBaseAssignment_0");
					put(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_2(), "rule__MatrixQuestion__MaxPerRowAssignment_2");
					put(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_0(), "rule__MatrixQuestion__ColumnNamesAssignment_4_0");
					put(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_1_1(), "rule__MatrixQuestion__ColumnNamesAssignment_4_1_1");
					put(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_5_1(), "rule__MatrixQuestion__RowNamesAssignment_5_1");
					put(grammarAccess.getCalendarQuestionAccess().getQuestionBaseAssignment_0(), "rule__CalendarQuestion__QuestionBaseAssignment_0");
					put(grammarAccess.getCalendarQuestionAccess().getYearAssignment_2_0(), "rule__CalendarQuestion__YearAssignment_2_0");
					put(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2_2(), "rule__CalendarQuestion__MonthAssignment_2_2");
					put(grammarAccess.getCalendarQuestionAccess().getDayAssignment_2_4(), "rule__CalendarQuestion__DayAssignment_2_4");
					put(grammarAccess.getCalendarQuestionAccess().getHourAssignment_2_6(), "rule__CalendarQuestion__HourAssignment_2_6");
					put(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_2_8(), "rule__CalendarQuestion__MinuteAssignment_2_8");
					put(grammarAccess.getIntegerQuestionAccess().getQuestionBaseAssignment_0(), "rule__IntegerQuestion__QuestionBaseAssignment_0");
					put(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_2(), "rule__IntegerQuestion__MinValueAssignment_2");
					put(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_4(), "rule__IntegerQuestion__MaxValueAssignment_4");
					put(grammarAccess.getIntegerQuestionAccess().getStepAssignment_5_1(), "rule__IntegerQuestion__StepAssignment_5_1");
					put(grammarAccess.getQuestionConditionAccess().getOptionAssignment_1(), "rule__QuestionCondition__OptionAssignment_1");
					put(grammarAccess.getQuestionConditionAccess().getOptionAssignment_2_1(), "rule__QuestionCondition__OptionAssignment_2_1");
					put(grammarAccess.getOptionAccess().getTextAssignment_1(), "rule__Option__TextAssignment_1");
					put(grammarAccess.getOptionAccess().getNameAssignment_2_1(), "rule__Option__NameAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser typedParser = (dk.itu.smdp.group2.ui.contentassist.antlr.internal.InternalQuestionaireParser) parser;
			typedParser.entryRuleQuestionaire();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QuestionaireGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QuestionaireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
