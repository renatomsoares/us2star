/**
 */
package br.com.us2star.istar.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import br.com.us2star.istar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.com.us2star.istar.IstarPackage
 * @generated
 */
public class IstarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IstarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IstarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarSwitch<Adapter> modelSwitch =
		new IstarSwitch<Adapter>() {
			@Override
			public Adapter caseIstarModel(IstarModel object) {
				return createIstarModelAdapter();
			}
			@Override
			public Adapter caseIstarElement(IstarElement object) {
				return createIstarElementAdapter();
			}
			@Override
			public Adapter caseIstarCompartment(IstarCompartment object) {
				return createIstarCompartmentAdapter();
			}
			@Override
			public Adapter caseIstarActorLink(IstarActorLink object) {
				return createIstarActorLinkAdapter();
			}
			@Override
			public Adapter caseIstarDependencyLink(IstarDependencyLink object) {
				return createIstarDependencyLinkAdapter();
			}
			@Override
			public Adapter caseIstarNodeObject(IstarNodeObject object) {
				return createIstarNodeObjectAdapter();
			}
			@Override
			public Adapter caseIstarRelationship(IstarRelationship object) {
				return createIstarRelationshipAdapter();
			}
			@Override
			public Adapter caseIstarMeanEndLink(IstarMeanEndLink object) {
				return createIstarMeanEndLinkAdapter();
			}
			@Override
			public Adapter caseIstarIntentionalElement(IstarIntentionalElement object) {
				return createIstarIntentionalElementAdapter();
			}
			@Override
			public Adapter caseIstarTaskDecomposition(IstarTaskDecomposition object) {
				return createIstarTaskDecompositionAdapter();
			}
			@Override
			public Adapter caseIstarContributionLink(IstarContributionLink object) {
				return createIstarContributionLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarModel
	 * @generated
	 */
	public Adapter createIstarModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarElement
	 * @generated
	 */
	public Adapter createIstarElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarCompartment
	 * @generated
	 */
	public Adapter createIstarCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarActorLink <em>Actor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarActorLink
	 * @generated
	 */
	public Adapter createIstarActorLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarDependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarDependencyLink
	 * @generated
	 */
	public Adapter createIstarDependencyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarNodeObject <em>Node Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarNodeObject
	 * @generated
	 */
	public Adapter createIstarNodeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarRelationship
	 * @generated
	 */
	public Adapter createIstarRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarMeanEndLink <em>Mean End Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarMeanEndLink
	 * @generated
	 */
	public Adapter createIstarMeanEndLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarIntentionalElement <em>Intentional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarIntentionalElement
	 * @generated
	 */
	public Adapter createIstarIntentionalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarTaskDecomposition <em>Task Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarTaskDecomposition
	 * @generated
	 */
	public Adapter createIstarTaskDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.us2star.istar.IstarContributionLink <em>Contribution Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.us2star.istar.IstarContributionLink
	 * @generated
	 */
	public Adapter createIstarContributionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IstarAdapterFactory
