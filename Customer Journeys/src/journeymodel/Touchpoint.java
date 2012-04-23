/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link journeymodel.Touchpoint#getID <em>ID</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getName <em>Name</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getDate <em>Date</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getDT1 <em>DT1</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getType <em>Type</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getComment <em>Comment</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getChannel <em>Channel</em>}</li>
 *   <li>{@link journeymodel.Touchpoint#getInitiator <em>Initiator</em>}</li>
 * </ul>
 * </p>
 *
 * @see journeymodel.JourneymodelPackage#getTouchpoint()
 * @model
 * @generated
 */
public interface Touchpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

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
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getName <em>Name</em>}' attribute.
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
	 * @see #setDate(Date)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

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
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_DT1()
	 * @model
	 * @generated
	 */
	String getDT1();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getDT1 <em>DT1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DT1</em>' attribute.
	 * @see #getDT1()
	 * @generated
	 */
	void setDT1(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link journeymodel.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see journeymodel.EType
	 * @see #setType(EType)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Type()
	 * @model
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see journeymodel.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

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
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * The literals are from the enumeration {@link journeymodel.EEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see journeymodel.EEvaluation
	 * @see #setEvaluation(EEvaluation)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Evaluation()
	 * @model
	 * @generated
	 */
	EEvaluation getEvaluation();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see journeymodel.EEvaluation
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(EEvaluation value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * The literals are from the enumeration {@link journeymodel.EChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see journeymodel.EChannel
	 * @see #setChannel(EChannel)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Channel()
	 * @model
	 * @generated
	 */
	EChannel getChannel();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see journeymodel.EChannel
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(EChannel value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' attribute.
	 * The literals are from the enumeration {@link journeymodel.EInitiator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' attribute.
	 * @see journeymodel.EInitiator
	 * @see #setInitiator(EInitiator)
	 * @see journeymodel.JourneymodelPackage#getTouchpoint_Initiator()
	 * @model
	 * @generated
	 */
	EInitiator getInitiator();

	/**
	 * Sets the value of the '{@link journeymodel.Touchpoint#getInitiator <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' attribute.
	 * @see journeymodel.EInitiator
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(EInitiator value);

} // Touchpoint
