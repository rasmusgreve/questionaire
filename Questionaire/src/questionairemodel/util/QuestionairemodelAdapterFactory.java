/**
 */
package questionairemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import questionairemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see questionairemodel.QuestionairemodelPackage
 * @generated
 */
public class QuestionairemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionairemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionairemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuestionairemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionairemodelSwitch<Adapter> modelSwitch =
		new QuestionairemodelSwitch<Adapter>() {
			@Override
			public Adapter caseQuestionaire(Questionaire object) {
				return createQuestionaireAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseHeading(Heading object) {
				return createHeadingAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseTextQuestion(TextQuestion object) {
				return createTextQuestionAdapter();
			}
			@Override
			public Adapter caseChoiceQuestion(ChoiceQuestion object) {
				return createChoiceQuestionAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseMatrixQuestion(MatrixQuestion object) {
				return createMatrixQuestionAdapter();
			}
			@Override
			public Adapter caseCalendarQuestion(CalendarQuestion object) {
				return createCalendarQuestionAdapter();
			}
			@Override
			public Adapter caseIntegerQuestion(IntegerQuestion object) {
				return createIntegerQuestionAdapter();
			}
			@Override
			public Adapter caseQuestionCondition(QuestionCondition object) {
				return createQuestionConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Questionaire <em>Questionaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Questionaire
	 * @generated
	 */
	public Adapter createQuestionaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Heading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Heading
	 * @generated
	 */
	public Adapter createHeadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.TextQuestion <em>Text Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.TextQuestion
	 * @generated
	 */
	public Adapter createTextQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.ChoiceQuestion <em>Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.ChoiceQuestion
	 * @generated
	 */
	public Adapter createChoiceQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.MatrixQuestion <em>Matrix Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.MatrixQuestion
	 * @generated
	 */
	public Adapter createMatrixQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.CalendarQuestion <em>Calendar Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.CalendarQuestion
	 * @generated
	 */
	public Adapter createCalendarQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.IntegerQuestion <em>Integer Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.IntegerQuestion
	 * @generated
	 */
	public Adapter createIntegerQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link questionairemodel.QuestionCondition <em>Question Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see questionairemodel.QuestionCondition
	 * @generated
	 */
	public Adapter createQuestionConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuestionairemodelAdapterFactory
