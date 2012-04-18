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
 * A representation of the literals of the enumeration '<em><b>EEnum0</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEEnum0()
 * @model
 * @generated
 */
public final class EEnum0 extends AbstractEnumerator {
	/**
	 * An array of all the '<em><b>EEnum0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEnum0[] VALUES_ARRAY =
		new EEnum0[] {
		};

	/**
	 * A public read-only list of all the '<em><b>EEnum0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEnum0</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnum0 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnum0 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum0</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnum0 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnum0 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum0</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnum0 get(int value) {
		switch (value) {
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum0(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EEnum0
