/**
 */
package us;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link us.USNode#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see us.UsPackage#getUSNode()
 * @model
 * @generated
 */
public interface USNode extends UsPart {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link us.UsElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see us.UsPackage#getUSNode_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsElement> getElements();

} // USNode
