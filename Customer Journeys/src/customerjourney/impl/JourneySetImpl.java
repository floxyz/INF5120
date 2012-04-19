/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney.impl;

import customerjourney.CustomerJourney;
import customerjourney.CustomerjourneyPackage;
import customerjourney.JourneySet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link customerjourney.impl.JourneySetImpl#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link customerjourney.impl.JourneySetImpl#getSetName <em>Set Name</em>}</li>
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
	protected EList journeys;

	/**
	 * The default value of the '{@link #getSetName() <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSetName() <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetName()
	 * @generated
	 * @ordered
	 */
	protected String setName = SET_NAME_EDEFAULT;

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
	protected EClass eStaticClass() {
		return CustomerjourneyPackage.Literals.JOURNEY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJourneys() {
		if (journeys == null) {
			journeys = new EObjectContainmentEList(CustomerJourney.class, this, CustomerjourneyPackage.JOURNEY_SET__JOURNEYS);
		}
		return journeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetName() {
		return setName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetName(String newSetName) {
		String oldSetName = setName;
		setName = newSetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomerjourneyPackage.JOURNEY_SET__SET_NAME, oldSetName, setName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomerjourneyPackage.JOURNEY_SET__JOURNEYS:
				return ((InternalEList)getJourneys()).basicRemove(otherEnd, msgs);
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
			case CustomerjourneyPackage.JOURNEY_SET__JOURNEYS:
				return getJourneys();
			case CustomerjourneyPackage.JOURNEY_SET__SET_NAME:
				return getSetName();
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
			case CustomerjourneyPackage.JOURNEY_SET__JOURNEYS:
				getJourneys().clear();
				getJourneys().addAll((Collection)newValue);
				return;
			case CustomerjourneyPackage.JOURNEY_SET__SET_NAME:
				setSetName((String)newValue);
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
			case CustomerjourneyPackage.JOURNEY_SET__JOURNEYS:
				getJourneys().clear();
				return;
			case CustomerjourneyPackage.JOURNEY_SET__SET_NAME:
				setSetName(SET_NAME_EDEFAULT);
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
			case CustomerjourneyPackage.JOURNEY_SET__JOURNEYS:
				return journeys != null && !journeys.isEmpty();
			case CustomerjourneyPackage.JOURNEY_SET__SET_NAME:
				return SET_NAME_EDEFAULT == null ? setName != null : !SET_NAME_EDEFAULT.equals(setName);
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
		result.append(" (setName: ");
		result.append(setName);
		result.append(')');
		return result.toString();
	}

} //JourneySetImpl
