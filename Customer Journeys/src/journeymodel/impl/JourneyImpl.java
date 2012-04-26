/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import journeymodel.EInitiator;
import java.util.Set;
import java.util.HashSet;

import journeymodel.EChannel;
import journeymodel.EEvaluation;
import journeymodel.EStatus;
import journeymodel.Journey;
import journeymodel.JourneyDiff;
import journeymodel.JourneySet;
import journeymodel.JourneymodelPackage;
import journeymodel.Touchpoint;

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
 * An implementation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link journeymodel.impl.JourneyImpl#getID <em>ID</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getName <em>Name</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getJourneySet <em>Journey Set</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyImpl#getTouchpoints <em>Touchpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JourneyImpl extends EObjectImpl implements Journey {
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
	protected static final EStatus STATUS_EDEFAULT = EStatus.COMPLETED;

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
	 * The cached value of the '{@link #getJourneySet() <em>Journey Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneySet()
	 * @generated
	 * @ordered
	 */
	protected JourneySet journeySet;

	/**
	 * The cached value of the '{@link #getTouchpoints() <em>Touchpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTouchpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Touchpoint> touchpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JourneymodelPackage.Literals.JOURNEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneySet getJourneySet() {
		if (journeySet != null && journeySet.eIsProxy()) {
			InternalEObject oldJourneySet = (InternalEObject)journeySet;
			journeySet = (JourneySet)eResolveProxy(oldJourneySet);
			if (journeySet != oldJourneySet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JourneymodelPackage.JOURNEY__JOURNEY_SET, oldJourneySet, journeySet));
			}
		}
		return journeySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneySet basicGetJourneySet() {
		return journeySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneySet(JourneySet newJourneySet) {
		JourneySet oldJourneySet = journeySet;
		journeySet = newJourneySet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY__JOURNEY_SET, oldJourneySet, journeySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Touchpoint> getTouchpoints() {
		if (touchpoints == null) {
			touchpoints = new EObjectContainmentEList<Touchpoint>(Touchpoint.class, this, JourneymodelPackage.JOURNEY__TOUCHPOINTS);
		}
		return touchpoints;
	}


	/**
	 * <!-- begin-user-doc -->
	 * Compare Journey's Touchpoint lists.
	 * 
	 * newTP: Count of TouchpointIDs that exist in OTHER Journey
	 * 	and not in THIS Journey.
	 * unusedTP: Count of TouchpointIDs that exist in THIS Journey
	 * 	and not in OTHER Journey.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JourneyDiff compare(Journey other) {
		Set<String> thisSet = new HashSet<String>();
		Set<String> otherSet = new HashSet<String>();
		for (Touchpoint tp: getTouchpoints())
			thisSet.add(tp.getID());
		for (Touchpoint tp: other.getTouchpoints())
			otherSet.add(tp.getID());
		
		int commonTP = 0, unusedTP = 0, newTP = 0;
		for (String tpID: thisSet) {
			if (otherSet.contains(tpID))
				++commonTP;
			else
				++unusedTP;
		}
		
		for (String tpID: otherSet) {
			if (!thisSet.contains(tpID))
				++newTP;
		}
		
		JourneyDiff diff = new JourneyDiffImpl();
		diff.setCommonTP(commonTP);
		diff.setNewTP(newTP);
		diff.setUnusedTP(unusedTP);
		
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRatingStatistics() {
		Integer totalRatings = this.getTouchpoints().size();
		StringBuilder builder = new StringBuilder("## Rating Statistics for a total number of " + totalRatings + " ratings:\n\n");

		Integer goodRatingCount = this.getRatingCount(EEvaluation.GOOD);
		builder.append("* Good Ratings: " + goodRatingCount + " (" + ((float) (goodRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer badRatingCount = this.getRatingCount(EEvaluation.BAD);
		builder.append("* Bad Ratings: " + badRatingCount + " (" + ((float) (badRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer mediumRatingCount = this.getRatingCount(EEvaluation.MEDIUM);
		builder.append("* Medium Ratings: " + mediumRatingCount + " ("
				+ ((float) (mediumRatingCount) / (float) (this.getTouchpoints().size())) * 100 + "%)\n");
		Integer naRatingCount = this.getRatingCount(EEvaluation.NOT_AVAILABLE);
		builder.append("* Na Ratings: " + naRatingCount + " (" + ((float) (naRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		Integer emptyRatingCount = this.getRatingCount(EEvaluation.EMPTY);
		builder.append("* Empty Ratings: " + emptyRatingCount + " (" + ((float) (emptyRatingCount) / (float) (totalRatings)) * 100 + "%)\n");
		builder.append("\n\n");
		return builder.toString();	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getChannelStatistics() {
		List<EChannel> channelList = EChannel.VALUES;
		StringBuilder builder = new StringBuilder("## Channel Statistics for  " + channelList.size() + " channels:\n\n");

		for (EChannel channel : channelList) {
			builder.append(this.getSingleChannelStatistic(channel));
		}
		builder.append("\n\n");
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitiatorStatistics() {
		List<EInitiator> initiatorList = EInitiator.VALUES;
		StringBuilder builder = new StringBuilder("## Initiator Statistics for  " + initiatorList.size() + " initiators:\n\n");

		for (EInitiator initiator : initiatorList) {
			builder.append(this.getSingleInitiatorStatistics(initiator));
		}
		builder.append("\n\n");
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getComparedToExpected(Journey expected) {
		JourneyDiff diff = this.compare(expected);
		StringBuilder builder = new StringBuilder("## Compared to the Expected Journey:\n");
		builder.append("* Common touchpoints: " + diff.getCommonTP() + "\n");
		builder.append("* New touchpoints:    " + diff.getNewTP() + "\n");
		builder.append("* Unused touchpoints: " + diff.getUnusedTP() + "\n");
		builder.append("\n\n");
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSingleInitiatorStatistics(EInitiator initiator) {
		Integer initiatorCount = 0;
		for (Touchpoint touchpoint : this.getTouchpoints()) {
			if (touchpoint.getInitiator() == initiator) {
				initiatorCount++;
			}
		}
		return ("* " + initiator.toString() + ": " + initiatorCount + " ("
				+ ((float) initiatorCount / (float) this.getTouchpoints().size()) * 100 + "%)\n");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getRatingCount(EEvaluation evaluation) {
		Integer counter = 0;
		List<Touchpoint> touchpointList = this.getTouchpoints();
		for (Touchpoint touchpoint : touchpointList) {
			if (touchpoint.getEvaluation() == evaluation) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGraphviz() {
		StringBuilder builder = new StringBuilder();
		builder.append("subgraph cluster_" + getID() +" {\n");
		builder.append("label = \"" + getID() + "\"\n");
		
		boolean first = true;
		for (Touchpoint tp: getTouchpoints()) {
			if (first)
				first = false;
			else
				builder.append(" -> ");
			builder.append(tp.getID());
		}
		builder.append(";\n");
		for (Touchpoint tp: getTouchpoints()) {
			switch (tp.getEvaluation()) {
			case GOOD: builder.append(tp.getID() + " [style=filled, fillcolor=green];\n"); break;
			case MEDIUM: builder.append(tp.getID() + " [style=filled, fillcolor=blue];\n"); break;
			case BAD: builder.append(tp.getID() + " [style=filled, fillcolor=orange];\n"); break;
			case EMPTY: builder.append(tp.getID() + " [style=filled, fillcolor=white];\n"); break;
			case NOT_AVAILABLE: builder.append(tp.getID() + " [style=filled, fillcolor=white];\n"); break;
			}
		}
		builder.append("}\n"); //close Subgraph
		
		EList<Touchpoint> touchpoints = getTouchpoints();
		Touchpoint start = touchpoints.get(0);
		Touchpoint end = touchpoints.get(touchpoints.size() - 1);
		builder.append("start -> " + start.getID() + ";\n");
		if (status == EStatus.COMPLETED)
			builder.append(end.getID() + " -> end;\n");
		
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSingleChannelStatistics(EChannel channel) {
		Integer channelCount = 0;
		for (Touchpoint touchpoint : this.getTouchpoints()) {
			if (touchpoint.getChannel() == channel) {
				channelCount++;
			}
		}
		return ("* " + channel.toString() + ": " + channelCount + " (" + ((float) channelCount / (float) this.getTouchpoints().size())
				* 100 + "%)\n");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSingleChannelStatistic(EChannel channel) {
		Integer channelCount = 0;
		for (Touchpoint touchpoint : this.getTouchpoints()) {
			if (touchpoint.getChannel() == channel) {
				channelCount++;
			}
		}
		return ("* " + channel.toString() + ": " + channelCount + " (" + ((float) channelCount / (float) this.getTouchpoints().size())
				* 100 + "%)\n");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JourneymodelPackage.JOURNEY__TOUCHPOINTS:
				return ((InternalEList<?>)getTouchpoints()).basicRemove(otherEnd, msgs);
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
			case JourneymodelPackage.JOURNEY__ID:
				return getID();
			case JourneymodelPackage.JOURNEY__NAME:
				return getName();
			case JourneymodelPackage.JOURNEY__DATE:
				return getDate();
			case JourneymodelPackage.JOURNEY__STATUS:
				return getStatus();
			case JourneymodelPackage.JOURNEY__COMMENT:
				return getComment();
			case JourneymodelPackage.JOURNEY__JOURNEY_SET:
				if (resolve) return getJourneySet();
				return basicGetJourneySet();
			case JourneymodelPackage.JOURNEY__TOUCHPOINTS:
				return getTouchpoints();
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
			case JourneymodelPackage.JOURNEY__ID:
				setID((String)newValue);
				return;
			case JourneymodelPackage.JOURNEY__NAME:
				setName((String)newValue);
				return;
			case JourneymodelPackage.JOURNEY__DATE:
				setDate((Date)newValue);
				return;
			case JourneymodelPackage.JOURNEY__STATUS:
				setStatus((EStatus)newValue);
				return;
			case JourneymodelPackage.JOURNEY__COMMENT:
				setComment((String)newValue);
				return;
			case JourneymodelPackage.JOURNEY__JOURNEY_SET:
				setJourneySet((JourneySet)newValue);
				return;
			case JourneymodelPackage.JOURNEY__TOUCHPOINTS:
				getTouchpoints().clear();
				getTouchpoints().addAll((Collection<? extends Touchpoint>)newValue);
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
			case JourneymodelPackage.JOURNEY__ID:
				setID(ID_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY__JOURNEY_SET:
				setJourneySet((JourneySet)null);
				return;
			case JourneymodelPackage.JOURNEY__TOUCHPOINTS:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JourneymodelPackage.JOURNEY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JourneymodelPackage.JOURNEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JourneymodelPackage.JOURNEY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case JourneymodelPackage.JOURNEY__STATUS:
				return status != STATUS_EDEFAULT;
			case JourneymodelPackage.JOURNEY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case JourneymodelPackage.JOURNEY__JOURNEY_SET:
				return journeySet != null;
			case JourneymodelPackage.JOURNEY__TOUCHPOINTS:
				return touchpoints != null && !touchpoints.isEmpty();
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
		result.append(", status: ");
		result.append(status);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //JourneyImpl
