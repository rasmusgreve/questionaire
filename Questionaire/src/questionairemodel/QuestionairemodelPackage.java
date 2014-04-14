/**
 */
package questionairemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see questionairemodel.QuestionairemodelFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionairemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionairemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/Questionaire/model/QuestionaireModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionairemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionairemodelPackage eINSTANCE = questionairemodel.impl.QuestionairemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link questionairemodel.impl.QuestionaireImpl <em>Questionaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.QuestionaireImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionaire()
	 * @generated
	 */
	int QUESTIONAIRE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONAIRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONAIRE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Result Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONAIRE__RESULT_EMAIL = 2;

	/**
	 * The number of structural features of the '<em>Questionaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONAIRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Questionaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.ElementImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.HeadingImpl <em>Heading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.HeadingImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getHeading()
	 * @generated
	 */
	int HEADING = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.ParagraphImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.QuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_BASE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.TextQuestionImpl <em>Text Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.TextQuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getTextQuestion()
	 * @generated
	 */
	int TEXT_QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUESTION__QUESTION_BASE = QUESTION__QUESTION_BASE;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUESTION__LINES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.ChoiceQuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getChoiceQuestion()
	 * @generated
	 */
	int CHOICE_QUESTION = 6;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__QUESTION_BASE = QUESTION__QUESTION_BASE;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__OPTIONS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Selections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__MIN_SELECTIONS = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Selections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION__MAX_SELECTIONS = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.OptionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.MatrixQuestionImpl <em>Matrix Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.MatrixQuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getMatrixQuestion()
	 * @generated
	 */
	int MATRIX_QUESTION = 8;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION__QUESTION_BASE = QUESTION__QUESTION_BASE;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION__COLUMN_NAMES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION__ROW_NAMES = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Per Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION__MAX_PER_ROW = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Matrix Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Matrix Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.CalendarQuestionImpl <em>Calendar Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.CalendarQuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getCalendarQuestion()
	 * @generated
	 */
	int CALENDAR_QUESTION = 9;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__QUESTION_BASE = QUESTION__QUESTION_BASE;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__YEAR = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__MONTH = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__DAY = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__HOUR = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION__MINUTE = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Calendar Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Calendar Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.IntegerQuestionImpl <em>Integer Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.IntegerQuestionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getIntegerQuestion()
	 * @generated
	 */
	int INTEGER_QUESTION = 10;

	/**
	 * The feature id for the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION__QUESTION_BASE = QUESTION__QUESTION_BASE;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION__MIN_VALUE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION__STEP = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION__MAX_VALUE = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionairemodel.impl.QuestionConditionImpl <em>Question Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.QuestionConditionImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionCondition()
	 * @generated
	 */
	int QUESTION_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CONDITION__OPTION = 0;

	/**
	 * The number of structural features of the '<em>Question Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Question Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CONDITION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link questionairemodel.impl.QuestionBaseImpl <em>Question Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionairemodel.impl.QuestionBaseImpl
	 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionBase()
	 * @generated
	 */
	int QUESTION_BASE = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE__MANDATORY = 3;

	/**
	 * The number of structural features of the '<em>Question Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Question Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_BASE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link questionairemodel.Questionaire <em>Questionaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionaire</em>'.
	 * @see questionairemodel.Questionaire
	 * @generated
	 */
	EClass getQuestionaire();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Questionaire#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see questionairemodel.Questionaire#getName()
	 * @see #getQuestionaire()
	 * @generated
	 */
	EAttribute getQuestionaire_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link questionairemodel.Questionaire#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see questionairemodel.Questionaire#getElements()
	 * @see #getQuestionaire()
	 * @generated
	 */
	EReference getQuestionaire_Elements();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Questionaire#getResultEmail <em>Result Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Email</em>'.
	 * @see questionairemodel.Questionaire#getResultEmail()
	 * @see #getQuestionaire()
	 * @generated
	 */
	EAttribute getQuestionaire_ResultEmail();

	/**
	 * Returns the meta object for class '{@link questionairemodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see questionairemodel.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link questionairemodel.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading</em>'.
	 * @see questionairemodel.Heading
	 * @generated
	 */
	EClass getHeading();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Heading#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see questionairemodel.Heading#getText()
	 * @see #getHeading()
	 * @generated
	 */
	EAttribute getHeading_Text();

	/**
	 * Returns the meta object for class '{@link questionairemodel.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see questionairemodel.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see questionairemodel.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for class '{@link questionairemodel.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see questionairemodel.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link questionairemodel.Question#getQuestionBase <em>Question Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question Base</em>'.
	 * @see questionairemodel.Question#getQuestionBase()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_QuestionBase();

	/**
	 * Returns the meta object for class '{@link questionairemodel.TextQuestion <em>Text Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Question</em>'.
	 * @see questionairemodel.TextQuestion
	 * @generated
	 */
	EClass getTextQuestion();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.TextQuestion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see questionairemodel.TextQuestion#getLines()
	 * @see #getTextQuestion()
	 * @generated
	 */
	EAttribute getTextQuestion_Lines();

	/**
	 * Returns the meta object for class '{@link questionairemodel.ChoiceQuestion <em>Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Question</em>'.
	 * @see questionairemodel.ChoiceQuestion
	 * @generated
	 */
	EClass getChoiceQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link questionairemodel.ChoiceQuestion#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see questionairemodel.ChoiceQuestion#getOptions()
	 * @see #getChoiceQuestion()
	 * @generated
	 */
	EReference getChoiceQuestion_Options();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.ChoiceQuestion#getMinSelections <em>Min Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Selections</em>'.
	 * @see questionairemodel.ChoiceQuestion#getMinSelections()
	 * @see #getChoiceQuestion()
	 * @generated
	 */
	EAttribute getChoiceQuestion_MinSelections();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.ChoiceQuestion#getMaxSelections <em>Max Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Selections</em>'.
	 * @see questionairemodel.ChoiceQuestion#getMaxSelections()
	 * @see #getChoiceQuestion()
	 * @generated
	 */
	EAttribute getChoiceQuestion_MaxSelections();

	/**
	 * Returns the meta object for class '{@link questionairemodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see questionairemodel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see questionairemodel.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.Option#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see questionairemodel.Option#getText()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Text();

	/**
	 * Returns the meta object for class '{@link questionairemodel.MatrixQuestion <em>Matrix Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Question</em>'.
	 * @see questionairemodel.MatrixQuestion
	 * @generated
	 */
	EClass getMatrixQuestion();

	/**
	 * Returns the meta object for the attribute list '{@link questionairemodel.MatrixQuestion#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see questionairemodel.MatrixQuestion#getColumnNames()
	 * @see #getMatrixQuestion()
	 * @generated
	 */
	EAttribute getMatrixQuestion_ColumnNames();

	/**
	 * Returns the meta object for the attribute list '{@link questionairemodel.MatrixQuestion#getRowNames <em>Row Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Row Names</em>'.
	 * @see questionairemodel.MatrixQuestion#getRowNames()
	 * @see #getMatrixQuestion()
	 * @generated
	 */
	EAttribute getMatrixQuestion_RowNames();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.MatrixQuestion#getMaxPerRow <em>Max Per Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Per Row</em>'.
	 * @see questionairemodel.MatrixQuestion#getMaxPerRow()
	 * @see #getMatrixQuestion()
	 * @generated
	 */
	EAttribute getMatrixQuestion_MaxPerRow();

	/**
	 * Returns the meta object for class '{@link questionairemodel.CalendarQuestion <em>Calendar Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Question</em>'.
	 * @see questionairemodel.CalendarQuestion
	 * @generated
	 */
	EClass getCalendarQuestion();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.CalendarQuestion#isYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see questionairemodel.CalendarQuestion#isYear()
	 * @see #getCalendarQuestion()
	 * @generated
	 */
	EAttribute getCalendarQuestion_Year();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.CalendarQuestion#isMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see questionairemodel.CalendarQuestion#isMonth()
	 * @see #getCalendarQuestion()
	 * @generated
	 */
	EAttribute getCalendarQuestion_Month();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.CalendarQuestion#isDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see questionairemodel.CalendarQuestion#isDay()
	 * @see #getCalendarQuestion()
	 * @generated
	 */
	EAttribute getCalendarQuestion_Day();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.CalendarQuestion#isHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see questionairemodel.CalendarQuestion#isHour()
	 * @see #getCalendarQuestion()
	 * @generated
	 */
	EAttribute getCalendarQuestion_Hour();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.CalendarQuestion#isMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see questionairemodel.CalendarQuestion#isMinute()
	 * @see #getCalendarQuestion()
	 * @generated
	 */
	EAttribute getCalendarQuestion_Minute();

	/**
	 * Returns the meta object for class '{@link questionairemodel.IntegerQuestion <em>Integer Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Question</em>'.
	 * @see questionairemodel.IntegerQuestion
	 * @generated
	 */
	EClass getIntegerQuestion();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.IntegerQuestion#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see questionairemodel.IntegerQuestion#getMinValue()
	 * @see #getIntegerQuestion()
	 * @generated
	 */
	EAttribute getIntegerQuestion_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.IntegerQuestion#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see questionairemodel.IntegerQuestion#getStep()
	 * @see #getIntegerQuestion()
	 * @generated
	 */
	EAttribute getIntegerQuestion_Step();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.IntegerQuestion#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see questionairemodel.IntegerQuestion#getMaxValue()
	 * @see #getIntegerQuestion()
	 * @generated
	 */
	EAttribute getIntegerQuestion_MaxValue();

	/**
	 * Returns the meta object for class '{@link questionairemodel.QuestionCondition <em>Question Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Condition</em>'.
	 * @see questionairemodel.QuestionCondition
	 * @generated
	 */
	EClass getQuestionCondition();

	/**
	 * Returns the meta object for the reference list '{@link questionairemodel.QuestionCondition#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Option</em>'.
	 * @see questionairemodel.QuestionCondition#getOption()
	 * @see #getQuestionCondition()
	 * @generated
	 */
	EReference getQuestionCondition_Option();

	/**
	 * Returns the meta object for class '{@link questionairemodel.QuestionBase <em>Question Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Base</em>'.
	 * @see questionairemodel.QuestionBase
	 * @generated
	 */
	EClass getQuestionBase();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.QuestionBase#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see questionairemodel.QuestionBase#getTitle()
	 * @see #getQuestionBase()
	 * @generated
	 */
	EAttribute getQuestionBase_Title();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.QuestionBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see questionairemodel.QuestionBase#getDescription()
	 * @see #getQuestionBase()
	 * @generated
	 */
	EAttribute getQuestionBase_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link questionairemodel.QuestionBase#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see questionairemodel.QuestionBase#getConditions()
	 * @see #getQuestionBase()
	 * @generated
	 */
	EReference getQuestionBase_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link questionairemodel.QuestionBase#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see questionairemodel.QuestionBase#isMandatory()
	 * @see #getQuestionBase()
	 * @generated
	 */
	EAttribute getQuestionBase_Mandatory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionairemodelFactory getQuestionairemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link questionairemodel.impl.QuestionaireImpl <em>Questionaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.QuestionaireImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionaire()
		 * @generated
		 */
		EClass QUESTIONAIRE = eINSTANCE.getQuestionaire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONAIRE__NAME = eINSTANCE.getQuestionaire_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONAIRE__ELEMENTS = eINSTANCE.getQuestionaire_Elements();

		/**
		 * The meta object literal for the '<em><b>Result Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTIONAIRE__RESULT_EMAIL = eINSTANCE.getQuestionaire_ResultEmail();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.ElementImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.HeadingImpl <em>Heading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.HeadingImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getHeading()
		 * @generated
		 */
		EClass HEADING = eINSTANCE.getHeading();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING__TEXT = eINSTANCE.getHeading_Text();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.ParagraphImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.QuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUESTION_BASE = eINSTANCE.getQuestion_QuestionBase();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.TextQuestionImpl <em>Text Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.TextQuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getTextQuestion()
		 * @generated
		 */
		EClass TEXT_QUESTION = eINSTANCE.getTextQuestion();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_QUESTION__LINES = eINSTANCE.getTextQuestion_Lines();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.ChoiceQuestionImpl <em>Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.ChoiceQuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getChoiceQuestion()
		 * @generated
		 */
		EClass CHOICE_QUESTION = eINSTANCE.getChoiceQuestion();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_QUESTION__OPTIONS = eINSTANCE.getChoiceQuestion_Options();

		/**
		 * The meta object literal for the '<em><b>Min Selections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_QUESTION__MIN_SELECTIONS = eINSTANCE.getChoiceQuestion_MinSelections();

		/**
		 * The meta object literal for the '<em><b>Max Selections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_QUESTION__MAX_SELECTIONS = eINSTANCE.getChoiceQuestion_MaxSelections();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.OptionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TEXT = eINSTANCE.getOption_Text();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.MatrixQuestionImpl <em>Matrix Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.MatrixQuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getMatrixQuestion()
		 * @generated
		 */
		EClass MATRIX_QUESTION = eINSTANCE.getMatrixQuestion();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_QUESTION__COLUMN_NAMES = eINSTANCE.getMatrixQuestion_ColumnNames();

		/**
		 * The meta object literal for the '<em><b>Row Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_QUESTION__ROW_NAMES = eINSTANCE.getMatrixQuestion_RowNames();

		/**
		 * The meta object literal for the '<em><b>Max Per Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_QUESTION__MAX_PER_ROW = eINSTANCE.getMatrixQuestion_MaxPerRow();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.CalendarQuestionImpl <em>Calendar Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.CalendarQuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getCalendarQuestion()
		 * @generated
		 */
		EClass CALENDAR_QUESTION = eINSTANCE.getCalendarQuestion();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_QUESTION__YEAR = eINSTANCE.getCalendarQuestion_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_QUESTION__MONTH = eINSTANCE.getCalendarQuestion_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_QUESTION__DAY = eINSTANCE.getCalendarQuestion_Day();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_QUESTION__HOUR = eINSTANCE.getCalendarQuestion_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_QUESTION__MINUTE = eINSTANCE.getCalendarQuestion_Minute();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.IntegerQuestionImpl <em>Integer Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.IntegerQuestionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getIntegerQuestion()
		 * @generated
		 */
		EClass INTEGER_QUESTION = eINSTANCE.getIntegerQuestion();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_QUESTION__MIN_VALUE = eINSTANCE.getIntegerQuestion_MinValue();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_QUESTION__STEP = eINSTANCE.getIntegerQuestion_Step();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_QUESTION__MAX_VALUE = eINSTANCE.getIntegerQuestion_MaxValue();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.QuestionConditionImpl <em>Question Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.QuestionConditionImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionCondition()
		 * @generated
		 */
		EClass QUESTION_CONDITION = eINSTANCE.getQuestionCondition();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_CONDITION__OPTION = eINSTANCE.getQuestionCondition_Option();

		/**
		 * The meta object literal for the '{@link questionairemodel.impl.QuestionBaseImpl <em>Question Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionairemodel.impl.QuestionBaseImpl
		 * @see questionairemodel.impl.QuestionairemodelPackageImpl#getQuestionBase()
		 * @generated
		 */
		EClass QUESTION_BASE = eINSTANCE.getQuestionBase();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_BASE__TITLE = eINSTANCE.getQuestionBase_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_BASE__DESCRIPTION = eINSTANCE.getQuestionBase_Description();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_BASE__CONDITIONS = eINSTANCE.getQuestionBase_Conditions();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_BASE__MANDATORY = eINSTANCE.getQuestionBase_Mandatory();

	}

} //QuestionairemodelPackage
