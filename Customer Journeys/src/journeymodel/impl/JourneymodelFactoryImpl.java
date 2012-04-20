/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package journeymodel.impl;

import java.util.Calendar;

import journeymodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneymodelFactoryImpl extends EFactoryImpl implements JourneymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JourneymodelFactory init() {
		try {
			JourneymodelFactory theJourneymodelFactory = (JourneymodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://customerjourney/1.0"); 
			if (theJourneymodelFactory != null) {
				return theJourneymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JourneymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JourneymodelPackage.JOURNEY: return createJourney();
			case JourneymodelPackage.TOUCHPOINT: return createTouchpoint();
			case JourneymodelPackage.JOURNEY_SET: return createJourneySet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JourneymodelPackage.ESTATUS:
				return createEStatusFromString(eDataType, initialValue);
			case JourneymodelPackage.ECHANNEL:
				return createEChannelFromString(eDataType, initialValue);
			case JourneymodelPackage.ETYPE:
				return createETypeFromString(eDataType, initialValue);
			case JourneymodelPackage.EINITIATOR:
				return createEInitiatorFromString(eDataType, initialValue);
			case JourneymodelPackage.EEVALUATION:
				return createEEvaluationFromString(eDataType, initialValue);
			case JourneymodelPackage.EENUM0:
				return createEEnum0FromString(eDataType, initialValue);
			case JourneymodelPackage.CALENDAR:
				return createCalendarFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JourneymodelPackage.ESTATUS:
				return convertEStatusToString(eDataType, instanceValue);
			case JourneymodelPackage.ECHANNEL:
				return convertEChannelToString(eDataType, instanceValue);
			case JourneymodelPackage.ETYPE:
				return convertETypeToString(eDataType, instanceValue);
			case JourneymodelPackage.EINITIATOR:
				return convertEInitiatorToString(eDataType, instanceValue);
			case JourneymodelPackage.EEVALUATION:
				return convertEEvaluationToString(eDataType, instanceValue);
			case JourneymodelPackage.EENUM0:
				return convertEEnum0ToString(eDataType, instanceValue);
			case JourneymodelPackage.CALENDAR:
				return convertCalendarToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey createJourney() {
		JourneyImpl journey = new JourneyImpl();
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Touchpoint createTouchpoint() {
		TouchpointImpl touchpoint = new TouchpointImpl();
		return touchpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneySet createJourneySet() {
		JourneySetImpl journeySet = new JourneySetImpl();
		return journeySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStatus createEStatusFromString(EDataType eDataType, String initialValue) {
		EStatus result = EStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EChannel createEChannelFromString(EDataType eDataType, String initialValue) {
		EChannel result = EChannel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEChannelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createETypeFromString(EDataType eDataType, String initialValue) {
		EType result = EType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInitiator createEInitiatorFromString(EDataType eDataType, String initialValue) {
		EInitiator result = EInitiator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInitiatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEvaluation createEEvaluationFromString(EDataType eDataType, String initialValue) {
		EEvaluation result = EEvaluation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEvaluationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum0 createEEnum0FromString(EDataType eDataType, String initialValue) {
		EEnum0 result = EEnum0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnum0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendarFromString(EDataType eDataType, String initialValue) {
		return (Calendar)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneymodelPackage getJourneymodelPackage() {
		return (JourneymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JourneymodelPackage getPackage() {
		return JourneymodelPackage.eINSTANCE;
	}

} //JourneymodelFactoryImpl
