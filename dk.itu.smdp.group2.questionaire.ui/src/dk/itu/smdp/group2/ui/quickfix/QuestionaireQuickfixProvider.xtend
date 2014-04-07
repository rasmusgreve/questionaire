package dk.itu.smdp.group2.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import dk.itu.smdp.group2.validation.QuestionaireValidator

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class QuestionaireQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {

	@Fix(QuestionaireValidator::INTEGERQUESTION_STEP)
	def removeStep(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Remove step', 'Remove the step setting.', 'pencil.png') [
			context |
			val xtextDocument = context.xtextDocument
			val bad_sub_str = "step " + issue.data;
			val bad_actual_str = xtextDocument.get(issue.offset, issue.length);
			val right_str = bad_actual_str.substring(0,bad_sub_str.length);
			xtextDocument.replace(issue.offset, issue.length, right_str);
		]
	}



//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}
}
