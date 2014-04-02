/**
 */
package questionairemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see questionairemodel.QuestionairemodelPackage
 * @generated
 */
public interface QuestionairemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionairemodelFactory eINSTANCE = questionairemodel.impl.QuestionairemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Questionaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Questionaire</em>'.
	 * @generated
	 */
	Questionaire createQuestionaire();

	/**
	 * Returns a new object of class '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading</em>'.
	 * @generated
	 */
	Heading createHeading();

	/**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
	Paragraph createParagraph();

	/**
	 * Returns a new object of class '<em>Text Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Question</em>'.
	 * @generated
	 */
	TextQuestion createTextQuestion();

	/**
	 * Returns a new object of class '<em>Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Question</em>'.
	 * @generated
	 */
	ChoiceQuestion createChoiceQuestion();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Matrix Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix Question</em>'.
	 * @generated
	 */
	MatrixQuestion createMatrixQuestion();

	/**
	 * Returns a new object of class '<em>Calendar Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Question</em>'.
	 * @generated
	 */
	CalendarQuestion createCalendarQuestion();

	/**
	 * Returns a new object of class '<em>Integer Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Question</em>'.
	 * @generated
	 */
	IntegerQuestion createIntegerQuestion();

	/**
	 * Returns a new object of class '<em>Question Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Condition</em>'.
	 * @generated
	 */
	QuestionCondition createQuestionCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuestionairemodelPackage getQuestionairemodelPackage();

} //QuestionairemodelFactory
