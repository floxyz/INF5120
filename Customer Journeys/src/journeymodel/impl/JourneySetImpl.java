/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import java.util.Collection;

import journeymodel.Journey;
import journeymodel.JourneyDiff;
import journeymodel.JourneySet;
import journeymodel.JourneymodelPackage;

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
 * An implementation of the model object '<em><b>Journey Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link journeymodel.impl.JourneySetImpl#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link journeymodel.impl.JourneySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link journeymodel.impl.JourneySetImpl#getExpectedJoruney <em>Expected Joruney</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JourneySetImpl extends EObjectImpl implements JourneySet {
	/**
	 * The cached value of the '{@link #getJourneys() <em>Journeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneys()
	 * @generated
	 * @ordered
	 */
	protected EList<Journey> journeys;

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
	 * The cached value of the '{@link #getExpectedJoruney() <em>Expected Joruney</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedJoruney()
	 * @generated
	 * @ordered
	 */
	protected Journey expectedJoruney;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JourneymodelPackage.Literals.JOURNEY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Journey> getJourneys() {
		if (journeys == null) {
			journeys = new EObjectContainmentEList<Journey>(Journey.class, this, JourneymodelPackage.JOURNEY_SET__JOURNEYS);
		}
		return journeys;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey getExpectedJoruney() {
		if (expectedJoruney != null && expectedJoruney.eIsProxy()) {
			InternalEObject oldExpectedJoruney = (InternalEObject)expectedJoruney;
			expectedJoruney = (Journey)eResolveProxy(oldExpectedJoruney);
			if (expectedJoruney != oldExpectedJoruney) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY, oldExpectedJoruney, expectedJoruney));
			}
		}
		return expectedJoruney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey basicGetExpectedJoruney() {
		return expectedJoruney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedJoruney(Journey newExpectedJoruney) {
		Journey oldExpectedJoruney = expectedJoruney;
		expectedJoruney = newExpectedJoruney;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY, oldExpectedJoruney, expectedJoruney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getComparedToExpected() {
		Journey expected = this.getExpectedJoruney();
		if (expected == null)
			return "## No Expected Journey to compare with\n";
		int total = 0, common = 0, newtp = 0, unused = 0,
				minCommon = Integer.MAX_VALUE, maxCommon = Integer.MIN_VALUE,
				minNew = Integer.MAX_VALUE, maxNew = Integer.MIN_VALUE,
				minUnused = Integer.MAX_VALUE, maxUnused = Integer.MIN_VALUE;
		
		for (Journey journey: this.getJourneys()) {
			if (journey == expected) continue;
			
			JourneyDiff diff = expected.compareTo(journey);
			++total;
			
			common += diff.getCommonTP();
			newtp += diff.getNewTP();
			unused += diff.getUnusedTP();
			
			minCommon = minCommon < diff.getCommonTP() ? minCommon : diff.getCommonTP();
			minNew = minNew < diff.getNewTP() ? minNew : diff.getNewTP();
			minUnused = minUnused < diff.getUnusedTP() ? minUnused : diff.getUnusedTP();
			
			maxCommon = maxCommon > diff.getCommonTP() ? maxCommon : diff.getCommonTP();
			maxNew = maxNew > diff.getNewTP() ? maxNew : diff.getNewTP();
			maxUnused = maxUnused > diff.getUnusedTP() ? maxUnused : diff.getUnusedTP();
		}
		
		StringBuilder builder = new StringBuilder("## Customer journeys compared to the Expected Journey:\n");
		builder.append("\n### Common touchpoints:\n");
		builder.append("* Avarage: " + (float) common / (float) total + "\n");
		builder.append("* Min: " + minCommon + "\n");
		builder.append("* Max: " + maxCommon + "\n");
		builder.append("\n### New touchpoints:\n");
		builder.append("* Avarage: " + (float) newtp / (float) total + "\n");
		builder.append("* Min: " + minNew + "\n");
		builder.append("* Max: " + maxNew + "\n");
		builder.append("\n### Unused touchpoints:\n");
		builder.append("* Avarage: " + (float) unused / (float) total + "\n");
		builder.append("* Min: " + minUnused + "\n");
		builder.append("* Max: " + maxUnused + "\n");
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGraphviz() {
		StringBuilder builder = new StringBuilder("strict digraph JourneySet {\n");
		builder.append("rankdir=LR;\n");
		
		Journey expected = getExpectedJoruney();
		//EList<String> expEdges = expected.getEdges(); 
		builder.append(expected.getGraphviz(false, null));
		for (Journey journey: getJourneys()) {
			if (journey == expected) continue;
			builder.append(journey.getGraphviz(false, null));
		}
		
		builder.append("}\n"); //close JourneySet
		
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGraphviz(Journey activeJourney) {
		StringBuilder builder = new StringBuilder("strict digraph " + activeJourney.getID() + " {\n");
		builder.append("rankdir=LR;\n");
		builder.append("edge [color=slategrey]\n");
		
		builder.append(getExpectedJoruney().getGraphviz(false, activeJourney.getEdges()));
		builder.append(activeJourney.getGraphviz(true, null));
		
		builder.append("}\n"); //close JourneySet
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGlobalComparedToExpected() {
		Journey expected = this.getExpectedJoruney();
		if (expected == null)
			return "## No Expected Journey to compare with\n";
		int total = 0, common = 0, newtp = 0, unused = 0,
				minCommon = Integer.MAX_VALUE, maxCommon = Integer.MIN_VALUE,
				minNew = Integer.MAX_VALUE, maxNew = Integer.MIN_VALUE,
				minUnused = Integer.MAX_VALUE, maxUnused = Integer.MIN_VALUE;
		
		for (Journey journey: this.getJourneys()) {
			if (journey == expected) continue;
			
			JourneyDiff diff = expected.compareTo(journey);
			++total;
			
			common += diff.getCommonTP();
			newtp += diff.getNewTP();
			unused += diff.getUnusedTP();
			
			minCommon = minCommon < diff.getCommonTP() ? minCommon : diff.getCommonTP();
			minNew = minNew < diff.getNewTP() ? minNew : diff.getNewTP();
			minUnused = minUnused < diff.getUnusedTP() ? minUnused : diff.getUnusedTP();
			
			maxCommon = maxCommon > diff.getCommonTP() ? maxCommon : diff.getCommonTP();
			maxNew = maxNew > diff.getNewTP() ? maxNew : diff.getNewTP();
			maxUnused = maxUnused > diff.getUnusedTP() ? maxUnused : diff.getUnusedTP();
		}
		
		StringBuilder builder = new StringBuilder("## Customer journeys compared to the Expected Journey:\n");
		builder.append("\n### Common touchpoints:\n");
		builder.append("* Avarage: " + (float) common / (float) total + "\n");
		builder.append("* Min: " + minCommon + "\n");
		builder.append("* Max: " + maxCommon + "\n");
		builder.append("\n### New touchpoints:\n");
		builder.append("* Avarage: " + (float) newtp / (float) total + "\n");
		builder.append("* Min: " + minNew + "\n");
		builder.append("* Max: " + maxNew + "\n");
		builder.append("\n### Unused touchpoints:\n");
		builder.append("* Avarage: " + (float) unused / (float) total + "\n");
		builder.append("* Min: " + minUnused + "\n");
		builder.append("* Max: " + maxUnused + "\n");
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toMarkdown() {
		StringBuilder builder = new StringBuilder();
		builder.append("## Journey Set\n\n");
		for (Journey j : this.getJourneys()){
			builder.append("* " + j.getID() + " " + j.getName());
		}
		return builder.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JourneymodelPackage.JOURNEY_SET__JOURNEYS:
				return ((InternalEList<?>)getJourneys()).basicRemove(otherEnd, msgs);
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
			case JourneymodelPackage.JOURNEY_SET__JOURNEYS:
				return getJourneys();
			case JourneymodelPackage.JOURNEY_SET__NAME:
				return getName();
			case JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY:
				if (resolve) return getExpectedJoruney();
				return basicGetExpectedJoruney();
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
			case JourneymodelPackage.JOURNEY_SET__JOURNEYS:
				getJourneys().clear();
				getJourneys().addAll((Collection<? extends Journey>)newValue);
				return;
			case JourneymodelPackage.JOURNEY_SET__NAME:
				setName((String)newValue);
				return;
			case JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY:
				setExpectedJoruney((Journey)newValue);
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
			case JourneymodelPackage.JOURNEY_SET__JOURNEYS:
				getJourneys().clear();
				return;
			case JourneymodelPackage.JOURNEY_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY:
				setExpectedJoruney((Journey)null);
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
			case JourneymodelPackage.JOURNEY_SET__JOURNEYS:
				return journeys != null && !journeys.isEmpty();
			case JourneymodelPackage.JOURNEY_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JourneymodelPackage.JOURNEY_SET__EXPECTED_JORUNEY:
				return expectedJoruney != null;
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
		result.append(')');
		return result.toString();
	}

} //JourneySetImpl
