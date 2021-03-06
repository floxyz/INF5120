/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import java.util.Date;

import journeymodel.EChannel;
import journeymodel.EEvaluation;
import journeymodel.EInitiator;
import journeymodel.EType;
import journeymodel.JourneymodelPackage;
import journeymodel.Touchpoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getID <em>ID</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getDate <em>Date</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getDT1 <em>DT1</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getType <em>Type</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link journeymodel.impl.TouchpointImpl#getInitiator <em>Initiator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchpointImpl extends EObjectImpl implements Touchpoint {
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
	protected static final EType TYPE_EDEFAULT = EType.GENERIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EType type = TYPE_EDEFAULT;

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
	protected static final EEvaluation EVALUATION_EDEFAULT = EEvaluation.GOOD;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EEvaluation evaluation = EVALUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final EChannel CHANNEL_EDEFAULT = EChannel.WEB;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected EChannel channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final EInitiator INITIATOR_EDEFAULT = EInitiator.CUSTOMER;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected EInitiator initiator = INITIATOR_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return JourneymodelPackage.Literals.TOUCHPOINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__DT1, oldDT1, dt1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EType newType) {
		EType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEvaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(EEvaluation newEvaluation) {
		EEvaluation oldEvaluation = evaluation;
		evaluation = newEvaluation == null ? EVALUATION_EDEFAULT : newEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__EVALUATION, oldEvaluation, evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EChannel getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(EChannel newChannel) {
		EChannel oldChannel = channel;
		channel = newChannel == null ? CHANNEL_EDEFAULT : newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInitiator getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(EInitiator newInitiator) {
		EInitiator oldInitiator = initiator;
		initiator = newInitiator == null ? INITIATOR_EDEFAULT : newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.TOUCHPOINT__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JourneymodelPackage.TOUCHPOINT__ID:
				return getID();
			case JourneymodelPackage.TOUCHPOINT__NAME:
				return getName();
			case JourneymodelPackage.TOUCHPOINT__DATE:
				return getDate();
			case JourneymodelPackage.TOUCHPOINT__DT1:
				return getDT1();
			case JourneymodelPackage.TOUCHPOINT__TYPE:
				return getType();
			case JourneymodelPackage.TOUCHPOINT__COMMENT:
				return getComment();
			case JourneymodelPackage.TOUCHPOINT__EVALUATION:
				return getEvaluation();
			case JourneymodelPackage.TOUCHPOINT__CHANNEL:
				return getChannel();
			case JourneymodelPackage.TOUCHPOINT__INITIATOR:
				return getInitiator();
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
			case JourneymodelPackage.TOUCHPOINT__ID:
				setID((String)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__NAME:
				setName((String)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__DATE:
				setDate((Date)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__DT1:
				setDT1((String)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__TYPE:
				setType((EType)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__COMMENT:
				setComment((String)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__EVALUATION:
				setEvaluation((EEvaluation)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__CHANNEL:
				setChannel((EChannel)newValue);
				return;
			case JourneymodelPackage.TOUCHPOINT__INITIATOR:
				setInitiator((EInitiator)newValue);
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
			case JourneymodelPackage.TOUCHPOINT__ID:
				setID(ID_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__DT1:
				setDT1(DT1_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__EVALUATION:
				setEvaluation(EVALUATION_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case JourneymodelPackage.TOUCHPOINT__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
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
			case JourneymodelPackage.TOUCHPOINT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JourneymodelPackage.TOUCHPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JourneymodelPackage.TOUCHPOINT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case JourneymodelPackage.TOUCHPOINT__DT1:
				return DT1_EDEFAULT == null ? dt1 != null : !DT1_EDEFAULT.equals(dt1);
			case JourneymodelPackage.TOUCHPOINT__TYPE:
				return type != TYPE_EDEFAULT;
			case JourneymodelPackage.TOUCHPOINT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case JourneymodelPackage.TOUCHPOINT__EVALUATION:
				return evaluation != EVALUATION_EDEFAULT;
			case JourneymodelPackage.TOUCHPOINT__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
			case JourneymodelPackage.TOUCHPOINT__INITIATOR:
				return initiator != INITIATOR_EDEFAULT;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
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
		result.append(", channel: ");
		result.append(channel);
		result.append(", initiator: ");
		result.append(initiator);
		result.append(')');
		return result.toString();
	}

} //TouchpointImpl
