package dk.itu.smdp.group2.serializer;

import com.google.inject.Inject;
import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractQuestionaireSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QuestionaireGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CalendarQuestion_CommaKeyword_2_1_q;
	protected AbstractElementAlias match_CalendarQuestion_CommaKeyword_2_3_q;
	protected AbstractElementAlias match_CalendarQuestion_CommaKeyword_2_5_q;
	protected AbstractElementAlias match_CalendarQuestion_CommaKeyword_2_7_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QuestionaireGrammarAccess) access;
		match_CalendarQuestion_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_1());
		match_CalendarQuestion_CommaKeyword_2_3_q = new TokenAlias(false, true, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_3());
		match_CalendarQuestion_CommaKeyword_2_5_q = new TokenAlias(false, true, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_5());
		match_CalendarQuestion_CommaKeyword_2_7_q = new TokenAlias(false, true, grammarAccess.getCalendarQuestionAccess().getCommaKeyword_2_7());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_CalendarQuestion_CommaKeyword_2_1_q.equals(syntax))
				emit_CalendarQuestion_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CalendarQuestion_CommaKeyword_2_3_q.equals(syntax))
				emit_CalendarQuestion_CommaKeyword_2_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CalendarQuestion_CommaKeyword_2_5_q.equals(syntax))
				emit_CalendarQuestion_CommaKeyword_2_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CalendarQuestion_CommaKeyword_2_7_q.equals(syntax))
				emit_CalendarQuestion_CommaKeyword_2_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_CalendarQuestion_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_CalendarQuestion_CommaKeyword_2_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_CalendarQuestion_CommaKeyword_2_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_CalendarQuestion_CommaKeyword_2_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
