/**
 */
package questionairemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.IntegerQuestion#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link questionairemodel.IntegerQuestion#getStep <em>Step</em>}</li>
 *   <li>{@link questionairemodel.IntegerQuestion#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getIntegerQuestion()
 * @model
 * @generated
 */
public interface IntegerQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see questionairemodel.QuestionairemodelPackage#getIntegerQuestion_MinValue()
	 * @model required="true"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link questionairemodel.IntegerQuestion#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see questionairemodel.QuestionairemodelPackage#getIntegerQuestion_Step()
	 * @model default="1"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link questionairemodel.IntegerQuestion#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see questionairemodel.QuestionairemodelPackage#getIntegerQuestion_MaxValue()
	 * @model required="true"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link questionairemodel.IntegerQuestion#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

} // IntegerQuestion
