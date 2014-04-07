package dk.itu.smdp.group2.ui.quickfix;

import dk.itu.smdp.group2.validation.QuestionaireValidator;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Custom quickfixes.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
@SuppressWarnings("all")
public class QuestionaireQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
  public void removeStep(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = new IModification() {
      public void apply(final IModificationContext context) throws Exception {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        String[] _data = issue.getData();
        final String bad_sub_str = ("step " + _data);
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        final String bad_actual_str = xtextDocument.get((_offset).intValue(), (_length).intValue());
        int _length_1 = bad_sub_str.length();
        final String right_str = bad_actual_str.substring(0, _length_1);
        Integer _offset_1 = issue.getOffset();
        Integer _length_2 = issue.getLength();
        xtextDocument.replace((_offset_1).intValue(), (_length_2).intValue(), right_str);
      }
    };
    acceptor.accept(issue, "Remove step", "Remove the step setting.", "pencil.png", _function);
  }
}
