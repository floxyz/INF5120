/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney.tests;

import customerjourney.CustomerJourney;
import customerjourney.CustomerjourneyFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer Journey</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerJourneyTest extends TestCase {

	/**
	 * The fixture for this Customer Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerJourney fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerJourneyTest.class);
	}

	/**
	 * Constructs a new Customer Journey test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerJourneyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Customer Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CustomerJourney fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Customer Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CustomerJourney getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(CustomerjourneyFactory.eINSTANCE.createCustomerJourney());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CustomerJourneyTest
