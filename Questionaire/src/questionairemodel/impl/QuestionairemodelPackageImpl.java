/**
 */
package questionairemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import questionairemodel.CalendarQuestion;
import questionairemodel.ChoiceQuestion;
import questionairemodel.Element;
import questionairemodel.Heading;
import questionairemodel.IntegerQuestion;
import questionairemodel.MatrixQuestion;
import questionairemodel.Option;
import questionairemodel.Paragraph;
import questionairemodel.Question;
import questionairemodel.QuestionCondition;
import questionairemodel.Questionaire;
import questionairemodel.QuestionairemodelFactory;
import questionairemodel.QuestionairemodelPackage;
import questionairemodel.TextQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionairemodelPackageImpl extends EPackageImpl implements QuestionairemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionConditionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see questionairemodel.QuestionairemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionairemodelPackageImpl() {
		super(eNS_URI, QuestionairemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuestionairemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionairemodelPackage init() {
		if (isInited) return (QuestionairemodelPackage)EPackage.Registry.INSTANCE.getEPackage(QuestionairemodelPackage.eNS_URI);

		// Obtain or create and register package
		QuestionairemodelPackageImpl theQuestionairemodelPackage = (QuestionairemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionairemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionairemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuestionairemodelPackage.createPackageContents();

		// Initialize created meta-data
		theQuestionairemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionairemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionairemodelPackage.eNS_URI, theQuestionairemodelPackage);
		return theQuestionairemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionaire() {
		return questionaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionaire_Name() {
		return (EAttribute)questionaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionaire_Elements() {
		return (EReference)questionaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionaire_ResultEmail() {
		return (EAttribute)questionaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeading() {
		return headingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeading_Text() {
		return (EAttribute)headingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Text() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Id() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Title() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Description() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Mandatory() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Conditions() {
		return (EReference)questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextQuestion() {
		return textQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextQuestion_Multiline() {
		return (EAttribute)textQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceQuestion() {
		return choiceQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoiceQuestion_Options() {
		return (EReference)choiceQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoiceQuestion_MinSelections() {
		return (EAttribute)choiceQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoiceQuestion_MaxSelections() {
		return (EAttribute)choiceQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Id() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Text() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Question() {
		return (EReference)optionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrixQuestion() {
		return matrixQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixQuestion_ColumnNames() {
		return (EAttribute)matrixQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixQuestion_RowNames() {
		return (EAttribute)matrixQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrixQuestion_MaxPerRow() {
		return (EAttribute)matrixQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarQuestion() {
		return calendarQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarQuestion_Year() {
		return (EAttribute)calendarQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarQuestion_Month() {
		return (EAttribute)calendarQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarQuestion_Day() {
		return (EAttribute)calendarQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarQuestion_Hour() {
		return (EAttribute)calendarQuestionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarQuestion_Minute() {
		return (EAttribute)calendarQuestionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerQuestion() {
		return integerQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerQuestion_MinValue() {
		return (EAttribute)integerQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerQuestion_Step() {
		return (EAttribute)integerQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerQuestion_MaxValue() {
		return (EAttribute)integerQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionCondition() {
		return questionConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionCondition_Option() {
		return (EReference)questionConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionairemodelFactory getQuestionairemodelFactory() {
		return (QuestionairemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		questionaireEClass = createEClass(QUESTIONAIRE);
		createEAttribute(questionaireEClass, QUESTIONAIRE__NAME);
		createEReference(questionaireEClass, QUESTIONAIRE__ELEMENTS);
		createEAttribute(questionaireEClass, QUESTIONAIRE__RESULT_EMAIL);

		elementEClass = createEClass(ELEMENT);

		headingEClass = createEClass(HEADING);
		createEAttribute(headingEClass, HEADING__TEXT);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__TEXT);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__ID);
		createEAttribute(questionEClass, QUESTION__TITLE);
		createEAttribute(questionEClass, QUESTION__DESCRIPTION);
		createEAttribute(questionEClass, QUESTION__MANDATORY);
		createEReference(questionEClass, QUESTION__CONDITIONS);

		textQuestionEClass = createEClass(TEXT_QUESTION);
		createEAttribute(textQuestionEClass, TEXT_QUESTION__MULTILINE);

		choiceQuestionEClass = createEClass(CHOICE_QUESTION);
		createEReference(choiceQuestionEClass, CHOICE_QUESTION__OPTIONS);
		createEAttribute(choiceQuestionEClass, CHOICE_QUESTION__MIN_SELECTIONS);
		createEAttribute(choiceQuestionEClass, CHOICE_QUESTION__MAX_SELECTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__ID);
		createEAttribute(optionEClass, OPTION__TEXT);
		createEReference(optionEClass, OPTION__QUESTION);

		matrixQuestionEClass = createEClass(MATRIX_QUESTION);
		createEAttribute(matrixQuestionEClass, MATRIX_QUESTION__COLUMN_NAMES);
		createEAttribute(matrixQuestionEClass, MATRIX_QUESTION__ROW_NAMES);
		createEAttribute(matrixQuestionEClass, MATRIX_QUESTION__MAX_PER_ROW);

		calendarQuestionEClass = createEClass(CALENDAR_QUESTION);
		createEAttribute(calendarQuestionEClass, CALENDAR_QUESTION__YEAR);
		createEAttribute(calendarQuestionEClass, CALENDAR_QUESTION__MONTH);
		createEAttribute(calendarQuestionEClass, CALENDAR_QUESTION__DAY);
		createEAttribute(calendarQuestionEClass, CALENDAR_QUESTION__HOUR);
		createEAttribute(calendarQuestionEClass, CALENDAR_QUESTION__MINUTE);

		integerQuestionEClass = createEClass(INTEGER_QUESTION);
		createEAttribute(integerQuestionEClass, INTEGER_QUESTION__MIN_VALUE);
		createEAttribute(integerQuestionEClass, INTEGER_QUESTION__STEP);
		createEAttribute(integerQuestionEClass, INTEGER_QUESTION__MAX_VALUE);

		questionConditionEClass = createEClass(QUESTION_CONDITION);
		createEReference(questionConditionEClass, QUESTION_CONDITION__OPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		headingEClass.getESuperTypes().add(this.getElement());
		paragraphEClass.getESuperTypes().add(this.getElement());
		questionEClass.getESuperTypes().add(this.getElement());
		textQuestionEClass.getESuperTypes().add(this.getQuestion());
		choiceQuestionEClass.getESuperTypes().add(this.getQuestion());
		matrixQuestionEClass.getESuperTypes().add(this.getQuestion());
		calendarQuestionEClass.getESuperTypes().add(this.getQuestion());
		integerQuestionEClass.getESuperTypes().add(this.getQuestion());

		// Initialize classes, features, and operations; add parameters
		initEClass(questionaireEClass, Questionaire.class, "Questionaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionaire_Name(), ecorePackage.getEString(), "name", null, 1, 1, Questionaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionaire_Elements(), this.getElement(), null, "elements", null, 0, -1, Questionaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionaire_ResultEmail(), ecorePackage.getEString(), "resultEmail", null, 1, 1, Questionaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headingEClass, Heading.class, "Heading", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeading_Text(), ecorePackage.getEString(), "text", null, 1, 1, Heading.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Text(), ecorePackage.getEString(), "text", null, 1, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Id(), ecorePackage.getEString(), "id", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Title(), ecorePackage.getEString(), "title", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Description(), ecorePackage.getEString(), "description", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Conditions(), this.getQuestionCondition(), null, "conditions", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textQuestionEClass, TextQuestion.class, "TextQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextQuestion_Multiline(), ecorePackage.getEBoolean(), "multiline", null, 1, 1, TextQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceQuestionEClass, ChoiceQuestion.class, "ChoiceQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoiceQuestion_Options(), this.getOption(), null, "options", null, 1, -1, ChoiceQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoiceQuestion_MinSelections(), ecorePackage.getEInt(), "minSelections", null, 0, 1, ChoiceQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoiceQuestion_MaxSelections(), ecorePackage.getEInt(), "maxSelections", null, 0, 1, ChoiceQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Id(), ecorePackage.getEString(), "id", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Text(), ecorePackage.getEString(), "text", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Question(), this.getChoiceQuestion(), null, "question", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixQuestionEClass, MatrixQuestion.class, "MatrixQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrixQuestion_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, MatrixQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixQuestion_RowNames(), ecorePackage.getEString(), "rowNames", null, 0, -1, MatrixQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrixQuestion_MaxPerRow(), ecorePackage.getEInt(), "maxPerRow", null, 1, 1, MatrixQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calendarQuestionEClass, CalendarQuestion.class, "CalendarQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendarQuestion_Year(), ecorePackage.getEBoolean(), "year", null, 1, 1, CalendarQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarQuestion_Month(), ecorePackage.getEBoolean(), "month", null, 1, 1, CalendarQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarQuestion_Day(), ecorePackage.getEBoolean(), "day", null, 1, 1, CalendarQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarQuestion_Hour(), ecorePackage.getEBoolean(), "hour", null, 1, 1, CalendarQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarQuestion_Minute(), ecorePackage.getEBoolean(), "minute", null, 1, 1, CalendarQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerQuestionEClass, IntegerQuestion.class, "IntegerQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerQuestion_MinValue(), ecorePackage.getEInt(), "minValue", null, 1, 1, IntegerQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerQuestion_Step(), ecorePackage.getEInt(), "step", null, 1, 1, IntegerQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerQuestion_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 1, 1, IntegerQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionConditionEClass, QuestionCondition.class, "QuestionCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionCondition_Option(), this.getOption(), null, "option", null, 1, -1, QuestionCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QuestionairemodelPackageImpl
