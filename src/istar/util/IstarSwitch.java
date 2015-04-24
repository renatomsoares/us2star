/**
 */
package istar.util;

import istar.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage
 * @generated
 */
public class IstarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IstarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarSwitch() {
		if (modelPackage == null) {
			modelPackage = IstarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IstarPackage.ISTAR_MODEL: {
				IstarModel istarModel = (IstarModel)theEObject;
				T result = caseIstarModel(istarModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_ELEMENT: {
				IstarElement istarElement = (IstarElement)theEObject;
				T result = caseIstarElement(istarElement);
				if (result == null) result = caseIstarIntentionalElement(istarElement);
				if (result == null) result = caseIstarNodeObject(istarElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_COMPARTMENT: {
				IstarCompartment istarCompartment = (IstarCompartment)theEObject;
				T result = caseIstarCompartment(istarCompartment);
				if (result == null) result = caseIstarNodeObject(istarCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_ACTOR_LINK: {
				IstarActorLink istarActorLink = (IstarActorLink)theEObject;
				T result = caseIstarActorLink(istarActorLink);
				if (result == null) result = caseIstarRelationship(istarActorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_DEPENDENCY_LINK: {
				IstarDependencyLink istarDependencyLink = (IstarDependencyLink)theEObject;
				T result = caseIstarDependencyLink(istarDependencyLink);
				if (result == null) result = caseIstarRelationship(istarDependencyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_NODE_OBJECT: {
				IstarNodeObject istarNodeObject = (IstarNodeObject)theEObject;
				T result = caseIstarNodeObject(istarNodeObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_RELATIONSHIP: {
				IstarRelationship istarRelationship = (IstarRelationship)theEObject;
				T result = caseIstarRelationship(istarRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_MEAN_END_LINK: {
				IstarMeanEndLink istarMeanEndLink = (IstarMeanEndLink)theEObject;
				T result = caseIstarMeanEndLink(istarMeanEndLink);
				if (result == null) result = caseIstarRelationship(istarMeanEndLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_INTENTIONAL_ELEMENT: {
				IstarIntentionalElement istarIntentionalElement = (IstarIntentionalElement)theEObject;
				T result = caseIstarIntentionalElement(istarIntentionalElement);
				if (result == null) result = caseIstarNodeObject(istarIntentionalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_TASK_DECOMPOSITION: {
				IstarTaskDecomposition istarTaskDecomposition = (IstarTaskDecomposition)theEObject;
				T result = caseIstarTaskDecomposition(istarTaskDecomposition);
				if (result == null) result = caseIstarRelationship(istarTaskDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IstarPackage.ISTAR_CONTRIBUTION_LINK: {
				IstarContributionLink istarContributionLink = (IstarContributionLink)theEObject;
				T result = caseIstarContributionLink(istarContributionLink);
				if (result == null) result = caseIstarRelationship(istarContributionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarModel(IstarModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarElement(IstarElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarCompartment(IstarCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarActorLink(IstarActorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarDependencyLink(IstarDependencyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarNodeObject(IstarNodeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarRelationship(IstarRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mean End Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mean End Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarMeanEndLink(IstarMeanEndLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intentional Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarIntentionalElement(IstarIntentionalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarTaskDecomposition(IstarTaskDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIstarContributionLink(IstarContributionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IstarSwitch
