/**
 */
package questionairemodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionairemodel.CalendarQuestion;
import questionairemodel.QuestionairemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionairemodel.impl.CalendarQuestionImpl#isYear <em>Year</em>}</li>
 *   <li>{@link questionairemodel.impl.CalendarQuestionImpl#isMonth <em>Month</em>}</li>
 *   <li>{@link questionairemodel.impl.CalendarQuestionImpl#isDay <em>Day</em>}</li>
 *   <li>{@link questionairemodel.impl.CalendarQuestionImpl#isHour <em>Hour</em>}</li>
 *   <li>{@link questionairemodel.impl.CalendarQuestionImpl#isMinute <em>Minute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarQuestionImpl extends QuestionImpl implements CalendarQuestion {
	/**
	 * The default value of the '{@link #isYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean YEAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isYear()
	 * @generated
	 * @ordered
	 */
	protected boolean year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonth()
	 * @generated
	 * @ordered
	 */
	protected boolean month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDay()
	 * @generated
	 * @ordered
	 */
	protected boolean day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHour()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHour()
	 * @generated
	 * @ordered
	 */
	protected boolean hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinute()
	 * @generated
	 * @ordered
	 */
	protected boolean minute = MINUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionairemodelPackage.Literals.CALENDAR_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(boolean newYear) {
		boolean oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CALENDAR_QUESTION__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(boolean newMonth) {
		boolean oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CALENDAR_QUESTION__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(boolean newDay) {
		boolean oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CALENDAR_QUESTION__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(boolean newHour) {
		boolean oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CALENDAR_QUESTION__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(boolean newMinute) {
		boolean oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionairemodelPackage.CALENDAR_QUESTION__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionairemodelPackage.CALENDAR_QUESTION__YEAR:
				return isYear();
			case QuestionairemodelPackage.CALENDAR_QUESTION__MONTH:
				return isMonth();
			case QuestionairemodelPackage.CALENDAR_QUESTION__DAY:
				return isDay();
			case QuestionairemodelPackage.CALENDAR_QUESTION__HOUR:
				return isHour();
			case QuestionairemodelPackage.CALENDAR_QUESTION__MINUTE:
				return isMinute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionairemodelPackage.CALENDAR_QUESTION__YEAR:
				setYear((Boolean)newValue);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MONTH:
				setMonth((Boolean)newValue);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__DAY:
				setDay((Boolean)newValue);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__HOUR:
				setHour((Boolean)newValue);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MINUTE:
				setMinute((Boolean)newValue);
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
			case QuestionairemodelPackage.CALENDAR_QUESTION__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MINUTE:
				setMinute(MINUTE_EDEFAULT);
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
			case QuestionairemodelPackage.CALENDAR_QUESTION__YEAR:
				return year != YEAR_EDEFAULT;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MONTH:
				return month != MONTH_EDEFAULT;
			case QuestionairemodelPackage.CALENDAR_QUESTION__DAY:
				return day != DAY_EDEFAULT;
			case QuestionairemodelPackage.CALENDAR_QUESTION__HOUR:
				return hour != HOUR_EDEFAULT;
			case QuestionairemodelPackage.CALENDAR_QUESTION__MINUTE:
				return minute != MINUTE_EDEFAULT;
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
		result.append(" (year: ");
		result.append(year);
		result.append(", month: ");
		result.append(month);
		result.append(", day: ");
		result.append(day);
		result.append(", hour: ");
		result.append(hour);
		result.append(", minute: ");
		result.append(minute);
		result.append(')');
		return result.toString();
	}

} //CalendarQuestionImpl
