/**
 */
package questionairemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.Question#getQuestionBase <em>Question Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getQuestion()
 * @model abstract="true"
 * @generated
 */
public interface Question extends Element {
	/**
	 * Returns the value of the '<em><b>Question Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Base</em>' containment reference.
	 * @see #setQuestionBase(QuestionBase)
	 * @see questionairemodel.QuestionairemodelPackage#getQuestion_QuestionBase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QuestionBase getQuestionBase();

	/**
	 * Sets the value of the '{@link questionairemodel.Question#getQuestionBase <em>Question Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Base</em>' containment reference.
	 * @see #getQuestionBase()
	 * @generated
	 */
	void setQuestionBase(QuestionBase value);

} // Question
