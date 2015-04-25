/**
 */
package istar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.IstarModel#getTitle <em>Title</em>}</li>
 *   <li>{@link istar.IstarModel#getDependencyLinks <em>Dependency Links</em>}</li>
 *   <li>{@link istar.IstarModel#getActorLinks <em>Actor Links</em>}</li>
 *   <li>{@link istar.IstarModel#getElements <em>Elements</em>}</li>
 *   <li>{@link istar.IstarModel#getCompartments <em>Compartments</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getIstarModel()
 * @model annotation="gmf.diagram model.extension='istar' diagram.extension='istardiagram'"
 * @generated
 */
public interface IstarModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see istar.IstarPackage#getIstarModel_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link istar.IstarModel#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Dependency Links</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarDependencyLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Links</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarModel_DependencyLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarDependencyLink> getDependencyLinks();

	/**
	 * Returns the value of the '<em><b>Actor Links</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarActorLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Links</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarModel_ActorLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarActorLink> getActorLinks();

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
	 * @see istar.IstarPackage#getIstarModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarElement> getElements();

	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link istar.IstarCompartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see istar.IstarPackage#getIstarModel_Compartments()
	 * @model containment="true"
	 * @generated
	 */
	EList<IstarCompartment> getCompartments();

} // IstarModel
