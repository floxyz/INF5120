/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>journeymodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneymodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new JourneymodelTests("journeymodel Tests");
		suite.addTestSuite(JourneyTest.class);
		suite.addTestSuite(JourneySetTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneymodelTests(String name) {
		super(name);
	}

} //JourneymodelTests
