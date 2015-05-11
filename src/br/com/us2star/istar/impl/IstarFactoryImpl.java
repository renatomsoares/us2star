/**
 */
package br.com.us2star.istar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import br.com.us2star.istar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarFactoryImpl extends EFactoryImpl implements IstarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarFactory init() {
		try {
			IstarFactory theIstarFactory = (IstarFactory)EPackage.Registry.INSTANCE.getEFactory(IstarPackage.eNS_URI);
			if (theIstarFactory != null) {
				return theIstarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IstarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarFactoryImpl() {
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
			case IstarPackage.ISTAR_MODEL: return createIstarModel();
			case IstarPackage.ISTAR_ELEMENT: return createIstarElement();
			case IstarPackage.ISTAR_COMPARTMENT: return createIstarCompartment();
			case IstarPackage.ISTAR_ACTOR_LINK: return createIstarActorLink();
			case IstarPackage.ISTAR_DEPENDENCY_LINK: return createIstarDependencyLink();
			case IstarPackage.ISTAR_NODE_OBJECT: return createIstarNodeObject();
			case IstarPackage.ISTAR_RELATIONSHIP: return createIstarRelationship();
			case IstarPackage.ISTAR_MEAN_END_LINK: return createIstarMeanEndLink();
			case IstarPackage.ISTAR_INTENTIONAL_ELEMENT: return createIstarIntentionalElement();
			case IstarPackage.ISTAR_TASK_DECOMPOSITION: return createIstarTaskDecomposition();
			case IstarPackage.ISTAR_CONTRIBUTION_LINK: return createIstarContributionLink();
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
			case IstarPackage.ISTAR_COMPARTMENT_TYPE:
				return createIstarCompartmentTypeFromString(eDataType, initialValue);
			case IstarPackage.ISTAR_ELEMENT_TYPE:
				return createIstarElementTypeFromString(eDataType, initialValue);
			case IstarPackage.ISTAR_DEPENDENCY_LINK_TYPE:
				return createIstarDependencyLinkTypeFromString(eDataType, initialValue);
			case IstarPackage.ISTAR_ACTOR_LINK_TYPE:
				return createIstarActorLinkTypeFromString(eDataType, initialValue);
			case IstarPackage.ISTAR_CONTRIBUTION_TYPE:
				return createIstarContributionTypeFromString(eDataType, initialValue);
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
			case IstarPackage.ISTAR_COMPARTMENT_TYPE:
				return convertIstarCompartmentTypeToString(eDataType, instanceValue);
			case IstarPackage.ISTAR_ELEMENT_TYPE:
				return convertIstarElementTypeToString(eDataType, instanceValue);
			case IstarPackage.ISTAR_DEPENDENCY_LINK_TYPE:
				return convertIstarDependencyLinkTypeToString(eDataType, instanceValue);
			case IstarPackage.ISTAR_ACTOR_LINK_TYPE:
				return convertIstarActorLinkTypeToString(eDataType, instanceValue);
			case IstarPackage.ISTAR_CONTRIBUTION_TYPE:
				return convertIstarContributionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarModel createIstarModel() {
		IstarModelImpl istarModel = new IstarModelImpl();
		return istarModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarElement createIstarElement() {
		IstarElementImpl istarElement = new IstarElementImpl();
		return istarElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartment createIstarCompartment() {
		IstarCompartmentImpl istarCompartment = new IstarCompartmentImpl();
		return istarCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarActorLink createIstarActorLink() {
		IstarActorLinkImpl istarActorLink = new IstarActorLinkImpl();
		return istarActorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarDependencyLink createIstarDependencyLink() {
		IstarDependencyLinkImpl istarDependencyLink = new IstarDependencyLinkImpl();
		return istarDependencyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarNodeObject createIstarNodeObject() {
		IstarNodeObjectImpl istarNodeObject = new IstarNodeObjectImpl();
		return istarNodeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarRelationship createIstarRelationship() {
		IstarRelationshipImpl istarRelationship = new IstarRelationshipImpl();
		return istarRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarMeanEndLink createIstarMeanEndLink() {
		IstarMeanEndLinkImpl istarMeanEndLink = new IstarMeanEndLinkImpl();
		return istarMeanEndLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarIntentionalElement createIstarIntentionalElement() {
		IstarIntentionalElementImpl istarIntentionalElement = new IstarIntentionalElementImpl();
		return istarIntentionalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarTaskDecomposition createIstarTaskDecomposition() {
		IstarTaskDecompositionImpl istarTaskDecomposition = new IstarTaskDecompositionImpl();
		return istarTaskDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarContributionLink createIstarContributionLink() {
		IstarContributionLinkImpl istarContributionLink = new IstarContributionLinkImpl();
		return istarContributionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartmentType createIstarCompartmentTypeFromString(EDataType eDataType, String initialValue) {
		IstarCompartmentType result = IstarCompartmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstarCompartmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarElementType createIstarElementTypeFromString(EDataType eDataType, String initialValue) {
		IstarElementType result = IstarElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstarElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarDependencyLinkType createIstarDependencyLinkTypeFromString(EDataType eDataType, String initialValue) {
		IstarDependencyLinkType result = IstarDependencyLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstarDependencyLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarActorLinkType createIstarActorLinkTypeFromString(EDataType eDataType, String initialValue) {
		IstarActorLinkType result = IstarActorLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstarActorLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarContributionType createIstarContributionTypeFromString(EDataType eDataType, String initialValue) {
		IstarContributionType result = IstarContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIstarContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarPackage getIstarPackage() {
		return (IstarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IstarPackage getPackage() {
		return IstarPackage.eINSTANCE;
	}

} //IstarFactoryImpl
