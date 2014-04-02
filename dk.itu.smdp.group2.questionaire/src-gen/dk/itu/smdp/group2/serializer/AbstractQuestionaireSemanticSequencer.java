package dk.itu.smdp.group2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.group2.services.QuestionaireGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import questionairemodel.CalendarQuestion;
import questionairemodel.ChoiceQuestion;
import questionairemodel.Heading;
import questionairemodel.IntegerQuestion;
import questionairemodel.MatrixQuestion;
import questionairemodel.Option;
import questionairemodel.Paragraph;
import questionairemodel.QuestionBase;
import questionairemodel.QuestionCondition;
import questionairemodel.Questionaire;
import questionairemodel.QuestionairemodelPackage;
import questionairemodel.TextQuestion;

@SuppressWarnings("all")
public abstract class AbstractQuestionaireSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuestionaireGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuestionairemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuestionairemodelPackage.CALENDAR_QUESTION:
				if(context == grammarAccess.getCalendarQuestionRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_CalendarQuestion(context, (CalendarQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.CHOICE_QUESTION:
				if(context == grammarAccess.getChoiceQuestionRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_ChoiceQuestion(context, (ChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.HEADING:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getHeadingRule()) {
					sequence_Heading(context, (Heading) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.INTEGER_QUESTION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getIntegerQuestionRule()) {
					sequence_IntegerQuestion(context, (IntegerQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.MATRIX_QUESTION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMatrixQuestionRule()) {
					sequence_MatrixQuestion(context, (MatrixQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.PARAGRAPH:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getParagraphRule()) {
					sequence_Paragraph(context, (Paragraph) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.QUESTION_BASE:
				if(context == grammarAccess.getQuestionBaseRule()) {
					sequence_QuestionBase(context, (QuestionBase) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.QUESTION_CONDITION:
				if(context == grammarAccess.getQuestionConditionRule()) {
					sequence_QuestionCondition(context, (QuestionCondition) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.QUESTIONAIRE:
				if(context == grammarAccess.getQuestionaireRule()) {
					sequence_Questionaire(context, (Questionaire) semanticObject); 
					return; 
				}
				else break;
			case QuestionairemodelPackage.TEXT_QUESTION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTextQuestionRule()) {
					sequence_TextQuestion(context, (TextQuestion) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         questionBase=QuestionBase 
	 *         year?='year'? 
	 *         month?='month'? 
	 *         day?='day'? 
	 *         hour?='hour'? 
	 *         minute?='minute'?
	 *     )
	 */
	protected void sequence_CalendarQuestion(EObject context, CalendarQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (questionBase=QuestionBase (minSelections=EInt | (minSelections=EInt maxSelections=EInt)) options+=Option+)
	 */
	protected void sequence_ChoiceQuestion(EObject context, ChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=EString
	 */
	protected void sequence_Heading(EObject context, Heading semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionairemodelPackage.Literals.HEADING__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionairemodelPackage.Literals.HEADING__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeadingAccess().getTextEStringParserRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (questionBase=QuestionBase minValue=EInt maxValue=EInt step=EInt?)
	 */
	protected void sequence_IntegerQuestion(EObject context, IntegerQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (questionBase=QuestionBase maxPerRow=EInt (columnNames+=EString columnNames+=EString*)? rowNames+=EString+)
	 */
	protected void sequence_MatrixQuestion(EObject context, MatrixQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text=EString name=EString?)
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=EString
	 */
	protected void sequence_Paragraph(EObject context, Paragraph semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionairemodelPackage.Literals.PARAGRAPH__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionairemodelPackage.Literals.PARAGRAPH__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString mandatory?='*'? description=EString? conditions+=QuestionCondition*)
	 */
	protected void sequence_QuestionBase(EObject context, QuestionBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (option+=[Option|EString] option+=[Option|EString]*)
	 */
	protected void sequence_QuestionCondition(EObject context, QuestionCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString resultEmail=EString (elements+=Element elements+=Element*)?)
	 */
	protected void sequence_Questionaire(EObject context, Questionaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (questionBase=QuestionBase multiline?='long')
	 */
	protected void sequence_TextQuestion(EObject context, TextQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionairemodelPackage.Literals.QUESTION__QUESTION_BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionairemodelPackage.Literals.QUESTION__QUESTION_BASE));
			if(transientValues.isValueTransient(semanticObject, QuestionairemodelPackage.Literals.TEXT_QUESTION__MULTILINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionairemodelPackage.Literals.TEXT_QUESTION__MULTILINE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextQuestionAccess().getQuestionBaseQuestionBaseParserRuleCall_0_0(), semanticObject.getQuestionBase());
		feeder.accept(grammarAccess.getTextQuestionAccess().getMultilineLongKeyword_2_0(), semanticObject.isMultiline());
		feeder.finish();
	}
}
