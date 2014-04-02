/**
 */
package questionairemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.TextQuestion#isMultiline <em>Multiline</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getTextQuestion()
 * @model
 * @generated
 */
public interface TextQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Multiline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiline</em>' attribute.
	 * @see #setMultiline(boolean)
	 * @see questionairemodel.QuestionairemodelPackage#getTextQuestion_Multiline()
	 * @model required="true"
	 * @generated
	 */
	boolean isMultiline();

	/**
	 * Sets the value of the '{@link questionairemodel.TextQuestion#isMultiline <em>Multiline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiline</em>' attribute.
	 * @see #isMultiline()
	 * @generated
	 */
	void setMultiline(boolean value);

} // TextQuestion
