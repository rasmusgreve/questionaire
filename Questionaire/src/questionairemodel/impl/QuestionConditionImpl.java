/**
 */
package questionairemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import questionairemodel.Option;
import questionairemodel.QuestionCondition;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.QuestionConditionImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionConditionImpl extends MinimalEObjectImpl.Container implements QuestionCondition {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> option;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.QUESTION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOption() {
		if (option == null) {
			option = new EObjectResolvingEList<Option>(Option.class, this, QuestionairemodelPackage.QUESTION_CONDITION__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionairemodelPackage.QUESTION_CONDITION__OPTION:
				return getOption();
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
			case QuestionairemodelPackage.QUESTION_CONDITION__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends Option>)newValue);
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
			case QuestionairemodelPackage.QUESTION_CONDITION__OPTION:
				getOption().clear();
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
			case QuestionairemodelPackage.QUESTION_CONDITION__OPTION:
				return option != null && !option.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionConditionImpl
