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
 * A representation of the literals of the enumeration '<em><b>EStatus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEStatus()
 * @model
 * @generated
 */
public final class EStatus extends AbstractEnumerator {
	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_LITERAL
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED = 0;

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aborted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTED_LITERAL
	 * @model name="aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED = 1;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Progress</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_LITERAL
	 * @model name="inProgress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS = 2;

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @generated
	 * @ordered
	 */
	public static final EStatus COMPLETED_LITERAL = new EStatus(COMPLETED, "completed", "completed");

	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @generated
	 * @ordered
	 */
	public static final EStatus ABORTED_LITERAL = new EStatus(ABORTED, "aborted", "aborted");

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @generated
	 * @ordered
	 */
	public static final EStatus IN_PROGRESS_LITERAL = new EStatus(IN_PROGRESS, "inProgress", "inProgress");

	/**
	 * An array of all the '<em><b>EStatus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EStatus[] VALUES_ARRAY =
		new EStatus[] {
			COMPLETED_LITERAL,
			ABORTED_LITERAL,
			IN_PROGRESS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EStatus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case COMPLETED: return COMPLETED_LITERAL;
			case ABORTED: return ABORTED_LITERAL;
			case IN_PROGRESS: return IN_PROGRESS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EStatus(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EStatus
