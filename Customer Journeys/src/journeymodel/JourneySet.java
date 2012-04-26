/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

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
 *   <li>{@link journeymodel.JourneySet#getJourneys <em>Journeys</em>}</li>
 *   <li>{@link journeymodel.JourneySet#getName <em>Name</em>}</li>
 *   <li>{@link journeymodel.JourneySet#getExpectedJoruney <em>Expected Joruney</em>}</li>
 * </ul>
 * </p>
 *
 * @see journeymodel.JourneymodelPackage#getJourneySet()
 * @model
 * @generated
 */
public interface JourneySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Journeys</b></em>' containment reference list.
	 * The list contents are of type {@link journeymodel.Journey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journeys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journeys</em>' containment reference list.
	 * @see journeymodel.JourneymodelPackage#getJourneySet_Journeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<Journey> getJourneys();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see journeymodel.JourneymodelPackage#getJourneySet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link journeymodel.JourneySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expected Joruney</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Joruney</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Joruney</em>' reference.
	 * @see #setExpectedJoruney(Journey)
	 * @see journeymodel.JourneymodelPackage#getJourneySet_ExpectedJoruney()
	 * @model
	 * @generated
	 */
	Journey getExpectedJoruney();

	/**
	 * Sets the value of the '{@link journeymodel.JourneySet#getExpectedJoruney <em>Expected Joruney</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Joruney</em>' reference.
	 * @see #getExpectedJoruney()
	 * @generated
	 */
	void setExpectedJoruney(Journey value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getComparedToExpected();

} // JourneySet
