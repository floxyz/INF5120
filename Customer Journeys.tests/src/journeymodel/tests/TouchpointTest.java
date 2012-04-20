/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.tests;

import journeymodel.JourneymodelFactory;
import journeymodel.Touchpoint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchpointTest extends TestCase {

	/**
	 * The fixture for this Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Touchpoint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TouchpointTest.class);
	}

	/**
	 * Constructs a new Touchpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchpointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Touchpoint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Touchpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Touchpoint getFixture() {
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
		setFixture(JourneymodelFactory.eINSTANCE.createTouchpoint());
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

} //TouchpointTest
