/**
 */
package br.com.us2star.istar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.com.us2star.istar.IstarPackage
 * @generated
 */
public interface IstarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IstarFactory eINSTANCE = br.com.us2star.istar.impl.IstarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	IstarModel createIstarModel();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	IstarElement createIstarElement();

	/**
	 * Returns a new object of class '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment</em>'.
	 * @generated
	 */
	IstarCompartment createIstarCompartment();

	/**
	 * Returns a new object of class '<em>Actor Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Link</em>'.
	 * @generated
	 */
	IstarActorLink createIstarActorLink();

	/**
	 * Returns a new object of class '<em>Dependency Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Link</em>'.
	 * @generated
	 */
	IstarDependencyLink createIstarDependencyLink();

	/**
	 * Returns a new object of class '<em>Node Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Object</em>'.
	 * @generated
	 */
	IstarNodeObject createIstarNodeObject();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	IstarRelationship createIstarRelationship();

	/**
	 * Returns a new object of class '<em>Mean End Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mean End Link</em>'.
	 * @generated
	 */
	IstarMeanEndLink createIstarMeanEndLink();

	/**
	 * Returns a new object of class '<em>Intentional Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intentional Element</em>'.
	 * @generated
	 */
	IstarIntentionalElement createIstarIntentionalElement();

	/**
	 * Returns a new object of class '<em>Task Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Decomposition</em>'.
	 * @generated
	 */
	IstarTaskDecomposition createIstarTaskDecomposition();

	/**
	 * Returns a new object of class '<em>Contribution Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contribution Link</em>'.
	 * @generated
	 */
	IstarContributionLink createIstarContributionLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IstarPackage getIstarPackage();

} //IstarFactory
