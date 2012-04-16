/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney.impl;

import customerjourney.Channel;
import customerjourney.CustomerjourneyPackage;
import customerjourney.Initiator;
import customerjourney.Touchpoint;

import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getDate <em>Date</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getDT1 <em>DT1</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getType <em>Type</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link customerjourney.impl.TouchpointImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchpointImpl extends EObjectImpl implements Touchpoint {
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
	protected static final Calendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDT1() <em>DT1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDT1()
	 * @generated
	 * @ordered
	 */
	protected static final String DT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDT1() <em>DT1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDT1()
	 * @generated
	 * @ordered
	 */
	protected String dt1 = DT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected Channel channel;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected Initiator initiator;

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
	 * The default value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EVALUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Integer evaluation = EVALUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CustomerjourneyPackage.Literals.TOUCHPOINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Calendar newDate) {
		Calendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDT1() {
		return dt1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDT1(String newDT1) {
		String oldDT1 = dt1;
		dt1 = newDT1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__DT1, oldDT1, dt1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(Channel newChannel, NotificationChain msgs) {
		Channel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__CHANNEL, oldChannel, newChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(Channel newChannel) {
		if (newChannel != channel) {
			NotificationChain msgs = null;
			if (channel != null)
				msgs = ((InternalEObject)channel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CustomerjourneyPackage.TOUCHPOINT__CHANNEL, null, msgs);
			if (newChannel != null)
				msgs = ((InternalEObject)newChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CustomerjourneyPackage.TOUCHPOINT__CHANNEL, null, msgs);
			msgs = basicSetChannel(newChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__CHANNEL, newChannel, newChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initiator getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiator(Initiator newInitiator, NotificationChain msgs) {
		Initiator oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__INITIATOR, oldInitiator, newInitiator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(Initiator newInitiator) {
		if (newInitiator != initiator) {
			NotificationChain msgs = null;
			if (initiator != null)
				msgs = ((InternalEObject)initiator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CustomerjourneyPackage.TOUCHPOINT__INITIATOR, null, msgs);
			if (newInitiator != null)
				msgs = ((InternalEObject)newInitiator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CustomerjourneyPackage.TOUCHPOINT__INITIATOR, null, msgs);
			msgs = basicSetInitiator(newInitiator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__INITIATOR, newInitiator, newInitiator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Integer newEvaluation) {
		Integer oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.TOUCHPOINT__EVALUATION, oldEvaluation, evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomerjourneyPackage.TOUCHPOINT__CHANNEL:
				return basicSetChannel(null, msgs);
			case CustomerjourneyPackage.TOUCHPOINT__INITIATOR:
				return basicSetInitiator(null, msgs);
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
			case CustomerjourneyPackage.TOUCHPOINT__NAME:
				return getName();
			case CustomerjourneyPackage.TOUCHPOINT__DATE:
				return getDate();
			case CustomerjourneyPackage.TOUCHPOINT__DT1:
				return getDT1();
			case CustomerjourneyPackage.TOUCHPOINT__TYPE:
				return getType();
			case CustomerjourneyPackage.TOUCHPOINT__CHANNEL:
				return getChannel();
			case CustomerjourneyPackage.TOUCHPOINT__INITIATOR:
				return getInitiator();
			case CustomerjourneyPackage.TOUCHPOINT__COMMENT:
				return getComment();
			case CustomerjourneyPackage.TOUCHPOINT__EVALUATION:
				return getEvaluation();
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
			case CustomerjourneyPackage.TOUCHPOINT__NAME:
				setName((String)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__DATE:
				setDate((Calendar)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__DT1:
				setDT1((String)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__TYPE:
				setType((String)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__CHANNEL:
				setChannel((Channel)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__INITIATOR:
				setInitiator((Initiator)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__COMMENT:
				setComment((String)newValue);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__EVALUATION:
				setEvaluation((Integer)newValue);
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
			case CustomerjourneyPackage.TOUCHPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__DT1:
				setDT1(DT1_EDEFAULT);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__CHANNEL:
				setChannel((Channel)null);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__INITIATOR:
				setInitiator((Initiator)null);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CustomerjourneyPackage.TOUCHPOINT__EVALUATION:
				setEvaluation(EVALUATION_EDEFAULT);
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
			case CustomerjourneyPackage.TOUCHPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CustomerjourneyPackage.TOUCHPOINT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case CustomerjourneyPackage.TOUCHPOINT__DT1:
				return DT1_EDEFAULT == null ? dt1 != null : !DT1_EDEFAULT.equals(dt1);
			case CustomerjourneyPackage.TOUCHPOINT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CustomerjourneyPackage.TOUCHPOINT__CHANNEL:
				return channel != null;
			case CustomerjourneyPackage.TOUCHPOINT__INITIATOR:
				return initiator != null;
			case CustomerjourneyPackage.TOUCHPOINT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CustomerjourneyPackage.TOUCHPOINT__EVALUATION:
				return EVALUATION_EDEFAULT == null ? evaluation != null : !EVALUATION_EDEFAULT.equals(evaluation);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", DT1: ");
		result.append(dt1);
		result.append(", type: ");
		result.append(type);
		result.append(", comment: ");
		result.append(comment);
		result.append(", evaluation: ");
		result.append(evaluation);
		result.append(')');
		return result.toString();
	}

} //TouchpointImpl
