/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage
 * @generated
 */
public interface CustomerjourneyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomerjourneyFactory eINSTANCE = customerjourney.impl.CustomerjourneyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customer Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Journey</em>'.
	 * @generated
	 */
	CustomerJourney createCustomerJourney();

	/**
	 * Returns a new object of class '<em>Touchpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touchpoint</em>'.
	 * @generated
	 */
	Touchpoint createTouchpoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomerjourneyPackage getCustomerjourneyPackage();

} //CustomerjourneyFactory
