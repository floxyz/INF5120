/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel;

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
 * @see journeymodel.JourneymodelFactory
 * @model kind="package"
 * @generated
 */
public interface JourneymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "journeymodel";

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
	String eNS_PREFIX = "journeymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JourneymodelPackage eINSTANCE = journeymodel.impl.JourneymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link journeymodel.impl.JourneyImpl <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.impl.JourneyImpl
	 * @see journeymodel.impl.JourneymodelPackageImpl#getJourney()
	 * @generated
	 */
	int JOURNEY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__DATE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__EREFERENCE0 = 5;

	/**
	 * The feature id for the '<em><b>Touchpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__TOUCHPOINTS = 6;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link journeymodel.impl.TouchpointImpl <em>Touchpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.impl.TouchpointImpl
	 * @see journeymodel.impl.JourneymodelPackageImpl#getTouchpoint()
	 * @generated
	 */
	int TOUCHPOINT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__DATE = 2;

	/**
	 * The feature id for the '<em><b>DT1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__DT1 = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__EVALUATION = 6;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__CHANNEL = 7;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT__INITIATOR = 8;

	/**
	 * The number of structural features of the '<em>Touchpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCHPOINT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link journeymodel.impl.JourneySetImpl <em>Journey Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.impl.JourneySetImpl
	 * @see journeymodel.impl.JourneymodelPackageImpl#getJourneySet()
	 * @generated
	 */
	int JOURNEY_SET = 2;

	/**
	 * The feature id for the '<em><b>Journeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_SET__JOURNEYS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_SET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Expected Joruney</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_SET__EXPECTED_JORUNEY = 2;

	/**
	 * The number of structural features of the '<em>Journey Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link journeymodel.impl.JourneyDiffImpl <em>Journey Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.impl.JourneyDiffImpl
	 * @see journeymodel.impl.JourneymodelPackageImpl#getJourneyDiff()
	 * @generated
	 */
	int JOURNEY_DIFF = 3;

	/**
	 * The feature id for the '<em><b>Common TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_DIFF__COMMON_TP = 0;

	/**
	 * The feature id for the '<em><b>Unused TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_DIFF__UNUSED_TP = 1;

	/**
	 * The feature id for the '<em><b>New TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_DIFF__NEW_TP = 2;

	/**
	 * The number of structural features of the '<em>Journey Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_DIFF_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link journeymodel.EStatus <em>EStatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EStatus
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEStatus()
	 * @generated
	 */
	int ESTATUS = 4;

	/**
	 * The meta object id for the '{@link journeymodel.EChannel <em>EChannel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EChannel
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEChannel()
	 * @generated
	 */
	int ECHANNEL = 5;

	/**
	 * The meta object id for the '{@link journeymodel.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EType
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 6;

	/**
	 * The meta object id for the '{@link journeymodel.EInitiator <em>EInitiator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EInitiator
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEInitiator()
	 * @generated
	 */
	int EINITIATOR = 7;

	/**
	 * The meta object id for the '{@link journeymodel.EEvaluation <em>EEvaluation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EEvaluation
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEEvaluation()
	 * @generated
	 */
	int EEVALUATION = 8;

	/**
	 * The meta object id for the '{@link journeymodel.EEnum0 <em>EEnum0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journeymodel.EEnum0
	 * @see journeymodel.impl.JourneymodelPackageImpl#getEEnum0()
	 * @generated
	 */
	int EENUM0 = 9;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see journeymodel.impl.JourneymodelPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 10;


	/**
	 * Returns the meta object for class '{@link journeymodel.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see journeymodel.Journey
	 * @generated
	 */
	EClass getJourney();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Journey#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see journeymodel.Journey#getID()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_ID();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Journey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see journeymodel.Journey#getName()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Name();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Journey#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see journeymodel.Journey#getDate()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Date();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Journey#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see journeymodel.Journey#getStatus()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Status();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Journey#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see journeymodel.Journey#getComment()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Comment();

	/**
	 * Returns the meta object for the reference '{@link journeymodel.Journey#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see journeymodel.Journey#getEReference0()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_EReference0();

	/**
	 * Returns the meta object for the containment reference list '{@link journeymodel.Journey#getTouchpoints <em>Touchpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Touchpoints</em>'.
	 * @see journeymodel.Journey#getTouchpoints()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Touchpoints();

	/**
	 * Returns the meta object for class '{@link journeymodel.Touchpoint <em>Touchpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touchpoint</em>'.
	 * @see journeymodel.Touchpoint
	 * @generated
	 */
	EClass getTouchpoint();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see journeymodel.Touchpoint#getID()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_ID();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see journeymodel.Touchpoint#getName()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see journeymodel.Touchpoint#getDate()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Date();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getDT1 <em>DT1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DT1</em>'.
	 * @see journeymodel.Touchpoint#getDT1()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_DT1();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see journeymodel.Touchpoint#getType()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Type();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see journeymodel.Touchpoint#getComment()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Comment();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation</em>'.
	 * @see journeymodel.Touchpoint#getEvaluation()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Evaluation();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see journeymodel.Touchpoint#getChannel()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Channel();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.Touchpoint#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiator</em>'.
	 * @see journeymodel.Touchpoint#getInitiator()
	 * @see #getTouchpoint()
	 * @generated
	 */
	EAttribute getTouchpoint_Initiator();

	/**
	 * Returns the meta object for class '{@link journeymodel.JourneySet <em>Journey Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Set</em>'.
	 * @see journeymodel.JourneySet
	 * @generated
	 */
	EClass getJourneySet();

	/**
	 * Returns the meta object for the containment reference list '{@link journeymodel.JourneySet#getJourneys <em>Journeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Journeys</em>'.
	 * @see journeymodel.JourneySet#getJourneys()
	 * @see #getJourneySet()
	 * @generated
	 */
	EReference getJourneySet_Journeys();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.JourneySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see journeymodel.JourneySet#getName()
	 * @see #getJourneySet()
	 * @generated
	 */
	EAttribute getJourneySet_Name();

	/**
	 * Returns the meta object for the reference '{@link journeymodel.JourneySet#getExpectedJoruney <em>Expected Joruney</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Joruney</em>'.
	 * @see journeymodel.JourneySet#getExpectedJoruney()
	 * @see #getJourneySet()
	 * @generated
	 */
	EReference getJourneySet_ExpectedJoruney();

	/**
	 * Returns the meta object for class '{@link journeymodel.JourneyDiff <em>Journey Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Diff</em>'.
	 * @see journeymodel.JourneyDiff
	 * @generated
	 */
	EClass getJourneyDiff();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.JourneyDiff#getCommonTP <em>Common TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Common TP</em>'.
	 * @see journeymodel.JourneyDiff#getCommonTP()
	 * @see #getJourneyDiff()
	 * @generated
	 */
	EAttribute getJourneyDiff_CommonTP();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.JourneyDiff#getUnusedTP <em>Unused TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unused TP</em>'.
	 * @see journeymodel.JourneyDiff#getUnusedTP()
	 * @see #getJourneyDiff()
	 * @generated
	 */
	EAttribute getJourneyDiff_UnusedTP();

	/**
	 * Returns the meta object for the attribute '{@link journeymodel.JourneyDiff#getNewTP <em>New TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New TP</em>'.
	 * @see journeymodel.JourneyDiff#getNewTP()
	 * @see #getJourneyDiff()
	 * @generated
	 */
	EAttribute getJourneyDiff_NewTP();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EStatus <em>EStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStatus</em>'.
	 * @see journeymodel.EStatus
	 * @generated
	 */
	EEnum getEStatus();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EChannel <em>EChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EChannel</em>'.
	 * @see journeymodel.EChannel
	 * @generated
	 */
	EEnum getEChannel();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see journeymodel.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EInitiator <em>EInitiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInitiator</em>'.
	 * @see journeymodel.EInitiator
	 * @generated
	 */
	EEnum getEInitiator();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EEvaluation <em>EEvaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEvaluation</em>'.
	 * @see journeymodel.EEvaluation
	 * @generated
	 */
	EEnum getEEvaluation();

	/**
	 * Returns the meta object for enum '{@link journeymodel.EEnum0 <em>EEnum0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum0</em>'.
	 * @see journeymodel.EEnum0
	 * @generated
	 */
	EEnum getEEnum0();

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
	JourneymodelFactory getJourneymodelFactory();

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
		 * The meta object literal for the '{@link journeymodel.impl.JourneyImpl <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.impl.JourneyImpl
		 * @see journeymodel.impl.JourneymodelPackageImpl#getJourney()
		 * @generated
		 */
		EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__ID = eINSTANCE.getJourney_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__NAME = eINSTANCE.getJourney_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__DATE = eINSTANCE.getJourney_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__STATUS = eINSTANCE.getJourney_Status();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__COMMENT = eINSTANCE.getJourney_Comment();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__EREFERENCE0 = eINSTANCE.getJourney_EReference0();

		/**
		 * The meta object literal for the '<em><b>Touchpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__TOUCHPOINTS = eINSTANCE.getJourney_Touchpoints();

		/**
		 * The meta object literal for the '{@link journeymodel.impl.TouchpointImpl <em>Touchpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.impl.TouchpointImpl
		 * @see journeymodel.impl.JourneymodelPackageImpl#getTouchpoint()
		 * @generated
		 */
		EClass TOUCHPOINT = eINSTANCE.getTouchpoint();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCHPOINT__ID = eINSTANCE.getTouchpoint_ID();

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
		 * The meta object literal for the '{@link journeymodel.impl.JourneySetImpl <em>Journey Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.impl.JourneySetImpl
		 * @see journeymodel.impl.JourneymodelPackageImpl#getJourneySet()
		 * @generated
		 */
		EClass JOURNEY_SET = eINSTANCE.getJourneySet();

		/**
		 * The meta object literal for the '<em><b>Journeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_SET__JOURNEYS = eINSTANCE.getJourneySet_Journeys();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_SET__NAME = eINSTANCE.getJourneySet_Name();

		/**
		 * The meta object literal for the '<em><b>Expected Joruney</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_SET__EXPECTED_JORUNEY = eINSTANCE.getJourneySet_ExpectedJoruney();

		/**
		 * The meta object literal for the '{@link journeymodel.impl.JourneyDiffImpl <em>Journey Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.impl.JourneyDiffImpl
		 * @see journeymodel.impl.JourneymodelPackageImpl#getJourneyDiff()
		 * @generated
		 */
		EClass JOURNEY_DIFF = eINSTANCE.getJourneyDiff();

		/**
		 * The meta object literal for the '<em><b>Common TP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_DIFF__COMMON_TP = eINSTANCE.getJourneyDiff_CommonTP();

		/**
		 * The meta object literal for the '<em><b>Unused TP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_DIFF__UNUSED_TP = eINSTANCE.getJourneyDiff_UnusedTP();

		/**
		 * The meta object literal for the '<em><b>New TP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_DIFF__NEW_TP = eINSTANCE.getJourneyDiff_NewTP();

		/**
		 * The meta object literal for the '{@link journeymodel.EStatus <em>EStatus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EStatus
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEStatus()
		 * @generated
		 */
		EEnum ESTATUS = eINSTANCE.getEStatus();

		/**
		 * The meta object literal for the '{@link journeymodel.EChannel <em>EChannel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EChannel
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEChannel()
		 * @generated
		 */
		EEnum ECHANNEL = eINSTANCE.getEChannel();

		/**
		 * The meta object literal for the '{@link journeymodel.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EType
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link journeymodel.EInitiator <em>EInitiator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EInitiator
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEInitiator()
		 * @generated
		 */
		EEnum EINITIATOR = eINSTANCE.getEInitiator();

		/**
		 * The meta object literal for the '{@link journeymodel.EEvaluation <em>EEvaluation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EEvaluation
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEEvaluation()
		 * @generated
		 */
		EEnum EEVALUATION = eINSTANCE.getEEvaluation();

		/**
		 * The meta object literal for the '{@link journeymodel.EEnum0 <em>EEnum0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journeymodel.EEnum0
		 * @see journeymodel.impl.JourneymodelPackageImpl#getEEnum0()
		 * @generated
		 */
		EEnum EENUM0 = eINSTANCE.getEEnum0();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see journeymodel.impl.JourneymodelPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //JourneymodelPackage
