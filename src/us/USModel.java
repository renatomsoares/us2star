/**
 */
package us;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link us.USModel#getName <em>Name</em>}</li>
 *   <li>{@link us.USModel#getUss <em>Uss</em>}</li>
 * </ul>
 * </p>
 *
 * @see us.UsPackage#getUSModel()
 * @model annotation="gmf.diagram model.extension='us' diagram.extension='usdiagram'"
 * @generated
 */
public interface USModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see us.UsPackage#getUSModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link us.USModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uss</b></em>' containment reference list.
	 * The list contents are of type {@link us.USNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uss</em>' containment reference list.
	 * @see us.UsPackage#getUSModel_Uss()
	 * @model containment="true"
	 * @generated
	 */
	EList<USNode> getUss();

} // USModel
