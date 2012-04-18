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
	 * The '<em><b>Selfservice Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selfservice Machine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELFSERVICE_MACHINE_LITERAL
	 * @model name="selfserviceMachine"
	 * @generated
	 * @ordered
	 */
	public static final int SELFSERVICE_MACHINE = 3;

	/**
	 * The '<em><b>Facetoface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Facetoface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACETOFACE_LITERAL
	 * @model name="facetoface"
	 * @generated
	 * @ordered
	 */
	public static final int FACETOFACE = 4;

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
	 * The '<em><b>Selfservice Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELFSERVICE_MACHINE
	 * @generated
	 * @ordered
	 */
	public static final EChannel SELFSERVICE_MACHINE_LITERAL = new EChannel(SELFSERVICE_MACHINE, "selfserviceMachine", "selfserviceMachine");

	/**
	 * The '<em><b>Facetoface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACETOFACE
	 * @generated
	 * @ordered
	 */
	public static final EChannel FACETOFACE_LITERAL = new EChannel(FACETOFACE, "facetoface", "facetoface");

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
			SELFSERVICE_MACHINE_LITERAL,
			FACETOFACE_LITERAL,
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
			case SELFSERVICE_MACHINE: return SELFSERVICE_MACHINE_LITERAL;
			case FACETOFACE: return FACETOFACE_LITERAL;
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
