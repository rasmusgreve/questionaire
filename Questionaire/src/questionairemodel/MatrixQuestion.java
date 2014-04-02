/**
 */
package questionairemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionairemodel.MatrixQuestion#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link questionairemodel.MatrixQuestion#getRowNames <em>Row Names</em>}</li>
 *   <li>{@link questionairemodel.MatrixQuestion#getMaxPerRow <em>Max Per Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionairemodel.QuestionairemodelPackage#getMatrixQuestion()
 * @model
 * @generated
 */
public interface MatrixQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Names</em>' attribute list.
	 * @see questionairemodel.QuestionairemodelPackage#getMatrixQuestion_ColumnNames()
	 * @model
	 * @generated
	 */
	EList<String> getColumnNames();

	/**
	 * Returns the value of the '<em><b>Row Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Names</em>' attribute list.
	 * @see questionairemodel.QuestionairemodelPackage#getMatrixQuestion_RowNames()
	 * @model
	 * @generated
	 */
	EList<String> getRowNames();

	/**
	 * Returns the value of the '<em><b>Max Per Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Per Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Per Row</em>' attribute.
	 * @see #setMaxPerRow(int)
	 * @see questionairemodel.QuestionairemodelPackage#getMatrixQuestion_MaxPerRow()
	 * @model required="true"
	 * @generated
	 */
	int getMaxPerRow();

	/**
	 * Sets the value of the '{@link questionairemodel.MatrixQuestion#getMaxPerRow <em>Max Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Per Row</em>' attribute.
	 * @see #getMaxPerRow()
	 * @generated
	 */
	void setMaxPerRow(int value);

} // MatrixQuestion
