package dk.itu.smdp.group2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionaireParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'short'", "'email:'", "'#'", "'!'", "'?'", "'text['", "']'", "'choice['", "'to'", "'matrix['", "']['", "','", "'-'", "'calendar['", "'number['", "'step'", "'{'", "'}'", "'/'", "'*'", "'long'", "'year'", "'month'", "'day'", "'hour'", "'minute'"
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
    public String getGrammarFileName() { return "../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g"; }


     
     	private QuestionaireGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QuestionaireGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQuestionaire"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:60:1: entryRuleQuestionaire : ruleQuestionaire EOF ;
    public final void entryRuleQuestionaire() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:61:1: ( ruleQuestionaire EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:62:1: ruleQuestionaire EOF
            {
             before(grammarAccess.getQuestionaireRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionaire_in_entryRuleQuestionaire61);
            ruleQuestionaire();

            state._fsp--;

             after(grammarAccess.getQuestionaireRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionaire68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionaire"


    // $ANTLR start "ruleQuestionaire"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:69:1: ruleQuestionaire : ( ( rule__Questionaire__Group__0 ) ) ;
    public final void ruleQuestionaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:73:2: ( ( ( rule__Questionaire__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:74:1: ( ( rule__Questionaire__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:74:1: ( ( rule__Questionaire__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:75:1: ( rule__Questionaire__Group__0 )
            {
             before(grammarAccess.getQuestionaireAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:76:1: ( rule__Questionaire__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:76:2: rule__Questionaire__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__0_in_ruleQuestionaire94);
            rule__Questionaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionaire"


    // $ANTLR start "entryRuleElement"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:89:1: ( ruleElement EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:104:1: ( rule__Element__Alternatives )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEString"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:117:1: ( ruleEString EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:132:1: ( rule__EString__Alternatives )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleHeading"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:144:1: entryRuleHeading : ruleHeading EOF ;
    public final void entryRuleHeading() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:145:1: ( ruleHeading EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:146:1: ruleHeading EOF
            {
             before(grammarAccess.getHeadingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHeading_in_entryRuleHeading241);
            ruleHeading();

            state._fsp--;

             after(grammarAccess.getHeadingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHeading248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:153:1: ruleHeading : ( ( rule__Heading__Group__0 ) ) ;
    public final void ruleHeading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:157:2: ( ( ( rule__Heading__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:158:1: ( ( rule__Heading__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:158:1: ( ( rule__Heading__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:159:1: ( rule__Heading__Group__0 )
            {
             before(grammarAccess.getHeadingAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:160:1: ( rule__Heading__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:160:2: rule__Heading__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__0_in_ruleHeading274);
            rule__Heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleParagraph"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:172:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:173:1: ( ruleParagraph EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:174:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_entryRuleParagraph301);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParagraph308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:181:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:185:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:186:1: ( ( rule__Paragraph__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:186:1: ( ( rule__Paragraph__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:187:1: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:188:1: ( rule__Paragraph__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:188:2: rule__Paragraph__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__0_in_ruleParagraph334);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleQuestionBase"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:200:1: entryRuleQuestionBase : ruleQuestionBase EOF ;
    public final void entryRuleQuestionBase() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:201:1: ( ruleQuestionBase EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:202:1: ruleQuestionBase EOF
            {
             before(grammarAccess.getQuestionBaseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_entryRuleQuestionBase361);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getQuestionBaseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionBase368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionBase"


    // $ANTLR start "ruleQuestionBase"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:209:1: ruleQuestionBase : ( ( rule__QuestionBase__Group__0 ) ) ;
    public final void ruleQuestionBase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:213:2: ( ( ( rule__QuestionBase__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:214:1: ( ( rule__QuestionBase__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:214:1: ( ( rule__QuestionBase__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:215:1: ( rule__QuestionBase__Group__0 )
            {
             before(grammarAccess.getQuestionBaseAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:216:1: ( rule__QuestionBase__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:216:2: rule__QuestionBase__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__0_in_ruleQuestionBase394);
            rule__QuestionBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionBaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionBase"


    // $ANTLR start "entryRuleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:228:1: entryRuleTextQuestion : ruleTextQuestion EOF ;
    public final void entryRuleTextQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:229:1: ( ruleTextQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:230:1: ruleTextQuestion EOF
            {
             before(grammarAccess.getTextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion421);
            ruleTextQuestion();

            state._fsp--;

             after(grammarAccess.getTextQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextQuestion428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextQuestion"


    // $ANTLR start "ruleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:237:1: ruleTextQuestion : ( ( rule__TextQuestion__Group__0 ) ) ;
    public final void ruleTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:241:2: ( ( ( rule__TextQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:242:1: ( ( rule__TextQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:242:1: ( ( rule__TextQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:243:1: ( rule__TextQuestion__Group__0 )
            {
             before(grammarAccess.getTextQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:244:1: ( rule__TextQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:244:2: rule__TextQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__0_in_ruleTextQuestion454);
            rule__TextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:256:1: entryRuleChoiceQuestion : ruleChoiceQuestion EOF ;
    public final void entryRuleChoiceQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:257:1: ( ruleChoiceQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:258:1: ruleChoiceQuestion EOF
            {
             before(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion481);
            ruleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceQuestion488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:265:1: ruleChoiceQuestion : ( ( rule__ChoiceQuestion__Group__0 ) ) ;
    public final void ruleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:269:2: ( ( ( rule__ChoiceQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:270:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:270:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:271:1: ( rule__ChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:272:1: ( rule__ChoiceQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:272:2: rule__ChoiceQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion514);
            rule__ChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleMatrixQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:284:1: entryRuleMatrixQuestion : ruleMatrixQuestion EOF ;
    public final void entryRuleMatrixQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:285:1: ( ruleMatrixQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:286:1: ruleMatrixQuestion EOF
            {
             before(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion541);
            ruleMatrixQuestion();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatrixQuestion548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatrixQuestion"


    // $ANTLR start "ruleMatrixQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:293:1: ruleMatrixQuestion : ( ( rule__MatrixQuestion__Group__0 ) ) ;
    public final void ruleMatrixQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:297:2: ( ( ( rule__MatrixQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:298:1: ( ( rule__MatrixQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:298:1: ( ( rule__MatrixQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:299:1: ( rule__MatrixQuestion__Group__0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:300:1: ( rule__MatrixQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:300:2: rule__MatrixQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion574);
            rule__MatrixQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrixQuestion"


    // $ANTLR start "entryRuleCalendarQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:312:1: entryRuleCalendarQuestion : ruleCalendarQuestion EOF ;
    public final void entryRuleCalendarQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:313:1: ( ruleCalendarQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:314:1: ruleCalendarQuestion EOF
            {
             before(grammarAccess.getCalendarQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion601);
            ruleCalendarQuestion();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarQuestion608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalendarQuestion"


    // $ANTLR start "ruleCalendarQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:321:1: ruleCalendarQuestion : ( ( rule__CalendarQuestion__Group__0 ) ) ;
    public final void ruleCalendarQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:325:2: ( ( ( rule__CalendarQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:326:1: ( ( rule__CalendarQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:326:1: ( ( rule__CalendarQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:327:1: ( rule__CalendarQuestion__Group__0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:328:1: ( rule__CalendarQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:328:2: rule__CalendarQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__0_in_ruleCalendarQuestion634);
            rule__CalendarQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalendarQuestion"


    // $ANTLR start "entryRuleIntegerQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:340:1: entryRuleIntegerQuestion : ruleIntegerQuestion EOF ;
    public final void entryRuleIntegerQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:341:1: ( ruleIntegerQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:342:1: ruleIntegerQuestion EOF
            {
             before(grammarAccess.getIntegerQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion661);
            ruleIntegerQuestion();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerQuestion668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerQuestion"


    // $ANTLR start "ruleIntegerQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:349:1: ruleIntegerQuestion : ( ( rule__IntegerQuestion__Group__0 ) ) ;
    public final void ruleIntegerQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:353:2: ( ( ( rule__IntegerQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:354:1: ( ( rule__IntegerQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:354:1: ( ( rule__IntegerQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:355:1: ( rule__IntegerQuestion__Group__0 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:356:1: ( rule__IntegerQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:356:2: rule__IntegerQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__0_in_ruleIntegerQuestion694);
            rule__IntegerQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerQuestion"


    // $ANTLR start "entryRuleQuestionCondition"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:370:1: entryRuleQuestionCondition : ruleQuestionCondition EOF ;
    public final void entryRuleQuestionCondition() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:371:1: ( ruleQuestionCondition EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:372:1: ruleQuestionCondition EOF
            {
             before(grammarAccess.getQuestionConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionCondition_in_entryRuleQuestionCondition723);
            ruleQuestionCondition();

            state._fsp--;

             after(grammarAccess.getQuestionConditionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionCondition730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionCondition"


    // $ANTLR start "ruleQuestionCondition"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:379:1: ruleQuestionCondition : ( ( rule__QuestionCondition__Group__0 ) ) ;
    public final void ruleQuestionCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:383:2: ( ( ( rule__QuestionCondition__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:384:1: ( ( rule__QuestionCondition__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:384:1: ( ( rule__QuestionCondition__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:385:1: ( rule__QuestionCondition__Group__0 )
            {
             before(grammarAccess.getQuestionConditionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:386:1: ( rule__QuestionCondition__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:386:2: rule__QuestionCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__0_in_ruleQuestionCondition756);
            rule__QuestionCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionCondition"


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:398:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:399:1: ( ruleOption EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:400:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption783);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:407:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:411:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:412:1: ( ( rule__Option__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:412:1: ( ( rule__Option__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:413:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:414:1: ( rule__Option__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:414:2: rule__Option__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__0_in_ruleOption816);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleEInt"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:426:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:427:1: ( ruleEInt EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:428:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt843);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:435:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:439:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:440:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:440:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:441:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:442:1: ( rule__EInt__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:442:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt876);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Element__Alternatives"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:454:1: rule__Element__Alternatives : ( ( ruleHeading ) | ( ruleParagraph ) | ( ruleTextQuestion ) | ( ruleChoiceQuestion ) | ( ruleMatrixQuestion ) | ( ruleCalendarQuestion ) | ( ruleIntegerQuestion ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:458:1: ( ( ruleHeading ) | ( ruleParagraph ) | ( ruleTextQuestion ) | ( ruleChoiceQuestion ) | ( ruleMatrixQuestion ) | ( ruleCalendarQuestion ) | ( ruleIntegerQuestion ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:459:1: ( ruleHeading )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:459:1: ( ruleHeading )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:460:1: ruleHeading
                    {
                     before(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHeading_in_rule__Element__Alternatives912);
                    ruleHeading();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:465:6: ( ruleParagraph )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:465:6: ( ruleParagraph )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:466:1: ruleParagraph
                    {
                     before(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_rule__Element__Alternatives929);
                    ruleParagraph();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:471:6: ( ruleTextQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:471:6: ( ruleTextQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:472:1: ruleTextQuestion
                    {
                     before(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_rule__Element__Alternatives946);
                    ruleTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:477:6: ( ruleChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:477:6: ( ruleChoiceQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:478:1: ruleChoiceQuestion
                    {
                     before(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_rule__Element__Alternatives963);
                    ruleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:483:6: ( ruleMatrixQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:483:6: ( ruleMatrixQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:484:1: ruleMatrixQuestion
                    {
                     before(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_rule__Element__Alternatives980);
                    ruleMatrixQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:489:6: ( ruleCalendarQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:489:6: ( ruleCalendarQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:490:1: ruleCalendarQuestion
                    {
                     before(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_rule__Element__Alternatives997);
                    ruleCalendarQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:495:6: ( ruleIntegerQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:495:6: ( ruleIntegerQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:496:1: ruleIntegerQuestion
                    {
                     before(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_rule__Element__Alternatives1014);
                    ruleIntegerQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:506:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:510:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:511:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:511:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:512:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1046); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:517:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:517:6: ( RULE_ID )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:518:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1063); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TextQuestion__Alternatives_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:528:1: rule__TextQuestion__Alternatives_2 : ( ( ( rule__TextQuestion__MultilineAssignment_2_0 ) ) | ( 'short' ) );
    public final void rule__TextQuestion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:532:1: ( ( ( rule__TextQuestion__MultilineAssignment_2_0 ) ) | ( 'short' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:533:1: ( ( rule__TextQuestion__MultilineAssignment_2_0 ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:533:1: ( ( rule__TextQuestion__MultilineAssignment_2_0 ) )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:534:1: ( rule__TextQuestion__MultilineAssignment_2_0 )
                    {
                     before(grammarAccess.getTextQuestionAccess().getMultilineAssignment_2_0()); 
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:535:1: ( rule__TextQuestion__MultilineAssignment_2_0 )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:535:2: rule__TextQuestion__MultilineAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__MultilineAssignment_2_0_in_rule__TextQuestion__Alternatives_21095);
                    rule__TextQuestion__MultilineAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextQuestionAccess().getMultilineAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:539:6: ( 'short' )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:539:6: ( 'short' )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:540:1: 'short'
                    {
                     before(grammarAccess.getTextQuestionAccess().getShortKeyword_2_1()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__TextQuestion__Alternatives_21114); 
                     after(grammarAccess.getTextQuestionAccess().getShortKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Alternatives_2"


    // $ANTLR start "rule__ChoiceQuestion__Alternatives_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:552:1: rule__ChoiceQuestion__Alternatives_2 : ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) ) | ( ( rule__ChoiceQuestion__Group_2_1__0 ) ) );
    public final void rule__ChoiceQuestion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:556:1: ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) ) | ( ( rule__ChoiceQuestion__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==17) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==19) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_INT) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==17) ) {
                    alt4=1;
                }
                else if ( (LA4_2==19) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:557:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:557:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:558:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 )
                    {
                     before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_0()); 
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:559:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:559:2: rule__ChoiceQuestion__MinSelectionsAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_0_in_rule__ChoiceQuestion__Alternatives_21148);
                    rule__ChoiceQuestion__MinSelectionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:563:6: ( ( rule__ChoiceQuestion__Group_2_1__0 ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:563:6: ( ( rule__ChoiceQuestion__Group_2_1__0 ) )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:564:1: ( rule__ChoiceQuestion__Group_2_1__0 )
                    {
                     before(grammarAccess.getChoiceQuestionAccess().getGroup_2_1()); 
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:565:1: ( rule__ChoiceQuestion__Group_2_1__0 )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:565:2: rule__ChoiceQuestion__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__0_in_rule__ChoiceQuestion__Alternatives_21166);
                    rule__ChoiceQuestion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoiceQuestionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Alternatives_2"


    // $ANTLR start "rule__Questionaire__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:577:1: rule__Questionaire__Group__0 : rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 ;
    public final void rule__Questionaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:581:1: ( rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:582:2: rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__01198);
            rule__Questionaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__01201);
            rule__Questionaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__0"


    // $ANTLR start "rule__Questionaire__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:589:1: rule__Questionaire__Group__0__Impl : ( ( rule__Questionaire__NameAssignment_0 ) ) ;
    public final void rule__Questionaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:593:1: ( ( ( rule__Questionaire__NameAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:594:1: ( ( rule__Questionaire__NameAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:594:1: ( ( rule__Questionaire__NameAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:595:1: ( rule__Questionaire__NameAssignment_0 )
            {
             before(grammarAccess.getQuestionaireAccess().getNameAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:596:1: ( rule__Questionaire__NameAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:596:2: rule__Questionaire__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__NameAssignment_0_in_rule__Questionaire__Group__0__Impl1228);
            rule__Questionaire__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__0__Impl"


    // $ANTLR start "rule__Questionaire__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:606:1: rule__Questionaire__Group__1 : rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 ;
    public final void rule__Questionaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:610:1: ( rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:611:2: rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11258);
            rule__Questionaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11261);
            rule__Questionaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__1"


    // $ANTLR start "rule__Questionaire__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:618:1: rule__Questionaire__Group__1__Impl : ( 'email:' ) ;
    public final void rule__Questionaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:622:1: ( ( 'email:' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:623:1: ( 'email:' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:623:1: ( 'email:' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:624:1: 'email:'
            {
             before(grammarAccess.getQuestionaireAccess().getEmailKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Questionaire__Group__1__Impl1289); 
             after(grammarAccess.getQuestionaireAccess().getEmailKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__1__Impl"


    // $ANTLR start "rule__Questionaire__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:637:1: rule__Questionaire__Group__2 : rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 ;
    public final void rule__Questionaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:641:1: ( rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:642:2: rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21320);
            rule__Questionaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21323);
            rule__Questionaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__2"


    // $ANTLR start "rule__Questionaire__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:649:1: rule__Questionaire__Group__2__Impl : ( ( rule__Questionaire__ResultEmailAssignment_2 ) ) ;
    public final void rule__Questionaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:653:1: ( ( ( rule__Questionaire__ResultEmailAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:654:1: ( ( rule__Questionaire__ResultEmailAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:654:1: ( ( rule__Questionaire__ResultEmailAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:655:1: ( rule__Questionaire__ResultEmailAssignment_2 )
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:656:1: ( rule__Questionaire__ResultEmailAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:656:2: rule__Questionaire__ResultEmailAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ResultEmailAssignment_2_in_rule__Questionaire__Group__2__Impl1350);
            rule__Questionaire__ResultEmailAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__2__Impl"


    // $ANTLR start "rule__Questionaire__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:666:1: rule__Questionaire__Group__3 : rule__Questionaire__Group__3__Impl ;
    public final void rule__Questionaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:670:1: ( rule__Questionaire__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:671:2: rule__Questionaire__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31380);
            rule__Questionaire__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__3"


    // $ANTLR start "rule__Questionaire__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:677:1: rule__Questionaire__Group__3__Impl : ( ( rule__Questionaire__Group_3__0 )? ) ;
    public final void rule__Questionaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:681:1: ( ( ( rule__Questionaire__Group_3__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:682:1: ( ( rule__Questionaire__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:682:1: ( ( rule__Questionaire__Group_3__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:683:1: ( rule__Questionaire__Group_3__0 )?
            {
             before(grammarAccess.getQuestionaireAccess().getGroup_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:684:1: ( rule__Questionaire__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=15)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:684:2: rule__Questionaire__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__0_in_rule__Questionaire__Group__3__Impl1407);
                    rule__Questionaire__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionaireAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group__3__Impl"


    // $ANTLR start "rule__Questionaire__Group_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:702:1: rule__Questionaire__Group_3__0 : rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1 ;
    public final void rule__Questionaire__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:706:1: ( rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:707:2: rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__0__Impl_in_rule__Questionaire__Group_3__01446);
            rule__Questionaire__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__1_in_rule__Questionaire__Group_3__01449);
            rule__Questionaire__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group_3__0"


    // $ANTLR start "rule__Questionaire__Group_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:714:1: rule__Questionaire__Group_3__0__Impl : ( ( rule__Questionaire__ElementsAssignment_3_0 ) ) ;
    public final void rule__Questionaire__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:718:1: ( ( ( rule__Questionaire__ElementsAssignment_3_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:719:1: ( ( rule__Questionaire__ElementsAssignment_3_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:719:1: ( ( rule__Questionaire__ElementsAssignment_3_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:720:1: ( rule__Questionaire__ElementsAssignment_3_0 )
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:721:1: ( rule__Questionaire__ElementsAssignment_3_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:721:2: rule__Questionaire__ElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_3_0_in_rule__Questionaire__Group_3__0__Impl1476);
            rule__Questionaire__ElementsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group_3__0__Impl"


    // $ANTLR start "rule__Questionaire__Group_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:731:1: rule__Questionaire__Group_3__1 : rule__Questionaire__Group_3__1__Impl ;
    public final void rule__Questionaire__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:735:1: ( rule__Questionaire__Group_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:736:2: rule__Questionaire__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__1__Impl_in_rule__Questionaire__Group_3__11506);
            rule__Questionaire__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group_3__1"


    // $ANTLR start "rule__Questionaire__Group_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:742:1: rule__Questionaire__Group_3__1__Impl : ( ( rule__Questionaire__ElementsAssignment_3_1 )* ) ;
    public final void rule__Questionaire__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:746:1: ( ( ( rule__Questionaire__ElementsAssignment_3_1 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:747:1: ( ( rule__Questionaire__ElementsAssignment_3_1 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:747:1: ( ( rule__Questionaire__ElementsAssignment_3_1 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:748:1: ( rule__Questionaire__ElementsAssignment_3_1 )*
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:749:1: ( rule__Questionaire__ElementsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:749:2: rule__Questionaire__ElementsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_3_1_in_rule__Questionaire__Group_3__1__Impl1533);
            	    rule__Questionaire__ElementsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__Group_3__1__Impl"


    // $ANTLR start "rule__Heading__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:763:1: rule__Heading__Group__0 : rule__Heading__Group__0__Impl rule__Heading__Group__1 ;
    public final void rule__Heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:767:1: ( rule__Heading__Group__0__Impl rule__Heading__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:768:2: rule__Heading__Group__0__Impl rule__Heading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01568);
            rule__Heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01571);
            rule__Heading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group__0"


    // $ANTLR start "rule__Heading__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:775:1: rule__Heading__Group__0__Impl : ( '#' ) ;
    public final void rule__Heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:779:1: ( ( '#' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:780:1: ( '#' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:780:1: ( '#' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:781:1: '#'
            {
             before(grammarAccess.getHeadingAccess().getNumberSignKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Heading__Group__0__Impl1599); 
             after(grammarAccess.getHeadingAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group__0__Impl"


    // $ANTLR start "rule__Heading__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:794:1: rule__Heading__Group__1 : rule__Heading__Group__1__Impl ;
    public final void rule__Heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:798:1: ( rule__Heading__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:799:2: rule__Heading__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11630);
            rule__Heading__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group__1"


    // $ANTLR start "rule__Heading__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:805:1: rule__Heading__Group__1__Impl : ( ( rule__Heading__TextAssignment_1 ) ) ;
    public final void rule__Heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:809:1: ( ( ( rule__Heading__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:810:1: ( ( rule__Heading__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:810:1: ( ( rule__Heading__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:811:1: ( rule__Heading__TextAssignment_1 )
            {
             before(grammarAccess.getHeadingAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:812:1: ( rule__Heading__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:812:2: rule__Heading__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__TextAssignment_1_in_rule__Heading__Group__1__Impl1657);
            rule__Heading__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:826:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:830:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:831:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__01691);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__01694);
            rule__Paragraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:838:1: rule__Paragraph__Group__0__Impl : ( '!' ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:842:1: ( ( '!' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:843:1: ( '!' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:843:1: ( '!' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:844:1: '!'
            {
             before(grammarAccess.getParagraphAccess().getExclamationMarkKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Paragraph__Group__0__Impl1722); 
             after(grammarAccess.getParagraphAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:857:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:861:1: ( rule__Paragraph__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:862:2: rule__Paragraph__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__11753);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:868:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__TextAssignment_1 ) ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:872:1: ( ( ( rule__Paragraph__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:873:1: ( ( rule__Paragraph__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:873:1: ( ( rule__Paragraph__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:874:1: ( rule__Paragraph__TextAssignment_1 )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:875:1: ( rule__Paragraph__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:875:2: rule__Paragraph__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__TextAssignment_1_in_rule__Paragraph__Group__1__Impl1780);
            rule__Paragraph__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__QuestionBase__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:889:1: rule__QuestionBase__Group__0 : rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1 ;
    public final void rule__QuestionBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:893:1: ( rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:894:2: rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__0__Impl_in_rule__QuestionBase__Group__01814);
            rule__QuestionBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__1_in_rule__QuestionBase__Group__01817);
            rule__QuestionBase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__0"


    // $ANTLR start "rule__QuestionBase__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:901:1: rule__QuestionBase__Group__0__Impl : ( '?' ) ;
    public final void rule__QuestionBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:905:1: ( ( '?' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:906:1: ( '?' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:906:1: ( '?' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:907:1: '?'
            {
             before(grammarAccess.getQuestionBaseAccess().getQuestionMarkKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuestionBase__Group__0__Impl1845); 
             after(grammarAccess.getQuestionBaseAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__0__Impl"


    // $ANTLR start "rule__QuestionBase__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:920:1: rule__QuestionBase__Group__1 : rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2 ;
    public final void rule__QuestionBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:924:1: ( rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:925:2: rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__1__Impl_in_rule__QuestionBase__Group__11876);
            rule__QuestionBase__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__2_in_rule__QuestionBase__Group__11879);
            rule__QuestionBase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__1"


    // $ANTLR start "rule__QuestionBase__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:932:1: rule__QuestionBase__Group__1__Impl : ( ( rule__QuestionBase__TitleAssignment_1 ) ) ;
    public final void rule__QuestionBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:936:1: ( ( ( rule__QuestionBase__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:937:1: ( ( rule__QuestionBase__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:937:1: ( ( rule__QuestionBase__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:938:1: ( rule__QuestionBase__TitleAssignment_1 )
            {
             before(grammarAccess.getQuestionBaseAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:939:1: ( rule__QuestionBase__TitleAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:939:2: rule__QuestionBase__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__TitleAssignment_1_in_rule__QuestionBase__Group__1__Impl1906);
            rule__QuestionBase__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionBaseAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__1__Impl"


    // $ANTLR start "rule__QuestionBase__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:949:1: rule__QuestionBase__Group__2 : rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3 ;
    public final void rule__QuestionBase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:953:1: ( rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:954:2: rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__2__Impl_in_rule__QuestionBase__Group__21936);
            rule__QuestionBase__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__3_in_rule__QuestionBase__Group__21939);
            rule__QuestionBase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__2"


    // $ANTLR start "rule__QuestionBase__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:961:1: rule__QuestionBase__Group__2__Impl : ( ( rule__QuestionBase__MandatoryAssignment_2 )? ) ;
    public final void rule__QuestionBase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:965:1: ( ( ( rule__QuestionBase__MandatoryAssignment_2 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:966:1: ( ( rule__QuestionBase__MandatoryAssignment_2 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:966:1: ( ( rule__QuestionBase__MandatoryAssignment_2 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:967:1: ( rule__QuestionBase__MandatoryAssignment_2 )?
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:968:1: ( rule__QuestionBase__MandatoryAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:968:2: rule__QuestionBase__MandatoryAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__MandatoryAssignment_2_in_rule__QuestionBase__Group__2__Impl1966);
                    rule__QuestionBase__MandatoryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionBaseAccess().getMandatoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__2__Impl"


    // $ANTLR start "rule__QuestionBase__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:978:1: rule__QuestionBase__Group__3 : rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4 ;
    public final void rule__QuestionBase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:982:1: ( rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:983:2: rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__3__Impl_in_rule__QuestionBase__Group__31997);
            rule__QuestionBase__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__4_in_rule__QuestionBase__Group__32000);
            rule__QuestionBase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__3"


    // $ANTLR start "rule__QuestionBase__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:990:1: rule__QuestionBase__Group__3__Impl : ( ( rule__QuestionBase__DescriptionAssignment_3 )? ) ;
    public final void rule__QuestionBase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:994:1: ( ( ( rule__QuestionBase__DescriptionAssignment_3 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:995:1: ( ( rule__QuestionBase__DescriptionAssignment_3 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:995:1: ( ( rule__QuestionBase__DescriptionAssignment_3 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:996:1: ( rule__QuestionBase__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getQuestionBaseAccess().getDescriptionAssignment_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:997:1: ( rule__QuestionBase__DescriptionAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:997:2: rule__QuestionBase__DescriptionAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__DescriptionAssignment_3_in_rule__QuestionBase__Group__3__Impl2027);
                    rule__QuestionBase__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionBaseAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__3__Impl"


    // $ANTLR start "rule__QuestionBase__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1007:1: rule__QuestionBase__Group__4 : rule__QuestionBase__Group__4__Impl ;
    public final void rule__QuestionBase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1011:1: ( rule__QuestionBase__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1012:2: rule__QuestionBase__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__4__Impl_in_rule__QuestionBase__Group__42058);
            rule__QuestionBase__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__4"


    // $ANTLR start "rule__QuestionBase__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1018:1: rule__QuestionBase__Group__4__Impl : ( ( rule__QuestionBase__ConditionsAssignment_4 )* ) ;
    public final void rule__QuestionBase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1022:1: ( ( ( rule__QuestionBase__ConditionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1023:1: ( ( rule__QuestionBase__ConditionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1023:1: ( ( rule__QuestionBase__ConditionsAssignment_4 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1024:1: ( rule__QuestionBase__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getQuestionBaseAccess().getConditionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1025:1: ( rule__QuestionBase__ConditionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1025:2: rule__QuestionBase__ConditionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__ConditionsAssignment_4_in_rule__QuestionBase__Group__4__Impl2085);
            	    rule__QuestionBase__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuestionBaseAccess().getConditionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__Group__4__Impl"


    // $ANTLR start "rule__TextQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1045:1: rule__TextQuestion__Group__0 : rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 ;
    public final void rule__TextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1049:1: ( rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1050:2: rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02126);
            rule__TextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02129);
            rule__TextQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__0"


    // $ANTLR start "rule__TextQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1057:1: rule__TextQuestion__Group__0__Impl : ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__TextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1061:1: ( ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1062:1: ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1062:1: ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1063:1: ( rule__TextQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1064:1: ( rule__TextQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1064:2: rule__TextQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__QuestionBaseAssignment_0_in_rule__TextQuestion__Group__0__Impl2156);
            rule__TextQuestion__QuestionBaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getQuestionBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1074:1: rule__TextQuestion__Group__1 : rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 ;
    public final void rule__TextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1078:1: ( rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1079:2: rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12186);
            rule__TextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12189);
            rule__TextQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__1"


    // $ANTLR start "rule__TextQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1086:1: rule__TextQuestion__Group__1__Impl : ( 'text[' ) ;
    public final void rule__TextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1090:1: ( ( 'text[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1091:1: ( 'text[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1091:1: ( 'text[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1092:1: 'text['
            {
             before(grammarAccess.getTextQuestionAccess().getTextKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TextQuestion__Group__1__Impl2217); 
             after(grammarAccess.getTextQuestionAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__1__Impl"


    // $ANTLR start "rule__TextQuestion__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1105:1: rule__TextQuestion__Group__2 : rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 ;
    public final void rule__TextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1109:1: ( rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1110:2: rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22248);
            rule__TextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22251);
            rule__TextQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__2"


    // $ANTLR start "rule__TextQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1117:1: rule__TextQuestion__Group__2__Impl : ( ( rule__TextQuestion__Alternatives_2 ) ) ;
    public final void rule__TextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1121:1: ( ( ( rule__TextQuestion__Alternatives_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1122:1: ( ( rule__TextQuestion__Alternatives_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1122:1: ( ( rule__TextQuestion__Alternatives_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1123:1: ( rule__TextQuestion__Alternatives_2 )
            {
             before(grammarAccess.getTextQuestionAccess().getAlternatives_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1124:1: ( rule__TextQuestion__Alternatives_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1124:2: rule__TextQuestion__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Alternatives_2_in_rule__TextQuestion__Group__2__Impl2278);
            rule__TextQuestion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__2__Impl"


    // $ANTLR start "rule__TextQuestion__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1134:1: rule__TextQuestion__Group__3 : rule__TextQuestion__Group__3__Impl ;
    public final void rule__TextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1138:1: ( rule__TextQuestion__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1139:2: rule__TextQuestion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32308);
            rule__TextQuestion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__3"


    // $ANTLR start "rule__TextQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1145:1: rule__TextQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__TextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1149:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1150:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1150:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1151:1: ']'
            {
             before(grammarAccess.getTextQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TextQuestion__Group__3__Impl2336); 
             after(grammarAccess.getTextQuestionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__Group__3__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1172:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1176:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1177:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02375);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02378);
            rule__ChoiceQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0"


    // $ANTLR start "rule__ChoiceQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1184:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1188:1: ( ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1189:1: ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1189:1: ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1190:1: ( rule__ChoiceQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1191:1: ( rule__ChoiceQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1191:2: rule__ChoiceQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__QuestionBaseAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2405);
            rule__ChoiceQuestion__QuestionBaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getQuestionBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1201:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1205:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1206:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12435);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12438);
            rule__ChoiceQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1"


    // $ANTLR start "rule__ChoiceQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1213:1: rule__ChoiceQuestion__Group__1__Impl : ( 'choice[' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1217:1: ( ( 'choice[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1218:1: ( 'choice[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1218:1: ( 'choice[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1219:1: 'choice['
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ChoiceQuestion__Group__1__Impl2466); 
             after(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1232:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1236:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1237:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22497);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22500);
            rule__ChoiceQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2"


    // $ANTLR start "rule__ChoiceQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1244:1: rule__ChoiceQuestion__Group__2__Impl : ( ( rule__ChoiceQuestion__Alternatives_2 ) ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1248:1: ( ( ( rule__ChoiceQuestion__Alternatives_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1249:1: ( ( rule__ChoiceQuestion__Alternatives_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1249:1: ( ( rule__ChoiceQuestion__Alternatives_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1250:1: ( rule__ChoiceQuestion__Alternatives_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getAlternatives_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1251:1: ( rule__ChoiceQuestion__Alternatives_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1251:2: rule__ChoiceQuestion__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Alternatives_2_in_rule__ChoiceQuestion__Group__2__Impl2527);
            rule__ChoiceQuestion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1261:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1265:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1266:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32557);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32560);
            rule__ChoiceQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3"


    // $ANTLR start "rule__ChoiceQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1273:1: rule__ChoiceQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1277:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1278:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1278:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1279:1: ']'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ChoiceQuestion__Group__3__Impl2588); 
             after(grammarAccess.getChoiceQuestionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1292:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1296:1: ( rule__ChoiceQuestion__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1297:2: rule__ChoiceQuestion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42619);
            rule__ChoiceQuestion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4"


    // $ANTLR start "rule__ChoiceQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1303:1: rule__ChoiceQuestion__Group__4__Impl : ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1307:1: ( ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1308:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1308:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1309:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1309:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1310:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1311:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1311:2: rule__ChoiceQuestion__OptionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2648);
            rule__ChoiceQuestion__OptionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 

            }

            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1314:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1315:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1316:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1316:2: rule__ChoiceQuestion__OptionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2660);
            	    rule__ChoiceQuestion__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1337:1: rule__ChoiceQuestion__Group_2_1__0 : rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1 ;
    public final void rule__ChoiceQuestion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1341:1: ( rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1342:2: rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__0__Impl_in_rule__ChoiceQuestion__Group_2_1__02703);
            rule__ChoiceQuestion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__1_in_rule__ChoiceQuestion__Group_2_1__02706);
            rule__ChoiceQuestion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1349:1: rule__ChoiceQuestion__Group_2_1__0__Impl : ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) ) ;
    public final void rule__ChoiceQuestion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1353:1: ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1354:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1354:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1355:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1356:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1356:2: rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0_in_rule__ChoiceQuestion__Group_2_1__0__Impl2733);
            rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1366:1: rule__ChoiceQuestion__Group_2_1__1 : rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2 ;
    public final void rule__ChoiceQuestion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1370:1: ( rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1371:2: rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__1__Impl_in_rule__ChoiceQuestion__Group_2_1__12763);
            rule__ChoiceQuestion__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__2_in_rule__ChoiceQuestion__Group_2_1__12766);
            rule__ChoiceQuestion__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1378:1: rule__ChoiceQuestion__Group_2_1__1__Impl : ( 'to' ) ;
    public final void rule__ChoiceQuestion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1382:1: ( ( 'to' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1383:1: ( 'to' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1383:1: ( 'to' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1384:1: 'to'
            {
             before(grammarAccess.getChoiceQuestionAccess().getToKeyword_2_1_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ChoiceQuestion__Group_2_1__1__Impl2794); 
             after(grammarAccess.getChoiceQuestionAccess().getToKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1397:1: rule__ChoiceQuestion__Group_2_1__2 : rule__ChoiceQuestion__Group_2_1__2__Impl ;
    public final void rule__ChoiceQuestion__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1401:1: ( rule__ChoiceQuestion__Group_2_1__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1402:2: rule__ChoiceQuestion__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__2__Impl_in_rule__ChoiceQuestion__Group_2_1__22825);
            rule__ChoiceQuestion__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__2"


    // $ANTLR start "rule__ChoiceQuestion__Group_2_1__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1408:1: rule__ChoiceQuestion__Group_2_1__2__Impl : ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) ) ;
    public final void rule__ChoiceQuestion__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1412:1: ( ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1413:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1413:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1414:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_2_1_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1415:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1415:2: rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2_in_rule__ChoiceQuestion__Group_2_1__2__Impl2852);
            rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group_2_1__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1431:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1435:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1436:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02888);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02891);
            rule__MatrixQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__0"


    // $ANTLR start "rule__MatrixQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1443:1: rule__MatrixQuestion__Group__0__Impl : ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1447:1: ( ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1448:1: ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1448:1: ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1449:1: ( rule__MatrixQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1450:1: ( rule__MatrixQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1450:2: rule__MatrixQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__QuestionBaseAssignment_0_in_rule__MatrixQuestion__Group__0__Impl2918);
            rule__MatrixQuestion__QuestionBaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getQuestionBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1460:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1464:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1465:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12948);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12951);
            rule__MatrixQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__1"


    // $ANTLR start "rule__MatrixQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1472:1: rule__MatrixQuestion__Group__1__Impl : ( 'matrix[' ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1476:1: ( ( 'matrix[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1477:1: ( 'matrix[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1477:1: ( 'matrix[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1478:1: 'matrix['
            {
             before(grammarAccess.getMatrixQuestionAccess().getMatrixKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MatrixQuestion__Group__1__Impl2979); 
             after(grammarAccess.getMatrixQuestionAccess().getMatrixKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1491:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1495:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1496:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__23010);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__23013);
            rule__MatrixQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__2"


    // $ANTLR start "rule__MatrixQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1503:1: rule__MatrixQuestion__Group__2__Impl : ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1507:1: ( ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1508:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1508:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1509:1: ( rule__MatrixQuestion__MaxPerRowAssignment_2 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1510:1: ( rule__MatrixQuestion__MaxPerRowAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1510:2: rule__MatrixQuestion__MaxPerRowAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_2_in_rule__MatrixQuestion__Group__2__Impl3040);
            rule__MatrixQuestion__MaxPerRowAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1520:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1524:1: ( rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1525:2: rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__33070);
            rule__MatrixQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__33073);
            rule__MatrixQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__3"


    // $ANTLR start "rule__MatrixQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1532:1: rule__MatrixQuestion__Group__3__Impl : ( '][' ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1536:1: ( ( '][' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1537:1: ( '][' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1537:1: ( '][' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1538:1: ']['
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MatrixQuestion__Group__3__Impl3101); 
             after(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__3__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1551:1: rule__MatrixQuestion__Group__4 : rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 ;
    public final void rule__MatrixQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1555:1: ( rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1556:2: rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__43132);
            rule__MatrixQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__43135);
            rule__MatrixQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__4"


    // $ANTLR start "rule__MatrixQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1563:1: rule__MatrixQuestion__Group__4__Impl : ( ( rule__MatrixQuestion__Group_4__0 )? ) ;
    public final void rule__MatrixQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1567:1: ( ( ( rule__MatrixQuestion__Group_4__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1568:1: ( ( rule__MatrixQuestion__Group_4__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1568:1: ( ( rule__MatrixQuestion__Group_4__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1569:1: ( rule__MatrixQuestion__Group_4__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1570:1: ( rule__MatrixQuestion__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1570:2: rule__MatrixQuestion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__0_in_rule__MatrixQuestion__Group__4__Impl3162);
                    rule__MatrixQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__4__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1580:1: rule__MatrixQuestion__Group__5 : rule__MatrixQuestion__Group__5__Impl ;
    public final void rule__MatrixQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1584:1: ( rule__MatrixQuestion__Group__5__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1585:2: rule__MatrixQuestion__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__53193);
            rule__MatrixQuestion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__5"


    // $ANTLR start "rule__MatrixQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1591:1: rule__MatrixQuestion__Group__5__Impl : ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) ) ;
    public final void rule__MatrixQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1595:1: ( ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1596:1: ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1596:1: ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1597:1: ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1597:1: ( ( rule__MatrixQuestion__Group_5__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1598:1: ( rule__MatrixQuestion__Group_5__0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1599:1: ( rule__MatrixQuestion__Group_5__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1599:2: rule__MatrixQuestion__Group_5__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3222);
            rule__MatrixQuestion__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 

            }

            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1602:1: ( ( rule__MatrixQuestion__Group_5__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1603:1: ( rule__MatrixQuestion__Group_5__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1604:1: ( rule__MatrixQuestion__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1604:2: rule__MatrixQuestion__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3234);
            	    rule__MatrixQuestion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group__5__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_4__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1627:1: rule__MatrixQuestion__Group_4__0 : rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1 ;
    public final void rule__MatrixQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1631:1: ( rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1632:2: rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__0__Impl_in_rule__MatrixQuestion__Group_4__03279);
            rule__MatrixQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__1_in_rule__MatrixQuestion__Group_4__03282);
            rule__MatrixQuestion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__0"


    // $ANTLR start "rule__MatrixQuestion__Group_4__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1639:1: rule__MatrixQuestion__Group_4__0__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) ) ;
    public final void rule__MatrixQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1643:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1644:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1644:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1645:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1646:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1646:2: rule__MatrixQuestion__ColumnNamesAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_0_in_rule__MatrixQuestion__Group_4__0__Impl3309);
            rule__MatrixQuestion__ColumnNamesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_4__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1656:1: rule__MatrixQuestion__Group_4__1 : rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2 ;
    public final void rule__MatrixQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1660:1: ( rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1661:2: rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__1__Impl_in_rule__MatrixQuestion__Group_4__13339);
            rule__MatrixQuestion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__2_in_rule__MatrixQuestion__Group_4__13342);
            rule__MatrixQuestion__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__1"


    // $ANTLR start "rule__MatrixQuestion__Group_4__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1668:1: rule__MatrixQuestion__Group_4__1__Impl : ( ( rule__MatrixQuestion__Group_4_1__0 )* ) ;
    public final void rule__MatrixQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1672:1: ( ( ( rule__MatrixQuestion__Group_4_1__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1673:1: ( ( rule__MatrixQuestion__Group_4_1__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1673:1: ( ( rule__MatrixQuestion__Group_4_1__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1674:1: ( rule__MatrixQuestion__Group_4_1__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_4_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1675:1: ( rule__MatrixQuestion__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1675:2: rule__MatrixQuestion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__0_in_rule__MatrixQuestion__Group_4__1__Impl3369);
            	    rule__MatrixQuestion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMatrixQuestionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_4__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1685:1: rule__MatrixQuestion__Group_4__2 : rule__MatrixQuestion__Group_4__2__Impl ;
    public final void rule__MatrixQuestion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1689:1: ( rule__MatrixQuestion__Group_4__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1690:2: rule__MatrixQuestion__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__2__Impl_in_rule__MatrixQuestion__Group_4__23400);
            rule__MatrixQuestion__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__2"


    // $ANTLR start "rule__MatrixQuestion__Group_4__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1696:1: rule__MatrixQuestion__Group_4__2__Impl : ( ']' ) ;
    public final void rule__MatrixQuestion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1700:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1701:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1701:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1702:1: ']'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MatrixQuestion__Group_4__2__Impl3428); 
             after(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_4_1__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1721:1: rule__MatrixQuestion__Group_4_1__0 : rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1 ;
    public final void rule__MatrixQuestion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1725:1: ( rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1726:2: rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__0__Impl_in_rule__MatrixQuestion__Group_4_1__03465);
            rule__MatrixQuestion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__1_in_rule__MatrixQuestion__Group_4_1__03468);
            rule__MatrixQuestion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4_1__0"


    // $ANTLR start "rule__MatrixQuestion__Group_4_1__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1733:1: rule__MatrixQuestion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MatrixQuestion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1737:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1738:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1738:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1739:1: ','
            {
             before(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MatrixQuestion__Group_4_1__0__Impl3496); 
             after(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4_1__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_4_1__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1752:1: rule__MatrixQuestion__Group_4_1__1 : rule__MatrixQuestion__Group_4_1__1__Impl ;
    public final void rule__MatrixQuestion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1756:1: ( rule__MatrixQuestion__Group_4_1__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1757:2: rule__MatrixQuestion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__1__Impl_in_rule__MatrixQuestion__Group_4_1__13527);
            rule__MatrixQuestion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4_1__1"


    // $ANTLR start "rule__MatrixQuestion__Group_4_1__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1763:1: rule__MatrixQuestion__Group_4_1__1__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) ) ;
    public final void rule__MatrixQuestion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1767:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1768:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1768:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1769:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_1_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1770:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1770:2: rule__MatrixQuestion__ColumnNamesAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_1_1_in_rule__MatrixQuestion__Group_4_1__1__Impl3554);
            rule__MatrixQuestion__ColumnNamesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_4_1__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_5__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1784:1: rule__MatrixQuestion__Group_5__0 : rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1 ;
    public final void rule__MatrixQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1788:1: ( rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1789:2: rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0__Impl_in_rule__MatrixQuestion__Group_5__03588);
            rule__MatrixQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__1_in_rule__MatrixQuestion__Group_5__03591);
            rule__MatrixQuestion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_5__0"


    // $ANTLR start "rule__MatrixQuestion__Group_5__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1796:1: rule__MatrixQuestion__Group_5__0__Impl : ( '-' ) ;
    public final void rule__MatrixQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1800:1: ( ( '-' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1801:1: ( '-' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1801:1: ( '-' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1802:1: '-'
            {
             before(grammarAccess.getMatrixQuestionAccess().getHyphenMinusKeyword_5_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MatrixQuestion__Group_5__0__Impl3619); 
             after(grammarAccess.getMatrixQuestionAccess().getHyphenMinusKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_5__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_5__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1815:1: rule__MatrixQuestion__Group_5__1 : rule__MatrixQuestion__Group_5__1__Impl ;
    public final void rule__MatrixQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1819:1: ( rule__MatrixQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1820:2: rule__MatrixQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__1__Impl_in_rule__MatrixQuestion__Group_5__13650);
            rule__MatrixQuestion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_5__1"


    // $ANTLR start "rule__MatrixQuestion__Group_5__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1826:1: rule__MatrixQuestion__Group_5__1__Impl : ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) ) ;
    public final void rule__MatrixQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1830:1: ( ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1831:1: ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1831:1: ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1832:1: ( rule__MatrixQuestion__RowNamesAssignment_5_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_5_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1833:1: ( rule__MatrixQuestion__RowNamesAssignment_5_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1833:2: rule__MatrixQuestion__RowNamesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__RowNamesAssignment_5_1_in_rule__MatrixQuestion__Group_5__1__Impl3677);
            rule__MatrixQuestion__RowNamesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__Group_5__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1847:1: rule__CalendarQuestion__Group__0 : rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 ;
    public final void rule__CalendarQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1851:1: ( rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1852:2: rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__03711);
            rule__CalendarQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__03714);
            rule__CalendarQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__0"


    // $ANTLR start "rule__CalendarQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1859:1: rule__CalendarQuestion__Group__0__Impl : ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__CalendarQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1863:1: ( ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1864:1: ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1864:1: ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1865:1: ( rule__CalendarQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1866:1: ( rule__CalendarQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1866:2: rule__CalendarQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__QuestionBaseAssignment_0_in_rule__CalendarQuestion__Group__0__Impl3741);
            rule__CalendarQuestion__QuestionBaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getQuestionBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__0__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1876:1: rule__CalendarQuestion__Group__1 : rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 ;
    public final void rule__CalendarQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1880:1: ( rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1881:2: rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__13771);
            rule__CalendarQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__13774);
            rule__CalendarQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__1"


    // $ANTLR start "rule__CalendarQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1888:1: rule__CalendarQuestion__Group__1__Impl : ( 'calendar[' ) ;
    public final void rule__CalendarQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1892:1: ( ( 'calendar[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1893:1: ( 'calendar[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1893:1: ( 'calendar[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1894:1: 'calendar['
            {
             before(grammarAccess.getCalendarQuestionAccess().getCalendarKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__CalendarQuestion__Group__1__Impl3802); 
             after(grammarAccess.getCalendarQuestionAccess().getCalendarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1907:1: rule__CalendarQuestion__Group__2 : rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 ;
    public final void rule__CalendarQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1911:1: ( rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1912:2: rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__23833);
            rule__CalendarQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__23836);
            rule__CalendarQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__2"


    // $ANTLR start "rule__CalendarQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1919:1: rule__CalendarQuestion__Group__2__Impl : ( ( rule__CalendarQuestion__Group_2__0 ) ) ;
    public final void rule__CalendarQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1923:1: ( ( ( rule__CalendarQuestion__Group_2__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1924:1: ( ( rule__CalendarQuestion__Group_2__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1924:1: ( ( rule__CalendarQuestion__Group_2__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1925:1: ( rule__CalendarQuestion__Group_2__0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1926:1: ( rule__CalendarQuestion__Group_2__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1926:2: rule__CalendarQuestion__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__0_in_rule__CalendarQuestion__Group__2__Impl3863);
            rule__CalendarQuestion__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__2__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1936:1: rule__CalendarQuestion__Group__3 : rule__CalendarQuestion__Group__3__Impl ;
    public final void rule__CalendarQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1940:1: ( rule__CalendarQuestion__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1941:2: rule__CalendarQuestion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__33893);
            rule__CalendarQuestion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__3"


    // $ANTLR start "rule__CalendarQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1947:1: rule__CalendarQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__CalendarQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1951:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1952:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1952:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1953:1: ']'
            {
             before(grammarAccess.getCalendarQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CalendarQuestion__Group__3__Impl3921); 
             after(grammarAccess.getCalendarQuestionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group__3__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1974:1: rule__CalendarQuestion__Group_2__0 : rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1 ;
    public final void rule__CalendarQuestion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1978:1: ( rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1979:2: rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__0__Impl_in_rule__CalendarQuestion__Group_2__03960);
            rule__CalendarQuestion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__1_in_rule__CalendarQuestion__Group_2__03963);
            rule__CalendarQuestion__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__0"


    // $ANTLR start "rule__CalendarQuestion__Group_2__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1986:1: rule__CalendarQuestion__Group_2__0__Impl : ( ( rule__CalendarQuestion__YearAssignment_2_0 )? ) ;
    public final void rule__CalendarQuestion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1990:1: ( ( ( rule__CalendarQuestion__YearAssignment_2_0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1991:1: ( ( rule__CalendarQuestion__YearAssignment_2_0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1991:1: ( ( rule__CalendarQuestion__YearAssignment_2_0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1992:1: ( rule__CalendarQuestion__YearAssignment_2_0 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearAssignment_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1993:1: ( rule__CalendarQuestion__YearAssignment_2_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1993:2: rule__CalendarQuestion__YearAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__YearAssignment_2_0_in_rule__CalendarQuestion__Group_2__0__Impl3990);
                    rule__CalendarQuestion__YearAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getYearAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__0__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2003:1: rule__CalendarQuestion__Group_2__1 : rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2 ;
    public final void rule__CalendarQuestion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2007:1: ( rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2008:2: rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__1__Impl_in_rule__CalendarQuestion__Group_2__14021);
            rule__CalendarQuestion__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__2_in_rule__CalendarQuestion__Group_2__14024);
            rule__CalendarQuestion__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__1"


    // $ANTLR start "rule__CalendarQuestion__Group_2__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2015:1: rule__CalendarQuestion__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2019:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2020:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2020:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2021:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2022:1: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2023:2: ','
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CalendarQuestion__Group_2__1__Impl4053); 

                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2034:1: rule__CalendarQuestion__Group_2__2 : rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3 ;
    public final void rule__CalendarQuestion__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2038:1: ( rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2039:2: rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__2__Impl_in_rule__CalendarQuestion__Group_2__24086);
            rule__CalendarQuestion__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__3_in_rule__CalendarQuestion__Group_2__24089);
            rule__CalendarQuestion__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__2"


    // $ANTLR start "rule__CalendarQuestion__Group_2__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2046:1: rule__CalendarQuestion__Group_2__2__Impl : ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? ) ;
    public final void rule__CalendarQuestion__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2050:1: ( ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2051:1: ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2051:1: ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2052:1: ( rule__CalendarQuestion__MonthAssignment_2_2 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2053:1: ( rule__CalendarQuestion__MonthAssignment_2_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2053:2: rule__CalendarQuestion__MonthAssignment_2_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MonthAssignment_2_2_in_rule__CalendarQuestion__Group_2__2__Impl4116);
                    rule__CalendarQuestion__MonthAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__2__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2063:1: rule__CalendarQuestion__Group_2__3 : rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4 ;
    public final void rule__CalendarQuestion__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2067:1: ( rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2068:2: rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__3__Impl_in_rule__CalendarQuestion__Group_2__34147);
            rule__CalendarQuestion__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__4_in_rule__CalendarQuestion__Group_2__34150);
            rule__CalendarQuestion__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__3"


    // $ANTLR start "rule__CalendarQuestion__Group_2__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2075:1: rule__CalendarQuestion__Group_2__3__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2079:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2080:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2080:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2081:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2082:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2083:2: ','
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CalendarQuestion__Group_2__3__Impl4179); 

                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__3__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2094:1: rule__CalendarQuestion__Group_2__4 : rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5 ;
    public final void rule__CalendarQuestion__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2098:1: ( rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2099:2: rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__4__Impl_in_rule__CalendarQuestion__Group_2__44212);
            rule__CalendarQuestion__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__5_in_rule__CalendarQuestion__Group_2__44215);
            rule__CalendarQuestion__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__4"


    // $ANTLR start "rule__CalendarQuestion__Group_2__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2106:1: rule__CalendarQuestion__Group_2__4__Impl : ( ( rule__CalendarQuestion__DayAssignment_2_4 )? ) ;
    public final void rule__CalendarQuestion__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2110:1: ( ( ( rule__CalendarQuestion__DayAssignment_2_4 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2111:1: ( ( rule__CalendarQuestion__DayAssignment_2_4 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2111:1: ( ( rule__CalendarQuestion__DayAssignment_2_4 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2112:1: ( rule__CalendarQuestion__DayAssignment_2_4 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayAssignment_2_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2113:1: ( rule__CalendarQuestion__DayAssignment_2_4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2113:2: rule__CalendarQuestion__DayAssignment_2_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__DayAssignment_2_4_in_rule__CalendarQuestion__Group_2__4__Impl4242);
                    rule__CalendarQuestion__DayAssignment_2_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getDayAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__4__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2123:1: rule__CalendarQuestion__Group_2__5 : rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6 ;
    public final void rule__CalendarQuestion__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2127:1: ( rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2128:2: rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__5__Impl_in_rule__CalendarQuestion__Group_2__54273);
            rule__CalendarQuestion__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__6_in_rule__CalendarQuestion__Group_2__54276);
            rule__CalendarQuestion__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__5"


    // $ANTLR start "rule__CalendarQuestion__Group_2__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2135:1: rule__CalendarQuestion__Group_2__5__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2139:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2140:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2140:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2141:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2142:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2143:2: ','
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CalendarQuestion__Group_2__5__Impl4305); 

                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__5__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2154:1: rule__CalendarQuestion__Group_2__6 : rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7 ;
    public final void rule__CalendarQuestion__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2158:1: ( rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2159:2: rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__6__Impl_in_rule__CalendarQuestion__Group_2__64338);
            rule__CalendarQuestion__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__7_in_rule__CalendarQuestion__Group_2__64341);
            rule__CalendarQuestion__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__6"


    // $ANTLR start "rule__CalendarQuestion__Group_2__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2166:1: rule__CalendarQuestion__Group_2__6__Impl : ( ( rule__CalendarQuestion__HourAssignment_2_6 )? ) ;
    public final void rule__CalendarQuestion__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2170:1: ( ( ( rule__CalendarQuestion__HourAssignment_2_6 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2171:1: ( ( rule__CalendarQuestion__HourAssignment_2_6 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2171:1: ( ( rule__CalendarQuestion__HourAssignment_2_6 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2172:1: ( rule__CalendarQuestion__HourAssignment_2_6 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourAssignment_2_6()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2173:1: ( rule__CalendarQuestion__HourAssignment_2_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2173:2: rule__CalendarQuestion__HourAssignment_2_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__HourAssignment_2_6_in_rule__CalendarQuestion__Group_2__6__Impl4368);
                    rule__CalendarQuestion__HourAssignment_2_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getHourAssignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__6__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2183:1: rule__CalendarQuestion__Group_2__7 : rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8 ;
    public final void rule__CalendarQuestion__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2187:1: ( rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2188:2: rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__7__Impl_in_rule__CalendarQuestion__Group_2__74399);
            rule__CalendarQuestion__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__8_in_rule__CalendarQuestion__Group_2__74402);
            rule__CalendarQuestion__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__7"


    // $ANTLR start "rule__CalendarQuestion__Group_2__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2195:1: rule__CalendarQuestion__Group_2__7__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2199:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2200:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2200:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2201:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2202:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2203:2: ','
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__CalendarQuestion__Group_2__7__Impl4431); 

                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__7__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_2__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2214:1: rule__CalendarQuestion__Group_2__8 : rule__CalendarQuestion__Group_2__8__Impl ;
    public final void rule__CalendarQuestion__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2218:1: ( rule__CalendarQuestion__Group_2__8__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2219:2: rule__CalendarQuestion__Group_2__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__8__Impl_in_rule__CalendarQuestion__Group_2__84464);
            rule__CalendarQuestion__Group_2__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__8"


    // $ANTLR start "rule__CalendarQuestion__Group_2__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2225:1: rule__CalendarQuestion__Group_2__8__Impl : ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? ) ;
    public final void rule__CalendarQuestion__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2229:1: ( ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2230:1: ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2230:1: ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2231:1: ( rule__CalendarQuestion__MinuteAssignment_2_8 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_2_8()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2232:1: ( rule__CalendarQuestion__MinuteAssignment_2_8 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2232:2: rule__CalendarQuestion__MinuteAssignment_2_8
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MinuteAssignment_2_8_in_rule__CalendarQuestion__Group_2__8__Impl4491);
                    rule__CalendarQuestion__MinuteAssignment_2_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__Group_2__8__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2260:1: rule__IntegerQuestion__Group__0 : rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 ;
    public final void rule__IntegerQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2264:1: ( rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2265:2: rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__04540);
            rule__IntegerQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__04543);
            rule__IntegerQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__0"


    // $ANTLR start "rule__IntegerQuestion__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2272:1: rule__IntegerQuestion__Group__0__Impl : ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__IntegerQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2276:1: ( ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2277:1: ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2277:1: ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2278:1: ( rule__IntegerQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2279:1: ( rule__IntegerQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2279:2: rule__IntegerQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__QuestionBaseAssignment_0_in_rule__IntegerQuestion__Group__0__Impl4570);
            rule__IntegerQuestion__QuestionBaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getQuestionBaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__0__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2289:1: rule__IntegerQuestion__Group__1 : rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 ;
    public final void rule__IntegerQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2293:1: ( rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2294:2: rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__14600);
            rule__IntegerQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__14603);
            rule__IntegerQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__1"


    // $ANTLR start "rule__IntegerQuestion__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2301:1: rule__IntegerQuestion__Group__1__Impl : ( 'number[' ) ;
    public final void rule__IntegerQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2305:1: ( ( 'number[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2306:1: ( 'number[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2306:1: ( 'number[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2307:1: 'number['
            {
             before(grammarAccess.getIntegerQuestionAccess().getNumberKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntegerQuestion__Group__1__Impl4631); 
             after(grammarAccess.getIntegerQuestionAccess().getNumberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__1__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2320:1: rule__IntegerQuestion__Group__2 : rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 ;
    public final void rule__IntegerQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2324:1: ( rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2325:2: rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__24662);
            rule__IntegerQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__24665);
            rule__IntegerQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__2"


    // $ANTLR start "rule__IntegerQuestion__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2332:1: rule__IntegerQuestion__Group__2__Impl : ( ( rule__IntegerQuestion__MinValueAssignment_2 ) ) ;
    public final void rule__IntegerQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2336:1: ( ( ( rule__IntegerQuestion__MinValueAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2337:1: ( ( rule__IntegerQuestion__MinValueAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2337:1: ( ( rule__IntegerQuestion__MinValueAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2338:1: ( rule__IntegerQuestion__MinValueAssignment_2 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2339:1: ( rule__IntegerQuestion__MinValueAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2339:2: rule__IntegerQuestion__MinValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MinValueAssignment_2_in_rule__IntegerQuestion__Group__2__Impl4692);
            rule__IntegerQuestion__MinValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__2__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2349:1: rule__IntegerQuestion__Group__3 : rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 ;
    public final void rule__IntegerQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2353:1: ( rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2354:2: rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__34722);
            rule__IntegerQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__34725);
            rule__IntegerQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__3"


    // $ANTLR start "rule__IntegerQuestion__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2361:1: rule__IntegerQuestion__Group__3__Impl : ( 'to' ) ;
    public final void rule__IntegerQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2365:1: ( ( 'to' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2366:1: ( 'to' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2366:1: ( 'to' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2367:1: 'to'
            {
             before(grammarAccess.getIntegerQuestionAccess().getToKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IntegerQuestion__Group__3__Impl4753); 
             after(grammarAccess.getIntegerQuestionAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__3__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2380:1: rule__IntegerQuestion__Group__4 : rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 ;
    public final void rule__IntegerQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2384:1: ( rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2385:2: rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__44784);
            rule__IntegerQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__44787);
            rule__IntegerQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__4"


    // $ANTLR start "rule__IntegerQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2392:1: rule__IntegerQuestion__Group__4__Impl : ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) ) ;
    public final void rule__IntegerQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2396:1: ( ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2397:1: ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2397:1: ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2398:1: ( rule__IntegerQuestion__MaxValueAssignment_4 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2399:1: ( rule__IntegerQuestion__MaxValueAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2399:2: rule__IntegerQuestion__MaxValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MaxValueAssignment_4_in_rule__IntegerQuestion__Group__4__Impl4814);
            rule__IntegerQuestion__MaxValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__4__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2409:1: rule__IntegerQuestion__Group__5 : rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 ;
    public final void rule__IntegerQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2413:1: ( rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2414:2: rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__54844);
            rule__IntegerQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__54847);
            rule__IntegerQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__5"


    // $ANTLR start "rule__IntegerQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2421:1: rule__IntegerQuestion__Group__5__Impl : ( ( rule__IntegerQuestion__Group_5__0 )? ) ;
    public final void rule__IntegerQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2425:1: ( ( ( rule__IntegerQuestion__Group_5__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2426:1: ( ( rule__IntegerQuestion__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2426:1: ( ( rule__IntegerQuestion__Group_5__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2427:1: ( rule__IntegerQuestion__Group_5__0 )?
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2428:1: ( rule__IntegerQuestion__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2428:2: rule__IntegerQuestion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__0_in_rule__IntegerQuestion__Group__5__Impl4874);
                    rule__IntegerQuestion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerQuestionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__5__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2438:1: rule__IntegerQuestion__Group__6 : rule__IntegerQuestion__Group__6__Impl ;
    public final void rule__IntegerQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2442:1: ( rule__IntegerQuestion__Group__6__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2443:2: rule__IntegerQuestion__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__64905);
            rule__IntegerQuestion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__6"


    // $ANTLR start "rule__IntegerQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2449:1: rule__IntegerQuestion__Group__6__Impl : ( ']' ) ;
    public final void rule__IntegerQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2453:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2454:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2454:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2455:1: ']'
            {
             before(grammarAccess.getIntegerQuestionAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IntegerQuestion__Group__6__Impl4933); 
             after(grammarAccess.getIntegerQuestionAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group__6__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_5__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2482:1: rule__IntegerQuestion__Group_5__0 : rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1 ;
    public final void rule__IntegerQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2486:1: ( rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2487:2: rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__0__Impl_in_rule__IntegerQuestion__Group_5__04978);
            rule__IntegerQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__1_in_rule__IntegerQuestion__Group_5__04981);
            rule__IntegerQuestion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group_5__0"


    // $ANTLR start "rule__IntegerQuestion__Group_5__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2494:1: rule__IntegerQuestion__Group_5__0__Impl : ( 'step' ) ;
    public final void rule__IntegerQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2498:1: ( ( 'step' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2499:1: ( 'step' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2499:1: ( 'step' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2500:1: 'step'
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepKeyword_5_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IntegerQuestion__Group_5__0__Impl5009); 
             after(grammarAccess.getIntegerQuestionAccess().getStepKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_5__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2513:1: rule__IntegerQuestion__Group_5__1 : rule__IntegerQuestion__Group_5__1__Impl ;
    public final void rule__IntegerQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2517:1: ( rule__IntegerQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2518:2: rule__IntegerQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__1__Impl_in_rule__IntegerQuestion__Group_5__15040);
            rule__IntegerQuestion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group_5__1"


    // $ANTLR start "rule__IntegerQuestion__Group_5__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2524:1: rule__IntegerQuestion__Group_5__1__Impl : ( ( rule__IntegerQuestion__StepAssignment_5_1 ) ) ;
    public final void rule__IntegerQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2528:1: ( ( ( rule__IntegerQuestion__StepAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2529:1: ( ( rule__IntegerQuestion__StepAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2529:1: ( ( rule__IntegerQuestion__StepAssignment_5_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2530:1: ( rule__IntegerQuestion__StepAssignment_5_1 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepAssignment_5_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2531:1: ( rule__IntegerQuestion__StepAssignment_5_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2531:2: rule__IntegerQuestion__StepAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__StepAssignment_5_1_in_rule__IntegerQuestion__Group_5__1__Impl5067);
            rule__IntegerQuestion__StepAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getStepAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionCondition__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2545:1: rule__QuestionCondition__Group__0 : rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1 ;
    public final void rule__QuestionCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2549:1: ( rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2550:2: rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__0__Impl_in_rule__QuestionCondition__Group__05101);
            rule__QuestionCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__1_in_rule__QuestionCondition__Group__05104);
            rule__QuestionCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__0"


    // $ANTLR start "rule__QuestionCondition__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2557:1: rule__QuestionCondition__Group__0__Impl : ( '{' ) ;
    public final void rule__QuestionCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2561:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2562:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2562:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2563:1: '{'
            {
             before(grammarAccess.getQuestionConditionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__QuestionCondition__Group__0__Impl5132); 
             after(grammarAccess.getQuestionConditionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__0__Impl"


    // $ANTLR start "rule__QuestionCondition__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2576:1: rule__QuestionCondition__Group__1 : rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2 ;
    public final void rule__QuestionCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2580:1: ( rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2581:2: rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__1__Impl_in_rule__QuestionCondition__Group__15163);
            rule__QuestionCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__2_in_rule__QuestionCondition__Group__15166);
            rule__QuestionCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__1"


    // $ANTLR start "rule__QuestionCondition__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2588:1: rule__QuestionCondition__Group__1__Impl : ( ( rule__QuestionCondition__OptionAssignment_1 ) ) ;
    public final void rule__QuestionCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2592:1: ( ( ( rule__QuestionCondition__OptionAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2593:1: ( ( rule__QuestionCondition__OptionAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2593:1: ( ( rule__QuestionCondition__OptionAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2594:1: ( rule__QuestionCondition__OptionAssignment_1 )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2595:1: ( rule__QuestionCondition__OptionAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2595:2: rule__QuestionCondition__OptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__OptionAssignment_1_in_rule__QuestionCondition__Group__1__Impl5193);
            rule__QuestionCondition__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionConditionAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__1__Impl"


    // $ANTLR start "rule__QuestionCondition__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2605:1: rule__QuestionCondition__Group__2 : rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3 ;
    public final void rule__QuestionCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2609:1: ( rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2610:2: rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__2__Impl_in_rule__QuestionCondition__Group__25223);
            rule__QuestionCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__3_in_rule__QuestionCondition__Group__25226);
            rule__QuestionCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__2"


    // $ANTLR start "rule__QuestionCondition__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2617:1: rule__QuestionCondition__Group__2__Impl : ( ( rule__QuestionCondition__Group_2__0 )* ) ;
    public final void rule__QuestionCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2621:1: ( ( ( rule__QuestionCondition__Group_2__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2622:1: ( ( rule__QuestionCondition__Group_2__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2622:1: ( ( rule__QuestionCondition__Group_2__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2623:1: ( rule__QuestionCondition__Group_2__0 )*
            {
             before(grammarAccess.getQuestionConditionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2624:1: ( rule__QuestionCondition__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2624:2: rule__QuestionCondition__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__0_in_rule__QuestionCondition__Group__2__Impl5253);
            	    rule__QuestionCondition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getQuestionConditionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__2__Impl"


    // $ANTLR start "rule__QuestionCondition__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2634:1: rule__QuestionCondition__Group__3 : rule__QuestionCondition__Group__3__Impl ;
    public final void rule__QuestionCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2638:1: ( rule__QuestionCondition__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2639:2: rule__QuestionCondition__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__3__Impl_in_rule__QuestionCondition__Group__35284);
            rule__QuestionCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__3"


    // $ANTLR start "rule__QuestionCondition__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2645:1: rule__QuestionCondition__Group__3__Impl : ( '}' ) ;
    public final void rule__QuestionCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2649:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2650:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2650:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2651:1: '}'
            {
             before(grammarAccess.getQuestionConditionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__QuestionCondition__Group__3__Impl5312); 
             after(grammarAccess.getQuestionConditionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group__3__Impl"


    // $ANTLR start "rule__QuestionCondition__Group_2__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2672:1: rule__QuestionCondition__Group_2__0 : rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1 ;
    public final void rule__QuestionCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2676:1: ( rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2677:2: rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__0__Impl_in_rule__QuestionCondition__Group_2__05351);
            rule__QuestionCondition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__1_in_rule__QuestionCondition__Group_2__05354);
            rule__QuestionCondition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group_2__0"


    // $ANTLR start "rule__QuestionCondition__Group_2__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2684:1: rule__QuestionCondition__Group_2__0__Impl : ( '/' ) ;
    public final void rule__QuestionCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2688:1: ( ( '/' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2689:1: ( '/' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2689:1: ( '/' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2690:1: '/'
            {
             before(grammarAccess.getQuestionConditionAccess().getSolidusKeyword_2_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__QuestionCondition__Group_2__0__Impl5382); 
             after(grammarAccess.getQuestionConditionAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group_2__0__Impl"


    // $ANTLR start "rule__QuestionCondition__Group_2__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2703:1: rule__QuestionCondition__Group_2__1 : rule__QuestionCondition__Group_2__1__Impl ;
    public final void rule__QuestionCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2707:1: ( rule__QuestionCondition__Group_2__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2708:2: rule__QuestionCondition__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__1__Impl_in_rule__QuestionCondition__Group_2__15413);
            rule__QuestionCondition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group_2__1"


    // $ANTLR start "rule__QuestionCondition__Group_2__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2714:1: rule__QuestionCondition__Group_2__1__Impl : ( ( rule__QuestionCondition__OptionAssignment_2_1 ) ) ;
    public final void rule__QuestionCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2718:1: ( ( ( rule__QuestionCondition__OptionAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2719:1: ( ( rule__QuestionCondition__OptionAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2719:1: ( ( rule__QuestionCondition__OptionAssignment_2_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2720:1: ( rule__QuestionCondition__OptionAssignment_2_1 )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionAssignment_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2721:1: ( rule__QuestionCondition__OptionAssignment_2_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2721:2: rule__QuestionCondition__OptionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__OptionAssignment_2_1_in_rule__QuestionCondition__Group_2__1__Impl5440);
            rule__QuestionCondition__OptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionConditionAccess().getOptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__Group_2__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2735:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2739:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2740:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05474);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05477);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2747:1: rule__Option__Group__0__Impl : ( '-' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2751:1: ( ( '-' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2752:1: ( '-' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2752:1: ( '-' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2753:1: '-'
            {
             before(grammarAccess.getOptionAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Option__Group__0__Impl5505); 
             after(grammarAccess.getOptionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2766:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2770:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2771:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15536);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15539);
            rule__Option__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2778:1: rule__Option__Group__1__Impl : ( ( rule__Option__TextAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2782:1: ( ( ( rule__Option__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2783:1: ( ( rule__Option__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2783:1: ( ( rule__Option__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2784:1: ( rule__Option__TextAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2785:1: ( rule__Option__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2785:2: rule__Option__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__TextAssignment_1_in_rule__Option__Group__1__Impl5566);
            rule__Option__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2795:1: rule__Option__Group__2 : rule__Option__Group__2__Impl ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2799:1: ( rule__Option__Group__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2800:2: rule__Option__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25596);
            rule__Option__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2806:1: rule__Option__Group__2__Impl : ( ( rule__Option__Group_2__0 )? ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2810:1: ( ( ( rule__Option__Group_2__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2811:1: ( ( rule__Option__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2811:1: ( ( rule__Option__Group_2__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2812:1: ( rule__Option__Group_2__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2813:1: ( rule__Option__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2813:2: rule__Option__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl5623);
                    rule__Option__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group_2__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2829:1: rule__Option__Group_2__0 : rule__Option__Group_2__0__Impl rule__Option__Group_2__1 ;
    public final void rule__Option__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2833:1: ( rule__Option__Group_2__0__Impl rule__Option__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2834:2: rule__Option__Group_2__0__Impl rule__Option__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__05660);
            rule__Option__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__05663);
            rule__Option__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__0"


    // $ANTLR start "rule__Option__Group_2__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2841:1: rule__Option__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Option__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2845:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2846:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2846:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2847:1: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Option__Group_2__0__Impl5691); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__0__Impl"


    // $ANTLR start "rule__Option__Group_2__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2860:1: rule__Option__Group_2__1 : rule__Option__Group_2__1__Impl rule__Option__Group_2__2 ;
    public final void rule__Option__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2864:1: ( rule__Option__Group_2__1__Impl rule__Option__Group_2__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2865:2: rule__Option__Group_2__1__Impl rule__Option__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__15722);
            rule__Option__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__2_in_rule__Option__Group_2__15725);
            rule__Option__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__1"


    // $ANTLR start "rule__Option__Group_2__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2872:1: rule__Option__Group_2__1__Impl : ( ( rule__Option__NameAssignment_2_1 ) ) ;
    public final void rule__Option__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2876:1: ( ( ( rule__Option__NameAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2877:1: ( ( rule__Option__NameAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2877:1: ( ( rule__Option__NameAssignment_2_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2878:1: ( rule__Option__NameAssignment_2_1 )
            {
             before(grammarAccess.getOptionAccess().getNameAssignment_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2879:1: ( rule__Option__NameAssignment_2_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2879:2: rule__Option__NameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__NameAssignment_2_1_in_rule__Option__Group_2__1__Impl5752);
            rule__Option__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__1__Impl"


    // $ANTLR start "rule__Option__Group_2__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2889:1: rule__Option__Group_2__2 : rule__Option__Group_2__2__Impl ;
    public final void rule__Option__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2893:1: ( rule__Option__Group_2__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2894:2: rule__Option__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__2__Impl_in_rule__Option__Group_2__25782);
            rule__Option__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__2"


    // $ANTLR start "rule__Option__Group_2__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2900:1: rule__Option__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Option__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2904:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2905:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2905:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2906:1: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Option__Group_2__2__Impl5810); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2925:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2929:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2930:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05847);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05850);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2937:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2941:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2942:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2942:1: ( ( '-' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2943:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2944:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2945:2: '-'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__EInt__Group__0__Impl5879); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2956:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2960:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2961:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15912);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2967:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2971:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2972:1: ( RULE_INT )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2972:1: ( RULE_INT )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2973:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5939); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Questionaire__NameAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2989:1: rule__Questionaire__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Questionaire__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2993:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2994:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2994:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2995:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_05977);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__NameAssignment_0"


    // $ANTLR start "rule__Questionaire__ResultEmailAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3004:1: rule__Questionaire__ResultEmailAssignment_2 : ( ruleEString ) ;
    public final void rule__Questionaire__ResultEmailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3008:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3009:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3009:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3010:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_26008);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__ResultEmailAssignment_2"


    // $ANTLR start "rule__Questionaire__ElementsAssignment_3_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3019:1: rule__Questionaire__ElementsAssignment_3_0 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3023:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3024:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3024:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3025:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_06039);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__ElementsAssignment_3_0"


    // $ANTLR start "rule__Questionaire__ElementsAssignment_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3034:1: rule__Questionaire__ElementsAssignment_3_1 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3038:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3039:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3039:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3040:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_16070);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionaire__ElementsAssignment_3_1"


    // $ANTLR start "rule__Heading__TextAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3049:1: rule__Heading__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Heading__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3053:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3054:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3054:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3055:1: ruleEString
            {
             before(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Heading__TextAssignment_16101);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__TextAssignment_1"


    // $ANTLR start "rule__Paragraph__TextAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3064:1: rule__Paragraph__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3068:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3069:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3069:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3070:1: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_16132);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__TextAssignment_1"


    // $ANTLR start "rule__QuestionBase__TitleAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3079:1: rule__QuestionBase__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QuestionBase__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3083:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3084:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3084:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3085:1: ruleEString
            {
             before(grammarAccess.getQuestionBaseAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionBase__TitleAssignment_16163);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionBaseAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__TitleAssignment_1"


    // $ANTLR start "rule__QuestionBase__MandatoryAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3094:1: rule__QuestionBase__MandatoryAssignment_2 : ( ( '*' ) ) ;
    public final void rule__QuestionBase__MandatoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3098:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3099:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3099:1: ( ( '*' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3100:1: ( '*' )
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3101:1: ( '*' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3102:1: '*'
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__QuestionBase__MandatoryAssignment_26199); 
             after(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 

            }

             after(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__MandatoryAssignment_2"


    // $ANTLR start "rule__QuestionBase__DescriptionAssignment_3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3117:1: rule__QuestionBase__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__QuestionBase__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3121:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3122:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3122:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3123:1: ruleEString
            {
             before(grammarAccess.getQuestionBaseAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionBase__DescriptionAssignment_36238);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionBaseAccess().getDescriptionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__DescriptionAssignment_3"


    // $ANTLR start "rule__QuestionBase__ConditionsAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3132:1: rule__QuestionBase__ConditionsAssignment_4 : ( ruleQuestionCondition ) ;
    public final void rule__QuestionBase__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3136:1: ( ( ruleQuestionCondition ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3137:1: ( ruleQuestionCondition )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3137:1: ( ruleQuestionCondition )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3138:1: ruleQuestionCondition
            {
             before(grammarAccess.getQuestionBaseAccess().getConditionsQuestionConditionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionCondition_in_rule__QuestionBase__ConditionsAssignment_46269);
            ruleQuestionCondition();

            state._fsp--;

             after(grammarAccess.getQuestionBaseAccess().getConditionsQuestionConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionBase__ConditionsAssignment_4"


    // $ANTLR start "rule__TextQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3147:1: rule__TextQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__TextQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3151:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3152:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3152:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3153:1: ruleQuestionBase
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__TextQuestion__QuestionBaseAssignment_06300);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__QuestionBaseAssignment_0"


    // $ANTLR start "rule__TextQuestion__MultilineAssignment_2_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3162:1: rule__TextQuestion__MultilineAssignment_2_0 : ( ( 'long' ) ) ;
    public final void rule__TextQuestion__MultilineAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3166:1: ( ( ( 'long' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3167:1: ( ( 'long' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3167:1: ( ( 'long' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3168:1: ( 'long' )
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3169:1: ( 'long' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3170:1: 'long'
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextQuestion__MultilineAssignment_2_06336); 
             after(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0()); 

            }

             after(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextQuestion__MultilineAssignment_2_0"


    // $ANTLR start "rule__ChoiceQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3185:1: rule__ChoiceQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__ChoiceQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3189:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3190:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3190:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3191:1: ruleQuestionBase
            {
             before(grammarAccess.getChoiceQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__ChoiceQuestion__QuestionBaseAssignment_06375);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__QuestionBaseAssignment_0"


    // $ANTLR start "rule__ChoiceQuestion__MinSelectionsAssignment_2_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3200:1: rule__ChoiceQuestion__MinSelectionsAssignment_2_0 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MinSelectionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3204:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3205:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3205:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3206:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_06406);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__MinSelectionsAssignment_2_0"


    // $ANTLR start "rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3215:1: rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3219:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3220:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3220:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3221:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_06437);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0"


    // $ANTLR start "rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3230:1: rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3234:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3235:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3235:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3236:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_26468);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2"


    // $ANTLR start "rule__ChoiceQuestion__OptionsAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3245:1: rule__ChoiceQuestion__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__ChoiceQuestion__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3249:1: ( ( ruleOption ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3250:1: ( ruleOption )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3250:1: ( ruleOption )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3251:1: ruleOption
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_46499);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__OptionsAssignment_4"


    // $ANTLR start "rule__MatrixQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3260:1: rule__MatrixQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__MatrixQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3264:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3265:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3265:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3266:1: ruleQuestionBase
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__MatrixQuestion__QuestionBaseAssignment_06530);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__QuestionBaseAssignment_0"


    // $ANTLR start "rule__MatrixQuestion__MaxPerRowAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3275:1: rule__MatrixQuestion__MaxPerRowAssignment_2 : ( ruleEInt ) ;
    public final void rule__MatrixQuestion__MaxPerRowAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3279:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3280:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3280:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3281:1: ruleEInt
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_26561);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__MaxPerRowAssignment_2"


    // $ANTLR start "rule__MatrixQuestion__ColumnNamesAssignment_4_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3290:1: rule__MatrixQuestion__ColumnNamesAssignment_4_0 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3294:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3295:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3295:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3296:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_06592);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__ColumnNamesAssignment_4_0"


    // $ANTLR start "rule__MatrixQuestion__ColumnNamesAssignment_4_1_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3305:1: rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3309:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3310:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3310:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3311:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_1_16623);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__ColumnNamesAssignment_4_1_1"


    // $ANTLR start "rule__MatrixQuestion__RowNamesAssignment_5_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3320:1: rule__MatrixQuestion__RowNamesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__RowNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3324:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3325:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3325:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3326:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_5_16654);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixQuestion__RowNamesAssignment_5_1"


    // $ANTLR start "rule__CalendarQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3335:1: rule__CalendarQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__CalendarQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3339:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3340:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3340:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3341:1: ruleQuestionBase
            {
             before(grammarAccess.getCalendarQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__CalendarQuestion__QuestionBaseAssignment_06685);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__QuestionBaseAssignment_0"


    // $ANTLR start "rule__CalendarQuestion__YearAssignment_2_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3350:1: rule__CalendarQuestion__YearAssignment_2_0 : ( ( 'year' ) ) ;
    public final void rule__CalendarQuestion__YearAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3354:1: ( ( ( 'year' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3355:1: ( ( 'year' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3355:1: ( ( 'year' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3356:1: ( 'year' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3357:1: ( 'year' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3358:1: 'year'
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__CalendarQuestion__YearAssignment_2_06721); 
             after(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__YearAssignment_2_0"


    // $ANTLR start "rule__CalendarQuestion__MonthAssignment_2_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3373:1: rule__CalendarQuestion__MonthAssignment_2_2 : ( ( 'month' ) ) ;
    public final void rule__CalendarQuestion__MonthAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3377:1: ( ( ( 'month' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3378:1: ( ( 'month' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3378:1: ( ( 'month' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3379:1: ( 'month' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3380:1: ( 'month' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3381:1: 'month'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__CalendarQuestion__MonthAssignment_2_26765); 
             after(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__MonthAssignment_2_2"


    // $ANTLR start "rule__CalendarQuestion__DayAssignment_2_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3396:1: rule__CalendarQuestion__DayAssignment_2_4 : ( ( 'day' ) ) ;
    public final void rule__CalendarQuestion__DayAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3400:1: ( ( ( 'day' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3401:1: ( ( 'day' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3401:1: ( ( 'day' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3402:1: ( 'day' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3403:1: ( 'day' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3404:1: 'day'
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__CalendarQuestion__DayAssignment_2_46809); 
             after(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__DayAssignment_2_4"


    // $ANTLR start "rule__CalendarQuestion__HourAssignment_2_6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3419:1: rule__CalendarQuestion__HourAssignment_2_6 : ( ( 'hour' ) ) ;
    public final void rule__CalendarQuestion__HourAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3423:1: ( ( ( 'hour' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3424:1: ( ( 'hour' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3424:1: ( ( 'hour' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3425:1: ( 'hour' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3426:1: ( 'hour' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3427:1: 'hour'
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__CalendarQuestion__HourAssignment_2_66853); 
             after(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__HourAssignment_2_6"


    // $ANTLR start "rule__CalendarQuestion__MinuteAssignment_2_8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3442:1: rule__CalendarQuestion__MinuteAssignment_2_8 : ( ( 'minute' ) ) ;
    public final void rule__CalendarQuestion__MinuteAssignment_2_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3446:1: ( ( ( 'minute' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3447:1: ( ( 'minute' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3447:1: ( ( 'minute' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3448:1: ( 'minute' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3449:1: ( 'minute' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3450:1: 'minute'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__CalendarQuestion__MinuteAssignment_2_86897); 
             after(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalendarQuestion__MinuteAssignment_2_8"


    // $ANTLR start "rule__IntegerQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3465:1: rule__IntegerQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__IntegerQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3469:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3470:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3470:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3471:1: ruleQuestionBase
            {
             before(grammarAccess.getIntegerQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__IntegerQuestion__QuestionBaseAssignment_06936);
            ruleQuestionBase();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__QuestionBaseAssignment_0"


    // $ANTLR start "rule__IntegerQuestion__MinValueAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3480:1: rule__IntegerQuestion__MinValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MinValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3484:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3485:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3485:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3486:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_26967);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__MinValueAssignment_2"


    // $ANTLR start "rule__IntegerQuestion__MaxValueAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3495:1: rule__IntegerQuestion__MaxValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MaxValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3499:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3500:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3500:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3501:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_46998);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__MaxValueAssignment_4"


    // $ANTLR start "rule__IntegerQuestion__StepAssignment_5_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3510:1: rule__IntegerQuestion__StepAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__StepAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3514:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3515:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3515:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3516:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_5_17029);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerQuestion__StepAssignment_5_1"


    // $ANTLR start "rule__QuestionCondition__OptionAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3525:1: rule__QuestionCondition__OptionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCondition__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3529:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3530:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3530:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3531:1: ( ruleEString )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3532:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3533:1: ruleEString
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_17064);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__OptionAssignment_1"


    // $ANTLR start "rule__QuestionCondition__OptionAssignment_2_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3544:1: rule__QuestionCondition__OptionAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCondition__OptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3548:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3549:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3549:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3550:1: ( ruleEString )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_2_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3551:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3552:1: ruleEString
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_2_17103);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionCondition__OptionAssignment_2_1"


    // $ANTLR start "rule__Option__TextAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3563:1: rule__Option__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Option__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3567:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3568:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3568:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3569:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__TextAssignment_17138);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__TextAssignment_1"


    // $ANTLR start "rule__Option__NameAssignment_2_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3578:1: rule__Option__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Option__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3582:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3583:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3583:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3584:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__NameAssignment_2_17169);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__NameAssignment_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\25\uffff";
    static final String DFA1_eofS =
        "\25\uffff";
    static final String DFA1_minS =
        "\1\15\2\uffff\4\4\2\20\1\4\5\uffff\2\34\1\4\1\20\2\34";
    static final String DFA1_maxS =
        "\1\17\2\uffff\1\5\2\36\3\33\1\5\5\uffff\2\35\1\5\1\33\2\35";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\7\1\5\1\3\1\4\1\6\6\uffff";
    static final String DFA1_specialS =
        "\25\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\4\1\5",
            "\1\7\1\10\12\uffff\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff"+
            "\1\16\1\12\1\uffff\1\11\2\uffff\1\6",
            "\1\7\1\10\12\uffff\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff"+
            "\1\16\1\12\1\uffff\1\11\2\uffff\1\6",
            "\1\7\1\10\12\uffff\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff"+
            "\1\16\1\12\1\uffff\1\11",
            "\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff\1\16\1\12\1\uffff"+
            "\1\11",
            "\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff\1\16\1\12\1\uffff"+
            "\1\11",
            "\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\22\1\21",
            "\1\22\1\21",
            "\1\23\1\24",
            "\1\14\1\uffff\1\15\1\uffff\1\13\3\uffff\1\16\1\12\1\uffff"+
            "\1\11",
            "\1\22\1\21",
            "\1\22\1\21"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "454:1: rule__Element__Alternatives : ( ( ruleHeading ) | ( ruleParagraph ) | ( ruleTextQuestion ) | ( ruleChoiceQuestion ) | ( ruleMatrixQuestion ) | ( ruleCalendarQuestion ) | ( ruleIntegerQuestion ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQuestionaire_in_entryRuleQuestionaire61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionaire68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__0_in_ruleQuestionaire94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_entryRuleHeading241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHeading248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__0_in_ruleHeading274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParagraph308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__0_in_ruleParagraph334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_entryRuleQuestionBase361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionBase368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__0_in_ruleQuestionBase394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestion428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__0_in_ruleTextQuestion454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarQuestion608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__0_in_ruleCalendarQuestion634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerQuestion668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__0_in_ruleIntegerQuestion694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionCondition_in_entryRuleQuestionCondition723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionCondition730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__0_in_ruleQuestionCondition756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_rule__Element__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_rule__Element__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_rule__Element__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_rule__Element__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__Element__Alternatives980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_rule__Element__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_rule__Element__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__MultilineAssignment_2_0_in_rule__TextQuestion__Alternatives_21095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__TextQuestion__Alternatives_21114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_0_in_rule__ChoiceQuestion__Alternatives_21148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__0_in_rule__ChoiceQuestion__Alternatives_21166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__01198 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__01201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__NameAssignment_0_in_rule__Questionaire__Group__0__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Questionaire__Group__1__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21320 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ResultEmailAssignment_2_in_rule__Questionaire__Group__2__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__0_in_rule__Questionaire__Group__3__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__0__Impl_in_rule__Questionaire__Group_3__01446 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__1_in_rule__Questionaire__Group_3__01449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_3_0_in_rule__Questionaire__Group_3__0__Impl1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__1__Impl_in_rule__Questionaire__Group_3__11506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_3_1_in_rule__Questionaire__Group_3__1__Impl1533 = new BitSet(new long[]{0x000000000000E002L});
        public static final BitSet FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01568 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Heading__Group__0__Impl1599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__TextAssignment_1_in_rule__Heading__Group__1__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__01691 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__01694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Paragraph__Group__0__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__11753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__TextAssignment_1_in_rule__Paragraph__Group__1__Impl1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__0__Impl_in_rule__QuestionBase__Group__01814 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__1_in_rule__QuestionBase__Group__01817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuestionBase__Group__0__Impl1845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__1__Impl_in_rule__QuestionBase__Group__11876 = new BitSet(new long[]{0x0000000048000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__2_in_rule__QuestionBase__Group__11879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__TitleAssignment_1_in_rule__QuestionBase__Group__1__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__2__Impl_in_rule__QuestionBase__Group__21936 = new BitSet(new long[]{0x0000000048000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__3_in_rule__QuestionBase__Group__21939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__MandatoryAssignment_2_in_rule__QuestionBase__Group__2__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__3__Impl_in_rule__QuestionBase__Group__31997 = new BitSet(new long[]{0x0000000048000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__4_in_rule__QuestionBase__Group__32000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__DescriptionAssignment_3_in_rule__QuestionBase__Group__3__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__4__Impl_in_rule__QuestionBase__Group__42058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__ConditionsAssignment_4_in_rule__QuestionBase__Group__4__Impl2085 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02126 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__QuestionBaseAssignment_0_in_rule__TextQuestion__Group__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12186 = new BitSet(new long[]{0x0000000080000800L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TextQuestion__Group__1__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22248 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Alternatives_2_in_rule__TextQuestion__Group__2__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TextQuestion__Group__3__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02375 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__QuestionBaseAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12435 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ChoiceQuestion__Group__1__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22497 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Alternatives_2_in_rule__ChoiceQuestion__Group__2__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32557 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ChoiceQuestion__Group__3__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2648 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2660 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__0__Impl_in_rule__ChoiceQuestion__Group_2_1__02703 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__1_in_rule__ChoiceQuestion__Group_2_1__02706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0_in_rule__ChoiceQuestion__Group_2_1__0__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__1__Impl_in_rule__ChoiceQuestion__Group_2_1__12763 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__2_in_rule__ChoiceQuestion__Group_2_1__12766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ChoiceQuestion__Group_2_1__1__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__2__Impl_in_rule__ChoiceQuestion__Group_2_1__22825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2_in_rule__ChoiceQuestion__Group_2_1__2__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02888 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__QuestionBaseAssignment_0_in_rule__MatrixQuestion__Group__0__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12948 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MatrixQuestion__Group__1__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__23010 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__23013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_2_in_rule__MatrixQuestion__Group__2__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__33070 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__33073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MatrixQuestion__Group__3__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__43132 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__43135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__0_in_rule__MatrixQuestion__Group__4__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__53193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3222 = new BitSet(new long[]{0x0000000000800032L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3234 = new BitSet(new long[]{0x0000000000800032L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__0__Impl_in_rule__MatrixQuestion__Group_4__03279 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__1_in_rule__MatrixQuestion__Group_4__03282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_0_in_rule__MatrixQuestion__Group_4__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__1__Impl_in_rule__MatrixQuestion__Group_4__13339 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__2_in_rule__MatrixQuestion__Group_4__13342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__0_in_rule__MatrixQuestion__Group_4__1__Impl3369 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__2__Impl_in_rule__MatrixQuestion__Group_4__23400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MatrixQuestion__Group_4__2__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__0__Impl_in_rule__MatrixQuestion__Group_4_1__03465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__1_in_rule__MatrixQuestion__Group_4_1__03468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MatrixQuestion__Group_4_1__0__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__1__Impl_in_rule__MatrixQuestion__Group_4_1__13527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_1_1_in_rule__MatrixQuestion__Group_4_1__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0__Impl_in_rule__MatrixQuestion__Group_5__03588 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__1_in_rule__MatrixQuestion__Group_5__03591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MatrixQuestion__Group_5__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__1__Impl_in_rule__MatrixQuestion__Group_5__13650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__RowNamesAssignment_5_1_in_rule__MatrixQuestion__Group_5__1__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__03711 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__03714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__QuestionBaseAssignment_0_in_rule__CalendarQuestion__Group__0__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__13771 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__13774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CalendarQuestion__Group__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__23833 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__23836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__0_in_rule__CalendarQuestion__Group__2__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__33893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CalendarQuestion__Group__3__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__0__Impl_in_rule__CalendarQuestion__Group_2__03960 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__1_in_rule__CalendarQuestion__Group_2__03963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__YearAssignment_2_0_in_rule__CalendarQuestion__Group_2__0__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__1__Impl_in_rule__CalendarQuestion__Group_2__14021 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__2_in_rule__CalendarQuestion__Group_2__14024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CalendarQuestion__Group_2__1__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__2__Impl_in_rule__CalendarQuestion__Group_2__24086 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__3_in_rule__CalendarQuestion__Group_2__24089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MonthAssignment_2_2_in_rule__CalendarQuestion__Group_2__2__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__3__Impl_in_rule__CalendarQuestion__Group_2__34147 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__4_in_rule__CalendarQuestion__Group_2__34150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CalendarQuestion__Group_2__3__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__4__Impl_in_rule__CalendarQuestion__Group_2__44212 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__5_in_rule__CalendarQuestion__Group_2__44215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__DayAssignment_2_4_in_rule__CalendarQuestion__Group_2__4__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__5__Impl_in_rule__CalendarQuestion__Group_2__54273 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__6_in_rule__CalendarQuestion__Group_2__54276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CalendarQuestion__Group_2__5__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__6__Impl_in_rule__CalendarQuestion__Group_2__64338 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__7_in_rule__CalendarQuestion__Group_2__64341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__HourAssignment_2_6_in_rule__CalendarQuestion__Group_2__6__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__7__Impl_in_rule__CalendarQuestion__Group_2__74399 = new BitSet(new long[]{0x0000001F00400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__8_in_rule__CalendarQuestion__Group_2__74402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CalendarQuestion__Group_2__7__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__8__Impl_in_rule__CalendarQuestion__Group_2__84464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MinuteAssignment_2_8_in_rule__CalendarQuestion__Group_2__8__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__04540 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__04543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__QuestionBaseAssignment_0_in_rule__IntegerQuestion__Group__0__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__14600 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__14603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntegerQuestion__Group__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__24662 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__24665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MinValueAssignment_2_in_rule__IntegerQuestion__Group__2__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__34722 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__34725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IntegerQuestion__Group__3__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__44784 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__44787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MaxValueAssignment_4_in_rule__IntegerQuestion__Group__4__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__54844 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__54847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__0_in_rule__IntegerQuestion__Group__5__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__64905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IntegerQuestion__Group__6__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__0__Impl_in_rule__IntegerQuestion__Group_5__04978 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__1_in_rule__IntegerQuestion__Group_5__04981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IntegerQuestion__Group_5__0__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__1__Impl_in_rule__IntegerQuestion__Group_5__15040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__StepAssignment_5_1_in_rule__IntegerQuestion__Group_5__1__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__0__Impl_in_rule__QuestionCondition__Group__05101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__1_in_rule__QuestionCondition__Group__05104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__QuestionCondition__Group__0__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__1__Impl_in_rule__QuestionCondition__Group__15163 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__2_in_rule__QuestionCondition__Group__15166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__OptionAssignment_1_in_rule__QuestionCondition__Group__1__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__2__Impl_in_rule__QuestionCondition__Group__25223 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__3_in_rule__QuestionCondition__Group__25226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__0_in_rule__QuestionCondition__Group__2__Impl5253 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__3__Impl_in_rule__QuestionCondition__Group__35284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__QuestionCondition__Group__3__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__0__Impl_in_rule__QuestionCondition__Group_2__05351 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__1_in_rule__QuestionCondition__Group_2__05354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__QuestionCondition__Group_2__0__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__1__Impl_in_rule__QuestionCondition__Group_2__15413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__OptionAssignment_2_1_in_rule__QuestionCondition__Group_2__1__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05474 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Option__Group__0__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15536 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__TextAssignment_1_in_rule__Option__Group__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__05660 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__05663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Option__Group_2__0__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__15722 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Option__Group_2__2_in_rule__Option__Group_2__15725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__NameAssignment_2_1_in_rule__Option__Group_2__1__Impl5752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__2__Impl_in_rule__Option__Group_2__25782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Option__Group_2__2__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05847 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EInt__Group__0__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_05977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_26008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_06039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_16070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Heading__TextAssignment_16101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_16132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionBase__TitleAssignment_16163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__QuestionBase__MandatoryAssignment_26199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionBase__DescriptionAssignment_36238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionCondition_in_rule__QuestionBase__ConditionsAssignment_46269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__TextQuestion__QuestionBaseAssignment_06300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextQuestion__MultilineAssignment_2_06336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__ChoiceQuestion__QuestionBaseAssignment_06375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_06406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_06437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_26468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_46499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__MatrixQuestion__QuestionBaseAssignment_06530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_26561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_06592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_1_16623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_5_16654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__CalendarQuestion__QuestionBaseAssignment_06685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__CalendarQuestion__YearAssignment_2_06721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CalendarQuestion__MonthAssignment_2_26765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CalendarQuestion__DayAssignment_2_46809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CalendarQuestion__HourAssignment_2_66853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__CalendarQuestion__MinuteAssignment_2_86897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__IntegerQuestion__QuestionBaseAssignment_06936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_26967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_46998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_5_17029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_17064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_2_17103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__TextAssignment_17138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__NameAssignment_2_17169 = new BitSet(new long[]{0x0000000000000002L});
    }


}