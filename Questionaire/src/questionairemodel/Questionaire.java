/**
 */
package questionairemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.Questionaire#getName <em>Name</em>}</li>
 *   <li>{@link questionairemodel.Questionaire#getElements <em>Elements</em>}</li>
 *   <li>{@link questionairemodel.Questionaire#getResultEmail <em>Result Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getQuestionaire()
 * @model
 * @generated
 */
public interface Questionaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see questionairemodel.QuestionairemodelPackage#getQuestionaire_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link questionairemodel.Questionaire#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link questionairemodel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see questionairemodel.QuestionairemodelPackage#getQuestionaire_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Result Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Email</em>' attribute.
	 * @see #setResultEmail(String)
	 * @see questionairemodel.QuestionairemodelPackage#getQuestionaire_ResultEmail()
	 * @model required="true"
	 * @generated
	 */
	String getResultEmail();

	/**
	 * Sets the value of the '{@link questionairemodel.Questionaire#getResultEmail <em>Result Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Email</em>' attribute.
	 * @see #getResultEmail()
	 * @generated
	 */
	void setResultEmail(String value);

} // Questionaire
