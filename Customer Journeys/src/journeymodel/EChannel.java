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
 * A representation of the literals of the enumeration '<em><b>EChannel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see journeymodel.JourneymodelPackage#getEChannel()
 * @model
 * @generated
 */
public enum EChannel implements Enumerator {
	/**
	 * The '<em><b>Web</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_VALUE
	 * @generated
	 * @ordered
	 */
	WEB(0, "web", "web"),

	/**
	 * The '<em><b>Email</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAIL_VALUE
	 * @generated
	 * @ordered
	 */
	EMAIL(1, "email", "email"),

	/**
	 * The '<em><b>Sms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_VALUE
	 * @generated
	 * @ordered
	 */
	SMS(2, "sms", "sms"),

	/**
	 * The '<em><b>Self Service Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	SELF_SERVICE_MACHINE(3, "selfServiceMachine", "selfServiceMachine"),

	/**
	 * The '<em><b>Face To Face</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE_VALUE
	 * @generated
	 * @ordered
	 */
	FACE_TO_FACE(4, "faceToFace", "faceToFace"),

	/**
	 * The '<em><b>Phone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE(5, "phone", "phone");

	/**
	 * The '<em><b>Web</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB
	 * @model name="web"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_VALUE = 0;

	/**
	 * The '<em><b>Email</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMAIL
	 * @model name="email"
	 * @generated
	 * @ordered
	 */
	public static final int EMAIL_VALUE = 1;

	/**
	 * The '<em><b>Sms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sms</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMS
	 * @model name="sms"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_VALUE = 2;

	/**
	 * The '<em><b>Self Service Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Self Service Machine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELF_SERVICE_MACHINE
	 * @model name="selfServiceMachine"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_SERVICE_MACHINE_VALUE = 3;

	/**
	 * The '<em><b>Face To Face</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Face To Face</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACE_TO_FACE
	 * @model name="faceToFace"
	 * @generated
	 * @ordered
	 */
	public static final int FACE_TO_FACE_VALUE = 4;

	/**
	 * The '<em><b>Phone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONE
	 * @model name="phone"
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_VALUE = 5;

	/**
	 * An array of all the '<em><b>EChannel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EChannel[] VALUES_ARRAY =
		new EChannel[] {
			WEB,
			EMAIL,
			SMS,
			SELF_SERVICE_MACHINE,
			FACE_TO_FACE,
			PHONE,
		};

	/**
	 * A public read-only list of all the '<em><b>EChannel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EChannel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case WEB_VALUE: return WEB;
			case EMAIL_VALUE: return EMAIL;
			case SMS_VALUE: return SMS;
			case SELF_SERVICE_MACHINE_VALUE: return SELF_SERVICE_MACHINE;
			case FACE_TO_FACE_VALUE: return FACE_TO_FACE;
			case PHONE_VALUE: return PHONE;
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
	private EChannel(int value, String name, String literal) {
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
	
} //EChannel
