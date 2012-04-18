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
 * A representation of the literals of the enumeration '<em><b>EType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEType()
 * @model
 * @generated
 */
public final class EType extends AbstractEnumerator {
	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_LITERAL
	 * @model name="generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC = 0;

	/**
	 * The '<em><b>Adhoc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adhoc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADHOC_LITERAL
	 * @model name="adhoc"
	 * @generated
	 * @ordered
	 */
	public static final int ADHOC = 1;

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @generated
	 * @ordered
	 */
	public static final EType GENERIC_LITERAL = new EType(GENERIC, "generic", "generic");

	/**
	 * The '<em><b>Adhoc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADHOC
	 * @generated
	 * @ordered
	 */
	public static final EType ADHOC_LITERAL = new EType(ADHOC, "adhoc", "adhoc");

	/**
	 * An array of all the '<em><b>EType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EType[] VALUES_ARRAY =
		new EType[] {
			GENERIC_LITERAL,
			ADHOC_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EType get(int value) {
		switch (value) {
			case GENERIC: return GENERIC_LITERAL;
			case ADHOC: return ADHOC_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EType
