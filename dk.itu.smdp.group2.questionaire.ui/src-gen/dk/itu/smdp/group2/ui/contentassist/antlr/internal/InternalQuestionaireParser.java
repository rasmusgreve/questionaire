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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'email:'", "'#'", "'!'", "'?'", "'text['", "']'", "'choice['", "'to'", "'matrix['", "']['", "','", "'-'", "'calendar['", "'number['", "'step'", "'{'", "'}'", "'/'", "'*'", "'long'", "'year'", "'month'", "'day'", "'hour'", "'minute'"
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


    // $ANTLR start "rule__ChoiceQuestion__Alternatives_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:528:1: rule__ChoiceQuestion__Alternatives_2 : ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) ) | ( ( rule__ChoiceQuestion__Group_2_1__0 ) ) );
    public final void rule__ChoiceQuestion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:532:1: ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) ) | ( ( rule__ChoiceQuestion__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==18) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==16) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_INT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==18) ) {
                    alt3=2;
                }
                else if ( (LA3_2==16) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:533:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:533:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 ) )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:534:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 )
                    {
                     before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_0()); 
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:535:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_0 )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:535:2: rule__ChoiceQuestion__MinSelectionsAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_0_in_rule__ChoiceQuestion__Alternatives_21095);
                    rule__ChoiceQuestion__MinSelectionsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:539:6: ( ( rule__ChoiceQuestion__Group_2_1__0 ) )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:539:6: ( ( rule__ChoiceQuestion__Group_2_1__0 ) )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:540:1: ( rule__ChoiceQuestion__Group_2_1__0 )
                    {
                     before(grammarAccess.getChoiceQuestionAccess().getGroup_2_1()); 
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:541:1: ( rule__ChoiceQuestion__Group_2_1__0 )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:541:2: rule__ChoiceQuestion__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__0_in_rule__ChoiceQuestion__Alternatives_21113);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:553:1: rule__Questionaire__Group__0 : rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 ;
    public final void rule__Questionaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:557:1: ( rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:558:2: rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__01145);
            rule__Questionaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__01148);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:565:1: rule__Questionaire__Group__0__Impl : ( ( rule__Questionaire__NameAssignment_0 ) ) ;
    public final void rule__Questionaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:569:1: ( ( ( rule__Questionaire__NameAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:570:1: ( ( rule__Questionaire__NameAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:570:1: ( ( rule__Questionaire__NameAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:571:1: ( rule__Questionaire__NameAssignment_0 )
            {
             before(grammarAccess.getQuestionaireAccess().getNameAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:572:1: ( rule__Questionaire__NameAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:572:2: rule__Questionaire__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__NameAssignment_0_in_rule__Questionaire__Group__0__Impl1175);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:582:1: rule__Questionaire__Group__1 : rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 ;
    public final void rule__Questionaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:586:1: ( rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:587:2: rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11205);
            rule__Questionaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11208);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:594:1: rule__Questionaire__Group__1__Impl : ( 'email:' ) ;
    public final void rule__Questionaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:598:1: ( ( 'email:' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:599:1: ( 'email:' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:599:1: ( 'email:' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:600:1: 'email:'
            {
             before(grammarAccess.getQuestionaireAccess().getEmailKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Questionaire__Group__1__Impl1236); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:613:1: rule__Questionaire__Group__2 : rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 ;
    public final void rule__Questionaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:617:1: ( rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:618:2: rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21267);
            rule__Questionaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21270);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:625:1: rule__Questionaire__Group__2__Impl : ( ( rule__Questionaire__ResultEmailAssignment_2 ) ) ;
    public final void rule__Questionaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:629:1: ( ( ( rule__Questionaire__ResultEmailAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:630:1: ( ( rule__Questionaire__ResultEmailAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:630:1: ( ( rule__Questionaire__ResultEmailAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:631:1: ( rule__Questionaire__ResultEmailAssignment_2 )
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:632:1: ( rule__Questionaire__ResultEmailAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:632:2: rule__Questionaire__ResultEmailAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ResultEmailAssignment_2_in_rule__Questionaire__Group__2__Impl1297);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:642:1: rule__Questionaire__Group__3 : rule__Questionaire__Group__3__Impl ;
    public final void rule__Questionaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:646:1: ( rule__Questionaire__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:647:2: rule__Questionaire__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31327);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:653:1: rule__Questionaire__Group__3__Impl : ( ( rule__Questionaire__Group_3__0 )? ) ;
    public final void rule__Questionaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:657:1: ( ( ( rule__Questionaire__Group_3__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:658:1: ( ( rule__Questionaire__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:658:1: ( ( rule__Questionaire__Group_3__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:659:1: ( rule__Questionaire__Group_3__0 )?
            {
             before(grammarAccess.getQuestionaireAccess().getGroup_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:660:1: ( rule__Questionaire__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=12 && LA4_0<=14)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:660:2: rule__Questionaire__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__0_in_rule__Questionaire__Group__3__Impl1354);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:678:1: rule__Questionaire__Group_3__0 : rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1 ;
    public final void rule__Questionaire__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:682:1: ( rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:683:2: rule__Questionaire__Group_3__0__Impl rule__Questionaire__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__0__Impl_in_rule__Questionaire__Group_3__01393);
            rule__Questionaire__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__1_in_rule__Questionaire__Group_3__01396);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:690:1: rule__Questionaire__Group_3__0__Impl : ( ( rule__Questionaire__ElementsAssignment_3_0 ) ) ;
    public final void rule__Questionaire__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:694:1: ( ( ( rule__Questionaire__ElementsAssignment_3_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:695:1: ( ( rule__Questionaire__ElementsAssignment_3_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:695:1: ( ( rule__Questionaire__ElementsAssignment_3_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:696:1: ( rule__Questionaire__ElementsAssignment_3_0 )
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:697:1: ( rule__Questionaire__ElementsAssignment_3_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:697:2: rule__Questionaire__ElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_3_0_in_rule__Questionaire__Group_3__0__Impl1423);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:707:1: rule__Questionaire__Group_3__1 : rule__Questionaire__Group_3__1__Impl ;
    public final void rule__Questionaire__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:711:1: ( rule__Questionaire__Group_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:712:2: rule__Questionaire__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_3__1__Impl_in_rule__Questionaire__Group_3__11453);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:718:1: rule__Questionaire__Group_3__1__Impl : ( ( rule__Questionaire__ElementsAssignment_3_1 )* ) ;
    public final void rule__Questionaire__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:722:1: ( ( ( rule__Questionaire__ElementsAssignment_3_1 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:723:1: ( ( rule__Questionaire__ElementsAssignment_3_1 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:723:1: ( ( rule__Questionaire__ElementsAssignment_3_1 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:724:1: ( rule__Questionaire__ElementsAssignment_3_1 )*
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:725:1: ( rule__Questionaire__ElementsAssignment_3_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=12 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:725:2: rule__Questionaire__ElementsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_3_1_in_rule__Questionaire__Group_3__1__Impl1480);
            	    rule__Questionaire__ElementsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:739:1: rule__Heading__Group__0 : rule__Heading__Group__0__Impl rule__Heading__Group__1 ;
    public final void rule__Heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:743:1: ( rule__Heading__Group__0__Impl rule__Heading__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:744:2: rule__Heading__Group__0__Impl rule__Heading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01515);
            rule__Heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01518);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:751:1: rule__Heading__Group__0__Impl : ( '#' ) ;
    public final void rule__Heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:755:1: ( ( '#' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:756:1: ( '#' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:756:1: ( '#' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:757:1: '#'
            {
             before(grammarAccess.getHeadingAccess().getNumberSignKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Heading__Group__0__Impl1546); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:770:1: rule__Heading__Group__1 : rule__Heading__Group__1__Impl ;
    public final void rule__Heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:774:1: ( rule__Heading__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:775:2: rule__Heading__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11577);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:781:1: rule__Heading__Group__1__Impl : ( ( rule__Heading__TextAssignment_1 ) ) ;
    public final void rule__Heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:785:1: ( ( ( rule__Heading__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:786:1: ( ( rule__Heading__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:786:1: ( ( rule__Heading__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:787:1: ( rule__Heading__TextAssignment_1 )
            {
             before(grammarAccess.getHeadingAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:788:1: ( rule__Heading__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:788:2: rule__Heading__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__TextAssignment_1_in_rule__Heading__Group__1__Impl1604);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:802:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:806:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:807:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__01638);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__01641);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:814:1: rule__Paragraph__Group__0__Impl : ( '!' ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:818:1: ( ( '!' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:819:1: ( '!' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:819:1: ( '!' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:820:1: '!'
            {
             before(grammarAccess.getParagraphAccess().getExclamationMarkKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Paragraph__Group__0__Impl1669); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:833:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:837:1: ( rule__Paragraph__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:838:2: rule__Paragraph__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__11700);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:844:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__TextAssignment_1 ) ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:848:1: ( ( ( rule__Paragraph__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:849:1: ( ( rule__Paragraph__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:849:1: ( ( rule__Paragraph__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:850:1: ( rule__Paragraph__TextAssignment_1 )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:851:1: ( rule__Paragraph__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:851:2: rule__Paragraph__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__TextAssignment_1_in_rule__Paragraph__Group__1__Impl1727);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:865:1: rule__QuestionBase__Group__0 : rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1 ;
    public final void rule__QuestionBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:869:1: ( rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:870:2: rule__QuestionBase__Group__0__Impl rule__QuestionBase__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__0__Impl_in_rule__QuestionBase__Group__01761);
            rule__QuestionBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__1_in_rule__QuestionBase__Group__01764);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:877:1: rule__QuestionBase__Group__0__Impl : ( '?' ) ;
    public final void rule__QuestionBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:881:1: ( ( '?' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:882:1: ( '?' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:882:1: ( '?' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:883:1: '?'
            {
             before(grammarAccess.getQuestionBaseAccess().getQuestionMarkKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QuestionBase__Group__0__Impl1792); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:896:1: rule__QuestionBase__Group__1 : rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2 ;
    public final void rule__QuestionBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:900:1: ( rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:901:2: rule__QuestionBase__Group__1__Impl rule__QuestionBase__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__1__Impl_in_rule__QuestionBase__Group__11823);
            rule__QuestionBase__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__2_in_rule__QuestionBase__Group__11826);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:908:1: rule__QuestionBase__Group__1__Impl : ( ( rule__QuestionBase__TitleAssignment_1 ) ) ;
    public final void rule__QuestionBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:912:1: ( ( ( rule__QuestionBase__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:913:1: ( ( rule__QuestionBase__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:913:1: ( ( rule__QuestionBase__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:914:1: ( rule__QuestionBase__TitleAssignment_1 )
            {
             before(grammarAccess.getQuestionBaseAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:915:1: ( rule__QuestionBase__TitleAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:915:2: rule__QuestionBase__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__TitleAssignment_1_in_rule__QuestionBase__Group__1__Impl1853);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:925:1: rule__QuestionBase__Group__2 : rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3 ;
    public final void rule__QuestionBase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:929:1: ( rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:930:2: rule__QuestionBase__Group__2__Impl rule__QuestionBase__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__2__Impl_in_rule__QuestionBase__Group__21883);
            rule__QuestionBase__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__3_in_rule__QuestionBase__Group__21886);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:937:1: rule__QuestionBase__Group__2__Impl : ( ( rule__QuestionBase__MandatoryAssignment_2 )? ) ;
    public final void rule__QuestionBase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:941:1: ( ( ( rule__QuestionBase__MandatoryAssignment_2 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:942:1: ( ( rule__QuestionBase__MandatoryAssignment_2 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:942:1: ( ( rule__QuestionBase__MandatoryAssignment_2 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:943:1: ( rule__QuestionBase__MandatoryAssignment_2 )?
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:944:1: ( rule__QuestionBase__MandatoryAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:944:2: rule__QuestionBase__MandatoryAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__MandatoryAssignment_2_in_rule__QuestionBase__Group__2__Impl1913);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:954:1: rule__QuestionBase__Group__3 : rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4 ;
    public final void rule__QuestionBase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:958:1: ( rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:959:2: rule__QuestionBase__Group__3__Impl rule__QuestionBase__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__3__Impl_in_rule__QuestionBase__Group__31944);
            rule__QuestionBase__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__4_in_rule__QuestionBase__Group__31947);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:966:1: rule__QuestionBase__Group__3__Impl : ( ( rule__QuestionBase__DescriptionAssignment_3 )? ) ;
    public final void rule__QuestionBase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:970:1: ( ( ( rule__QuestionBase__DescriptionAssignment_3 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:971:1: ( ( rule__QuestionBase__DescriptionAssignment_3 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:971:1: ( ( rule__QuestionBase__DescriptionAssignment_3 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:972:1: ( rule__QuestionBase__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getQuestionBaseAccess().getDescriptionAssignment_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:973:1: ( rule__QuestionBase__DescriptionAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:973:2: rule__QuestionBase__DescriptionAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__DescriptionAssignment_3_in_rule__QuestionBase__Group__3__Impl1974);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:983:1: rule__QuestionBase__Group__4 : rule__QuestionBase__Group__4__Impl ;
    public final void rule__QuestionBase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:987:1: ( rule__QuestionBase__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:988:2: rule__QuestionBase__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__Group__4__Impl_in_rule__QuestionBase__Group__42005);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:994:1: rule__QuestionBase__Group__4__Impl : ( ( rule__QuestionBase__ConditionsAssignment_4 )* ) ;
    public final void rule__QuestionBase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:998:1: ( ( ( rule__QuestionBase__ConditionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:999:1: ( ( rule__QuestionBase__ConditionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:999:1: ( ( rule__QuestionBase__ConditionsAssignment_4 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1000:1: ( rule__QuestionBase__ConditionsAssignment_4 )*
            {
             before(grammarAccess.getQuestionBaseAccess().getConditionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1001:1: ( rule__QuestionBase__ConditionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1001:2: rule__QuestionBase__ConditionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionBase__ConditionsAssignment_4_in_rule__QuestionBase__Group__4__Impl2032);
            	    rule__QuestionBase__ConditionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1021:1: rule__TextQuestion__Group__0 : rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 ;
    public final void rule__TextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1025:1: ( rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1026:2: rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02073);
            rule__TextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02076);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1033:1: rule__TextQuestion__Group__0__Impl : ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__TextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1037:1: ( ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1038:1: ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1038:1: ( ( rule__TextQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1039:1: ( rule__TextQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1040:1: ( rule__TextQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1040:2: rule__TextQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__QuestionBaseAssignment_0_in_rule__TextQuestion__Group__0__Impl2103);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1050:1: rule__TextQuestion__Group__1 : rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 ;
    public final void rule__TextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1054:1: ( rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1055:2: rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12133);
            rule__TextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12136);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1062:1: rule__TextQuestion__Group__1__Impl : ( 'text[' ) ;
    public final void rule__TextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1066:1: ( ( 'text[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1067:1: ( 'text[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1067:1: ( 'text[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1068:1: 'text['
            {
             before(grammarAccess.getTextQuestionAccess().getTextKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TextQuestion__Group__1__Impl2164); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1081:1: rule__TextQuestion__Group__2 : rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 ;
    public final void rule__TextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1085:1: ( rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1086:2: rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22195);
            rule__TextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22198);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1093:1: rule__TextQuestion__Group__2__Impl : ( ( rule__TextQuestion__MultilineAssignment_2 ) ) ;
    public final void rule__TextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1097:1: ( ( ( rule__TextQuestion__MultilineAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1098:1: ( ( rule__TextQuestion__MultilineAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1098:1: ( ( rule__TextQuestion__MultilineAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1099:1: ( rule__TextQuestion__MultilineAssignment_2 )
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1100:1: ( rule__TextQuestion__MultilineAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1100:2: rule__TextQuestion__MultilineAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__MultilineAssignment_2_in_rule__TextQuestion__Group__2__Impl2225);
            rule__TextQuestion__MultilineAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getMultilineAssignment_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1110:1: rule__TextQuestion__Group__3 : rule__TextQuestion__Group__3__Impl ;
    public final void rule__TextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1114:1: ( rule__TextQuestion__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1115:2: rule__TextQuestion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32255);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1121:1: rule__TextQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__TextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1125:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1126:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1126:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1127:1: ']'
            {
             before(grammarAccess.getTextQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TextQuestion__Group__3__Impl2283); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1148:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1152:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1153:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02322);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02325);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1160:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1164:1: ( ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1165:1: ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1165:1: ( ( rule__ChoiceQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1166:1: ( rule__ChoiceQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1167:1: ( rule__ChoiceQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1167:2: rule__ChoiceQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__QuestionBaseAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2352);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1177:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1181:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1182:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12382);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12385);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1189:1: rule__ChoiceQuestion__Group__1__Impl : ( 'choice[' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1193:1: ( ( 'choice[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1194:1: ( 'choice[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1194:1: ( 'choice[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1195:1: 'choice['
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ChoiceQuestion__Group__1__Impl2413); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1208:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1212:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1213:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22444);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22447);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1220:1: rule__ChoiceQuestion__Group__2__Impl : ( ( rule__ChoiceQuestion__Alternatives_2 ) ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1224:1: ( ( ( rule__ChoiceQuestion__Alternatives_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1225:1: ( ( rule__ChoiceQuestion__Alternatives_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1225:1: ( ( rule__ChoiceQuestion__Alternatives_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1226:1: ( rule__ChoiceQuestion__Alternatives_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getAlternatives_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1227:1: ( rule__ChoiceQuestion__Alternatives_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1227:2: rule__ChoiceQuestion__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Alternatives_2_in_rule__ChoiceQuestion__Group__2__Impl2474);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1237:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1241:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1242:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32504);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32507);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1249:1: rule__ChoiceQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1253:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1254:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1254:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1255:1: ']'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ChoiceQuestion__Group__3__Impl2535); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1268:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1272:1: ( rule__ChoiceQuestion__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1273:2: rule__ChoiceQuestion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42566);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1279:1: rule__ChoiceQuestion__Group__4__Impl : ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1283:1: ( ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1284:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1284:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1285:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) ) ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1285:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1286:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1287:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1287:2: rule__ChoiceQuestion__OptionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2595);
            rule__ChoiceQuestion__OptionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 

            }

            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1290:1: ( ( rule__ChoiceQuestion__OptionsAssignment_4 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1291:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1292:1: ( rule__ChoiceQuestion__OptionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1292:2: rule__ChoiceQuestion__OptionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2607);
            	    rule__ChoiceQuestion__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1313:1: rule__ChoiceQuestion__Group_2_1__0 : rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1 ;
    public final void rule__ChoiceQuestion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1317:1: ( rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1318:2: rule__ChoiceQuestion__Group_2_1__0__Impl rule__ChoiceQuestion__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__0__Impl_in_rule__ChoiceQuestion__Group_2_1__02650);
            rule__ChoiceQuestion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__1_in_rule__ChoiceQuestion__Group_2_1__02653);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1325:1: rule__ChoiceQuestion__Group_2_1__0__Impl : ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) ) ;
    public final void rule__ChoiceQuestion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1329:1: ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1330:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1330:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1331:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_2_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1332:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1332:2: rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0_in_rule__ChoiceQuestion__Group_2_1__0__Impl2680);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1342:1: rule__ChoiceQuestion__Group_2_1__1 : rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2 ;
    public final void rule__ChoiceQuestion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1346:1: ( rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1347:2: rule__ChoiceQuestion__Group_2_1__1__Impl rule__ChoiceQuestion__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__1__Impl_in_rule__ChoiceQuestion__Group_2_1__12710);
            rule__ChoiceQuestion__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__2_in_rule__ChoiceQuestion__Group_2_1__12713);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1354:1: rule__ChoiceQuestion__Group_2_1__1__Impl : ( 'to' ) ;
    public final void rule__ChoiceQuestion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1358:1: ( ( 'to' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1359:1: ( 'to' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1359:1: ( 'to' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1360:1: 'to'
            {
             before(grammarAccess.getChoiceQuestionAccess().getToKeyword_2_1_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ChoiceQuestion__Group_2_1__1__Impl2741); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1373:1: rule__ChoiceQuestion__Group_2_1__2 : rule__ChoiceQuestion__Group_2_1__2__Impl ;
    public final void rule__ChoiceQuestion__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1377:1: ( rule__ChoiceQuestion__Group_2_1__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1378:2: rule__ChoiceQuestion__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_2_1__2__Impl_in_rule__ChoiceQuestion__Group_2_1__22772);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1384:1: rule__ChoiceQuestion__Group_2_1__2__Impl : ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) ) ;
    public final void rule__ChoiceQuestion__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1388:1: ( ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1389:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1389:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1390:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_2_1_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1391:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1391:2: rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2_in_rule__ChoiceQuestion__Group_2_1__2__Impl2799);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1407:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1411:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1412:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02835);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02838);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1419:1: rule__MatrixQuestion__Group__0__Impl : ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1423:1: ( ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1424:1: ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1424:1: ( ( rule__MatrixQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1425:1: ( rule__MatrixQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1426:1: ( rule__MatrixQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1426:2: rule__MatrixQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__QuestionBaseAssignment_0_in_rule__MatrixQuestion__Group__0__Impl2865);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1436:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1440:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1441:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12895);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12898);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1448:1: rule__MatrixQuestion__Group__1__Impl : ( 'matrix[' ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1452:1: ( ( 'matrix[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1453:1: ( 'matrix[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1453:1: ( 'matrix[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1454:1: 'matrix['
            {
             before(grammarAccess.getMatrixQuestionAccess().getMatrixKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MatrixQuestion__Group__1__Impl2926); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1467:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1471:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1472:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22957);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22960);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1479:1: rule__MatrixQuestion__Group__2__Impl : ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1483:1: ( ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1484:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1484:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1485:1: ( rule__MatrixQuestion__MaxPerRowAssignment_2 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1486:1: ( rule__MatrixQuestion__MaxPerRowAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1486:2: rule__MatrixQuestion__MaxPerRowAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_2_in_rule__MatrixQuestion__Group__2__Impl2987);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1496:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1500:1: ( rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1501:2: rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__33017);
            rule__MatrixQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__33020);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1508:1: rule__MatrixQuestion__Group__3__Impl : ( '][' ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1512:1: ( ( '][' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1513:1: ( '][' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1513:1: ( '][' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1514:1: ']['
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketLeftSquareBracketKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MatrixQuestion__Group__3__Impl3048); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1527:1: rule__MatrixQuestion__Group__4 : rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 ;
    public final void rule__MatrixQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1531:1: ( rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1532:2: rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__43079);
            rule__MatrixQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__43082);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1539:1: rule__MatrixQuestion__Group__4__Impl : ( ( rule__MatrixQuestion__Group_4__0 )? ) ;
    public final void rule__MatrixQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1543:1: ( ( ( rule__MatrixQuestion__Group_4__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1544:1: ( ( rule__MatrixQuestion__Group_4__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1544:1: ( ( rule__MatrixQuestion__Group_4__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1545:1: ( rule__MatrixQuestion__Group_4__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1546:1: ( rule__MatrixQuestion__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1546:2: rule__MatrixQuestion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__0_in_rule__MatrixQuestion__Group__4__Impl3109);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1556:1: rule__MatrixQuestion__Group__5 : rule__MatrixQuestion__Group__5__Impl ;
    public final void rule__MatrixQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1560:1: ( rule__MatrixQuestion__Group__5__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1561:2: rule__MatrixQuestion__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__53140);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1567:1: rule__MatrixQuestion__Group__5__Impl : ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) ) ;
    public final void rule__MatrixQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1571:1: ( ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1572:1: ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1572:1: ( ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1573:1: ( ( rule__MatrixQuestion__Group_5__0 ) ) ( ( rule__MatrixQuestion__Group_5__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1573:1: ( ( rule__MatrixQuestion__Group_5__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1574:1: ( rule__MatrixQuestion__Group_5__0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1575:1: ( rule__MatrixQuestion__Group_5__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1575:2: rule__MatrixQuestion__Group_5__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3169);
            rule__MatrixQuestion__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 

            }

            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1578:1: ( ( rule__MatrixQuestion__Group_5__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1579:1: ( rule__MatrixQuestion__Group_5__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1580:1: ( rule__MatrixQuestion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1580:2: rule__MatrixQuestion__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3181);
            	    rule__MatrixQuestion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1603:1: rule__MatrixQuestion__Group_4__0 : rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1 ;
    public final void rule__MatrixQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1607:1: ( rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1608:2: rule__MatrixQuestion__Group_4__0__Impl rule__MatrixQuestion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__0__Impl_in_rule__MatrixQuestion__Group_4__03226);
            rule__MatrixQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__1_in_rule__MatrixQuestion__Group_4__03229);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1615:1: rule__MatrixQuestion__Group_4__0__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) ) ;
    public final void rule__MatrixQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1619:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1620:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1620:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1621:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1622:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1622:2: rule__MatrixQuestion__ColumnNamesAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_0_in_rule__MatrixQuestion__Group_4__0__Impl3256);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1632:1: rule__MatrixQuestion__Group_4__1 : rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2 ;
    public final void rule__MatrixQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1636:1: ( rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1637:2: rule__MatrixQuestion__Group_4__1__Impl rule__MatrixQuestion__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__1__Impl_in_rule__MatrixQuestion__Group_4__13286);
            rule__MatrixQuestion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__2_in_rule__MatrixQuestion__Group_4__13289);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1644:1: rule__MatrixQuestion__Group_4__1__Impl : ( ( rule__MatrixQuestion__Group_4_1__0 )* ) ;
    public final void rule__MatrixQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1648:1: ( ( ( rule__MatrixQuestion__Group_4_1__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1649:1: ( ( rule__MatrixQuestion__Group_4_1__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1649:1: ( ( rule__MatrixQuestion__Group_4_1__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1650:1: ( rule__MatrixQuestion__Group_4_1__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_4_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1651:1: ( rule__MatrixQuestion__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1651:2: rule__MatrixQuestion__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__0_in_rule__MatrixQuestion__Group_4__1__Impl3316);
            	    rule__MatrixQuestion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1661:1: rule__MatrixQuestion__Group_4__2 : rule__MatrixQuestion__Group_4__2__Impl ;
    public final void rule__MatrixQuestion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1665:1: ( rule__MatrixQuestion__Group_4__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1666:2: rule__MatrixQuestion__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4__2__Impl_in_rule__MatrixQuestion__Group_4__23347);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1672:1: rule__MatrixQuestion__Group_4__2__Impl : ( ']' ) ;
    public final void rule__MatrixQuestion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1676:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1677:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1677:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1678:1: ']'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightSquareBracketKeyword_4_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MatrixQuestion__Group_4__2__Impl3375); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1697:1: rule__MatrixQuestion__Group_4_1__0 : rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1 ;
    public final void rule__MatrixQuestion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1701:1: ( rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1702:2: rule__MatrixQuestion__Group_4_1__0__Impl rule__MatrixQuestion__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__0__Impl_in_rule__MatrixQuestion__Group_4_1__03412);
            rule__MatrixQuestion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__1_in_rule__MatrixQuestion__Group_4_1__03415);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1709:1: rule__MatrixQuestion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MatrixQuestion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1713:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1714:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1714:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1715:1: ','
            {
             before(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_4_1_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MatrixQuestion__Group_4_1__0__Impl3443); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1728:1: rule__MatrixQuestion__Group_4_1__1 : rule__MatrixQuestion__Group_4_1__1__Impl ;
    public final void rule__MatrixQuestion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1732:1: ( rule__MatrixQuestion__Group_4_1__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1733:2: rule__MatrixQuestion__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_4_1__1__Impl_in_rule__MatrixQuestion__Group_4_1__13474);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1739:1: rule__MatrixQuestion__Group_4_1__1__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) ) ;
    public final void rule__MatrixQuestion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1743:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1744:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1744:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1745:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_4_1_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1746:1: ( rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1746:2: rule__MatrixQuestion__ColumnNamesAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_1_1_in_rule__MatrixQuestion__Group_4_1__1__Impl3501);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1760:1: rule__MatrixQuestion__Group_5__0 : rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1 ;
    public final void rule__MatrixQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1764:1: ( rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1765:2: rule__MatrixQuestion__Group_5__0__Impl rule__MatrixQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__0__Impl_in_rule__MatrixQuestion__Group_5__03535);
            rule__MatrixQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__1_in_rule__MatrixQuestion__Group_5__03538);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1772:1: rule__MatrixQuestion__Group_5__0__Impl : ( '-' ) ;
    public final void rule__MatrixQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1776:1: ( ( '-' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1777:1: ( '-' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1777:1: ( '-' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1778:1: '-'
            {
             before(grammarAccess.getMatrixQuestionAccess().getHyphenMinusKeyword_5_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MatrixQuestion__Group_5__0__Impl3566); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1791:1: rule__MatrixQuestion__Group_5__1 : rule__MatrixQuestion__Group_5__1__Impl ;
    public final void rule__MatrixQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1795:1: ( rule__MatrixQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1796:2: rule__MatrixQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_5__1__Impl_in_rule__MatrixQuestion__Group_5__13597);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1802:1: rule__MatrixQuestion__Group_5__1__Impl : ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) ) ;
    public final void rule__MatrixQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1806:1: ( ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1807:1: ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1807:1: ( ( rule__MatrixQuestion__RowNamesAssignment_5_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1808:1: ( rule__MatrixQuestion__RowNamesAssignment_5_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_5_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1809:1: ( rule__MatrixQuestion__RowNamesAssignment_5_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1809:2: rule__MatrixQuestion__RowNamesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__RowNamesAssignment_5_1_in_rule__MatrixQuestion__Group_5__1__Impl3624);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1823:1: rule__CalendarQuestion__Group__0 : rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 ;
    public final void rule__CalendarQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1827:1: ( rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1828:2: rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__03658);
            rule__CalendarQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__03661);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1835:1: rule__CalendarQuestion__Group__0__Impl : ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__CalendarQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1839:1: ( ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1840:1: ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1840:1: ( ( rule__CalendarQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1841:1: ( rule__CalendarQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1842:1: ( rule__CalendarQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1842:2: rule__CalendarQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__QuestionBaseAssignment_0_in_rule__CalendarQuestion__Group__0__Impl3688);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1852:1: rule__CalendarQuestion__Group__1 : rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 ;
    public final void rule__CalendarQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1856:1: ( rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1857:2: rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__13718);
            rule__CalendarQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__13721);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1864:1: rule__CalendarQuestion__Group__1__Impl : ( 'calendar[' ) ;
    public final void rule__CalendarQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1868:1: ( ( 'calendar[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1869:1: ( 'calendar[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1869:1: ( 'calendar[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1870:1: 'calendar['
            {
             before(grammarAccess.getCalendarQuestionAccess().getCalendarKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CalendarQuestion__Group__1__Impl3749); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1883:1: rule__CalendarQuestion__Group__2 : rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 ;
    public final void rule__CalendarQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1887:1: ( rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1888:2: rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__23780);
            rule__CalendarQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__23783);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1895:1: rule__CalendarQuestion__Group__2__Impl : ( ( rule__CalendarQuestion__Group_2__0 ) ) ;
    public final void rule__CalendarQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1899:1: ( ( ( rule__CalendarQuestion__Group_2__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1900:1: ( ( rule__CalendarQuestion__Group_2__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1900:1: ( ( rule__CalendarQuestion__Group_2__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1901:1: ( rule__CalendarQuestion__Group_2__0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1902:1: ( rule__CalendarQuestion__Group_2__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1902:2: rule__CalendarQuestion__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__0_in_rule__CalendarQuestion__Group__2__Impl3810);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1912:1: rule__CalendarQuestion__Group__3 : rule__CalendarQuestion__Group__3__Impl ;
    public final void rule__CalendarQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1916:1: ( rule__CalendarQuestion__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1917:2: rule__CalendarQuestion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__33840);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1923:1: rule__CalendarQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__CalendarQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1927:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1928:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1928:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1929:1: ']'
            {
             before(grammarAccess.getCalendarQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CalendarQuestion__Group__3__Impl3868); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1950:1: rule__CalendarQuestion__Group_2__0 : rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1 ;
    public final void rule__CalendarQuestion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1954:1: ( rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1955:2: rule__CalendarQuestion__Group_2__0__Impl rule__CalendarQuestion__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__0__Impl_in_rule__CalendarQuestion__Group_2__03907);
            rule__CalendarQuestion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__1_in_rule__CalendarQuestion__Group_2__03910);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1962:1: rule__CalendarQuestion__Group_2__0__Impl : ( ( rule__CalendarQuestion__YearAssignment_2_0 )? ) ;
    public final void rule__CalendarQuestion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1966:1: ( ( ( rule__CalendarQuestion__YearAssignment_2_0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1967:1: ( ( rule__CalendarQuestion__YearAssignment_2_0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1967:1: ( ( rule__CalendarQuestion__YearAssignment_2_0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1968:1: ( rule__CalendarQuestion__YearAssignment_2_0 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearAssignment_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1969:1: ( rule__CalendarQuestion__YearAssignment_2_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1969:2: rule__CalendarQuestion__YearAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__YearAssignment_2_0_in_rule__CalendarQuestion__Group_2__0__Impl3937);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1979:1: rule__CalendarQuestion__Group_2__1 : rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2 ;
    public final void rule__CalendarQuestion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1983:1: ( rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1984:2: rule__CalendarQuestion__Group_2__1__Impl rule__CalendarQuestion__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__1__Impl_in_rule__CalendarQuestion__Group_2__13968);
            rule__CalendarQuestion__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__2_in_rule__CalendarQuestion__Group_2__13971);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1991:1: rule__CalendarQuestion__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1995:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1996:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1996:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1997:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1998:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1999:2: ','
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CalendarQuestion__Group_2__1__Impl4000); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2010:1: rule__CalendarQuestion__Group_2__2 : rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3 ;
    public final void rule__CalendarQuestion__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2014:1: ( rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2015:2: rule__CalendarQuestion__Group_2__2__Impl rule__CalendarQuestion__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__2__Impl_in_rule__CalendarQuestion__Group_2__24033);
            rule__CalendarQuestion__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__3_in_rule__CalendarQuestion__Group_2__24036);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2022:1: rule__CalendarQuestion__Group_2__2__Impl : ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? ) ;
    public final void rule__CalendarQuestion__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2026:1: ( ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2027:1: ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2027:1: ( ( rule__CalendarQuestion__MonthAssignment_2_2 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2028:1: ( rule__CalendarQuestion__MonthAssignment_2_2 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2029:1: ( rule__CalendarQuestion__MonthAssignment_2_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2029:2: rule__CalendarQuestion__MonthAssignment_2_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MonthAssignment_2_2_in_rule__CalendarQuestion__Group_2__2__Impl4063);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2039:1: rule__CalendarQuestion__Group_2__3 : rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4 ;
    public final void rule__CalendarQuestion__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2043:1: ( rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2044:2: rule__CalendarQuestion__Group_2__3__Impl rule__CalendarQuestion__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__3__Impl_in_rule__CalendarQuestion__Group_2__34094);
            rule__CalendarQuestion__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__4_in_rule__CalendarQuestion__Group_2__34097);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2051:1: rule__CalendarQuestion__Group_2__3__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2055:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2056:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2056:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2057:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2058:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2059:2: ','
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CalendarQuestion__Group_2__3__Impl4126); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2070:1: rule__CalendarQuestion__Group_2__4 : rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5 ;
    public final void rule__CalendarQuestion__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2074:1: ( rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2075:2: rule__CalendarQuestion__Group_2__4__Impl rule__CalendarQuestion__Group_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__4__Impl_in_rule__CalendarQuestion__Group_2__44159);
            rule__CalendarQuestion__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__5_in_rule__CalendarQuestion__Group_2__44162);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2082:1: rule__CalendarQuestion__Group_2__4__Impl : ( ( rule__CalendarQuestion__DayAssignment_2_4 )? ) ;
    public final void rule__CalendarQuestion__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2086:1: ( ( ( rule__CalendarQuestion__DayAssignment_2_4 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2087:1: ( ( rule__CalendarQuestion__DayAssignment_2_4 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2087:1: ( ( rule__CalendarQuestion__DayAssignment_2_4 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2088:1: ( rule__CalendarQuestion__DayAssignment_2_4 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayAssignment_2_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2089:1: ( rule__CalendarQuestion__DayAssignment_2_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2089:2: rule__CalendarQuestion__DayAssignment_2_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__DayAssignment_2_4_in_rule__CalendarQuestion__Group_2__4__Impl4189);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2099:1: rule__CalendarQuestion__Group_2__5 : rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6 ;
    public final void rule__CalendarQuestion__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2103:1: ( rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2104:2: rule__CalendarQuestion__Group_2__5__Impl rule__CalendarQuestion__Group_2__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__5__Impl_in_rule__CalendarQuestion__Group_2__54220);
            rule__CalendarQuestion__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__6_in_rule__CalendarQuestion__Group_2__54223);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2111:1: rule__CalendarQuestion__Group_2__5__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2115:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2116:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2116:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2117:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2118:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2119:2: ','
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CalendarQuestion__Group_2__5__Impl4252); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2130:1: rule__CalendarQuestion__Group_2__6 : rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7 ;
    public final void rule__CalendarQuestion__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2134:1: ( rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2135:2: rule__CalendarQuestion__Group_2__6__Impl rule__CalendarQuestion__Group_2__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__6__Impl_in_rule__CalendarQuestion__Group_2__64285);
            rule__CalendarQuestion__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__7_in_rule__CalendarQuestion__Group_2__64288);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2142:1: rule__CalendarQuestion__Group_2__6__Impl : ( ( rule__CalendarQuestion__HourAssignment_2_6 )? ) ;
    public final void rule__CalendarQuestion__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2146:1: ( ( ( rule__CalendarQuestion__HourAssignment_2_6 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2147:1: ( ( rule__CalendarQuestion__HourAssignment_2_6 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2147:1: ( ( rule__CalendarQuestion__HourAssignment_2_6 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2148:1: ( rule__CalendarQuestion__HourAssignment_2_6 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourAssignment_2_6()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2149:1: ( rule__CalendarQuestion__HourAssignment_2_6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2149:2: rule__CalendarQuestion__HourAssignment_2_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__HourAssignment_2_6_in_rule__CalendarQuestion__Group_2__6__Impl4315);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2159:1: rule__CalendarQuestion__Group_2__7 : rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8 ;
    public final void rule__CalendarQuestion__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2163:1: ( rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2164:2: rule__CalendarQuestion__Group_2__7__Impl rule__CalendarQuestion__Group_2__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__7__Impl_in_rule__CalendarQuestion__Group_2__74346);
            rule__CalendarQuestion__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__8_in_rule__CalendarQuestion__Group_2__74349);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2171:1: rule__CalendarQuestion__Group_2__7__Impl : ( ( ',' )? ) ;
    public final void rule__CalendarQuestion__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2175:1: ( ( ( ',' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2176:1: ( ( ',' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2176:1: ( ( ',' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2177:1: ( ',' )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2178:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2179:2: ','
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__CalendarQuestion__Group_2__7__Impl4378); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2190:1: rule__CalendarQuestion__Group_2__8 : rule__CalendarQuestion__Group_2__8__Impl ;
    public final void rule__CalendarQuestion__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2194:1: ( rule__CalendarQuestion__Group_2__8__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2195:2: rule__CalendarQuestion__Group_2__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_2__8__Impl_in_rule__CalendarQuestion__Group_2__84411);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2201:1: rule__CalendarQuestion__Group_2__8__Impl : ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? ) ;
    public final void rule__CalendarQuestion__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2205:1: ( ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2206:1: ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2206:1: ( ( rule__CalendarQuestion__MinuteAssignment_2_8 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2207:1: ( rule__CalendarQuestion__MinuteAssignment_2_8 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_2_8()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2208:1: ( rule__CalendarQuestion__MinuteAssignment_2_8 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2208:2: rule__CalendarQuestion__MinuteAssignment_2_8
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MinuteAssignment_2_8_in_rule__CalendarQuestion__Group_2__8__Impl4438);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2236:1: rule__IntegerQuestion__Group__0 : rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 ;
    public final void rule__IntegerQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2240:1: ( rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2241:2: rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__04487);
            rule__IntegerQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__04490);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2248:1: rule__IntegerQuestion__Group__0__Impl : ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) ) ;
    public final void rule__IntegerQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2252:1: ( ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2253:1: ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2253:1: ( ( rule__IntegerQuestion__QuestionBaseAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2254:1: ( rule__IntegerQuestion__QuestionBaseAssignment_0 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getQuestionBaseAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2255:1: ( rule__IntegerQuestion__QuestionBaseAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2255:2: rule__IntegerQuestion__QuestionBaseAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__QuestionBaseAssignment_0_in_rule__IntegerQuestion__Group__0__Impl4517);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2265:1: rule__IntegerQuestion__Group__1 : rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 ;
    public final void rule__IntegerQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2269:1: ( rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2270:2: rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__14547);
            rule__IntegerQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__14550);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2277:1: rule__IntegerQuestion__Group__1__Impl : ( 'number[' ) ;
    public final void rule__IntegerQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2281:1: ( ( 'number[' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2282:1: ( 'number[' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2282:1: ( 'number[' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2283:1: 'number['
            {
             before(grammarAccess.getIntegerQuestionAccess().getNumberKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__IntegerQuestion__Group__1__Impl4578); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2296:1: rule__IntegerQuestion__Group__2 : rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 ;
    public final void rule__IntegerQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2300:1: ( rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2301:2: rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__24609);
            rule__IntegerQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__24612);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2308:1: rule__IntegerQuestion__Group__2__Impl : ( ( rule__IntegerQuestion__MinValueAssignment_2 ) ) ;
    public final void rule__IntegerQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2312:1: ( ( ( rule__IntegerQuestion__MinValueAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2313:1: ( ( rule__IntegerQuestion__MinValueAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2313:1: ( ( rule__IntegerQuestion__MinValueAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2314:1: ( rule__IntegerQuestion__MinValueAssignment_2 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2315:1: ( rule__IntegerQuestion__MinValueAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2315:2: rule__IntegerQuestion__MinValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MinValueAssignment_2_in_rule__IntegerQuestion__Group__2__Impl4639);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2325:1: rule__IntegerQuestion__Group__3 : rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 ;
    public final void rule__IntegerQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2329:1: ( rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2330:2: rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__34669);
            rule__IntegerQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__34672);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2337:1: rule__IntegerQuestion__Group__3__Impl : ( 'to' ) ;
    public final void rule__IntegerQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2341:1: ( ( 'to' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2342:1: ( 'to' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2342:1: ( 'to' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2343:1: 'to'
            {
             before(grammarAccess.getIntegerQuestionAccess().getToKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IntegerQuestion__Group__3__Impl4700); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2356:1: rule__IntegerQuestion__Group__4 : rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 ;
    public final void rule__IntegerQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2360:1: ( rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2361:2: rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__44731);
            rule__IntegerQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__44734);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2368:1: rule__IntegerQuestion__Group__4__Impl : ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) ) ;
    public final void rule__IntegerQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2372:1: ( ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2373:1: ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2373:1: ( ( rule__IntegerQuestion__MaxValueAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2374:1: ( rule__IntegerQuestion__MaxValueAssignment_4 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2375:1: ( rule__IntegerQuestion__MaxValueAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2375:2: rule__IntegerQuestion__MaxValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MaxValueAssignment_4_in_rule__IntegerQuestion__Group__4__Impl4761);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2385:1: rule__IntegerQuestion__Group__5 : rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 ;
    public final void rule__IntegerQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2389:1: ( rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2390:2: rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__54791);
            rule__IntegerQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__54794);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2397:1: rule__IntegerQuestion__Group__5__Impl : ( ( rule__IntegerQuestion__Group_5__0 )? ) ;
    public final void rule__IntegerQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2401:1: ( ( ( rule__IntegerQuestion__Group_5__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2402:1: ( ( rule__IntegerQuestion__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2402:1: ( ( rule__IntegerQuestion__Group_5__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2403:1: ( rule__IntegerQuestion__Group_5__0 )?
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2404:1: ( rule__IntegerQuestion__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2404:2: rule__IntegerQuestion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__0_in_rule__IntegerQuestion__Group__5__Impl4821);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2414:1: rule__IntegerQuestion__Group__6 : rule__IntegerQuestion__Group__6__Impl ;
    public final void rule__IntegerQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2418:1: ( rule__IntegerQuestion__Group__6__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2419:2: rule__IntegerQuestion__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__64852);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2425:1: rule__IntegerQuestion__Group__6__Impl : ( ']' ) ;
    public final void rule__IntegerQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2429:1: ( ( ']' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2430:1: ( ']' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2430:1: ( ']' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2431:1: ']'
            {
             before(grammarAccess.getIntegerQuestionAccess().getRightSquareBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerQuestion__Group__6__Impl4880); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2458:1: rule__IntegerQuestion__Group_5__0 : rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1 ;
    public final void rule__IntegerQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2462:1: ( rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2463:2: rule__IntegerQuestion__Group_5__0__Impl rule__IntegerQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__0__Impl_in_rule__IntegerQuestion__Group_5__04925);
            rule__IntegerQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__1_in_rule__IntegerQuestion__Group_5__04928);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2470:1: rule__IntegerQuestion__Group_5__0__Impl : ( 'step' ) ;
    public final void rule__IntegerQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2474:1: ( ( 'step' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2475:1: ( 'step' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2475:1: ( 'step' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2476:1: 'step'
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntegerQuestion__Group_5__0__Impl4956); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2489:1: rule__IntegerQuestion__Group_5__1 : rule__IntegerQuestion__Group_5__1__Impl ;
    public final void rule__IntegerQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2493:1: ( rule__IntegerQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2494:2: rule__IntegerQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_5__1__Impl_in_rule__IntegerQuestion__Group_5__14987);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2500:1: rule__IntegerQuestion__Group_5__1__Impl : ( ( rule__IntegerQuestion__StepAssignment_5_1 ) ) ;
    public final void rule__IntegerQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2504:1: ( ( ( rule__IntegerQuestion__StepAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2505:1: ( ( rule__IntegerQuestion__StepAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2505:1: ( ( rule__IntegerQuestion__StepAssignment_5_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2506:1: ( rule__IntegerQuestion__StepAssignment_5_1 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepAssignment_5_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2507:1: ( rule__IntegerQuestion__StepAssignment_5_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2507:2: rule__IntegerQuestion__StepAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__StepAssignment_5_1_in_rule__IntegerQuestion__Group_5__1__Impl5014);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2521:1: rule__QuestionCondition__Group__0 : rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1 ;
    public final void rule__QuestionCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2525:1: ( rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2526:2: rule__QuestionCondition__Group__0__Impl rule__QuestionCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__0__Impl_in_rule__QuestionCondition__Group__05048);
            rule__QuestionCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__1_in_rule__QuestionCondition__Group__05051);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2533:1: rule__QuestionCondition__Group__0__Impl : ( '{' ) ;
    public final void rule__QuestionCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2537:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2538:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2538:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2539:1: '{'
            {
             before(grammarAccess.getQuestionConditionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__QuestionCondition__Group__0__Impl5079); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2552:1: rule__QuestionCondition__Group__1 : rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2 ;
    public final void rule__QuestionCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2556:1: ( rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2557:2: rule__QuestionCondition__Group__1__Impl rule__QuestionCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__1__Impl_in_rule__QuestionCondition__Group__15110);
            rule__QuestionCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__2_in_rule__QuestionCondition__Group__15113);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2564:1: rule__QuestionCondition__Group__1__Impl : ( ( rule__QuestionCondition__OptionAssignment_1 ) ) ;
    public final void rule__QuestionCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2568:1: ( ( ( rule__QuestionCondition__OptionAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2569:1: ( ( rule__QuestionCondition__OptionAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2569:1: ( ( rule__QuestionCondition__OptionAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2570:1: ( rule__QuestionCondition__OptionAssignment_1 )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2571:1: ( rule__QuestionCondition__OptionAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2571:2: rule__QuestionCondition__OptionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__OptionAssignment_1_in_rule__QuestionCondition__Group__1__Impl5140);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2581:1: rule__QuestionCondition__Group__2 : rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3 ;
    public final void rule__QuestionCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2585:1: ( rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2586:2: rule__QuestionCondition__Group__2__Impl rule__QuestionCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__2__Impl_in_rule__QuestionCondition__Group__25170);
            rule__QuestionCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__3_in_rule__QuestionCondition__Group__25173);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2593:1: rule__QuestionCondition__Group__2__Impl : ( ( rule__QuestionCondition__Group_2__0 )* ) ;
    public final void rule__QuestionCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2597:1: ( ( ( rule__QuestionCondition__Group_2__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2598:1: ( ( rule__QuestionCondition__Group_2__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2598:1: ( ( rule__QuestionCondition__Group_2__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2599:1: ( rule__QuestionCondition__Group_2__0 )*
            {
             before(grammarAccess.getQuestionConditionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2600:1: ( rule__QuestionCondition__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2600:2: rule__QuestionCondition__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__0_in_rule__QuestionCondition__Group__2__Impl5200);
            	    rule__QuestionCondition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2610:1: rule__QuestionCondition__Group__3 : rule__QuestionCondition__Group__3__Impl ;
    public final void rule__QuestionCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2614:1: ( rule__QuestionCondition__Group__3__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2615:2: rule__QuestionCondition__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group__3__Impl_in_rule__QuestionCondition__Group__35231);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2621:1: rule__QuestionCondition__Group__3__Impl : ( '}' ) ;
    public final void rule__QuestionCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2625:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2626:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2626:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2627:1: '}'
            {
             before(grammarAccess.getQuestionConditionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__QuestionCondition__Group__3__Impl5259); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2648:1: rule__QuestionCondition__Group_2__0 : rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1 ;
    public final void rule__QuestionCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2652:1: ( rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2653:2: rule__QuestionCondition__Group_2__0__Impl rule__QuestionCondition__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__0__Impl_in_rule__QuestionCondition__Group_2__05298);
            rule__QuestionCondition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__1_in_rule__QuestionCondition__Group_2__05301);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2660:1: rule__QuestionCondition__Group_2__0__Impl : ( '/' ) ;
    public final void rule__QuestionCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2664:1: ( ( '/' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2665:1: ( '/' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2665:1: ( '/' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2666:1: '/'
            {
             before(grammarAccess.getQuestionConditionAccess().getSolidusKeyword_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__QuestionCondition__Group_2__0__Impl5329); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2679:1: rule__QuestionCondition__Group_2__1 : rule__QuestionCondition__Group_2__1__Impl ;
    public final void rule__QuestionCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2683:1: ( rule__QuestionCondition__Group_2__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2684:2: rule__QuestionCondition__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__Group_2__1__Impl_in_rule__QuestionCondition__Group_2__15360);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2690:1: rule__QuestionCondition__Group_2__1__Impl : ( ( rule__QuestionCondition__OptionAssignment_2_1 ) ) ;
    public final void rule__QuestionCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2694:1: ( ( ( rule__QuestionCondition__OptionAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2695:1: ( ( rule__QuestionCondition__OptionAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2695:1: ( ( rule__QuestionCondition__OptionAssignment_2_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2696:1: ( rule__QuestionCondition__OptionAssignment_2_1 )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionAssignment_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2697:1: ( rule__QuestionCondition__OptionAssignment_2_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2697:2: rule__QuestionCondition__OptionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionCondition__OptionAssignment_2_1_in_rule__QuestionCondition__Group_2__1__Impl5387);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2711:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2715:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2716:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05421);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05424);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2723:1: rule__Option__Group__0__Impl : ( '-' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2727:1: ( ( '-' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2728:1: ( '-' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2728:1: ( '-' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2729:1: '-'
            {
             before(grammarAccess.getOptionAccess().getHyphenMinusKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Option__Group__0__Impl5452); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2742:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2746:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2747:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15483);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15486);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2754:1: rule__Option__Group__1__Impl : ( ( rule__Option__TextAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2758:1: ( ( ( rule__Option__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2759:1: ( ( rule__Option__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2759:1: ( ( rule__Option__TextAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2760:1: ( rule__Option__TextAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2761:1: ( rule__Option__TextAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2761:2: rule__Option__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__TextAssignment_1_in_rule__Option__Group__1__Impl5513);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2771:1: rule__Option__Group__2 : rule__Option__Group__2__Impl ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2775:1: ( rule__Option__Group__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2776:2: rule__Option__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25543);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2782:1: rule__Option__Group__2__Impl : ( ( rule__Option__Group_2__0 )? ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2786:1: ( ( ( rule__Option__Group_2__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2787:1: ( ( rule__Option__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2787:1: ( ( rule__Option__Group_2__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2788:1: ( rule__Option__Group_2__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2789:1: ( rule__Option__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2789:2: rule__Option__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl5570);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2805:1: rule__Option__Group_2__0 : rule__Option__Group_2__0__Impl rule__Option__Group_2__1 ;
    public final void rule__Option__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2809:1: ( rule__Option__Group_2__0__Impl rule__Option__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2810:2: rule__Option__Group_2__0__Impl rule__Option__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__05607);
            rule__Option__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__05610);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2817:1: rule__Option__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Option__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2821:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2822:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2822:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2823:1: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Option__Group_2__0__Impl5638); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2836:1: rule__Option__Group_2__1 : rule__Option__Group_2__1__Impl rule__Option__Group_2__2 ;
    public final void rule__Option__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2840:1: ( rule__Option__Group_2__1__Impl rule__Option__Group_2__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2841:2: rule__Option__Group_2__1__Impl rule__Option__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__15669);
            rule__Option__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__2_in_rule__Option__Group_2__15672);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2848:1: rule__Option__Group_2__1__Impl : ( ( rule__Option__NameAssignment_2_1 ) ) ;
    public final void rule__Option__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2852:1: ( ( ( rule__Option__NameAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2853:1: ( ( rule__Option__NameAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2853:1: ( ( rule__Option__NameAssignment_2_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2854:1: ( rule__Option__NameAssignment_2_1 )
            {
             before(grammarAccess.getOptionAccess().getNameAssignment_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2855:1: ( rule__Option__NameAssignment_2_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2855:2: rule__Option__NameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__NameAssignment_2_1_in_rule__Option__Group_2__1__Impl5699);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2865:1: rule__Option__Group_2__2 : rule__Option__Group_2__2__Impl ;
    public final void rule__Option__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2869:1: ( rule__Option__Group_2__2__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2870:2: rule__Option__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__2__Impl_in_rule__Option__Group_2__25729);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2876:1: rule__Option__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Option__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2880:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2881:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2881:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2882:1: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Option__Group_2__2__Impl5757); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2901:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2905:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2906:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05794);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05797);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2913:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2917:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2918:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2918:1: ( ( '-' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2919:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2920:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2921:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EInt__Group__0__Impl5826); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2932:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2936:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2937:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15859);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2943:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2947:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2948:1: ( RULE_INT )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2948:1: ( RULE_INT )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2949:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5886); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2965:1: rule__Questionaire__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Questionaire__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2969:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2970:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2970:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2971:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_05924);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2980:1: rule__Questionaire__ResultEmailAssignment_2 : ( ruleEString ) ;
    public final void rule__Questionaire__ResultEmailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2984:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2985:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2985:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2986:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_25955);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2995:1: rule__Questionaire__ElementsAssignment_3_0 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2999:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3000:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3000:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3001:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_05986);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3010:1: rule__Questionaire__ElementsAssignment_3_1 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3014:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3015:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3015:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3016:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_16017);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3025:1: rule__Heading__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Heading__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3029:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3030:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3030:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3031:1: ruleEString
            {
             before(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Heading__TextAssignment_16048);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3040:1: rule__Paragraph__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3044:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3045:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3045:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3046:1: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_16079);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3055:1: rule__QuestionBase__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QuestionBase__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3059:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3060:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3060:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3061:1: ruleEString
            {
             before(grammarAccess.getQuestionBaseAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionBase__TitleAssignment_16110);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3070:1: rule__QuestionBase__MandatoryAssignment_2 : ( ( '*' ) ) ;
    public final void rule__QuestionBase__MandatoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3074:1: ( ( ( '*' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3075:1: ( ( '*' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3075:1: ( ( '*' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3076:1: ( '*' )
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3077:1: ( '*' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3078:1: '*'
            {
             before(grammarAccess.getQuestionBaseAccess().getMandatoryAsteriskKeyword_2_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__QuestionBase__MandatoryAssignment_26146); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3093:1: rule__QuestionBase__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__QuestionBase__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3097:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3098:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3098:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3099:1: ruleEString
            {
             before(grammarAccess.getQuestionBaseAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionBase__DescriptionAssignment_36185);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3108:1: rule__QuestionBase__ConditionsAssignment_4 : ( ruleQuestionCondition ) ;
    public final void rule__QuestionBase__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3112:1: ( ( ruleQuestionCondition ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3113:1: ( ruleQuestionCondition )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3113:1: ( ruleQuestionCondition )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3114:1: ruleQuestionCondition
            {
             before(grammarAccess.getQuestionBaseAccess().getConditionsQuestionConditionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionCondition_in_rule__QuestionBase__ConditionsAssignment_46216);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3123:1: rule__TextQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__TextQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3127:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3128:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3128:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3129:1: ruleQuestionBase
            {
             before(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__TextQuestion__QuestionBaseAssignment_06247);
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


    // $ANTLR start "rule__TextQuestion__MultilineAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3138:1: rule__TextQuestion__MultilineAssignment_2 : ( ( 'long' ) ) ;
    public final void rule__TextQuestion__MultilineAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3142:1: ( ( ( 'long' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3143:1: ( ( 'long' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3143:1: ( ( 'long' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3144:1: ( 'long' )
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3145:1: ( 'long' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3146:1: 'long'
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TextQuestion__MultilineAssignment_26283); 
             after(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0()); 

            }

             after(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0()); 

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
    // $ANTLR end "rule__TextQuestion__MultilineAssignment_2"


    // $ANTLR start "rule__ChoiceQuestion__QuestionBaseAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3161:1: rule__ChoiceQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__ChoiceQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3165:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3166:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3166:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3167:1: ruleQuestionBase
            {
             before(grammarAccess.getChoiceQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__ChoiceQuestion__QuestionBaseAssignment_06322);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3176:1: rule__ChoiceQuestion__MinSelectionsAssignment_2_0 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MinSelectionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3180:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3181:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3181:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3182:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_06353);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3191:1: rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3195:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3196:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3196:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3197:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_06384);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3206:1: rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3210:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3211:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3211:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3212:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_26415);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3221:1: rule__ChoiceQuestion__OptionsAssignment_4 : ( ruleOption ) ;
    public final void rule__ChoiceQuestion__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3225:1: ( ( ruleOption ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3226:1: ( ruleOption )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3226:1: ( ruleOption )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3227:1: ruleOption
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_46446);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3236:1: rule__MatrixQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__MatrixQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3240:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3241:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3241:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3242:1: ruleQuestionBase
            {
             before(grammarAccess.getMatrixQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__MatrixQuestion__QuestionBaseAssignment_06477);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3251:1: rule__MatrixQuestion__MaxPerRowAssignment_2 : ( ruleEInt ) ;
    public final void rule__MatrixQuestion__MaxPerRowAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3255:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3256:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3256:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3257:1: ruleEInt
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_26508);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3266:1: rule__MatrixQuestion__ColumnNamesAssignment_4_0 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3270:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3271:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3271:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3272:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_06539);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3281:1: rule__MatrixQuestion__ColumnNamesAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3285:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3286:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3286:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3287:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_1_16570);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3296:1: rule__MatrixQuestion__RowNamesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__RowNamesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3300:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3301:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3301:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3302:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_5_16601);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3311:1: rule__CalendarQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__CalendarQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3315:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3316:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3316:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3317:1: ruleQuestionBase
            {
             before(grammarAccess.getCalendarQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__CalendarQuestion__QuestionBaseAssignment_06632);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3326:1: rule__CalendarQuestion__YearAssignment_2_0 : ( ( 'year' ) ) ;
    public final void rule__CalendarQuestion__YearAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3330:1: ( ( ( 'year' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3331:1: ( ( 'year' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3331:1: ( ( 'year' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3332:1: ( 'year' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3333:1: ( 'year' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3334:1: 'year'
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_2_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__CalendarQuestion__YearAssignment_2_06668); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3349:1: rule__CalendarQuestion__MonthAssignment_2_2 : ( ( 'month' ) ) ;
    public final void rule__CalendarQuestion__MonthAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3353:1: ( ( ( 'month' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3354:1: ( ( 'month' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3354:1: ( ( 'month' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3355:1: ( 'month' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3356:1: ( 'month' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3357:1: 'month'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_2_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__CalendarQuestion__MonthAssignment_2_26712); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3372:1: rule__CalendarQuestion__DayAssignment_2_4 : ( ( 'day' ) ) ;
    public final void rule__CalendarQuestion__DayAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3376:1: ( ( ( 'day' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3377:1: ( ( 'day' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3377:1: ( ( 'day' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3378:1: ( 'day' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3379:1: ( 'day' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3380:1: 'day'
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_2_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__CalendarQuestion__DayAssignment_2_46756); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3395:1: rule__CalendarQuestion__HourAssignment_2_6 : ( ( 'hour' ) ) ;
    public final void rule__CalendarQuestion__HourAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3399:1: ( ( ( 'hour' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3400:1: ( ( 'hour' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3400:1: ( ( 'hour' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3401:1: ( 'hour' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3402:1: ( 'hour' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3403:1: 'hour'
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_2_6_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__CalendarQuestion__HourAssignment_2_66800); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3418:1: rule__CalendarQuestion__MinuteAssignment_2_8 : ( ( 'minute' ) ) ;
    public final void rule__CalendarQuestion__MinuteAssignment_2_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3422:1: ( ( ( 'minute' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3423:1: ( ( 'minute' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3423:1: ( ( 'minute' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3424:1: ( 'minute' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3425:1: ( 'minute' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3426:1: 'minute'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_2_8_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__CalendarQuestion__MinuteAssignment_2_86844); 
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3441:1: rule__IntegerQuestion__QuestionBaseAssignment_0 : ( ruleQuestionBase ) ;
    public final void rule__IntegerQuestion__QuestionBaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3445:1: ( ( ruleQuestionBase ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3446:1: ( ruleQuestionBase )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3446:1: ( ruleQuestionBase )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3447:1: ruleQuestionBase
            {
             before(grammarAccess.getIntegerQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestionBase_in_rule__IntegerQuestion__QuestionBaseAssignment_06883);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3456:1: rule__IntegerQuestion__MinValueAssignment_2 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MinValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3460:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3461:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3461:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3462:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_26914);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3471:1: rule__IntegerQuestion__MaxValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MaxValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3475:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3476:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3476:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3477:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_46945);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3486:1: rule__IntegerQuestion__StepAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__StepAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3490:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3491:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3491:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3492:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_5_16976);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3501:1: rule__QuestionCondition__OptionAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCondition__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3505:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3506:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3506:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3507:1: ( ruleEString )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3508:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3509:1: ruleEString
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_17011);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3520:1: rule__QuestionCondition__OptionAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QuestionCondition__OptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3524:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3525:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3525:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3526:1: ( ruleEString )
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionCrossReference_2_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3527:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3528:1: ruleEString
            {
             before(grammarAccess.getQuestionConditionAccess().getOptionOptionEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_2_17050);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3539:1: rule__Option__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Option__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3543:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3544:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3544:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3545:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__TextAssignment_17085);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3554:1: rule__Option__NameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Option__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3558:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3559:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3559:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3560:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__NameAssignment_2_17116);
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
        "\1\14\2\uffff\4\4\2\17\1\4\5\uffff\2\33\1\4\1\17\2\33";
    static final String DFA1_maxS =
        "\1\16\2\uffff\1\5\2\35\3\32\1\5\5\uffff\2\34\1\5\1\32\2\34";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\4\1\7\1\3\1\5\1\6\6\uffff";
    static final String DFA1_specialS =
        "\25\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\1\3",
            "",
            "",
            "\1\4\1\5",
            "\1\7\1\10\11\uffff\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff"+
            "\1\16\1\13\1\uffff\1\11\2\uffff\1\6",
            "\1\7\1\10\11\uffff\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff"+
            "\1\16\1\13\1\uffff\1\11\2\uffff\1\6",
            "\1\7\1\10\11\uffff\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff"+
            "\1\16\1\13\1\uffff\1\11",
            "\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff\1\16\1\13\1\uffff"+
            "\1\11",
            "\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff\1\16\1\13\1\uffff"+
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
            "\1\14\1\uffff\1\12\1\uffff\1\15\3\uffff\1\16\1\13\1\uffff"+
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
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_0_in_rule__ChoiceQuestion__Alternatives_21095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__0_in_rule__ChoiceQuestion__Alternatives_21113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__01145 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__01148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__NameAssignment_0_in_rule__Questionaire__Group__0__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11205 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Questionaire__Group__1__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21267 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ResultEmailAssignment_2_in_rule__Questionaire__Group__2__Impl1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__0_in_rule__Questionaire__Group__3__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__0__Impl_in_rule__Questionaire__Group_3__01393 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__1_in_rule__Questionaire__Group_3__01396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_3_0_in_rule__Questionaire__Group_3__0__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_3__1__Impl_in_rule__Questionaire__Group_3__11453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_3_1_in_rule__Questionaire__Group_3__1__Impl1480 = new BitSet(new long[]{0x0000000000007002L});
        public static final BitSet FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Heading__Group__0__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__TextAssignment_1_in_rule__Heading__Group__1__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__01638 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__01641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Paragraph__Group__0__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__11700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__TextAssignment_1_in_rule__Paragraph__Group__1__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__0__Impl_in_rule__QuestionBase__Group__01761 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__1_in_rule__QuestionBase__Group__01764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QuestionBase__Group__0__Impl1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__1__Impl_in_rule__QuestionBase__Group__11823 = new BitSet(new long[]{0x0000000024000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__2_in_rule__QuestionBase__Group__11826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__TitleAssignment_1_in_rule__QuestionBase__Group__1__Impl1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__2__Impl_in_rule__QuestionBase__Group__21883 = new BitSet(new long[]{0x0000000024000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__3_in_rule__QuestionBase__Group__21886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__MandatoryAssignment_2_in_rule__QuestionBase__Group__2__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__3__Impl_in_rule__QuestionBase__Group__31944 = new BitSet(new long[]{0x0000000024000030L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__4_in_rule__QuestionBase__Group__31947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__DescriptionAssignment_3_in_rule__QuestionBase__Group__3__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__Group__4__Impl_in_rule__QuestionBase__Group__42005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionBase__ConditionsAssignment_4_in_rule__QuestionBase__Group__4__Impl2032 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02073 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__QuestionBaseAssignment_0_in_rule__TextQuestion__Group__0__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12133 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TextQuestion__Group__1__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22195 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__MultilineAssignment_2_in_rule__TextQuestion__Group__2__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TextQuestion__Group__3__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02322 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__QuestionBaseAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__12382 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__12385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ChoiceQuestion__Group__1__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__22444 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__22447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Alternatives_2_in_rule__ChoiceQuestion__Group__2__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__32504 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__32507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ChoiceQuestion__Group__3__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__42566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2595 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl2607 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__0__Impl_in_rule__ChoiceQuestion__Group_2_1__02650 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__1_in_rule__ChoiceQuestion__Group_2_1__02653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_0_in_rule__ChoiceQuestion__Group_2_1__0__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__1__Impl_in_rule__ChoiceQuestion__Group_2_1__12710 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__2_in_rule__ChoiceQuestion__Group_2_1__12713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ChoiceQuestion__Group_2_1__1__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_2_1__2__Impl_in_rule__ChoiceQuestion__Group_2_1__22772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_2_in_rule__ChoiceQuestion__Group_2_1__2__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__02835 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__02838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__QuestionBaseAssignment_0_in_rule__MatrixQuestion__Group__0__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__12895 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__12898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MatrixQuestion__Group__1__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__22957 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__22960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_2_in_rule__MatrixQuestion__Group__2__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__33017 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__33020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MatrixQuestion__Group__3__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__43079 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__43082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__0_in_rule__MatrixQuestion__Group__4__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__53140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3169 = new BitSet(new long[]{0x0000000000400032L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0_in_rule__MatrixQuestion__Group__5__Impl3181 = new BitSet(new long[]{0x0000000000400032L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__0__Impl_in_rule__MatrixQuestion__Group_4__03226 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__1_in_rule__MatrixQuestion__Group_4__03229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_0_in_rule__MatrixQuestion__Group_4__0__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__1__Impl_in_rule__MatrixQuestion__Group_4__13286 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__2_in_rule__MatrixQuestion__Group_4__13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__0_in_rule__MatrixQuestion__Group_4__1__Impl3316 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4__2__Impl_in_rule__MatrixQuestion__Group_4__23347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MatrixQuestion__Group_4__2__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__0__Impl_in_rule__MatrixQuestion__Group_4_1__03412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__1_in_rule__MatrixQuestion__Group_4_1__03415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MatrixQuestion__Group_4_1__0__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_4_1__1__Impl_in_rule__MatrixQuestion__Group_4_1__13474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_4_1_1_in_rule__MatrixQuestion__Group_4_1__1__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__0__Impl_in_rule__MatrixQuestion__Group_5__03535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__1_in_rule__MatrixQuestion__Group_5__03538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MatrixQuestion__Group_5__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_5__1__Impl_in_rule__MatrixQuestion__Group_5__13597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__RowNamesAssignment_5_1_in_rule__MatrixQuestion__Group_5__1__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__03658 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__03661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__QuestionBaseAssignment_0_in_rule__CalendarQuestion__Group__0__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__13718 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__13721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CalendarQuestion__Group__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__23780 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__23783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__0_in_rule__CalendarQuestion__Group__2__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__33840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CalendarQuestion__Group__3__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__0__Impl_in_rule__CalendarQuestion__Group_2__03907 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__1_in_rule__CalendarQuestion__Group_2__03910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__YearAssignment_2_0_in_rule__CalendarQuestion__Group_2__0__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__1__Impl_in_rule__CalendarQuestion__Group_2__13968 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__2_in_rule__CalendarQuestion__Group_2__13971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CalendarQuestion__Group_2__1__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__2__Impl_in_rule__CalendarQuestion__Group_2__24033 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__3_in_rule__CalendarQuestion__Group_2__24036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MonthAssignment_2_2_in_rule__CalendarQuestion__Group_2__2__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__3__Impl_in_rule__CalendarQuestion__Group_2__34094 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__4_in_rule__CalendarQuestion__Group_2__34097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CalendarQuestion__Group_2__3__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__4__Impl_in_rule__CalendarQuestion__Group_2__44159 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__5_in_rule__CalendarQuestion__Group_2__44162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__DayAssignment_2_4_in_rule__CalendarQuestion__Group_2__4__Impl4189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__5__Impl_in_rule__CalendarQuestion__Group_2__54220 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__6_in_rule__CalendarQuestion__Group_2__54223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CalendarQuestion__Group_2__5__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__6__Impl_in_rule__CalendarQuestion__Group_2__64285 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__7_in_rule__CalendarQuestion__Group_2__64288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__HourAssignment_2_6_in_rule__CalendarQuestion__Group_2__6__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__7__Impl_in_rule__CalendarQuestion__Group_2__74346 = new BitSet(new long[]{0x0000000F80200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__8_in_rule__CalendarQuestion__Group_2__74349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CalendarQuestion__Group_2__7__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_2__8__Impl_in_rule__CalendarQuestion__Group_2__84411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MinuteAssignment_2_8_in_rule__CalendarQuestion__Group_2__8__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__04487 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__QuestionBaseAssignment_0_in_rule__IntegerQuestion__Group__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__14547 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__14550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__IntegerQuestion__Group__1__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__24609 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__24612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MinValueAssignment_2_in_rule__IntegerQuestion__Group__2__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__34669 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__34672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IntegerQuestion__Group__3__Impl4700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__44731 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__44734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MaxValueAssignment_4_in_rule__IntegerQuestion__Group__4__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__54791 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__54794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__0_in_rule__IntegerQuestion__Group__5__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__64852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerQuestion__Group__6__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__0__Impl_in_rule__IntegerQuestion__Group_5__04925 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__1_in_rule__IntegerQuestion__Group_5__04928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntegerQuestion__Group_5__0__Impl4956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_5__1__Impl_in_rule__IntegerQuestion__Group_5__14987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__StepAssignment_5_1_in_rule__IntegerQuestion__Group_5__1__Impl5014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__0__Impl_in_rule__QuestionCondition__Group__05048 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__1_in_rule__QuestionCondition__Group__05051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__QuestionCondition__Group__0__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__1__Impl_in_rule__QuestionCondition__Group__15110 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__2_in_rule__QuestionCondition__Group__15113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__OptionAssignment_1_in_rule__QuestionCondition__Group__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__2__Impl_in_rule__QuestionCondition__Group__25170 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__3_in_rule__QuestionCondition__Group__25173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__0_in_rule__QuestionCondition__Group__2__Impl5200 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group__3__Impl_in_rule__QuestionCondition__Group__35231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__QuestionCondition__Group__3__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__0__Impl_in_rule__QuestionCondition__Group_2__05298 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__1_in_rule__QuestionCondition__Group_2__05301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__QuestionCondition__Group_2__0__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__Group_2__1__Impl_in_rule__QuestionCondition__Group_2__15360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionCondition__OptionAssignment_2_1_in_rule__QuestionCondition__Group_2__1__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__05421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__05424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Option__Group__0__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__15483 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__15486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__TextAssignment_1_in_rule__Option__Group__1__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__25543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__05607 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__05610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Option__Group_2__0__Impl5638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__15669 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Option__Group_2__2_in_rule__Option__Group_2__15672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__NameAssignment_2_1_in_rule__Option__Group_2__1__Impl5699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__2__Impl_in_rule__Option__Group_2__25729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Option__Group_2__2__Impl5757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05794 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EInt__Group__0__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_05924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_25955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_05986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_3_16017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Heading__TextAssignment_16048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_16079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionBase__TitleAssignment_16110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__QuestionBase__MandatoryAssignment_26146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionBase__DescriptionAssignment_36185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionCondition_in_rule__QuestionBase__ConditionsAssignment_46216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__TextQuestion__QuestionBaseAssignment_06247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TextQuestion__MultilineAssignment_26283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__ChoiceQuestion__QuestionBaseAssignment_06322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_06353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_2_1_06384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_2_1_26415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_46446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__MatrixQuestion__QuestionBaseAssignment_06477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_26508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_06539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_4_1_16570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_5_16601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__CalendarQuestion__QuestionBaseAssignment_06632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CalendarQuestion__YearAssignment_2_06668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__CalendarQuestion__MonthAssignment_2_26712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CalendarQuestion__DayAssignment_2_46756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CalendarQuestion__HourAssignment_2_66800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CalendarQuestion__MinuteAssignment_2_86844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionBase_in_rule__IntegerQuestion__QuestionBaseAssignment_06883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_26914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_46945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_5_16976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_17011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionCondition__OptionAssignment_2_17050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__TextAssignment_17085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__NameAssignment_2_17116 = new BitSet(new long[]{0x0000000000000002L});
    }


}