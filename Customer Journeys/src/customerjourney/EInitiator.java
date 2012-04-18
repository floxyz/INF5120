/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EInitiator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEInitiator()
 * @model
 * @generated
 */
public final class EInitiator extends AbstractEnumerator {
	/**
	 * The '<em><b>Customer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Customer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_LITERAL
	 * @model name="customer"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER = 0;

	/**
	 * The '<em><b>Movie Agency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Movie Agency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIE_AGENCY_LITERAL
	 * @model name="movieAgency"
	 * @generated
	 * @ordered
	 */
	public static final int MOVIE_AGENCY = 1;

	/**
	 * The '<em><b>Movie Employee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Movie Employee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIE_EMPLOYEE_LITERAL
	 * @model name="movieEmployee"
	 * @generated
	 * @ordered
	 */
	public static final int MOVIE_EMPLOYEE = 2;

	/**
	 * The '<em><b>Customer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER
	 * @generated
	 * @ordered
	 */
	public static final EInitiator CUSTOMER_LITERAL = new EInitiator(CUSTOMER, "customer", "customer");

	/**
	 * The '<em><b>Movie Agency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE_AGENCY
	 * @generated
	 * @ordered
	 */
	public static final EInitiator MOVIE_AGENCY_LITERAL = new EInitiator(MOVIE_AGENCY, "movieAgency", "movieAgency");

	/**
	 * The '<em><b>Movie Employee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE_EMPLOYEE
	 * @generated
	 * @ordered
	 */
	public static final EInitiator MOVIE_EMPLOYEE_LITERAL = new EInitiator(MOVIE_EMPLOYEE, "movieEmployee", "movieEmployee");

	/**
	 * An array of all the '<em><b>EInitiator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EInitiator[] VALUES_ARRAY =
		new EInitiator[] {
			CUSTOMER_LITERAL,
			MOVIE_AGENCY_LITERAL,
			MOVIE_EMPLOYEE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EInitiator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EInitiator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInitiator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInitiator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInitiator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInitiator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInitiator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInitiator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInitiator get(int value) {
		switch (value) {
			case CUSTOMER: return CUSTOMER_LITERAL;
			case MOVIE_AGENCY: return MOVIE_AGENCY_LITERAL;
			case MOVIE_EMPLOYEE: return MOVIE_EMPLOYEE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EInitiator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EInitiator
