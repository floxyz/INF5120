/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link customerjourney.Touchpoint#getName <em>Name</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getDate <em>Date</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getDT1 <em>DT1</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getType <em>Type</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getChannel <em>Channel</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getComment <em>Comment</em>}</li>
 *   <li>{@link customerjourney.Touchpoint#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see customerjourney.CustomerjourneyPackage#getTouchpoint()
 * @model
 * @generated
 */
public interface Touchpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Calendar)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Date()
	 * @model dataType="customerjourney.Calendar"
	 * @generated
	 */
	Calendar getDate();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>DT1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DT1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DT1</em>' attribute.
	 * @see #setDT1(String)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_DT1()
	 * @model
	 * @generated
	 */
	String getDT1();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getDT1 <em>DT1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DT1</em>' attribute.
	 * @see #getDT1()
	 * @generated
	 */
	void setDT1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference.
	 * @see #setChannel(Channel)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Channel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Channel getChannel();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getChannel <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' containment reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Channel value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' containment reference.
	 * @see #setInitiator(Initiator)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Initiator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Initiator getInitiator();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getInitiator <em>Initiator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' containment reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(Initiator value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see #setEvaluation(Integer)
	 * @see customerjourney.CustomerjourneyPackage#getTouchpoint_Evaluation()
	 * @model
	 * @generated
	 */
	Integer getEvaluation();

	/**
	 * Sets the value of the '{@link customerjourney.Touchpoint#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Integer value);

} // Touchpoint
