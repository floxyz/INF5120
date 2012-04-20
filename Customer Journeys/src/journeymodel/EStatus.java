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
 * A representation of the literals of the enumeration '<em><b>EStatus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see journeymodel.JourneymodelPackage#getEStatus()
 * @model
 * @generated
 */
public enum EStatus implements Enumerator {
	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(0, "completed", "completed"),

	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(1, "aborted", "aborted"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(2, "inProgress", "inProgress");

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 0;

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aborted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @model name="aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 1;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Progress</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 2;

	/**
	 * An array of all the '<em><b>EStatus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EStatus[] VALUES_ARRAY =
		new EStatus[] {
			COMPLETED,
			ABORTED,
			IN_PROGRESS,
		};

	/**
	 * A public read-only list of all the '<em><b>EStatus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EStatus</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStatus</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStatus</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EStatus get(int value) {
		switch (value) {
			case COMPLETED_VALUE: return COMPLETED;
			case ABORTED_VALUE: return ABORTED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
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
	private EStatus(int value, String name, String literal) {
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
	
} //EStatus
