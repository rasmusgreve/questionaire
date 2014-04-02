/**
 */
package questionairemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.QuestionCondition#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getQuestionCondition()
 * @model
 * @generated
 */
public interface QuestionCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference list.
	 * The list contents are of type {@link questionairemodel.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference list.
	 * @see questionairemodel.QuestionairemodelPackage#getQuestionCondition_Option()
	 * @model required="true"
	 * @generated
	 */
	EList<Option> getOption();

} // QuestionCondition
