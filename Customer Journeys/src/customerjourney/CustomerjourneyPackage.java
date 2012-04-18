/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see customerjourney.CustomerjourneyFactory
 * @model kind="package"
 * @generated
 */
public interface CustomerjourneyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customerjourney";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://customerjourney/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "customerjourney";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomerjourneyPackage eINSTANCE = customerjourney.impl.CustomerjourneyPackageImpl.init();

	/**
	 * The meta object id for the '{@link customerjourney.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.impl.CustomerJourneyImpl
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getCustomerJourney()
	 * @generated
	 */
	int CUSTOMER_JOURNEY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__DATE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__EREFERENCE0 = 5;

	/**
	 * The feature id for the '<em><b>Touchpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY__TOUCHPOINTS = 6;

	/**
	 * The number of structural features of the '<em>Customer Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_JOURNEY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link customerjourney.impl.TouchpointImpl <em>Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.impl.TouchpointImpl
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getTouchpoint()
	 * @generated
	 */
	int TOUCHPOINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__DATE = 1;

	/**
	 * The feature id for the '<em><b>DT1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__DT1 = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__EVALUATION = 5;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__CHANNEL = 6;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__INITIATOR = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__STATUS = 8;

	/**
	 * The number of structural features of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link customerjourney.EStatus <em>EStatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.EStatus
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEStatus()
	 * @generated
	 */
	int ESTATUS = 2;

	/**
	 * The meta object id for the '{@link customerjourney.EChannel <em>EChannel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.EChannel
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEChannel()
	 * @generated
	 */
	int ECHANNEL = 3;

	/**
	 * The meta object id for the '{@link customerjourney.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.EType
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 4;

	/**
	 * The meta object id for the '{@link customerjourney.EInitiator <em>EInitiator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customerjourney.EInitiator
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEInitiator()
	 * @generated
	 */
	int EINITIATOR = 5;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see customerjourney.impl.CustomerjourneyPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 6;


	/**
	 * Returns the meta object for class '{@link customerjourney.CustomerJourney <em>Customer Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Journey</em>'.
	 * @see customerjourney.CustomerJourney
	 * @generated
	 */
	EClass getCustomerJourney();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.CustomerJourney#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see customerjourney.CustomerJourney#getID()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_ID();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.CustomerJourney#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customerjourney.CustomerJourney#getName()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_Name();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.CustomerJourney#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see customerjourney.CustomerJourney#getDate()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_Date();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.CustomerJourney#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see customerjourney.CustomerJourney#getStatus()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_Status();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.CustomerJourney#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see customerjourney.CustomerJourney#getComment()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EAttribute getCustomerJourney_Comment();

	/**
	 * Returns the meta object for the reference '{@link customerjourney.CustomerJourney#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see customerjourney.CustomerJourney#getEReference0()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_EReference0();

	/**
	 * Returns the meta object for the containment reference list '{@link customerjourney.CustomerJourney#getTouchpoints <em>Touchpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchpoints</em>'.
	 * @see customerjourney.CustomerJourney#getTouchpoints()
	 * @see #getCustomerJourney()
	 * @generated
	 */
	EReference getCustomerJourney_Touchpoints();

	/**
	 * Returns the meta object for class '{@link customerjourney.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchpoint</em>'.
	 * @see customerjourney.Touchpoint
	 * @generated
	 */
	EClass getTouchpoint();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customerjourney.Touchpoint#getName()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see customerjourney.Touchpoint#getDate()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Date();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getDT1 <em>DT1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DT1</em>'.
	 * @see customerjourney.Touchpoint#getDT1()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_DT1();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see customerjourney.Touchpoint#getType()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Type();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see customerjourney.Touchpoint#getComment()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Comment();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation</em>'.
	 * @see customerjourney.Touchpoint#getEvaluation()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Evaluation();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see customerjourney.Touchpoint#getChannel()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Channel();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator</em>'.
	 * @see customerjourney.Touchpoint#getInitiator()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Initiator();

	/**
	 * Returns the meta object for the attribute '{@link customerjourney.Touchpoint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see customerjourney.Touchpoint#getStatus()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Status();

	/**
	 * Returns the meta object for enum '{@link customerjourney.EStatus <em>EStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStatus</em>'.
	 * @see customerjourney.EStatus
	 * @generated
	 */
	EEnum getEStatus();

	/**
	 * Returns the meta object for enum '{@link customerjourney.EChannel <em>EChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EChannel</em>'.
	 * @see customerjourney.EChannel
	 * @generated
	 */
	EEnum getEChannel();

	/**
	 * Returns the meta object for enum '{@link customerjourney.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see customerjourney.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link customerjourney.EInitiator <em>EInitiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInitiator</em>'.
	 * @see customerjourney.EInitiator
	 * @generated
	 */
	EEnum getEInitiator();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomerjourneyFactory getCustomerjourneyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link customerjourney.impl.CustomerJourneyImpl <em>Customer Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.impl.CustomerJourneyImpl
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getCustomerJourney()
		 * @generated
		 */
		EClass CUSTOMER_JOURNEY = eINSTANCE.getCustomerJourney();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__ID = eINSTANCE.getCustomerJourney_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__NAME = eINSTANCE.getCustomerJourney_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__DATE = eINSTANCE.getCustomerJourney_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__STATUS = eINSTANCE.getCustomerJourney_Status();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_JOURNEY__COMMENT = eINSTANCE.getCustomerJourney_Comment();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__EREFERENCE0 = eINSTANCE.getCustomerJourney_EReference0();

		/**
		 * The meta object literal for the '<em><b>Touchpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_JOURNEY__TOUCHPOINTS = eINSTANCE.getCustomerJourney_Touchpoints();

		/**
		 * The meta object literal for the '{@link customerjourney.impl.TouchpointImpl <em>Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.impl.TouchpointImpl
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getTouchpoint()
		 * @generated
		 */
		EClass TOUCHPOINT = eINSTANCE.getTouchpoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__NAME = eINSTANCE.getTouchpoint_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__DATE = eINSTANCE.getTouchpoint_Date();

		/**
		 * The meta object literal for the '<em><b>DT1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__DT1 = eINSTANCE.getTouchpoint_DT1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__TYPE = eINSTANCE.getTouchpoint_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__COMMENT = eINSTANCE.getTouchpoint_Comment();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__EVALUATION = eINSTANCE.getTouchpoint_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__CHANNEL = eINSTANCE.getTouchpoint_Channel();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__INITIATOR = eINSTANCE.getTouchpoint_Initiator();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__STATUS = eINSTANCE.getTouchpoint_Status();

		/**
		 * The meta object literal for the '{@link customerjourney.EStatus <em>EStatus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.EStatus
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEStatus()
		 * @generated
		 */
		EEnum ESTATUS = eINSTANCE.getEStatus();

		/**
		 * The meta object literal for the '{@link customerjourney.EChannel <em>EChannel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.EChannel
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEChannel()
		 * @generated
		 */
		EEnum ECHANNEL = eINSTANCE.getEChannel();

		/**
		 * The meta object literal for the '{@link customerjourney.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.EType
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link customerjourney.EInitiator <em>EInitiator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customerjourney.EInitiator
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getEInitiator()
		 * @generated
		 */
		EEnum EINITIATOR = eINSTANCE.getEInitiator();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see customerjourney.impl.CustomerjourneyPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //CustomerjourneyPackage
