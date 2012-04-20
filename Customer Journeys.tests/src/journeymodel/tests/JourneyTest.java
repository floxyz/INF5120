/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.tests;

import journeymodel.Journey;
import journeymodel.JourneymodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyTest extends TestCase {

	/**
	 * The fixture for this Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Journey fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JourneyTest.class);
	}

	/**
	 * Constructs a new Journey test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Journey fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Journey test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Journey getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JourneymodelFactory.eINSTANCE.createJourney());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //JourneyTest
