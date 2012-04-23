/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.tests;

import journeymodel.JourneySet;
import journeymodel.JourneymodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Journey Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneySetTest extends TestCase {

	/**
	 * The fixture for this Journey Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneySet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JourneySetTest.class);
	}

	/**
	 * Constructs a new Journey Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneySetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Journey Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JourneySet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Journey Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneySet getFixture() {
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
		setFixture(JourneymodelFactory.eINSTANCE.createJourneySet());
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

} //JourneySetTest