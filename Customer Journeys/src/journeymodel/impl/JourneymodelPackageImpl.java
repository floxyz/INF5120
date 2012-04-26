/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import java.util.Calendar;

import journeymodel.EChannel;
import journeymodel.EEnum0;
import journeymodel.EEvaluation;
import journeymodel.EInitiator;
import journeymodel.EStatus;
import journeymodel.EType;
import journeymodel.Journey;
import journeymodel.JourneyDiff;
import journeymodel.JourneySet;
import journeymodel.JourneymodelFactory;
import journeymodel.JourneymodelPackage;
import journeymodel.Touchpoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneymodelPackageImpl extends EPackageImpl implements JourneymodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyDiffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eChannelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eInitiatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEvaluationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEnum0EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see journeymodel.JourneymodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JourneymodelPackageImpl() {
		super(eNS_URI, JourneymodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JourneymodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JourneymodelPackage init() {
		if (isInited) return (JourneymodelPackage)EPackage.Registry.INSTANCE.getEPackage(JourneymodelPackage.eNS_URI);

		// Obtain or create and register package
		JourneymodelPackageImpl theJourneymodelPackage = (JourneymodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JourneymodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JourneymodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJourneymodelPackage.createPackageContents();

		// Initialize created meta-data
		theJourneymodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJourneymodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JourneymodelPackage.eNS_URI, theJourneymodelPackage);
		return theJourneymodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_ID() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Name() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Date() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Status() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Comment() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourney_EReference0() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourney_Touchpoints() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchpoint() {
		return touchpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_ID() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Name() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Date() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_DT1() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Type() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Comment() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Evaluation() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Channel() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchpoint_Initiator() {
		return (EAttribute)touchpointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneySet() {
		return journeySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneySet_Journeys() {
		return (EReference)journeySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneySet_Name() {
		return (EAttribute)journeySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourneySet_ExpectedJoruney() {
		return (EReference)journeySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyDiff() {
		return journeyDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyDiff_CommonTP() {
		return (EAttribute)journeyDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyDiff_UnusedTP() {
		return (EAttribute)journeyDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyDiff_NewTP() {
		return (EAttribute)journeyDiffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEStatus() {
		return eStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEChannel() {
		return eChannelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEType() {
		return eTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEInitiator() {
		return eInitiatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEvaluation() {
		return eEvaluationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEEnum0() {
		return eEnum0EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneymodelFactory getJourneymodelFactory() {
		return (JourneymodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		journeyEClass = createEClass(JOURNEY);
		createEAttribute(journeyEClass, JOURNEY__ID);
		createEAttribute(journeyEClass, JOURNEY__NAME);
		createEAttribute(journeyEClass, JOURNEY__DATE);
		createEAttribute(journeyEClass, JOURNEY__STATUS);
		createEAttribute(journeyEClass, JOURNEY__COMMENT);
		createEReference(journeyEClass, JOURNEY__EREFERENCE0);
		createEReference(journeyEClass, JOURNEY__TOUCHPOINTS);

		touchpointEClass = createEClass(TOUCHPOINT);
		createEAttribute(touchpointEClass, TOUCHPOINT__ID);
		createEAttribute(touchpointEClass, TOUCHPOINT__NAME);
		createEAttribute(touchpointEClass, TOUCHPOINT__DATE);
		createEAttribute(touchpointEClass, TOUCHPOINT__DT1);
		createEAttribute(touchpointEClass, TOUCHPOINT__TYPE);
		createEAttribute(touchpointEClass, TOUCHPOINT__COMMENT);
		createEAttribute(touchpointEClass, TOUCHPOINT__EVALUATION);
		createEAttribute(touchpointEClass, TOUCHPOINT__CHANNEL);
		createEAttribute(touchpointEClass, TOUCHPOINT__INITIATOR);

		journeySetEClass = createEClass(JOURNEY_SET);
		createEReference(journeySetEClass, JOURNEY_SET__JOURNEYS);
		createEAttribute(journeySetEClass, JOURNEY_SET__NAME);
		createEReference(journeySetEClass, JOURNEY_SET__EXPECTED_JORUNEY);

		journeyDiffEClass = createEClass(JOURNEY_DIFF);
		createEAttribute(journeyDiffEClass, JOURNEY_DIFF__COMMON_TP);
		createEAttribute(journeyDiffEClass, JOURNEY_DIFF__UNUSED_TP);
		createEAttribute(journeyDiffEClass, JOURNEY_DIFF__NEW_TP);

		// Create enums
		eStatusEEnum = createEEnum(ESTATUS);
		eChannelEEnum = createEEnum(ECHANNEL);
		eTypeEEnum = createEEnum(ETYPE);
		eInitiatorEEnum = createEEnum(EINITIATOR);
		eEvaluationEEnum = createEEnum(EEVALUATION);
		eEnum0EEnum = createEEnum(EENUM0);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourney_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Name(), ecorePackage.getEString(), "name", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Status(), this.getEStatus(), "status", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_EReference0(), this.getTouchpoint(), null, "EReference0", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Touchpoints(), this.getTouchpoint(), null, "touchpoints", null, 1, -1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(journeyEClass, this.getJourneyDiff(), "compare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJourney(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeyEClass, ecorePackage.getEString(), "getRatingStatistics", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeyEClass, ecorePackage.getEString(), "getChannelStatistics", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeyEClass, ecorePackage.getEString(), "getInitiatorStatistics", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeyEClass, ecorePackage.getEString(), "getComparedToExpected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(journeyEClass, ecorePackage.getEString(), "getSingleInitiatorStatistics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInitiator(), "initiator", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeyEClass, ecorePackage.getEString(), "getGraphviz", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(touchpointEClass, Touchpoint.class, "Touchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchpoint_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_DT1(), ecorePackage.getEString(), "DT1", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Type(), this.getEType(), "type", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Evaluation(), this.getEEvaluation(), "evaluation", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Channel(), this.getEChannel(), "channel", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Initiator(), this.getEInitiator(), "initiator", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeySetEClass, JourneySet.class, "JourneySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJourneySet_Journeys(), this.getJourney(), null, "journeys", null, 0, -1, JourneySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneySet_Name(), ecorePackage.getEString(), "name", null, 0, 1, JourneySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneySet_ExpectedJoruney(), this.getJourney(), null, "expectedJoruney", null, 0, 1, JourneySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(journeySetEClass, ecorePackage.getEString(), "getComparedToExpected", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(journeySetEClass, ecorePackage.getEString(), "getGraphviz", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(journeyDiffEClass, JourneyDiff.class, "JourneyDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyDiff_CommonTP(), ecorePackage.getEInt(), "commonTP", null, 0, 1, JourneyDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyDiff_UnusedTP(), ecorePackage.getEInt(), "unusedTP", null, 0, 1, JourneyDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyDiff_NewTP(), ecorePackage.getEInt(), "newTP", null, 0, 1, JourneyDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eStatusEEnum, EStatus.class, "EStatus");
		addEEnumLiteral(eStatusEEnum, EStatus.COMPLETED);
		addEEnumLiteral(eStatusEEnum, EStatus.ABORTED);
		addEEnumLiteral(eStatusEEnum, EStatus.IN_PROGRESS);

		initEEnum(eChannelEEnum, EChannel.class, "EChannel");
		addEEnumLiteral(eChannelEEnum, EChannel.WEB);
		addEEnumLiteral(eChannelEEnum, EChannel.EMAIL);
		addEEnumLiteral(eChannelEEnum, EChannel.SMS);
		addEEnumLiteral(eChannelEEnum, EChannel.SELF_SERVICE_MACHINE);
		addEEnumLiteral(eChannelEEnum, EChannel.FACE_TO_FACE);
		addEEnumLiteral(eChannelEEnum, EChannel.PHONE);

		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.GENERIC);
		addEEnumLiteral(eTypeEEnum, EType.ADHOC);

		initEEnum(eInitiatorEEnum, EInitiator.class, "EInitiator");
		addEEnumLiteral(eInitiatorEEnum, EInitiator.CUSTOMER);
		addEEnumLiteral(eInitiatorEEnum, EInitiator.MOVIE_AGENCY);
		addEEnumLiteral(eInitiatorEEnum, EInitiator.MOVIE_EMPLOYEE);

		initEEnum(eEvaluationEEnum, EEvaluation.class, "EEvaluation");
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.GOOD);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.BAD);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.MEDIUM);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.NOT_AVAILABLE);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.EMPTY);

		initEEnum(eEnum0EEnum, EEnum0.class, "EEnum0");

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JourneymodelPackageImpl
