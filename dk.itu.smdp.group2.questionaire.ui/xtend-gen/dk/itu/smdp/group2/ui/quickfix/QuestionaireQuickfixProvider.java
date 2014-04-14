package dk.itu.smdp.group2.ui.quickfix;

import dk.itu.smdp.group2.validation.QuestionaireValidator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import questionairemodel.IntegerQuestion;
import questionairemodel.Option;
import questionairemodel.TextQuestion;

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
    acceptor.accept(issue, "Remove the step setting", "Remove the step setting from the document", null, _function);
  }
  
  @Fix(QuestionaireValidator.INTEGERQUESTION_MINMAX)
  public void reduceMin(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _get = _data[0];
    boolean _equals = _get.equals("1");
    boolean _not = (!_equals);
    if (_not) {
      final ISemanticModification _function = new ISemanticModification() {
        public void apply(final EObject elem, final IModificationContext context) throws Exception {
          final IntegerQuestion iq = ((IntegerQuestion) elem);
          int _maxValue = iq.getMaxValue();
          int _minus = (_maxValue - 1);
          iq.setMinValue(_minus);
        }
      };
      acceptor.accept(issue, "Reduce the minimum value", "Reduce the minimum value to be below the maximum value", null, _function);
    }
  }
  
  @Fix(QuestionaireValidator.INTEGERQUESTION_MINMAX)
  public void increaseMax(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final IntegerQuestion iq = ((IntegerQuestion) elem);
        int _minValue = iq.getMinValue();
        int _plus = (_minValue + 1);
        iq.setMaxValue(_plus);
      }
    };
    acceptor.accept(issue, "Increase the maximum value", "Increase the maximum value to be above the minimum", null, _function);
  }
  
  @Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
  public void adjustStep(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final IntegerQuestion iq = ((IntegerQuestion) elem);
        boolean continue_ = true;
        int _maxValue = iq.getMaxValue();
        int _minValue = iq.getMinValue();
        int _minus = (_maxValue - _minValue);
        int _step = iq.getStep();
        int _plus = (_minus + _step);
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _plus, true);
        for (final Integer i : _doubleDotLessThan) {
          if (continue_) {
            int _minValue_1 = iq.getMinValue();
            int _maxValue_1 = iq.getMaxValue();
            int _step_1 = iq.getStep();
            int _plus_1 = (_step_1 + (i).intValue());
            boolean _validStep = QuestionaireQuickfixProvider.this.validStep(_minValue_1, _maxValue_1, _plus_1);
            if (_validStep) {
              int _step_2 = iq.getStep();
              int _plus_2 = (_step_2 + (i).intValue());
              ((IntegerQuestion) elem).setStep(_plus_2);
              continue_ = false;
            }
            boolean _and = false;
            if (!continue_) {
              _and = false;
            } else {
              int _minValue_2 = iq.getMinValue();
              int _maxValue_2 = iq.getMaxValue();
              int _step_3 = iq.getStep();
              int _minus_1 = (_step_3 - (i).intValue());
              boolean _validStep_1 = QuestionaireQuickfixProvider.this.validStep(_minValue_2, _maxValue_2, _minus_1);
              _and = (continue_ && _validStep_1);
            }
            if (_and) {
              int _step_4 = iq.getStep();
              int _minus_2 = (_step_4 - (i).intValue());
              ((IntegerQuestion) elem).setStep(_minus_2);
              continue_ = false;
            }
          }
        }
      }
    };
    acceptor.accept(issue, "Change step to nearest good value", "Change the step value to the closest value that allows selection of both the minimum and maximum value", null, _function);
  }
  
  @Fix(QuestionaireValidator.INTEGERQUESTION_STEP)
  public void adjustMaxForStep(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final IntegerQuestion iq = ((IntegerQuestion) elem);
        int _step = iq.getStep();
        int _maxValue = iq.getMaxValue();
        int _minValue = iq.getMinValue();
        int _minus = (_maxValue - _minValue);
        int _step_1 = iq.getStep();
        int _modulo = (_minus % _step_1);
        final int incr = (_step - _modulo);
        int _maxValue_1 = iq.getMaxValue();
        int _plus = (_maxValue_1 + incr);
        iq.setMaxValue(_plus);
      }
    };
    acceptor.accept(issue, "Increase maximum to match step", "Change the max value such that the chosen step value fits", null, _function);
  }
  
  @Fix(QuestionaireValidator.TEXTQUESTION_SHORTLONG)
  public void insertDefaultLength(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final TextQuestion tq = ((TextQuestion) elem);
        tq.setLines(1);
      }
    };
    acceptor.accept(issue, "Set length to 1", "Set the length of the text question answer 1 meaning one line of text", null, _function);
  }
  
  @Fix(QuestionaireValidator.TEXTQUESTION_SHORTLONG)
  public void insertDefaultLongLength(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final TextQuestion tq = ((TextQuestion) elem);
        tq.setLines(5);
      }
    };
    acceptor.accept(issue, "Set length to 5", "Set the length of the text question answer 5 meaning five lines of text", null, _function);
  }
  
  @Fix(QuestionaireValidator.OPTION_NAME_UNIQUE)
  public void makeOptionNameUnique(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject elem, final IModificationContext context) throws Exception {
        final Option op = ((Option) elem);
        int id = 1;
        String[] _data = issue.getData();
        String _name = op.getName();
        String _nameId = QuestionaireQuickfixProvider.this.nameId(_name, id);
        boolean _contains = ((List<String>)Conversions.doWrapArray(_data)).contains(_nameId);
        boolean _while = _contains;
        while (_while) {
          int _plus = (id + 1);
          id = _plus;
          String[] _data_1 = issue.getData();
          String _name_1 = op.getName();
          String _nameId_1 = QuestionaireQuickfixProvider.this.nameId(_name_1, id);
          boolean _contains_1 = ((List<String>)Conversions.doWrapArray(_data_1)).contains(_nameId_1);
          _while = _contains_1;
        }
        String _name_1 = op.getName();
        String _nameId_1 = QuestionaireQuickfixProvider.this.nameId(_name_1, id);
        op.setName(_nameId_1);
      }
    };
    acceptor.accept(issue, "Make the name of this option unique", "Make the name of this option unique by appending a number", null, _function);
  }
  
  public String nameId(final String name, final int id) {
    String _xifexpression = null;
    boolean _startsWith = name.startsWith("\"");
    if (_startsWith) {
      int _length = name.length();
      int _minus = (_length - 1);
      String _substring = name.substring(0, _minus);
      String _plus = (_substring + Integer.valueOf(id));
      String _plus_1 = (_plus + "\"");
      _xifexpression = _plus_1;
    } else {
      String _plus_2 = (name + Integer.valueOf(id));
      _xifexpression = _plus_2;
    }
    return _xifexpression;
  }
  
  public boolean validStep(final int min, final int max, final int step) {
    boolean _xifexpression = false;
    boolean _lessThan = (step < 1);
    if (_lessThan) {
      _xifexpression = false;
    } else {
      int _minus = (max - min);
      int _modulo = (_minus % step);
      boolean _equals = (_modulo == 0);
      _xifexpression = _equals;
    }
    return _xifexpression;
  }
}
