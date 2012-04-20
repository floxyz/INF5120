/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EInitiator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see journeymodel.JourneymodelPackage#getEInitiator()
 * @model
 * @generated
 */
public enum EInitiator implements Enumerator {
	/**
	 * The '<em><b>Customer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER(0, "customer", "customer"),

	/**
	 * The '<em><b>Movie Agency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE_AGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	MOVIE_AGENCY(1, "movieAgency", "movieAgency"),

	/**
	 * The '<em><b>Movie Employee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIE_EMPLOYEE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVIE_EMPLOYEE(2, "movieEmployee", "movieEmployee");

	/**
	 * The '<em><b>Customer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Customer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER
	 * @model name="customer"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_VALUE = 0;

	/**
	 * The '<em><b>Movie Agency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Movie Agency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIE_AGENCY
	 * @model name="movieAgency"
	 * @generated
	 * @ordered
	 */
	public static final int MOVIE_AGENCY_VALUE = 1;

	/**
	 * The '<em><b>Movie Employee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Movie Employee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIE_EMPLOYEE
	 * @model name="movieEmployee"
	 * @generated
	 * @ordered
	 */
	public static final int MOVIE_EMPLOYEE_VALUE = 2;

	/**
	 * An array of all the '<em><b>EInitiator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EInitiator[] VALUES_ARRAY =
		new EInitiator[] {
			CUSTOMER,
			MOVIE_AGENCY,
			MOVIE_EMPLOYEE,
		};

	/**
	 * A public read-only list of all the '<em><b>EInitiator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EInitiator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case CUSTOMER_VALUE: return CUSTOMER;
			case MOVIE_AGENCY_VALUE: return MOVIE_AGENCY;
			case MOVIE_EMPLOYEE_VALUE: return MOVIE_EMPLOYEE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EInitiator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EInitiator
