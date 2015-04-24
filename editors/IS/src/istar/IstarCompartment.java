/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.IstarCompartment#getType <em>Type</em>}</li>
 *   <li>{@link istar.IstarCompartment#getMeanEndLinks <em>Mean End Links</em>}</li>
 *   <li>{@link istar.IstarCompartment#getTasksDecompositions <em>Tasks Decompositions</em>}</li>
 *   <li>{@link istar.IstarCompartment#getContributionLinks <em>Contribution Links</em>}</li>
 *   <li>{@link istar.IstarCompartment#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getIstarCompartment()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface IstarCompartment extends IstarNodeObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link istar.IstarCompartmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see istar.IstarCompartmentType
	 * @see #setType(IstarCompartmentType)
	 * @see istar.IstarPackage#getIstarCompartment_Type()
	 * @model
	 * @generated
	 */
	IstarCompartmentType getType();

	/**
	 * Sets the value of the '{@link istar.IstarCompartment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see istar.IstarCompartmentType
	 * @see #getType()
	 * @generated
	 */
	void setType(IstarCompartmentType value);

	/**
	 * Returns the value of the '<em><b>Mean End Links</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarMeanEndLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean End Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean End Links</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarCompartment_MeanEndLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarMeanEndLink> getMeanEndLinks();

	/**
	 * Returns the value of the '<em><b>Tasks Decompositions</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarTaskDecomposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks Decompositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks Decompositions</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarCompartment_TasksDecompositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarTaskDecomposition> getTasksDecompositions();

	/**
	 * Returns the value of the '<em><b>Contribution Links</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarContributionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Links</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarCompartment_ContributionLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarContributionLink> getContributionLinks();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarCompartment_Elements()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true'"
	 * @generated
	 */
	EList<IstarElement> getElements();

} // IstarCompartment
