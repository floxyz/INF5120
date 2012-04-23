/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link journeymodel.JourneyDiff#getCommonTP <em>Common TP</em>}</li>
 *   <li>{@link journeymodel.JourneyDiff#getUnusedTP <em>Unused TP</em>}</li>
 *   <li>{@link journeymodel.JourneyDiff#getNewTP <em>New TP</em>}</li>
 * </ul>
 * </p>
 *
 * @see journeymodel.JourneymodelPackage#getJourneyDiff()
 * @model
 * @generated
 */
public interface JourneyDiff extends EObject {
	/**
	 * Returns the value of the '<em><b>Common TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common TP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common TP</em>' attribute.
	 * @see #setCommonTP(int)
	 * @see journeymodel.JourneymodelPackage#getJourneyDiff_CommonTP()
	 * @model
	 * @generated
	 */
	int getCommonTP();

	/**
	 * Sets the value of the '{@link journeymodel.JourneyDiff#getCommonTP <em>Common TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common TP</em>' attribute.
	 * @see #getCommonTP()
	 * @generated
	 */
	void setCommonTP(int value);

	/**
	 * Returns the value of the '<em><b>Unused TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused TP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused TP</em>' attribute.
	 * @see #setUnusedTP(int)
	 * @see journeymodel.JourneymodelPackage#getJourneyDiff_UnusedTP()
	 * @model
	 * @generated
	 */
	int getUnusedTP();

	/**
	 * Sets the value of the '{@link journeymodel.JourneyDiff#getUnusedTP <em>Unused TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unused TP</em>' attribute.
	 * @see #getUnusedTP()
	 * @generated
	 */
	void setUnusedTP(int value);

	/**
	 * Returns the value of the '<em><b>New TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New TP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New TP</em>' attribute.
	 * @see #setNewTP(int)
	 * @see journeymodel.JourneymodelPackage#getJourneyDiff_NewTP()
	 * @model
	 * @generated
	 */
	int getNewTP();

	/**
	 * Sets the value of the '{@link journeymodel.JourneyDiff#getNewTP <em>New TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New TP</em>' attribute.
	 * @see #getNewTP()
	 * @generated
	 */
	void setNewTP(int value);

} // JourneyDiff
