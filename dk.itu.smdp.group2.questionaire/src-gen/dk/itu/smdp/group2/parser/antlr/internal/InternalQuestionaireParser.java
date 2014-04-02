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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionaireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionaire'", "'{'", "'resultEmail'", "'elements'", "','", "'}'", "'Heading'", "'text'", "'Paragraph'", "'mandatory'", "'multiline'", "'TextQuestion'", "'id'", "'title'", "'description'", "'conditions'", "'('", "')'", "'ChoiceQuestion'", "'minSelections'", "'maxSelections'", "'options'", "'MatrixQuestion'", "'columnNames'", "'rowNames'", "'maxPerRow'", "'year'", "'month'", "'day'", "'hour'", "'minute'", "'CalendarQuestion'", "'IntegerQuestion'", "'minValue'", "'step'", "'maxValue'", "'Option'", "'question'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQuestionaireParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuestionaireParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuestionaireParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g"; }



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



    // $ANTLR start "entryRuleQuestionaire"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:67:1: entryRuleQuestionaire returns [EObject current=null] : iv_ruleQuestionaire= ruleQuestionaire EOF ;
    public final EObject entryRuleQuestionaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionaire = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:68:2: (iv_ruleQuestionaire= ruleQuestionaire EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:69:2: iv_ruleQuestionaire= ruleQuestionaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionaireRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionaire_in_entryRuleQuestionaire75);
            iv_ruleQuestionaire=ruleQuestionaire();

            state._fsp--;

             current =iv_ruleQuestionaire; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionaire85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionaire"


    // $ANTLR start "ruleQuestionaire"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:76:1: ruleQuestionaire returns [EObject current=null] : (otherlv_0= 'Questionaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'resultEmail' ( (lv_resultEmail_4_0= ruleEString ) ) (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleQuestionaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_resultEmail_4_0 = null;

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:79:28: ( (otherlv_0= 'Questionaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'resultEmail' ( (lv_resultEmail_4_0= ruleEString ) ) (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:1: (otherlv_0= 'Questionaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'resultEmail' ( (lv_resultEmail_4_0= ruleEString ) ) (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:1: (otherlv_0= 'Questionaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'resultEmail' ( (lv_resultEmail_4_0= ruleEString ) ) (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:3: otherlv_0= 'Questionaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'resultEmail' ( (lv_resultEmail_4_0= ruleEString ) ) (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQuestionaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionaireAccess().getQuestionaireKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:85:1: (lv_name_1_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionaire143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestionaire155); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQuestionaire167); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionaireAccess().getResultEmailKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:110:1: ( (lv_resultEmail_4_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:111:1: (lv_resultEmail_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:111:1: (lv_resultEmail_4_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:112:3: lv_resultEmail_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionaire188);
            lv_resultEmail_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
            	        }
                   		set(
                   			current, 
                   			"resultEmail",
                    		lv_resultEmail_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:128:2: (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:128:4: otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestionaire201); 

                        	newLeafNode(otherlv_5, grammarAccess.getQuestionaireAccess().getElementsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuestionaire213); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:136:1: ( (lv_elements_7_0= ruleElement ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:137:1: (lv_elements_7_0= ruleElement )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:137:1: (lv_elements_7_0= ruleElement )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:138:3: lv_elements_7_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleQuestionaire234);
                    lv_elements_7_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_7_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:154:2: (otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:154:4: otherlv_8= ',' ( (lv_elements_9_0= ruleElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestionaire247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getQuestionaireAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:158:1: ( (lv_elements_9_0= ruleElement ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:159:1: (lv_elements_9_0= ruleElement )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:159:1: (lv_elements_9_0= ruleElement )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:160:3: lv_elements_9_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleQuestionaire268);
                    	    lv_elements_9_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_9_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionaire282); 

                        	newLeafNode(otherlv_10, grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuestionaire296); 

                	newLeafNode(otherlv_11, grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionaire"


    // $ANTLR start "entryRuleElement"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:192:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:193:2: (iv_ruleElement= ruleElement EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:194:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement332);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:201:1: ruleElement returns [EObject current=null] : (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Heading_0 = null;

        EObject this_Paragraph_1 = null;

        EObject this_TextQuestion_2 = null;

        EObject this_ChoiceQuestion_3 = null;

        EObject this_MatrixQuestion_4 = null;

        EObject this_CalendarQuestion_5 = null;

        EObject this_IntegerQuestion_6 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:204:28: ( (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:205:1: (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:205:1: (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt3=5;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;
                case 29:
                    {
                    alt3=4;
                    }
                    break;
                case 43:
                    {
                    alt3=7;
                    }
                    break;
                case 37:
                    {
                    alt3=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:206:5: this_Heading_0= ruleHeading
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeading_in_ruleElement389);
                    this_Heading_0=ruleHeading();

                    state._fsp--;

                     
                            current = this_Heading_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:216:5: this_Paragraph_1= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_ruleElement416);
                    this_Paragraph_1=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:226:5: this_TextQuestion_2= ruleTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_ruleElement443);
                    this_TextQuestion_2=ruleTextQuestion();

                    state._fsp--;

                     
                            current = this_TextQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:236:5: this_ChoiceQuestion_3= ruleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_ruleElement470);
                    this_ChoiceQuestion_3=ruleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_ChoiceQuestion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:246:5: this_MatrixQuestion_4= ruleMatrixQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_ruleElement497);
                    this_MatrixQuestion_4=ruleMatrixQuestion();

                    state._fsp--;

                     
                            current = this_MatrixQuestion_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:256:5: this_CalendarQuestion_5= ruleCalendarQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_ruleElement524);
                    this_CalendarQuestion_5=ruleCalendarQuestion();

                    state._fsp--;

                     
                            current = this_CalendarQuestion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:266:5: this_IntegerQuestion_6= ruleIntegerQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_ruleElement551);
                    this_IntegerQuestion_6=ruleIntegerQuestion();

                    state._fsp--;

                     
                            current = this_IntegerQuestion_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:282:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:283:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:284:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString587);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:291:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:294:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:295:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:295:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:295:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString638); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:303:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString664); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleHeading"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:318:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:319:2: (iv_ruleHeading= ruleHeading EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:320:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeading_in_entryRuleHeading709);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeading719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:327:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:330:28: ( (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:331:1: (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:331:1: (otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:331:3: otherlv_0= 'Heading' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHeading756); 

                	newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHeading768); 

                	newLeafNode(otherlv_1, grammarAccess.getHeadingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleHeading780); 

                	newLeafNode(otherlv_2, grammarAccess.getHeadingAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:343:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:344:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:344:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:345:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeading801);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeadingRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHeading813); 

                	newLeafNode(otherlv_4, grammarAccess.getHeadingAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleParagraph"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:373:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:374:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:375:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_entryRuleParagraph849);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParagraph859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:382:1: ruleParagraph returns [EObject current=null] : (otherlv_0= 'Paragraph' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:385:28: ( (otherlv_0= 'Paragraph' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:386:1: (otherlv_0= 'Paragraph' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:386:1: (otherlv_0= 'Paragraph' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:386:3: otherlv_0= 'Paragraph' otherlv_1= '{' otherlv_2= 'text' ( (lv_text_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParagraph896); 

                	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParagraphKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParagraph908); 

                	newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParagraph920); 

                	newLeafNode(otherlv_2, grammarAccess.getParagraphAccess().getTextKeyword_2());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:398:1: ( (lv_text_3_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:399:1: (lv_text_3_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:399:1: (lv_text_3_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:400:3: lv_text_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraph941);
            lv_text_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParagraphRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParagraph953); 

                	newLeafNode(otherlv_4, grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:428:1: entryRuleTextQuestion returns [EObject current=null] : iv_ruleTextQuestion= ruleTextQuestion EOF ;
    public final EObject entryRuleTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:429:2: (iv_ruleTextQuestion= ruleTextQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:430:2: iv_ruleTextQuestion= ruleTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getTextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion989);
            iv_ruleTextQuestion=ruleTextQuestion();

            state._fsp--;

             current =iv_ruleTextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextQuestion999); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextQuestion"


    // $ANTLR start "ruleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:437:1: ruleTextQuestion returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_multiline_1_0= 'multiline' ) ) otherlv_2= 'TextQuestion' otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleTextQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token lv_multiline_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_5_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:440:28: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_multiline_1_0= 'multiline' ) ) otherlv_2= 'TextQuestion' otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:441:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_multiline_1_0= 'multiline' ) ) otherlv_2= 'TextQuestion' otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:441:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_multiline_1_0= 'multiline' ) ) otherlv_2= 'TextQuestion' otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:441:2: ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_multiline_1_0= 'multiline' ) ) otherlv_2= 'TextQuestion' otherlv_3= '{' otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )? (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:441:2: ( (lv_mandatory_0_0= 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:442:1: (lv_mandatory_0_0= 'mandatory' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:442:1: (lv_mandatory_0_0= 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:443:3: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTextQuestion1042); 

                    newLeafNode(lv_mandatory_0_0, grammarAccess.getTextQuestionAccess().getMandatoryMandatoryKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextQuestionRule());
            	        }
                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:456:2: ( (lv_multiline_1_0= 'multiline' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:457:1: (lv_multiline_1_0= 'multiline' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:457:1: (lv_multiline_1_0= 'multiline' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:458:3: lv_multiline_1_0= 'multiline'
            {
            lv_multiline_1_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTextQuestion1073); 

                    newLeafNode(lv_multiline_1_0, grammarAccess.getTextQuestionAccess().getMultilineMultilineKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextQuestionRule());
            	        }
                   		setWithLastConsumed(current, "multiline", true, "multiline");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTextQuestion1098); 

                	newLeafNode(otherlv_2, grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTextQuestion1110); 

                	newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTextQuestion1122); 

                	newLeafNode(otherlv_4, grammarAccess.getTextQuestionAccess().getIdKeyword_4());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:483:1: ( (lv_id_5_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:484:1: (lv_id_5_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:484:1: (lv_id_5_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:485:3: lv_id_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextQuestionAccess().getIdEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextQuestion1143);
            lv_id_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTextQuestion1155); 

                	newLeafNode(otherlv_6, grammarAccess.getTextQuestionAccess().getTitleKeyword_6());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:505:1: ( (lv_title_7_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:506:1: (lv_title_7_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:506:1: (lv_title_7_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:507:3: lv_title_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextQuestionAccess().getTitleEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextQuestion1176);
            lv_title_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:523:2: (otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:523:4: otherlv_8= 'description' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTextQuestion1189); 

                        	newLeafNode(otherlv_8, grammarAccess.getTextQuestionAccess().getDescriptionKeyword_8_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:527:1: ( (lv_description_9_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:528:1: (lv_description_9_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:528:1: (lv_description_9_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:529:3: lv_description_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextQuestionAccess().getDescriptionEStringParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextQuestion1210);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:545:4: (otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:545:6: otherlv_10= 'conditions' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTextQuestion1225); 

                        	newLeafNode(otherlv_10, grammarAccess.getTextQuestionAccess().getConditionsKeyword_9_0());
                        
                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTextQuestion1237); 

                        	newLeafNode(otherlv_11, grammarAccess.getTextQuestionAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:553:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:554:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:554:1: ( ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:555:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextQuestion1260);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:568:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:568:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTextQuestion1273); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getTextQuestionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:572:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:573:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:573:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:574:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTextQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextQuestion1296);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTextQuestion1310); 

                        	newLeafNode(otherlv_15, grammarAccess.getTextQuestionAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTextQuestion1324); 

                	newLeafNode(otherlv_16, grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:603:1: entryRuleChoiceQuestion returns [EObject current=null] : iv_ruleChoiceQuestion= ruleChoiceQuestion EOF ;
    public final EObject entryRuleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:604:2: (iv_ruleChoiceQuestion= ruleChoiceQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:605:2: iv_ruleChoiceQuestion= ruleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1360);
            iv_ruleChoiceQuestion=ruleChoiceQuestion();

            state._fsp--;

             current =iv_ruleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceQuestion1370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:612:1: ruleChoiceQuestion returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'ChoiceQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )? (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )? (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_minSelections_10_0 = null;

        AntlrDatatypeRuleToken lv_maxSelections_12_0 = null;

        EObject lv_options_21_0 = null;

        EObject lv_options_23_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:615:28: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'ChoiceQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )? (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )? (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:616:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'ChoiceQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )? (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )? (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:616:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'ChoiceQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )? (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )? (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:616:2: ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'ChoiceQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )? (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )? (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= 'options' otherlv_20= '{' ( (lv_options_21_0= ruleOption ) ) (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:616:2: ( (lv_mandatory_0_0= 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:617:1: (lv_mandatory_0_0= 'mandatory' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:617:1: (lv_mandatory_0_0= 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:618:3: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleChoiceQuestion1413); 

                    newLeafNode(lv_mandatory_0_0, grammarAccess.getChoiceQuestionAccess().getMandatoryMandatoryKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleChoiceQuestion1438); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceQuestionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoiceQuestion1450); 

                	newLeafNode(otherlv_2, grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleChoiceQuestion1462); 

                	newLeafNode(otherlv_3, grammarAccess.getChoiceQuestionAccess().getIdKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:643:1: ( (lv_id_4_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:644:1: (lv_id_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:644:1: (lv_id_4_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:645:3: lv_id_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceQuestion1483);
            lv_id_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleChoiceQuestion1495); 

                	newLeafNode(otherlv_5, grammarAccess.getChoiceQuestionAccess().getTitleKeyword_5());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:665:1: ( (lv_title_6_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:666:1: (lv_title_6_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:666:1: (lv_title_6_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:667:3: lv_title_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceQuestion1516);
            lv_title_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:683:2: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:683:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleChoiceQuestion1529); 

                        	newLeafNode(otherlv_7, grammarAccess.getChoiceQuestionAccess().getDescriptionKeyword_7_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:687:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:688:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:688:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:689:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceQuestion1550);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:705:4: (otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:705:6: otherlv_9= 'minSelections' ( (lv_minSelections_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleChoiceQuestion1565); 

                        	newLeafNode(otherlv_9, grammarAccess.getChoiceQuestionAccess().getMinSelectionsKeyword_8_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:709:1: ( (lv_minSelections_10_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:710:1: (lv_minSelections_10_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:710:1: (lv_minSelections_10_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:711:3: lv_minSelections_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleChoiceQuestion1586);
                    lv_minSelections_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"minSelections",
                            		lv_minSelections_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:727:4: (otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:727:6: otherlv_11= 'maxSelections' ( (lv_maxSelections_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleChoiceQuestion1601); 

                        	newLeafNode(otherlv_11, grammarAccess.getChoiceQuestionAccess().getMaxSelectionsKeyword_9_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:731:1: ( (lv_maxSelections_12_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:732:1: (lv_maxSelections_12_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:732:1: (lv_maxSelections_12_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:733:3: lv_maxSelections_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleChoiceQuestion1622);
                    lv_maxSelections_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSelections",
                            		lv_maxSelections_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:749:4: (otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:749:6: otherlv_13= 'conditions' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleChoiceQuestion1637); 

                        	newLeafNode(otherlv_13, grammarAccess.getChoiceQuestionAccess().getConditionsKeyword_10_0());
                        
                    otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleChoiceQuestion1649); 

                        	newLeafNode(otherlv_14, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_10_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:757:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:758:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:758:1: ( ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:759:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceQuestion1672);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:772:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:772:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleChoiceQuestion1685); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getChoiceQuestionAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:776:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:777:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:777:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:778:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChoiceQuestion1708);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleChoiceQuestion1722); 

                        	newLeafNode(otherlv_18, grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleChoiceQuestion1736); 

                	newLeafNode(otherlv_19, grammarAccess.getChoiceQuestionAccess().getOptionsKeyword_11());
                
            otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChoiceQuestion1748); 

                	newLeafNode(otherlv_20, grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_12());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:803:1: ( (lv_options_21_0= ruleOption ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:804:1: (lv_options_21_0= ruleOption )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:804:1: (lv_options_21_0= ruleOption )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:805:3: lv_options_21_0= ruleOption
            {
             
            	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleChoiceQuestion1769);
            lv_options_21_0=ruleOption();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"options",
                    		lv_options_21_0, 
                    		"Option");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:821:2: (otherlv_22= ',' ( (lv_options_23_0= ruleOption ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:821:4: otherlv_22= ',' ( (lv_options_23_0= ruleOption ) )
            	    {
            	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleChoiceQuestion1782); 

            	        	newLeafNode(otherlv_22, grammarAccess.getChoiceQuestionAccess().getCommaKeyword_14_0());
            	        
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:825:1: ( (lv_options_23_0= ruleOption ) )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:826:1: (lv_options_23_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:826:1: (lv_options_23_0= ruleOption )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:827:3: lv_options_23_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_14_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleChoiceQuestion1803);
            	    lv_options_23_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_23_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleChoiceQuestion1817); 

                	newLeafNode(otherlv_24, grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_15());
                
            otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleChoiceQuestion1829); 

                	newLeafNode(otherlv_25, grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleMatrixQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:859:1: entryRuleMatrixQuestion returns [EObject current=null] : iv_ruleMatrixQuestion= ruleMatrixQuestion EOF ;
    public final EObject entryRuleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:860:2: (iv_ruleMatrixQuestion= ruleMatrixQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:861:2: iv_ruleMatrixQuestion= ruleMatrixQuestion EOF
            {
             newCompositeNode(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion1865);
            iv_ruleMatrixQuestion=ruleMatrixQuestion();

            state._fsp--;

             current =iv_ruleMatrixQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatrixQuestion1875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrixQuestion"


    // $ANTLR start "ruleMatrixQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:868:1: ruleMatrixQuestion returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'MatrixQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= 'maxPerRow' ( (lv_maxPerRow_22_0= ruleEInt ) ) (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' ) ;
    public final EObject ruleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_columnNames_11_0 = null;

        AntlrDatatypeRuleToken lv_columnNames_13_0 = null;

        AntlrDatatypeRuleToken lv_rowNames_17_0 = null;

        AntlrDatatypeRuleToken lv_rowNames_19_0 = null;

        AntlrDatatypeRuleToken lv_maxPerRow_22_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:871:28: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'MatrixQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= 'maxPerRow' ( (lv_maxPerRow_22_0= ruleEInt ) ) (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:872:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'MatrixQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= 'maxPerRow' ( (lv_maxPerRow_22_0= ruleEInt ) ) (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:872:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'MatrixQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= 'maxPerRow' ( (lv_maxPerRow_22_0= ruleEInt ) ) (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:872:2: ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'MatrixQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? otherlv_21= 'maxPerRow' ( (lv_maxPerRow_22_0= ruleEInt ) ) (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:872:2: ( (lv_mandatory_0_0= 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:873:1: (lv_mandatory_0_0= 'mandatory' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:873:1: (lv_mandatory_0_0= 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:874:3: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMatrixQuestion1918); 

                    newLeafNode(lv_mandatory_0_0, grammarAccess.getMatrixQuestionAccess().getMandatoryMandatoryKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMatrixQuestionRule());
            	        }
                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    

            }


            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMatrixQuestion1943); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrixQuestionAccess().getMatrixQuestionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMatrixQuestion1955); 

                	newLeafNode(otherlv_2, grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMatrixQuestion1967); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrixQuestionAccess().getIdKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:899:1: ( (lv_id_4_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:900:1: (lv_id_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:900:1: (lv_id_4_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:901:3: lv_id_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion1988);
            lv_id_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMatrixQuestion2000); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrixQuestionAccess().getTitleKeyword_5());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:921:1: ( (lv_title_6_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:922:1: (lv_title_6_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:922:1: (lv_title_6_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:923:3: lv_title_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2021);
            lv_title_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:939:2: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:939:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMatrixQuestion2034); 

                        	newLeafNode(otherlv_7, grammarAccess.getMatrixQuestionAccess().getDescriptionKeyword_7_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:943:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:944:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:944:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:945:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2055);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:961:4: (otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:961:6: otherlv_9= 'columnNames' otherlv_10= '{' ( (lv_columnNames_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMatrixQuestion2070); 

                        	newLeafNode(otherlv_9, grammarAccess.getMatrixQuestionAccess().getColumnNamesKeyword_8_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMatrixQuestion2082); 

                        	newLeafNode(otherlv_10, grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:969:1: ( (lv_columnNames_11_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:970:1: (lv_columnNames_11_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:970:1: (lv_columnNames_11_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:971:3: lv_columnNames_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2103);
                    lv_columnNames_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	        }
                           		add(
                           			current, 
                           			"columnNames",
                            		lv_columnNames_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:987:2: (otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:987:4: otherlv_12= ',' ( (lv_columnNames_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMatrixQuestion2116); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getMatrixQuestionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:991:1: ( (lv_columnNames_13_0= ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:992:1: (lv_columnNames_13_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:992:1: (lv_columnNames_13_0= ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:993:3: lv_columnNames_13_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2137);
                    	    lv_columnNames_13_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"columnNames",
                    	            		lv_columnNames_13_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMatrixQuestion2151); 

                        	newLeafNode(otherlv_14, grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1013:3: (otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1013:5: otherlv_15= 'rowNames' otherlv_16= '{' ( (lv_rowNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMatrixQuestion2166); 

                        	newLeafNode(otherlv_15, grammarAccess.getMatrixQuestionAccess().getRowNamesKeyword_9_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMatrixQuestion2178); 

                        	newLeafNode(otherlv_16, grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1021:1: ( (lv_rowNames_17_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1022:1: (lv_rowNames_17_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1022:1: (lv_rowNames_17_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1023:3: lv_rowNames_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2199);
                    lv_rowNames_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	        }
                           		add(
                           			current, 
                           			"rowNames",
                            		lv_rowNames_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1039:2: (otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1039:4: otherlv_18= ',' ( (lv_rowNames_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMatrixQuestion2212); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getMatrixQuestionAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1043:1: ( (lv_rowNames_19_0= ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1044:1: (lv_rowNames_19_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1044:1: (lv_rowNames_19_0= ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1045:3: lv_rowNames_19_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2233);
                    	    lv_rowNames_19_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rowNames",
                    	            		lv_rowNames_19_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMatrixQuestion2247); 

                        	newLeafNode(otherlv_20, grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMatrixQuestion2261); 

                	newLeafNode(otherlv_21, grammarAccess.getMatrixQuestionAccess().getMaxPerRowKeyword_10());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1069:1: ( (lv_maxPerRow_22_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1070:1: (lv_maxPerRow_22_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1070:1: (lv_maxPerRow_22_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1071:3: lv_maxPerRow_22_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMatrixQuestion2282);
            lv_maxPerRow_22_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"maxPerRow",
                    		lv_maxPerRow_22_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1087:2: (otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1087:4: otherlv_23= 'conditions' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMatrixQuestion2295); 

                        	newLeafNode(otherlv_23, grammarAccess.getMatrixQuestionAccess().getConditionsKeyword_12_0());
                        
                    otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMatrixQuestion2307); 

                        	newLeafNode(otherlv_24, grammarAccess.getMatrixQuestionAccess().getLeftParenthesisKeyword_12_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1095:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1096:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1096:1: ( ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1097:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMatrixQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2330);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1110:2: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1110:4: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMatrixQuestion2343); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getMatrixQuestionAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1114:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1115:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1115:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1116:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMatrixQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion2366);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMatrixQuestion2380); 

                        	newLeafNode(otherlv_28, grammarAccess.getMatrixQuestionAccess().getRightParenthesisKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMatrixQuestion2394); 

                	newLeafNode(otherlv_29, grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrixQuestion"


    // $ANTLR start "entryRuleCalendarQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1145:1: entryRuleCalendarQuestion returns [EObject current=null] : iv_ruleCalendarQuestion= ruleCalendarQuestion EOF ;
    public final EObject entryRuleCalendarQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1146:2: (iv_ruleCalendarQuestion= ruleCalendarQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1147:2: iv_ruleCalendarQuestion= ruleCalendarQuestion EOF
            {
             newCompositeNode(grammarAccess.getCalendarQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion2430);
            iv_ruleCalendarQuestion=ruleCalendarQuestion();

            state._fsp--;

             current =iv_ruleCalendarQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarQuestion2440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalendarQuestion"


    // $ANTLR start "ruleCalendarQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1154:1: ruleCalendarQuestion returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_year_1_0= 'year' ) ) ( (lv_month_2_0= 'month' ) ) ( (lv_day_3_0= 'day' ) ) ( (lv_hour_4_0= 'hour' ) ) ( (lv_minute_5_0= 'minute' ) ) otherlv_6= 'CalendarQuestion' otherlv_7= '{' otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) otherlv_10= 'title' ( (lv_title_11_0= ruleEString ) ) (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )? (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= '}' ) ;
    public final EObject ruleCalendarQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token lv_year_1_0=null;
        Token lv_month_2_0=null;
        Token lv_day_3_0=null;
        Token lv_hour_4_0=null;
        Token lv_minute_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_title_11_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1157:28: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_year_1_0= 'year' ) ) ( (lv_month_2_0= 'month' ) ) ( (lv_day_3_0= 'day' ) ) ( (lv_hour_4_0= 'hour' ) ) ( (lv_minute_5_0= 'minute' ) ) otherlv_6= 'CalendarQuestion' otherlv_7= '{' otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) otherlv_10= 'title' ( (lv_title_11_0= ruleEString ) ) (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )? (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1158:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_year_1_0= 'year' ) ) ( (lv_month_2_0= 'month' ) ) ( (lv_day_3_0= 'day' ) ) ( (lv_hour_4_0= 'hour' ) ) ( (lv_minute_5_0= 'minute' ) ) otherlv_6= 'CalendarQuestion' otherlv_7= '{' otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) otherlv_10= 'title' ( (lv_title_11_0= ruleEString ) ) (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )? (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1158:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_year_1_0= 'year' ) ) ( (lv_month_2_0= 'month' ) ) ( (lv_day_3_0= 'day' ) ) ( (lv_hour_4_0= 'hour' ) ) ( (lv_minute_5_0= 'minute' ) ) otherlv_6= 'CalendarQuestion' otherlv_7= '{' otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) otherlv_10= 'title' ( (lv_title_11_0= ruleEString ) ) (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )? (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1158:2: ( (lv_mandatory_0_0= 'mandatory' ) ) ( (lv_year_1_0= 'year' ) ) ( (lv_month_2_0= 'month' ) ) ( (lv_day_3_0= 'day' ) ) ( (lv_hour_4_0= 'hour' ) ) ( (lv_minute_5_0= 'minute' ) ) otherlv_6= 'CalendarQuestion' otherlv_7= '{' otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) otherlv_10= 'title' ( (lv_title_11_0= ruleEString ) ) (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )? (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? otherlv_20= '}'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1158:2: ( (lv_mandatory_0_0= 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1159:1: (lv_mandatory_0_0= 'mandatory' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1159:1: (lv_mandatory_0_0= 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1160:3: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCalendarQuestion2483); 

                    newLeafNode(lv_mandatory_0_0, grammarAccess.getCalendarQuestionAccess().getMandatoryMandatoryKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1173:2: ( (lv_year_1_0= 'year' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1174:1: (lv_year_1_0= 'year' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1174:1: (lv_year_1_0= 'year' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1175:3: lv_year_1_0= 'year'
            {
            lv_year_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCalendarQuestion2514); 

                    newLeafNode(lv_year_1_0, grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "year", true, "year");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1188:2: ( (lv_month_2_0= 'month' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1189:1: (lv_month_2_0= 'month' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1189:1: (lv_month_2_0= 'month' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1190:3: lv_month_2_0= 'month'
            {
            lv_month_2_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCalendarQuestion2545); 

                    newLeafNode(lv_month_2_0, grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "month", true, "month");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1203:2: ( (lv_day_3_0= 'day' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1204:1: (lv_day_3_0= 'day' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1204:1: (lv_day_3_0= 'day' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1205:3: lv_day_3_0= 'day'
            {
            lv_day_3_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCalendarQuestion2576); 

                    newLeafNode(lv_day_3_0, grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "day", true, "day");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1218:2: ( (lv_hour_4_0= 'hour' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1219:1: (lv_hour_4_0= 'hour' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1219:1: (lv_hour_4_0= 'hour' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1220:3: lv_hour_4_0= 'hour'
            {
            lv_hour_4_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCalendarQuestion2607); 

                    newLeafNode(lv_hour_4_0, grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "hour", true, "hour");
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1233:2: ( (lv_minute_5_0= 'minute' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1234:1: (lv_minute_5_0= 'minute' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1234:1: (lv_minute_5_0= 'minute' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1235:3: lv_minute_5_0= 'minute'
            {
            lv_minute_5_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleCalendarQuestion2638); 

                    newLeafNode(lv_minute_5_0, grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_5_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
            	        }
                   		setWithLastConsumed(current, "minute", true, "minute");
            	    

            }


            }

            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleCalendarQuestion2663); 

                	newLeafNode(otherlv_6, grammarAccess.getCalendarQuestionAccess().getCalendarQuestionKeyword_6());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCalendarQuestion2675); 

                	newLeafNode(otherlv_7, grammarAccess.getCalendarQuestionAccess().getLeftCurlyBracketKeyword_7());
                
            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCalendarQuestion2687); 

                	newLeafNode(otherlv_8, grammarAccess.getCalendarQuestionAccess().getIdKeyword_8());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1260:1: ( (lv_id_9_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1261:1: (lv_id_9_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1261:1: (lv_id_9_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1262:3: lv_id_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getIdEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCalendarQuestion2708);
            lv_id_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCalendarQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCalendarQuestion2720); 

                	newLeafNode(otherlv_10, grammarAccess.getCalendarQuestionAccess().getTitleKeyword_10());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1282:1: ( (lv_title_11_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1283:1: (lv_title_11_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1283:1: (lv_title_11_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1284:3: lv_title_11_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getTitleEStringParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCalendarQuestion2741);
            lv_title_11_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCalendarQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_11_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1300:2: (otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1300:4: otherlv_12= 'description' ( (lv_description_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCalendarQuestion2754); 

                        	newLeafNode(otherlv_12, grammarAccess.getCalendarQuestionAccess().getDescriptionKeyword_12_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1304:1: ( (lv_description_13_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1305:1: (lv_description_13_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1305:1: (lv_description_13_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1306:3: lv_description_13_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getDescriptionEStringParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCalendarQuestion2775);
                    lv_description_13_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_13_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1322:4: (otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1322:6: otherlv_14= 'conditions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCalendarQuestion2790); 

                        	newLeafNode(otherlv_14, grammarAccess.getCalendarQuestionAccess().getConditionsKeyword_13_0());
                        
                    otherlv_15=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCalendarQuestion2802); 

                        	newLeafNode(otherlv_15, grammarAccess.getCalendarQuestionAccess().getLeftParenthesisKeyword_13_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1330:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1331:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1331:1: ( ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1332:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCalendarQuestion2825);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1345:2: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1345:4: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCalendarQuestion2838); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1349:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1350:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1350:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1351:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCalendarQuestion2861);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCalendarQuestion2875); 

                        	newLeafNode(otherlv_19, grammarAccess.getCalendarQuestionAccess().getRightParenthesisKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCalendarQuestion2889); 

                	newLeafNode(otherlv_20, grammarAccess.getCalendarQuestionAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalendarQuestion"


    // $ANTLR start "entryRuleIntegerQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1380:1: entryRuleIntegerQuestion returns [EObject current=null] : iv_ruleIntegerQuestion= ruleIntegerQuestion EOF ;
    public final EObject entryRuleIntegerQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1381:2: (iv_ruleIntegerQuestion= ruleIntegerQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1382:2: iv_ruleIntegerQuestion= ruleIntegerQuestion EOF
            {
             newCompositeNode(grammarAccess.getIntegerQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion2925);
            iv_ruleIntegerQuestion=ruleIntegerQuestion();

            state._fsp--;

             current =iv_ruleIntegerQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerQuestion2935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerQuestion"


    // $ANTLR start "ruleIntegerQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1389:1: ruleIntegerQuestion returns [EObject current=null] : ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'IntegerQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'minValue' ( (lv_minValue_10_0= ruleEInt ) ) otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) otherlv_13= 'maxValue' ( (lv_maxValue_14_0= ruleEInt ) ) (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) ;
    public final EObject ruleIntegerQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_minValue_10_0 = null;

        AntlrDatatypeRuleToken lv_step_12_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_14_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1392:28: ( ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'IntegerQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'minValue' ( (lv_minValue_10_0= ruleEInt ) ) otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) otherlv_13= 'maxValue' ( (lv_maxValue_14_0= ruleEInt ) ) (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1393:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'IntegerQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'minValue' ( (lv_minValue_10_0= ruleEInt ) ) otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) otherlv_13= 'maxValue' ( (lv_maxValue_14_0= ruleEInt ) ) (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1393:1: ( ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'IntegerQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'minValue' ( (lv_minValue_10_0= ruleEInt ) ) otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) otherlv_13= 'maxValue' ( (lv_maxValue_14_0= ruleEInt ) ) (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1393:2: ( (lv_mandatory_0_0= 'mandatory' ) ) otherlv_1= 'IntegerQuestion' otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) otherlv_5= 'title' ( (lv_title_6_0= ruleEString ) ) (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= 'minValue' ( (lv_minValue_10_0= ruleEInt ) ) otherlv_11= 'step' ( (lv_step_12_0= ruleEInt ) ) otherlv_13= 'maxValue' ( (lv_maxValue_14_0= ruleEInt ) ) (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1393:2: ( (lv_mandatory_0_0= 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1394:1: (lv_mandatory_0_0= 'mandatory' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1394:1: (lv_mandatory_0_0= 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1395:3: lv_mandatory_0_0= 'mandatory'
            {
            lv_mandatory_0_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleIntegerQuestion2978); 

                    newLeafNode(lv_mandatory_0_0, grammarAccess.getIntegerQuestionAccess().getMandatoryMandatoryKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerQuestionRule());
            	        }
                   		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleIntegerQuestion3003); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerQuestionAccess().getIntegerQuestionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntegerQuestion3015); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIntegerQuestion3027); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerQuestionAccess().getIdKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1420:1: ( (lv_id_4_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1421:1: (lv_id_4_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1421:1: (lv_id_4_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1422:3: lv_id_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerQuestion3048);
            lv_id_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIntegerQuestion3060); 

                	newLeafNode(otherlv_5, grammarAccess.getIntegerQuestionAccess().getTitleKeyword_5());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1442:1: ( (lv_title_6_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1443:1: (lv_title_6_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1443:1: (lv_title_6_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1444:3: lv_title_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerQuestion3081);
            lv_title_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1460:2: (otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1460:4: otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIntegerQuestion3094); 

                        	newLeafNode(otherlv_7, grammarAccess.getIntegerQuestionAccess().getDescriptionKeyword_7_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1464:1: ( (lv_description_8_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1465:1: (lv_description_8_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1465:1: (lv_description_8_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1466:3: lv_description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerQuestion3115);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleIntegerQuestion3129); 

                	newLeafNode(otherlv_9, grammarAccess.getIntegerQuestionAccess().getMinValueKeyword_8());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1486:1: ( (lv_minValue_10_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1487:1: (lv_minValue_10_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1487:1: (lv_minValue_10_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1488:3: lv_minValue_10_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion3150);
            lv_minValue_10_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"minValue",
                    		lv_minValue_10_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleIntegerQuestion3162); 

                	newLeafNode(otherlv_11, grammarAccess.getIntegerQuestionAccess().getStepKeyword_10());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1508:1: ( (lv_step_12_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1509:1: (lv_step_12_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1509:1: (lv_step_12_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1510:3: lv_step_12_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion3183);
            lv_step_12_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"step",
                    		lv_step_12_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleIntegerQuestion3195); 

                	newLeafNode(otherlv_13, grammarAccess.getIntegerQuestionAccess().getMaxValueKeyword_12());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1530:1: ( (lv_maxValue_14_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1531:1: (lv_maxValue_14_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1531:1: (lv_maxValue_14_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1532:3: lv_maxValue_14_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_13_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion3216);
            lv_maxValue_14_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"maxValue",
                    		lv_maxValue_14_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1548:2: (otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1548:4: otherlv_15= 'conditions' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIntegerQuestion3229); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntegerQuestionAccess().getConditionsKeyword_14_0());
                        
                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIntegerQuestion3241); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntegerQuestionAccess().getLeftParenthesisKeyword_14_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1556:1: ( ( ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1557:1: ( ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1557:1: ( ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1558:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerQuestionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerQuestion3264);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1571:2: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1571:4: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntegerQuestion3277); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getIntegerQuestionAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1575:1: ( ( ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1576:1: ( ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1576:1: ( ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1577:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIntegerQuestionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerQuestion3300);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleIntegerQuestion3314); 

                        	newLeafNode(otherlv_20, grammarAccess.getIntegerQuestionAccess().getRightParenthesisKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntegerQuestion3328); 

                	newLeafNode(otherlv_21, grammarAccess.getIntegerQuestionAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerQuestion"


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1610:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1611:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1612:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption3368);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption3378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1619:1: ruleOption returns [EObject current=null] : (otherlv_0= 'Option' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= 'question' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_text_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1622:28: ( (otherlv_0= 'Option' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= 'question' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1623:1: (otherlv_0= 'Option' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= 'question' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1623:1: (otherlv_0= 'Option' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= 'question' ( ( ruleEString ) ) otherlv_8= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1623:3: otherlv_0= 'Option' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )? otherlv_6= 'question' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleOption3415); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOption3427); 

                	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1631:1: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1631:3: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOption3440); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getIdKeyword_2_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1635:1: ( (lv_id_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1636:1: (lv_id_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1636:1: (lv_id_3_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1637:3: lv_id_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOption3461);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1653:4: (otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1653:6: otherlv_4= 'text' ( (lv_text_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOption3476); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getTextKeyword_3_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1657:1: ( (lv_text_5_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1658:1: (lv_text_5_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1658:1: (lv_text_5_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1659:3: lv_text_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOption3497);
                    lv_text_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleOption3511); 

                	newLeafNode(otherlv_6, grammarAccess.getOptionAccess().getQuestionKeyword_4());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1679:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1680:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1680:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1681:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getQuestionChoiceQuestionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOption3534);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOption3546); 

                	newLeafNode(otherlv_8, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1706:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1707:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1708:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3583);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1715:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1718:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1719:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1719:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1719:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1719:2: (kw= '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1720:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEInt3633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3650); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuestionaire_in_entryRuleQuestionaire75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionaire85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQuestionaire122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionaire143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestionaire155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQuestionaire167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionaire188 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleQuestionaire201 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuestionaire213 = new BitSet(new long[]{0x00000000001A0000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleQuestionaire234 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleQuestionaire247 = new BitSet(new long[]{0x00000000001A0000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleQuestionaire268 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleQuestionaire282 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQuestionaire296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_ruleElement389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_ruleElement416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_ruleElement443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_ruleElement470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_ruleElement497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_ruleElement524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_ruleElement551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_entryRuleHeading709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeading719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleHeading756 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHeading768 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleHeading780 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeading801 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleHeading813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParagraph859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleParagraph896 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParagraph908 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleParagraph920 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraph941 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParagraph953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestion999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleTextQuestion1042 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleTextQuestion1073 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTextQuestion1098 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTextQuestion1110 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleTextQuestion1122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextQuestion1143 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTextQuestion1155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextQuestion1176 = new BitSet(new long[]{0x0000000006010000L});
        public static final BitSet FOLLOW_25_in_ruleTextQuestion1189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextQuestion1210 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleTextQuestion1225 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTextQuestion1237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextQuestion1260 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleTextQuestion1273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextQuestion1296 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleTextQuestion1310 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTextQuestion1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleChoiceQuestion1413 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleChoiceQuestion1438 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoiceQuestion1450 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleChoiceQuestion1462 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceQuestion1483 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleChoiceQuestion1495 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceQuestion1516 = new BitSet(new long[]{0x00000001C6000000L});
        public static final BitSet FOLLOW_25_in_ruleChoiceQuestion1529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceQuestion1550 = new BitSet(new long[]{0x00000001C4000000L});
        public static final BitSet FOLLOW_30_in_ruleChoiceQuestion1565 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleChoiceQuestion1586 = new BitSet(new long[]{0x0000000184000000L});
        public static final BitSet FOLLOW_31_in_ruleChoiceQuestion1601 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleChoiceQuestion1622 = new BitSet(new long[]{0x0000000104000000L});
        public static final BitSet FOLLOW_26_in_ruleChoiceQuestion1637 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleChoiceQuestion1649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceQuestion1672 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleChoiceQuestion1685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChoiceQuestion1708 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleChoiceQuestion1722 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleChoiceQuestion1736 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChoiceQuestion1748 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleChoiceQuestion1769 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleChoiceQuestion1782 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleChoiceQuestion1803 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleChoiceQuestion1817 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleChoiceQuestion1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion1865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleMatrixQuestion1918 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleMatrixQuestion1943 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMatrixQuestion1955 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMatrixQuestion1967 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion1988 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMatrixQuestion2000 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2021 = new BitSet(new long[]{0x0000001C02000000L});
        public static final BitSet FOLLOW_25_in_ruleMatrixQuestion2034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2055 = new BitSet(new long[]{0x0000001C00000000L});
        public static final BitSet FOLLOW_34_in_ruleMatrixQuestion2070 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMatrixQuestion2082 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2103 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMatrixQuestion2116 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2137 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMatrixQuestion2151 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleMatrixQuestion2166 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMatrixQuestion2178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2199 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMatrixQuestion2212 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2233 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMatrixQuestion2247 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleMatrixQuestion2261 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMatrixQuestion2282 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleMatrixQuestion2295 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMatrixQuestion2307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2330 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleMatrixQuestion2343 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion2366 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleMatrixQuestion2380 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMatrixQuestion2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion2430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarQuestion2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleCalendarQuestion2483 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleCalendarQuestion2514 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleCalendarQuestion2545 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCalendarQuestion2576 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCalendarQuestion2607 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleCalendarQuestion2638 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleCalendarQuestion2663 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCalendarQuestion2675 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCalendarQuestion2687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCalendarQuestion2708 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleCalendarQuestion2720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCalendarQuestion2741 = new BitSet(new long[]{0x0000000006010000L});
        public static final BitSet FOLLOW_25_in_ruleCalendarQuestion2754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCalendarQuestion2775 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleCalendarQuestion2790 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCalendarQuestion2802 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCalendarQuestion2825 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleCalendarQuestion2838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCalendarQuestion2861 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleCalendarQuestion2875 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCalendarQuestion2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion2925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerQuestion2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleIntegerQuestion2978 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleIntegerQuestion3003 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntegerQuestion3015 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleIntegerQuestion3027 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerQuestion3048 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleIntegerQuestion3060 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerQuestion3081 = new BitSet(new long[]{0x0000100002000000L});
        public static final BitSet FOLLOW_25_in_ruleIntegerQuestion3094 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerQuestion3115 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleIntegerQuestion3129 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion3150 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleIntegerQuestion3162 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion3183 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleIntegerQuestion3195 = new BitSet(new long[]{0x0002000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion3216 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleIntegerQuestion3229 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleIntegerQuestion3241 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerQuestion3264 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_15_in_ruleIntegerQuestion3277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerQuestion3300 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleIntegerQuestion3314 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntegerQuestion3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption3368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleOption3415 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOption3427 = new BitSet(new long[]{0x0001000000840000L});
        public static final BitSet FOLLOW_23_in_ruleOption3440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOption3461 = new BitSet(new long[]{0x0001000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOption3476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOption3497 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleOption3511 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOption3534 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOption3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEInt3633 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3650 = new BitSet(new long[]{0x0000000000000002L});
    }


}