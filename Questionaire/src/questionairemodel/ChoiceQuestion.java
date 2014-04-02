/**
 */
package questionairemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.ChoiceQuestion#getOptions <em>Options</em>}</li>
 *   <li>{@link questionairemodel.ChoiceQuestion#getMinSelections <em>Min Selections</em>}</li>
 *   <li>{@link questionairemodel.ChoiceQuestion#getMaxSelections <em>Max Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getChoiceQuestion()
 * @model
 * @generated
 */
public interface ChoiceQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link questionairemodel.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see questionairemodel.QuestionairemodelPackage#getChoiceQuestion_Options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Min Selections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Selections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Selections</em>' attribute.
	 * @see #setMinSelections(int)
	 * @see questionairemodel.QuestionairemodelPackage#getChoiceQuestion_MinSelections()
	 * @model
	 * @generated
	 */
	int getMinSelections();

	/**
	 * Sets the value of the '{@link questionairemodel.ChoiceQuestion#getMinSelections <em>Min Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Selections</em>' attribute.
	 * @see #getMinSelections()
	 * @generated
	 */
	void setMinSelections(int value);

	/**
	 * Returns the value of the '<em><b>Max Selections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Selections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Selections</em>' attribute.
	 * @see #setMaxSelections(int)
	 * @see questionairemodel.QuestionairemodelPackage#getChoiceQuestion_MaxSelections()
	 * @model
	 * @generated
	 */
	int getMaxSelections();

	/**
	 * Sets the value of the '{@link questionairemodel.ChoiceQuestion#getMaxSelections <em>Max Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Selections</em>' attribute.
	 * @see #getMaxSelections()
	 * @generated
	 */
	void setMaxSelections(int value);

} // ChoiceQuestion
