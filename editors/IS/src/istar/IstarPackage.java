/**
 */
package istar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see istar.IstarFactory
 * @model kind="package"
 * @generated
 */
public interface IstarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "istar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "IstarModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IstarModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstarPackage eINSTANCE = istar.impl.IstarPackageImpl.init();

	/**
	 * The meta object id for the '{@link istar.impl.IstarModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarModelImpl
	 * @see istar.impl.IstarPackageImpl#getIstarModel()
	 * @generated
	 */
	int ISTAR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Dependency Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL__DEPENDENCY_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Actor Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL__ACTOR_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL__COMPARTMENTS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link istar.impl.IstarNodeObjectImpl <em>Node Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarNodeObjectImpl
	 * @see istar.impl.IstarPackageImpl#getIstarNodeObject()
	 * @generated
	 */
	int ISTAR_NODE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_NODE_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_NODE_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link istar.impl.IstarIntentionalElementImpl <em>Intentional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarIntentionalElementImpl
	 * @see istar.impl.IstarPackageImpl#getIstarIntentionalElement()
	 * @generated
	 */
	int ISTAR_INTENTIONAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_INTENTIONAL_ELEMENT__NAME = ISTAR_NODE_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Intentional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_INTENTIONAL_ELEMENT_FEATURE_COUNT = ISTAR_NODE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link istar.impl.IstarElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarElementImpl
	 * @see istar.impl.IstarPackageImpl#getIstarElement()
	 * @generated
	 */
	int ISTAR_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ELEMENT__NAME = ISTAR_INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ELEMENT__TYPE = ISTAR_INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ELEMENT_FEATURE_COUNT = ISTAR_INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link istar.impl.IstarCompartmentImpl <em>Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarCompartmentImpl
	 * @see istar.impl.IstarPackageImpl#getIstarCompartment()
	 * @generated
	 */
	int ISTAR_COMPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__NAME = ISTAR_NODE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__TYPE = ISTAR_NODE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean End Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__MEAN_END_LINKS = ISTAR_NODE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks Decompositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS = ISTAR_NODE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contribution Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__CONTRIBUTION_LINKS = ISTAR_NODE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT__ELEMENTS = ISTAR_NODE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_COMPARTMENT_FEATURE_COUNT = ISTAR_NODE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link istar.impl.IstarRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarRelationshipImpl
	 * @see istar.impl.IstarPackageImpl#getIstarRelationship()
	 * @generated
	 */
	int ISTAR_RELATIONSHIP = 6;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_RELATIONSHIP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link istar.impl.IstarActorLinkImpl <em>Actor Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarActorLinkImpl
	 * @see istar.impl.IstarPackageImpl#getIstarActorLink()
	 * @generated
	 */
	int ISTAR_ACTOR_LINK = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ACTOR_LINK__TYPE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ACTOR_LINK__SOURCE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ACTOR_LINK__TARGET = ISTAR_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_ACTOR_LINK_FEATURE_COUNT = ISTAR_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link istar.impl.IstarDependencyLinkImpl <em>Dependency Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarDependencyLinkImpl
	 * @see istar.impl.IstarPackageImpl#getIstarDependencyLink()
	 * @generated
	 */
	int ISTAR_DEPENDENCY_LINK = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DEPENDENCY_LINK__TYPE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DEPENDENCY_LINK__SOURCE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DEPENDENCY_LINK__TARGET = ISTAR_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_DEPENDENCY_LINK_FEATURE_COUNT = ISTAR_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link istar.impl.IstarMeanEndLinkImpl <em>Mean End Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarMeanEndLinkImpl
	 * @see istar.impl.IstarPackageImpl#getIstarMeanEndLink()
	 * @generated
	 */
	int ISTAR_MEAN_END_LINK = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MEAN_END_LINK__SOURCE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MEAN_END_LINK__TARGET = ISTAR_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mean End Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_MEAN_END_LINK_FEATURE_COUNT = ISTAR_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link istar.impl.IstarTaskDecompositionImpl <em>Task Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarTaskDecompositionImpl
	 * @see istar.impl.IstarPackageImpl#getIstarTaskDecomposition()
	 * @generated
	 */
	int ISTAR_TASK_DECOMPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_TASK_DECOMPOSITION__SOURCE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_TASK_DECOMPOSITION__TARGET = ISTAR_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_TASK_DECOMPOSITION_FEATURE_COUNT = ISTAR_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link istar.impl.IstarContributionLinkImpl <em>Contribution Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.impl.IstarContributionLinkImpl
	 * @see istar.impl.IstarPackageImpl#getIstarContributionLink()
	 * @generated
	 */
	int ISTAR_CONTRIBUTION_LINK = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_CONTRIBUTION_LINK__TYPE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_CONTRIBUTION_LINK__SOURCE = ISTAR_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_CONTRIBUTION_LINK__TARGET = ISTAR_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contribution Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAR_CONTRIBUTION_LINK_FEATURE_COUNT = ISTAR_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link istar.IstarCompartmentType <em>Compartment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.IstarCompartmentType
	 * @see istar.impl.IstarPackageImpl#getIstarCompartmentType()
	 * @generated
	 */
	int ISTAR_COMPARTMENT_TYPE = 11;

	/**
	 * The meta object id for the '{@link istar.IstarElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.IstarElementType
	 * @see istar.impl.IstarPackageImpl#getIstarElementType()
	 * @generated
	 */
	int ISTAR_ELEMENT_TYPE = 12;

	/**
	 * The meta object id for the '{@link istar.IstarDependencyLinkType <em>Dependency Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.IstarDependencyLinkType
	 * @see istar.impl.IstarPackageImpl#getIstarDependencyLinkType()
	 * @generated
	 */
	int ISTAR_DEPENDENCY_LINK_TYPE = 13;

	/**
	 * The meta object id for the '{@link istar.IstarActorLinkType <em>Actor Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.IstarActorLinkType
	 * @see istar.impl.IstarPackageImpl#getIstarActorLinkType()
	 * @generated
	 */
	int ISTAR_ACTOR_LINK_TYPE = 14;

	/**
	 * The meta object id for the '{@link istar.IstarContributionType <em>Contribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see istar.IstarContributionType
	 * @see istar.impl.IstarPackageImpl#getIstarContributionType()
	 * @generated
	 */
	int ISTAR_CONTRIBUTION_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link istar.IstarModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see istar.IstarModel
	 * @generated
	 */
	EClass getIstarModel();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarModel#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see istar.IstarModel#getTitle()
	 * @see #getIstarModel()
	 * @generated
	 */
	EAttribute getIstarModel_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarModel#getDependencyLinks <em>Dependency Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency Links</em>'.
	 * @see istar.IstarModel#getDependencyLinks()
	 * @see #getIstarModel()
	 * @generated
	 */
	EReference getIstarModel_DependencyLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarModel#getActorLinks <em>Actor Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Links</em>'.
	 * @see istar.IstarModel#getActorLinks()
	 * @see #getIstarModel()
	 * @generated
	 */
	EReference getIstarModel_ActorLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see istar.IstarModel#getElements()
	 * @see #getIstarModel()
	 * @generated
	 */
	EReference getIstarModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarModel#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compartments</em>'.
	 * @see istar.IstarModel#getCompartments()
	 * @see #getIstarModel()
	 * @generated
	 */
	EReference getIstarModel_Compartments();

	/**
	 * Returns the meta object for class '{@link istar.IstarElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see istar.IstarElement
	 * @generated
	 */
	EClass getIstarElement();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see istar.IstarElement#getType()
	 * @see #getIstarElement()
	 * @generated
	 */
	EAttribute getIstarElement_Type();

	/**
	 * Returns the meta object for class '{@link istar.IstarCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compartment</em>'.
	 * @see istar.IstarCompartment
	 * @generated
	 */
	EClass getIstarCompartment();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarCompartment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see istar.IstarCompartment#getType()
	 * @see #getIstarCompartment()
	 * @generated
	 */
	EAttribute getIstarCompartment_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarCompartment#getMeanEndLinks <em>Mean End Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mean End Links</em>'.
	 * @see istar.IstarCompartment#getMeanEndLinks()
	 * @see #getIstarCompartment()
	 * @generated
	 */
	EReference getIstarCompartment_MeanEndLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarCompartment#getTasksDecompositions <em>Tasks Decompositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks Decompositions</em>'.
	 * @see istar.IstarCompartment#getTasksDecompositions()
	 * @see #getIstarCompartment()
	 * @generated
	 */
	EReference getIstarCompartment_TasksDecompositions();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarCompartment#getContributionLinks <em>Contribution Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contribution Links</em>'.
	 * @see istar.IstarCompartment#getContributionLinks()
	 * @see #getIstarCompartment()
	 * @generated
	 */
	EReference getIstarCompartment_ContributionLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link istar.IstarCompartment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see istar.IstarCompartment#getElements()
	 * @see #getIstarCompartment()
	 * @generated
	 */
	EReference getIstarCompartment_Elements();

	/**
	 * Returns the meta object for class '{@link istar.IstarActorLink <em>Actor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Link</em>'.
	 * @see istar.IstarActorLink
	 * @generated
	 */
	EClass getIstarActorLink();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarActorLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see istar.IstarActorLink#getType()
	 * @see #getIstarActorLink()
	 * @generated
	 */
	EAttribute getIstarActorLink_Type();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarActorLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see istar.IstarActorLink#getSource()
	 * @see #getIstarActorLink()
	 * @generated
	 */
	EReference getIstarActorLink_Source();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarActorLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see istar.IstarActorLink#getTarget()
	 * @see #getIstarActorLink()
	 * @generated
	 */
	EReference getIstarActorLink_Target();

	/**
	 * Returns the meta object for class '{@link istar.IstarDependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link</em>'.
	 * @see istar.IstarDependencyLink
	 * @generated
	 */
	EClass getIstarDependencyLink();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarDependencyLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see istar.IstarDependencyLink#getType()
	 * @see #getIstarDependencyLink()
	 * @generated
	 */
	EAttribute getIstarDependencyLink_Type();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarDependencyLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see istar.IstarDependencyLink#getSource()
	 * @see #getIstarDependencyLink()
	 * @generated
	 */
	EReference getIstarDependencyLink_Source();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarDependencyLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see istar.IstarDependencyLink#getTarget()
	 * @see #getIstarDependencyLink()
	 * @generated
	 */
	EReference getIstarDependencyLink_Target();

	/**
	 * Returns the meta object for class '{@link istar.IstarNodeObject <em>Node Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Object</em>'.
	 * @see istar.IstarNodeObject
	 * @generated
	 */
	EClass getIstarNodeObject();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarNodeObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see istar.IstarNodeObject#getName()
	 * @see #getIstarNodeObject()
	 * @generated
	 */
	EAttribute getIstarNodeObject_Name();

	/**
	 * Returns the meta object for class '{@link istar.IstarRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see istar.IstarRelationship
	 * @generated
	 */
	EClass getIstarRelationship();

	/**
	 * Returns the meta object for class '{@link istar.IstarMeanEndLink <em>Mean End Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mean End Link</em>'.
	 * @see istar.IstarMeanEndLink
	 * @generated
	 */
	EClass getIstarMeanEndLink();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarMeanEndLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see istar.IstarMeanEndLink#getSource()
	 * @see #getIstarMeanEndLink()
	 * @generated
	 */
	EReference getIstarMeanEndLink_Source();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarMeanEndLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see istar.IstarMeanEndLink#getTarget()
	 * @see #getIstarMeanEndLink()
	 * @generated
	 */
	EReference getIstarMeanEndLink_Target();

	/**
	 * Returns the meta object for class '{@link istar.IstarIntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intentional Element</em>'.
	 * @see istar.IstarIntentionalElement
	 * @generated
	 */
	EClass getIstarIntentionalElement();

	/**
	 * Returns the meta object for class '{@link istar.IstarTaskDecomposition <em>Task Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Decomposition</em>'.
	 * @see istar.IstarTaskDecomposition
	 * @generated
	 */
	EClass getIstarTaskDecomposition();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarTaskDecomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see istar.IstarTaskDecomposition#getSource()
	 * @see #getIstarTaskDecomposition()
	 * @generated
	 */
	EReference getIstarTaskDecomposition_Source();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarTaskDecomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see istar.IstarTaskDecomposition#getTarget()
	 * @see #getIstarTaskDecomposition()
	 * @generated
	 */
	EReference getIstarTaskDecomposition_Target();

	/**
	 * Returns the meta object for class '{@link istar.IstarContributionLink <em>Contribution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution Link</em>'.
	 * @see istar.IstarContributionLink
	 * @generated
	 */
	EClass getIstarContributionLink();

	/**
	 * Returns the meta object for the attribute '{@link istar.IstarContributionLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see istar.IstarContributionLink#getType()
	 * @see #getIstarContributionLink()
	 * @generated
	 */
	EAttribute getIstarContributionLink_Type();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarContributionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see istar.IstarContributionLink#getSource()
	 * @see #getIstarContributionLink()
	 * @generated
	 */
	EReference getIstarContributionLink_Source();

	/**
	 * Returns the meta object for the reference '{@link istar.IstarContributionLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see istar.IstarContributionLink#getTarget()
	 * @see #getIstarContributionLink()
	 * @generated
	 */
	EReference getIstarContributionLink_Target();

	/**
	 * Returns the meta object for enum '{@link istar.IstarCompartmentType <em>Compartment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compartment Type</em>'.
	 * @see istar.IstarCompartmentType
	 * @generated
	 */
	EEnum getIstarCompartmentType();

	/**
	 * Returns the meta object for enum '{@link istar.IstarElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see istar.IstarElementType
	 * @generated
	 */
	EEnum getIstarElementType();

	/**
	 * Returns the meta object for enum '{@link istar.IstarDependencyLinkType <em>Dependency Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Link Type</em>'.
	 * @see istar.IstarDependencyLinkType
	 * @generated
	 */
	EEnum getIstarDependencyLinkType();

	/**
	 * Returns the meta object for enum '{@link istar.IstarActorLinkType <em>Actor Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Link Type</em>'.
	 * @see istar.IstarActorLinkType
	 * @generated
	 */
	EEnum getIstarActorLinkType();

	/**
	 * Returns the meta object for enum '{@link istar.IstarContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contribution Type</em>'.
	 * @see istar.IstarContributionType
	 * @generated
	 */
	EEnum getIstarContributionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IstarFactory getIstarFactory();

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
		 * The meta object literal for the '{@link istar.impl.IstarModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarModelImpl
		 * @see istar.impl.IstarPackageImpl#getIstarModel()
		 * @generated
		 */
		EClass ISTAR_MODEL = eINSTANCE.getIstarModel();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_MODEL__TITLE = eINSTANCE.getIstarModel_Title();

		/**
		 * The meta object literal for the '<em><b>Dependency Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MODEL__DEPENDENCY_LINKS = eINSTANCE.getIstarModel_DependencyLinks();

		/**
		 * The meta object literal for the '<em><b>Actor Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MODEL__ACTOR_LINKS = eINSTANCE.getIstarModel_ActorLinks();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MODEL__ELEMENTS = eINSTANCE.getIstarModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MODEL__COMPARTMENTS = eINSTANCE.getIstarModel_Compartments();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarElementImpl
		 * @see istar.impl.IstarPackageImpl#getIstarElement()
		 * @generated
		 */
		EClass ISTAR_ELEMENT = eINSTANCE.getIstarElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_ELEMENT__TYPE = eINSTANCE.getIstarElement_Type();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarCompartmentImpl <em>Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarCompartmentImpl
		 * @see istar.impl.IstarPackageImpl#getIstarCompartment()
		 * @generated
		 */
		EClass ISTAR_COMPARTMENT = eINSTANCE.getIstarCompartment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_COMPARTMENT__TYPE = eINSTANCE.getIstarCompartment_Type();

		/**
		 * The meta object literal for the '<em><b>Mean End Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_COMPARTMENT__MEAN_END_LINKS = eINSTANCE.getIstarCompartment_MeanEndLinks();

		/**
		 * The meta object literal for the '<em><b>Tasks Decompositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS = eINSTANCE.getIstarCompartment_TasksDecompositions();

		/**
		 * The meta object literal for the '<em><b>Contribution Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_COMPARTMENT__CONTRIBUTION_LINKS = eINSTANCE.getIstarCompartment_ContributionLinks();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_COMPARTMENT__ELEMENTS = eINSTANCE.getIstarCompartment_Elements();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarActorLinkImpl <em>Actor Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarActorLinkImpl
		 * @see istar.impl.IstarPackageImpl#getIstarActorLink()
		 * @generated
		 */
		EClass ISTAR_ACTOR_LINK = eINSTANCE.getIstarActorLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_ACTOR_LINK__TYPE = eINSTANCE.getIstarActorLink_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_ACTOR_LINK__SOURCE = eINSTANCE.getIstarActorLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_ACTOR_LINK__TARGET = eINSTANCE.getIstarActorLink_Target();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarDependencyLinkImpl <em>Dependency Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarDependencyLinkImpl
		 * @see istar.impl.IstarPackageImpl#getIstarDependencyLink()
		 * @generated
		 */
		EClass ISTAR_DEPENDENCY_LINK = eINSTANCE.getIstarDependencyLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_DEPENDENCY_LINK__TYPE = eINSTANCE.getIstarDependencyLink_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_DEPENDENCY_LINK__SOURCE = eINSTANCE.getIstarDependencyLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_DEPENDENCY_LINK__TARGET = eINSTANCE.getIstarDependencyLink_Target();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarNodeObjectImpl <em>Node Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarNodeObjectImpl
		 * @see istar.impl.IstarPackageImpl#getIstarNodeObject()
		 * @generated
		 */
		EClass ISTAR_NODE_OBJECT = eINSTANCE.getIstarNodeObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_NODE_OBJECT__NAME = eINSTANCE.getIstarNodeObject_Name();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarRelationshipImpl
		 * @see istar.impl.IstarPackageImpl#getIstarRelationship()
		 * @generated
		 */
		EClass ISTAR_RELATIONSHIP = eINSTANCE.getIstarRelationship();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarMeanEndLinkImpl <em>Mean End Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarMeanEndLinkImpl
		 * @see istar.impl.IstarPackageImpl#getIstarMeanEndLink()
		 * @generated
		 */
		EClass ISTAR_MEAN_END_LINK = eINSTANCE.getIstarMeanEndLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MEAN_END_LINK__SOURCE = eINSTANCE.getIstarMeanEndLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_MEAN_END_LINK__TARGET = eINSTANCE.getIstarMeanEndLink_Target();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarIntentionalElementImpl <em>Intentional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarIntentionalElementImpl
		 * @see istar.impl.IstarPackageImpl#getIstarIntentionalElement()
		 * @generated
		 */
		EClass ISTAR_INTENTIONAL_ELEMENT = eINSTANCE.getIstarIntentionalElement();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarTaskDecompositionImpl <em>Task Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarTaskDecompositionImpl
		 * @see istar.impl.IstarPackageImpl#getIstarTaskDecomposition()
		 * @generated
		 */
		EClass ISTAR_TASK_DECOMPOSITION = eINSTANCE.getIstarTaskDecomposition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_TASK_DECOMPOSITION__SOURCE = eINSTANCE.getIstarTaskDecomposition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_TASK_DECOMPOSITION__TARGET = eINSTANCE.getIstarTaskDecomposition_Target();

		/**
		 * The meta object literal for the '{@link istar.impl.IstarContributionLinkImpl <em>Contribution Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.impl.IstarContributionLinkImpl
		 * @see istar.impl.IstarPackageImpl#getIstarContributionLink()
		 * @generated
		 */
		EClass ISTAR_CONTRIBUTION_LINK = eINSTANCE.getIstarContributionLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTAR_CONTRIBUTION_LINK__TYPE = eINSTANCE.getIstarContributionLink_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_CONTRIBUTION_LINK__SOURCE = eINSTANCE.getIstarContributionLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTAR_CONTRIBUTION_LINK__TARGET = eINSTANCE.getIstarContributionLink_Target();

		/**
		 * The meta object literal for the '{@link istar.IstarCompartmentType <em>Compartment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.IstarCompartmentType
		 * @see istar.impl.IstarPackageImpl#getIstarCompartmentType()
		 * @generated
		 */
		EEnum ISTAR_COMPARTMENT_TYPE = eINSTANCE.getIstarCompartmentType();

		/**
		 * The meta object literal for the '{@link istar.IstarElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.IstarElementType
		 * @see istar.impl.IstarPackageImpl#getIstarElementType()
		 * @generated
		 */
		EEnum ISTAR_ELEMENT_TYPE = eINSTANCE.getIstarElementType();

		/**
		 * The meta object literal for the '{@link istar.IstarDependencyLinkType <em>Dependency Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.IstarDependencyLinkType
		 * @see istar.impl.IstarPackageImpl#getIstarDependencyLinkType()
		 * @generated
		 */
		EEnum ISTAR_DEPENDENCY_LINK_TYPE = eINSTANCE.getIstarDependencyLinkType();

		/**
		 * The meta object literal for the '{@link istar.IstarActorLinkType <em>Actor Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.IstarActorLinkType
		 * @see istar.impl.IstarPackageImpl#getIstarActorLinkType()
		 * @generated
		 */
		EEnum ISTAR_ACTOR_LINK_TYPE = eINSTANCE.getIstarActorLinkType();

		/**
		 * The meta object literal for the '{@link istar.IstarContributionType <em>Contribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see istar.IstarContributionType
		 * @see istar.impl.IstarPackageImpl#getIstarContributionType()
		 * @generated
		 */
		EEnum ISTAR_CONTRIBUTION_TYPE = eINSTANCE.getIstarContributionType();

	}

} //IstarPackage
