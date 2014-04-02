/**
 */
package questionairemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import questionairemodel.Question;
import questionairemodel.QuestionBase;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.QuestionImpl#getQuestionBase <em>Question Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QuestionImpl extends ElementImpl implements Question {
	/**
	 * The cached value of the '{@link #getQuestionBase() <em>Question Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionBase()
	 * @generated
	 * @ordered
	 */
	protected QuestionBase questionBase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionBase getQuestionBase() {
		return questionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionBase(QuestionBase newQuestionBase, NotificationChain msgs) {
		QuestionBase oldQuestionBase = questionBase;
		questionBase = newQuestionBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.QUESTION__QUESTION_BASE, oldQuestionBase, newQuestionBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionBase(QuestionBase newQuestionBase) {
		if (newQuestionBase != questionBase) {
			NotificationChain msgs = null;
			if (questionBase != null)
				msgs = ((InternalEObject)questionBase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionairemodelPackage.QUESTION__QUESTION_BASE, null, msgs);
			if (newQuestionBase != null)
				msgs = ((InternalEObject)newQuestionBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionairemodelPackage.QUESTION__QUESTION_BASE, null, msgs);
			msgs = basicSetQuestionBase(newQuestionBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.QUESTION__QUESTION_BASE, newQuestionBase, newQuestionBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionairemodelPackage.QUESTION__QUESTION_BASE:
				return basicSetQuestionBase(null, msgs);
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
			case QuestionairemodelPackage.QUESTION__QUESTION_BASE:
				return getQuestionBase();
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
			case QuestionairemodelPackage.QUESTION__QUESTION_BASE:
				setQuestionBase((QuestionBase)newValue);
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
			case QuestionairemodelPackage.QUESTION__QUESTION_BASE:
				setQuestionBase((QuestionBase)null);
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
			case QuestionairemodelPackage.QUESTION__QUESTION_BASE:
				return questionBase != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionImpl
