/**
 */
package questionairemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.Heading#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see questionairemodel.QuestionairemodelPackage#getHeading_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link questionairemodel.Heading#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Heading
