/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney.impl;

import customerjourney.CustomerJourney;
import customerjourney.CustomerjourneyPackage;
import customerjourney.EStatus;
import customerjourney.Touchpoint;

import java.util.Calendar;
import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getID <em>ID</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getName <em>Name</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link customerjourney.impl.CustomerJourneyImpl#getTouchpoints <em>Touchpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerJourneyImpl extends EObjectImpl implements CustomerJourney {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EStatus STATUS_EDEFAULT = EStatus.COMPLETED_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected Touchpoint eReference0;

	/**
	 * The cached value of the '{@link #getTouchpoints() <em>Touchpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpoints()
	 * @generated
	 * @ordered
	 */
	protected EList touchpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CustomerjourneyPackage.Literals.CUSTOMER_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EStatus newStatus) {
		EStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchpoint getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (Touchpoint)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchpoint basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(Touchpoint newEReference0) {
		Touchpoint oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTouchpoints() {
		if (touchpoints == null) {
			touchpoints = new EObjectContainmentEList(Touchpoint.class, this, CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS);
		}
		return touchpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS:
				return ((InternalEList)getTouchpoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__ID:
				return getID();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__NAME:
				return getName();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__DATE:
				return getDate();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__STATUS:
				return getStatus();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__COMMENT:
				return getComment();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS:
				return getTouchpoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__ID:
				setID((String)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__NAME:
				setName((String)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__DATE:
				setDate((Date)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__STATUS:
				setStatus((EStatus)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__COMMENT:
				setComment((String)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0:
				setEReference0((Touchpoint)newValue);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS:
				getTouchpoints().clear();
				getTouchpoints().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__ID:
				setID(ID_EDEFAULT);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0:
				setEReference0((Touchpoint)null);
				return;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS:
				getTouchpoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__STATUS:
				return status != STATUS_EDEFAULT;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__EREFERENCE0:
				return eReference0 != null;
			case CustomerjourneyPackage.CUSTOMER_JOURNEY__TOUCHPOINTS:
				return touchpoints != null && !touchpoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", status: ");
		result.append(status);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //CustomerJourneyImpl
