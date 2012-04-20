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
 * A test suite for the '<em><b>JourneyModel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyModelAllTests extends TestSuite {

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
		TestSuite suite = new JourneyModelAllTests("JourneyModel Tests");
		suite.addTest(JourneymodelTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyModelAllTests(String name) {
		super(name);
	}

} //JourneyModelAllTests
