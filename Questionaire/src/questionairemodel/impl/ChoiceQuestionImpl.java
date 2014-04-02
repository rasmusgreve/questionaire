/**
 */
package questionairemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import questionairemodel.ChoiceQuestion;
import questionairemodel.Option;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.ChoiceQuestionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link questionairemodel.impl.ChoiceQuestionImpl#getMinSelections <em>Min Selections</em>}</li>
 *   <li>{@link questionairemodel.impl.ChoiceQuestionImpl#getMaxSelections <em>Max Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceQuestionImpl extends QuestionImpl implements ChoiceQuestion {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * The default value of the '{@link #getMinSelections() <em>Min Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSelections()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SELECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSelections() <em>Min Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSelections()
	 * @generated
	 * @ordered
	 */
	protected int minSelections = MIN_SELECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSelections() <em>Max Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSelections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SELECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSelections() <em>Max Selections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSelections()
	 * @generated
	 * @ordered
	 */
	protected int maxSelections = MAX_SELECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.CHOICE_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<Option>(Option.class, this, QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSelections() {
		return minSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSelections(int newMinSelections) {
		int oldMinSelections = minSelections;
		minSelections = newMinSelections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CHOICE_QUESTION__MIN_SELECTIONS, oldMinSelections, minSelections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSelections() {
		return maxSelections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSelections(int newMaxSelections) {
		int oldMaxSelections = maxSelections;
		maxSelections = newMaxSelections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CHOICE_QUESTION__MAX_SELECTIONS, oldMaxSelections, maxSelections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS:
				return getOptions();
			case QuestionairemodelPackage.CHOICE_QUESTION__MIN_SELECTIONS:
				return getMinSelections();
			case QuestionairemodelPackage.CHOICE_QUESTION__MAX_SELECTIONS:
				return getMaxSelections();
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
			case QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case QuestionairemodelPackage.CHOICE_QUESTION__MIN_SELECTIONS:
				setMinSelections((Integer)newValue);
				return;
			case QuestionairemodelPackage.CHOICE_QUESTION__MAX_SELECTIONS:
				setMaxSelections((Integer)newValue);
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
			case QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS:
				getOptions().clear();
				return;
			case QuestionairemodelPackage.CHOICE_QUESTION__MIN_SELECTIONS:
				setMinSelections(MIN_SELECTIONS_EDEFAULT);
				return;
			case QuestionairemodelPackage.CHOICE_QUESTION__MAX_SELECTIONS:
				setMaxSelections(MAX_SELECTIONS_EDEFAULT);
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
			case QuestionairemodelPackage.CHOICE_QUESTION__OPTIONS:
				return options != null && !options.isEmpty();
			case QuestionairemodelPackage.CHOICE_QUESTION__MIN_SELECTIONS:
				return minSelections != MIN_SELECTIONS_EDEFAULT;
			case QuestionairemodelPackage.CHOICE_QUESTION__MAX_SELECTIONS:
				return maxSelections != MAX_SELECTIONS_EDEFAULT;
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
		result.append(" (minSelections: ");
		result.append(minSelections);
		result.append(", maxSelections: ");
		result.append(maxSelections);
		result.append(')');
		return result.toString();
	}

} //ChoiceQuestionImpl
