/**
 */
package br.com.us2star.istar.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarActorLinkType;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarContributionLink;
import br.com.us2star.istar.IstarContributionType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarDependencyLinkType;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.istar.IstarFactory;
import br.com.us2star.istar.IstarIntentionalElement;
import br.com.us2star.istar.IstarMeanEndLink;
import br.com.us2star.istar.IstarModel;
import br.com.us2star.istar.IstarNodeObject;
import br.com.us2star.istar.IstarPackage;
import br.com.us2star.istar.IstarRelationship;
import br.com.us2star.istar.IstarTaskDecomposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarPackageImpl extends EPackageImpl implements IstarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarActorLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarDependencyLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarNodeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarMeanEndLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarIntentionalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarTaskDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass istarContributionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istarCompartmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istarElementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istarDependencyLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istarActorLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum istarContributionTypeEEnum = null;

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
	 * @see br.com.us2star.istar.IstarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IstarPackageImpl() {
		super(eNS_URI, IstarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IstarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IstarPackage init() {
		if (isInited) return (IstarPackage)EPackage.Registry.INSTANCE.getEPackage(IstarPackage.eNS_URI);

		// Obtain or create and register package
		IstarPackageImpl theIstarPackage = (IstarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IstarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IstarPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIstarPackage.createPackageContents();

		// Initialize created meta-data
		theIstarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIstarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IstarPackage.eNS_URI, theIstarPackage);
		return theIstarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarModel() {
		return istarModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarModel_Title() {
		return (EAttribute)istarModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarModel_DependencyLinks() {
		return (EReference)istarModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarModel_ActorLinks() {
		return (EReference)istarModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarModel_Elements() {
		return (EReference)istarModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarModel_Compartments() {
		return (EReference)istarModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarElement() {
		return istarElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarElement_Type() {
		return (EAttribute)istarElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarCompartment() {
		return istarCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarCompartment_Type() {
		return (EAttribute)istarCompartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarCompartment_MeanEndLinks() {
		return (EReference)istarCompartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarCompartment_TasksDecompositions() {
		return (EReference)istarCompartmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarCompartment_ContributionLinks() {
		return (EReference)istarCompartmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarCompartment_Elements() {
		return (EReference)istarCompartmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarActorLink() {
		return istarActorLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarActorLink_Type() {
		return (EAttribute)istarActorLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarActorLink_Source() {
		return (EReference)istarActorLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarActorLink_Target() {
		return (EReference)istarActorLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarDependencyLink() {
		return istarDependencyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarDependencyLink_Type() {
		return (EAttribute)istarDependencyLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarDependencyLink_Source() {
		return (EReference)istarDependencyLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarDependencyLink_Target() {
		return (EReference)istarDependencyLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarNodeObject() {
		return istarNodeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarNodeObject_Name() {
		return (EAttribute)istarNodeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarRelationship() {
		return istarRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarMeanEndLink() {
		return istarMeanEndLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarMeanEndLink_Source() {
		return (EReference)istarMeanEndLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarMeanEndLink_Target() {
		return (EReference)istarMeanEndLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarIntentionalElement() {
		return istarIntentionalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarTaskDecomposition() {
		return istarTaskDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarTaskDecomposition_Source() {
		return (EReference)istarTaskDecompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarTaskDecomposition_Target() {
		return (EReference)istarTaskDecompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIstarContributionLink() {
		return istarContributionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIstarContributionLink_Type() {
		return (EAttribute)istarContributionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarContributionLink_Source() {
		return (EReference)istarContributionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIstarContributionLink_Target() {
		return (EReference)istarContributionLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstarCompartmentType() {
		return istarCompartmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstarElementType() {
		return istarElementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstarDependencyLinkType() {
		return istarDependencyLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstarActorLinkType() {
		return istarActorLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIstarContributionType() {
		return istarContributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarFactory getIstarFactory() {
		return (IstarFactory)getEFactoryInstance();
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
		istarModelEClass = createEClass(ISTAR_MODEL);
		createEAttribute(istarModelEClass, ISTAR_MODEL__TITLE);
		createEReference(istarModelEClass, ISTAR_MODEL__DEPENDENCY_LINKS);
		createEReference(istarModelEClass, ISTAR_MODEL__ACTOR_LINKS);
		createEReference(istarModelEClass, ISTAR_MODEL__ELEMENTS);
		createEReference(istarModelEClass, ISTAR_MODEL__COMPARTMENTS);

		istarElementEClass = createEClass(ISTAR_ELEMENT);
		createEAttribute(istarElementEClass, ISTAR_ELEMENT__TYPE);

		istarCompartmentEClass = createEClass(ISTAR_COMPARTMENT);
		createEAttribute(istarCompartmentEClass, ISTAR_COMPARTMENT__TYPE);
		createEReference(istarCompartmentEClass, ISTAR_COMPARTMENT__MEAN_END_LINKS);
		createEReference(istarCompartmentEClass, ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS);
		createEReference(istarCompartmentEClass, ISTAR_COMPARTMENT__CONTRIBUTION_LINKS);
		createEReference(istarCompartmentEClass, ISTAR_COMPARTMENT__ELEMENTS);

		istarActorLinkEClass = createEClass(ISTAR_ACTOR_LINK);
		createEAttribute(istarActorLinkEClass, ISTAR_ACTOR_LINK__TYPE);
		createEReference(istarActorLinkEClass, ISTAR_ACTOR_LINK__SOURCE);
		createEReference(istarActorLinkEClass, ISTAR_ACTOR_LINK__TARGET);

		istarDependencyLinkEClass = createEClass(ISTAR_DEPENDENCY_LINK);
		createEAttribute(istarDependencyLinkEClass, ISTAR_DEPENDENCY_LINK__TYPE);
		createEReference(istarDependencyLinkEClass, ISTAR_DEPENDENCY_LINK__SOURCE);
		createEReference(istarDependencyLinkEClass, ISTAR_DEPENDENCY_LINK__TARGET);

		istarNodeObjectEClass = createEClass(ISTAR_NODE_OBJECT);
		createEAttribute(istarNodeObjectEClass, ISTAR_NODE_OBJECT__NAME);

		istarRelationshipEClass = createEClass(ISTAR_RELATIONSHIP);

		istarMeanEndLinkEClass = createEClass(ISTAR_MEAN_END_LINK);
		createEReference(istarMeanEndLinkEClass, ISTAR_MEAN_END_LINK__SOURCE);
		createEReference(istarMeanEndLinkEClass, ISTAR_MEAN_END_LINK__TARGET);

		istarIntentionalElementEClass = createEClass(ISTAR_INTENTIONAL_ELEMENT);

		istarTaskDecompositionEClass = createEClass(ISTAR_TASK_DECOMPOSITION);
		createEReference(istarTaskDecompositionEClass, ISTAR_TASK_DECOMPOSITION__SOURCE);
		createEReference(istarTaskDecompositionEClass, ISTAR_TASK_DECOMPOSITION__TARGET);

		istarContributionLinkEClass = createEClass(ISTAR_CONTRIBUTION_LINK);
		createEAttribute(istarContributionLinkEClass, ISTAR_CONTRIBUTION_LINK__TYPE);
		createEReference(istarContributionLinkEClass, ISTAR_CONTRIBUTION_LINK__SOURCE);
		createEReference(istarContributionLinkEClass, ISTAR_CONTRIBUTION_LINK__TARGET);

		// Create enums
		istarCompartmentTypeEEnum = createEEnum(ISTAR_COMPARTMENT_TYPE);
		istarElementTypeEEnum = createEEnum(ISTAR_ELEMENT_TYPE);
		istarDependencyLinkTypeEEnum = createEEnum(ISTAR_DEPENDENCY_LINK_TYPE);
		istarActorLinkTypeEEnum = createEEnum(ISTAR_ACTOR_LINK_TYPE);
		istarContributionTypeEEnum = createEEnum(ISTAR_CONTRIBUTION_TYPE);
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
		istarElementEClass.getESuperTypes().add(this.getIstarIntentionalElement());
		istarCompartmentEClass.getESuperTypes().add(this.getIstarNodeObject());
		istarActorLinkEClass.getESuperTypes().add(this.getIstarRelationship());
		istarDependencyLinkEClass.getESuperTypes().add(this.getIstarRelationship());
		istarMeanEndLinkEClass.getESuperTypes().add(this.getIstarRelationship());
		istarIntentionalElementEClass.getESuperTypes().add(this.getIstarNodeObject());
		istarTaskDecompositionEClass.getESuperTypes().add(this.getIstarRelationship());
		istarContributionLinkEClass.getESuperTypes().add(this.getIstarRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(istarModelEClass, IstarModel.class, "IstarModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarModel_Title(), ecorePackage.getEString(), "title", null, 0, 1, IstarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarModel_DependencyLinks(), this.getIstarDependencyLink(), null, "dependencyLinks", null, 0, -1, IstarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarModel_ActorLinks(), this.getIstarActorLink(), null, "actorLinks", null, 0, -1, IstarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarModel_Elements(), this.getIstarElement(), null, "elements", null, 0, -1, IstarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarModel_Compartments(), this.getIstarCompartment(), null, "compartments", null, 0, -1, IstarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarElementEClass, IstarElement.class, "IstarElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarElement_Type(), this.getIstarElementType(), "type", null, 0, 1, IstarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarCompartmentEClass, IstarCompartment.class, "IstarCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarCompartment_Type(), this.getIstarCompartmentType(), "type", null, 0, 1, IstarCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarCompartment_MeanEndLinks(), this.getIstarMeanEndLink(), null, "meanEndLinks", null, 0, -1, IstarCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarCompartment_TasksDecompositions(), this.getIstarTaskDecomposition(), null, "tasksDecompositions", null, 0, -1, IstarCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarCompartment_ContributionLinks(), this.getIstarContributionLink(), null, "contributionLinks", null, 0, -1, IstarCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarCompartment_Elements(), this.getIstarElement(), null, "elements", null, 0, -1, IstarCompartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarActorLinkEClass, IstarActorLink.class, "IstarActorLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarActorLink_Type(), this.getIstarActorLinkType(), "type", null, 0, 1, IstarActorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarActorLink_Source(), this.getIstarCompartment(), null, "source", null, 0, 1, IstarActorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarActorLink_Target(), this.getIstarCompartment(), null, "target", null, 0, 1, IstarActorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarDependencyLinkEClass, IstarDependencyLink.class, "IstarDependencyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarDependencyLink_Type(), this.getIstarDependencyLinkType(), "type", null, 0, 1, IstarDependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarDependencyLink_Source(), this.getIstarNodeObject(), null, "source", null, 0, 1, IstarDependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarDependencyLink_Target(), this.getIstarNodeObject(), null, "target", null, 0, 1, IstarDependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarNodeObjectEClass, IstarNodeObject.class, "IstarNodeObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarNodeObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, IstarNodeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarRelationshipEClass, IstarRelationship.class, "IstarRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(istarMeanEndLinkEClass, IstarMeanEndLink.class, "IstarMeanEndLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIstarMeanEndLink_Source(), this.getIstarIntentionalElement(), null, "source", null, 0, 1, IstarMeanEndLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarMeanEndLink_Target(), this.getIstarIntentionalElement(), null, "target", null, 0, 1, IstarMeanEndLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarIntentionalElementEClass, IstarIntentionalElement.class, "IstarIntentionalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(istarTaskDecompositionEClass, IstarTaskDecomposition.class, "IstarTaskDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIstarTaskDecomposition_Source(), this.getIstarIntentionalElement(), null, "source", null, 0, 1, IstarTaskDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarTaskDecomposition_Target(), this.getIstarIntentionalElement(), null, "target", null, 0, 1, IstarTaskDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(istarContributionLinkEClass, IstarContributionLink.class, "IstarContributionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIstarContributionLink_Type(), this.getIstarContributionType(), "type", null, 0, 1, IstarContributionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarContributionLink_Source(), this.getIstarIntentionalElement(), null, "source", null, 0, 1, IstarContributionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIstarContributionLink_Target(), this.getIstarIntentionalElement(), null, "target", null, 0, 1, IstarContributionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(istarCompartmentTypeEEnum, IstarCompartmentType.class, "IstarCompartmentType");
		addEEnumLiteral(istarCompartmentTypeEEnum, IstarCompartmentType.ACTOR);
		addEEnumLiteral(istarCompartmentTypeEEnum, IstarCompartmentType.AGENT);
		addEEnumLiteral(istarCompartmentTypeEEnum, IstarCompartmentType.ROLE);
		addEEnumLiteral(istarCompartmentTypeEEnum, IstarCompartmentType.POSITION);

		initEEnum(istarElementTypeEEnum, IstarElementType.class, "IstarElementType");
		addEEnumLiteral(istarElementTypeEEnum, IstarElementType.GOAL);
		addEEnumLiteral(istarElementTypeEEnum, IstarElementType.TASK);
		addEEnumLiteral(istarElementTypeEEnum, IstarElementType.RESOURCE);
		addEEnumLiteral(istarElementTypeEEnum, IstarElementType.SOFTGOAL);

		initEEnum(istarDependencyLinkTypeEEnum, IstarDependencyLinkType.class, "IstarDependencyLinkType");
		addEEnumLiteral(istarDependencyLinkTypeEEnum, IstarDependencyLinkType.COMMITTED);
		addEEnumLiteral(istarDependencyLinkTypeEEnum, IstarDependencyLinkType.OPEN);
		addEEnumLiteral(istarDependencyLinkTypeEEnum, IstarDependencyLinkType.CRITICAL);

		initEEnum(istarActorLinkTypeEEnum, IstarActorLinkType.class, "IstarActorLinkType");
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.ISA);
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.COVERS);
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.ISPARTOF);
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.OCCUPIES);
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.PLAYS);
		addEEnumLiteral(istarActorLinkTypeEEnum, IstarActorLinkType.INS);

		initEEnum(istarContributionTypeEEnum, IstarContributionType.class, "IstarContributionType");
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.MAKE);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.BREAK);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.UNKNOWN);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.SOMEPLUS);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.SOMEMINUS);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.AND);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.OR);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.HELP);
		addEEnumLiteral(istarContributionTypeEEnum, IstarContributionType.HURT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (istarModelEClass, 
		   source, 
		   new String[] {
			 "model.extension", "istar",
			 "diagram.extension", "istardiagram"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (istarElementEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (istarCompartmentEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getIstarCompartment_Elements(), 
		   source, 
		   new String[] {
			 "collapsible", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (istarActorLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "width", "2",
			 "label", "type"
		   });	
		addAnnotation
		  (istarDependencyLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "width", "2"
		   });	
		addAnnotation
		  (istarMeanEndLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "width", "2"
		   });	
		addAnnotation
		  (istarTaskDecompositionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "width", "2"
		   });	
		addAnnotation
		  (istarContributionLinkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "target.decoration", "arrow",
			 "width", "2"
		   });
	}

} //IstarPackageImpl
