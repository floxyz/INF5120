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
 * A representation of the literals of the enumeration '<em><b>EEvaluation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEEvaluation()
 * @model
 * @generated
 */
public final class EEvaluation extends AbstractEnumerator {
	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Good</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOD_LITERAL
	 * @model name="good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD = 0;

	/**
	 * The '<em><b>Bad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_LITERAL
	 * @model name="bad"
	 * @generated
	 * @ordered
	 */
	public static final int BAD = 1;

	/**
	 * The '<em><b>Medium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_LITERAL
	 * @model name="medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM = 2;

	/**
	 * The '<em><b>Na</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA_LITERAL
	 * @model name="na"
	 * @generated
	 * @ordered
	 */
	public static final int NA = 3;

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY_LITERAL
	 * @model name="empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY = 4;

	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @generated
	 * @ordered
	 */
	public static final EEvaluation GOOD_LITERAL = new EEvaluation(GOOD, "good", "good");

	/**
	 * The '<em><b>Bad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD
	 * @generated
	 * @ordered
	 */
	public static final EEvaluation BAD_LITERAL = new EEvaluation(BAD, "bad", "bad");

	/**
	 * The '<em><b>Medium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @generated
	 * @ordered
	 */
	public static final EEvaluation MEDIUM_LITERAL = new EEvaluation(MEDIUM, "medium", "medium");

	/**
	 * The '<em><b>Na</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @generated
	 * @ordered
	 */
	public static final EEvaluation NA_LITERAL = new EEvaluation(NA, "na", "na");

	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @generated
	 * @ordered
	 */
	public static final EEvaluation EMPTY_LITERAL = new EEvaluation(EMPTY, "empty", "empty");

	/**
	 * An array of all the '<em><b>EEvaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEvaluation[] VALUES_ARRAY =
		new EEvaluation[] {
			GOOD_LITERAL,
			BAD_LITERAL,
			MEDIUM_LITERAL,
			NA_LITERAL,
			EMPTY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EEvaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEvaluation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEvaluation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEvaluation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEvaluation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEvaluation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEvaluation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEvaluation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEvaluation get(int value) {
		switch (value) {
			case GOOD: return GOOD_LITERAL;
			case BAD: return BAD_LITERAL;
			case MEDIUM: return MEDIUM_LITERAL;
			case NA: return NA_LITERAL;
			case EMPTY: return EMPTY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEvaluation(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EEvaluation
