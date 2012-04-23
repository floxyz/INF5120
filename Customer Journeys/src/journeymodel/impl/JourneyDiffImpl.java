/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import journeymodel.JourneyDiff;
import journeymodel.JourneymodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link journeymodel.impl.JourneyDiffImpl#getCommonTP <em>Common TP</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyDiffImpl#getUnusedTP <em>Unused TP</em>}</li>
 *   <li>{@link journeymodel.impl.JourneyDiffImpl#getNewTP <em>New TP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JourneyDiffImpl extends EObjectImpl implements JourneyDiff {
	/**
	 * The default value of the '{@link #getCommonTP() <em>Common TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonTP()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMON_TP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommonTP() <em>Common TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonTP()
	 * @generated
	 * @ordered
	 */
	protected int commonTP = COMMON_TP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnusedTP() <em>Unused TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedTP()
	 * @generated
	 * @ordered
	 */
	protected static final int UNUSED_TP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnusedTP() <em>Unused TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedTP()
	 * @generated
	 * @ordered
	 */
	protected int unusedTP = UNUSED_TP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewTP() <em>New TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTP()
	 * @generated
	 * @ordered
	 */
	protected static final int NEW_TP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNewTP() <em>New TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTP()
	 * @generated
	 * @ordered
	 */
	protected int newTP = NEW_TP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JourneymodelPackage.Literals.JOURNEY_DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommonTP() {
		return commonTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonTP(int newCommonTP) {
		int oldCommonTP = commonTP;
		commonTP = newCommonTP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY_DIFF__COMMON_TP, oldCommonTP, commonTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnusedTP() {
		return unusedTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnusedTP(int newUnusedTP) {
		int oldUnusedTP = unusedTP;
		unusedTP = newUnusedTP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY_DIFF__UNUSED_TP, oldUnusedTP, unusedTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNewTP() {
		return newTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTP(int newNewTP) {
		int oldNewTP = newTP;
		newTP = newNewTP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JourneymodelPackage.JOURNEY_DIFF__NEW_TP, oldNewTP, newTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JourneymodelPackage.JOURNEY_DIFF__COMMON_TP:
				return getCommonTP();
			case JourneymodelPackage.JOURNEY_DIFF__UNUSED_TP:
				return getUnusedTP();
			case JourneymodelPackage.JOURNEY_DIFF__NEW_TP:
				return getNewTP();
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
			case JourneymodelPackage.JOURNEY_DIFF__COMMON_TP:
				setCommonTP((Integer)newValue);
				return;
			case JourneymodelPackage.JOURNEY_DIFF__UNUSED_TP:
				setUnusedTP((Integer)newValue);
				return;
			case JourneymodelPackage.JOURNEY_DIFF__NEW_TP:
				setNewTP((Integer)newValue);
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
			case JourneymodelPackage.JOURNEY_DIFF__COMMON_TP:
				setCommonTP(COMMON_TP_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY_DIFF__UNUSED_TP:
				setUnusedTP(UNUSED_TP_EDEFAULT);
				return;
			case JourneymodelPackage.JOURNEY_DIFF__NEW_TP:
				setNewTP(NEW_TP_EDEFAULT);
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
			case JourneymodelPackage.JOURNEY_DIFF__COMMON_TP:
				return commonTP != COMMON_TP_EDEFAULT;
			case JourneymodelPackage.JOURNEY_DIFF__UNUSED_TP:
				return unusedTP != UNUSED_TP_EDEFAULT;
			case JourneymodelPackage.JOURNEY_DIFF__NEW_TP:
				return newTP != NEW_TP_EDEFAULT;
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
		result.append(" (commonTP: ");
		result.append(commonTP);
		result.append(", unusedTP: ");
		result.append(unusedTP);
		result.append(", newTP: ");
		result.append(newTP);
		result.append(')');
		return result.toString();
	}

} //JourneyDiffImpl
