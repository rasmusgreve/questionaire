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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Questionaire'", "'{'", "'resultEmail'", "'}'", "'elements'", "','", "'Heading'", "'text'", "'Paragraph'", "'TextQuestion'", "'id'", "'title'", "'description'", "'conditions'", "'('", "')'", "'ChoiceQuestion'", "'options'", "'minSelections'", "'maxSelections'", "'MatrixQuestion'", "'maxPerRow'", "'columnNames'", "'rowNames'", "'CalendarQuestion'", "'IntegerQuestion'", "'minValue'", "'step'", "'maxValue'", "'Option'", "'question'", "'-'", "'mandatory'", "'multiline'", "'year'", "'month'", "'day'", "'hour'", "'minute'"
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


    // $ANTLR start "entryRuleTextQuestion"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:200:1: entryRuleTextQuestion : ruleTextQuestion EOF ;
    public final void entryRuleTextQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:201:1: ( ruleTextQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:202:1: ruleTextQuestion EOF
            {
             before(grammarAccess.getTextQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion361);
            ruleTextQuestion();

            state._fsp--;

             after(grammarAccess.getTextQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextQuestion368); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:209:1: ruleTextQuestion : ( ( rule__TextQuestion__Group__0 ) ) ;
    public final void ruleTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:213:2: ( ( ( rule__TextQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:214:1: ( ( rule__TextQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:214:1: ( ( rule__TextQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:215:1: ( rule__TextQuestion__Group__0 )
            {
             before(grammarAccess.getTextQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:216:1: ( rule__TextQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:216:2: rule__TextQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__0_in_ruleTextQuestion394);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:228:1: entryRuleChoiceQuestion : ruleChoiceQuestion EOF ;
    public final void entryRuleChoiceQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:229:1: ( ruleChoiceQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:230:1: ruleChoiceQuestion EOF
            {
             before(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion421);
            ruleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceQuestion428); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:237:1: ruleChoiceQuestion : ( ( rule__ChoiceQuestion__Group__0 ) ) ;
    public final void ruleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:241:2: ( ( ( rule__ChoiceQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:242:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:242:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:243:1: ( rule__ChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:244:1: ( rule__ChoiceQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:244:2: rule__ChoiceQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion454);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:256:1: entryRuleMatrixQuestion : ruleMatrixQuestion EOF ;
    public final void entryRuleMatrixQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:257:1: ( ruleMatrixQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:258:1: ruleMatrixQuestion EOF
            {
             before(grammarAccess.getMatrixQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion481);
            ruleMatrixQuestion();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatrixQuestion488); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:265:1: ruleMatrixQuestion : ( ( rule__MatrixQuestion__Group__0 ) ) ;
    public final void ruleMatrixQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:269:2: ( ( ( rule__MatrixQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:270:1: ( ( rule__MatrixQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:270:1: ( ( rule__MatrixQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:271:1: ( rule__MatrixQuestion__Group__0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:272:1: ( rule__MatrixQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:272:2: rule__MatrixQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion514);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:284:1: entryRuleCalendarQuestion : ruleCalendarQuestion EOF ;
    public final void entryRuleCalendarQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:285:1: ( ruleCalendarQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:286:1: ruleCalendarQuestion EOF
            {
             before(grammarAccess.getCalendarQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion541);
            ruleCalendarQuestion();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCalendarQuestion548); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:293:1: ruleCalendarQuestion : ( ( rule__CalendarQuestion__Group__0 ) ) ;
    public final void ruleCalendarQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:297:2: ( ( ( rule__CalendarQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:298:1: ( ( rule__CalendarQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:298:1: ( ( rule__CalendarQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:299:1: ( rule__CalendarQuestion__Group__0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:300:1: ( rule__CalendarQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:300:2: rule__CalendarQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__0_in_ruleCalendarQuestion574);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:312:1: entryRuleIntegerQuestion : ruleIntegerQuestion EOF ;
    public final void entryRuleIntegerQuestion() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:313:1: ( ruleIntegerQuestion EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:314:1: ruleIntegerQuestion EOF
            {
             before(grammarAccess.getIntegerQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion601);
            ruleIntegerQuestion();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerQuestion608); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:321:1: ruleIntegerQuestion : ( ( rule__IntegerQuestion__Group__0 ) ) ;
    public final void ruleIntegerQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:325:2: ( ( ( rule__IntegerQuestion__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:326:1: ( ( rule__IntegerQuestion__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:326:1: ( ( rule__IntegerQuestion__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:327:1: ( rule__IntegerQuestion__Group__0 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:328:1: ( rule__IntegerQuestion__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:328:2: rule__IntegerQuestion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__0_in_ruleIntegerQuestion634);
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


    // $ANTLR start "entryRuleOption"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:344:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:345:1: ( ruleOption EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:346:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_entryRuleOption665);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOption672); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:353:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:357:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:358:1: ( ( rule__Option__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:358:1: ( ( rule__Option__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:359:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:360:1: ( rule__Option__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:360:2: rule__Option__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__0_in_ruleOption698);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:372:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:373:1: ( ruleEInt EOF )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:374:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt725);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt732); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:381:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:385:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:386:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:386:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:387:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:388:1: ( rule__EInt__Group__0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:388:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt758);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:400:1: rule__Element__Alternatives : ( ( ruleHeading ) | ( ruleParagraph ) | ( ruleTextQuestion ) | ( ruleChoiceQuestion ) | ( ruleMatrixQuestion ) | ( ruleCalendarQuestion ) | ( ruleIntegerQuestion ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:404:1: ( ( ruleHeading ) | ( ruleParagraph ) | ( ruleTextQuestion ) | ( ruleChoiceQuestion ) | ( ruleMatrixQuestion ) | ( ruleCalendarQuestion ) | ( ruleIntegerQuestion ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 43:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt1=5;
                    }
                    break;
                case 44:
                    {
                    alt1=3;
                    }
                    break;
                case 36:
                    {
                    alt1=7;
                    }
                    break;
                case 27:
                    {
                    alt1=4;
                    }
                    break;
                case 45:
                    {
                    alt1=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:405:1: ( ruleHeading )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:405:1: ( ruleHeading )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:406:1: ruleHeading
                    {
                     before(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHeading_in_rule__Element__Alternatives794);
                    ruleHeading();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getHeadingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:411:6: ( ruleParagraph )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:411:6: ( ruleParagraph )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:412:1: ruleParagraph
                    {
                     before(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParagraph_in_rule__Element__Alternatives811);
                    ruleParagraph();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getParagraphParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:417:6: ( ruleTextQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:417:6: ( ruleTextQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:418:1: ruleTextQuestion
                    {
                     before(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTextQuestion_in_rule__Element__Alternatives828);
                    ruleTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTextQuestionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:423:6: ( ruleChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:423:6: ( ruleChoiceQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:424:1: ruleChoiceQuestion
                    {
                     before(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceQuestion_in_rule__Element__Alternatives845);
                    ruleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getChoiceQuestionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:429:6: ( ruleMatrixQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:429:6: ( ruleMatrixQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:430:1: ruleMatrixQuestion
                    {
                     before(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMatrixQuestion_in_rule__Element__Alternatives862);
                    ruleMatrixQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMatrixQuestionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:435:6: ( ruleCalendarQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:435:6: ( ruleCalendarQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:436:1: ruleCalendarQuestion
                    {
                     before(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCalendarQuestion_in_rule__Element__Alternatives879);
                    ruleCalendarQuestion();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCalendarQuestionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:441:6: ( ruleIntegerQuestion )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:441:6: ( ruleIntegerQuestion )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:442:1: ruleIntegerQuestion
                    {
                     before(grammarAccess.getElementAccess().getIntegerQuestionParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerQuestion_in_rule__Element__Alternatives896);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:452:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:456:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:457:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:457:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:458:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives928); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:463:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:463:6: ( RULE_ID )
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:464:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives945); 
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


    // $ANTLR start "rule__Questionaire__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:477:1: rule__Questionaire__Group__0 : rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 ;
    public final void rule__Questionaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:481:1: ( rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:482:2: rule__Questionaire__Group__0__Impl rule__Questionaire__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__0976);
            rule__Questionaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__0979);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:489:1: rule__Questionaire__Group__0__Impl : ( 'Questionaire' ) ;
    public final void rule__Questionaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:493:1: ( ( 'Questionaire' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:494:1: ( 'Questionaire' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:494:1: ( 'Questionaire' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:495:1: 'Questionaire'
            {
             before(grammarAccess.getQuestionaireAccess().getQuestionaireKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Questionaire__Group__0__Impl1007); 
             after(grammarAccess.getQuestionaireAccess().getQuestionaireKeyword_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:508:1: rule__Questionaire__Group__1 : rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 ;
    public final void rule__Questionaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:512:1: ( rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:513:2: rule__Questionaire__Group__1__Impl rule__Questionaire__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11038);
            rule__Questionaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11041);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:520:1: rule__Questionaire__Group__1__Impl : ( ( rule__Questionaire__NameAssignment_1 ) ) ;
    public final void rule__Questionaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:524:1: ( ( ( rule__Questionaire__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:525:1: ( ( rule__Questionaire__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:525:1: ( ( rule__Questionaire__NameAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:526:1: ( rule__Questionaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionaireAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:527:1: ( rule__Questionaire__NameAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:527:2: rule__Questionaire__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__NameAssignment_1_in_rule__Questionaire__Group__1__Impl1068);
            rule__Questionaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getNameAssignment_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:537:1: rule__Questionaire__Group__2 : rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 ;
    public final void rule__Questionaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:541:1: ( rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:542:2: rule__Questionaire__Group__2__Impl rule__Questionaire__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21098);
            rule__Questionaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21101);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:549:1: rule__Questionaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:553:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:554:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:554:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:555:1: '{'
            {
             before(grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Questionaire__Group__2__Impl1129); 
             after(grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:568:1: rule__Questionaire__Group__3 : rule__Questionaire__Group__3__Impl rule__Questionaire__Group__4 ;
    public final void rule__Questionaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:572:1: ( rule__Questionaire__Group__3__Impl rule__Questionaire__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:573:2: rule__Questionaire__Group__3__Impl rule__Questionaire__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31160);
            rule__Questionaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__4_in_rule__Questionaire__Group__31163);
            rule__Questionaire__Group__4();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:580:1: rule__Questionaire__Group__3__Impl : ( 'resultEmail' ) ;
    public final void rule__Questionaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:584:1: ( ( 'resultEmail' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:585:1: ( 'resultEmail' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:585:1: ( 'resultEmail' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:586:1: 'resultEmail'
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Questionaire__Group__3__Impl1191); 
             after(grammarAccess.getQuestionaireAccess().getResultEmailKeyword_3()); 

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


    // $ANTLR start "rule__Questionaire__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:599:1: rule__Questionaire__Group__4 : rule__Questionaire__Group__4__Impl rule__Questionaire__Group__5 ;
    public final void rule__Questionaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:603:1: ( rule__Questionaire__Group__4__Impl rule__Questionaire__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:604:2: rule__Questionaire__Group__4__Impl rule__Questionaire__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__4__Impl_in_rule__Questionaire__Group__41222);
            rule__Questionaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__5_in_rule__Questionaire__Group__41225);
            rule__Questionaire__Group__5();

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
    // $ANTLR end "rule__Questionaire__Group__4"


    // $ANTLR start "rule__Questionaire__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:611:1: rule__Questionaire__Group__4__Impl : ( ( rule__Questionaire__ResultEmailAssignment_4 ) ) ;
    public final void rule__Questionaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:615:1: ( ( ( rule__Questionaire__ResultEmailAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:616:1: ( ( rule__Questionaire__ResultEmailAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:616:1: ( ( rule__Questionaire__ResultEmailAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:617:1: ( rule__Questionaire__ResultEmailAssignment_4 )
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:618:1: ( rule__Questionaire__ResultEmailAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:618:2: rule__Questionaire__ResultEmailAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ResultEmailAssignment_4_in_rule__Questionaire__Group__4__Impl1252);
            rule__Questionaire__ResultEmailAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getResultEmailAssignment_4()); 

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
    // $ANTLR end "rule__Questionaire__Group__4__Impl"


    // $ANTLR start "rule__Questionaire__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:628:1: rule__Questionaire__Group__5 : rule__Questionaire__Group__5__Impl rule__Questionaire__Group__6 ;
    public final void rule__Questionaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:632:1: ( rule__Questionaire__Group__5__Impl rule__Questionaire__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:633:2: rule__Questionaire__Group__5__Impl rule__Questionaire__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__5__Impl_in_rule__Questionaire__Group__51282);
            rule__Questionaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__6_in_rule__Questionaire__Group__51285);
            rule__Questionaire__Group__6();

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
    // $ANTLR end "rule__Questionaire__Group__5"


    // $ANTLR start "rule__Questionaire__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:640:1: rule__Questionaire__Group__5__Impl : ( ( rule__Questionaire__Group_5__0 )? ) ;
    public final void rule__Questionaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:644:1: ( ( ( rule__Questionaire__Group_5__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:645:1: ( ( rule__Questionaire__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:645:1: ( ( rule__Questionaire__Group_5__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:646:1: ( rule__Questionaire__Group_5__0 )?
            {
             before(grammarAccess.getQuestionaireAccess().getGroup_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:647:1: ( rule__Questionaire__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:647:2: rule__Questionaire__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__0_in_rule__Questionaire__Group__5__Impl1312);
                    rule__Questionaire__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionaireAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Questionaire__Group__5__Impl"


    // $ANTLR start "rule__Questionaire__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:657:1: rule__Questionaire__Group__6 : rule__Questionaire__Group__6__Impl ;
    public final void rule__Questionaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:661:1: ( rule__Questionaire__Group__6__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:662:2: rule__Questionaire__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group__6__Impl_in_rule__Questionaire__Group__61343);
            rule__Questionaire__Group__6__Impl();

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
    // $ANTLR end "rule__Questionaire__Group__6"


    // $ANTLR start "rule__Questionaire__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:668:1: rule__Questionaire__Group__6__Impl : ( '}' ) ;
    public final void rule__Questionaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:672:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:673:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:673:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:674:1: '}'
            {
             before(grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Questionaire__Group__6__Impl1371); 
             after(grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Questionaire__Group__6__Impl"


    // $ANTLR start "rule__Questionaire__Group_5__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:701:1: rule__Questionaire__Group_5__0 : rule__Questionaire__Group_5__0__Impl rule__Questionaire__Group_5__1 ;
    public final void rule__Questionaire__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:705:1: ( rule__Questionaire__Group_5__0__Impl rule__Questionaire__Group_5__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:706:2: rule__Questionaire__Group_5__0__Impl rule__Questionaire__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__0__Impl_in_rule__Questionaire__Group_5__01416);
            rule__Questionaire__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__1_in_rule__Questionaire__Group_5__01419);
            rule__Questionaire__Group_5__1();

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
    // $ANTLR end "rule__Questionaire__Group_5__0"


    // $ANTLR start "rule__Questionaire__Group_5__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:713:1: rule__Questionaire__Group_5__0__Impl : ( 'elements' ) ;
    public final void rule__Questionaire__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:717:1: ( ( 'elements' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:718:1: ( 'elements' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:718:1: ( 'elements' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:719:1: 'elements'
            {
             before(grammarAccess.getQuestionaireAccess().getElementsKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Questionaire__Group_5__0__Impl1447); 
             after(grammarAccess.getQuestionaireAccess().getElementsKeyword_5_0()); 

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
    // $ANTLR end "rule__Questionaire__Group_5__0__Impl"


    // $ANTLR start "rule__Questionaire__Group_5__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:732:1: rule__Questionaire__Group_5__1 : rule__Questionaire__Group_5__1__Impl rule__Questionaire__Group_5__2 ;
    public final void rule__Questionaire__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:736:1: ( rule__Questionaire__Group_5__1__Impl rule__Questionaire__Group_5__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:737:2: rule__Questionaire__Group_5__1__Impl rule__Questionaire__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__1__Impl_in_rule__Questionaire__Group_5__11478);
            rule__Questionaire__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__2_in_rule__Questionaire__Group_5__11481);
            rule__Questionaire__Group_5__2();

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
    // $ANTLR end "rule__Questionaire__Group_5__1"


    // $ANTLR start "rule__Questionaire__Group_5__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:744:1: rule__Questionaire__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Questionaire__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:748:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:749:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:749:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:750:1: '{'
            {
             before(grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Questionaire__Group_5__1__Impl1509); 
             after(grammarAccess.getQuestionaireAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Questionaire__Group_5__1__Impl"


    // $ANTLR start "rule__Questionaire__Group_5__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:763:1: rule__Questionaire__Group_5__2 : rule__Questionaire__Group_5__2__Impl rule__Questionaire__Group_5__3 ;
    public final void rule__Questionaire__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:767:1: ( rule__Questionaire__Group_5__2__Impl rule__Questionaire__Group_5__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:768:2: rule__Questionaire__Group_5__2__Impl rule__Questionaire__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__2__Impl_in_rule__Questionaire__Group_5__21540);
            rule__Questionaire__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__3_in_rule__Questionaire__Group_5__21543);
            rule__Questionaire__Group_5__3();

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
    // $ANTLR end "rule__Questionaire__Group_5__2"


    // $ANTLR start "rule__Questionaire__Group_5__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:775:1: rule__Questionaire__Group_5__2__Impl : ( ( rule__Questionaire__ElementsAssignment_5_2 ) ) ;
    public final void rule__Questionaire__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:779:1: ( ( ( rule__Questionaire__ElementsAssignment_5_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:780:1: ( ( rule__Questionaire__ElementsAssignment_5_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:780:1: ( ( rule__Questionaire__ElementsAssignment_5_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:781:1: ( rule__Questionaire__ElementsAssignment_5_2 )
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:782:1: ( rule__Questionaire__ElementsAssignment_5_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:782:2: rule__Questionaire__ElementsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_5_2_in_rule__Questionaire__Group_5__2__Impl1570);
            rule__Questionaire__ElementsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_2()); 

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
    // $ANTLR end "rule__Questionaire__Group_5__2__Impl"


    // $ANTLR start "rule__Questionaire__Group_5__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:792:1: rule__Questionaire__Group_5__3 : rule__Questionaire__Group_5__3__Impl rule__Questionaire__Group_5__4 ;
    public final void rule__Questionaire__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:796:1: ( rule__Questionaire__Group_5__3__Impl rule__Questionaire__Group_5__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:797:2: rule__Questionaire__Group_5__3__Impl rule__Questionaire__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__3__Impl_in_rule__Questionaire__Group_5__31600);
            rule__Questionaire__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__4_in_rule__Questionaire__Group_5__31603);
            rule__Questionaire__Group_5__4();

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
    // $ANTLR end "rule__Questionaire__Group_5__3"


    // $ANTLR start "rule__Questionaire__Group_5__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:804:1: rule__Questionaire__Group_5__3__Impl : ( ( rule__Questionaire__Group_5_3__0 )* ) ;
    public final void rule__Questionaire__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:808:1: ( ( ( rule__Questionaire__Group_5_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:809:1: ( ( rule__Questionaire__Group_5_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:809:1: ( ( rule__Questionaire__Group_5_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:810:1: ( rule__Questionaire__Group_5_3__0 )*
            {
             before(grammarAccess.getQuestionaireAccess().getGroup_5_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:811:1: ( rule__Questionaire__Group_5_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:811:2: rule__Questionaire__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5_3__0_in_rule__Questionaire__Group_5__3__Impl1630);
            	    rule__Questionaire__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQuestionaireAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Questionaire__Group_5__3__Impl"


    // $ANTLR start "rule__Questionaire__Group_5__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:821:1: rule__Questionaire__Group_5__4 : rule__Questionaire__Group_5__4__Impl ;
    public final void rule__Questionaire__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:825:1: ( rule__Questionaire__Group_5__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:826:2: rule__Questionaire__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5__4__Impl_in_rule__Questionaire__Group_5__41661);
            rule__Questionaire__Group_5__4__Impl();

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
    // $ANTLR end "rule__Questionaire__Group_5__4"


    // $ANTLR start "rule__Questionaire__Group_5__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:832:1: rule__Questionaire__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Questionaire__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:836:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:837:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:837:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:838:1: '}'
            {
             before(grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Questionaire__Group_5__4__Impl1689); 
             after(grammarAccess.getQuestionaireAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Questionaire__Group_5__4__Impl"


    // $ANTLR start "rule__Questionaire__Group_5_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:861:1: rule__Questionaire__Group_5_3__0 : rule__Questionaire__Group_5_3__0__Impl rule__Questionaire__Group_5_3__1 ;
    public final void rule__Questionaire__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:865:1: ( rule__Questionaire__Group_5_3__0__Impl rule__Questionaire__Group_5_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:866:2: rule__Questionaire__Group_5_3__0__Impl rule__Questionaire__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5_3__0__Impl_in_rule__Questionaire__Group_5_3__01730);
            rule__Questionaire__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5_3__1_in_rule__Questionaire__Group_5_3__01733);
            rule__Questionaire__Group_5_3__1();

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
    // $ANTLR end "rule__Questionaire__Group_5_3__0"


    // $ANTLR start "rule__Questionaire__Group_5_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:873:1: rule__Questionaire__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Questionaire__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:877:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:878:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:878:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:879:1: ','
            {
             before(grammarAccess.getQuestionaireAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Questionaire__Group_5_3__0__Impl1761); 
             after(grammarAccess.getQuestionaireAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Questionaire__Group_5_3__0__Impl"


    // $ANTLR start "rule__Questionaire__Group_5_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:892:1: rule__Questionaire__Group_5_3__1 : rule__Questionaire__Group_5_3__1__Impl ;
    public final void rule__Questionaire__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:896:1: ( rule__Questionaire__Group_5_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:897:2: rule__Questionaire__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__Group_5_3__1__Impl_in_rule__Questionaire__Group_5_3__11792);
            rule__Questionaire__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Questionaire__Group_5_3__1"


    // $ANTLR start "rule__Questionaire__Group_5_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:903:1: rule__Questionaire__Group_5_3__1__Impl : ( ( rule__Questionaire__ElementsAssignment_5_3_1 ) ) ;
    public final void rule__Questionaire__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:907:1: ( ( ( rule__Questionaire__ElementsAssignment_5_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:908:1: ( ( rule__Questionaire__ElementsAssignment_5_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:908:1: ( ( rule__Questionaire__ElementsAssignment_5_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:909:1: ( rule__Questionaire__ElementsAssignment_5_3_1 )
            {
             before(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:910:1: ( rule__Questionaire__ElementsAssignment_5_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:910:2: rule__Questionaire__ElementsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Questionaire__ElementsAssignment_5_3_1_in_rule__Questionaire__Group_5_3__1__Impl1819);
            rule__Questionaire__ElementsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionaireAccess().getElementsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Questionaire__Group_5_3__1__Impl"


    // $ANTLR start "rule__Heading__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:924:1: rule__Heading__Group__0 : rule__Heading__Group__0__Impl rule__Heading__Group__1 ;
    public final void rule__Heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:928:1: ( rule__Heading__Group__0__Impl rule__Heading__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:929:2: rule__Heading__Group__0__Impl rule__Heading__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01853);
            rule__Heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01856);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:936:1: rule__Heading__Group__0__Impl : ( 'Heading' ) ;
    public final void rule__Heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:940:1: ( ( 'Heading' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:941:1: ( 'Heading' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:941:1: ( 'Heading' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:942:1: 'Heading'
            {
             before(grammarAccess.getHeadingAccess().getHeadingKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Heading__Group__0__Impl1884); 
             after(grammarAccess.getHeadingAccess().getHeadingKeyword_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:955:1: rule__Heading__Group__1 : rule__Heading__Group__1__Impl rule__Heading__Group__2 ;
    public final void rule__Heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:959:1: ( rule__Heading__Group__1__Impl rule__Heading__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:960:2: rule__Heading__Group__1__Impl rule__Heading__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11915);
            rule__Heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__2_in_rule__Heading__Group__11918);
            rule__Heading__Group__2();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:967:1: rule__Heading__Group__1__Impl : ( '{' ) ;
    public final void rule__Heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:971:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:972:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:972:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:973:1: '{'
            {
             before(grammarAccess.getHeadingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Heading__Group__1__Impl1946); 
             after(grammarAccess.getHeadingAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__Heading__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:986:1: rule__Heading__Group__2 : rule__Heading__Group__2__Impl rule__Heading__Group__3 ;
    public final void rule__Heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:990:1: ( rule__Heading__Group__2__Impl rule__Heading__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:991:2: rule__Heading__Group__2__Impl rule__Heading__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__2__Impl_in_rule__Heading__Group__21977);
            rule__Heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__3_in_rule__Heading__Group__21980);
            rule__Heading__Group__3();

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
    // $ANTLR end "rule__Heading__Group__2"


    // $ANTLR start "rule__Heading__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:998:1: rule__Heading__Group__2__Impl : ( 'text' ) ;
    public final void rule__Heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1002:1: ( ( 'text' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1003:1: ( 'text' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1003:1: ( 'text' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1004:1: 'text'
            {
             before(grammarAccess.getHeadingAccess().getTextKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Heading__Group__2__Impl2008); 
             after(grammarAccess.getHeadingAccess().getTextKeyword_2()); 

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
    // $ANTLR end "rule__Heading__Group__2__Impl"


    // $ANTLR start "rule__Heading__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1017:1: rule__Heading__Group__3 : rule__Heading__Group__3__Impl rule__Heading__Group__4 ;
    public final void rule__Heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1021:1: ( rule__Heading__Group__3__Impl rule__Heading__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1022:2: rule__Heading__Group__3__Impl rule__Heading__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__3__Impl_in_rule__Heading__Group__32039);
            rule__Heading__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__4_in_rule__Heading__Group__32042);
            rule__Heading__Group__4();

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
    // $ANTLR end "rule__Heading__Group__3"


    // $ANTLR start "rule__Heading__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1029:1: rule__Heading__Group__3__Impl : ( ( rule__Heading__TextAssignment_3 ) ) ;
    public final void rule__Heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1033:1: ( ( ( rule__Heading__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1034:1: ( ( rule__Heading__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1034:1: ( ( rule__Heading__TextAssignment_3 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1035:1: ( rule__Heading__TextAssignment_3 )
            {
             before(grammarAccess.getHeadingAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1036:1: ( rule__Heading__TextAssignment_3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1036:2: rule__Heading__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__TextAssignment_3_in_rule__Heading__Group__3__Impl2069);
            rule__Heading__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getTextAssignment_3()); 

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
    // $ANTLR end "rule__Heading__Group__3__Impl"


    // $ANTLR start "rule__Heading__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1046:1: rule__Heading__Group__4 : rule__Heading__Group__4__Impl ;
    public final void rule__Heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1050:1: ( rule__Heading__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1051:2: rule__Heading__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Heading__Group__4__Impl_in_rule__Heading__Group__42099);
            rule__Heading__Group__4__Impl();

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
    // $ANTLR end "rule__Heading__Group__4"


    // $ANTLR start "rule__Heading__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1057:1: rule__Heading__Group__4__Impl : ( '}' ) ;
    public final void rule__Heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1061:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1062:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1062:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1063:1: '}'
            {
             before(grammarAccess.getHeadingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Heading__Group__4__Impl2127); 
             after(grammarAccess.getHeadingAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Heading__Group__4__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1086:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1090:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1091:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__02168);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__02171);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1098:1: rule__Paragraph__Group__0__Impl : ( 'Paragraph' ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1102:1: ( ( 'Paragraph' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1103:1: ( 'Paragraph' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1103:1: ( 'Paragraph' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1104:1: 'Paragraph'
            {
             before(grammarAccess.getParagraphAccess().getParagraphKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Paragraph__Group__0__Impl2199); 
             after(grammarAccess.getParagraphAccess().getParagraphKeyword_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1117:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1121:1: ( rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1122:2: rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__12230);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__2_in_rule__Paragraph__Group__12233);
            rule__Paragraph__Group__2();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1129:1: rule__Paragraph__Group__1__Impl : ( '{' ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1133:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1134:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1134:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1135:1: '{'
            {
             before(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Paragraph__Group__1__Impl2261); 
             after(grammarAccess.getParagraphAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__Paragraph__Group__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1148:1: rule__Paragraph__Group__2 : rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 ;
    public final void rule__Paragraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1152:1: ( rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1153:2: rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__2__Impl_in_rule__Paragraph__Group__22292);
            rule__Paragraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__3_in_rule__Paragraph__Group__22295);
            rule__Paragraph__Group__3();

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
    // $ANTLR end "rule__Paragraph__Group__2"


    // $ANTLR start "rule__Paragraph__Group__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1160:1: rule__Paragraph__Group__2__Impl : ( 'text' ) ;
    public final void rule__Paragraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1164:1: ( ( 'text' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1165:1: ( 'text' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1165:1: ( 'text' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1166:1: 'text'
            {
             before(grammarAccess.getParagraphAccess().getTextKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Paragraph__Group__2__Impl2323); 
             after(grammarAccess.getParagraphAccess().getTextKeyword_2()); 

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
    // $ANTLR end "rule__Paragraph__Group__2__Impl"


    // $ANTLR start "rule__Paragraph__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1179:1: rule__Paragraph__Group__3 : rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4 ;
    public final void rule__Paragraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1183:1: ( rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1184:2: rule__Paragraph__Group__3__Impl rule__Paragraph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__3__Impl_in_rule__Paragraph__Group__32354);
            rule__Paragraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__4_in_rule__Paragraph__Group__32357);
            rule__Paragraph__Group__4();

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
    // $ANTLR end "rule__Paragraph__Group__3"


    // $ANTLR start "rule__Paragraph__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1191:1: rule__Paragraph__Group__3__Impl : ( ( rule__Paragraph__TextAssignment_3 ) ) ;
    public final void rule__Paragraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1195:1: ( ( ( rule__Paragraph__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1196:1: ( ( rule__Paragraph__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1196:1: ( ( rule__Paragraph__TextAssignment_3 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1197:1: ( rule__Paragraph__TextAssignment_3 )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1198:1: ( rule__Paragraph__TextAssignment_3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1198:2: rule__Paragraph__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__TextAssignment_3_in_rule__Paragraph__Group__3__Impl2384);
            rule__Paragraph__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getTextAssignment_3()); 

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
    // $ANTLR end "rule__Paragraph__Group__3__Impl"


    // $ANTLR start "rule__Paragraph__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1208:1: rule__Paragraph__Group__4 : rule__Paragraph__Group__4__Impl ;
    public final void rule__Paragraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1212:1: ( rule__Paragraph__Group__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1213:2: rule__Paragraph__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Paragraph__Group__4__Impl_in_rule__Paragraph__Group__42414);
            rule__Paragraph__Group__4__Impl();

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
    // $ANTLR end "rule__Paragraph__Group__4"


    // $ANTLR start "rule__Paragraph__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1219:1: rule__Paragraph__Group__4__Impl : ( '}' ) ;
    public final void rule__Paragraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1223:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1224:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1224:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1225:1: '}'
            {
             before(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Paragraph__Group__4__Impl2442); 
             after(grammarAccess.getParagraphAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Paragraph__Group__4__Impl"


    // $ANTLR start "rule__TextQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1248:1: rule__TextQuestion__Group__0 : rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 ;
    public final void rule__TextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1252:1: ( rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1253:2: rule__TextQuestion__Group__0__Impl rule__TextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02483);
            rule__TextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02486);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1260:1: rule__TextQuestion__Group__0__Impl : ( ( rule__TextQuestion__MandatoryAssignment_0 ) ) ;
    public final void rule__TextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1264:1: ( ( ( rule__TextQuestion__MandatoryAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1265:1: ( ( rule__TextQuestion__MandatoryAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1265:1: ( ( rule__TextQuestion__MandatoryAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1266:1: ( rule__TextQuestion__MandatoryAssignment_0 )
            {
             before(grammarAccess.getTextQuestionAccess().getMandatoryAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1267:1: ( rule__TextQuestion__MandatoryAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1267:2: rule__TextQuestion__MandatoryAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__MandatoryAssignment_0_in_rule__TextQuestion__Group__0__Impl2513);
            rule__TextQuestion__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getMandatoryAssignment_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1277:1: rule__TextQuestion__Group__1 : rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 ;
    public final void rule__TextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1281:1: ( rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1282:2: rule__TextQuestion__Group__1__Impl rule__TextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12543);
            rule__TextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12546);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1289:1: rule__TextQuestion__Group__1__Impl : ( ( rule__TextQuestion__MultilineAssignment_1 ) ) ;
    public final void rule__TextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1293:1: ( ( ( rule__TextQuestion__MultilineAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1294:1: ( ( rule__TextQuestion__MultilineAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1294:1: ( ( rule__TextQuestion__MultilineAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1295:1: ( rule__TextQuestion__MultilineAssignment_1 )
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1296:1: ( rule__TextQuestion__MultilineAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1296:2: rule__TextQuestion__MultilineAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__MultilineAssignment_1_in_rule__TextQuestion__Group__1__Impl2573);
            rule__TextQuestion__MultilineAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getMultilineAssignment_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1306:1: rule__TextQuestion__Group__2 : rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 ;
    public final void rule__TextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1310:1: ( rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1311:2: rule__TextQuestion__Group__2__Impl rule__TextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22603);
            rule__TextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22606);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1318:1: rule__TextQuestion__Group__2__Impl : ( 'TextQuestion' ) ;
    public final void rule__TextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1322:1: ( ( 'TextQuestion' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1323:1: ( 'TextQuestion' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1323:1: ( 'TextQuestion' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1324:1: 'TextQuestion'
            {
             before(grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__TextQuestion__Group__2__Impl2634); 
             after(grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1337:1: rule__TextQuestion__Group__3 : rule__TextQuestion__Group__3__Impl rule__TextQuestion__Group__4 ;
    public final void rule__TextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1341:1: ( rule__TextQuestion__Group__3__Impl rule__TextQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1342:2: rule__TextQuestion__Group__3__Impl rule__TextQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32665);
            rule__TextQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__4_in_rule__TextQuestion__Group__32668);
            rule__TextQuestion__Group__4();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1349:1: rule__TextQuestion__Group__3__Impl : ( '{' ) ;
    public final void rule__TextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1353:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1354:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1354:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1355:1: '{'
            {
             before(grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TextQuestion__Group__3__Impl2696); 
             after(grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__TextQuestion__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1368:1: rule__TextQuestion__Group__4 : rule__TextQuestion__Group__4__Impl rule__TextQuestion__Group__5 ;
    public final void rule__TextQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1372:1: ( rule__TextQuestion__Group__4__Impl rule__TextQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1373:2: rule__TextQuestion__Group__4__Impl rule__TextQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__4__Impl_in_rule__TextQuestion__Group__42727);
            rule__TextQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__5_in_rule__TextQuestion__Group__42730);
            rule__TextQuestion__Group__5();

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
    // $ANTLR end "rule__TextQuestion__Group__4"


    // $ANTLR start "rule__TextQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1380:1: rule__TextQuestion__Group__4__Impl : ( 'id' ) ;
    public final void rule__TextQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1384:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1385:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1385:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1386:1: 'id'
            {
             before(grammarAccess.getTextQuestionAccess().getIdKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__TextQuestion__Group__4__Impl2758); 
             after(grammarAccess.getTextQuestionAccess().getIdKeyword_4()); 

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
    // $ANTLR end "rule__TextQuestion__Group__4__Impl"


    // $ANTLR start "rule__TextQuestion__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1399:1: rule__TextQuestion__Group__5 : rule__TextQuestion__Group__5__Impl rule__TextQuestion__Group__6 ;
    public final void rule__TextQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1403:1: ( rule__TextQuestion__Group__5__Impl rule__TextQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1404:2: rule__TextQuestion__Group__5__Impl rule__TextQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__5__Impl_in_rule__TextQuestion__Group__52789);
            rule__TextQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__6_in_rule__TextQuestion__Group__52792);
            rule__TextQuestion__Group__6();

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
    // $ANTLR end "rule__TextQuestion__Group__5"


    // $ANTLR start "rule__TextQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1411:1: rule__TextQuestion__Group__5__Impl : ( ( rule__TextQuestion__IdAssignment_5 ) ) ;
    public final void rule__TextQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1415:1: ( ( ( rule__TextQuestion__IdAssignment_5 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1416:1: ( ( rule__TextQuestion__IdAssignment_5 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1416:1: ( ( rule__TextQuestion__IdAssignment_5 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1417:1: ( rule__TextQuestion__IdAssignment_5 )
            {
             before(grammarAccess.getTextQuestionAccess().getIdAssignment_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1418:1: ( rule__TextQuestion__IdAssignment_5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1418:2: rule__TextQuestion__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__IdAssignment_5_in_rule__TextQuestion__Group__5__Impl2819);
            rule__TextQuestion__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__TextQuestion__Group__5__Impl"


    // $ANTLR start "rule__TextQuestion__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1428:1: rule__TextQuestion__Group__6 : rule__TextQuestion__Group__6__Impl rule__TextQuestion__Group__7 ;
    public final void rule__TextQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1432:1: ( rule__TextQuestion__Group__6__Impl rule__TextQuestion__Group__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1433:2: rule__TextQuestion__Group__6__Impl rule__TextQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__6__Impl_in_rule__TextQuestion__Group__62849);
            rule__TextQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__7_in_rule__TextQuestion__Group__62852);
            rule__TextQuestion__Group__7();

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
    // $ANTLR end "rule__TextQuestion__Group__6"


    // $ANTLR start "rule__TextQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1440:1: rule__TextQuestion__Group__6__Impl : ( 'title' ) ;
    public final void rule__TextQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1444:1: ( ( 'title' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1445:1: ( 'title' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1445:1: ( 'title' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1446:1: 'title'
            {
             before(grammarAccess.getTextQuestionAccess().getTitleKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__TextQuestion__Group__6__Impl2880); 
             after(grammarAccess.getTextQuestionAccess().getTitleKeyword_6()); 

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
    // $ANTLR end "rule__TextQuestion__Group__6__Impl"


    // $ANTLR start "rule__TextQuestion__Group__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1459:1: rule__TextQuestion__Group__7 : rule__TextQuestion__Group__7__Impl rule__TextQuestion__Group__8 ;
    public final void rule__TextQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1463:1: ( rule__TextQuestion__Group__7__Impl rule__TextQuestion__Group__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1464:2: rule__TextQuestion__Group__7__Impl rule__TextQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__7__Impl_in_rule__TextQuestion__Group__72911);
            rule__TextQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__8_in_rule__TextQuestion__Group__72914);
            rule__TextQuestion__Group__8();

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
    // $ANTLR end "rule__TextQuestion__Group__7"


    // $ANTLR start "rule__TextQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1471:1: rule__TextQuestion__Group__7__Impl : ( ( rule__TextQuestion__TitleAssignment_7 ) ) ;
    public final void rule__TextQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1475:1: ( ( ( rule__TextQuestion__TitleAssignment_7 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1476:1: ( ( rule__TextQuestion__TitleAssignment_7 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1476:1: ( ( rule__TextQuestion__TitleAssignment_7 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1477:1: ( rule__TextQuestion__TitleAssignment_7 )
            {
             before(grammarAccess.getTextQuestionAccess().getTitleAssignment_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1478:1: ( rule__TextQuestion__TitleAssignment_7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1478:2: rule__TextQuestion__TitleAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__TitleAssignment_7_in_rule__TextQuestion__Group__7__Impl2941);
            rule__TextQuestion__TitleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getTitleAssignment_7()); 

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
    // $ANTLR end "rule__TextQuestion__Group__7__Impl"


    // $ANTLR start "rule__TextQuestion__Group__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1488:1: rule__TextQuestion__Group__8 : rule__TextQuestion__Group__8__Impl rule__TextQuestion__Group__9 ;
    public final void rule__TextQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1492:1: ( rule__TextQuestion__Group__8__Impl rule__TextQuestion__Group__9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1493:2: rule__TextQuestion__Group__8__Impl rule__TextQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__8__Impl_in_rule__TextQuestion__Group__82971);
            rule__TextQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__9_in_rule__TextQuestion__Group__82974);
            rule__TextQuestion__Group__9();

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
    // $ANTLR end "rule__TextQuestion__Group__8"


    // $ANTLR start "rule__TextQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1500:1: rule__TextQuestion__Group__8__Impl : ( ( rule__TextQuestion__Group_8__0 )? ) ;
    public final void rule__TextQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1504:1: ( ( ( rule__TextQuestion__Group_8__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1505:1: ( ( rule__TextQuestion__Group_8__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1505:1: ( ( rule__TextQuestion__Group_8__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1506:1: ( rule__TextQuestion__Group_8__0 )?
            {
             before(grammarAccess.getTextQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1507:1: ( rule__TextQuestion__Group_8__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1507:2: rule__TextQuestion__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_8__0_in_rule__TextQuestion__Group__8__Impl3001);
                    rule__TextQuestion__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextQuestionAccess().getGroup_8()); 

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
    // $ANTLR end "rule__TextQuestion__Group__8__Impl"


    // $ANTLR start "rule__TextQuestion__Group__9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1517:1: rule__TextQuestion__Group__9 : rule__TextQuestion__Group__9__Impl rule__TextQuestion__Group__10 ;
    public final void rule__TextQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1521:1: ( rule__TextQuestion__Group__9__Impl rule__TextQuestion__Group__10 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1522:2: rule__TextQuestion__Group__9__Impl rule__TextQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__9__Impl_in_rule__TextQuestion__Group__93032);
            rule__TextQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__10_in_rule__TextQuestion__Group__93035);
            rule__TextQuestion__Group__10();

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
    // $ANTLR end "rule__TextQuestion__Group__9"


    // $ANTLR start "rule__TextQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1529:1: rule__TextQuestion__Group__9__Impl : ( ( rule__TextQuestion__Group_9__0 )? ) ;
    public final void rule__TextQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1533:1: ( ( ( rule__TextQuestion__Group_9__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1534:1: ( ( rule__TextQuestion__Group_9__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1534:1: ( ( rule__TextQuestion__Group_9__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1535:1: ( rule__TextQuestion__Group_9__0 )?
            {
             before(grammarAccess.getTextQuestionAccess().getGroup_9()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1536:1: ( rule__TextQuestion__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1536:2: rule__TextQuestion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__0_in_rule__TextQuestion__Group__9__Impl3062);
                    rule__TextQuestion__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextQuestionAccess().getGroup_9()); 

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
    // $ANTLR end "rule__TextQuestion__Group__9__Impl"


    // $ANTLR start "rule__TextQuestion__Group__10"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1546:1: rule__TextQuestion__Group__10 : rule__TextQuestion__Group__10__Impl ;
    public final void rule__TextQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1550:1: ( rule__TextQuestion__Group__10__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1551:2: rule__TextQuestion__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group__10__Impl_in_rule__TextQuestion__Group__103093);
            rule__TextQuestion__Group__10__Impl();

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
    // $ANTLR end "rule__TextQuestion__Group__10"


    // $ANTLR start "rule__TextQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1557:1: rule__TextQuestion__Group__10__Impl : ( '}' ) ;
    public final void rule__TextQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1561:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1562:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1562:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1563:1: '}'
            {
             before(grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TextQuestion__Group__10__Impl3121); 
             after(grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__TextQuestion__Group__10__Impl"


    // $ANTLR start "rule__TextQuestion__Group_8__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1598:1: rule__TextQuestion__Group_8__0 : rule__TextQuestion__Group_8__0__Impl rule__TextQuestion__Group_8__1 ;
    public final void rule__TextQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1602:1: ( rule__TextQuestion__Group_8__0__Impl rule__TextQuestion__Group_8__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1603:2: rule__TextQuestion__Group_8__0__Impl rule__TextQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_8__0__Impl_in_rule__TextQuestion__Group_8__03174);
            rule__TextQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_8__1_in_rule__TextQuestion__Group_8__03177);
            rule__TextQuestion__Group_8__1();

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
    // $ANTLR end "rule__TextQuestion__Group_8__0"


    // $ANTLR start "rule__TextQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1610:1: rule__TextQuestion__Group_8__0__Impl : ( 'description' ) ;
    public final void rule__TextQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1614:1: ( ( 'description' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1615:1: ( 'description' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1615:1: ( 'description' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1616:1: 'description'
            {
             before(grammarAccess.getTextQuestionAccess().getDescriptionKeyword_8_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TextQuestion__Group_8__0__Impl3205); 
             after(grammarAccess.getTextQuestionAccess().getDescriptionKeyword_8_0()); 

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
    // $ANTLR end "rule__TextQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group_8__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1629:1: rule__TextQuestion__Group_8__1 : rule__TextQuestion__Group_8__1__Impl ;
    public final void rule__TextQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1633:1: ( rule__TextQuestion__Group_8__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1634:2: rule__TextQuestion__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_8__1__Impl_in_rule__TextQuestion__Group_8__13236);
            rule__TextQuestion__Group_8__1__Impl();

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
    // $ANTLR end "rule__TextQuestion__Group_8__1"


    // $ANTLR start "rule__TextQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1640:1: rule__TextQuestion__Group_8__1__Impl : ( ( rule__TextQuestion__DescriptionAssignment_8_1 ) ) ;
    public final void rule__TextQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1644:1: ( ( ( rule__TextQuestion__DescriptionAssignment_8_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1645:1: ( ( rule__TextQuestion__DescriptionAssignment_8_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1645:1: ( ( rule__TextQuestion__DescriptionAssignment_8_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1646:1: ( rule__TextQuestion__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getTextQuestionAccess().getDescriptionAssignment_8_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1647:1: ( rule__TextQuestion__DescriptionAssignment_8_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1647:2: rule__TextQuestion__DescriptionAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__DescriptionAssignment_8_1_in_rule__TextQuestion__Group_8__1__Impl3263);
            rule__TextQuestion__DescriptionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getDescriptionAssignment_8_1()); 

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
    // $ANTLR end "rule__TextQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1661:1: rule__TextQuestion__Group_9__0 : rule__TextQuestion__Group_9__0__Impl rule__TextQuestion__Group_9__1 ;
    public final void rule__TextQuestion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1665:1: ( rule__TextQuestion__Group_9__0__Impl rule__TextQuestion__Group_9__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1666:2: rule__TextQuestion__Group_9__0__Impl rule__TextQuestion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__0__Impl_in_rule__TextQuestion__Group_9__03297);
            rule__TextQuestion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__1_in_rule__TextQuestion__Group_9__03300);
            rule__TextQuestion__Group_9__1();

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
    // $ANTLR end "rule__TextQuestion__Group_9__0"


    // $ANTLR start "rule__TextQuestion__Group_9__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1673:1: rule__TextQuestion__Group_9__0__Impl : ( 'conditions' ) ;
    public final void rule__TextQuestion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1677:1: ( ( 'conditions' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1678:1: ( 'conditions' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1678:1: ( 'conditions' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1679:1: 'conditions'
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsKeyword_9_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__TextQuestion__Group_9__0__Impl3328); 
             after(grammarAccess.getTextQuestionAccess().getConditionsKeyword_9_0()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1692:1: rule__TextQuestion__Group_9__1 : rule__TextQuestion__Group_9__1__Impl rule__TextQuestion__Group_9__2 ;
    public final void rule__TextQuestion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1696:1: ( rule__TextQuestion__Group_9__1__Impl rule__TextQuestion__Group_9__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1697:2: rule__TextQuestion__Group_9__1__Impl rule__TextQuestion__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__1__Impl_in_rule__TextQuestion__Group_9__13359);
            rule__TextQuestion__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__2_in_rule__TextQuestion__Group_9__13362);
            rule__TextQuestion__Group_9__2();

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
    // $ANTLR end "rule__TextQuestion__Group_9__1"


    // $ANTLR start "rule__TextQuestion__Group_9__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1704:1: rule__TextQuestion__Group_9__1__Impl : ( '(' ) ;
    public final void rule__TextQuestion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1708:1: ( ( '(' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1709:1: ( '(' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1709:1: ( '(' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1710:1: '('
            {
             before(grammarAccess.getTextQuestionAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TextQuestion__Group_9__1__Impl3390); 
             after(grammarAccess.getTextQuestionAccess().getLeftParenthesisKeyword_9_1()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9__1__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1723:1: rule__TextQuestion__Group_9__2 : rule__TextQuestion__Group_9__2__Impl rule__TextQuestion__Group_9__3 ;
    public final void rule__TextQuestion__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1727:1: ( rule__TextQuestion__Group_9__2__Impl rule__TextQuestion__Group_9__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1728:2: rule__TextQuestion__Group_9__2__Impl rule__TextQuestion__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__2__Impl_in_rule__TextQuestion__Group_9__23421);
            rule__TextQuestion__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__3_in_rule__TextQuestion__Group_9__23424);
            rule__TextQuestion__Group_9__3();

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
    // $ANTLR end "rule__TextQuestion__Group_9__2"


    // $ANTLR start "rule__TextQuestion__Group_9__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1735:1: rule__TextQuestion__Group_9__2__Impl : ( ( rule__TextQuestion__ConditionsAssignment_9_2 ) ) ;
    public final void rule__TextQuestion__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1739:1: ( ( ( rule__TextQuestion__ConditionsAssignment_9_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1740:1: ( ( rule__TextQuestion__ConditionsAssignment_9_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1740:1: ( ( rule__TextQuestion__ConditionsAssignment_9_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1741:1: ( rule__TextQuestion__ConditionsAssignment_9_2 )
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1742:1: ( rule__TextQuestion__ConditionsAssignment_9_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1742:2: rule__TextQuestion__ConditionsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__ConditionsAssignment_9_2_in_rule__TextQuestion__Group_9__2__Impl3451);
            rule__TextQuestion__ConditionsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_2()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9__2__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1752:1: rule__TextQuestion__Group_9__3 : rule__TextQuestion__Group_9__3__Impl rule__TextQuestion__Group_9__4 ;
    public final void rule__TextQuestion__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1756:1: ( rule__TextQuestion__Group_9__3__Impl rule__TextQuestion__Group_9__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1757:2: rule__TextQuestion__Group_9__3__Impl rule__TextQuestion__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__3__Impl_in_rule__TextQuestion__Group_9__33481);
            rule__TextQuestion__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__4_in_rule__TextQuestion__Group_9__33484);
            rule__TextQuestion__Group_9__4();

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
    // $ANTLR end "rule__TextQuestion__Group_9__3"


    // $ANTLR start "rule__TextQuestion__Group_9__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1764:1: rule__TextQuestion__Group_9__3__Impl : ( ( rule__TextQuestion__Group_9_3__0 )* ) ;
    public final void rule__TextQuestion__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1768:1: ( ( ( rule__TextQuestion__Group_9_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1769:1: ( ( rule__TextQuestion__Group_9_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1769:1: ( ( rule__TextQuestion__Group_9_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1770:1: ( rule__TextQuestion__Group_9_3__0 )*
            {
             before(grammarAccess.getTextQuestionAccess().getGroup_9_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1771:1: ( rule__TextQuestion__Group_9_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1771:2: rule__TextQuestion__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9_3__0_in_rule__TextQuestion__Group_9__3__Impl3511);
            	    rule__TextQuestion__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTextQuestionAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9__3__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1781:1: rule__TextQuestion__Group_9__4 : rule__TextQuestion__Group_9__4__Impl ;
    public final void rule__TextQuestion__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1785:1: ( rule__TextQuestion__Group_9__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1786:2: rule__TextQuestion__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9__4__Impl_in_rule__TextQuestion__Group_9__43542);
            rule__TextQuestion__Group_9__4__Impl();

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
    // $ANTLR end "rule__TextQuestion__Group_9__4"


    // $ANTLR start "rule__TextQuestion__Group_9__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1792:1: rule__TextQuestion__Group_9__4__Impl : ( ')' ) ;
    public final void rule__TextQuestion__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1796:1: ( ( ')' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1797:1: ( ')' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1797:1: ( ')' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1798:1: ')'
            {
             before(grammarAccess.getTextQuestionAccess().getRightParenthesisKeyword_9_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__TextQuestion__Group_9__4__Impl3570); 
             after(grammarAccess.getTextQuestionAccess().getRightParenthesisKeyword_9_4()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9__4__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1821:1: rule__TextQuestion__Group_9_3__0 : rule__TextQuestion__Group_9_3__0__Impl rule__TextQuestion__Group_9_3__1 ;
    public final void rule__TextQuestion__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1825:1: ( rule__TextQuestion__Group_9_3__0__Impl rule__TextQuestion__Group_9_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1826:2: rule__TextQuestion__Group_9_3__0__Impl rule__TextQuestion__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9_3__0__Impl_in_rule__TextQuestion__Group_9_3__03611);
            rule__TextQuestion__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9_3__1_in_rule__TextQuestion__Group_9_3__03614);
            rule__TextQuestion__Group_9_3__1();

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
    // $ANTLR end "rule__TextQuestion__Group_9_3__0"


    // $ANTLR start "rule__TextQuestion__Group_9_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1833:1: rule__TextQuestion__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TextQuestion__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1837:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1838:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1838:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1839:1: ','
            {
             before(grammarAccess.getTextQuestionAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TextQuestion__Group_9_3__0__Impl3642); 
             after(grammarAccess.getTextQuestionAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9_3__0__Impl"


    // $ANTLR start "rule__TextQuestion__Group_9_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1852:1: rule__TextQuestion__Group_9_3__1 : rule__TextQuestion__Group_9_3__1__Impl ;
    public final void rule__TextQuestion__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1856:1: ( rule__TextQuestion__Group_9_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1857:2: rule__TextQuestion__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__Group_9_3__1__Impl_in_rule__TextQuestion__Group_9_3__13673);
            rule__TextQuestion__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__TextQuestion__Group_9_3__1"


    // $ANTLR start "rule__TextQuestion__Group_9_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1863:1: rule__TextQuestion__Group_9_3__1__Impl : ( ( rule__TextQuestion__ConditionsAssignment_9_3_1 ) ) ;
    public final void rule__TextQuestion__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1867:1: ( ( ( rule__TextQuestion__ConditionsAssignment_9_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1868:1: ( ( rule__TextQuestion__ConditionsAssignment_9_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1868:1: ( ( rule__TextQuestion__ConditionsAssignment_9_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1869:1: ( rule__TextQuestion__ConditionsAssignment_9_3_1 )
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1870:1: ( rule__TextQuestion__ConditionsAssignment_9_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1870:2: rule__TextQuestion__ConditionsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextQuestion__ConditionsAssignment_9_3_1_in_rule__TextQuestion__Group_9_3__1__Impl3700);
            rule__TextQuestion__ConditionsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextQuestionAccess().getConditionsAssignment_9_3_1()); 

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
    // $ANTLR end "rule__TextQuestion__Group_9_3__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1884:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1888:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1889:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__03734);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__03737);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1896:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__MandatoryAssignment_0 ) ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1900:1: ( ( ( rule__ChoiceQuestion__MandatoryAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1901:1: ( ( rule__ChoiceQuestion__MandatoryAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1901:1: ( ( rule__ChoiceQuestion__MandatoryAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1902:1: ( rule__ChoiceQuestion__MandatoryAssignment_0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMandatoryAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1903:1: ( rule__ChoiceQuestion__MandatoryAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1903:2: rule__ChoiceQuestion__MandatoryAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MandatoryAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl3764);
            rule__ChoiceQuestion__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getMandatoryAssignment_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1913:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1917:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1918:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__13794);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__13797);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1925:1: rule__ChoiceQuestion__Group__1__Impl : ( 'ChoiceQuestion' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1929:1: ( ( 'ChoiceQuestion' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1930:1: ( 'ChoiceQuestion' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1930:1: ( 'ChoiceQuestion' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1931:1: 'ChoiceQuestion'
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceQuestionKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ChoiceQuestion__Group__1__Impl3825); 
             after(grammarAccess.getChoiceQuestionAccess().getChoiceQuestionKeyword_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1944:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1948:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1949:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__23856);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__23859);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1956:1: rule__ChoiceQuestion__Group__2__Impl : ( '{' ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1960:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1961:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1961:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1962:1: '{'
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ChoiceQuestion__Group__2__Impl3887); 
             after(grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1975:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1979:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1980:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__33918);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__33921);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1987:1: rule__ChoiceQuestion__Group__3__Impl : ( 'id' ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1991:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1992:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1992:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:1993:1: 'id'
            {
             before(grammarAccess.getChoiceQuestionAccess().getIdKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ChoiceQuestion__Group__3__Impl3949); 
             after(grammarAccess.getChoiceQuestionAccess().getIdKeyword_3()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2006:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2010:1: ( rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2011:2: rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__43980);
            rule__ChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__43983);
            rule__ChoiceQuestion__Group__5();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2018:1: rule__ChoiceQuestion__Group__4__Impl : ( ( rule__ChoiceQuestion__IdAssignment_4 ) ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2022:1: ( ( ( rule__ChoiceQuestion__IdAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2023:1: ( ( rule__ChoiceQuestion__IdAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2023:1: ( ( rule__ChoiceQuestion__IdAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2024:1: ( rule__ChoiceQuestion__IdAssignment_4 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getIdAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2025:1: ( rule__ChoiceQuestion__IdAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2025:2: rule__ChoiceQuestion__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__IdAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl4010);
            rule__ChoiceQuestion__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getIdAssignment_4()); 

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


    // $ANTLR start "rule__ChoiceQuestion__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2035:1: rule__ChoiceQuestion__Group__5 : rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 ;
    public final void rule__ChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2039:1: ( rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2040:2: rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__54040);
            rule__ChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__54043);
            rule__ChoiceQuestion__Group__6();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__5"


    // $ANTLR start "rule__ChoiceQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2047:1: rule__ChoiceQuestion__Group__5__Impl : ( 'title' ) ;
    public final void rule__ChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2051:1: ( ( 'title' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2052:1: ( 'title' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2052:1: ( 'title' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2053:1: 'title'
            {
             before(grammarAccess.getChoiceQuestionAccess().getTitleKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ChoiceQuestion__Group__5__Impl4071); 
             after(grammarAccess.getChoiceQuestionAccess().getTitleKeyword_5()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__5__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2066:1: rule__ChoiceQuestion__Group__6 : rule__ChoiceQuestion__Group__6__Impl rule__ChoiceQuestion__Group__7 ;
    public final void rule__ChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2070:1: ( rule__ChoiceQuestion__Group__6__Impl rule__ChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2071:2: rule__ChoiceQuestion__Group__6__Impl rule__ChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__64102);
            rule__ChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__7_in_rule__ChoiceQuestion__Group__64105);
            rule__ChoiceQuestion__Group__7();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__6"


    // $ANTLR start "rule__ChoiceQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2078:1: rule__ChoiceQuestion__Group__6__Impl : ( ( rule__ChoiceQuestion__TitleAssignment_6 ) ) ;
    public final void rule__ChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2082:1: ( ( ( rule__ChoiceQuestion__TitleAssignment_6 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2083:1: ( ( rule__ChoiceQuestion__TitleAssignment_6 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2083:1: ( ( rule__ChoiceQuestion__TitleAssignment_6 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2084:1: ( rule__ChoiceQuestion__TitleAssignment_6 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getTitleAssignment_6()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2085:1: ( rule__ChoiceQuestion__TitleAssignment_6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2085:2: rule__ChoiceQuestion__TitleAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__TitleAssignment_6_in_rule__ChoiceQuestion__Group__6__Impl4132);
            rule__ChoiceQuestion__TitleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getTitleAssignment_6()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__6__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2095:1: rule__ChoiceQuestion__Group__7 : rule__ChoiceQuestion__Group__7__Impl rule__ChoiceQuestion__Group__8 ;
    public final void rule__ChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2099:1: ( rule__ChoiceQuestion__Group__7__Impl rule__ChoiceQuestion__Group__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2100:2: rule__ChoiceQuestion__Group__7__Impl rule__ChoiceQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__7__Impl_in_rule__ChoiceQuestion__Group__74162);
            rule__ChoiceQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__8_in_rule__ChoiceQuestion__Group__74165);
            rule__ChoiceQuestion__Group__8();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__7"


    // $ANTLR start "rule__ChoiceQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2107:1: rule__ChoiceQuestion__Group__7__Impl : ( ( rule__ChoiceQuestion__Group_7__0 )? ) ;
    public final void rule__ChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2111:1: ( ( ( rule__ChoiceQuestion__Group_7__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2112:1: ( ( rule__ChoiceQuestion__Group_7__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2112:1: ( ( rule__ChoiceQuestion__Group_7__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2113:1: ( rule__ChoiceQuestion__Group_7__0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2114:1: ( rule__ChoiceQuestion__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2114:2: rule__ChoiceQuestion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_7__0_in_rule__ChoiceQuestion__Group__7__Impl4192);
                    rule__ChoiceQuestion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__7__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2124:1: rule__ChoiceQuestion__Group__8 : rule__ChoiceQuestion__Group__8__Impl rule__ChoiceQuestion__Group__9 ;
    public final void rule__ChoiceQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2128:1: ( rule__ChoiceQuestion__Group__8__Impl rule__ChoiceQuestion__Group__9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2129:2: rule__ChoiceQuestion__Group__8__Impl rule__ChoiceQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__8__Impl_in_rule__ChoiceQuestion__Group__84223);
            rule__ChoiceQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__9_in_rule__ChoiceQuestion__Group__84226);
            rule__ChoiceQuestion__Group__9();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__8"


    // $ANTLR start "rule__ChoiceQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2136:1: rule__ChoiceQuestion__Group__8__Impl : ( ( rule__ChoiceQuestion__Group_8__0 )? ) ;
    public final void rule__ChoiceQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2140:1: ( ( ( rule__ChoiceQuestion__Group_8__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2141:1: ( ( rule__ChoiceQuestion__Group_8__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2141:1: ( ( rule__ChoiceQuestion__Group_8__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2142:1: ( rule__ChoiceQuestion__Group_8__0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2143:1: ( rule__ChoiceQuestion__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2143:2: rule__ChoiceQuestion__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_8__0_in_rule__ChoiceQuestion__Group__8__Impl4253);
                    rule__ChoiceQuestion__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__8__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2153:1: rule__ChoiceQuestion__Group__9 : rule__ChoiceQuestion__Group__9__Impl rule__ChoiceQuestion__Group__10 ;
    public final void rule__ChoiceQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2157:1: ( rule__ChoiceQuestion__Group__9__Impl rule__ChoiceQuestion__Group__10 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2158:2: rule__ChoiceQuestion__Group__9__Impl rule__ChoiceQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__9__Impl_in_rule__ChoiceQuestion__Group__94284);
            rule__ChoiceQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__10_in_rule__ChoiceQuestion__Group__94287);
            rule__ChoiceQuestion__Group__10();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__9"


    // $ANTLR start "rule__ChoiceQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2165:1: rule__ChoiceQuestion__Group__9__Impl : ( ( rule__ChoiceQuestion__Group_9__0 )? ) ;
    public final void rule__ChoiceQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2169:1: ( ( ( rule__ChoiceQuestion__Group_9__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2170:1: ( ( rule__ChoiceQuestion__Group_9__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2170:1: ( ( rule__ChoiceQuestion__Group_9__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2171:1: ( rule__ChoiceQuestion__Group_9__0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_9()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2172:1: ( rule__ChoiceQuestion__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2172:2: rule__ChoiceQuestion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_9__0_in_rule__ChoiceQuestion__Group__9__Impl4314);
                    rule__ChoiceQuestion__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup_9()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__9__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__10"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2182:1: rule__ChoiceQuestion__Group__10 : rule__ChoiceQuestion__Group__10__Impl rule__ChoiceQuestion__Group__11 ;
    public final void rule__ChoiceQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2186:1: ( rule__ChoiceQuestion__Group__10__Impl rule__ChoiceQuestion__Group__11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2187:2: rule__ChoiceQuestion__Group__10__Impl rule__ChoiceQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__10__Impl_in_rule__ChoiceQuestion__Group__104345);
            rule__ChoiceQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__11_in_rule__ChoiceQuestion__Group__104348);
            rule__ChoiceQuestion__Group__11();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__10"


    // $ANTLR start "rule__ChoiceQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2194:1: rule__ChoiceQuestion__Group__10__Impl : ( ( rule__ChoiceQuestion__Group_10__0 )? ) ;
    public final void rule__ChoiceQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2198:1: ( ( ( rule__ChoiceQuestion__Group_10__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2199:1: ( ( rule__ChoiceQuestion__Group_10__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2199:1: ( ( rule__ChoiceQuestion__Group_10__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2200:1: ( rule__ChoiceQuestion__Group_10__0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_10()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2201:1: ( rule__ChoiceQuestion__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2201:2: rule__ChoiceQuestion__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__0_in_rule__ChoiceQuestion__Group__10__Impl4375);
                    rule__ChoiceQuestion__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup_10()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__10__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2211:1: rule__ChoiceQuestion__Group__11 : rule__ChoiceQuestion__Group__11__Impl rule__ChoiceQuestion__Group__12 ;
    public final void rule__ChoiceQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2215:1: ( rule__ChoiceQuestion__Group__11__Impl rule__ChoiceQuestion__Group__12 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2216:2: rule__ChoiceQuestion__Group__11__Impl rule__ChoiceQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__11__Impl_in_rule__ChoiceQuestion__Group__114406);
            rule__ChoiceQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__12_in_rule__ChoiceQuestion__Group__114409);
            rule__ChoiceQuestion__Group__12();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__11"


    // $ANTLR start "rule__ChoiceQuestion__Group__11__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2223:1: rule__ChoiceQuestion__Group__11__Impl : ( 'options' ) ;
    public final void rule__ChoiceQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2227:1: ( ( 'options' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2228:1: ( 'options' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2228:1: ( 'options' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2229:1: 'options'
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsKeyword_11()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__ChoiceQuestion__Group__11__Impl4437); 
             after(grammarAccess.getChoiceQuestionAccess().getOptionsKeyword_11()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__11__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__12"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2242:1: rule__ChoiceQuestion__Group__12 : rule__ChoiceQuestion__Group__12__Impl rule__ChoiceQuestion__Group__13 ;
    public final void rule__ChoiceQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2246:1: ( rule__ChoiceQuestion__Group__12__Impl rule__ChoiceQuestion__Group__13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2247:2: rule__ChoiceQuestion__Group__12__Impl rule__ChoiceQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__12__Impl_in_rule__ChoiceQuestion__Group__124468);
            rule__ChoiceQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__13_in_rule__ChoiceQuestion__Group__124471);
            rule__ChoiceQuestion__Group__13();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__12"


    // $ANTLR start "rule__ChoiceQuestion__Group__12__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2254:1: rule__ChoiceQuestion__Group__12__Impl : ( '{' ) ;
    public final void rule__ChoiceQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2258:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2259:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2259:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2260:1: '{'
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ChoiceQuestion__Group__12__Impl4499); 
             after(grammarAccess.getChoiceQuestionAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__12__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2273:1: rule__ChoiceQuestion__Group__13 : rule__ChoiceQuestion__Group__13__Impl rule__ChoiceQuestion__Group__14 ;
    public final void rule__ChoiceQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2277:1: ( rule__ChoiceQuestion__Group__13__Impl rule__ChoiceQuestion__Group__14 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2278:2: rule__ChoiceQuestion__Group__13__Impl rule__ChoiceQuestion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__13__Impl_in_rule__ChoiceQuestion__Group__134530);
            rule__ChoiceQuestion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__14_in_rule__ChoiceQuestion__Group__134533);
            rule__ChoiceQuestion__Group__14();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__13"


    // $ANTLR start "rule__ChoiceQuestion__Group__13__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2285:1: rule__ChoiceQuestion__Group__13__Impl : ( ( rule__ChoiceQuestion__OptionsAssignment_13 ) ) ;
    public final void rule__ChoiceQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2289:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_13 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2290:1: ( ( rule__ChoiceQuestion__OptionsAssignment_13 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2290:1: ( ( rule__ChoiceQuestion__OptionsAssignment_13 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2291:1: ( rule__ChoiceQuestion__OptionsAssignment_13 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_13()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2292:1: ( rule__ChoiceQuestion__OptionsAssignment_13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2292:2: rule__ChoiceQuestion__OptionsAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_13_in_rule__ChoiceQuestion__Group__13__Impl4560);
            rule__ChoiceQuestion__OptionsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_13()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__13__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__14"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2302:1: rule__ChoiceQuestion__Group__14 : rule__ChoiceQuestion__Group__14__Impl rule__ChoiceQuestion__Group__15 ;
    public final void rule__ChoiceQuestion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2306:1: ( rule__ChoiceQuestion__Group__14__Impl rule__ChoiceQuestion__Group__15 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2307:2: rule__ChoiceQuestion__Group__14__Impl rule__ChoiceQuestion__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__14__Impl_in_rule__ChoiceQuestion__Group__144590);
            rule__ChoiceQuestion__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__15_in_rule__ChoiceQuestion__Group__144593);
            rule__ChoiceQuestion__Group__15();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__14"


    // $ANTLR start "rule__ChoiceQuestion__Group__14__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2314:1: rule__ChoiceQuestion__Group__14__Impl : ( ( rule__ChoiceQuestion__Group_14__0 )* ) ;
    public final void rule__ChoiceQuestion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2318:1: ( ( ( rule__ChoiceQuestion__Group_14__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2319:1: ( ( rule__ChoiceQuestion__Group_14__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2319:1: ( ( rule__ChoiceQuestion__Group_14__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2320:1: ( rule__ChoiceQuestion__Group_14__0 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_14()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2321:1: ( rule__ChoiceQuestion__Group_14__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2321:2: rule__ChoiceQuestion__Group_14__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_14__0_in_rule__ChoiceQuestion__Group__14__Impl4620);
            	    rule__ChoiceQuestion__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getChoiceQuestionAccess().getGroup_14()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__14__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__15"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2331:1: rule__ChoiceQuestion__Group__15 : rule__ChoiceQuestion__Group__15__Impl rule__ChoiceQuestion__Group__16 ;
    public final void rule__ChoiceQuestion__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2335:1: ( rule__ChoiceQuestion__Group__15__Impl rule__ChoiceQuestion__Group__16 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2336:2: rule__ChoiceQuestion__Group__15__Impl rule__ChoiceQuestion__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__15__Impl_in_rule__ChoiceQuestion__Group__154651);
            rule__ChoiceQuestion__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__16_in_rule__ChoiceQuestion__Group__154654);
            rule__ChoiceQuestion__Group__16();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__15"


    // $ANTLR start "rule__ChoiceQuestion__Group__15__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2343:1: rule__ChoiceQuestion__Group__15__Impl : ( '}' ) ;
    public final void rule__ChoiceQuestion__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2347:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2348:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2348:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2349:1: '}'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_15()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ChoiceQuestion__Group__15__Impl4682); 
             after(grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__15__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__16"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2362:1: rule__ChoiceQuestion__Group__16 : rule__ChoiceQuestion__Group__16__Impl ;
    public final void rule__ChoiceQuestion__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2366:1: ( rule__ChoiceQuestion__Group__16__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2367:2: rule__ChoiceQuestion__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group__16__Impl_in_rule__ChoiceQuestion__Group__164713);
            rule__ChoiceQuestion__Group__16__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group__16"


    // $ANTLR start "rule__ChoiceQuestion__Group__16__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2373:1: rule__ChoiceQuestion__Group__16__Impl : ( '}' ) ;
    public final void rule__ChoiceQuestion__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2377:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2378:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2378:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2379:1: '}'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__ChoiceQuestion__Group__16__Impl4741); 
             after(grammarAccess.getChoiceQuestionAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group__16__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_7__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2426:1: rule__ChoiceQuestion__Group_7__0 : rule__ChoiceQuestion__Group_7__0__Impl rule__ChoiceQuestion__Group_7__1 ;
    public final void rule__ChoiceQuestion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2430:1: ( rule__ChoiceQuestion__Group_7__0__Impl rule__ChoiceQuestion__Group_7__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2431:2: rule__ChoiceQuestion__Group_7__0__Impl rule__ChoiceQuestion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_7__0__Impl_in_rule__ChoiceQuestion__Group_7__04806);
            rule__ChoiceQuestion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_7__1_in_rule__ChoiceQuestion__Group_7__04809);
            rule__ChoiceQuestion__Group_7__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_7__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_7__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2438:1: rule__ChoiceQuestion__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__ChoiceQuestion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2442:1: ( ( 'description' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2443:1: ( 'description' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2443:1: ( 'description' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2444:1: 'description'
            {
             before(grammarAccess.getChoiceQuestionAccess().getDescriptionKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ChoiceQuestion__Group_7__0__Impl4837); 
             after(grammarAccess.getChoiceQuestionAccess().getDescriptionKeyword_7_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_7__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_7__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2457:1: rule__ChoiceQuestion__Group_7__1 : rule__ChoiceQuestion__Group_7__1__Impl ;
    public final void rule__ChoiceQuestion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2461:1: ( rule__ChoiceQuestion__Group_7__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2462:2: rule__ChoiceQuestion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_7__1__Impl_in_rule__ChoiceQuestion__Group_7__14868);
            rule__ChoiceQuestion__Group_7__1__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_7__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_7__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2468:1: rule__ChoiceQuestion__Group_7__1__Impl : ( ( rule__ChoiceQuestion__DescriptionAssignment_7_1 ) ) ;
    public final void rule__ChoiceQuestion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2472:1: ( ( ( rule__ChoiceQuestion__DescriptionAssignment_7_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2473:1: ( ( rule__ChoiceQuestion__DescriptionAssignment_7_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2473:1: ( ( rule__ChoiceQuestion__DescriptionAssignment_7_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2474:1: ( rule__ChoiceQuestion__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getDescriptionAssignment_7_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2475:1: ( rule__ChoiceQuestion__DescriptionAssignment_7_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2475:2: rule__ChoiceQuestion__DescriptionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__DescriptionAssignment_7_1_in_rule__ChoiceQuestion__Group_7__1__Impl4895);
            rule__ChoiceQuestion__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getDescriptionAssignment_7_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_7__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_8__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2489:1: rule__ChoiceQuestion__Group_8__0 : rule__ChoiceQuestion__Group_8__0__Impl rule__ChoiceQuestion__Group_8__1 ;
    public final void rule__ChoiceQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2493:1: ( rule__ChoiceQuestion__Group_8__0__Impl rule__ChoiceQuestion__Group_8__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2494:2: rule__ChoiceQuestion__Group_8__0__Impl rule__ChoiceQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_8__0__Impl_in_rule__ChoiceQuestion__Group_8__04929);
            rule__ChoiceQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_8__1_in_rule__ChoiceQuestion__Group_8__04932);
            rule__ChoiceQuestion__Group_8__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_8__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2501:1: rule__ChoiceQuestion__Group_8__0__Impl : ( 'minSelections' ) ;
    public final void rule__ChoiceQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2505:1: ( ( 'minSelections' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2506:1: ( 'minSelections' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2506:1: ( 'minSelections' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2507:1: 'minSelections'
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsKeyword_8_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__ChoiceQuestion__Group_8__0__Impl4960); 
             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsKeyword_8_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_8__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2520:1: rule__ChoiceQuestion__Group_8__1 : rule__ChoiceQuestion__Group_8__1__Impl ;
    public final void rule__ChoiceQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2524:1: ( rule__ChoiceQuestion__Group_8__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2525:2: rule__ChoiceQuestion__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_8__1__Impl_in_rule__ChoiceQuestion__Group_8__14991);
            rule__ChoiceQuestion__Group_8__1__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_8__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2531:1: rule__ChoiceQuestion__Group_8__1__Impl : ( ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 ) ) ;
    public final void rule__ChoiceQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2535:1: ( ( ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2536:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2536:1: ( ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2537:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_8_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2538:1: ( rule__ChoiceQuestion__MinSelectionsAssignment_8_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2538:2: rule__ChoiceQuestion__MinSelectionsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_8_1_in_rule__ChoiceQuestion__Group_8__1__Impl5018);
            rule__ChoiceQuestion__MinSelectionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsAssignment_8_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_9__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2552:1: rule__ChoiceQuestion__Group_9__0 : rule__ChoiceQuestion__Group_9__0__Impl rule__ChoiceQuestion__Group_9__1 ;
    public final void rule__ChoiceQuestion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2556:1: ( rule__ChoiceQuestion__Group_9__0__Impl rule__ChoiceQuestion__Group_9__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2557:2: rule__ChoiceQuestion__Group_9__0__Impl rule__ChoiceQuestion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_9__0__Impl_in_rule__ChoiceQuestion__Group_9__05052);
            rule__ChoiceQuestion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_9__1_in_rule__ChoiceQuestion__Group_9__05055);
            rule__ChoiceQuestion__Group_9__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_9__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_9__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2564:1: rule__ChoiceQuestion__Group_9__0__Impl : ( 'maxSelections' ) ;
    public final void rule__ChoiceQuestion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2568:1: ( ( 'maxSelections' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2569:1: ( 'maxSelections' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2569:1: ( 'maxSelections' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2570:1: 'maxSelections'
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsKeyword_9_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ChoiceQuestion__Group_9__0__Impl5083); 
             after(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsKeyword_9_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_9__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_9__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2583:1: rule__ChoiceQuestion__Group_9__1 : rule__ChoiceQuestion__Group_9__1__Impl ;
    public final void rule__ChoiceQuestion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2587:1: ( rule__ChoiceQuestion__Group_9__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2588:2: rule__ChoiceQuestion__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_9__1__Impl_in_rule__ChoiceQuestion__Group_9__15114);
            rule__ChoiceQuestion__Group_9__1__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_9__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_9__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2594:1: rule__ChoiceQuestion__Group_9__1__Impl : ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 ) ) ;
    public final void rule__ChoiceQuestion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2598:1: ( ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2599:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2599:1: ( ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2600:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_9_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2601:1: ( rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2601:2: rule__ChoiceQuestion__MaxSelectionsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_9_1_in_rule__ChoiceQuestion__Group_9__1__Impl5141);
            rule__ChoiceQuestion__MaxSelectionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsAssignment_9_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_9__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2615:1: rule__ChoiceQuestion__Group_10__0 : rule__ChoiceQuestion__Group_10__0__Impl rule__ChoiceQuestion__Group_10__1 ;
    public final void rule__ChoiceQuestion__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2619:1: ( rule__ChoiceQuestion__Group_10__0__Impl rule__ChoiceQuestion__Group_10__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2620:2: rule__ChoiceQuestion__Group_10__0__Impl rule__ChoiceQuestion__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__0__Impl_in_rule__ChoiceQuestion__Group_10__05175);
            rule__ChoiceQuestion__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__1_in_rule__ChoiceQuestion__Group_10__05178);
            rule__ChoiceQuestion__Group_10__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2627:1: rule__ChoiceQuestion__Group_10__0__Impl : ( 'conditions' ) ;
    public final void rule__ChoiceQuestion__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2631:1: ( ( 'conditions' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2632:1: ( 'conditions' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2632:1: ( 'conditions' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2633:1: 'conditions'
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsKeyword_10_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ChoiceQuestion__Group_10__0__Impl5206); 
             after(grammarAccess.getChoiceQuestionAccess().getConditionsKeyword_10_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2646:1: rule__ChoiceQuestion__Group_10__1 : rule__ChoiceQuestion__Group_10__1__Impl rule__ChoiceQuestion__Group_10__2 ;
    public final void rule__ChoiceQuestion__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2650:1: ( rule__ChoiceQuestion__Group_10__1__Impl rule__ChoiceQuestion__Group_10__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2651:2: rule__ChoiceQuestion__Group_10__1__Impl rule__ChoiceQuestion__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__1__Impl_in_rule__ChoiceQuestion__Group_10__15237);
            rule__ChoiceQuestion__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__2_in_rule__ChoiceQuestion__Group_10__15240);
            rule__ChoiceQuestion__Group_10__2();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2658:1: rule__ChoiceQuestion__Group_10__1__Impl : ( '(' ) ;
    public final void rule__ChoiceQuestion__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2662:1: ( ( '(' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2663:1: ( '(' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2663:1: ( '(' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2664:1: '('
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ChoiceQuestion__Group_10__1__Impl5268); 
             after(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_10_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2677:1: rule__ChoiceQuestion__Group_10__2 : rule__ChoiceQuestion__Group_10__2__Impl rule__ChoiceQuestion__Group_10__3 ;
    public final void rule__ChoiceQuestion__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2681:1: ( rule__ChoiceQuestion__Group_10__2__Impl rule__ChoiceQuestion__Group_10__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2682:2: rule__ChoiceQuestion__Group_10__2__Impl rule__ChoiceQuestion__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__2__Impl_in_rule__ChoiceQuestion__Group_10__25299);
            rule__ChoiceQuestion__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__3_in_rule__ChoiceQuestion__Group_10__25302);
            rule__ChoiceQuestion__Group_10__3();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__2"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2689:1: rule__ChoiceQuestion__Group_10__2__Impl : ( ( rule__ChoiceQuestion__ConditionsAssignment_10_2 ) ) ;
    public final void rule__ChoiceQuestion__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2693:1: ( ( ( rule__ChoiceQuestion__ConditionsAssignment_10_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2694:1: ( ( rule__ChoiceQuestion__ConditionsAssignment_10_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2694:1: ( ( rule__ChoiceQuestion__ConditionsAssignment_10_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2695:1: ( rule__ChoiceQuestion__ConditionsAssignment_10_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2696:1: ( rule__ChoiceQuestion__ConditionsAssignment_10_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2696:2: rule__ChoiceQuestion__ConditionsAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__ConditionsAssignment_10_2_in_rule__ChoiceQuestion__Group_10__2__Impl5329);
            rule__ChoiceQuestion__ConditionsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_2()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2706:1: rule__ChoiceQuestion__Group_10__3 : rule__ChoiceQuestion__Group_10__3__Impl rule__ChoiceQuestion__Group_10__4 ;
    public final void rule__ChoiceQuestion__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2710:1: ( rule__ChoiceQuestion__Group_10__3__Impl rule__ChoiceQuestion__Group_10__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2711:2: rule__ChoiceQuestion__Group_10__3__Impl rule__ChoiceQuestion__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__3__Impl_in_rule__ChoiceQuestion__Group_10__35359);
            rule__ChoiceQuestion__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__4_in_rule__ChoiceQuestion__Group_10__35362);
            rule__ChoiceQuestion__Group_10__4();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__3"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2718:1: rule__ChoiceQuestion__Group_10__3__Impl : ( ( rule__ChoiceQuestion__Group_10_3__0 )* ) ;
    public final void rule__ChoiceQuestion__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2722:1: ( ( ( rule__ChoiceQuestion__Group_10_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2723:1: ( ( rule__ChoiceQuestion__Group_10_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2723:1: ( ( rule__ChoiceQuestion__Group_10_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2724:1: ( rule__ChoiceQuestion__Group_10_3__0 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup_10_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2725:1: ( rule__ChoiceQuestion__Group_10_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2725:2: rule__ChoiceQuestion__Group_10_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10_3__0_in_rule__ChoiceQuestion__Group_10__3__Impl5389);
            	    rule__ChoiceQuestion__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getChoiceQuestionAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__3__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2735:1: rule__ChoiceQuestion__Group_10__4 : rule__ChoiceQuestion__Group_10__4__Impl ;
    public final void rule__ChoiceQuestion__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2739:1: ( rule__ChoiceQuestion__Group_10__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2740:2: rule__ChoiceQuestion__Group_10__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10__4__Impl_in_rule__ChoiceQuestion__Group_10__45420);
            rule__ChoiceQuestion__Group_10__4__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__4"


    // $ANTLR start "rule__ChoiceQuestion__Group_10__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2746:1: rule__ChoiceQuestion__Group_10__4__Impl : ( ')' ) ;
    public final void rule__ChoiceQuestion__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2750:1: ( ( ')' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2751:1: ( ')' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2751:1: ( ')' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2752:1: ')'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_10_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ChoiceQuestion__Group_10__4__Impl5448); 
             after(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_10_4()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10__4__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2775:1: rule__ChoiceQuestion__Group_10_3__0 : rule__ChoiceQuestion__Group_10_3__0__Impl rule__ChoiceQuestion__Group_10_3__1 ;
    public final void rule__ChoiceQuestion__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2779:1: ( rule__ChoiceQuestion__Group_10_3__0__Impl rule__ChoiceQuestion__Group_10_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2780:2: rule__ChoiceQuestion__Group_10_3__0__Impl rule__ChoiceQuestion__Group_10_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10_3__0__Impl_in_rule__ChoiceQuestion__Group_10_3__05489);
            rule__ChoiceQuestion__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10_3__1_in_rule__ChoiceQuestion__Group_10_3__05492);
            rule__ChoiceQuestion__Group_10_3__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10_3__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_10_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2787:1: rule__ChoiceQuestion__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ChoiceQuestion__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2791:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2792:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2792:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2793:1: ','
            {
             before(grammarAccess.getChoiceQuestionAccess().getCommaKeyword_10_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ChoiceQuestion__Group_10_3__0__Impl5520); 
             after(grammarAccess.getChoiceQuestionAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10_3__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_10_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2806:1: rule__ChoiceQuestion__Group_10_3__1 : rule__ChoiceQuestion__Group_10_3__1__Impl ;
    public final void rule__ChoiceQuestion__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2810:1: ( rule__ChoiceQuestion__Group_10_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2811:2: rule__ChoiceQuestion__Group_10_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_10_3__1__Impl_in_rule__ChoiceQuestion__Group_10_3__15551);
            rule__ChoiceQuestion__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10_3__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_10_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2817:1: rule__ChoiceQuestion__Group_10_3__1__Impl : ( ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 ) ) ;
    public final void rule__ChoiceQuestion__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2821:1: ( ( ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2822:1: ( ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2822:1: ( ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2823:1: ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2824:1: ( rule__ChoiceQuestion__ConditionsAssignment_10_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2824:2: rule__ChoiceQuestion__ConditionsAssignment_10_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__ConditionsAssignment_10_3_1_in_rule__ChoiceQuestion__Group_10_3__1__Impl5578);
            rule__ChoiceQuestion__ConditionsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getConditionsAssignment_10_3_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_10_3__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_14__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2838:1: rule__ChoiceQuestion__Group_14__0 : rule__ChoiceQuestion__Group_14__0__Impl rule__ChoiceQuestion__Group_14__1 ;
    public final void rule__ChoiceQuestion__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2842:1: ( rule__ChoiceQuestion__Group_14__0__Impl rule__ChoiceQuestion__Group_14__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2843:2: rule__ChoiceQuestion__Group_14__0__Impl rule__ChoiceQuestion__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_14__0__Impl_in_rule__ChoiceQuestion__Group_14__05612);
            rule__ChoiceQuestion__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_14__1_in_rule__ChoiceQuestion__Group_14__05615);
            rule__ChoiceQuestion__Group_14__1();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_14__0"


    // $ANTLR start "rule__ChoiceQuestion__Group_14__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2850:1: rule__ChoiceQuestion__Group_14__0__Impl : ( ',' ) ;
    public final void rule__ChoiceQuestion__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2854:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2855:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2855:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2856:1: ','
            {
             before(grammarAccess.getChoiceQuestionAccess().getCommaKeyword_14_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ChoiceQuestion__Group_14__0__Impl5643); 
             after(grammarAccess.getChoiceQuestionAccess().getCommaKeyword_14_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_14__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group_14__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2869:1: rule__ChoiceQuestion__Group_14__1 : rule__ChoiceQuestion__Group_14__1__Impl ;
    public final void rule__ChoiceQuestion__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2873:1: ( rule__ChoiceQuestion__Group_14__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2874:2: rule__ChoiceQuestion__Group_14__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__Group_14__1__Impl_in_rule__ChoiceQuestion__Group_14__15674);
            rule__ChoiceQuestion__Group_14__1__Impl();

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
    // $ANTLR end "rule__ChoiceQuestion__Group_14__1"


    // $ANTLR start "rule__ChoiceQuestion__Group_14__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2880:1: rule__ChoiceQuestion__Group_14__1__Impl : ( ( rule__ChoiceQuestion__OptionsAssignment_14_1 ) ) ;
    public final void rule__ChoiceQuestion__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2884:1: ( ( ( rule__ChoiceQuestion__OptionsAssignment_14_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2885:1: ( ( rule__ChoiceQuestion__OptionsAssignment_14_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2885:1: ( ( rule__ChoiceQuestion__OptionsAssignment_14_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2886:1: ( rule__ChoiceQuestion__OptionsAssignment_14_1 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_14_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2887:1: ( rule__ChoiceQuestion__OptionsAssignment_14_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2887:2: rule__ChoiceQuestion__OptionsAssignment_14_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceQuestion__OptionsAssignment_14_1_in_rule__ChoiceQuestion__Group_14__1__Impl5701);
            rule__ChoiceQuestion__OptionsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getOptionsAssignment_14_1()); 

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
    // $ANTLR end "rule__ChoiceQuestion__Group_14__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2901:1: rule__MatrixQuestion__Group__0 : rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 ;
    public final void rule__MatrixQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2905:1: ( rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2906:2: rule__MatrixQuestion__Group__0__Impl rule__MatrixQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__05735);
            rule__MatrixQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__05738);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2913:1: rule__MatrixQuestion__Group__0__Impl : ( ( rule__MatrixQuestion__MandatoryAssignment_0 ) ) ;
    public final void rule__MatrixQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2917:1: ( ( ( rule__MatrixQuestion__MandatoryAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2918:1: ( ( rule__MatrixQuestion__MandatoryAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2918:1: ( ( rule__MatrixQuestion__MandatoryAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2919:1: ( rule__MatrixQuestion__MandatoryAssignment_0 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getMandatoryAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2920:1: ( rule__MatrixQuestion__MandatoryAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2920:2: rule__MatrixQuestion__MandatoryAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__MandatoryAssignment_0_in_rule__MatrixQuestion__Group__0__Impl5765);
            rule__MatrixQuestion__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getMandatoryAssignment_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2930:1: rule__MatrixQuestion__Group__1 : rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 ;
    public final void rule__MatrixQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2934:1: ( rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2935:2: rule__MatrixQuestion__Group__1__Impl rule__MatrixQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__15795);
            rule__MatrixQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__15798);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2942:1: rule__MatrixQuestion__Group__1__Impl : ( 'MatrixQuestion' ) ;
    public final void rule__MatrixQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2946:1: ( ( 'MatrixQuestion' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2947:1: ( 'MatrixQuestion' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2947:1: ( 'MatrixQuestion' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2948:1: 'MatrixQuestion'
            {
             before(grammarAccess.getMatrixQuestionAccess().getMatrixQuestionKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MatrixQuestion__Group__1__Impl5826); 
             after(grammarAccess.getMatrixQuestionAccess().getMatrixQuestionKeyword_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2961:1: rule__MatrixQuestion__Group__2 : rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 ;
    public final void rule__MatrixQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2965:1: ( rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2966:2: rule__MatrixQuestion__Group__2__Impl rule__MatrixQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__25857);
            rule__MatrixQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__25860);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2973:1: rule__MatrixQuestion__Group__2__Impl : ( '{' ) ;
    public final void rule__MatrixQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2977:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2978:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2978:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2979:1: '{'
            {
             before(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MatrixQuestion__Group__2__Impl5888); 
             after(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2992:1: rule__MatrixQuestion__Group__3 : rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 ;
    public final void rule__MatrixQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2996:1: ( rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:2997:2: rule__MatrixQuestion__Group__3__Impl rule__MatrixQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__35919);
            rule__MatrixQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__35922);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3004:1: rule__MatrixQuestion__Group__3__Impl : ( 'id' ) ;
    public final void rule__MatrixQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3008:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3009:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3009:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3010:1: 'id'
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MatrixQuestion__Group__3__Impl5950); 
             after(grammarAccess.getMatrixQuestionAccess().getIdKeyword_3()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3023:1: rule__MatrixQuestion__Group__4 : rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 ;
    public final void rule__MatrixQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3027:1: ( rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3028:2: rule__MatrixQuestion__Group__4__Impl rule__MatrixQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__45981);
            rule__MatrixQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__45984);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3035:1: rule__MatrixQuestion__Group__4__Impl : ( ( rule__MatrixQuestion__IdAssignment_4 ) ) ;
    public final void rule__MatrixQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3039:1: ( ( ( rule__MatrixQuestion__IdAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3040:1: ( ( rule__MatrixQuestion__IdAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3040:1: ( ( rule__MatrixQuestion__IdAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3041:1: ( rule__MatrixQuestion__IdAssignment_4 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3042:1: ( rule__MatrixQuestion__IdAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3042:2: rule__MatrixQuestion__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__IdAssignment_4_in_rule__MatrixQuestion__Group__4__Impl6011);
            rule__MatrixQuestion__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getIdAssignment_4()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3052:1: rule__MatrixQuestion__Group__5 : rule__MatrixQuestion__Group__5__Impl rule__MatrixQuestion__Group__6 ;
    public final void rule__MatrixQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3056:1: ( rule__MatrixQuestion__Group__5__Impl rule__MatrixQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3057:2: rule__MatrixQuestion__Group__5__Impl rule__MatrixQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__56041);
            rule__MatrixQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__6_in_rule__MatrixQuestion__Group__56044);
            rule__MatrixQuestion__Group__6();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3064:1: rule__MatrixQuestion__Group__5__Impl : ( 'title' ) ;
    public final void rule__MatrixQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3068:1: ( ( 'title' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3069:1: ( 'title' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3069:1: ( 'title' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3070:1: 'title'
            {
             before(grammarAccess.getMatrixQuestionAccess().getTitleKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MatrixQuestion__Group__5__Impl6072); 
             after(grammarAccess.getMatrixQuestionAccess().getTitleKeyword_5()); 

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


    // $ANTLR start "rule__MatrixQuestion__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3083:1: rule__MatrixQuestion__Group__6 : rule__MatrixQuestion__Group__6__Impl rule__MatrixQuestion__Group__7 ;
    public final void rule__MatrixQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3087:1: ( rule__MatrixQuestion__Group__6__Impl rule__MatrixQuestion__Group__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3088:2: rule__MatrixQuestion__Group__6__Impl rule__MatrixQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__6__Impl_in_rule__MatrixQuestion__Group__66103);
            rule__MatrixQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__7_in_rule__MatrixQuestion__Group__66106);
            rule__MatrixQuestion__Group__7();

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
    // $ANTLR end "rule__MatrixQuestion__Group__6"


    // $ANTLR start "rule__MatrixQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3095:1: rule__MatrixQuestion__Group__6__Impl : ( ( rule__MatrixQuestion__TitleAssignment_6 ) ) ;
    public final void rule__MatrixQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3099:1: ( ( ( rule__MatrixQuestion__TitleAssignment_6 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3100:1: ( ( rule__MatrixQuestion__TitleAssignment_6 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3100:1: ( ( rule__MatrixQuestion__TitleAssignment_6 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3101:1: ( rule__MatrixQuestion__TitleAssignment_6 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getTitleAssignment_6()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3102:1: ( rule__MatrixQuestion__TitleAssignment_6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3102:2: rule__MatrixQuestion__TitleAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__TitleAssignment_6_in_rule__MatrixQuestion__Group__6__Impl6133);
            rule__MatrixQuestion__TitleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getTitleAssignment_6()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__6__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3112:1: rule__MatrixQuestion__Group__7 : rule__MatrixQuestion__Group__7__Impl rule__MatrixQuestion__Group__8 ;
    public final void rule__MatrixQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3116:1: ( rule__MatrixQuestion__Group__7__Impl rule__MatrixQuestion__Group__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3117:2: rule__MatrixQuestion__Group__7__Impl rule__MatrixQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__7__Impl_in_rule__MatrixQuestion__Group__76163);
            rule__MatrixQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__8_in_rule__MatrixQuestion__Group__76166);
            rule__MatrixQuestion__Group__8();

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
    // $ANTLR end "rule__MatrixQuestion__Group__7"


    // $ANTLR start "rule__MatrixQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3124:1: rule__MatrixQuestion__Group__7__Impl : ( ( rule__MatrixQuestion__Group_7__0 )? ) ;
    public final void rule__MatrixQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3128:1: ( ( ( rule__MatrixQuestion__Group_7__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3129:1: ( ( rule__MatrixQuestion__Group_7__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3129:1: ( ( rule__MatrixQuestion__Group_7__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3130:1: ( rule__MatrixQuestion__Group_7__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3131:1: ( rule__MatrixQuestion__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3131:2: rule__MatrixQuestion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_7__0_in_rule__MatrixQuestion__Group__7__Impl6193);
                    rule__MatrixQuestion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__7__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3141:1: rule__MatrixQuestion__Group__8 : rule__MatrixQuestion__Group__8__Impl rule__MatrixQuestion__Group__9 ;
    public final void rule__MatrixQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3145:1: ( rule__MatrixQuestion__Group__8__Impl rule__MatrixQuestion__Group__9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3146:2: rule__MatrixQuestion__Group__8__Impl rule__MatrixQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__8__Impl_in_rule__MatrixQuestion__Group__86224);
            rule__MatrixQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__9_in_rule__MatrixQuestion__Group__86227);
            rule__MatrixQuestion__Group__9();

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
    // $ANTLR end "rule__MatrixQuestion__Group__8"


    // $ANTLR start "rule__MatrixQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3153:1: rule__MatrixQuestion__Group__8__Impl : ( ( rule__MatrixQuestion__Group_8__0 )? ) ;
    public final void rule__MatrixQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3157:1: ( ( ( rule__MatrixQuestion__Group_8__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3158:1: ( ( rule__MatrixQuestion__Group_8__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3158:1: ( ( rule__MatrixQuestion__Group_8__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3159:1: ( rule__MatrixQuestion__Group_8__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3160:1: ( rule__MatrixQuestion__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3160:2: rule__MatrixQuestion__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__0_in_rule__MatrixQuestion__Group__8__Impl6254);
                    rule__MatrixQuestion__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_8()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__8__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3170:1: rule__MatrixQuestion__Group__9 : rule__MatrixQuestion__Group__9__Impl rule__MatrixQuestion__Group__10 ;
    public final void rule__MatrixQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3174:1: ( rule__MatrixQuestion__Group__9__Impl rule__MatrixQuestion__Group__10 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3175:2: rule__MatrixQuestion__Group__9__Impl rule__MatrixQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__9__Impl_in_rule__MatrixQuestion__Group__96285);
            rule__MatrixQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__10_in_rule__MatrixQuestion__Group__96288);
            rule__MatrixQuestion__Group__10();

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
    // $ANTLR end "rule__MatrixQuestion__Group__9"


    // $ANTLR start "rule__MatrixQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3182:1: rule__MatrixQuestion__Group__9__Impl : ( ( rule__MatrixQuestion__Group_9__0 )? ) ;
    public final void rule__MatrixQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3186:1: ( ( ( rule__MatrixQuestion__Group_9__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3187:1: ( ( rule__MatrixQuestion__Group_9__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3187:1: ( ( rule__MatrixQuestion__Group_9__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3188:1: ( rule__MatrixQuestion__Group_9__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_9()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3189:1: ( rule__MatrixQuestion__Group_9__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3189:2: rule__MatrixQuestion__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__0_in_rule__MatrixQuestion__Group__9__Impl6315);
                    rule__MatrixQuestion__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_9()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__9__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__10"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3199:1: rule__MatrixQuestion__Group__10 : rule__MatrixQuestion__Group__10__Impl rule__MatrixQuestion__Group__11 ;
    public final void rule__MatrixQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3203:1: ( rule__MatrixQuestion__Group__10__Impl rule__MatrixQuestion__Group__11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3204:2: rule__MatrixQuestion__Group__10__Impl rule__MatrixQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__10__Impl_in_rule__MatrixQuestion__Group__106346);
            rule__MatrixQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__11_in_rule__MatrixQuestion__Group__106349);
            rule__MatrixQuestion__Group__11();

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
    // $ANTLR end "rule__MatrixQuestion__Group__10"


    // $ANTLR start "rule__MatrixQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3211:1: rule__MatrixQuestion__Group__10__Impl : ( 'maxPerRow' ) ;
    public final void rule__MatrixQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3215:1: ( ( 'maxPerRow' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3216:1: ( 'maxPerRow' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3216:1: ( 'maxPerRow' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3217:1: 'maxPerRow'
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowKeyword_10()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MatrixQuestion__Group__10__Impl6377); 
             after(grammarAccess.getMatrixQuestionAccess().getMaxPerRowKeyword_10()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__10__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3230:1: rule__MatrixQuestion__Group__11 : rule__MatrixQuestion__Group__11__Impl rule__MatrixQuestion__Group__12 ;
    public final void rule__MatrixQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3234:1: ( rule__MatrixQuestion__Group__11__Impl rule__MatrixQuestion__Group__12 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3235:2: rule__MatrixQuestion__Group__11__Impl rule__MatrixQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__11__Impl_in_rule__MatrixQuestion__Group__116408);
            rule__MatrixQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__12_in_rule__MatrixQuestion__Group__116411);
            rule__MatrixQuestion__Group__12();

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
    // $ANTLR end "rule__MatrixQuestion__Group__11"


    // $ANTLR start "rule__MatrixQuestion__Group__11__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3242:1: rule__MatrixQuestion__Group__11__Impl : ( ( rule__MatrixQuestion__MaxPerRowAssignment_11 ) ) ;
    public final void rule__MatrixQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3246:1: ( ( ( rule__MatrixQuestion__MaxPerRowAssignment_11 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3247:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_11 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3247:1: ( ( rule__MatrixQuestion__MaxPerRowAssignment_11 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3248:1: ( rule__MatrixQuestion__MaxPerRowAssignment_11 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_11()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3249:1: ( rule__MatrixQuestion__MaxPerRowAssignment_11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3249:2: rule__MatrixQuestion__MaxPerRowAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_11_in_rule__MatrixQuestion__Group__11__Impl6438);
            rule__MatrixQuestion__MaxPerRowAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getMaxPerRowAssignment_11()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__11__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__12"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3259:1: rule__MatrixQuestion__Group__12 : rule__MatrixQuestion__Group__12__Impl rule__MatrixQuestion__Group__13 ;
    public final void rule__MatrixQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3263:1: ( rule__MatrixQuestion__Group__12__Impl rule__MatrixQuestion__Group__13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3264:2: rule__MatrixQuestion__Group__12__Impl rule__MatrixQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__12__Impl_in_rule__MatrixQuestion__Group__126468);
            rule__MatrixQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__13_in_rule__MatrixQuestion__Group__126471);
            rule__MatrixQuestion__Group__13();

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
    // $ANTLR end "rule__MatrixQuestion__Group__12"


    // $ANTLR start "rule__MatrixQuestion__Group__12__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3271:1: rule__MatrixQuestion__Group__12__Impl : ( ( rule__MatrixQuestion__Group_12__0 )? ) ;
    public final void rule__MatrixQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3275:1: ( ( ( rule__MatrixQuestion__Group_12__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3276:1: ( ( rule__MatrixQuestion__Group_12__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3276:1: ( ( rule__MatrixQuestion__Group_12__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3277:1: ( rule__MatrixQuestion__Group_12__0 )?
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_12()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3278:1: ( rule__MatrixQuestion__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3278:2: rule__MatrixQuestion__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__0_in_rule__MatrixQuestion__Group__12__Impl6498);
                    rule__MatrixQuestion__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixQuestionAccess().getGroup_12()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__12__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group__13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3288:1: rule__MatrixQuestion__Group__13 : rule__MatrixQuestion__Group__13__Impl ;
    public final void rule__MatrixQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3292:1: ( rule__MatrixQuestion__Group__13__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3293:2: rule__MatrixQuestion__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group__13__Impl_in_rule__MatrixQuestion__Group__136529);
            rule__MatrixQuestion__Group__13__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group__13"


    // $ANTLR start "rule__MatrixQuestion__Group__13__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3299:1: rule__MatrixQuestion__Group__13__Impl : ( '}' ) ;
    public final void rule__MatrixQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3303:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3304:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3304:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3305:1: '}'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MatrixQuestion__Group__13__Impl6557); 
             after(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group__13__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_7__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3346:1: rule__MatrixQuestion__Group_7__0 : rule__MatrixQuestion__Group_7__0__Impl rule__MatrixQuestion__Group_7__1 ;
    public final void rule__MatrixQuestion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3350:1: ( rule__MatrixQuestion__Group_7__0__Impl rule__MatrixQuestion__Group_7__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3351:2: rule__MatrixQuestion__Group_7__0__Impl rule__MatrixQuestion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_7__0__Impl_in_rule__MatrixQuestion__Group_7__06616);
            rule__MatrixQuestion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_7__1_in_rule__MatrixQuestion__Group_7__06619);
            rule__MatrixQuestion__Group_7__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_7__0"


    // $ANTLR start "rule__MatrixQuestion__Group_7__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3358:1: rule__MatrixQuestion__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__MatrixQuestion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3362:1: ( ( 'description' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3363:1: ( 'description' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3363:1: ( 'description' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3364:1: 'description'
            {
             before(grammarAccess.getMatrixQuestionAccess().getDescriptionKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MatrixQuestion__Group_7__0__Impl6647); 
             after(grammarAccess.getMatrixQuestionAccess().getDescriptionKeyword_7_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_7__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_7__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3377:1: rule__MatrixQuestion__Group_7__1 : rule__MatrixQuestion__Group_7__1__Impl ;
    public final void rule__MatrixQuestion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3381:1: ( rule__MatrixQuestion__Group_7__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3382:2: rule__MatrixQuestion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_7__1__Impl_in_rule__MatrixQuestion__Group_7__16678);
            rule__MatrixQuestion__Group_7__1__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_7__1"


    // $ANTLR start "rule__MatrixQuestion__Group_7__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3388:1: rule__MatrixQuestion__Group_7__1__Impl : ( ( rule__MatrixQuestion__DescriptionAssignment_7_1 ) ) ;
    public final void rule__MatrixQuestion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3392:1: ( ( ( rule__MatrixQuestion__DescriptionAssignment_7_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3393:1: ( ( rule__MatrixQuestion__DescriptionAssignment_7_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3393:1: ( ( rule__MatrixQuestion__DescriptionAssignment_7_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3394:1: ( rule__MatrixQuestion__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getDescriptionAssignment_7_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3395:1: ( rule__MatrixQuestion__DescriptionAssignment_7_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3395:2: rule__MatrixQuestion__DescriptionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__DescriptionAssignment_7_1_in_rule__MatrixQuestion__Group_7__1__Impl6705);
            rule__MatrixQuestion__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getDescriptionAssignment_7_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_7__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3409:1: rule__MatrixQuestion__Group_8__0 : rule__MatrixQuestion__Group_8__0__Impl rule__MatrixQuestion__Group_8__1 ;
    public final void rule__MatrixQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3413:1: ( rule__MatrixQuestion__Group_8__0__Impl rule__MatrixQuestion__Group_8__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3414:2: rule__MatrixQuestion__Group_8__0__Impl rule__MatrixQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__0__Impl_in_rule__MatrixQuestion__Group_8__06739);
            rule__MatrixQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__1_in_rule__MatrixQuestion__Group_8__06742);
            rule__MatrixQuestion__Group_8__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__0"


    // $ANTLR start "rule__MatrixQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3421:1: rule__MatrixQuestion__Group_8__0__Impl : ( 'columnNames' ) ;
    public final void rule__MatrixQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3425:1: ( ( 'columnNames' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3426:1: ( 'columnNames' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3426:1: ( 'columnNames' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3427:1: 'columnNames'
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesKeyword_8_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MatrixQuestion__Group_8__0__Impl6770); 
             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesKeyword_8_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3440:1: rule__MatrixQuestion__Group_8__1 : rule__MatrixQuestion__Group_8__1__Impl rule__MatrixQuestion__Group_8__2 ;
    public final void rule__MatrixQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3444:1: ( rule__MatrixQuestion__Group_8__1__Impl rule__MatrixQuestion__Group_8__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3445:2: rule__MatrixQuestion__Group_8__1__Impl rule__MatrixQuestion__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__1__Impl_in_rule__MatrixQuestion__Group_8__16801);
            rule__MatrixQuestion__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__2_in_rule__MatrixQuestion__Group_8__16804);
            rule__MatrixQuestion__Group_8__2();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__1"


    // $ANTLR start "rule__MatrixQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3452:1: rule__MatrixQuestion__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MatrixQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3456:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3457:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3457:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3458:1: '{'
            {
             before(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MatrixQuestion__Group_8__1__Impl6832); 
             after(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3471:1: rule__MatrixQuestion__Group_8__2 : rule__MatrixQuestion__Group_8__2__Impl rule__MatrixQuestion__Group_8__3 ;
    public final void rule__MatrixQuestion__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3475:1: ( rule__MatrixQuestion__Group_8__2__Impl rule__MatrixQuestion__Group_8__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3476:2: rule__MatrixQuestion__Group_8__2__Impl rule__MatrixQuestion__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__2__Impl_in_rule__MatrixQuestion__Group_8__26863);
            rule__MatrixQuestion__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__3_in_rule__MatrixQuestion__Group_8__26866);
            rule__MatrixQuestion__Group_8__3();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__2"


    // $ANTLR start "rule__MatrixQuestion__Group_8__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3483:1: rule__MatrixQuestion__Group_8__2__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 ) ) ;
    public final void rule__MatrixQuestion__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3487:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3488:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3488:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3489:1: ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3490:1: ( rule__MatrixQuestion__ColumnNamesAssignment_8_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3490:2: rule__MatrixQuestion__ColumnNamesAssignment_8_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_8_2_in_rule__MatrixQuestion__Group_8__2__Impl6893);
            rule__MatrixQuestion__ColumnNamesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_2()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3500:1: rule__MatrixQuestion__Group_8__3 : rule__MatrixQuestion__Group_8__3__Impl rule__MatrixQuestion__Group_8__4 ;
    public final void rule__MatrixQuestion__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3504:1: ( rule__MatrixQuestion__Group_8__3__Impl rule__MatrixQuestion__Group_8__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3505:2: rule__MatrixQuestion__Group_8__3__Impl rule__MatrixQuestion__Group_8__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__3__Impl_in_rule__MatrixQuestion__Group_8__36923);
            rule__MatrixQuestion__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__4_in_rule__MatrixQuestion__Group_8__36926);
            rule__MatrixQuestion__Group_8__4();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__3"


    // $ANTLR start "rule__MatrixQuestion__Group_8__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3512:1: rule__MatrixQuestion__Group_8__3__Impl : ( ( rule__MatrixQuestion__Group_8_3__0 )* ) ;
    public final void rule__MatrixQuestion__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3516:1: ( ( ( rule__MatrixQuestion__Group_8_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3517:1: ( ( rule__MatrixQuestion__Group_8_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3517:1: ( ( rule__MatrixQuestion__Group_8_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3518:1: ( rule__MatrixQuestion__Group_8_3__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_8_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3519:1: ( rule__MatrixQuestion__Group_8_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3519:2: rule__MatrixQuestion__Group_8_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8_3__0_in_rule__MatrixQuestion__Group_8__3__Impl6953);
            	    rule__MatrixQuestion__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMatrixQuestionAccess().getGroup_8_3()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__3__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3529:1: rule__MatrixQuestion__Group_8__4 : rule__MatrixQuestion__Group_8__4__Impl ;
    public final void rule__MatrixQuestion__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3533:1: ( rule__MatrixQuestion__Group_8__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3534:2: rule__MatrixQuestion__Group_8__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8__4__Impl_in_rule__MatrixQuestion__Group_8__46984);
            rule__MatrixQuestion__Group_8__4__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__4"


    // $ANTLR start "rule__MatrixQuestion__Group_8__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3540:1: rule__MatrixQuestion__Group_8__4__Impl : ( '}' ) ;
    public final void rule__MatrixQuestion__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3544:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3545:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3545:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3546:1: '}'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MatrixQuestion__Group_8__4__Impl7012); 
             after(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_8_4()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8__4__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3569:1: rule__MatrixQuestion__Group_8_3__0 : rule__MatrixQuestion__Group_8_3__0__Impl rule__MatrixQuestion__Group_8_3__1 ;
    public final void rule__MatrixQuestion__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3573:1: ( rule__MatrixQuestion__Group_8_3__0__Impl rule__MatrixQuestion__Group_8_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3574:2: rule__MatrixQuestion__Group_8_3__0__Impl rule__MatrixQuestion__Group_8_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8_3__0__Impl_in_rule__MatrixQuestion__Group_8_3__07053);
            rule__MatrixQuestion__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8_3__1_in_rule__MatrixQuestion__Group_8_3__07056);
            rule__MatrixQuestion__Group_8_3__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8_3__0"


    // $ANTLR start "rule__MatrixQuestion__Group_8_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3581:1: rule__MatrixQuestion__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__MatrixQuestion__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3585:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3586:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3586:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3587:1: ','
            {
             before(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_8_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MatrixQuestion__Group_8_3__0__Impl7084); 
             after(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_8_3_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8_3__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_8_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3600:1: rule__MatrixQuestion__Group_8_3__1 : rule__MatrixQuestion__Group_8_3__1__Impl ;
    public final void rule__MatrixQuestion__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3604:1: ( rule__MatrixQuestion__Group_8_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3605:2: rule__MatrixQuestion__Group_8_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_8_3__1__Impl_in_rule__MatrixQuestion__Group_8_3__17115);
            rule__MatrixQuestion__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_8_3__1"


    // $ANTLR start "rule__MatrixQuestion__Group_8_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3611:1: rule__MatrixQuestion__Group_8_3__1__Impl : ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 ) ) ;
    public final void rule__MatrixQuestion__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3615:1: ( ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3616:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3616:1: ( ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3617:1: ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3618:1: ( rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3618:2: rule__MatrixQuestion__ColumnNamesAssignment_8_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_8_3_1_in_rule__MatrixQuestion__Group_8_3__1__Impl7142);
            rule__MatrixQuestion__ColumnNamesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesAssignment_8_3_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_8_3__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3632:1: rule__MatrixQuestion__Group_9__0 : rule__MatrixQuestion__Group_9__0__Impl rule__MatrixQuestion__Group_9__1 ;
    public final void rule__MatrixQuestion__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3636:1: ( rule__MatrixQuestion__Group_9__0__Impl rule__MatrixQuestion__Group_9__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3637:2: rule__MatrixQuestion__Group_9__0__Impl rule__MatrixQuestion__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__0__Impl_in_rule__MatrixQuestion__Group_9__07176);
            rule__MatrixQuestion__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__1_in_rule__MatrixQuestion__Group_9__07179);
            rule__MatrixQuestion__Group_9__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__0"


    // $ANTLR start "rule__MatrixQuestion__Group_9__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3644:1: rule__MatrixQuestion__Group_9__0__Impl : ( 'rowNames' ) ;
    public final void rule__MatrixQuestion__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3648:1: ( ( 'rowNames' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3649:1: ( 'rowNames' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3649:1: ( 'rowNames' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3650:1: 'rowNames'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesKeyword_9_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MatrixQuestion__Group_9__0__Impl7207); 
             after(grammarAccess.getMatrixQuestionAccess().getRowNamesKeyword_9_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3663:1: rule__MatrixQuestion__Group_9__1 : rule__MatrixQuestion__Group_9__1__Impl rule__MatrixQuestion__Group_9__2 ;
    public final void rule__MatrixQuestion__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3667:1: ( rule__MatrixQuestion__Group_9__1__Impl rule__MatrixQuestion__Group_9__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3668:2: rule__MatrixQuestion__Group_9__1__Impl rule__MatrixQuestion__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__1__Impl_in_rule__MatrixQuestion__Group_9__17238);
            rule__MatrixQuestion__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__2_in_rule__MatrixQuestion__Group_9__17241);
            rule__MatrixQuestion__Group_9__2();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__1"


    // $ANTLR start "rule__MatrixQuestion__Group_9__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3675:1: rule__MatrixQuestion__Group_9__1__Impl : ( '{' ) ;
    public final void rule__MatrixQuestion__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3679:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3680:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3680:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3681:1: '{'
            {
             before(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MatrixQuestion__Group_9__1__Impl7269); 
             after(grammarAccess.getMatrixQuestionAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3694:1: rule__MatrixQuestion__Group_9__2 : rule__MatrixQuestion__Group_9__2__Impl rule__MatrixQuestion__Group_9__3 ;
    public final void rule__MatrixQuestion__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3698:1: ( rule__MatrixQuestion__Group_9__2__Impl rule__MatrixQuestion__Group_9__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3699:2: rule__MatrixQuestion__Group_9__2__Impl rule__MatrixQuestion__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__2__Impl_in_rule__MatrixQuestion__Group_9__27300);
            rule__MatrixQuestion__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__3_in_rule__MatrixQuestion__Group_9__27303);
            rule__MatrixQuestion__Group_9__3();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__2"


    // $ANTLR start "rule__MatrixQuestion__Group_9__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3706:1: rule__MatrixQuestion__Group_9__2__Impl : ( ( rule__MatrixQuestion__RowNamesAssignment_9_2 ) ) ;
    public final void rule__MatrixQuestion__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3710:1: ( ( ( rule__MatrixQuestion__RowNamesAssignment_9_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3711:1: ( ( rule__MatrixQuestion__RowNamesAssignment_9_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3711:1: ( ( rule__MatrixQuestion__RowNamesAssignment_9_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3712:1: ( rule__MatrixQuestion__RowNamesAssignment_9_2 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3713:1: ( rule__MatrixQuestion__RowNamesAssignment_9_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3713:2: rule__MatrixQuestion__RowNamesAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__RowNamesAssignment_9_2_in_rule__MatrixQuestion__Group_9__2__Impl7330);
            rule__MatrixQuestion__RowNamesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_2()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3723:1: rule__MatrixQuestion__Group_9__3 : rule__MatrixQuestion__Group_9__3__Impl rule__MatrixQuestion__Group_9__4 ;
    public final void rule__MatrixQuestion__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3727:1: ( rule__MatrixQuestion__Group_9__3__Impl rule__MatrixQuestion__Group_9__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3728:2: rule__MatrixQuestion__Group_9__3__Impl rule__MatrixQuestion__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__3__Impl_in_rule__MatrixQuestion__Group_9__37360);
            rule__MatrixQuestion__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__4_in_rule__MatrixQuestion__Group_9__37363);
            rule__MatrixQuestion__Group_9__4();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__3"


    // $ANTLR start "rule__MatrixQuestion__Group_9__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3735:1: rule__MatrixQuestion__Group_9__3__Impl : ( ( rule__MatrixQuestion__Group_9_3__0 )* ) ;
    public final void rule__MatrixQuestion__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3739:1: ( ( ( rule__MatrixQuestion__Group_9_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3740:1: ( ( rule__MatrixQuestion__Group_9_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3740:1: ( ( rule__MatrixQuestion__Group_9_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3741:1: ( rule__MatrixQuestion__Group_9_3__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_9_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3742:1: ( rule__MatrixQuestion__Group_9_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3742:2: rule__MatrixQuestion__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9_3__0_in_rule__MatrixQuestion__Group_9__3__Impl7390);
            	    rule__MatrixQuestion__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMatrixQuestionAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__3__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3752:1: rule__MatrixQuestion__Group_9__4 : rule__MatrixQuestion__Group_9__4__Impl ;
    public final void rule__MatrixQuestion__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3756:1: ( rule__MatrixQuestion__Group_9__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3757:2: rule__MatrixQuestion__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9__4__Impl_in_rule__MatrixQuestion__Group_9__47421);
            rule__MatrixQuestion__Group_9__4__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__4"


    // $ANTLR start "rule__MatrixQuestion__Group_9__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3763:1: rule__MatrixQuestion__Group_9__4__Impl : ( '}' ) ;
    public final void rule__MatrixQuestion__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3767:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3768:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3768:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3769:1: '}'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MatrixQuestion__Group_9__4__Impl7449); 
             after(grammarAccess.getMatrixQuestionAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9__4__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3792:1: rule__MatrixQuestion__Group_9_3__0 : rule__MatrixQuestion__Group_9_3__0__Impl rule__MatrixQuestion__Group_9_3__1 ;
    public final void rule__MatrixQuestion__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3796:1: ( rule__MatrixQuestion__Group_9_3__0__Impl rule__MatrixQuestion__Group_9_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3797:2: rule__MatrixQuestion__Group_9_3__0__Impl rule__MatrixQuestion__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9_3__0__Impl_in_rule__MatrixQuestion__Group_9_3__07490);
            rule__MatrixQuestion__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9_3__1_in_rule__MatrixQuestion__Group_9_3__07493);
            rule__MatrixQuestion__Group_9_3__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9_3__0"


    // $ANTLR start "rule__MatrixQuestion__Group_9_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3804:1: rule__MatrixQuestion__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__MatrixQuestion__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3808:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3809:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3809:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3810:1: ','
            {
             before(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MatrixQuestion__Group_9_3__0__Impl7521); 
             after(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9_3__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_9_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3823:1: rule__MatrixQuestion__Group_9_3__1 : rule__MatrixQuestion__Group_9_3__1__Impl ;
    public final void rule__MatrixQuestion__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3827:1: ( rule__MatrixQuestion__Group_9_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3828:2: rule__MatrixQuestion__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_9_3__1__Impl_in_rule__MatrixQuestion__Group_9_3__17552);
            rule__MatrixQuestion__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_9_3__1"


    // $ANTLR start "rule__MatrixQuestion__Group_9_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3834:1: rule__MatrixQuestion__Group_9_3__1__Impl : ( ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 ) ) ;
    public final void rule__MatrixQuestion__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3838:1: ( ( ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3839:1: ( ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3839:1: ( ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3840:1: ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3841:1: ( rule__MatrixQuestion__RowNamesAssignment_9_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3841:2: rule__MatrixQuestion__RowNamesAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__RowNamesAssignment_9_3_1_in_rule__MatrixQuestion__Group_9_3__1__Impl7579);
            rule__MatrixQuestion__RowNamesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesAssignment_9_3_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_9_3__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3855:1: rule__MatrixQuestion__Group_12__0 : rule__MatrixQuestion__Group_12__0__Impl rule__MatrixQuestion__Group_12__1 ;
    public final void rule__MatrixQuestion__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3859:1: ( rule__MatrixQuestion__Group_12__0__Impl rule__MatrixQuestion__Group_12__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3860:2: rule__MatrixQuestion__Group_12__0__Impl rule__MatrixQuestion__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__0__Impl_in_rule__MatrixQuestion__Group_12__07613);
            rule__MatrixQuestion__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__1_in_rule__MatrixQuestion__Group_12__07616);
            rule__MatrixQuestion__Group_12__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__0"


    // $ANTLR start "rule__MatrixQuestion__Group_12__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3867:1: rule__MatrixQuestion__Group_12__0__Impl : ( 'conditions' ) ;
    public final void rule__MatrixQuestion__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3871:1: ( ( 'conditions' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3872:1: ( 'conditions' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3872:1: ( 'conditions' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3873:1: 'conditions'
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsKeyword_12_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MatrixQuestion__Group_12__0__Impl7644); 
             after(grammarAccess.getMatrixQuestionAccess().getConditionsKeyword_12_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3886:1: rule__MatrixQuestion__Group_12__1 : rule__MatrixQuestion__Group_12__1__Impl rule__MatrixQuestion__Group_12__2 ;
    public final void rule__MatrixQuestion__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3890:1: ( rule__MatrixQuestion__Group_12__1__Impl rule__MatrixQuestion__Group_12__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3891:2: rule__MatrixQuestion__Group_12__1__Impl rule__MatrixQuestion__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__1__Impl_in_rule__MatrixQuestion__Group_12__17675);
            rule__MatrixQuestion__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__2_in_rule__MatrixQuestion__Group_12__17678);
            rule__MatrixQuestion__Group_12__2();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__1"


    // $ANTLR start "rule__MatrixQuestion__Group_12__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3898:1: rule__MatrixQuestion__Group_12__1__Impl : ( '(' ) ;
    public final void rule__MatrixQuestion__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3902:1: ( ( '(' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3903:1: ( '(' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3903:1: ( '(' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3904:1: '('
            {
             before(grammarAccess.getMatrixQuestionAccess().getLeftParenthesisKeyword_12_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MatrixQuestion__Group_12__1__Impl7706); 
             after(grammarAccess.getMatrixQuestionAccess().getLeftParenthesisKeyword_12_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__1__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3917:1: rule__MatrixQuestion__Group_12__2 : rule__MatrixQuestion__Group_12__2__Impl rule__MatrixQuestion__Group_12__3 ;
    public final void rule__MatrixQuestion__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3921:1: ( rule__MatrixQuestion__Group_12__2__Impl rule__MatrixQuestion__Group_12__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3922:2: rule__MatrixQuestion__Group_12__2__Impl rule__MatrixQuestion__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__2__Impl_in_rule__MatrixQuestion__Group_12__27737);
            rule__MatrixQuestion__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__3_in_rule__MatrixQuestion__Group_12__27740);
            rule__MatrixQuestion__Group_12__3();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__2"


    // $ANTLR start "rule__MatrixQuestion__Group_12__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3929:1: rule__MatrixQuestion__Group_12__2__Impl : ( ( rule__MatrixQuestion__ConditionsAssignment_12_2 ) ) ;
    public final void rule__MatrixQuestion__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3933:1: ( ( ( rule__MatrixQuestion__ConditionsAssignment_12_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3934:1: ( ( rule__MatrixQuestion__ConditionsAssignment_12_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3934:1: ( ( rule__MatrixQuestion__ConditionsAssignment_12_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3935:1: ( rule__MatrixQuestion__ConditionsAssignment_12_2 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3936:1: ( rule__MatrixQuestion__ConditionsAssignment_12_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3936:2: rule__MatrixQuestion__ConditionsAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ConditionsAssignment_12_2_in_rule__MatrixQuestion__Group_12__2__Impl7767);
            rule__MatrixQuestion__ConditionsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_2()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__2__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3946:1: rule__MatrixQuestion__Group_12__3 : rule__MatrixQuestion__Group_12__3__Impl rule__MatrixQuestion__Group_12__4 ;
    public final void rule__MatrixQuestion__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3950:1: ( rule__MatrixQuestion__Group_12__3__Impl rule__MatrixQuestion__Group_12__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3951:2: rule__MatrixQuestion__Group_12__3__Impl rule__MatrixQuestion__Group_12__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__3__Impl_in_rule__MatrixQuestion__Group_12__37797);
            rule__MatrixQuestion__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__4_in_rule__MatrixQuestion__Group_12__37800);
            rule__MatrixQuestion__Group_12__4();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__3"


    // $ANTLR start "rule__MatrixQuestion__Group_12__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3958:1: rule__MatrixQuestion__Group_12__3__Impl : ( ( rule__MatrixQuestion__Group_12_3__0 )* ) ;
    public final void rule__MatrixQuestion__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3962:1: ( ( ( rule__MatrixQuestion__Group_12_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3963:1: ( ( rule__MatrixQuestion__Group_12_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3963:1: ( ( rule__MatrixQuestion__Group_12_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3964:1: ( rule__MatrixQuestion__Group_12_3__0 )*
            {
             before(grammarAccess.getMatrixQuestionAccess().getGroup_12_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3965:1: ( rule__MatrixQuestion__Group_12_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3965:2: rule__MatrixQuestion__Group_12_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12_3__0_in_rule__MatrixQuestion__Group_12__3__Impl7827);
            	    rule__MatrixQuestion__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMatrixQuestionAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__3__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3975:1: rule__MatrixQuestion__Group_12__4 : rule__MatrixQuestion__Group_12__4__Impl ;
    public final void rule__MatrixQuestion__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3979:1: ( rule__MatrixQuestion__Group_12__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3980:2: rule__MatrixQuestion__Group_12__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12__4__Impl_in_rule__MatrixQuestion__Group_12__47858);
            rule__MatrixQuestion__Group_12__4__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__4"


    // $ANTLR start "rule__MatrixQuestion__Group_12__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3986:1: rule__MatrixQuestion__Group_12__4__Impl : ( ')' ) ;
    public final void rule__MatrixQuestion__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3990:1: ( ( ')' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3991:1: ( ')' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3991:1: ( ')' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:3992:1: ')'
            {
             before(grammarAccess.getMatrixQuestionAccess().getRightParenthesisKeyword_12_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MatrixQuestion__Group_12__4__Impl7886); 
             after(grammarAccess.getMatrixQuestionAccess().getRightParenthesisKeyword_12_4()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12__4__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4015:1: rule__MatrixQuestion__Group_12_3__0 : rule__MatrixQuestion__Group_12_3__0__Impl rule__MatrixQuestion__Group_12_3__1 ;
    public final void rule__MatrixQuestion__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4019:1: ( rule__MatrixQuestion__Group_12_3__0__Impl rule__MatrixQuestion__Group_12_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4020:2: rule__MatrixQuestion__Group_12_3__0__Impl rule__MatrixQuestion__Group_12_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12_3__0__Impl_in_rule__MatrixQuestion__Group_12_3__07927);
            rule__MatrixQuestion__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12_3__1_in_rule__MatrixQuestion__Group_12_3__07930);
            rule__MatrixQuestion__Group_12_3__1();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12_3__0"


    // $ANTLR start "rule__MatrixQuestion__Group_12_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4027:1: rule__MatrixQuestion__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__MatrixQuestion__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4031:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4032:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4032:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4033:1: ','
            {
             before(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_12_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MatrixQuestion__Group_12_3__0__Impl7958); 
             after(grammarAccess.getMatrixQuestionAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12_3__0__Impl"


    // $ANTLR start "rule__MatrixQuestion__Group_12_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4046:1: rule__MatrixQuestion__Group_12_3__1 : rule__MatrixQuestion__Group_12_3__1__Impl ;
    public final void rule__MatrixQuestion__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4050:1: ( rule__MatrixQuestion__Group_12_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4051:2: rule__MatrixQuestion__Group_12_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__Group_12_3__1__Impl_in_rule__MatrixQuestion__Group_12_3__17989);
            rule__MatrixQuestion__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__MatrixQuestion__Group_12_3__1"


    // $ANTLR start "rule__MatrixQuestion__Group_12_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4057:1: rule__MatrixQuestion__Group_12_3__1__Impl : ( ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 ) ) ;
    public final void rule__MatrixQuestion__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4061:1: ( ( ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4062:1: ( ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4062:1: ( ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4063:1: ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 )
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4064:1: ( rule__MatrixQuestion__ConditionsAssignment_12_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4064:2: rule__MatrixQuestion__ConditionsAssignment_12_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MatrixQuestion__ConditionsAssignment_12_3_1_in_rule__MatrixQuestion__Group_12_3__1__Impl8016);
            rule__MatrixQuestion__ConditionsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixQuestionAccess().getConditionsAssignment_12_3_1()); 

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
    // $ANTLR end "rule__MatrixQuestion__Group_12_3__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4078:1: rule__CalendarQuestion__Group__0 : rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 ;
    public final void rule__CalendarQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4082:1: ( rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4083:2: rule__CalendarQuestion__Group__0__Impl rule__CalendarQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__08050);
            rule__CalendarQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__08053);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4090:1: rule__CalendarQuestion__Group__0__Impl : ( ( rule__CalendarQuestion__MandatoryAssignment_0 ) ) ;
    public final void rule__CalendarQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4094:1: ( ( ( rule__CalendarQuestion__MandatoryAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4095:1: ( ( rule__CalendarQuestion__MandatoryAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4095:1: ( ( rule__CalendarQuestion__MandatoryAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4096:1: ( rule__CalendarQuestion__MandatoryAssignment_0 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMandatoryAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4097:1: ( rule__CalendarQuestion__MandatoryAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4097:2: rule__CalendarQuestion__MandatoryAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MandatoryAssignment_0_in_rule__CalendarQuestion__Group__0__Impl8080);
            rule__CalendarQuestion__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getMandatoryAssignment_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4107:1: rule__CalendarQuestion__Group__1 : rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 ;
    public final void rule__CalendarQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4111:1: ( rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4112:2: rule__CalendarQuestion__Group__1__Impl rule__CalendarQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__18110);
            rule__CalendarQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__18113);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4119:1: rule__CalendarQuestion__Group__1__Impl : ( ( rule__CalendarQuestion__YearAssignment_1 ) ) ;
    public final void rule__CalendarQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4123:1: ( ( ( rule__CalendarQuestion__YearAssignment_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4124:1: ( ( rule__CalendarQuestion__YearAssignment_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4124:1: ( ( rule__CalendarQuestion__YearAssignment_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4125:1: ( rule__CalendarQuestion__YearAssignment_1 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearAssignment_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4126:1: ( rule__CalendarQuestion__YearAssignment_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4126:2: rule__CalendarQuestion__YearAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__YearAssignment_1_in_rule__CalendarQuestion__Group__1__Impl8140);
            rule__CalendarQuestion__YearAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getYearAssignment_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4136:1: rule__CalendarQuestion__Group__2 : rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 ;
    public final void rule__CalendarQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4140:1: ( rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4141:2: rule__CalendarQuestion__Group__2__Impl rule__CalendarQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__28170);
            rule__CalendarQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__28173);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4148:1: rule__CalendarQuestion__Group__2__Impl : ( ( rule__CalendarQuestion__MonthAssignment_2 ) ) ;
    public final void rule__CalendarQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4152:1: ( ( ( rule__CalendarQuestion__MonthAssignment_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4153:1: ( ( rule__CalendarQuestion__MonthAssignment_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4153:1: ( ( rule__CalendarQuestion__MonthAssignment_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4154:1: ( rule__CalendarQuestion__MonthAssignment_2 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4155:1: ( rule__CalendarQuestion__MonthAssignment_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4155:2: rule__CalendarQuestion__MonthAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MonthAssignment_2_in_rule__CalendarQuestion__Group__2__Impl8200);
            rule__CalendarQuestion__MonthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getMonthAssignment_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4165:1: rule__CalendarQuestion__Group__3 : rule__CalendarQuestion__Group__3__Impl rule__CalendarQuestion__Group__4 ;
    public final void rule__CalendarQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4169:1: ( rule__CalendarQuestion__Group__3__Impl rule__CalendarQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4170:2: rule__CalendarQuestion__Group__3__Impl rule__CalendarQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__38230);
            rule__CalendarQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__4_in_rule__CalendarQuestion__Group__38233);
            rule__CalendarQuestion__Group__4();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4177:1: rule__CalendarQuestion__Group__3__Impl : ( ( rule__CalendarQuestion__DayAssignment_3 ) ) ;
    public final void rule__CalendarQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4181:1: ( ( ( rule__CalendarQuestion__DayAssignment_3 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4182:1: ( ( rule__CalendarQuestion__DayAssignment_3 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4182:1: ( ( rule__CalendarQuestion__DayAssignment_3 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4183:1: ( rule__CalendarQuestion__DayAssignment_3 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayAssignment_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4184:1: ( rule__CalendarQuestion__DayAssignment_3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4184:2: rule__CalendarQuestion__DayAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__DayAssignment_3_in_rule__CalendarQuestion__Group__3__Impl8260);
            rule__CalendarQuestion__DayAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getDayAssignment_3()); 

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


    // $ANTLR start "rule__CalendarQuestion__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4194:1: rule__CalendarQuestion__Group__4 : rule__CalendarQuestion__Group__4__Impl rule__CalendarQuestion__Group__5 ;
    public final void rule__CalendarQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4198:1: ( rule__CalendarQuestion__Group__4__Impl rule__CalendarQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4199:2: rule__CalendarQuestion__Group__4__Impl rule__CalendarQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__4__Impl_in_rule__CalendarQuestion__Group__48290);
            rule__CalendarQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__5_in_rule__CalendarQuestion__Group__48293);
            rule__CalendarQuestion__Group__5();

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
    // $ANTLR end "rule__CalendarQuestion__Group__4"


    // $ANTLR start "rule__CalendarQuestion__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4206:1: rule__CalendarQuestion__Group__4__Impl : ( ( rule__CalendarQuestion__HourAssignment_4 ) ) ;
    public final void rule__CalendarQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4210:1: ( ( ( rule__CalendarQuestion__HourAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4211:1: ( ( rule__CalendarQuestion__HourAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4211:1: ( ( rule__CalendarQuestion__HourAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4212:1: ( rule__CalendarQuestion__HourAssignment_4 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4213:1: ( rule__CalendarQuestion__HourAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4213:2: rule__CalendarQuestion__HourAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__HourAssignment_4_in_rule__CalendarQuestion__Group__4__Impl8320);
            rule__CalendarQuestion__HourAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getHourAssignment_4()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__4__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4223:1: rule__CalendarQuestion__Group__5 : rule__CalendarQuestion__Group__5__Impl rule__CalendarQuestion__Group__6 ;
    public final void rule__CalendarQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4227:1: ( rule__CalendarQuestion__Group__5__Impl rule__CalendarQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4228:2: rule__CalendarQuestion__Group__5__Impl rule__CalendarQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__5__Impl_in_rule__CalendarQuestion__Group__58350);
            rule__CalendarQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__6_in_rule__CalendarQuestion__Group__58353);
            rule__CalendarQuestion__Group__6();

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
    // $ANTLR end "rule__CalendarQuestion__Group__5"


    // $ANTLR start "rule__CalendarQuestion__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4235:1: rule__CalendarQuestion__Group__5__Impl : ( ( rule__CalendarQuestion__MinuteAssignment_5 ) ) ;
    public final void rule__CalendarQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4239:1: ( ( ( rule__CalendarQuestion__MinuteAssignment_5 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4240:1: ( ( rule__CalendarQuestion__MinuteAssignment_5 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4240:1: ( ( rule__CalendarQuestion__MinuteAssignment_5 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4241:1: ( rule__CalendarQuestion__MinuteAssignment_5 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4242:1: ( rule__CalendarQuestion__MinuteAssignment_5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4242:2: rule__CalendarQuestion__MinuteAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__MinuteAssignment_5_in_rule__CalendarQuestion__Group__5__Impl8380);
            rule__CalendarQuestion__MinuteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getMinuteAssignment_5()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__5__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4252:1: rule__CalendarQuestion__Group__6 : rule__CalendarQuestion__Group__6__Impl rule__CalendarQuestion__Group__7 ;
    public final void rule__CalendarQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4256:1: ( rule__CalendarQuestion__Group__6__Impl rule__CalendarQuestion__Group__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4257:2: rule__CalendarQuestion__Group__6__Impl rule__CalendarQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__6__Impl_in_rule__CalendarQuestion__Group__68410);
            rule__CalendarQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__7_in_rule__CalendarQuestion__Group__68413);
            rule__CalendarQuestion__Group__7();

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
    // $ANTLR end "rule__CalendarQuestion__Group__6"


    // $ANTLR start "rule__CalendarQuestion__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4264:1: rule__CalendarQuestion__Group__6__Impl : ( 'CalendarQuestion' ) ;
    public final void rule__CalendarQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4268:1: ( ( 'CalendarQuestion' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4269:1: ( 'CalendarQuestion' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4269:1: ( 'CalendarQuestion' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4270:1: 'CalendarQuestion'
            {
             before(grammarAccess.getCalendarQuestionAccess().getCalendarQuestionKeyword_6()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__CalendarQuestion__Group__6__Impl8441); 
             after(grammarAccess.getCalendarQuestionAccess().getCalendarQuestionKeyword_6()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__6__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4283:1: rule__CalendarQuestion__Group__7 : rule__CalendarQuestion__Group__7__Impl rule__CalendarQuestion__Group__8 ;
    public final void rule__CalendarQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4287:1: ( rule__CalendarQuestion__Group__7__Impl rule__CalendarQuestion__Group__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4288:2: rule__CalendarQuestion__Group__7__Impl rule__CalendarQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__7__Impl_in_rule__CalendarQuestion__Group__78472);
            rule__CalendarQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__8_in_rule__CalendarQuestion__Group__78475);
            rule__CalendarQuestion__Group__8();

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
    // $ANTLR end "rule__CalendarQuestion__Group__7"


    // $ANTLR start "rule__CalendarQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4295:1: rule__CalendarQuestion__Group__7__Impl : ( '{' ) ;
    public final void rule__CalendarQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4299:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4300:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4300:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4301:1: '{'
            {
             before(grammarAccess.getCalendarQuestionAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__CalendarQuestion__Group__7__Impl8503); 
             after(grammarAccess.getCalendarQuestionAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__7__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4314:1: rule__CalendarQuestion__Group__8 : rule__CalendarQuestion__Group__8__Impl rule__CalendarQuestion__Group__9 ;
    public final void rule__CalendarQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4318:1: ( rule__CalendarQuestion__Group__8__Impl rule__CalendarQuestion__Group__9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4319:2: rule__CalendarQuestion__Group__8__Impl rule__CalendarQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__8__Impl_in_rule__CalendarQuestion__Group__88534);
            rule__CalendarQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__9_in_rule__CalendarQuestion__Group__88537);
            rule__CalendarQuestion__Group__9();

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
    // $ANTLR end "rule__CalendarQuestion__Group__8"


    // $ANTLR start "rule__CalendarQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4326:1: rule__CalendarQuestion__Group__8__Impl : ( 'id' ) ;
    public final void rule__CalendarQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4330:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4331:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4331:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4332:1: 'id'
            {
             before(grammarAccess.getCalendarQuestionAccess().getIdKeyword_8()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__CalendarQuestion__Group__8__Impl8565); 
             after(grammarAccess.getCalendarQuestionAccess().getIdKeyword_8()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__8__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4345:1: rule__CalendarQuestion__Group__9 : rule__CalendarQuestion__Group__9__Impl rule__CalendarQuestion__Group__10 ;
    public final void rule__CalendarQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4349:1: ( rule__CalendarQuestion__Group__9__Impl rule__CalendarQuestion__Group__10 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4350:2: rule__CalendarQuestion__Group__9__Impl rule__CalendarQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__9__Impl_in_rule__CalendarQuestion__Group__98596);
            rule__CalendarQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__10_in_rule__CalendarQuestion__Group__98599);
            rule__CalendarQuestion__Group__10();

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
    // $ANTLR end "rule__CalendarQuestion__Group__9"


    // $ANTLR start "rule__CalendarQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4357:1: rule__CalendarQuestion__Group__9__Impl : ( ( rule__CalendarQuestion__IdAssignment_9 ) ) ;
    public final void rule__CalendarQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4361:1: ( ( ( rule__CalendarQuestion__IdAssignment_9 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4362:1: ( ( rule__CalendarQuestion__IdAssignment_9 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4362:1: ( ( rule__CalendarQuestion__IdAssignment_9 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4363:1: ( rule__CalendarQuestion__IdAssignment_9 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getIdAssignment_9()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4364:1: ( rule__CalendarQuestion__IdAssignment_9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4364:2: rule__CalendarQuestion__IdAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__IdAssignment_9_in_rule__CalendarQuestion__Group__9__Impl8626);
            rule__CalendarQuestion__IdAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getIdAssignment_9()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__9__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__10"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4374:1: rule__CalendarQuestion__Group__10 : rule__CalendarQuestion__Group__10__Impl rule__CalendarQuestion__Group__11 ;
    public final void rule__CalendarQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4378:1: ( rule__CalendarQuestion__Group__10__Impl rule__CalendarQuestion__Group__11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4379:2: rule__CalendarQuestion__Group__10__Impl rule__CalendarQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__10__Impl_in_rule__CalendarQuestion__Group__108656);
            rule__CalendarQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__11_in_rule__CalendarQuestion__Group__108659);
            rule__CalendarQuestion__Group__11();

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
    // $ANTLR end "rule__CalendarQuestion__Group__10"


    // $ANTLR start "rule__CalendarQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4386:1: rule__CalendarQuestion__Group__10__Impl : ( 'title' ) ;
    public final void rule__CalendarQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4390:1: ( ( 'title' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4391:1: ( 'title' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4391:1: ( 'title' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4392:1: 'title'
            {
             before(grammarAccess.getCalendarQuestionAccess().getTitleKeyword_10()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CalendarQuestion__Group__10__Impl8687); 
             after(grammarAccess.getCalendarQuestionAccess().getTitleKeyword_10()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__10__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4405:1: rule__CalendarQuestion__Group__11 : rule__CalendarQuestion__Group__11__Impl rule__CalendarQuestion__Group__12 ;
    public final void rule__CalendarQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4409:1: ( rule__CalendarQuestion__Group__11__Impl rule__CalendarQuestion__Group__12 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4410:2: rule__CalendarQuestion__Group__11__Impl rule__CalendarQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__11__Impl_in_rule__CalendarQuestion__Group__118718);
            rule__CalendarQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__12_in_rule__CalendarQuestion__Group__118721);
            rule__CalendarQuestion__Group__12();

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
    // $ANTLR end "rule__CalendarQuestion__Group__11"


    // $ANTLR start "rule__CalendarQuestion__Group__11__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4417:1: rule__CalendarQuestion__Group__11__Impl : ( ( rule__CalendarQuestion__TitleAssignment_11 ) ) ;
    public final void rule__CalendarQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4421:1: ( ( ( rule__CalendarQuestion__TitleAssignment_11 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4422:1: ( ( rule__CalendarQuestion__TitleAssignment_11 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4422:1: ( ( rule__CalendarQuestion__TitleAssignment_11 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4423:1: ( rule__CalendarQuestion__TitleAssignment_11 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getTitleAssignment_11()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4424:1: ( rule__CalendarQuestion__TitleAssignment_11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4424:2: rule__CalendarQuestion__TitleAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__TitleAssignment_11_in_rule__CalendarQuestion__Group__11__Impl8748);
            rule__CalendarQuestion__TitleAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getTitleAssignment_11()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__11__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__12"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4434:1: rule__CalendarQuestion__Group__12 : rule__CalendarQuestion__Group__12__Impl rule__CalendarQuestion__Group__13 ;
    public final void rule__CalendarQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4438:1: ( rule__CalendarQuestion__Group__12__Impl rule__CalendarQuestion__Group__13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4439:2: rule__CalendarQuestion__Group__12__Impl rule__CalendarQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__12__Impl_in_rule__CalendarQuestion__Group__128778);
            rule__CalendarQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__13_in_rule__CalendarQuestion__Group__128781);
            rule__CalendarQuestion__Group__13();

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
    // $ANTLR end "rule__CalendarQuestion__Group__12"


    // $ANTLR start "rule__CalendarQuestion__Group__12__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4446:1: rule__CalendarQuestion__Group__12__Impl : ( ( rule__CalendarQuestion__Group_12__0 )? ) ;
    public final void rule__CalendarQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4450:1: ( ( ( rule__CalendarQuestion__Group_12__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4451:1: ( ( rule__CalendarQuestion__Group_12__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4451:1: ( ( rule__CalendarQuestion__Group_12__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4452:1: ( rule__CalendarQuestion__Group_12__0 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup_12()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4453:1: ( rule__CalendarQuestion__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4453:2: rule__CalendarQuestion__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_12__0_in_rule__CalendarQuestion__Group__12__Impl8808);
                    rule__CalendarQuestion__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getGroup_12()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__12__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4463:1: rule__CalendarQuestion__Group__13 : rule__CalendarQuestion__Group__13__Impl rule__CalendarQuestion__Group__14 ;
    public final void rule__CalendarQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4467:1: ( rule__CalendarQuestion__Group__13__Impl rule__CalendarQuestion__Group__14 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4468:2: rule__CalendarQuestion__Group__13__Impl rule__CalendarQuestion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__13__Impl_in_rule__CalendarQuestion__Group__138839);
            rule__CalendarQuestion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__14_in_rule__CalendarQuestion__Group__138842);
            rule__CalendarQuestion__Group__14();

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
    // $ANTLR end "rule__CalendarQuestion__Group__13"


    // $ANTLR start "rule__CalendarQuestion__Group__13__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4475:1: rule__CalendarQuestion__Group__13__Impl : ( ( rule__CalendarQuestion__Group_13__0 )? ) ;
    public final void rule__CalendarQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4479:1: ( ( ( rule__CalendarQuestion__Group_13__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4480:1: ( ( rule__CalendarQuestion__Group_13__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4480:1: ( ( rule__CalendarQuestion__Group_13__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4481:1: ( rule__CalendarQuestion__Group_13__0 )?
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup_13()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4482:1: ( rule__CalendarQuestion__Group_13__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4482:2: rule__CalendarQuestion__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__0_in_rule__CalendarQuestion__Group__13__Impl8869);
                    rule__CalendarQuestion__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalendarQuestionAccess().getGroup_13()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__13__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group__14"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4492:1: rule__CalendarQuestion__Group__14 : rule__CalendarQuestion__Group__14__Impl ;
    public final void rule__CalendarQuestion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4496:1: ( rule__CalendarQuestion__Group__14__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4497:2: rule__CalendarQuestion__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group__14__Impl_in_rule__CalendarQuestion__Group__148900);
            rule__CalendarQuestion__Group__14__Impl();

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
    // $ANTLR end "rule__CalendarQuestion__Group__14"


    // $ANTLR start "rule__CalendarQuestion__Group__14__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4503:1: rule__CalendarQuestion__Group__14__Impl : ( '}' ) ;
    public final void rule__CalendarQuestion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4507:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4508:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4508:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4509:1: '}'
            {
             before(grammarAccess.getCalendarQuestionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__CalendarQuestion__Group__14__Impl8928); 
             after(grammarAccess.getCalendarQuestionAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group__14__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_12__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4552:1: rule__CalendarQuestion__Group_12__0 : rule__CalendarQuestion__Group_12__0__Impl rule__CalendarQuestion__Group_12__1 ;
    public final void rule__CalendarQuestion__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4556:1: ( rule__CalendarQuestion__Group_12__0__Impl rule__CalendarQuestion__Group_12__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4557:2: rule__CalendarQuestion__Group_12__0__Impl rule__CalendarQuestion__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_12__0__Impl_in_rule__CalendarQuestion__Group_12__08989);
            rule__CalendarQuestion__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_12__1_in_rule__CalendarQuestion__Group_12__08992);
            rule__CalendarQuestion__Group_12__1();

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
    // $ANTLR end "rule__CalendarQuestion__Group_12__0"


    // $ANTLR start "rule__CalendarQuestion__Group_12__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4564:1: rule__CalendarQuestion__Group_12__0__Impl : ( 'description' ) ;
    public final void rule__CalendarQuestion__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4568:1: ( ( 'description' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4569:1: ( 'description' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4569:1: ( 'description' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4570:1: 'description'
            {
             before(grammarAccess.getCalendarQuestionAccess().getDescriptionKeyword_12_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__CalendarQuestion__Group_12__0__Impl9020); 
             after(grammarAccess.getCalendarQuestionAccess().getDescriptionKeyword_12_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_12__0__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_12__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4583:1: rule__CalendarQuestion__Group_12__1 : rule__CalendarQuestion__Group_12__1__Impl ;
    public final void rule__CalendarQuestion__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4587:1: ( rule__CalendarQuestion__Group_12__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4588:2: rule__CalendarQuestion__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_12__1__Impl_in_rule__CalendarQuestion__Group_12__19051);
            rule__CalendarQuestion__Group_12__1__Impl();

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
    // $ANTLR end "rule__CalendarQuestion__Group_12__1"


    // $ANTLR start "rule__CalendarQuestion__Group_12__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4594:1: rule__CalendarQuestion__Group_12__1__Impl : ( ( rule__CalendarQuestion__DescriptionAssignment_12_1 ) ) ;
    public final void rule__CalendarQuestion__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4598:1: ( ( ( rule__CalendarQuestion__DescriptionAssignment_12_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4599:1: ( ( rule__CalendarQuestion__DescriptionAssignment_12_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4599:1: ( ( rule__CalendarQuestion__DescriptionAssignment_12_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4600:1: ( rule__CalendarQuestion__DescriptionAssignment_12_1 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getDescriptionAssignment_12_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4601:1: ( rule__CalendarQuestion__DescriptionAssignment_12_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4601:2: rule__CalendarQuestion__DescriptionAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__DescriptionAssignment_12_1_in_rule__CalendarQuestion__Group_12__1__Impl9078);
            rule__CalendarQuestion__DescriptionAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getDescriptionAssignment_12_1()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_12__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4615:1: rule__CalendarQuestion__Group_13__0 : rule__CalendarQuestion__Group_13__0__Impl rule__CalendarQuestion__Group_13__1 ;
    public final void rule__CalendarQuestion__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4619:1: ( rule__CalendarQuestion__Group_13__0__Impl rule__CalendarQuestion__Group_13__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4620:2: rule__CalendarQuestion__Group_13__0__Impl rule__CalendarQuestion__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__0__Impl_in_rule__CalendarQuestion__Group_13__09112);
            rule__CalendarQuestion__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__1_in_rule__CalendarQuestion__Group_13__09115);
            rule__CalendarQuestion__Group_13__1();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__0"


    // $ANTLR start "rule__CalendarQuestion__Group_13__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4627:1: rule__CalendarQuestion__Group_13__0__Impl : ( 'conditions' ) ;
    public final void rule__CalendarQuestion__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4631:1: ( ( 'conditions' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4632:1: ( 'conditions' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4632:1: ( 'conditions' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4633:1: 'conditions'
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsKeyword_13_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__CalendarQuestion__Group_13__0__Impl9143); 
             after(grammarAccess.getCalendarQuestionAccess().getConditionsKeyword_13_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__0__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4646:1: rule__CalendarQuestion__Group_13__1 : rule__CalendarQuestion__Group_13__1__Impl rule__CalendarQuestion__Group_13__2 ;
    public final void rule__CalendarQuestion__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4650:1: ( rule__CalendarQuestion__Group_13__1__Impl rule__CalendarQuestion__Group_13__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4651:2: rule__CalendarQuestion__Group_13__1__Impl rule__CalendarQuestion__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__1__Impl_in_rule__CalendarQuestion__Group_13__19174);
            rule__CalendarQuestion__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__2_in_rule__CalendarQuestion__Group_13__19177);
            rule__CalendarQuestion__Group_13__2();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__1"


    // $ANTLR start "rule__CalendarQuestion__Group_13__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4658:1: rule__CalendarQuestion__Group_13__1__Impl : ( '(' ) ;
    public final void rule__CalendarQuestion__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4662:1: ( ( '(' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4663:1: ( '(' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4663:1: ( '(' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4664:1: '('
            {
             before(grammarAccess.getCalendarQuestionAccess().getLeftParenthesisKeyword_13_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__CalendarQuestion__Group_13__1__Impl9205); 
             after(grammarAccess.getCalendarQuestionAccess().getLeftParenthesisKeyword_13_1()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__1__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4677:1: rule__CalendarQuestion__Group_13__2 : rule__CalendarQuestion__Group_13__2__Impl rule__CalendarQuestion__Group_13__3 ;
    public final void rule__CalendarQuestion__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4681:1: ( rule__CalendarQuestion__Group_13__2__Impl rule__CalendarQuestion__Group_13__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4682:2: rule__CalendarQuestion__Group_13__2__Impl rule__CalendarQuestion__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__2__Impl_in_rule__CalendarQuestion__Group_13__29236);
            rule__CalendarQuestion__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__3_in_rule__CalendarQuestion__Group_13__29239);
            rule__CalendarQuestion__Group_13__3();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__2"


    // $ANTLR start "rule__CalendarQuestion__Group_13__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4689:1: rule__CalendarQuestion__Group_13__2__Impl : ( ( rule__CalendarQuestion__ConditionsAssignment_13_2 ) ) ;
    public final void rule__CalendarQuestion__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4693:1: ( ( ( rule__CalendarQuestion__ConditionsAssignment_13_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4694:1: ( ( rule__CalendarQuestion__ConditionsAssignment_13_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4694:1: ( ( rule__CalendarQuestion__ConditionsAssignment_13_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4695:1: ( rule__CalendarQuestion__ConditionsAssignment_13_2 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4696:1: ( rule__CalendarQuestion__ConditionsAssignment_13_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4696:2: rule__CalendarQuestion__ConditionsAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__ConditionsAssignment_13_2_in_rule__CalendarQuestion__Group_13__2__Impl9266);
            rule__CalendarQuestion__ConditionsAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_2()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__2__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4706:1: rule__CalendarQuestion__Group_13__3 : rule__CalendarQuestion__Group_13__3__Impl rule__CalendarQuestion__Group_13__4 ;
    public final void rule__CalendarQuestion__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4710:1: ( rule__CalendarQuestion__Group_13__3__Impl rule__CalendarQuestion__Group_13__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4711:2: rule__CalendarQuestion__Group_13__3__Impl rule__CalendarQuestion__Group_13__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__3__Impl_in_rule__CalendarQuestion__Group_13__39296);
            rule__CalendarQuestion__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__4_in_rule__CalendarQuestion__Group_13__39299);
            rule__CalendarQuestion__Group_13__4();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__3"


    // $ANTLR start "rule__CalendarQuestion__Group_13__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4718:1: rule__CalendarQuestion__Group_13__3__Impl : ( ( rule__CalendarQuestion__Group_13_3__0 )* ) ;
    public final void rule__CalendarQuestion__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4722:1: ( ( ( rule__CalendarQuestion__Group_13_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4723:1: ( ( rule__CalendarQuestion__Group_13_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4723:1: ( ( rule__CalendarQuestion__Group_13_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4724:1: ( rule__CalendarQuestion__Group_13_3__0 )*
            {
             before(grammarAccess.getCalendarQuestionAccess().getGroup_13_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4725:1: ( rule__CalendarQuestion__Group_13_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4725:2: rule__CalendarQuestion__Group_13_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13_3__0_in_rule__CalendarQuestion__Group_13__3__Impl9326);
            	    rule__CalendarQuestion__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getCalendarQuestionAccess().getGroup_13_3()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__3__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4735:1: rule__CalendarQuestion__Group_13__4 : rule__CalendarQuestion__Group_13__4__Impl ;
    public final void rule__CalendarQuestion__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4739:1: ( rule__CalendarQuestion__Group_13__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4740:2: rule__CalendarQuestion__Group_13__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13__4__Impl_in_rule__CalendarQuestion__Group_13__49357);
            rule__CalendarQuestion__Group_13__4__Impl();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__4"


    // $ANTLR start "rule__CalendarQuestion__Group_13__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4746:1: rule__CalendarQuestion__Group_13__4__Impl : ( ')' ) ;
    public final void rule__CalendarQuestion__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4750:1: ( ( ')' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4751:1: ( ')' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4751:1: ( ')' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4752:1: ')'
            {
             before(grammarAccess.getCalendarQuestionAccess().getRightParenthesisKeyword_13_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CalendarQuestion__Group_13__4__Impl9385); 
             after(grammarAccess.getCalendarQuestionAccess().getRightParenthesisKeyword_13_4()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13__4__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4775:1: rule__CalendarQuestion__Group_13_3__0 : rule__CalendarQuestion__Group_13_3__0__Impl rule__CalendarQuestion__Group_13_3__1 ;
    public final void rule__CalendarQuestion__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4779:1: ( rule__CalendarQuestion__Group_13_3__0__Impl rule__CalendarQuestion__Group_13_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4780:2: rule__CalendarQuestion__Group_13_3__0__Impl rule__CalendarQuestion__Group_13_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13_3__0__Impl_in_rule__CalendarQuestion__Group_13_3__09426);
            rule__CalendarQuestion__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13_3__1_in_rule__CalendarQuestion__Group_13_3__09429);
            rule__CalendarQuestion__Group_13_3__1();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13_3__0"


    // $ANTLR start "rule__CalendarQuestion__Group_13_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4787:1: rule__CalendarQuestion__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__CalendarQuestion__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4791:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4792:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4792:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4793:1: ','
            {
             before(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_13_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__CalendarQuestion__Group_13_3__0__Impl9457); 
             after(grammarAccess.getCalendarQuestionAccess().getCommaKeyword_13_3_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13_3__0__Impl"


    // $ANTLR start "rule__CalendarQuestion__Group_13_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4806:1: rule__CalendarQuestion__Group_13_3__1 : rule__CalendarQuestion__Group_13_3__1__Impl ;
    public final void rule__CalendarQuestion__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4810:1: ( rule__CalendarQuestion__Group_13_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4811:2: rule__CalendarQuestion__Group_13_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__Group_13_3__1__Impl_in_rule__CalendarQuestion__Group_13_3__19488);
            rule__CalendarQuestion__Group_13_3__1__Impl();

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
    // $ANTLR end "rule__CalendarQuestion__Group_13_3__1"


    // $ANTLR start "rule__CalendarQuestion__Group_13_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4817:1: rule__CalendarQuestion__Group_13_3__1__Impl : ( ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 ) ) ;
    public final void rule__CalendarQuestion__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4821:1: ( ( ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4822:1: ( ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4822:1: ( ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4823:1: ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 )
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4824:1: ( rule__CalendarQuestion__ConditionsAssignment_13_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4824:2: rule__CalendarQuestion__ConditionsAssignment_13_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CalendarQuestion__ConditionsAssignment_13_3_1_in_rule__CalendarQuestion__Group_13_3__1__Impl9515);
            rule__CalendarQuestion__ConditionsAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarQuestionAccess().getConditionsAssignment_13_3_1()); 

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
    // $ANTLR end "rule__CalendarQuestion__Group_13_3__1__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4838:1: rule__IntegerQuestion__Group__0 : rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 ;
    public final void rule__IntegerQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4842:1: ( rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4843:2: rule__IntegerQuestion__Group__0__Impl rule__IntegerQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__09549);
            rule__IntegerQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__09552);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4850:1: rule__IntegerQuestion__Group__0__Impl : ( ( rule__IntegerQuestion__MandatoryAssignment_0 ) ) ;
    public final void rule__IntegerQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4854:1: ( ( ( rule__IntegerQuestion__MandatoryAssignment_0 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4855:1: ( ( rule__IntegerQuestion__MandatoryAssignment_0 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4855:1: ( ( rule__IntegerQuestion__MandatoryAssignment_0 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4856:1: ( rule__IntegerQuestion__MandatoryAssignment_0 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMandatoryAssignment_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4857:1: ( rule__IntegerQuestion__MandatoryAssignment_0 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4857:2: rule__IntegerQuestion__MandatoryAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MandatoryAssignment_0_in_rule__IntegerQuestion__Group__0__Impl9579);
            rule__IntegerQuestion__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getMandatoryAssignment_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4867:1: rule__IntegerQuestion__Group__1 : rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 ;
    public final void rule__IntegerQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4871:1: ( rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4872:2: rule__IntegerQuestion__Group__1__Impl rule__IntegerQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__19609);
            rule__IntegerQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__19612);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4879:1: rule__IntegerQuestion__Group__1__Impl : ( 'IntegerQuestion' ) ;
    public final void rule__IntegerQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4883:1: ( ( 'IntegerQuestion' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4884:1: ( 'IntegerQuestion' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4884:1: ( 'IntegerQuestion' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4885:1: 'IntegerQuestion'
            {
             before(grammarAccess.getIntegerQuestionAccess().getIntegerQuestionKeyword_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__IntegerQuestion__Group__1__Impl9640); 
             after(grammarAccess.getIntegerQuestionAccess().getIntegerQuestionKeyword_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4898:1: rule__IntegerQuestion__Group__2 : rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 ;
    public final void rule__IntegerQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4902:1: ( rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4903:2: rule__IntegerQuestion__Group__2__Impl rule__IntegerQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__29671);
            rule__IntegerQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__29674);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4910:1: rule__IntegerQuestion__Group__2__Impl : ( '{' ) ;
    public final void rule__IntegerQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4914:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4915:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4915:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4916:1: '{'
            {
             before(grammarAccess.getIntegerQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__IntegerQuestion__Group__2__Impl9702); 
             after(grammarAccess.getIntegerQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4929:1: rule__IntegerQuestion__Group__3 : rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 ;
    public final void rule__IntegerQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4933:1: ( rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4934:2: rule__IntegerQuestion__Group__3__Impl rule__IntegerQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__39733);
            rule__IntegerQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__39736);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4941:1: rule__IntegerQuestion__Group__3__Impl : ( 'id' ) ;
    public final void rule__IntegerQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4945:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4946:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4946:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4947:1: 'id'
            {
             before(grammarAccess.getIntegerQuestionAccess().getIdKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__IntegerQuestion__Group__3__Impl9764); 
             after(grammarAccess.getIntegerQuestionAccess().getIdKeyword_3()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4960:1: rule__IntegerQuestion__Group__4 : rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 ;
    public final void rule__IntegerQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4964:1: ( rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4965:2: rule__IntegerQuestion__Group__4__Impl rule__IntegerQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__49795);
            rule__IntegerQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__49798);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4972:1: rule__IntegerQuestion__Group__4__Impl : ( ( rule__IntegerQuestion__IdAssignment_4 ) ) ;
    public final void rule__IntegerQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4976:1: ( ( ( rule__IntegerQuestion__IdAssignment_4 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4977:1: ( ( rule__IntegerQuestion__IdAssignment_4 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4977:1: ( ( rule__IntegerQuestion__IdAssignment_4 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4978:1: ( rule__IntegerQuestion__IdAssignment_4 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getIdAssignment_4()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4979:1: ( rule__IntegerQuestion__IdAssignment_4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4979:2: rule__IntegerQuestion__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__IdAssignment_4_in_rule__IntegerQuestion__Group__4__Impl9825);
            rule__IntegerQuestion__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getIdAssignment_4()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4989:1: rule__IntegerQuestion__Group__5 : rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 ;
    public final void rule__IntegerQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4993:1: ( rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:4994:2: rule__IntegerQuestion__Group__5__Impl rule__IntegerQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__59855);
            rule__IntegerQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__59858);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5001:1: rule__IntegerQuestion__Group__5__Impl : ( 'title' ) ;
    public final void rule__IntegerQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5005:1: ( ( 'title' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5006:1: ( 'title' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5006:1: ( 'title' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5007:1: 'title'
            {
             before(grammarAccess.getIntegerQuestionAccess().getTitleKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntegerQuestion__Group__5__Impl9886); 
             after(grammarAccess.getIntegerQuestionAccess().getTitleKeyword_5()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5020:1: rule__IntegerQuestion__Group__6 : rule__IntegerQuestion__Group__6__Impl rule__IntegerQuestion__Group__7 ;
    public final void rule__IntegerQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5024:1: ( rule__IntegerQuestion__Group__6__Impl rule__IntegerQuestion__Group__7 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5025:2: rule__IntegerQuestion__Group__6__Impl rule__IntegerQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__69917);
            rule__IntegerQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__7_in_rule__IntegerQuestion__Group__69920);
            rule__IntegerQuestion__Group__7();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5032:1: rule__IntegerQuestion__Group__6__Impl : ( ( rule__IntegerQuestion__TitleAssignment_6 ) ) ;
    public final void rule__IntegerQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5036:1: ( ( ( rule__IntegerQuestion__TitleAssignment_6 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5037:1: ( ( rule__IntegerQuestion__TitleAssignment_6 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5037:1: ( ( rule__IntegerQuestion__TitleAssignment_6 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5038:1: ( rule__IntegerQuestion__TitleAssignment_6 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getTitleAssignment_6()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5039:1: ( rule__IntegerQuestion__TitleAssignment_6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5039:2: rule__IntegerQuestion__TitleAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__TitleAssignment_6_in_rule__IntegerQuestion__Group__6__Impl9947);
            rule__IntegerQuestion__TitleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getTitleAssignment_6()); 

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


    // $ANTLR start "rule__IntegerQuestion__Group__7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5049:1: rule__IntegerQuestion__Group__7 : rule__IntegerQuestion__Group__7__Impl rule__IntegerQuestion__Group__8 ;
    public final void rule__IntegerQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5053:1: ( rule__IntegerQuestion__Group__7__Impl rule__IntegerQuestion__Group__8 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5054:2: rule__IntegerQuestion__Group__7__Impl rule__IntegerQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__7__Impl_in_rule__IntegerQuestion__Group__79977);
            rule__IntegerQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__8_in_rule__IntegerQuestion__Group__79980);
            rule__IntegerQuestion__Group__8();

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
    // $ANTLR end "rule__IntegerQuestion__Group__7"


    // $ANTLR start "rule__IntegerQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5061:1: rule__IntegerQuestion__Group__7__Impl : ( ( rule__IntegerQuestion__Group_7__0 )? ) ;
    public final void rule__IntegerQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5065:1: ( ( ( rule__IntegerQuestion__Group_7__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5066:1: ( ( rule__IntegerQuestion__Group_7__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5066:1: ( ( rule__IntegerQuestion__Group_7__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5067:1: ( rule__IntegerQuestion__Group_7__0 )?
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup_7()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5068:1: ( rule__IntegerQuestion__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5068:2: rule__IntegerQuestion__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_7__0_in_rule__IntegerQuestion__Group__7__Impl10007);
                    rule__IntegerQuestion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerQuestionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__7__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__8"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5078:1: rule__IntegerQuestion__Group__8 : rule__IntegerQuestion__Group__8__Impl rule__IntegerQuestion__Group__9 ;
    public final void rule__IntegerQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5082:1: ( rule__IntegerQuestion__Group__8__Impl rule__IntegerQuestion__Group__9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5083:2: rule__IntegerQuestion__Group__8__Impl rule__IntegerQuestion__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__8__Impl_in_rule__IntegerQuestion__Group__810038);
            rule__IntegerQuestion__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__9_in_rule__IntegerQuestion__Group__810041);
            rule__IntegerQuestion__Group__9();

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
    // $ANTLR end "rule__IntegerQuestion__Group__8"


    // $ANTLR start "rule__IntegerQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5090:1: rule__IntegerQuestion__Group__8__Impl : ( 'minValue' ) ;
    public final void rule__IntegerQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5094:1: ( ( 'minValue' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5095:1: ( 'minValue' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5095:1: ( 'minValue' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5096:1: 'minValue'
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueKeyword_8()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__IntegerQuestion__Group__8__Impl10069); 
             after(grammarAccess.getIntegerQuestionAccess().getMinValueKeyword_8()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__8__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5109:1: rule__IntegerQuestion__Group__9 : rule__IntegerQuestion__Group__9__Impl rule__IntegerQuestion__Group__10 ;
    public final void rule__IntegerQuestion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5113:1: ( rule__IntegerQuestion__Group__9__Impl rule__IntegerQuestion__Group__10 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5114:2: rule__IntegerQuestion__Group__9__Impl rule__IntegerQuestion__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__9__Impl_in_rule__IntegerQuestion__Group__910100);
            rule__IntegerQuestion__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__10_in_rule__IntegerQuestion__Group__910103);
            rule__IntegerQuestion__Group__10();

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
    // $ANTLR end "rule__IntegerQuestion__Group__9"


    // $ANTLR start "rule__IntegerQuestion__Group__9__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5121:1: rule__IntegerQuestion__Group__9__Impl : ( ( rule__IntegerQuestion__MinValueAssignment_9 ) ) ;
    public final void rule__IntegerQuestion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5125:1: ( ( ( rule__IntegerQuestion__MinValueAssignment_9 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5126:1: ( ( rule__IntegerQuestion__MinValueAssignment_9 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5126:1: ( ( rule__IntegerQuestion__MinValueAssignment_9 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5127:1: ( rule__IntegerQuestion__MinValueAssignment_9 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_9()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5128:1: ( rule__IntegerQuestion__MinValueAssignment_9 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5128:2: rule__IntegerQuestion__MinValueAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MinValueAssignment_9_in_rule__IntegerQuestion__Group__9__Impl10130);
            rule__IntegerQuestion__MinValueAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getMinValueAssignment_9()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__9__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__10"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5138:1: rule__IntegerQuestion__Group__10 : rule__IntegerQuestion__Group__10__Impl rule__IntegerQuestion__Group__11 ;
    public final void rule__IntegerQuestion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5142:1: ( rule__IntegerQuestion__Group__10__Impl rule__IntegerQuestion__Group__11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5143:2: rule__IntegerQuestion__Group__10__Impl rule__IntegerQuestion__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__10__Impl_in_rule__IntegerQuestion__Group__1010160);
            rule__IntegerQuestion__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__11_in_rule__IntegerQuestion__Group__1010163);
            rule__IntegerQuestion__Group__11();

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
    // $ANTLR end "rule__IntegerQuestion__Group__10"


    // $ANTLR start "rule__IntegerQuestion__Group__10__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5150:1: rule__IntegerQuestion__Group__10__Impl : ( 'step' ) ;
    public final void rule__IntegerQuestion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5154:1: ( ( 'step' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5155:1: ( 'step' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5155:1: ( 'step' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5156:1: 'step'
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepKeyword_10()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__IntegerQuestion__Group__10__Impl10191); 
             after(grammarAccess.getIntegerQuestionAccess().getStepKeyword_10()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__10__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5169:1: rule__IntegerQuestion__Group__11 : rule__IntegerQuestion__Group__11__Impl rule__IntegerQuestion__Group__12 ;
    public final void rule__IntegerQuestion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5173:1: ( rule__IntegerQuestion__Group__11__Impl rule__IntegerQuestion__Group__12 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5174:2: rule__IntegerQuestion__Group__11__Impl rule__IntegerQuestion__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__11__Impl_in_rule__IntegerQuestion__Group__1110222);
            rule__IntegerQuestion__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__12_in_rule__IntegerQuestion__Group__1110225);
            rule__IntegerQuestion__Group__12();

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
    // $ANTLR end "rule__IntegerQuestion__Group__11"


    // $ANTLR start "rule__IntegerQuestion__Group__11__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5181:1: rule__IntegerQuestion__Group__11__Impl : ( ( rule__IntegerQuestion__StepAssignment_11 ) ) ;
    public final void rule__IntegerQuestion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5185:1: ( ( ( rule__IntegerQuestion__StepAssignment_11 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5186:1: ( ( rule__IntegerQuestion__StepAssignment_11 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5186:1: ( ( rule__IntegerQuestion__StepAssignment_11 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5187:1: ( rule__IntegerQuestion__StepAssignment_11 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepAssignment_11()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5188:1: ( rule__IntegerQuestion__StepAssignment_11 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5188:2: rule__IntegerQuestion__StepAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__StepAssignment_11_in_rule__IntegerQuestion__Group__11__Impl10252);
            rule__IntegerQuestion__StepAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getStepAssignment_11()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__11__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__12"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5198:1: rule__IntegerQuestion__Group__12 : rule__IntegerQuestion__Group__12__Impl rule__IntegerQuestion__Group__13 ;
    public final void rule__IntegerQuestion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5202:1: ( rule__IntegerQuestion__Group__12__Impl rule__IntegerQuestion__Group__13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5203:2: rule__IntegerQuestion__Group__12__Impl rule__IntegerQuestion__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__12__Impl_in_rule__IntegerQuestion__Group__1210282);
            rule__IntegerQuestion__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__13_in_rule__IntegerQuestion__Group__1210285);
            rule__IntegerQuestion__Group__13();

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
    // $ANTLR end "rule__IntegerQuestion__Group__12"


    // $ANTLR start "rule__IntegerQuestion__Group__12__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5210:1: rule__IntegerQuestion__Group__12__Impl : ( 'maxValue' ) ;
    public final void rule__IntegerQuestion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5214:1: ( ( 'maxValue' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5215:1: ( 'maxValue' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5215:1: ( 'maxValue' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5216:1: 'maxValue'
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueKeyword_12()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__IntegerQuestion__Group__12__Impl10313); 
             after(grammarAccess.getIntegerQuestionAccess().getMaxValueKeyword_12()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__12__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5229:1: rule__IntegerQuestion__Group__13 : rule__IntegerQuestion__Group__13__Impl rule__IntegerQuestion__Group__14 ;
    public final void rule__IntegerQuestion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5233:1: ( rule__IntegerQuestion__Group__13__Impl rule__IntegerQuestion__Group__14 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5234:2: rule__IntegerQuestion__Group__13__Impl rule__IntegerQuestion__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__13__Impl_in_rule__IntegerQuestion__Group__1310344);
            rule__IntegerQuestion__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__14_in_rule__IntegerQuestion__Group__1310347);
            rule__IntegerQuestion__Group__14();

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
    // $ANTLR end "rule__IntegerQuestion__Group__13"


    // $ANTLR start "rule__IntegerQuestion__Group__13__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5241:1: rule__IntegerQuestion__Group__13__Impl : ( ( rule__IntegerQuestion__MaxValueAssignment_13 ) ) ;
    public final void rule__IntegerQuestion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5245:1: ( ( ( rule__IntegerQuestion__MaxValueAssignment_13 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5246:1: ( ( rule__IntegerQuestion__MaxValueAssignment_13 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5246:1: ( ( rule__IntegerQuestion__MaxValueAssignment_13 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5247:1: ( rule__IntegerQuestion__MaxValueAssignment_13 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_13()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5248:1: ( rule__IntegerQuestion__MaxValueAssignment_13 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5248:2: rule__IntegerQuestion__MaxValueAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__MaxValueAssignment_13_in_rule__IntegerQuestion__Group__13__Impl10374);
            rule__IntegerQuestion__MaxValueAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getMaxValueAssignment_13()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__13__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__14"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5258:1: rule__IntegerQuestion__Group__14 : rule__IntegerQuestion__Group__14__Impl rule__IntegerQuestion__Group__15 ;
    public final void rule__IntegerQuestion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5262:1: ( rule__IntegerQuestion__Group__14__Impl rule__IntegerQuestion__Group__15 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5263:2: rule__IntegerQuestion__Group__14__Impl rule__IntegerQuestion__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__14__Impl_in_rule__IntegerQuestion__Group__1410404);
            rule__IntegerQuestion__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__15_in_rule__IntegerQuestion__Group__1410407);
            rule__IntegerQuestion__Group__15();

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
    // $ANTLR end "rule__IntegerQuestion__Group__14"


    // $ANTLR start "rule__IntegerQuestion__Group__14__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5270:1: rule__IntegerQuestion__Group__14__Impl : ( ( rule__IntegerQuestion__Group_14__0 )? ) ;
    public final void rule__IntegerQuestion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5274:1: ( ( ( rule__IntegerQuestion__Group_14__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5275:1: ( ( rule__IntegerQuestion__Group_14__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5275:1: ( ( rule__IntegerQuestion__Group_14__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5276:1: ( rule__IntegerQuestion__Group_14__0 )?
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup_14()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5277:1: ( rule__IntegerQuestion__Group_14__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5277:2: rule__IntegerQuestion__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__0_in_rule__IntegerQuestion__Group__14__Impl10434);
                    rule__IntegerQuestion__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerQuestionAccess().getGroup_14()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__14__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group__15"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5287:1: rule__IntegerQuestion__Group__15 : rule__IntegerQuestion__Group__15__Impl ;
    public final void rule__IntegerQuestion__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5291:1: ( rule__IntegerQuestion__Group__15__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5292:2: rule__IntegerQuestion__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group__15__Impl_in_rule__IntegerQuestion__Group__1510465);
            rule__IntegerQuestion__Group__15__Impl();

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
    // $ANTLR end "rule__IntegerQuestion__Group__15"


    // $ANTLR start "rule__IntegerQuestion__Group__15__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5298:1: rule__IntegerQuestion__Group__15__Impl : ( '}' ) ;
    public final void rule__IntegerQuestion__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5302:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5303:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5303:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5304:1: '}'
            {
             before(grammarAccess.getIntegerQuestionAccess().getRightCurlyBracketKeyword_15()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__IntegerQuestion__Group__15__Impl10493); 
             after(grammarAccess.getIntegerQuestionAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group__15__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_7__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5349:1: rule__IntegerQuestion__Group_7__0 : rule__IntegerQuestion__Group_7__0__Impl rule__IntegerQuestion__Group_7__1 ;
    public final void rule__IntegerQuestion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5353:1: ( rule__IntegerQuestion__Group_7__0__Impl rule__IntegerQuestion__Group_7__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5354:2: rule__IntegerQuestion__Group_7__0__Impl rule__IntegerQuestion__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_7__0__Impl_in_rule__IntegerQuestion__Group_7__010556);
            rule__IntegerQuestion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_7__1_in_rule__IntegerQuestion__Group_7__010559);
            rule__IntegerQuestion__Group_7__1();

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
    // $ANTLR end "rule__IntegerQuestion__Group_7__0"


    // $ANTLR start "rule__IntegerQuestion__Group_7__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5361:1: rule__IntegerQuestion__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__IntegerQuestion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5365:1: ( ( 'description' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5366:1: ( 'description' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5366:1: ( 'description' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5367:1: 'description'
            {
             before(grammarAccess.getIntegerQuestionAccess().getDescriptionKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__IntegerQuestion__Group_7__0__Impl10587); 
             after(grammarAccess.getIntegerQuestionAccess().getDescriptionKeyword_7_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_7__0__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_7__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5380:1: rule__IntegerQuestion__Group_7__1 : rule__IntegerQuestion__Group_7__1__Impl ;
    public final void rule__IntegerQuestion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5384:1: ( rule__IntegerQuestion__Group_7__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5385:2: rule__IntegerQuestion__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_7__1__Impl_in_rule__IntegerQuestion__Group_7__110618);
            rule__IntegerQuestion__Group_7__1__Impl();

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
    // $ANTLR end "rule__IntegerQuestion__Group_7__1"


    // $ANTLR start "rule__IntegerQuestion__Group_7__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5391:1: rule__IntegerQuestion__Group_7__1__Impl : ( ( rule__IntegerQuestion__DescriptionAssignment_7_1 ) ) ;
    public final void rule__IntegerQuestion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5395:1: ( ( ( rule__IntegerQuestion__DescriptionAssignment_7_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5396:1: ( ( rule__IntegerQuestion__DescriptionAssignment_7_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5396:1: ( ( rule__IntegerQuestion__DescriptionAssignment_7_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5397:1: ( rule__IntegerQuestion__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getDescriptionAssignment_7_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5398:1: ( rule__IntegerQuestion__DescriptionAssignment_7_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5398:2: rule__IntegerQuestion__DescriptionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__DescriptionAssignment_7_1_in_rule__IntegerQuestion__Group_7__1__Impl10645);
            rule__IntegerQuestion__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getDescriptionAssignment_7_1()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_7__1__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5412:1: rule__IntegerQuestion__Group_14__0 : rule__IntegerQuestion__Group_14__0__Impl rule__IntegerQuestion__Group_14__1 ;
    public final void rule__IntegerQuestion__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5416:1: ( rule__IntegerQuestion__Group_14__0__Impl rule__IntegerQuestion__Group_14__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5417:2: rule__IntegerQuestion__Group_14__0__Impl rule__IntegerQuestion__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__0__Impl_in_rule__IntegerQuestion__Group_14__010679);
            rule__IntegerQuestion__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__1_in_rule__IntegerQuestion__Group_14__010682);
            rule__IntegerQuestion__Group_14__1();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__0"


    // $ANTLR start "rule__IntegerQuestion__Group_14__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5424:1: rule__IntegerQuestion__Group_14__0__Impl : ( 'conditions' ) ;
    public final void rule__IntegerQuestion__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5428:1: ( ( 'conditions' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5429:1: ( 'conditions' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5429:1: ( 'conditions' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5430:1: 'conditions'
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsKeyword_14_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__IntegerQuestion__Group_14__0__Impl10710); 
             after(grammarAccess.getIntegerQuestionAccess().getConditionsKeyword_14_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__0__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5443:1: rule__IntegerQuestion__Group_14__1 : rule__IntegerQuestion__Group_14__1__Impl rule__IntegerQuestion__Group_14__2 ;
    public final void rule__IntegerQuestion__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5447:1: ( rule__IntegerQuestion__Group_14__1__Impl rule__IntegerQuestion__Group_14__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5448:2: rule__IntegerQuestion__Group_14__1__Impl rule__IntegerQuestion__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__1__Impl_in_rule__IntegerQuestion__Group_14__110741);
            rule__IntegerQuestion__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__2_in_rule__IntegerQuestion__Group_14__110744);
            rule__IntegerQuestion__Group_14__2();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__1"


    // $ANTLR start "rule__IntegerQuestion__Group_14__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5455:1: rule__IntegerQuestion__Group_14__1__Impl : ( '(' ) ;
    public final void rule__IntegerQuestion__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5459:1: ( ( '(' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5460:1: ( '(' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5460:1: ( '(' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5461:1: '('
            {
             before(grammarAccess.getIntegerQuestionAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__IntegerQuestion__Group_14__1__Impl10772); 
             after(grammarAccess.getIntegerQuestionAccess().getLeftParenthesisKeyword_14_1()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__1__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14__2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5474:1: rule__IntegerQuestion__Group_14__2 : rule__IntegerQuestion__Group_14__2__Impl rule__IntegerQuestion__Group_14__3 ;
    public final void rule__IntegerQuestion__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5478:1: ( rule__IntegerQuestion__Group_14__2__Impl rule__IntegerQuestion__Group_14__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5479:2: rule__IntegerQuestion__Group_14__2__Impl rule__IntegerQuestion__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__2__Impl_in_rule__IntegerQuestion__Group_14__210803);
            rule__IntegerQuestion__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__3_in_rule__IntegerQuestion__Group_14__210806);
            rule__IntegerQuestion__Group_14__3();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__2"


    // $ANTLR start "rule__IntegerQuestion__Group_14__2__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5486:1: rule__IntegerQuestion__Group_14__2__Impl : ( ( rule__IntegerQuestion__ConditionsAssignment_14_2 ) ) ;
    public final void rule__IntegerQuestion__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5490:1: ( ( ( rule__IntegerQuestion__ConditionsAssignment_14_2 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5491:1: ( ( rule__IntegerQuestion__ConditionsAssignment_14_2 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5491:1: ( ( rule__IntegerQuestion__ConditionsAssignment_14_2 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5492:1: ( rule__IntegerQuestion__ConditionsAssignment_14_2 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5493:1: ( rule__IntegerQuestion__ConditionsAssignment_14_2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5493:2: rule__IntegerQuestion__ConditionsAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__ConditionsAssignment_14_2_in_rule__IntegerQuestion__Group_14__2__Impl10833);
            rule__IntegerQuestion__ConditionsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_2()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__2__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5503:1: rule__IntegerQuestion__Group_14__3 : rule__IntegerQuestion__Group_14__3__Impl rule__IntegerQuestion__Group_14__4 ;
    public final void rule__IntegerQuestion__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5507:1: ( rule__IntegerQuestion__Group_14__3__Impl rule__IntegerQuestion__Group_14__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5508:2: rule__IntegerQuestion__Group_14__3__Impl rule__IntegerQuestion__Group_14__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__3__Impl_in_rule__IntegerQuestion__Group_14__310863);
            rule__IntegerQuestion__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__4_in_rule__IntegerQuestion__Group_14__310866);
            rule__IntegerQuestion__Group_14__4();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__3"


    // $ANTLR start "rule__IntegerQuestion__Group_14__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5515:1: rule__IntegerQuestion__Group_14__3__Impl : ( ( rule__IntegerQuestion__Group_14_3__0 )* ) ;
    public final void rule__IntegerQuestion__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5519:1: ( ( ( rule__IntegerQuestion__Group_14_3__0 )* ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5520:1: ( ( rule__IntegerQuestion__Group_14_3__0 )* )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5520:1: ( ( rule__IntegerQuestion__Group_14_3__0 )* )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5521:1: ( rule__IntegerQuestion__Group_14_3__0 )*
            {
             before(grammarAccess.getIntegerQuestionAccess().getGroup_14_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5522:1: ( rule__IntegerQuestion__Group_14_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5522:2: rule__IntegerQuestion__Group_14_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14_3__0_in_rule__IntegerQuestion__Group_14__3__Impl10893);
            	    rule__IntegerQuestion__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getIntegerQuestionAccess().getGroup_14_3()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__3__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5532:1: rule__IntegerQuestion__Group_14__4 : rule__IntegerQuestion__Group_14__4__Impl ;
    public final void rule__IntegerQuestion__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5536:1: ( rule__IntegerQuestion__Group_14__4__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5537:2: rule__IntegerQuestion__Group_14__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14__4__Impl_in_rule__IntegerQuestion__Group_14__410924);
            rule__IntegerQuestion__Group_14__4__Impl();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__4"


    // $ANTLR start "rule__IntegerQuestion__Group_14__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5543:1: rule__IntegerQuestion__Group_14__4__Impl : ( ')' ) ;
    public final void rule__IntegerQuestion__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5547:1: ( ( ')' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5548:1: ( ')' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5548:1: ( ')' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5549:1: ')'
            {
             before(grammarAccess.getIntegerQuestionAccess().getRightParenthesisKeyword_14_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IntegerQuestion__Group_14__4__Impl10952); 
             after(grammarAccess.getIntegerQuestionAccess().getRightParenthesisKeyword_14_4()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14__4__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5572:1: rule__IntegerQuestion__Group_14_3__0 : rule__IntegerQuestion__Group_14_3__0__Impl rule__IntegerQuestion__Group_14_3__1 ;
    public final void rule__IntegerQuestion__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5576:1: ( rule__IntegerQuestion__Group_14_3__0__Impl rule__IntegerQuestion__Group_14_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5577:2: rule__IntegerQuestion__Group_14_3__0__Impl rule__IntegerQuestion__Group_14_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14_3__0__Impl_in_rule__IntegerQuestion__Group_14_3__010993);
            rule__IntegerQuestion__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14_3__1_in_rule__IntegerQuestion__Group_14_3__010996);
            rule__IntegerQuestion__Group_14_3__1();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14_3__0"


    // $ANTLR start "rule__IntegerQuestion__Group_14_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5584:1: rule__IntegerQuestion__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__IntegerQuestion__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5588:1: ( ( ',' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5589:1: ( ',' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5589:1: ( ',' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5590:1: ','
            {
             before(grammarAccess.getIntegerQuestionAccess().getCommaKeyword_14_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__IntegerQuestion__Group_14_3__0__Impl11024); 
             after(grammarAccess.getIntegerQuestionAccess().getCommaKeyword_14_3_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14_3__0__Impl"


    // $ANTLR start "rule__IntegerQuestion__Group_14_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5603:1: rule__IntegerQuestion__Group_14_3__1 : rule__IntegerQuestion__Group_14_3__1__Impl ;
    public final void rule__IntegerQuestion__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5607:1: ( rule__IntegerQuestion__Group_14_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5608:2: rule__IntegerQuestion__Group_14_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__Group_14_3__1__Impl_in_rule__IntegerQuestion__Group_14_3__111055);
            rule__IntegerQuestion__Group_14_3__1__Impl();

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
    // $ANTLR end "rule__IntegerQuestion__Group_14_3__1"


    // $ANTLR start "rule__IntegerQuestion__Group_14_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5614:1: rule__IntegerQuestion__Group_14_3__1__Impl : ( ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 ) ) ;
    public final void rule__IntegerQuestion__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5618:1: ( ( ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5619:1: ( ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5619:1: ( ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5620:1: ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 )
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5621:1: ( rule__IntegerQuestion__ConditionsAssignment_14_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5621:2: rule__IntegerQuestion__ConditionsAssignment_14_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerQuestion__ConditionsAssignment_14_3_1_in_rule__IntegerQuestion__Group_14_3__1__Impl11082);
            rule__IntegerQuestion__ConditionsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerQuestionAccess().getConditionsAssignment_14_3_1()); 

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
    // $ANTLR end "rule__IntegerQuestion__Group_14_3__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5637:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5641:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5642:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__011118);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1_in_rule__Option__Group__011121);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5649:1: rule__Option__Group__0__Impl : ( 'Option' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5653:1: ( ( 'Option' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5654:1: ( 'Option' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5654:1: ( 'Option' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5655:1: 'Option'
            {
             before(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Option__Group__0__Impl11149); 
             after(grammarAccess.getOptionAccess().getOptionKeyword_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5668:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5672:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5673:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__111180);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2_in_rule__Option__Group__111183);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5680:1: rule__Option__Group__1__Impl : ( '{' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5684:1: ( ( '{' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5685:1: ( '{' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5685:1: ( '{' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5686:1: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Option__Group__1__Impl11211); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5699:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5703:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5704:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__211242);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__3_in_rule__Option__Group__211245);
            rule__Option__Group__3();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5711:1: rule__Option__Group__2__Impl : ( ( rule__Option__Group_2__0 )? ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5715:1: ( ( ( rule__Option__Group_2__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5716:1: ( ( rule__Option__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5716:1: ( ( rule__Option__Group_2__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5717:1: ( rule__Option__Group_2__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_2()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5718:1: ( rule__Option__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5718:2: rule__Option__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl11272);
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


    // $ANTLR start "rule__Option__Group__3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5728:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5732:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5733:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__311303);
            rule__Option__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__4_in_rule__Option__Group__311306);
            rule__Option__Group__4();

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
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5740:1: rule__Option__Group__3__Impl : ( ( rule__Option__Group_3__0 )? ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5744:1: ( ( ( rule__Option__Group_3__0 )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5745:1: ( ( rule__Option__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5745:1: ( ( rule__Option__Group_3__0 )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5746:1: ( rule__Option__Group_3__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5747:1: ( rule__Option__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5747:2: rule__Option__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Option__Group_3__0_in_rule__Option__Group__3__Impl11333);
                    rule__Option__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5757:1: rule__Option__Group__4 : rule__Option__Group__4__Impl rule__Option__Group__5 ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5761:1: ( rule__Option__Group__4__Impl rule__Option__Group__5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5762:2: rule__Option__Group__4__Impl rule__Option__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__411364);
            rule__Option__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__5_in_rule__Option__Group__411367);
            rule__Option__Group__5();

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
    // $ANTLR end "rule__Option__Group__4"


    // $ANTLR start "rule__Option__Group__4__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5769:1: rule__Option__Group__4__Impl : ( 'question' ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5773:1: ( ( 'question' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5774:1: ( 'question' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5774:1: ( 'question' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5775:1: 'question'
            {
             before(grammarAccess.getOptionAccess().getQuestionKeyword_4()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Option__Group__4__Impl11395); 
             after(grammarAccess.getOptionAccess().getQuestionKeyword_4()); 

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
    // $ANTLR end "rule__Option__Group__4__Impl"


    // $ANTLR start "rule__Option__Group__5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5788:1: rule__Option__Group__5 : rule__Option__Group__5__Impl rule__Option__Group__6 ;
    public final void rule__Option__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5792:1: ( rule__Option__Group__5__Impl rule__Option__Group__6 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5793:2: rule__Option__Group__5__Impl rule__Option__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__5__Impl_in_rule__Option__Group__511426);
            rule__Option__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__6_in_rule__Option__Group__511429);
            rule__Option__Group__6();

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
    // $ANTLR end "rule__Option__Group__5"


    // $ANTLR start "rule__Option__Group__5__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5800:1: rule__Option__Group__5__Impl : ( ( rule__Option__QuestionAssignment_5 ) ) ;
    public final void rule__Option__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5804:1: ( ( ( rule__Option__QuestionAssignment_5 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5805:1: ( ( rule__Option__QuestionAssignment_5 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5805:1: ( ( rule__Option__QuestionAssignment_5 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5806:1: ( rule__Option__QuestionAssignment_5 )
            {
             before(grammarAccess.getOptionAccess().getQuestionAssignment_5()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5807:1: ( rule__Option__QuestionAssignment_5 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5807:2: rule__Option__QuestionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__QuestionAssignment_5_in_rule__Option__Group__5__Impl11456);
            rule__Option__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getQuestionAssignment_5()); 

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
    // $ANTLR end "rule__Option__Group__5__Impl"


    // $ANTLR start "rule__Option__Group__6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5817:1: rule__Option__Group__6 : rule__Option__Group__6__Impl ;
    public final void rule__Option__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5821:1: ( rule__Option__Group__6__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5822:2: rule__Option__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group__6__Impl_in_rule__Option__Group__611486);
            rule__Option__Group__6__Impl();

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
    // $ANTLR end "rule__Option__Group__6"


    // $ANTLR start "rule__Option__Group__6__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5828:1: rule__Option__Group__6__Impl : ( '}' ) ;
    public final void rule__Option__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5832:1: ( ( '}' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5833:1: ( '}' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5833:1: ( '}' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5834:1: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Option__Group__6__Impl11514); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Option__Group__6__Impl"


    // $ANTLR start "rule__Option__Group_2__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5861:1: rule__Option__Group_2__0 : rule__Option__Group_2__0__Impl rule__Option__Group_2__1 ;
    public final void rule__Option__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5865:1: ( rule__Option__Group_2__0__Impl rule__Option__Group_2__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5866:2: rule__Option__Group_2__0__Impl rule__Option__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__011559);
            rule__Option__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__011562);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5873:1: rule__Option__Group_2__0__Impl : ( 'id' ) ;
    public final void rule__Option__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5877:1: ( ( 'id' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5878:1: ( 'id' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5878:1: ( 'id' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5879:1: 'id'
            {
             before(grammarAccess.getOptionAccess().getIdKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Option__Group_2__0__Impl11590); 
             after(grammarAccess.getOptionAccess().getIdKeyword_2_0()); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5892:1: rule__Option__Group_2__1 : rule__Option__Group_2__1__Impl ;
    public final void rule__Option__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5896:1: ( rule__Option__Group_2__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5897:2: rule__Option__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__111621);
            rule__Option__Group_2__1__Impl();

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5903:1: rule__Option__Group_2__1__Impl : ( ( rule__Option__IdAssignment_2_1 ) ) ;
    public final void rule__Option__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5907:1: ( ( ( rule__Option__IdAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5908:1: ( ( rule__Option__IdAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5908:1: ( ( rule__Option__IdAssignment_2_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5909:1: ( rule__Option__IdAssignment_2_1 )
            {
             before(grammarAccess.getOptionAccess().getIdAssignment_2_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5910:1: ( rule__Option__IdAssignment_2_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5910:2: rule__Option__IdAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__IdAssignment_2_1_in_rule__Option__Group_2__1__Impl11648);
            rule__Option__IdAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getIdAssignment_2_1()); 

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


    // $ANTLR start "rule__Option__Group_3__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5924:1: rule__Option__Group_3__0 : rule__Option__Group_3__0__Impl rule__Option__Group_3__1 ;
    public final void rule__Option__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5928:1: ( rule__Option__Group_3__0__Impl rule__Option__Group_3__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5929:2: rule__Option__Group_3__0__Impl rule__Option__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_3__0__Impl_in_rule__Option__Group_3__011682);
            rule__Option__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_3__1_in_rule__Option__Group_3__011685);
            rule__Option__Group_3__1();

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
    // $ANTLR end "rule__Option__Group_3__0"


    // $ANTLR start "rule__Option__Group_3__0__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5936:1: rule__Option__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Option__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5940:1: ( ( 'text' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5941:1: ( 'text' )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5941:1: ( 'text' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5942:1: 'text'
            {
             before(grammarAccess.getOptionAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Option__Group_3__0__Impl11713); 
             after(grammarAccess.getOptionAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__Option__Group_3__0__Impl"


    // $ANTLR start "rule__Option__Group_3__1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5955:1: rule__Option__Group_3__1 : rule__Option__Group_3__1__Impl ;
    public final void rule__Option__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5959:1: ( rule__Option__Group_3__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5960:2: rule__Option__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__Group_3__1__Impl_in_rule__Option__Group_3__111744);
            rule__Option__Group_3__1__Impl();

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
    // $ANTLR end "rule__Option__Group_3__1"


    // $ANTLR start "rule__Option__Group_3__1__Impl"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5966:1: rule__Option__Group_3__1__Impl : ( ( rule__Option__TextAssignment_3_1 ) ) ;
    public final void rule__Option__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5970:1: ( ( ( rule__Option__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5971:1: ( ( rule__Option__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5971:1: ( ( rule__Option__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5972:1: ( rule__Option__TextAssignment_3_1 )
            {
             before(grammarAccess.getOptionAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5973:1: ( rule__Option__TextAssignment_3_1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5973:2: rule__Option__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Option__TextAssignment_3_1_in_rule__Option__Group_3__1__Impl11771);
            rule__Option__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__Option__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5987:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5991:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5992:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011805);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011808);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:5999:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6003:1: ( ( ( '-' )? ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6004:1: ( ( '-' )? )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6004:1: ( ( '-' )? )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6005:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6006:1: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6007:2: '-'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_rule__EInt__Group__0__Impl11837); 

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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6018:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6022:1: ( rule__EInt__Group__1__Impl )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6023:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111870);
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
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6029:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6033:1: ( ( RULE_INT ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6034:1: ( RULE_INT )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6034:1: ( RULE_INT )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6035:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11897); 
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


    // $ANTLR start "rule__Questionaire__NameAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6051:1: rule__Questionaire__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Questionaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6055:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6056:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6056:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6057:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_111935);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Questionaire__NameAssignment_1"


    // $ANTLR start "rule__Questionaire__ResultEmailAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6066:1: rule__Questionaire__ResultEmailAssignment_4 : ( ruleEString ) ;
    public final void rule__Questionaire__ResultEmailAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6070:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6071:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6071:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6072:1: ruleEString
            {
             before(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_411966);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getResultEmailEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Questionaire__ResultEmailAssignment_4"


    // $ANTLR start "rule__Questionaire__ElementsAssignment_5_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6081:1: rule__Questionaire__ElementsAssignment_5_2 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6085:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6086:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6086:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6087:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_5_211997);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Questionaire__ElementsAssignment_5_2"


    // $ANTLR start "rule__Questionaire__ElementsAssignment_5_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6096:1: rule__Questionaire__ElementsAssignment_5_3_1 : ( ruleElement ) ;
    public final void rule__Questionaire__ElementsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6100:1: ( ( ruleElement ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6101:1: ( ruleElement )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6101:1: ( ruleElement )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6102:1: ruleElement
            {
             before(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_5_3_112028);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getQuestionaireAccess().getElementsElementParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Questionaire__ElementsAssignment_5_3_1"


    // $ANTLR start "rule__Heading__TextAssignment_3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6111:1: rule__Heading__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Heading__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6115:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6116:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6116:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6117:1: ruleEString
            {
             before(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Heading__TextAssignment_312059);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Heading__TextAssignment_3"


    // $ANTLR start "rule__Paragraph__TextAssignment_3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6126:1: rule__Paragraph__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6130:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6131:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6131:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6132:1: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_312090);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Paragraph__TextAssignment_3"


    // $ANTLR start "rule__TextQuestion__MandatoryAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6141:1: rule__TextQuestion__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__TextQuestion__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6145:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6146:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6146:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6147:1: ( 'mandatory' )
            {
             before(grammarAccess.getTextQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6148:1: ( 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6149:1: 'mandatory'
            {
             before(grammarAccess.getTextQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__TextQuestion__MandatoryAssignment_012126); 
             after(grammarAccess.getTextQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getTextQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

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
    // $ANTLR end "rule__TextQuestion__MandatoryAssignment_0"


    // $ANTLR start "rule__TextQuestion__MultilineAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6164:1: rule__TextQuestion__MultilineAssignment_1 : ( ( 'multiline' ) ) ;
    public final void rule__TextQuestion__MultilineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6168:1: ( ( ( 'multiline' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6169:1: ( ( 'multiline' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6169:1: ( ( 'multiline' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6170:1: ( 'multiline' )
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineMultilineKeyword_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6171:1: ( 'multiline' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6172:1: 'multiline'
            {
             before(grammarAccess.getTextQuestionAccess().getMultilineMultilineKeyword_1_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__TextQuestion__MultilineAssignment_112170); 
             after(grammarAccess.getTextQuestionAccess().getMultilineMultilineKeyword_1_0()); 

            }

             after(grammarAccess.getTextQuestionAccess().getMultilineMultilineKeyword_1_0()); 

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
    // $ANTLR end "rule__TextQuestion__MultilineAssignment_1"


    // $ANTLR start "rule__TextQuestion__IdAssignment_5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6187:1: rule__TextQuestion__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__TextQuestion__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6191:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6192:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6192:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6193:1: ruleEString
            {
             before(grammarAccess.getTextQuestionAccess().getIdEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextQuestion__IdAssignment_512209);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getIdEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TextQuestion__IdAssignment_5"


    // $ANTLR start "rule__TextQuestion__TitleAssignment_7"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6202:1: rule__TextQuestion__TitleAssignment_7 : ( ruleEString ) ;
    public final void rule__TextQuestion__TitleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6206:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6207:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6207:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6208:1: ruleEString
            {
             before(grammarAccess.getTextQuestionAccess().getTitleEStringParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextQuestion__TitleAssignment_712240);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getTitleEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__TextQuestion__TitleAssignment_7"


    // $ANTLR start "rule__TextQuestion__DescriptionAssignment_8_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6217:1: rule__TextQuestion__DescriptionAssignment_8_1 : ( ruleEString ) ;
    public final void rule__TextQuestion__DescriptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6221:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6222:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6222:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6223:1: ruleEString
            {
             before(grammarAccess.getTextQuestionAccess().getDescriptionEStringParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextQuestion__DescriptionAssignment_8_112271);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getDescriptionEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__TextQuestion__DescriptionAssignment_8_1"


    // $ANTLR start "rule__TextQuestion__ConditionsAssignment_9_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6232:1: rule__TextQuestion__ConditionsAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__TextQuestion__ConditionsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6236:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6237:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6237:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6238:1: ( ruleEString )
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6239:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6240:1: ruleEString
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextQuestion__ConditionsAssignment_9_212306);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_2_0()); 

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
    // $ANTLR end "rule__TextQuestion__ConditionsAssignment_9_2"


    // $ANTLR start "rule__TextQuestion__ConditionsAssignment_9_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6251:1: rule__TextQuestion__ConditionsAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__TextQuestion__ConditionsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6255:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6256:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6256:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6257:1: ( ruleEString )
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_3_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6258:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6259:1: ruleEString
            {
             before(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextQuestion__ConditionsAssignment_9_3_112345);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getTextQuestionAccess().getConditionsQuestionConditionCrossReference_9_3_1_0()); 

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
    // $ANTLR end "rule__TextQuestion__ConditionsAssignment_9_3_1"


    // $ANTLR start "rule__ChoiceQuestion__MandatoryAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6270:1: rule__ChoiceQuestion__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__ChoiceQuestion__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6274:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6275:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6275:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6276:1: ( 'mandatory' )
            {
             before(grammarAccess.getChoiceQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6277:1: ( 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6278:1: 'mandatory'
            {
             before(grammarAccess.getChoiceQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ChoiceQuestion__MandatoryAssignment_012385); 
             after(grammarAccess.getChoiceQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__MandatoryAssignment_0"


    // $ANTLR start "rule__ChoiceQuestion__IdAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6293:1: rule__ChoiceQuestion__IdAssignment_4 : ( ruleEString ) ;
    public final void rule__ChoiceQuestion__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6297:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6298:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6298:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6299:1: ruleEString
            {
             before(grammarAccess.getChoiceQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceQuestion__IdAssignment_412424);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getIdEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__IdAssignment_4"


    // $ANTLR start "rule__ChoiceQuestion__TitleAssignment_6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6308:1: rule__ChoiceQuestion__TitleAssignment_6 : ( ruleEString ) ;
    public final void rule__ChoiceQuestion__TitleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6312:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6313:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6313:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6314:1: ruleEString
            {
             before(grammarAccess.getChoiceQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceQuestion__TitleAssignment_612455);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getTitleEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__TitleAssignment_6"


    // $ANTLR start "rule__ChoiceQuestion__DescriptionAssignment_7_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6323:1: rule__ChoiceQuestion__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ChoiceQuestion__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6327:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6328:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6328:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6329:1: ruleEString
            {
             before(grammarAccess.getChoiceQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceQuestion__DescriptionAssignment_7_112486);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__DescriptionAssignment_7_1"


    // $ANTLR start "rule__ChoiceQuestion__MinSelectionsAssignment_8_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6338:1: rule__ChoiceQuestion__MinSelectionsAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MinSelectionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6342:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6343:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6343:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6344:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_8_112517);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getMinSelectionsEIntParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__MinSelectionsAssignment_8_1"


    // $ANTLR start "rule__ChoiceQuestion__MaxSelectionsAssignment_9_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6353:1: rule__ChoiceQuestion__MaxSelectionsAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__ChoiceQuestion__MaxSelectionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6357:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6358:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6358:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6359:1: ruleEInt
            {
             before(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_9_112548);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getMaxSelectionsEIntParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__MaxSelectionsAssignment_9_1"


    // $ANTLR start "rule__ChoiceQuestion__ConditionsAssignment_10_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6368:1: rule__ChoiceQuestion__ConditionsAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__ChoiceQuestion__ConditionsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6372:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6373:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6373:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6374:1: ( ruleEString )
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6375:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6376:1: ruleEString
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceQuestion__ConditionsAssignment_10_212583);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_2_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__ConditionsAssignment_10_2"


    // $ANTLR start "rule__ChoiceQuestion__ConditionsAssignment_10_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6387:1: rule__ChoiceQuestion__ConditionsAssignment_10_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ChoiceQuestion__ConditionsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6391:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6392:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6392:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6393:1: ( ruleEString )
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_3_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6394:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6395:1: ruleEString
            {
             before(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_10_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceQuestion__ConditionsAssignment_10_3_112622);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_10_3_1_0_1()); 

            }

             after(grammarAccess.getChoiceQuestionAccess().getConditionsQuestionConditionCrossReference_10_3_1_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__ConditionsAssignment_10_3_1"


    // $ANTLR start "rule__ChoiceQuestion__OptionsAssignment_13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6406:1: rule__ChoiceQuestion__OptionsAssignment_13 : ( ruleOption ) ;
    public final void rule__ChoiceQuestion__OptionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6410:1: ( ( ruleOption ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6411:1: ( ruleOption )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6411:1: ( ruleOption )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6412:1: ruleOption
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_1312657);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__OptionsAssignment_13"


    // $ANTLR start "rule__ChoiceQuestion__OptionsAssignment_14_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6421:1: rule__ChoiceQuestion__OptionsAssignment_14_1 : ( ruleOption ) ;
    public final void rule__ChoiceQuestion__OptionsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6425:1: ( ( ruleOption ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6426:1: ( ruleOption )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6426:1: ( ruleOption )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6427:1: ruleOption
            {
             before(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_14_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_14_112688);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getOptionsOptionParserRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__ChoiceQuestion__OptionsAssignment_14_1"


    // $ANTLR start "rule__MatrixQuestion__MandatoryAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6436:1: rule__MatrixQuestion__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__MatrixQuestion__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6440:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6441:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6441:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6442:1: ( 'mandatory' )
            {
             before(grammarAccess.getMatrixQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6443:1: ( 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6444:1: 'mandatory'
            {
             before(grammarAccess.getMatrixQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MatrixQuestion__MandatoryAssignment_012724); 
             after(grammarAccess.getMatrixQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getMatrixQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__MandatoryAssignment_0"


    // $ANTLR start "rule__MatrixQuestion__IdAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6459:1: rule__MatrixQuestion__IdAssignment_4 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6463:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6464:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6464:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6465:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__IdAssignment_412763);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getIdEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__IdAssignment_4"


    // $ANTLR start "rule__MatrixQuestion__TitleAssignment_6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6474:1: rule__MatrixQuestion__TitleAssignment_6 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__TitleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6478:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6479:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6479:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6480:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__TitleAssignment_612794);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getTitleEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__TitleAssignment_6"


    // $ANTLR start "rule__MatrixQuestion__DescriptionAssignment_7_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6489:1: rule__MatrixQuestion__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6493:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6494:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6494:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6495:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__DescriptionAssignment_7_112825);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__DescriptionAssignment_7_1"


    // $ANTLR start "rule__MatrixQuestion__ColumnNamesAssignment_8_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6504:1: rule__MatrixQuestion__ColumnNamesAssignment_8_2 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6508:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6509:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6509:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6510:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_8_212856);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__ColumnNamesAssignment_8_2"


    // $ANTLR start "rule__MatrixQuestion__ColumnNamesAssignment_8_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6519:1: rule__MatrixQuestion__ColumnNamesAssignment_8_3_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__ColumnNamesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6523:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6524:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6524:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6525:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_8_3_112887);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getColumnNamesEStringParserRuleCall_8_3_1_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__ColumnNamesAssignment_8_3_1"


    // $ANTLR start "rule__MatrixQuestion__RowNamesAssignment_9_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6534:1: rule__MatrixQuestion__RowNamesAssignment_9_2 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__RowNamesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6538:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6539:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6539:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6540:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_9_212918);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__RowNamesAssignment_9_2"


    // $ANTLR start "rule__MatrixQuestion__RowNamesAssignment_9_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6549:1: rule__MatrixQuestion__RowNamesAssignment_9_3_1 : ( ruleEString ) ;
    public final void rule__MatrixQuestion__RowNamesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6553:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6554:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6554:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6555:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_9_3_112949);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getRowNamesEStringParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__RowNamesAssignment_9_3_1"


    // $ANTLR start "rule__MatrixQuestion__MaxPerRowAssignment_11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6564:1: rule__MatrixQuestion__MaxPerRowAssignment_11 : ( ruleEInt ) ;
    public final void rule__MatrixQuestion__MaxPerRowAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6568:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6569:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6569:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6570:1: ruleEInt
            {
             before(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_1112980);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getMaxPerRowEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__MaxPerRowAssignment_11"


    // $ANTLR start "rule__MatrixQuestion__ConditionsAssignment_12_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6579:1: rule__MatrixQuestion__ConditionsAssignment_12_2 : ( ( ruleEString ) ) ;
    public final void rule__MatrixQuestion__ConditionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6583:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6584:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6584:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6585:1: ( ruleEString )
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6586:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6587:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_12_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ConditionsAssignment_12_213015);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_2_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__ConditionsAssignment_12_2"


    // $ANTLR start "rule__MatrixQuestion__ConditionsAssignment_12_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6598:1: rule__MatrixQuestion__ConditionsAssignment_12_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MatrixQuestion__ConditionsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6602:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6603:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6603:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6604:1: ( ruleEString )
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_3_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6605:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6606:1: ruleEString
            {
             before(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_12_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MatrixQuestion__ConditionsAssignment_12_3_113054);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getMatrixQuestionAccess().getConditionsQuestionConditionCrossReference_12_3_1_0()); 

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
    // $ANTLR end "rule__MatrixQuestion__ConditionsAssignment_12_3_1"


    // $ANTLR start "rule__CalendarQuestion__MandatoryAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6617:1: rule__CalendarQuestion__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__CalendarQuestion__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6621:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6622:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6622:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6623:1: ( 'mandatory' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6624:1: ( 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6625:1: 'mandatory'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__CalendarQuestion__MandatoryAssignment_013094); 
             after(grammarAccess.getCalendarQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__MandatoryAssignment_0"


    // $ANTLR start "rule__CalendarQuestion__YearAssignment_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6640:1: rule__CalendarQuestion__YearAssignment_1 : ( ( 'year' ) ) ;
    public final void rule__CalendarQuestion__YearAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6644:1: ( ( ( 'year' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6645:1: ( ( 'year' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6645:1: ( ( 'year' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6646:1: ( 'year' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6647:1: ( 'year' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6648:1: 'year'
            {
             before(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_1_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__CalendarQuestion__YearAssignment_113138); 
             after(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_1_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getYearYearKeyword_1_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__YearAssignment_1"


    // $ANTLR start "rule__CalendarQuestion__MonthAssignment_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6663:1: rule__CalendarQuestion__MonthAssignment_2 : ( ( 'month' ) ) ;
    public final void rule__CalendarQuestion__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6667:1: ( ( ( 'month' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6668:1: ( ( 'month' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6668:1: ( ( 'month' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6669:1: ( 'month' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6670:1: ( 'month' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6671:1: 'month'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__CalendarQuestion__MonthAssignment_213182); 
             after(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getMonthMonthKeyword_2_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__MonthAssignment_2"


    // $ANTLR start "rule__CalendarQuestion__DayAssignment_3"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6686:1: rule__CalendarQuestion__DayAssignment_3 : ( ( 'day' ) ) ;
    public final void rule__CalendarQuestion__DayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6690:1: ( ( ( 'day' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6691:1: ( ( 'day' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6691:1: ( ( 'day' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6692:1: ( 'day' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_3_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6693:1: ( 'day' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6694:1: 'day'
            {
             before(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_3_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__CalendarQuestion__DayAssignment_313226); 
             after(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_3_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getDayDayKeyword_3_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__DayAssignment_3"


    // $ANTLR start "rule__CalendarQuestion__HourAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6709:1: rule__CalendarQuestion__HourAssignment_4 : ( ( 'hour' ) ) ;
    public final void rule__CalendarQuestion__HourAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6713:1: ( ( ( 'hour' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6714:1: ( ( 'hour' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6714:1: ( ( 'hour' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6715:1: ( 'hour' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_4_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6716:1: ( 'hour' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6717:1: 'hour'
            {
             before(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__CalendarQuestion__HourAssignment_413270); 
             after(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_4_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getHourHourKeyword_4_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__HourAssignment_4"


    // $ANTLR start "rule__CalendarQuestion__MinuteAssignment_5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6732:1: rule__CalendarQuestion__MinuteAssignment_5 : ( ( 'minute' ) ) ;
    public final void rule__CalendarQuestion__MinuteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6736:1: ( ( ( 'minute' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6737:1: ( ( 'minute' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6737:1: ( ( 'minute' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6738:1: ( 'minute' )
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_5_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6739:1: ( 'minute' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6740:1: 'minute'
            {
             before(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_5_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__CalendarQuestion__MinuteAssignment_513314); 
             after(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_5_0()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getMinuteMinuteKeyword_5_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__MinuteAssignment_5"


    // $ANTLR start "rule__CalendarQuestion__IdAssignment_9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6755:1: rule__CalendarQuestion__IdAssignment_9 : ( ruleEString ) ;
    public final void rule__CalendarQuestion__IdAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6759:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6760:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6760:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6761:1: ruleEString
            {
             before(grammarAccess.getCalendarQuestionAccess().getIdEStringParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CalendarQuestion__IdAssignment_913353);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getIdEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__IdAssignment_9"


    // $ANTLR start "rule__CalendarQuestion__TitleAssignment_11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6770:1: rule__CalendarQuestion__TitleAssignment_11 : ( ruleEString ) ;
    public final void rule__CalendarQuestion__TitleAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6774:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6775:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6775:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6776:1: ruleEString
            {
             before(grammarAccess.getCalendarQuestionAccess().getTitleEStringParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CalendarQuestion__TitleAssignment_1113384);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getTitleEStringParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__TitleAssignment_11"


    // $ANTLR start "rule__CalendarQuestion__DescriptionAssignment_12_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6785:1: rule__CalendarQuestion__DescriptionAssignment_12_1 : ( ruleEString ) ;
    public final void rule__CalendarQuestion__DescriptionAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6789:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6790:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6790:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6791:1: ruleEString
            {
             before(grammarAccess.getCalendarQuestionAccess().getDescriptionEStringParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CalendarQuestion__DescriptionAssignment_12_113415);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getDescriptionEStringParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__DescriptionAssignment_12_1"


    // $ANTLR start "rule__CalendarQuestion__ConditionsAssignment_13_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6800:1: rule__CalendarQuestion__ConditionsAssignment_13_2 : ( ( ruleEString ) ) ;
    public final void rule__CalendarQuestion__ConditionsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6804:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6805:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6805:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6806:1: ( ruleEString )
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6807:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6808:1: ruleEString
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_13_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CalendarQuestion__ConditionsAssignment_13_213450);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_13_2_0_1()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_2_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__ConditionsAssignment_13_2"


    // $ANTLR start "rule__CalendarQuestion__ConditionsAssignment_13_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6819:1: rule__CalendarQuestion__ConditionsAssignment_13_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CalendarQuestion__ConditionsAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6823:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6824:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6824:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6825:1: ( ruleEString )
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_3_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6826:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6827:1: ruleEString
            {
             before(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_13_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CalendarQuestion__ConditionsAssignment_13_3_113489);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_13_3_1_0_1()); 

            }

             after(grammarAccess.getCalendarQuestionAccess().getConditionsQuestionConditionCrossReference_13_3_1_0()); 

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
    // $ANTLR end "rule__CalendarQuestion__ConditionsAssignment_13_3_1"


    // $ANTLR start "rule__IntegerQuestion__MandatoryAssignment_0"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6838:1: rule__IntegerQuestion__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__IntegerQuestion__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6842:1: ( ( ( 'mandatory' ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6843:1: ( ( 'mandatory' ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6843:1: ( ( 'mandatory' ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6844:1: ( 'mandatory' )
            {
             before(grammarAccess.getIntegerQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6845:1: ( 'mandatory' )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6846:1: 'mandatory'
            {
             before(grammarAccess.getIntegerQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__IntegerQuestion__MandatoryAssignment_013529); 
             after(grammarAccess.getIntegerQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getIntegerQuestionAccess().getMandatoryMandatoryKeyword_0_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__MandatoryAssignment_0"


    // $ANTLR start "rule__IntegerQuestion__IdAssignment_4"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6861:1: rule__IntegerQuestion__IdAssignment_4 : ( ruleEString ) ;
    public final void rule__IntegerQuestion__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6865:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6866:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6866:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6867:1: ruleEString
            {
             before(grammarAccess.getIntegerQuestionAccess().getIdEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerQuestion__IdAssignment_413568);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getIdEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__IdAssignment_4"


    // $ANTLR start "rule__IntegerQuestion__TitleAssignment_6"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6876:1: rule__IntegerQuestion__TitleAssignment_6 : ( ruleEString ) ;
    public final void rule__IntegerQuestion__TitleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6880:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6881:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6881:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6882:1: ruleEString
            {
             before(grammarAccess.getIntegerQuestionAccess().getTitleEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerQuestion__TitleAssignment_613599);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getTitleEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__TitleAssignment_6"


    // $ANTLR start "rule__IntegerQuestion__DescriptionAssignment_7_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6891:1: rule__IntegerQuestion__DescriptionAssignment_7_1 : ( ruleEString ) ;
    public final void rule__IntegerQuestion__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6895:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6896:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6896:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6897:1: ruleEString
            {
             before(grammarAccess.getIntegerQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerQuestion__DescriptionAssignment_7_113630);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getDescriptionEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__DescriptionAssignment_7_1"


    // $ANTLR start "rule__IntegerQuestion__MinValueAssignment_9"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6906:1: rule__IntegerQuestion__MinValueAssignment_9 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MinValueAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6910:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6911:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6911:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6912:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_913661);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getMinValueEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__MinValueAssignment_9"


    // $ANTLR start "rule__IntegerQuestion__StepAssignment_11"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6921:1: rule__IntegerQuestion__StepAssignment_11 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__StepAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6925:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6926:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6926:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6927:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_1113692);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getStepEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__StepAssignment_11"


    // $ANTLR start "rule__IntegerQuestion__MaxValueAssignment_13"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6936:1: rule__IntegerQuestion__MaxValueAssignment_13 : ( ruleEInt ) ;
    public final void rule__IntegerQuestion__MaxValueAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6940:1: ( ( ruleEInt ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6941:1: ( ruleEInt )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6941:1: ( ruleEInt )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6942:1: ruleEInt
            {
             before(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_1313723);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getMaxValueEIntParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__MaxValueAssignment_13"


    // $ANTLR start "rule__IntegerQuestion__ConditionsAssignment_14_2"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6951:1: rule__IntegerQuestion__ConditionsAssignment_14_2 : ( ( ruleEString ) ) ;
    public final void rule__IntegerQuestion__ConditionsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6955:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6956:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6956:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6957:1: ( ruleEString )
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_2_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6958:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6959:1: ruleEString
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_14_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerQuestion__ConditionsAssignment_14_213758);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_14_2_0_1()); 

            }

             after(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_2_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__ConditionsAssignment_14_2"


    // $ANTLR start "rule__IntegerQuestion__ConditionsAssignment_14_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6970:1: rule__IntegerQuestion__ConditionsAssignment_14_3_1 : ( ( ruleEString ) ) ;
    public final void rule__IntegerQuestion__ConditionsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6974:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6975:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6975:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6976:1: ( ruleEString )
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_3_1_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6977:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6978:1: ruleEString
            {
             before(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_14_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerQuestion__ConditionsAssignment_14_3_113797);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionEStringParserRuleCall_14_3_1_0_1()); 

            }

             after(grammarAccess.getIntegerQuestionAccess().getConditionsQuestionConditionCrossReference_14_3_1_0()); 

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
    // $ANTLR end "rule__IntegerQuestion__ConditionsAssignment_14_3_1"


    // $ANTLR start "rule__Option__IdAssignment_2_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6991:1: rule__Option__IdAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Option__IdAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6995:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6996:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6996:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:6997:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__IdAssignment_2_113834);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Option__IdAssignment_2_1"


    // $ANTLR start "rule__Option__TextAssignment_3_1"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7006:1: rule__Option__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Option__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7010:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7011:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7011:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7012:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__TextAssignment_3_113865);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Option__TextAssignment_3_1"


    // $ANTLR start "rule__Option__QuestionAssignment_5"
    // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7021:1: rule__Option__QuestionAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Option__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7025:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7026:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7026:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7027:1: ( ruleEString )
            {
             before(grammarAccess.getOptionAccess().getQuestionChoiceQuestionCrossReference_5_0()); 
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7028:1: ( ruleEString )
            // ../dk.itu.smdp.group2.questionaire.ui/src-gen/dk/itu/smdp/group2/ui/contentassist/antlr/internal/InternalQuestionaire.g:7029:1: ruleEString
            {
             before(grammarAccess.getOptionAccess().getQuestionChoiceQuestionEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Option__QuestionAssignment_513900);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getQuestionChoiceQuestionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOptionAccess().getQuestionChoiceQuestionCrossReference_5_0()); 

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
    // $ANTLR end "rule__Option__QuestionAssignment_5"

    // Delegated rules


 

    
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
        public static final BitSet FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestion368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__0_in_ruleTextQuestion394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_entryRuleMatrixQuestion481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatrixQuestion488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0_in_ruleMatrixQuestion514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_entryRuleCalendarQuestion541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCalendarQuestion548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__0_in_ruleCalendarQuestion574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_entryRuleIntegerQuestion601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerQuestion608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__0_in_ruleIntegerQuestion634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_entryRuleOption665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOption672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__0_in_ruleOption698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHeading_in_rule__Element__Alternatives794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParagraph_in_rule__Element__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextQuestion_in_rule__Element__Alternatives828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceQuestion_in_rule__Element__Alternatives845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatrixQuestion_in_rule__Element__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCalendarQuestion_in_rule__Element__Alternatives879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerQuestion_in_rule__Element__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__0__Impl_in_rule__Questionaire__Group__0976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1_in_rule__Questionaire__Group__0979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Questionaire__Group__0__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__1__Impl_in_rule__Questionaire__Group__11038 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2_in_rule__Questionaire__Group__11041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__NameAssignment_1_in_rule__Questionaire__Group__1__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__2__Impl_in_rule__Questionaire__Group__21098 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3_in_rule__Questionaire__Group__21101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Questionaire__Group__2__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__3__Impl_in_rule__Questionaire__Group__31160 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__4_in_rule__Questionaire__Group__31163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Questionaire__Group__3__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__4__Impl_in_rule__Questionaire__Group__41222 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__5_in_rule__Questionaire__Group__41225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ResultEmailAssignment_4_in_rule__Questionaire__Group__4__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__5__Impl_in_rule__Questionaire__Group__51282 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__6_in_rule__Questionaire__Group__51285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__0_in_rule__Questionaire__Group__5__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group__6__Impl_in_rule__Questionaire__Group__61343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Questionaire__Group__6__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__0__Impl_in_rule__Questionaire__Group_5__01416 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__1_in_rule__Questionaire__Group_5__01419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Questionaire__Group_5__0__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__1__Impl_in_rule__Questionaire__Group_5__11478 = new BitSet(new long[]{0x00000800000A0000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__2_in_rule__Questionaire__Group_5__11481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Questionaire__Group_5__1__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__2__Impl_in_rule__Questionaire__Group_5__21540 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__3_in_rule__Questionaire__Group_5__21543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_5_2_in_rule__Questionaire__Group_5__2__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__3__Impl_in_rule__Questionaire__Group_5__31600 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__4_in_rule__Questionaire__Group_5__31603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5_3__0_in_rule__Questionaire__Group_5__3__Impl1630 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5__4__Impl_in_rule__Questionaire__Group_5__41661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Questionaire__Group_5__4__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5_3__0__Impl_in_rule__Questionaire__Group_5_3__01730 = new BitSet(new long[]{0x00000800000A0000L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5_3__1_in_rule__Questionaire__Group_5_3__01733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Questionaire__Group_5_3__0__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__Group_5_3__1__Impl_in_rule__Questionaire__Group_5_3__11792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Questionaire__ElementsAssignment_5_3_1_in_rule__Questionaire__Group_5_3__1__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__0__Impl_in_rule__Heading__Group__01853 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Heading__Group__1_in_rule__Heading__Group__01856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Heading__Group__0__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__1__Impl_in_rule__Heading__Group__11915 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Heading__Group__2_in_rule__Heading__Group__11918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Heading__Group__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__2__Impl_in_rule__Heading__Group__21977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Heading__Group__3_in_rule__Heading__Group__21980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Heading__Group__2__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__3__Impl_in_rule__Heading__Group__32039 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Heading__Group__4_in_rule__Heading__Group__32042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__TextAssignment_3_in_rule__Heading__Group__3__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Heading__Group__4__Impl_in_rule__Heading__Group__42099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Heading__Group__4__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__0__Impl_in_rule__Paragraph__Group__02168 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1_in_rule__Paragraph__Group__02171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Paragraph__Group__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__1__Impl_in_rule__Paragraph__Group__12230 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__2_in_rule__Paragraph__Group__12233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Paragraph__Group__1__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__2__Impl_in_rule__Paragraph__Group__22292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__3_in_rule__Paragraph__Group__22295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Paragraph__Group__2__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__3__Impl_in_rule__Paragraph__Group__32354 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__4_in_rule__Paragraph__Group__32357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__TextAssignment_3_in_rule__Paragraph__Group__3__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Paragraph__Group__4__Impl_in_rule__Paragraph__Group__42414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Paragraph__Group__4__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__0__Impl_in_rule__TextQuestion__Group__02483 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1_in_rule__TextQuestion__Group__02486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__MandatoryAssignment_0_in_rule__TextQuestion__Group__0__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__1__Impl_in_rule__TextQuestion__Group__12543 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2_in_rule__TextQuestion__Group__12546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__MultilineAssignment_1_in_rule__TextQuestion__Group__1__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__2__Impl_in_rule__TextQuestion__Group__22603 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3_in_rule__TextQuestion__Group__22606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__TextQuestion__Group__2__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__3__Impl_in_rule__TextQuestion__Group__32665 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__4_in_rule__TextQuestion__Group__32668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TextQuestion__Group__3__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__4__Impl_in_rule__TextQuestion__Group__42727 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__5_in_rule__TextQuestion__Group__42730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__TextQuestion__Group__4__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__5__Impl_in_rule__TextQuestion__Group__52789 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__6_in_rule__TextQuestion__Group__52792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__IdAssignment_5_in_rule__TextQuestion__Group__5__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__6__Impl_in_rule__TextQuestion__Group__62849 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__7_in_rule__TextQuestion__Group__62852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__TextQuestion__Group__6__Impl2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__7__Impl_in_rule__TextQuestion__Group__72911 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__8_in_rule__TextQuestion__Group__72914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__TitleAssignment_7_in_rule__TextQuestion__Group__7__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__8__Impl_in_rule__TextQuestion__Group__82971 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__9_in_rule__TextQuestion__Group__82974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_8__0_in_rule__TextQuestion__Group__8__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__9__Impl_in_rule__TextQuestion__Group__93032 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__10_in_rule__TextQuestion__Group__93035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__0_in_rule__TextQuestion__Group__9__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group__10__Impl_in_rule__TextQuestion__Group__103093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TextQuestion__Group__10__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_8__0__Impl_in_rule__TextQuestion__Group_8__03174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_8__1_in_rule__TextQuestion__Group_8__03177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TextQuestion__Group_8__0__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_8__1__Impl_in_rule__TextQuestion__Group_8__13236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__DescriptionAssignment_8_1_in_rule__TextQuestion__Group_8__1__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__0__Impl_in_rule__TextQuestion__Group_9__03297 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__1_in_rule__TextQuestion__Group_9__03300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__TextQuestion__Group_9__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__1__Impl_in_rule__TextQuestion__Group_9__13359 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__2_in_rule__TextQuestion__Group_9__13362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TextQuestion__Group_9__1__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__2__Impl_in_rule__TextQuestion__Group_9__23421 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__3_in_rule__TextQuestion__Group_9__23424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__ConditionsAssignment_9_2_in_rule__TextQuestion__Group_9__2__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__3__Impl_in_rule__TextQuestion__Group_9__33481 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__4_in_rule__TextQuestion__Group_9__33484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9_3__0_in_rule__TextQuestion__Group_9__3__Impl3511 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9__4__Impl_in_rule__TextQuestion__Group_9__43542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__TextQuestion__Group_9__4__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9_3__0__Impl_in_rule__TextQuestion__Group_9_3__03611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9_3__1_in_rule__TextQuestion__Group_9_3__03614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TextQuestion__Group_9_3__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__Group_9_3__1__Impl_in_rule__TextQuestion__Group_9_3__13673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextQuestion__ConditionsAssignment_9_3_1_in_rule__TextQuestion__Group_9_3__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__03734 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MandatoryAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__13794 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__13797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ChoiceQuestion__Group__1__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__23856 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__23859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ChoiceQuestion__Group__2__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__33918 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__33921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ChoiceQuestion__Group__3__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__43980 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__43983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__IdAssignment_4_in_rule__ChoiceQuestion__Group__4__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__54040 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__54043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ChoiceQuestion__Group__5__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__64102 = new BitSet(new long[]{0x0000000071800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__7_in_rule__ChoiceQuestion__Group__64105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__TitleAssignment_6_in_rule__ChoiceQuestion__Group__6__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__7__Impl_in_rule__ChoiceQuestion__Group__74162 = new BitSet(new long[]{0x0000000071800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__8_in_rule__ChoiceQuestion__Group__74165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_7__0_in_rule__ChoiceQuestion__Group__7__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__8__Impl_in_rule__ChoiceQuestion__Group__84223 = new BitSet(new long[]{0x0000000071800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__9_in_rule__ChoiceQuestion__Group__84226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_8__0_in_rule__ChoiceQuestion__Group__8__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__9__Impl_in_rule__ChoiceQuestion__Group__94284 = new BitSet(new long[]{0x0000000071800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__10_in_rule__ChoiceQuestion__Group__94287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_9__0_in_rule__ChoiceQuestion__Group__9__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__10__Impl_in_rule__ChoiceQuestion__Group__104345 = new BitSet(new long[]{0x0000000071800000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__11_in_rule__ChoiceQuestion__Group__104348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__0_in_rule__ChoiceQuestion__Group__10__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__11__Impl_in_rule__ChoiceQuestion__Group__114406 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__12_in_rule__ChoiceQuestion__Group__114409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__ChoiceQuestion__Group__11__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__12__Impl_in_rule__ChoiceQuestion__Group__124468 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__13_in_rule__ChoiceQuestion__Group__124471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ChoiceQuestion__Group__12__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__13__Impl_in_rule__ChoiceQuestion__Group__134530 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__14_in_rule__ChoiceQuestion__Group__134533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_13_in_rule__ChoiceQuestion__Group__13__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__14__Impl_in_rule__ChoiceQuestion__Group__144590 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__15_in_rule__ChoiceQuestion__Group__144593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_14__0_in_rule__ChoiceQuestion__Group__14__Impl4620 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__15__Impl_in_rule__ChoiceQuestion__Group__154651 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__16_in_rule__ChoiceQuestion__Group__154654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ChoiceQuestion__Group__15__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__16__Impl_in_rule__ChoiceQuestion__Group__164713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ChoiceQuestion__Group__16__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_7__0__Impl_in_rule__ChoiceQuestion__Group_7__04806 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_7__1_in_rule__ChoiceQuestion__Group_7__04809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ChoiceQuestion__Group_7__0__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_7__1__Impl_in_rule__ChoiceQuestion__Group_7__14868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__DescriptionAssignment_7_1_in_rule__ChoiceQuestion__Group_7__1__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_8__0__Impl_in_rule__ChoiceQuestion__Group_8__04929 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_8__1_in_rule__ChoiceQuestion__Group_8__04932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__ChoiceQuestion__Group_8__0__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_8__1__Impl_in_rule__ChoiceQuestion__Group_8__14991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MinSelectionsAssignment_8_1_in_rule__ChoiceQuestion__Group_8__1__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_9__0__Impl_in_rule__ChoiceQuestion__Group_9__05052 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_9__1_in_rule__ChoiceQuestion__Group_9__05055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ChoiceQuestion__Group_9__0__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_9__1__Impl_in_rule__ChoiceQuestion__Group_9__15114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__MaxSelectionsAssignment_9_1_in_rule__ChoiceQuestion__Group_9__1__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__0__Impl_in_rule__ChoiceQuestion__Group_10__05175 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__1_in_rule__ChoiceQuestion__Group_10__05178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ChoiceQuestion__Group_10__0__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__1__Impl_in_rule__ChoiceQuestion__Group_10__15237 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__2_in_rule__ChoiceQuestion__Group_10__15240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ChoiceQuestion__Group_10__1__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__2__Impl_in_rule__ChoiceQuestion__Group_10__25299 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__3_in_rule__ChoiceQuestion__Group_10__25302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__ConditionsAssignment_10_2_in_rule__ChoiceQuestion__Group_10__2__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__3__Impl_in_rule__ChoiceQuestion__Group_10__35359 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__4_in_rule__ChoiceQuestion__Group_10__35362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10_3__0_in_rule__ChoiceQuestion__Group_10__3__Impl5389 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10__4__Impl_in_rule__ChoiceQuestion__Group_10__45420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ChoiceQuestion__Group_10__4__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10_3__0__Impl_in_rule__ChoiceQuestion__Group_10_3__05489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10_3__1_in_rule__ChoiceQuestion__Group_10_3__05492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ChoiceQuestion__Group_10_3__0__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_10_3__1__Impl_in_rule__ChoiceQuestion__Group_10_3__15551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__ConditionsAssignment_10_3_1_in_rule__ChoiceQuestion__Group_10_3__1__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_14__0__Impl_in_rule__ChoiceQuestion__Group_14__05612 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_14__1_in_rule__ChoiceQuestion__Group_14__05615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ChoiceQuestion__Group_14__0__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__Group_14__1__Impl_in_rule__ChoiceQuestion__Group_14__15674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceQuestion__OptionsAssignment_14_1_in_rule__ChoiceQuestion__Group_14__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__0__Impl_in_rule__MatrixQuestion__Group__05735 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1_in_rule__MatrixQuestion__Group__05738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__MandatoryAssignment_0_in_rule__MatrixQuestion__Group__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__1__Impl_in_rule__MatrixQuestion__Group__15795 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2_in_rule__MatrixQuestion__Group__15798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MatrixQuestion__Group__1__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__2__Impl_in_rule__MatrixQuestion__Group__25857 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3_in_rule__MatrixQuestion__Group__25860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MatrixQuestion__Group__2__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__3__Impl_in_rule__MatrixQuestion__Group__35919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4_in_rule__MatrixQuestion__Group__35922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MatrixQuestion__Group__3__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__4__Impl_in_rule__MatrixQuestion__Group__45981 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5_in_rule__MatrixQuestion__Group__45984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__IdAssignment_4_in_rule__MatrixQuestion__Group__4__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__5__Impl_in_rule__MatrixQuestion__Group__56041 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__6_in_rule__MatrixQuestion__Group__56044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MatrixQuestion__Group__5__Impl6072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__6__Impl_in_rule__MatrixQuestion__Group__66103 = new BitSet(new long[]{0x0000000700800000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__7_in_rule__MatrixQuestion__Group__66106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__TitleAssignment_6_in_rule__MatrixQuestion__Group__6__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__7__Impl_in_rule__MatrixQuestion__Group__76163 = new BitSet(new long[]{0x0000000700800000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__8_in_rule__MatrixQuestion__Group__76166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_7__0_in_rule__MatrixQuestion__Group__7__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__8__Impl_in_rule__MatrixQuestion__Group__86224 = new BitSet(new long[]{0x0000000700800000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__9_in_rule__MatrixQuestion__Group__86227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__0_in_rule__MatrixQuestion__Group__8__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__9__Impl_in_rule__MatrixQuestion__Group__96285 = new BitSet(new long[]{0x0000000700800000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__10_in_rule__MatrixQuestion__Group__96288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__0_in_rule__MatrixQuestion__Group__9__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__10__Impl_in_rule__MatrixQuestion__Group__106346 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__11_in_rule__MatrixQuestion__Group__106349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MatrixQuestion__Group__10__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__11__Impl_in_rule__MatrixQuestion__Group__116408 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__12_in_rule__MatrixQuestion__Group__116411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__MaxPerRowAssignment_11_in_rule__MatrixQuestion__Group__11__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__12__Impl_in_rule__MatrixQuestion__Group__126468 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__13_in_rule__MatrixQuestion__Group__126471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__0_in_rule__MatrixQuestion__Group__12__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group__13__Impl_in_rule__MatrixQuestion__Group__136529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MatrixQuestion__Group__13__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_7__0__Impl_in_rule__MatrixQuestion__Group_7__06616 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_7__1_in_rule__MatrixQuestion__Group_7__06619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MatrixQuestion__Group_7__0__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_7__1__Impl_in_rule__MatrixQuestion__Group_7__16678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__DescriptionAssignment_7_1_in_rule__MatrixQuestion__Group_7__1__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__0__Impl_in_rule__MatrixQuestion__Group_8__06739 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__1_in_rule__MatrixQuestion__Group_8__06742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MatrixQuestion__Group_8__0__Impl6770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__1__Impl_in_rule__MatrixQuestion__Group_8__16801 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__2_in_rule__MatrixQuestion__Group_8__16804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MatrixQuestion__Group_8__1__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__2__Impl_in_rule__MatrixQuestion__Group_8__26863 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__3_in_rule__MatrixQuestion__Group_8__26866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_8_2_in_rule__MatrixQuestion__Group_8__2__Impl6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__3__Impl_in_rule__MatrixQuestion__Group_8__36923 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__4_in_rule__MatrixQuestion__Group_8__36926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8_3__0_in_rule__MatrixQuestion__Group_8__3__Impl6953 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8__4__Impl_in_rule__MatrixQuestion__Group_8__46984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MatrixQuestion__Group_8__4__Impl7012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8_3__0__Impl_in_rule__MatrixQuestion__Group_8_3__07053 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8_3__1_in_rule__MatrixQuestion__Group_8_3__07056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MatrixQuestion__Group_8_3__0__Impl7084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_8_3__1__Impl_in_rule__MatrixQuestion__Group_8_3__17115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ColumnNamesAssignment_8_3_1_in_rule__MatrixQuestion__Group_8_3__1__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__0__Impl_in_rule__MatrixQuestion__Group_9__07176 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__1_in_rule__MatrixQuestion__Group_9__07179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MatrixQuestion__Group_9__0__Impl7207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__1__Impl_in_rule__MatrixQuestion__Group_9__17238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__2_in_rule__MatrixQuestion__Group_9__17241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MatrixQuestion__Group_9__1__Impl7269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__2__Impl_in_rule__MatrixQuestion__Group_9__27300 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__3_in_rule__MatrixQuestion__Group_9__27303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__RowNamesAssignment_9_2_in_rule__MatrixQuestion__Group_9__2__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__3__Impl_in_rule__MatrixQuestion__Group_9__37360 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__4_in_rule__MatrixQuestion__Group_9__37363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9_3__0_in_rule__MatrixQuestion__Group_9__3__Impl7390 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9__4__Impl_in_rule__MatrixQuestion__Group_9__47421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MatrixQuestion__Group_9__4__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9_3__0__Impl_in_rule__MatrixQuestion__Group_9_3__07490 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9_3__1_in_rule__MatrixQuestion__Group_9_3__07493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MatrixQuestion__Group_9_3__0__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_9_3__1__Impl_in_rule__MatrixQuestion__Group_9_3__17552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__RowNamesAssignment_9_3_1_in_rule__MatrixQuestion__Group_9_3__1__Impl7579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__0__Impl_in_rule__MatrixQuestion__Group_12__07613 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__1_in_rule__MatrixQuestion__Group_12__07616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MatrixQuestion__Group_12__0__Impl7644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__1__Impl_in_rule__MatrixQuestion__Group_12__17675 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__2_in_rule__MatrixQuestion__Group_12__17678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MatrixQuestion__Group_12__1__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__2__Impl_in_rule__MatrixQuestion__Group_12__27737 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__3_in_rule__MatrixQuestion__Group_12__27740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ConditionsAssignment_12_2_in_rule__MatrixQuestion__Group_12__2__Impl7767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__3__Impl_in_rule__MatrixQuestion__Group_12__37797 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__4_in_rule__MatrixQuestion__Group_12__37800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12_3__0_in_rule__MatrixQuestion__Group_12__3__Impl7827 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12__4__Impl_in_rule__MatrixQuestion__Group_12__47858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MatrixQuestion__Group_12__4__Impl7886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12_3__0__Impl_in_rule__MatrixQuestion__Group_12_3__07927 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12_3__1_in_rule__MatrixQuestion__Group_12_3__07930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MatrixQuestion__Group_12_3__0__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__Group_12_3__1__Impl_in_rule__MatrixQuestion__Group_12_3__17989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MatrixQuestion__ConditionsAssignment_12_3_1_in_rule__MatrixQuestion__Group_12_3__1__Impl8016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__0__Impl_in_rule__CalendarQuestion__Group__08050 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1_in_rule__CalendarQuestion__Group__08053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MandatoryAssignment_0_in_rule__CalendarQuestion__Group__0__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__1__Impl_in_rule__CalendarQuestion__Group__18110 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2_in_rule__CalendarQuestion__Group__18113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__YearAssignment_1_in_rule__CalendarQuestion__Group__1__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__2__Impl_in_rule__CalendarQuestion__Group__28170 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3_in_rule__CalendarQuestion__Group__28173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MonthAssignment_2_in_rule__CalendarQuestion__Group__2__Impl8200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__3__Impl_in_rule__CalendarQuestion__Group__38230 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__4_in_rule__CalendarQuestion__Group__38233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__DayAssignment_3_in_rule__CalendarQuestion__Group__3__Impl8260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__4__Impl_in_rule__CalendarQuestion__Group__48290 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__5_in_rule__CalendarQuestion__Group__48293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__HourAssignment_4_in_rule__CalendarQuestion__Group__4__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__5__Impl_in_rule__CalendarQuestion__Group__58350 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__6_in_rule__CalendarQuestion__Group__58353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__MinuteAssignment_5_in_rule__CalendarQuestion__Group__5__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__6__Impl_in_rule__CalendarQuestion__Group__68410 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__7_in_rule__CalendarQuestion__Group__68413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__CalendarQuestion__Group__6__Impl8441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__7__Impl_in_rule__CalendarQuestion__Group__78472 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__8_in_rule__CalendarQuestion__Group__78475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CalendarQuestion__Group__7__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__8__Impl_in_rule__CalendarQuestion__Group__88534 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__9_in_rule__CalendarQuestion__Group__88537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__CalendarQuestion__Group__8__Impl8565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__9__Impl_in_rule__CalendarQuestion__Group__98596 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__10_in_rule__CalendarQuestion__Group__98599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__IdAssignment_9_in_rule__CalendarQuestion__Group__9__Impl8626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__10__Impl_in_rule__CalendarQuestion__Group__108656 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__11_in_rule__CalendarQuestion__Group__108659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CalendarQuestion__Group__10__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__11__Impl_in_rule__CalendarQuestion__Group__118718 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__12_in_rule__CalendarQuestion__Group__118721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__TitleAssignment_11_in_rule__CalendarQuestion__Group__11__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__12__Impl_in_rule__CalendarQuestion__Group__128778 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__13_in_rule__CalendarQuestion__Group__128781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_12__0_in_rule__CalendarQuestion__Group__12__Impl8808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__13__Impl_in_rule__CalendarQuestion__Group__138839 = new BitSet(new long[]{0x0000000001804000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__14_in_rule__CalendarQuestion__Group__138842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__0_in_rule__CalendarQuestion__Group__13__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group__14__Impl_in_rule__CalendarQuestion__Group__148900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CalendarQuestion__Group__14__Impl8928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_12__0__Impl_in_rule__CalendarQuestion__Group_12__08989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_12__1_in_rule__CalendarQuestion__Group_12__08992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__CalendarQuestion__Group_12__0__Impl9020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_12__1__Impl_in_rule__CalendarQuestion__Group_12__19051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__DescriptionAssignment_12_1_in_rule__CalendarQuestion__Group_12__1__Impl9078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__0__Impl_in_rule__CalendarQuestion__Group_13__09112 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__1_in_rule__CalendarQuestion__Group_13__09115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__CalendarQuestion__Group_13__0__Impl9143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__1__Impl_in_rule__CalendarQuestion__Group_13__19174 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__2_in_rule__CalendarQuestion__Group_13__19177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CalendarQuestion__Group_13__1__Impl9205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__2__Impl_in_rule__CalendarQuestion__Group_13__29236 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__3_in_rule__CalendarQuestion__Group_13__29239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__ConditionsAssignment_13_2_in_rule__CalendarQuestion__Group_13__2__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__3__Impl_in_rule__CalendarQuestion__Group_13__39296 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__4_in_rule__CalendarQuestion__Group_13__39299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13_3__0_in_rule__CalendarQuestion__Group_13__3__Impl9326 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13__4__Impl_in_rule__CalendarQuestion__Group_13__49357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CalendarQuestion__Group_13__4__Impl9385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13_3__0__Impl_in_rule__CalendarQuestion__Group_13_3__09426 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13_3__1_in_rule__CalendarQuestion__Group_13_3__09429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CalendarQuestion__Group_13_3__0__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__Group_13_3__1__Impl_in_rule__CalendarQuestion__Group_13_3__19488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CalendarQuestion__ConditionsAssignment_13_3_1_in_rule__CalendarQuestion__Group_13_3__1__Impl9515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__0__Impl_in_rule__IntegerQuestion__Group__09549 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1_in_rule__IntegerQuestion__Group__09552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MandatoryAssignment_0_in_rule__IntegerQuestion__Group__0__Impl9579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__1__Impl_in_rule__IntegerQuestion__Group__19609 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2_in_rule__IntegerQuestion__Group__19612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__IntegerQuestion__Group__1__Impl9640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__2__Impl_in_rule__IntegerQuestion__Group__29671 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3_in_rule__IntegerQuestion__Group__29674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__IntegerQuestion__Group__2__Impl9702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__3__Impl_in_rule__IntegerQuestion__Group__39733 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4_in_rule__IntegerQuestion__Group__39736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__IntegerQuestion__Group__3__Impl9764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__4__Impl_in_rule__IntegerQuestion__Group__49795 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5_in_rule__IntegerQuestion__Group__49798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__IdAssignment_4_in_rule__IntegerQuestion__Group__4__Impl9825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__5__Impl_in_rule__IntegerQuestion__Group__59855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6_in_rule__IntegerQuestion__Group__59858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntegerQuestion__Group__5__Impl9886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__6__Impl_in_rule__IntegerQuestion__Group__69917 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__7_in_rule__IntegerQuestion__Group__69920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__TitleAssignment_6_in_rule__IntegerQuestion__Group__6__Impl9947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__7__Impl_in_rule__IntegerQuestion__Group__79977 = new BitSet(new long[]{0x0000002000800000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__8_in_rule__IntegerQuestion__Group__79980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_7__0_in_rule__IntegerQuestion__Group__7__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__8__Impl_in_rule__IntegerQuestion__Group__810038 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__9_in_rule__IntegerQuestion__Group__810041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__IntegerQuestion__Group__8__Impl10069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__9__Impl_in_rule__IntegerQuestion__Group__910100 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__10_in_rule__IntegerQuestion__Group__910103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MinValueAssignment_9_in_rule__IntegerQuestion__Group__9__Impl10130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__10__Impl_in_rule__IntegerQuestion__Group__1010160 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__11_in_rule__IntegerQuestion__Group__1010163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__IntegerQuestion__Group__10__Impl10191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__11__Impl_in_rule__IntegerQuestion__Group__1110222 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__12_in_rule__IntegerQuestion__Group__1110225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__StepAssignment_11_in_rule__IntegerQuestion__Group__11__Impl10252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__12__Impl_in_rule__IntegerQuestion__Group__1210282 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__13_in_rule__IntegerQuestion__Group__1210285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__IntegerQuestion__Group__12__Impl10313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__13__Impl_in_rule__IntegerQuestion__Group__1310344 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__14_in_rule__IntegerQuestion__Group__1310347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__MaxValueAssignment_13_in_rule__IntegerQuestion__Group__13__Impl10374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__14__Impl_in_rule__IntegerQuestion__Group__1410404 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__15_in_rule__IntegerQuestion__Group__1410407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__0_in_rule__IntegerQuestion__Group__14__Impl10434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group__15__Impl_in_rule__IntegerQuestion__Group__1510465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__IntegerQuestion__Group__15__Impl10493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_7__0__Impl_in_rule__IntegerQuestion__Group_7__010556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_7__1_in_rule__IntegerQuestion__Group_7__010559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__IntegerQuestion__Group_7__0__Impl10587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_7__1__Impl_in_rule__IntegerQuestion__Group_7__110618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__DescriptionAssignment_7_1_in_rule__IntegerQuestion__Group_7__1__Impl10645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__0__Impl_in_rule__IntegerQuestion__Group_14__010679 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__1_in_rule__IntegerQuestion__Group_14__010682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__IntegerQuestion__Group_14__0__Impl10710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__1__Impl_in_rule__IntegerQuestion__Group_14__110741 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__2_in_rule__IntegerQuestion__Group_14__110744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__IntegerQuestion__Group_14__1__Impl10772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__2__Impl_in_rule__IntegerQuestion__Group_14__210803 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__3_in_rule__IntegerQuestion__Group_14__210806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__ConditionsAssignment_14_2_in_rule__IntegerQuestion__Group_14__2__Impl10833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__3__Impl_in_rule__IntegerQuestion__Group_14__310863 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__4_in_rule__IntegerQuestion__Group_14__310866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14_3__0_in_rule__IntegerQuestion__Group_14__3__Impl10893 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14__4__Impl_in_rule__IntegerQuestion__Group_14__410924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IntegerQuestion__Group_14__4__Impl10952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14_3__0__Impl_in_rule__IntegerQuestion__Group_14_3__010993 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14_3__1_in_rule__IntegerQuestion__Group_14_3__010996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__IntegerQuestion__Group_14_3__0__Impl11024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__Group_14_3__1__Impl_in_rule__IntegerQuestion__Group_14_3__111055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerQuestion__ConditionsAssignment_14_3_1_in_rule__IntegerQuestion__Group_14_3__1__Impl11082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__0__Impl_in_rule__Option__Group__011118 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Option__Group__1_in_rule__Option__Group__011121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Option__Group__0__Impl11149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__1__Impl_in_rule__Option__Group__111180 = new BitSet(new long[]{0x0000020000240000L});
        public static final BitSet FOLLOW_rule__Option__Group__2_in_rule__Option__Group__111183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Option__Group__1__Impl11211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__2__Impl_in_rule__Option__Group__211242 = new BitSet(new long[]{0x0000020000240000L});
        public static final BitSet FOLLOW_rule__Option__Group__3_in_rule__Option__Group__211245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0_in_rule__Option__Group__2__Impl11272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__3__Impl_in_rule__Option__Group__311303 = new BitSet(new long[]{0x0000020000240000L});
        public static final BitSet FOLLOW_rule__Option__Group__4_in_rule__Option__Group__311306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_3__0_in_rule__Option__Group__3__Impl11333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__4__Impl_in_rule__Option__Group__411364 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group__5_in_rule__Option__Group__411367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Option__Group__4__Impl11395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__5__Impl_in_rule__Option__Group__511426 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Option__Group__6_in_rule__Option__Group__511429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__QuestionAssignment_5_in_rule__Option__Group__5__Impl11456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group__6__Impl_in_rule__Option__Group__611486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Option__Group__6__Impl11514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__0__Impl_in_rule__Option__Group_2__011559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1_in_rule__Option__Group_2__011562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Option__Group_2__0__Impl11590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_2__1__Impl_in_rule__Option__Group_2__111621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__IdAssignment_2_1_in_rule__Option__Group_2__1__Impl11648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_3__0__Impl_in_rule__Option__Group_3__011682 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Option__Group_3__1_in_rule__Option__Group_3__011685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Option__Group_3__0__Impl11713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__Group_3__1__Impl_in_rule__Option__Group_3__111744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Option__TextAssignment_3_1_in_rule__Option__Group_3__1__Impl11771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__011805 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__011808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__EInt__Group__0__Impl11837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__111870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl11897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__NameAssignment_111935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Questionaire__ResultEmailAssignment_411966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_5_211997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_rule__Questionaire__ElementsAssignment_5_3_112028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Heading__TextAssignment_312059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Paragraph__TextAssignment_312090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__TextQuestion__MandatoryAssignment_012126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__TextQuestion__MultilineAssignment_112170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextQuestion__IdAssignment_512209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextQuestion__TitleAssignment_712240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextQuestion__DescriptionAssignment_8_112271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextQuestion__ConditionsAssignment_9_212306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextQuestion__ConditionsAssignment_9_3_112345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ChoiceQuestion__MandatoryAssignment_012385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceQuestion__IdAssignment_412424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceQuestion__TitleAssignment_612455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceQuestion__DescriptionAssignment_7_112486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MinSelectionsAssignment_8_112517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ChoiceQuestion__MaxSelectionsAssignment_9_112548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceQuestion__ConditionsAssignment_10_212583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceQuestion__ConditionsAssignment_10_3_112622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_1312657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOption_in_rule__ChoiceQuestion__OptionsAssignment_14_112688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MatrixQuestion__MandatoryAssignment_012724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__IdAssignment_412763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__TitleAssignment_612794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__DescriptionAssignment_7_112825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_8_212856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ColumnNamesAssignment_8_3_112887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_9_212918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__RowNamesAssignment_9_3_112949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__MatrixQuestion__MaxPerRowAssignment_1112980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ConditionsAssignment_12_213015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MatrixQuestion__ConditionsAssignment_12_3_113054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__CalendarQuestion__MandatoryAssignment_013094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__CalendarQuestion__YearAssignment_113138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__CalendarQuestion__MonthAssignment_213182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__CalendarQuestion__DayAssignment_313226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__CalendarQuestion__HourAssignment_413270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__CalendarQuestion__MinuteAssignment_513314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CalendarQuestion__IdAssignment_913353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CalendarQuestion__TitleAssignment_1113384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CalendarQuestion__DescriptionAssignment_12_113415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CalendarQuestion__ConditionsAssignment_13_213450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CalendarQuestion__ConditionsAssignment_13_3_113489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__IntegerQuestion__MandatoryAssignment_013529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerQuestion__IdAssignment_413568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerQuestion__TitleAssignment_613599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerQuestion__DescriptionAssignment_7_113630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MinValueAssignment_913661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__StepAssignment_1113692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerQuestion__MaxValueAssignment_1313723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerQuestion__ConditionsAssignment_14_213758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerQuestion__ConditionsAssignment_14_3_113797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__IdAssignment_2_113834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__TextAssignment_3_113865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Option__QuestionAssignment_513900 = new BitSet(new long[]{0x0000000000000002L});
    }


}