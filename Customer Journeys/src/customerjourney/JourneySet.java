/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link customerjourney.JourneySet#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link customerjourney.JourneySet#getSetName <em>Set Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see customerjourney.CustomerjourneyPackage#getJourneySet()
 * @model
 * @generated
 */
public interface JourneySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Journeys</b></em>' containment reference list.
	 * The list contents are of type {@link customerjourney.CustomerJourney}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journeys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journeys</em>' containment reference list.
	 * @see customerjourney.CustomerjourneyPackage#getJourneySet_Journeys()
	 * @model type="customerjourney.CustomerJourney" containment="true"
	 * @generated
	 */
	EList getJourneys();

	/**
	 * Returns the value of the '<em><b>Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Name</em>' attribute.
	 * @see #setSetName(String)
	 * @see customerjourney.CustomerjourneyPackage#getJourneySet_SetName()
	 * @model
	 * @generated
	 */
	String getSetName();

	/**
	 * Sets the value of the '{@link customerjourney.JourneySet#getSetName <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Name</em>' attribute.
	 * @see #getSetName()
	 * @generated
	 */
	void setSetName(String value);

} // JourneySet
