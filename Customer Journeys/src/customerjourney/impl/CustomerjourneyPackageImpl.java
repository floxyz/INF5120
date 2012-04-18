/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package customerjourney.impl;

import customerjourney.CustomerJourney;
import customerjourney.CustomerjourneyFactory;
import customerjourney.CustomerjourneyPackage;
import customerjourney.EChannel;
import customerjourney.EEnum0;
import customerjourney.EEvaluation;
import customerjourney.EInitiator;
import customerjourney.EStatus;
import customerjourney.EType;
import customerjourney.Touchpoint;

import java.util.Calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerjourneyPackageImpl extends EPackageImpl implements CustomerjourneyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerJourneyEClass = null;

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
	 * @see customerjourney.CustomerjourneyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomerjourneyPackageImpl() {
		super(eNS_URI, CustomerjourneyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CustomerjourneyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomerjourneyPackage init() {
		if (isInited) return (CustomerjourneyPackage)EPackage.Registry.INSTANCE.getEPackage(CustomerjourneyPackage.eNS_URI);

		// Obtain or create and register package
		CustomerjourneyPackageImpl theCustomerjourneyPackage = (CustomerjourneyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomerjourneyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomerjourneyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCustomerjourneyPackage.createPackageContents();

		// Initialize created meta-data
		theCustomerjourneyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomerjourneyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomerjourneyPackage.eNS_URI, theCustomerjourneyPackage);
		return theCustomerjourneyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerJourney() {
		return customerJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_ID() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_Name() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_Date() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_Status() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerJourney_Comment() {
		return (EAttribute)customerJourneyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_EReference0() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerJourney_Touchpoints() {
		return (EReference)customerJourneyEClass.getEStructuralFeatures().get(6);
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
	public CustomerjourneyFactory getCustomerjourneyFactory() {
		return (CustomerjourneyFactory)getEFactoryInstance();
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
		customerJourneyEClass = createEClass(CUSTOMER_JOURNEY);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__ID);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__NAME);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__DATE);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__STATUS);
		createEAttribute(customerJourneyEClass, CUSTOMER_JOURNEY__COMMENT);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__EREFERENCE0);
		createEReference(customerJourneyEClass, CUSTOMER_JOURNEY__TOUCHPOINTS);

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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(customerJourneyEClass, CustomerJourney.class, "CustomerJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerJourney_ID(), ecorePackage.getEString(), "ID", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_Date(), this.getCalendar(), "date", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_Status(), this.getEStatus(), "status", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerJourney_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_EReference0(), this.getTouchpoint(), null, "EReference0", null, 0, 1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerJourney_Touchpoints(), this.getTouchpoint(), null, "touchpoints", null, 1, -1, CustomerJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchpointEClass, Touchpoint.class, "Touchpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchpoint_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Date(), this.getCalendar(), "date", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_DT1(), ecorePackage.getEString(), "DT1", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Type(), this.getEType(), "type", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Evaluation(), this.getEEvaluation(), "evaluation", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Channel(), this.getEChannel(), "channel", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchpoint_Initiator(), this.getEInitiator(), "initiator", null, 0, 1, Touchpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eStatusEEnum, EStatus.class, "EStatus");
		addEEnumLiteral(eStatusEEnum, EStatus.COMPLETED_LITERAL);
		addEEnumLiteral(eStatusEEnum, EStatus.ABORTED_LITERAL);
		addEEnumLiteral(eStatusEEnum, EStatus.IN_PROGRESS_LITERAL);

		initEEnum(eChannelEEnum, EChannel.class, "EChannel");
		addEEnumLiteral(eChannelEEnum, EChannel.WEB_LITERAL);
		addEEnumLiteral(eChannelEEnum, EChannel.EMAIL_LITERAL);
		addEEnumLiteral(eChannelEEnum, EChannel.SMS_LITERAL);
		addEEnumLiteral(eChannelEEnum, EChannel.SELF_SERVICE_MACHINE_LITERAL);
		addEEnumLiteral(eChannelEEnum, EChannel.FACE_TO_FACE_LITERAL);
		addEEnumLiteral(eChannelEEnum, EChannel.PHONE_LITERAL);

		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.GENERIC_LITERAL);
		addEEnumLiteral(eTypeEEnum, EType.ADHOC_LITERAL);

		initEEnum(eInitiatorEEnum, EInitiator.class, "EInitiator");
		addEEnumLiteral(eInitiatorEEnum, EInitiator.CUSTOMER_LITERAL);
		addEEnumLiteral(eInitiatorEEnum, EInitiator.MOVIE_AGENCY_LITERAL);

		initEEnum(eEvaluationEEnum, EEvaluation.class, "EEvaluation");
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.GOOD_LITERAL);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.BAD_LITERAL);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.MEDIUM_LITERAL);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.NA_LITERAL);
		addEEnumLiteral(eEvaluationEEnum, EEvaluation.EMPTY_LITERAL);

		initEEnum(eEnum0EEnum, EEnum0.class, "EEnum0");

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CustomerjourneyPackageImpl
