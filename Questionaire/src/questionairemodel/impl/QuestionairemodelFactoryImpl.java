/**
 */
package questionairemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questionairemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionairemodelFactoryImpl extends EFactoryImpl implements QuestionairemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionairemodelFactory init() {
		try {
			QuestionairemodelFactory theQuestionairemodelFactory = (QuestionairemodelFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionairemodelPackage.eNS_URI);
			if (theQuestionairemodelFactory != null) {
				return theQuestionairemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionairemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionairemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionairemodelPackage.QUESTIONAIRE: return createQuestionaire();
			case QuestionairemodelPackage.HEADING: return createHeading();
			case QuestionairemodelPackage.PARAGRAPH: return createParagraph();
			case QuestionairemodelPackage.TEXT_QUESTION: return createTextQuestion();
			case QuestionairemodelPackage.CHOICE_QUESTION: return createChoiceQuestion();
			case QuestionairemodelPackage.OPTION: return createOption();
			case QuestionairemodelPackage.MATRIX_QUESTION: return createMatrixQuestion();
			case QuestionairemodelPackage.CALENDAR_QUESTION: return createCalendarQuestion();
			case QuestionairemodelPackage.INTEGER_QUESTION: return createIntegerQuestion();
			case QuestionairemodelPackage.QUESTION_CONDITION: return createQuestionCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionaire createQuestionaire() {
		QuestionaireImpl questionaire = new QuestionaireImpl();
		return questionaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heading createHeading() {
		HeadingImpl heading = new HeadingImpl();
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextQuestion createTextQuestion() {
		TextQuestionImpl textQuestion = new TextQuestionImpl();
		return textQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceQuestion createChoiceQuestion() {
		ChoiceQuestionImpl choiceQuestion = new ChoiceQuestionImpl();
		return choiceQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixQuestion createMatrixQuestion() {
		MatrixQuestionImpl matrixQuestion = new MatrixQuestionImpl();
		return matrixQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarQuestion createCalendarQuestion() {
		CalendarQuestionImpl calendarQuestion = new CalendarQuestionImpl();
		return calendarQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerQuestion createIntegerQuestion() {
		IntegerQuestionImpl integerQuestion = new IntegerQuestionImpl();
		return integerQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionCondition createQuestionCondition() {
		QuestionConditionImpl questionCondition = new QuestionConditionImpl();
		return questionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionairemodelPackage getQuestionairemodelPackage() {
		return (QuestionairemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionairemodelPackage getPackage() {
		return QuestionairemodelPackage.eINSTANCE;
	}

} //QuestionairemodelFactoryImpl
