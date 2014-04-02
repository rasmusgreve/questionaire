/*
* generated by Xtext
*/
grammar InternalQuestionaire;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package dk.itu.smdp.group2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.itu.smdp.group2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;

}

@parser::members {

 	private QuestionaireGrammarAccess grammarAccess;
 	
    public InternalQuestionaireParser(TokenStream input, QuestionaireGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Questionaire";	
   	}
   	
   	@Override
   	protected QuestionaireGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleQuestionaire
entryRuleQuestionaire returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionaireRule()); }
	 iv_ruleQuestionaire=ruleQuestionaire 
	 { $current=$iv_ruleQuestionaire.current; } 
	 EOF 
;

// Rule Questionaire
ruleQuestionaire returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionaireRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='email:' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getQuestionaireAccess().getEmailKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_2_0()); 
	    }
		lv_resultEmail_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionaireRule());
	        }
       		set(
       			$current, 
       			"resultEmail",
        		lv_resultEmail_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_0_0()); 
	    }
		lv_elements_3_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionaireRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"Element");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_1_0()); 
	    }
		lv_elements_4_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionaireRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"Element");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	 iv_ruleElement=ruleElement 
	 { $current=$iv_ruleElement.current; } 
	 EOF 
;

// Rule Element
ruleElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 
    }
    this_Heading_0=ruleHeading
    { 
        $current = $this_Heading_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 
    }
    this_Paragraph_1=ruleParagraph
    { 
        $current = $this_Paragraph_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 
    }
    this_TextQuestion_2=ruleTextQuestion
    { 
        $current = $this_TextQuestion_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 
    }
    this_ChoiceQuestion_3=ruleChoiceQuestion
    { 
        $current = $this_ChoiceQuestion_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 
    }
    this_MatrixQuestion_4=ruleMatrixQuestion
    { 
        $current = $this_MatrixQuestion_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 
    }
    this_CalendarQuestion_5=ruleCalendarQuestion
    { 
        $current = $this_CalendarQuestion_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 
    }
    this_IntegerQuestion_6=ruleIntegerQuestion
    { 
        $current = $this_IntegerQuestion_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleHeading
entryRuleHeading returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHeadingRule()); }
	 iv_ruleHeading=ruleHeading 
	 { $current=$iv_ruleHeading.current; } 
	 EOF 
;

// Rule Heading
ruleHeading returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='#' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getNumberSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0()); 
	    }
		lv_text_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHeadingRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleParagraph
entryRuleParagraph returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParagraphRule()); }
	 iv_ruleParagraph=ruleParagraph 
	 { $current=$iv_ruleParagraph.current; } 
	 EOF 
;

// Rule Paragraph
ruleParagraph returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='!' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getExclamationMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
	    }
		lv_text_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParagraphRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleQuestionBase
entryRuleQuestionBase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionBaseRule()); }
	 iv_ruleQuestionBase=ruleQuestionBase 
	 { $current=$iv_ruleQuestionBase.current; } 
	 EOF 
;

// Rule QuestionBase
ruleQuestionBase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='?' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionBaseAccess().getQuestionMarkKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getTitleEStringParserRuleCall_1_0()); 
	    }
		lv_title_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_mandatory_2_0=	'*' 
    {
        newLeafNode(lv_mandatory_2_0, grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionBaseRule());
	        }
       		setWithLastConsumed($current, "mandatory", true, "*");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getDescriptionEStringParserRuleCall_3_0()); 
	    }
		lv_description_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getConditionsQuestionConditionParserRuleCall_4_0()); 
	    }
		lv_conditions_4_0=ruleQuestionCondition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
	        }
       		add(
       			$current, 
       			"conditions",
        		lv_conditions_4_0, 
        		"QuestionCondition");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleTextQuestion
entryRuleTextQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextQuestionRule()); }
	 iv_ruleTextQuestion=ruleTextQuestion 
	 { $current=$iv_ruleTextQuestion.current; } 
	 EOF 
;

// Rule TextQuestion
ruleTextQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
	    }
		lv_questionBase_0_0=ruleQuestionBase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextQuestionRule());
	        }
       		set(
       			$current, 
       			"questionBase",
        		lv_questionBase_0_0, 
        		"QuestionBase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='text[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTextQuestionAccess().getTextKeyword_1());
    }
((
(
		lv_multiline_2_0=	'long' 
    {
        newLeafNode(lv_multiline_2_0, grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextQuestionRule());
	        }
       		setWithLastConsumed($current, "multiline", true, "long");
	    }

)
)
    |	otherlv_3='short' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getShortKeyword_2_1());
    }
)	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getTextQuestionAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleChoiceQuestion
entryRuleChoiceQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getChoiceQuestionRule()); }
	 iv_ruleChoiceQuestion=ruleChoiceQuestion 
	 { $current=$iv_ruleChoiceQuestion.current; } 
	 EOF 
;

// Rule ChoiceQuestion
ruleChoiceQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
	    }
		lv_questionBase_0_0=ruleQuestionBase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		set(
       			$current, 
       			"questionBase",
        		lv_questionBase_0_0, 
        		"QuestionBase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='choice[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_0_0()); 
	    }
		lv_minSelections_2_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		set(
       			$current, 
       			"minSelections",
        		lv_minSelections_2_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_1_0_0()); 
	    }
		lv_minSelections_3_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		set(
       			$current, 
       			"minSelections",
        		lv_minSelections_3_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='to' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getToKeyword_2_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_2_1_2_0()); 
	    }
		lv_maxSelections_5_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		set(
       			$current, 
       			"maxSelections",
        		lv_maxSelections_5_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)))	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightSquareBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
	    }
		lv_options_7_0=ruleOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_7_0, 
        		"Option");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Entry rule entryRuleMatrixQuestion
entryRuleMatrixQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMatrixQuestionRule()); }
	 iv_ruleMatrixQuestion=ruleMatrixQuestion 
	 { $current=$iv_ruleMatrixQuestion.current; } 
	 EOF 
;

// Rule MatrixQuestion
ruleMatrixQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
	    }
		lv_questionBase_0_0=ruleQuestionBase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
	        }
       		set(
       			$current, 
       			"questionBase",
        		lv_questionBase_0_0, 
        		"QuestionBase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='matrix[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMatrixQuestionAccess().getMatrixKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_2_0()); 
	    }
		lv_maxPerRow_2_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
	        }
       		set(
       			$current, 
       			"maxPerRow",
        		lv_maxPerRow_2_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='][' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMatrixQuestionAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_0_0()); 
	    }
		lv_columnNames_4_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
	        }
       		add(
       			$current, 
       			"columnNames",
        		lv_columnNames_4_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMatrixQuestionAccess().getCommaKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_1_1_0()); 
	    }
		lv_columnNames_6_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
	        }
       		add(
       			$current, 
       			"columnNames",
        		lv_columnNames_6_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMatrixQuestionAccess().getRightSquareBracketKeyword_4_2());
    }
)?(	otherlv_8='-' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMatrixQuestionAccess().getHyphenMinusKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_5_1_0()); 
	    }
		lv_rowNames_9_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
	        }
       		add(
       			$current, 
       			"rowNames",
        		lv_rowNames_9_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))+)
;





// Entry rule entryRuleCalendarQuestion
entryRuleCalendarQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCalendarQuestionRule()); }
	 iv_ruleCalendarQuestion=ruleCalendarQuestion 
	 { $current=$iv_ruleCalendarQuestion.current; } 
	 EOF 
;

// Rule CalendarQuestion
ruleCalendarQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
	    }
		lv_questionBase_0_0=ruleQuestionBase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCalendarQuestionRule());
	        }
       		set(
       			$current, 
       			"questionBase",
        		lv_questionBase_0_0, 
        		"QuestionBase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='calendar[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCalendarQuestionAccess().getCalendarKeyword_1());
    }
((
(
		lv_year_2_0=	'year' 
    {
        newLeafNode(lv_year_2_0, grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCalendarQuestionRule());
	        }
       		setWithLastConsumed($current, "year", true, "year");
	    }

)
)?(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1());
    }
)?(
(
		lv_month_4_0=	'month' 
    {
        newLeafNode(lv_month_4_0, grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCalendarQuestionRule());
	        }
       		setWithLastConsumed($current, "month", true, "month");
	    }

)
)?(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3());
    }
)?(
(
		lv_day_6_0=	'day' 
    {
        newLeafNode(lv_day_6_0, grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCalendarQuestionRule());
	        }
       		setWithLastConsumed($current, "day", true, "day");
	    }

)
)?(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5());
    }
)?(
(
		lv_hour_8_0=	'hour' 
    {
        newLeafNode(lv_hour_8_0, grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCalendarQuestionRule());
	        }
       		setWithLastConsumed($current, "hour", true, "hour");
	    }

)
)?(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7());
    }
)?(
(
		lv_minute_10_0=	'minute' 
    {
        newLeafNode(lv_minute_10_0, grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCalendarQuestionRule());
	        }
       		setWithLastConsumed($current, "minute", true, "minute");
	    }

)
)?)	otherlv_11=']' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getCalendarQuestionAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleIntegerQuestion
entryRuleIntegerQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerQuestionRule()); }
	 iv_ruleIntegerQuestion=ruleIntegerQuestion 
	 { $current=$iv_ruleIntegerQuestion.current; } 
	 EOF 
;

// Rule IntegerQuestion
ruleIntegerQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
	    }
		lv_questionBase_0_0=ruleQuestionBase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
	        }
       		set(
       			$current, 
       			"questionBase",
        		lv_questionBase_0_0, 
        		"QuestionBase");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='number[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIntegerQuestionAccess().getNumberKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_2_0()); 
	    }
		lv_minValue_2_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
	        }
       		set(
       			$current, 
       			"minValue",
        		lv_minValue_2_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='to' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIntegerQuestionAccess().getToKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_4_0()); 
	    }
		lv_maxValue_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
	        }
       		set(
       			$current, 
       			"maxValue",
        		lv_maxValue_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='step' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIntegerQuestionAccess().getStepKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_5_1_0()); 
	    }
		lv_step_6_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
	        }
       		set(
       			$current, 
       			"step",
        		lv_step_6_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getIntegerQuestionAccess().getRightSquareBracketKeyword_6());
    }
)
;







// Entry rule entryRuleQuestionCondition
entryRuleQuestionCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionConditionRule()); }
	 iv_ruleQuestionCondition=ruleQuestionCondition 
	 { $current=$iv_ruleQuestionCondition.current; } 
	 EOF 
;

// Rule QuestionCondition
ruleQuestionCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionConditionAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionConditionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='/' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionConditionAccess().getSolidusKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionConditionRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_2_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQuestionConditionAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleOption
entryRuleOption returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionRule()); }
	 iv_ruleOption=ruleOption 
	 { $current=$iv_ruleOption.current; } 
	 EOF 
;

// Rule Option
ruleOption returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='-' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getHyphenMinusKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_1_0()); 
	    }
		lv_text_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionRule());
	        }
       		set(
       			$current, 
       			"text",
        		lv_text_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_1_0()); 
	    }
		lv_name_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_2_2());
    }
)?)
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


