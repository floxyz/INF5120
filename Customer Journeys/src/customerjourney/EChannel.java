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
 * A representation of the literals of the enumeration '<em><b>EChannel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyPackage#getEChannel()
 * @model
 * @generated
 */
public final class EChannel extends AbstractEnumerator {
	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_LITERAL
	 * @model name="web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB = 0;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL_LITERAL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL = 1;

	/**
	 * The '<em><b>Sms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMS_LITERAL
	 * @model name="sms"
	 * @generated
	 * @ordered
	 */
	public static final int SMS = 2;

	/**
	 * The '<em><b>Self Service Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Self Service Machine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE_LITERAL
	 * @model name="selfServiceMachine"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_SERVICE_MACHINE = 3;

	/**
	 * The '<em><b>Face To Face</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face To Face</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE_LITERAL
	 * @model name="faceToFace"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_TO_FACE = 4;

	/**
	 * The '<em><b>Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONE_LITERAL
	 * @model name="phone"
	 * @generated
	 * @ordered
	 */
	public static final int PHONE = 5;

	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @generated
	 * @ordered
	 */
	public static final EChannel WEB_LITERAL = new EChannel(WEB, "web", "web");

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @generated
	 * @ordered
	 */
	public static final EChannel EMAIL_LITERAL = new EChannel(EMAIL, "email", "email");

	/**
	 * The '<em><b>Sms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS
	 * @generated
	 * @ordered
	 */
	public static final EChannel SMS_LITERAL = new EChannel(SMS, "sms", "sms");

	/**
	 * The '<em><b>Self Service Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE
	 * @generated
	 * @ordered
	 */
	public static final EChannel SELF_SERVICE_MACHINE_LITERAL = new EChannel(SELF_SERVICE_MACHINE, "selfServiceMachine", "selfServiceMachine");

	/**
	 * The '<em><b>Face To Face</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE
	 * @generated
	 * @ordered
	 */
	public static final EChannel FACE_TO_FACE_LITERAL = new EChannel(FACE_TO_FACE, "faceToFace", "faceToFace");

	/**
	 * The '<em><b>Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE
	 * @generated
	 * @ordered
	 */
	public static final EChannel PHONE_LITERAL = new EChannel(PHONE, "phone", "phone");

	/**
	 * An array of all the '<em><b>EChannel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EChannel[] VALUES_ARRAY =
		new EChannel[] {
			WEB_LITERAL,
			EMAIL_LITERAL,
			SMS_LITERAL,
			SELF_SERVICE_MACHINE_LITERAL,
			FACE_TO_FACE_LITERAL,
			PHONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EChannel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EChannel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EChannel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EChannel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EChannel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EChannel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EChannel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EChannel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EChannel get(int value) {
		switch (value) {
			case WEB: return WEB_LITERAL;
			case EMAIL: return EMAIL_LITERAL;
			case SMS: return SMS_LITERAL;
			case SELF_SERVICE_MACHINE: return SELF_SERVICE_MACHINE_LITERAL;
			case FACE_TO_FACE: return FACE_TO_FACE_LITERAL;
			case PHONE: return PHONE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EChannel(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EChannel
