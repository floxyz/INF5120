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
 * A representation of the literals of the enumeration '<em><b>EEvaluation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see journeymodel.JourneymodelPackage#getEEvaluation()
 * @model
 * @generated
 */
public enum EEvaluation implements Enumerator {
	/**
	 * The '<em><b>Good</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOD_VALUE
	 * @generated
	 * @ordered
	 */
	GOOD(0, "good", "good"),

	/**
	 * The '<em><b>Bad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_VALUE
	 * @generated
	 * @ordered
	 */
	BAD(1, "bad", "bad"),

	/**
	 * The '<em><b>Medium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "medium", "medium"),

	/**
	 * The '<em><b>Na</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(3, "na", "na"),

	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(4, "empty", "empty");

	/**
	 * The '<em><b>Good</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Good</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOD
	 * @model name="good"
	 * @generated
	 * @ordered
	 */
	public static final int GOOD_VALUE = 0;

	/**
	 * The '<em><b>Bad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD
	 * @model name="bad"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_VALUE = 1;

	/**
	 * The '<em><b>Medium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model name="medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>Na</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model name="na"
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 3;

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @model name="empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 4;

	/**
	 * An array of all the '<em><b>EEvaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEvaluation[] VALUES_ARRAY =
		new EEvaluation[] {
			GOOD,
			BAD,
			MEDIUM,
			NA,
			EMPTY,
		};

	/**
	 * A public read-only list of all the '<em><b>EEvaluation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEvaluation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case GOOD_VALUE: return GOOD;
			case BAD_VALUE: return BAD;
			case MEDIUM_VALUE: return MEDIUM;
			case NA_VALUE: return NA;
			case EMPTY_VALUE: return EMPTY;
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
	private EEvaluation(int value, String name, String literal) {
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
	
} //EEvaluation
