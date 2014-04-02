/**
 */
package questionairemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import questionairemodel.MatrixQuestion;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.MatrixQuestionImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link questionairemodel.impl.MatrixQuestionImpl#getRowNames <em>Row Names</em>}</li>
 *   <li>{@link questionairemodel.impl.MatrixQuestionImpl#getMaxPerRow <em>Max Per Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixQuestionImpl extends QuestionImpl implements MatrixQuestion {
	/**
	 * The cached value of the '{@link #getColumnNames() <em>Column Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> columnNames;

	/**
	 * The cached value of the '{@link #getRowNames() <em>Row Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rowNames;

	/**
	 * The default value of the '{@link #getMaxPerRow() <em>Max Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPerRow()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PER_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPerRow() <em>Max Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPerRow()
	 * @generated
	 * @ordered
	 */
	protected int maxPerRow = MAX_PER_ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.MATRIX_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getColumnNames() {
		if (columnNames == null) {
			columnNames = new EDataTypeUniqueEList<String>(String.class, this, QuestionairemodelPackage.MATRIX_QUESTION__COLUMN_NAMES);
		}
		return columnNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRowNames() {
		if (rowNames == null) {
			rowNames = new EDataTypeUniqueEList<String>(String.class, this, QuestionairemodelPackage.MATRIX_QUESTION__ROW_NAMES);
		}
		return rowNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPerRow() {
		return maxPerRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPerRow(int newMaxPerRow) {
		int oldMaxPerRow = maxPerRow;
		maxPerRow = newMaxPerRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.MATRIX_QUESTION__MAX_PER_ROW, oldMaxPerRow, maxPerRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionairemodelPackage.MATRIX_QUESTION__COLUMN_NAMES:
				return getColumnNames();
			case QuestionairemodelPackage.MATRIX_QUESTION__ROW_NAMES:
				return getRowNames();
			case QuestionairemodelPackage.MATRIX_QUESTION__MAX_PER_ROW:
				return getMaxPerRow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionairemodelPackage.MATRIX_QUESTION__COLUMN_NAMES:
				getColumnNames().clear();
				getColumnNames().addAll((Collection<? extends String>)newValue);
				return;
			case QuestionairemodelPackage.MATRIX_QUESTION__ROW_NAMES:
				getRowNames().clear();
				getRowNames().addAll((Collection<? extends String>)newValue);
				return;
			case QuestionairemodelPackage.MATRIX_QUESTION__MAX_PER_ROW:
				setMaxPerRow((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuestionairemodelPackage.MATRIX_QUESTION__COLUMN_NAMES:
				getColumnNames().clear();
				return;
			case QuestionairemodelPackage.MATRIX_QUESTION__ROW_NAMES:
				getRowNames().clear();
				return;
			case QuestionairemodelPackage.MATRIX_QUESTION__MAX_PER_ROW:
				setMaxPerRow(MAX_PER_ROW_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuestionairemodelPackage.MATRIX_QUESTION__COLUMN_NAMES:
				return columnNames != null && !columnNames.isEmpty();
			case QuestionairemodelPackage.MATRIX_QUESTION__ROW_NAMES:
				return rowNames != null && !rowNames.isEmpty();
			case QuestionairemodelPackage.MATRIX_QUESTION__MAX_PER_ROW:
				return maxPerRow != MAX_PER_ROW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnNames: ");
		result.append(columnNames);
		result.append(", rowNames: ");
		result.append(rowNames);
		result.append(", maxPerRow: ");
		result.append(maxPerRow);
		result.append(')');
		return result.toString();
	}

} //MatrixQuestionImpl
