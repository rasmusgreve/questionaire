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
 *   <li>{@link questionairemodel.TextQuestion#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getTextQuestion()
 * @model
 * @generated
 */
public interface TextQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute.
	 * @see #setLines(int)
	 * @see questionairemodel.QuestionairemodelPackage#getTextQuestion_Lines()
	 * @model required="true"
	 * @generated
	 */
	int getLines();

	/**
	 * Sets the value of the '{@link questionairemodel.TextQuestion#getLines <em>Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lines</em>' attribute.
	 * @see #getLines()
	 * @generated
	 */
	void setLines(int value);

} // TextQuestion
