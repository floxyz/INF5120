/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see journeymodel.JourneymodelPackage
 * @generated
 */
public interface JourneymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JourneymodelFactory eINSTANCE = journeymodel.impl.JourneymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey</em>'.
	 * @generated
	 */
	Journey createJourney();

	/**
	 * Returns a new object of class '<em>Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchpoint</em>'.
	 * @generated
	 */
	Touchpoint createTouchpoint();

	/**
	 * Returns a new object of class '<em>Journey Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Journey Set</em>'.
	 * @generated
	 */
	JourneySet createJourneySet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JourneymodelPackage getJourneymodelPackage();

} //JourneymodelFactory
