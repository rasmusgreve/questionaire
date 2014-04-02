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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'email:'", "'#'", "'!'", "'?'", "'*'", "'text['", "'long'", "'short'", "']'", "'choice['", "'to'", "'matrix['", "']['", "','", "'-'", "'calendar['", "'year'", "'month'", "'day'", "'hour'", "'minute'", "'number['", "'step'", "'{'", "'/'", "'}'"
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:76:1: ruleQuestionaire returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'email:' ( (lv_resultEmail_2_0= ruleEString ) ) ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )? ) ;
    public final EObject ruleQuestionaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_resultEmail_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:79:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'email:' ( (lv_resultEmail_2_0= ruleEString ) ) ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )? ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'email:' ( (lv_resultEmail_2_0= ruleEString ) ) ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )? )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'email:' ( (lv_resultEmail_2_0= ruleEString ) ) ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )? )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'email:' ( (lv_resultEmail_2_0= ruleEString ) ) ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )?
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:80:2: ( (lv_name_0_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:81:1: (lv_name_0_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:81:1: (lv_name_0_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:82:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionaire131);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQuestionaire143); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionaireAccess().getEmailKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:102:1: ( (lv_resultEmail_2_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:103:1: (lv_resultEmail_2_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:103:1: (lv_resultEmail_2_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:104:3: lv_resultEmail_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionaire164);
            lv_resultEmail_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
            	        }
                   		set(
                   			current, 
                   			"resultEmail",
                    		lv_resultEmail_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:120:2: ( ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:120:3: ( (lv_elements_3_0= ruleElement ) ) ( (lv_elements_4_0= ruleElement ) )*
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:120:3: ( (lv_elements_3_0= ruleElement ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:121:1: (lv_elements_3_0= ruleElement )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:121:1: (lv_elements_3_0= ruleElement )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:122:3: lv_elements_3_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleQuestionaire186);
                    lv_elements_3_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_3_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:138:2: ( (lv_elements_4_0= ruleElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=12 && LA1_0<=14)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:139:1: (lv_elements_4_0= ruleElement )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:139:1: (lv_elements_4_0= ruleElement )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:140:3: lv_elements_4_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleQuestionaire207);
                    	    lv_elements_4_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQuestionaireRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_4_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:164:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:165:2: (iv_ruleElement= ruleElement EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:166:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement246);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement256); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:173:1: ruleElement returns [EObject current=null] : (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion ) ;
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
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:176:28: ( (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:177:1: (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:177:1: (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:178:5: this_Heading_0= ruleHeading
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHeading_in_ruleElement303);
                    this_Heading_0=ruleHeading();

                    state._fsp--;

                     
                            current = this_Heading_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:188:5: this_Paragraph_1= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_ruleElement330);
                    this_Paragraph_1=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:198:5: this_TextQuestion_2= ruleTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_ruleElement357);
                    this_TextQuestion_2=ruleTextQuestion();

                    state._fsp--;

                     
                            current = this_TextQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:208:5: this_ChoiceQuestion_3= ruleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_ruleElement384);
                    this_ChoiceQuestion_3=ruleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_ChoiceQuestion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:218:5: this_MatrixQuestion_4= ruleMatrixQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_ruleElement411);
                    this_MatrixQuestion_4=ruleMatrixQuestion();

                    state._fsp--;

                     
                            current = this_MatrixQuestion_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:228:5: this_CalendarQuestion_5= ruleCalendarQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_ruleElement438);
                    this_CalendarQuestion_5=ruleCalendarQuestion();

                    state._fsp--;

                     
                            current = this_CalendarQuestion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:238:5: this_IntegerQuestion_6= ruleIntegerQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_ruleElement465);
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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:254:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:255:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:256:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString501);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString512); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:263:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:266:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:267:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:267:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:267:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString552); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:275:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString578); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:290:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:291:2: (iv_ruleHeading= ruleHeading EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:292:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeading_in_entryRuleHeading623);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeading633); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:299:1: ruleHeading returns [EObject current=null] : (otherlv_0= '#' ( (lv_text_1_0= ruleEString ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:302:28: ( (otherlv_0= '#' ( (lv_text_1_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:303:1: (otherlv_0= '#' ( (lv_text_1_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:303:1: (otherlv_0= '#' ( (lv_text_1_0= ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:303:3: otherlv_0= '#' ( (lv_text_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHeading670); 

                	newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getNumberSignKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:307:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:308:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:308:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:309:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHeading691);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeadingRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:333:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:334:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:335:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_entryRuleParagraph727);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParagraph737); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:342:1: ruleParagraph returns [EObject current=null] : (otherlv_0= '!' ( (lv_text_1_0= ruleEString ) ) ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:345:28: ( (otherlv_0= '!' ( (lv_text_1_0= ruleEString ) ) ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:346:1: (otherlv_0= '!' ( (lv_text_1_0= ruleEString ) ) )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:346:1: (otherlv_0= '!' ( (lv_text_1_0= ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:346:3: otherlv_0= '!' ( (lv_text_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleParagraph774); 

                	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getExclamationMarkKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:350:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:351:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:351:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:352:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParagraph795);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParagraphRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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


    // $ANTLR start "entryRuleQuestionBase"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:376:1: entryRuleQuestionBase returns [EObject current=null] : iv_ruleQuestionBase= ruleQuestionBase EOF ;
    public final EObject entryRuleQuestionBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionBase = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:377:2: (iv_ruleQuestionBase= ruleQuestionBase EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:378:2: iv_ruleQuestionBase= ruleQuestionBase EOF
            {
             newCompositeNode(grammarAccess.getQuestionBaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_entryRuleQuestionBase831);
            iv_ruleQuestionBase=ruleQuestionBase();

            state._fsp--;

             current =iv_ruleQuestionBase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionBase841); 

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
    // $ANTLR end "entryRuleQuestionBase"


    // $ANTLR start "ruleQuestionBase"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:385:1: ruleQuestionBase returns [EObject current=null] : (otherlv_0= '?' ( (lv_title_1_0= ruleEString ) ) ( (lv_mandatory_2_0= '*' ) )? ( (lv_description_3_0= ruleEString ) )? ( (lv_conditions_4_0= ruleQuestionCondition ) )* ) ;
    public final EObject ruleQuestionBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_2_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_conditions_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:388:28: ( (otherlv_0= '?' ( (lv_title_1_0= ruleEString ) ) ( (lv_mandatory_2_0= '*' ) )? ( (lv_description_3_0= ruleEString ) )? ( (lv_conditions_4_0= ruleQuestionCondition ) )* ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:389:1: (otherlv_0= '?' ( (lv_title_1_0= ruleEString ) ) ( (lv_mandatory_2_0= '*' ) )? ( (lv_description_3_0= ruleEString ) )? ( (lv_conditions_4_0= ruleQuestionCondition ) )* )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:389:1: (otherlv_0= '?' ( (lv_title_1_0= ruleEString ) ) ( (lv_mandatory_2_0= '*' ) )? ( (lv_description_3_0= ruleEString ) )? ( (lv_conditions_4_0= ruleQuestionCondition ) )* )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:389:3: otherlv_0= '?' ( (lv_title_1_0= ruleEString ) ) ( (lv_mandatory_2_0= '*' ) )? ( (lv_description_3_0= ruleEString ) )? ( (lv_conditions_4_0= ruleQuestionCondition ) )*
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQuestionBase878); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionBaseAccess().getQuestionMarkKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:393:1: ( (lv_title_1_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:394:1: (lv_title_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:394:1: (lv_title_1_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:395:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionBase899);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:411:2: ( (lv_mandatory_2_0= '*' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:412:1: (lv_mandatory_2_0= '*' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:412:1: (lv_mandatory_2_0= '*' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:413:3: lv_mandatory_2_0= '*'
                    {
                    lv_mandatory_2_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuestionBase917); 

                            newLeafNode(lv_mandatory_2_0, grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionBaseRule());
                    	        }
                           		setWithLastConsumed(current, "mandatory", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:426:3: ( (lv_description_3_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:427:1: (lv_description_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:427:1: (lv_description_3_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:428:3: lv_description_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getDescriptionEStringParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionBase952);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:444:3: ( (lv_conditions_4_0= ruleQuestionCondition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:445:1: (lv_conditions_4_0= ruleQuestionCondition )
            	    {
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:445:1: (lv_conditions_4_0= ruleQuestionCondition )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:446:3: lv_conditions_4_0= ruleQuestionCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionBaseAccess().getConditionsQuestionConditionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestionCondition_in_ruleQuestionBase974);
            	    lv_conditions_4_0=ruleQuestionCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionBaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_4_0, 
            	            		"QuestionCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleQuestionBase"


    // $ANTLR start "entryRuleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:470:1: entryRuleTextQuestion returns [EObject current=null] : iv_ruleTextQuestion= ruleTextQuestion EOF ;
    public final EObject entryRuleTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:471:2: (iv_ruleTextQuestion= ruleTextQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:472:2: iv_ruleTextQuestion= ruleTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getTextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion1011);
            iv_ruleTextQuestion=ruleTextQuestion();

            state._fsp--;

             current =iv_ruleTextQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextQuestion1021); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:479:1: ruleTextQuestion returns [EObject current=null] : ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'text[' ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' ) otherlv_4= ']' ) ;
    public final EObject ruleTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_multiline_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_questionBase_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:482:28: ( ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'text[' ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' ) otherlv_4= ']' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:483:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'text[' ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' ) otherlv_4= ']' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:483:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'text[' ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' ) otherlv_4= ']' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:483:2: ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'text[' ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' ) otherlv_4= ']'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:483:2: ( (lv_questionBase_0_0= ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:484:1: (lv_questionBase_0_0= ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:484:1: (lv_questionBase_0_0= ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:485:3: lv_questionBase_0_0= ruleQuestionBase
            {
             
            	        newCompositeNode(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_ruleTextQuestion1067);
            lv_questionBase_0_0=ruleQuestionBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionBase",
                    		lv_questionBase_0_0, 
                    		"QuestionBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTextQuestion1079); 

                	newLeafNode(otherlv_1, grammarAccess.getTextQuestionAccess().getTextKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:505:1: ( ( (lv_multiline_2_0= 'long' ) ) | otherlv_3= 'short' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:505:2: ( (lv_multiline_2_0= 'long' ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:505:2: ( (lv_multiline_2_0= 'long' ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:506:1: (lv_multiline_2_0= 'long' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:506:1: (lv_multiline_2_0= 'long' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:507:3: lv_multiline_2_0= 'long'
                    {
                    lv_multiline_2_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTextQuestion1098); 

                            newLeafNode(lv_multiline_2_0, grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTextQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "multiline", true, "long");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:521:7: otherlv_3= 'short'
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTextQuestion1129); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getShortKeyword_2_1());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTextQuestion1142); 

                	newLeafNode(otherlv_4, grammarAccess.getTextQuestionAccess().getRightSquareBracketKeyword_3());
                

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:537:1: entryRuleChoiceQuestion returns [EObject current=null] : iv_ruleChoiceQuestion= ruleChoiceQuestion EOF ;
    public final EObject entryRuleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:538:2: (iv_ruleChoiceQuestion= ruleChoiceQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:539:2: iv_ruleChoiceQuestion= ruleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1178);
            iv_ruleChoiceQuestion=ruleChoiceQuestion();

            state._fsp--;

             current =iv_ruleChoiceQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceQuestion1188); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:546:1: ruleChoiceQuestion returns [EObject current=null] : ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'choice[' ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) ) otherlv_6= ']' ( (lv_options_7_0= ruleOption ) )+ ) ;
    public final EObject ruleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_questionBase_0_0 = null;

        AntlrDatatypeRuleToken lv_minSelections_2_0 = null;

        AntlrDatatypeRuleToken lv_minSelections_3_0 = null;

        AntlrDatatypeRuleToken lv_maxSelections_5_0 = null;

        EObject lv_options_7_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:549:28: ( ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'choice[' ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) ) otherlv_6= ']' ( (lv_options_7_0= ruleOption ) )+ ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:550:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'choice[' ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) ) otherlv_6= ']' ( (lv_options_7_0= ruleOption ) )+ )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:550:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'choice[' ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) ) otherlv_6= ']' ( (lv_options_7_0= ruleOption ) )+ )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:550:2: ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'choice[' ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) ) otherlv_6= ']' ( (lv_options_7_0= ruleOption ) )+
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:550:2: ( (lv_questionBase_0_0= ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:551:1: (lv_questionBase_0_0= ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:551:1: (lv_questionBase_0_0= ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:552:3: lv_questionBase_0_0= ruleQuestionBase
            {
             
            	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_ruleChoiceQuestion1234);
            lv_questionBase_0_0=ruleQuestionBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionBase",
                    		lv_questionBase_0_0, 
                    		"QuestionBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleChoiceQuestion1246); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:572:1: ( ( (lv_minSelections_2_0= ruleEInt ) ) | ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==19) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==21) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_INT) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==19) ) {
                    alt9=1;
                }
                else if ( (LA9_2==21) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:572:2: ( (lv_minSelections_2_0= ruleEInt ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:572:2: ( (lv_minSelections_2_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:573:1: (lv_minSelections_2_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:573:1: (lv_minSelections_2_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:574:3: lv_minSelections_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleChoiceQuestion1268);
                    lv_minSelections_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"minSelections",
                            		lv_minSelections_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:591:6: ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:591:6: ( ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:591:7: ( (lv_minSelections_3_0= ruleEInt ) ) otherlv_4= 'to' ( (lv_maxSelections_5_0= ruleEInt ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:591:7: ( (lv_minSelections_3_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:592:1: (lv_minSelections_3_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:592:1: (lv_minSelections_3_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:593:3: lv_minSelections_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleChoiceQuestion1296);
                    lv_minSelections_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"minSelections",
                            		lv_minSelections_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleChoiceQuestion1308); 

                        	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getToKeyword_2_1_1());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:613:1: ( (lv_maxSelections_5_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:614:1: (lv_maxSelections_5_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:614:1: (lv_maxSelections_5_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:615:3: lv_maxSelections_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleChoiceQuestion1329);
                    lv_maxSelections_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"maxSelections",
                            		lv_maxSelections_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleChoiceQuestion1343); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightSquareBracketKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:635:1: ( (lv_options_7_0= ruleOption ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:636:1: (lv_options_7_0= ruleOption )
            	    {
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:636:1: (lv_options_7_0= ruleOption )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:637:3: lv_options_7_0= ruleOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOption_in_ruleChoiceQuestion1364);
            	    lv_options_7_0=ruleOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_7_0, 
            	            		"Option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:661:1: entryRuleMatrixQuestion returns [EObject current=null] : iv_ruleMatrixQuestion= ruleMatrixQuestion EOF ;
    public final EObject entryRuleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:662:2: (iv_ruleMatrixQuestion= ruleMatrixQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:663:2: iv_ruleMatrixQuestion= ruleMatrixQuestion EOF
            {
             newCompositeNode(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion1401);
            iv_ruleMatrixQuestion=ruleMatrixQuestion();

            state._fsp--;

             current =iv_ruleMatrixQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatrixQuestion1411); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:670:1: ruleMatrixQuestion returns [EObject current=null] : ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'matrix[' ( (lv_maxPerRow_2_0= ruleEInt ) ) otherlv_3= '][' ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )? (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+ ) ;
    public final EObject ruleMatrixQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_questionBase_0_0 = null;

        AntlrDatatypeRuleToken lv_maxPerRow_2_0 = null;

        AntlrDatatypeRuleToken lv_columnNames_4_0 = null;

        AntlrDatatypeRuleToken lv_columnNames_6_0 = null;

        AntlrDatatypeRuleToken lv_rowNames_9_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:673:28: ( ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'matrix[' ( (lv_maxPerRow_2_0= ruleEInt ) ) otherlv_3= '][' ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )? (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+ ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:674:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'matrix[' ( (lv_maxPerRow_2_0= ruleEInt ) ) otherlv_3= '][' ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )? (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+ )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:674:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'matrix[' ( (lv_maxPerRow_2_0= ruleEInt ) ) otherlv_3= '][' ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )? (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+ )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:674:2: ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'matrix[' ( (lv_maxPerRow_2_0= ruleEInt ) ) otherlv_3= '][' ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )? (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:674:2: ( (lv_questionBase_0_0= ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:675:1: (lv_questionBase_0_0= ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:675:1: (lv_questionBase_0_0= ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:676:3: lv_questionBase_0_0= ruleQuestionBase
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_ruleMatrixQuestion1457);
            lv_questionBase_0_0=ruleQuestionBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionBase",
                    		lv_questionBase_0_0, 
                    		"QuestionBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMatrixQuestion1469); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrixQuestionAccess().getMatrixKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:696:1: ( (lv_maxPerRow_2_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:697:1: (lv_maxPerRow_2_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:697:1: (lv_maxPerRow_2_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:698:3: lv_maxPerRow_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMatrixQuestion1490);
            lv_maxPerRow_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"maxPerRow",
                    		lv_maxPerRow_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMatrixQuestion1502); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrixQuestionAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:718:1: ( ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:718:2: ( (lv_columnNames_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )* otherlv_7= ']'
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:718:2: ( (lv_columnNames_4_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:719:1: (lv_columnNames_4_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:719:1: (lv_columnNames_4_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:720:3: lv_columnNames_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion1524);
                    lv_columnNames_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	        }
                           		add(
                           			current, 
                           			"columnNames",
                            		lv_columnNames_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:736:2: (otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:736:4: otherlv_5= ',' ( (lv_columnNames_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMatrixQuestion1537); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMatrixQuestionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:740:1: ( (lv_columnNames_6_0= ruleEString ) )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:741:1: (lv_columnNames_6_0= ruleEString )
                    	    {
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:741:1: (lv_columnNames_6_0= ruleEString )
                    	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:742:3: lv_columnNames_6_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion1558);
                    	    lv_columnNames_6_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"columnNames",
                    	            		lv_columnNames_6_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMatrixQuestion1572); 

                        	newLeafNode(otherlv_7, grammarAccess.getMatrixQuestionAccess().getRightSquareBracketKeyword_4_2());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:762:3: (otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:762:5: otherlv_8= '-' ( (lv_rowNames_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMatrixQuestion1587); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMatrixQuestionAccess().getHyphenMinusKeyword_5_0());
            	        
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:766:1: ( (lv_rowNames_9_0= ruleEString ) )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:767:1: (lv_rowNames_9_0= ruleEString )
            	    {
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:767:1: (lv_rowNames_9_0= ruleEString )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:768:3: lv_rowNames_9_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatrixQuestion1608);
            	    lv_rowNames_9_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMatrixQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rowNames",
            	            		lv_rowNames_9_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:792:1: entryRuleCalendarQuestion returns [EObject current=null] : iv_ruleCalendarQuestion= ruleCalendarQuestion EOF ;
    public final EObject entryRuleCalendarQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:793:2: (iv_ruleCalendarQuestion= ruleCalendarQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:794:2: iv_ruleCalendarQuestion= ruleCalendarQuestion EOF
            {
             newCompositeNode(grammarAccess.getCalendarQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion1646);
            iv_ruleCalendarQuestion=ruleCalendarQuestion();

            state._fsp--;

             current =iv_ruleCalendarQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarQuestion1656); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:801:1: ruleCalendarQuestion returns [EObject current=null] : ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'calendar[' ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? ) otherlv_11= ']' ) ;
    public final EObject ruleCalendarQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_year_2_0=null;
        Token otherlv_3=null;
        Token lv_month_4_0=null;
        Token otherlv_5=null;
        Token lv_day_6_0=null;
        Token otherlv_7=null;
        Token lv_hour_8_0=null;
        Token otherlv_9=null;
        Token lv_minute_10_0=null;
        Token otherlv_11=null;
        EObject lv_questionBase_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:804:28: ( ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'calendar[' ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? ) otherlv_11= ']' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:805:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'calendar[' ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? ) otherlv_11= ']' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:805:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'calendar[' ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? ) otherlv_11= ']' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:805:2: ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'calendar[' ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? ) otherlv_11= ']'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:805:2: ( (lv_questionBase_0_0= ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:806:1: (lv_questionBase_0_0= ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:806:1: (lv_questionBase_0_0= ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:807:3: lv_questionBase_0_0= ruleQuestionBase
            {
             
            	        newCompositeNode(grammarAccess.getCalendarQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_ruleCalendarQuestion1702);
            lv_questionBase_0_0=ruleQuestionBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCalendarQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionBase",
                    		lv_questionBase_0_0, 
                    		"QuestionBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCalendarQuestion1714); 

                	newLeafNode(otherlv_1, grammarAccess.getCalendarQuestionAccess().getCalendarKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:827:1: ( ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )? )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:827:2: ( (lv_year_2_0= 'year' ) )? (otherlv_3= ',' )? ( (lv_month_4_0= 'month' ) )? (otherlv_5= ',' )? ( (lv_day_6_0= 'day' ) )? (otherlv_7= ',' )? ( (lv_hour_8_0= 'hour' ) )? (otherlv_9= ',' )? ( (lv_minute_10_0= 'minute' ) )?
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:827:2: ( (lv_year_2_0= 'year' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:828:1: (lv_year_2_0= 'year' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:828:1: (lv_year_2_0= 'year' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:829:3: lv_year_2_0= 'year'
                    {
                    lv_year_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCalendarQuestion1733); 

                            newLeafNode(lv_year_2_0, grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "year", true, "year");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:842:3: (otherlv_3= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:842:5: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCalendarQuestion1760); 

                        	newLeafNode(otherlv_3, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:846:3: ( (lv_month_4_0= 'month' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:847:1: (lv_month_4_0= 'month' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:847:1: (lv_month_4_0= 'month' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:848:3: lv_month_4_0= 'month'
                    {
                    lv_month_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCalendarQuestion1780); 

                            newLeafNode(lv_month_4_0, grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "month", true, "month");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:861:3: (otherlv_5= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:861:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCalendarQuestion1807); 

                        	newLeafNode(otherlv_5, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:865:3: ( (lv_day_6_0= 'day' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:866:1: (lv_day_6_0= 'day' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:866:1: (lv_day_6_0= 'day' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:867:3: lv_day_6_0= 'day'
                    {
                    lv_day_6_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCalendarQuestion1827); 

                            newLeafNode(lv_day_6_0, grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "day", true, "day");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:880:3: (otherlv_7= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:880:5: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCalendarQuestion1854); 

                        	newLeafNode(otherlv_7, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:884:3: ( (lv_hour_8_0= 'hour' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:885:1: (lv_hour_8_0= 'hour' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:885:1: (lv_hour_8_0= 'hour' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:886:3: lv_hour_8_0= 'hour'
                    {
                    lv_hour_8_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCalendarQuestion1874); 

                            newLeafNode(lv_hour_8_0, grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "hour", true, "hour");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:899:3: (otherlv_9= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:899:5: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCalendarQuestion1901); 

                        	newLeafNode(otherlv_9, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7());
                        

                    }
                    break;

            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:903:3: ( (lv_minute_10_0= 'minute' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:904:1: (lv_minute_10_0= 'minute' )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:904:1: (lv_minute_10_0= 'minute' )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:905:3: lv_minute_10_0= 'minute'
                    {
                    lv_minute_10_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCalendarQuestion1921); 

                            newLeafNode(lv_minute_10_0, grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalendarQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "minute", true, "minute");
                    	    

                    }


                    }
                    break;

            }


            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCalendarQuestion1948); 

                	newLeafNode(otherlv_11, grammarAccess.getCalendarQuestionAccess().getRightSquareBracketKeyword_3());
                

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:930:1: entryRuleIntegerQuestion returns [EObject current=null] : iv_ruleIntegerQuestion= ruleIntegerQuestion EOF ;
    public final EObject entryRuleIntegerQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerQuestion = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:931:2: (iv_ruleIntegerQuestion= ruleIntegerQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:932:2: iv_ruleIntegerQuestion= ruleIntegerQuestion EOF
            {
             newCompositeNode(grammarAccess.getIntegerQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion1984);
            iv_ruleIntegerQuestion=ruleIntegerQuestion();

            state._fsp--;

             current =iv_ruleIntegerQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerQuestion1994); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:939:1: ruleIntegerQuestion returns [EObject current=null] : ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'number[' ( (lv_minValue_2_0= ruleEInt ) ) otherlv_3= 'to' ( (lv_maxValue_4_0= ruleEInt ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )? otherlv_7= ']' ) ;
    public final EObject ruleIntegerQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_questionBase_0_0 = null;

        AntlrDatatypeRuleToken lv_minValue_2_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_4_0 = null;

        AntlrDatatypeRuleToken lv_step_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:942:28: ( ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'number[' ( (lv_minValue_2_0= ruleEInt ) ) otherlv_3= 'to' ( (lv_maxValue_4_0= ruleEInt ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )? otherlv_7= ']' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:943:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'number[' ( (lv_minValue_2_0= ruleEInt ) ) otherlv_3= 'to' ( (lv_maxValue_4_0= ruleEInt ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )? otherlv_7= ']' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:943:1: ( ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'number[' ( (lv_minValue_2_0= ruleEInt ) ) otherlv_3= 'to' ( (lv_maxValue_4_0= ruleEInt ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )? otherlv_7= ']' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:943:2: ( (lv_questionBase_0_0= ruleQuestionBase ) ) otherlv_1= 'number[' ( (lv_minValue_2_0= ruleEInt ) ) otherlv_3= 'to' ( (lv_maxValue_4_0= ruleEInt ) ) (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )? otherlv_7= ']'
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:943:2: ( (lv_questionBase_0_0= ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:944:1: (lv_questionBase_0_0= ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:944:1: (lv_questionBase_0_0= ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:945:3: lv_questionBase_0_0= ruleQuestionBase
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_ruleIntegerQuestion2040);
            lv_questionBase_0_0=ruleQuestionBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"questionBase",
                    		lv_questionBase_0_0, 
                    		"QuestionBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIntegerQuestion2052); 

                	newLeafNode(otherlv_1, grammarAccess.getIntegerQuestionAccess().getNumberKeyword_1());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:965:1: ( (lv_minValue_2_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:966:1: (lv_minValue_2_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:966:1: (lv_minValue_2_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:967:3: lv_minValue_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion2073);
            lv_minValue_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"minValue",
                    		lv_minValue_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleIntegerQuestion2085); 

                	newLeafNode(otherlv_3, grammarAccess.getIntegerQuestionAccess().getToKeyword_3());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:987:1: ( (lv_maxValue_4_0= ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:988:1: (lv_maxValue_4_0= ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:988:1: (lv_maxValue_4_0= ruleEInt )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:989:3: lv_maxValue_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion2106);
            lv_maxValue_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"maxValue",
                    		lv_maxValue_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1005:2: (otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1005:4: otherlv_5= 'step' ( (lv_step_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIntegerQuestion2119); 

                        	newLeafNode(otherlv_5, grammarAccess.getIntegerQuestionAccess().getStepKeyword_5_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1009:1: ( (lv_step_6_0= ruleEInt ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1010:1: (lv_step_6_0= ruleEInt )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1010:1: (lv_step_6_0= ruleEInt )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1011:3: lv_step_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerQuestion2140);
                    lv_step_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntegerQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"step",
                            		lv_step_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntegerQuestion2154); 

                	newLeafNode(otherlv_7, grammarAccess.getIntegerQuestionAccess().getRightSquareBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleQuestionCondition"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1041:1: entryRuleQuestionCondition returns [EObject current=null] : iv_ruleQuestionCondition= ruleQuestionCondition EOF ;
    public final EObject entryRuleQuestionCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionCondition = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1042:2: (iv_ruleQuestionCondition= ruleQuestionCondition EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1043:2: iv_ruleQuestionCondition= ruleQuestionCondition EOF
            {
             newCompositeNode(grammarAccess.getQuestionConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionCondition_in_entryRuleQuestionCondition2192);
            iv_ruleQuestionCondition=ruleQuestionCondition();

            state._fsp--;

             current =iv_ruleQuestionCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionCondition2202); 

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
    // $ANTLR end "entryRuleQuestionCondition"


    // $ANTLR start "ruleQuestionCondition"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1050:1: ruleQuestionCondition returns [EObject current=null] : (otherlv_0= '{' ( ( ruleEString ) ) (otherlv_2= '/' ( ( ruleEString ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleQuestionCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1053:28: ( (otherlv_0= '{' ( ( ruleEString ) ) (otherlv_2= '/' ( ( ruleEString ) ) )* otherlv_4= '}' ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1054:1: (otherlv_0= '{' ( ( ruleEString ) ) (otherlv_2= '/' ( ( ruleEString ) ) )* otherlv_4= '}' )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1054:1: (otherlv_0= '{' ( ( ruleEString ) ) (otherlv_2= '/' ( ( ruleEString ) ) )* otherlv_4= '}' )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1054:3: otherlv_0= '{' ( ( ruleEString ) ) (otherlv_2= '/' ( ( ruleEString ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleQuestionCondition2239); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionConditionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1058:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1059:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1059:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1060:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionCondition2262);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1073:2: (otherlv_2= '/' ( ( ruleEString ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1073:4: otherlv_2= '/' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleQuestionCondition2275); 

            	        	newLeafNode(otherlv_2, grammarAccess.getQuestionConditionAccess().getSolidusKeyword_2_0());
            	        
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1077:1: ( ( ruleEString ) )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1078:1: ( ruleEString )
            	    {
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1078:1: ( ruleEString )
            	    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1079:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestionConditionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestionCondition2298);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleQuestionCondition2312); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionConditionAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleQuestionCondition"


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1104:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1105:2: (iv_ruleOption= ruleOption EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1106:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption2348);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption2358); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1113:1: ruleOption returns [EObject current=null] : (otherlv_0= '-' ( (lv_text_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1116:28: ( (otherlv_0= '-' ( (lv_text_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )? ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1117:1: (otherlv_0= '-' ( (lv_text_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )? )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1117:1: (otherlv_0= '-' ( (lv_text_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )? )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1117:3: otherlv_0= '-' ( (lv_text_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOption2395); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getHyphenMinusKeyword_0());
                
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1121:1: ( (lv_text_1_0= ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1122:1: (lv_text_1_0= ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1122:1: (lv_text_1_0= ruleEString )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1123:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOption2416);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1139:2: (otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1139:4: otherlv_2= '{' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleOption2429); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1143:1: ( (lv_name_3_0= ruleEString ) )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1144:1: (lv_name_3_0= ruleEString )
                    {
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1144:1: (lv_name_3_0= ruleEString )
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1145:3: lv_name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOption2450);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOptionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOption2462); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_2_2());
                        

                    }
                    break;

            }


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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1173:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1174:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1175:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2501);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2512); 

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
    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1182:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1185:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1186:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1186:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1186:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1186:2: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire/src-gen/dk/itu/smdp/group2/parser/antlr/internal/InternalQuestionaire.g:1187:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt2551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2568); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\25\uffff";
    static final String DFA3_eofS =
        "\25\uffff";
    static final String DFA3_minS =
        "\1\14\2\uffff\4\4\2\20\1\4\5\uffff\2\43\1\4\1\20\2\43";
    static final String DFA3_maxS =
        "\1\16\2\uffff\1\5\5\42\1\5\5\uffff\2\44\1\5\1\42\2\44";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\7\1\4\1\5\1\6\1\3\6\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\4\1\5",
            "\1\7\1\10\11\uffff\1\6\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff"+
            "\1\15\5\uffff\1\12\1\uffff\1\11",
            "\1\7\1\10\11\uffff\1\6\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff"+
            "\1\15\5\uffff\1\12\1\uffff\1\11",
            "\1\7\1\10\12\uffff\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff"+
            "\1\15\5\uffff\1\12\1\uffff\1\11",
            "\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff\1\15\5\uffff\1\12"+
            "\1\uffff\1\11",
            "\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff\1\15\5\uffff\1\12"+
            "\1\uffff\1\11",
            "\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\22",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\16\3\uffff\1\13\1\uffff\1\14\3\uffff\1\15\5\uffff\1\12"+
            "\1\uffff\1\11",
            "\1\21\1\22",
            "\1\21\1\22"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "177:1: (this_Heading_0= ruleHeading | this_Paragraph_1= ruleParagraph | this_TextQuestion_2= ruleTextQuestion | this_ChoiceQuestion_3= ruleChoiceQuestion | this_MatrixQuestion_4= ruleMatrixQuestion | this_CalendarQuestion_5= ruleCalendarQuestion | this_IntegerQuestion_6= ruleIntegerQuestion )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuestionaire_in_entryRuleQuestionaire75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionaire85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionaire131 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleQuestionaire143 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionaire164 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleQuestionaire186 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleQuestionaire207 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_ruleElement303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_ruleElement330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_ruleElement357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_ruleElement384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_ruleElement411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_ruleElement438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_ruleElement465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_entryRuleHeading623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeading633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleHeading670 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHeading691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParagraph737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleParagraph774 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParagraph795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_entryRuleQuestionBase831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionBase841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleQuestionBase878 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionBase899 = new BitSet(new long[]{0x0000000400008032L});
        public static final BitSet FOLLOW_15_in_ruleQuestionBase917 = new BitSet(new long[]{0x0000000400000032L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionBase952 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleQuestionCondition_in_ruleQuestionBase974 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion1011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestion1021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_ruleTextQuestion1067 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTextQuestion1079 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleTextQuestion1098 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_18_in_ruleTextQuestion1129 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTextQuestion1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_ruleChoiceQuestion1234 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleChoiceQuestion1246 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleChoiceQuestion1268 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleChoiceQuestion1296 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleChoiceQuestion1308 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleChoiceQuestion1329 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleChoiceQuestion1343 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleOption_in_ruleChoiceQuestion1364 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion1401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_ruleMatrixQuestion1457 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMatrixQuestion1469 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMatrixQuestion1490 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMatrixQuestion1502 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion1524 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleMatrixQuestion1537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion1558 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_19_in_ruleMatrixQuestion1572 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMatrixQuestion1587 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatrixQuestion1608 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion1646 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarQuestion1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_ruleCalendarQuestion1702 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCalendarQuestion1714 = new BitSet(new long[]{0x00000000F9080000L});
        public static final BitSet FOLLOW_27_in_ruleCalendarQuestion1733 = new BitSet(new long[]{0x00000000F1080000L});
        public static final BitSet FOLLOW_24_in_ruleCalendarQuestion1760 = new BitSet(new long[]{0x00000000F1080000L});
        public static final BitSet FOLLOW_28_in_ruleCalendarQuestion1780 = new BitSet(new long[]{0x00000000E1080000L});
        public static final BitSet FOLLOW_24_in_ruleCalendarQuestion1807 = new BitSet(new long[]{0x00000000E1080000L});
        public static final BitSet FOLLOW_29_in_ruleCalendarQuestion1827 = new BitSet(new long[]{0x00000000C1080000L});
        public static final BitSet FOLLOW_24_in_ruleCalendarQuestion1854 = new BitSet(new long[]{0x00000000C1080000L});
        public static final BitSet FOLLOW_30_in_ruleCalendarQuestion1874 = new BitSet(new long[]{0x0000000081080000L});
        public static final BitSet FOLLOW_24_in_ruleCalendarQuestion1901 = new BitSet(new long[]{0x0000000080080000L});
        public static final BitSet FOLLOW_31_in_ruleCalendarQuestion1921 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCalendarQuestion1948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion1984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerQuestion1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_ruleIntegerQuestion2040 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleIntegerQuestion2052 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion2073 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleIntegerQuestion2085 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion2106 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_33_in_ruleIntegerQuestion2119 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerQuestion2140 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIntegerQuestion2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionCondition_in_entryRuleQuestionCondition2192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionCondition2202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleQuestionCondition2239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionCondition2262 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleQuestionCondition2275 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestionCondition2298 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_36_in_ruleQuestionCondition2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption2348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleOption2395 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOption2416 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleOption2429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOption2450 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleOption2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt2551 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2568 = new BitSet(new long[]{0x0000000000000002L});
    }


}