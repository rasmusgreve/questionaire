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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import questionairemodel.Element;
import questionairemodel.Questionaire;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.QuestionaireImpl#getName <em>Name</em>}</li>
 *   <li>{@link questionairemodel.impl.QuestionaireImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link questionairemodel.impl.QuestionaireImpl#getResultEmail <em>Result Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionaireImpl extends MinimalEObjectImpl.Container implements Questionaire {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The default value of the '{@link #getResultEmail() <em>Result Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultEmail() <em>Result Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultEmail()
	 * @generated
	 * @ordered
	 */
	protected String resultEmail = RESULT_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.QUESTIONAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.QUESTIONAIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultEmail() {
		return resultEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultEmail(String newResultEmail) {
		String oldResultEmail = resultEmail;
		resultEmail = newResultEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.QUESTIONAIRE__RESULT_EMAIL, oldResultEmail, resultEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case QuestionairemodelPackage.QUESTIONAIRE__NAME:
				return getName();
			case QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS:
				return getElements();
			case QuestionairemodelPackage.QUESTIONAIRE__RESULT_EMAIL:
				return getResultEmail();
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
			case QuestionairemodelPackage.QUESTIONAIRE__NAME:
				setName((String)newValue);
				return;
			case QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case QuestionairemodelPackage.QUESTIONAIRE__RESULT_EMAIL:
				setResultEmail((String)newValue);
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
			case QuestionairemodelPackage.QUESTIONAIRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS:
				getElements().clear();
				return;
			case QuestionairemodelPackage.QUESTIONAIRE__RESULT_EMAIL:
				setResultEmail(RESULT_EMAIL_EDEFAULT);
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
			case QuestionairemodelPackage.QUESTIONAIRE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QuestionairemodelPackage.QUESTIONAIRE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case QuestionairemodelPackage.QUESTIONAIRE__RESULT_EMAIL:
				return RESULT_EMAIL_EDEFAULT == null ? resultEmail != null : !RESULT_EMAIL_EDEFAULT.equals(resultEmail);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", resultEmail: ");
		result.append(resultEmail);
		result.append(')');
		return result.toString();
	}

} //QuestionaireImpl
