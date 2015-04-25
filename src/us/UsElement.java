/**
 */
package us;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link us.UsElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see us.UsPackage#getUsElement()
 * @model
 * @generated
 */
public interface UsElement extends UsPart {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link us.UsElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see us.UsElementType
	 * @see #setType(UsElementType)
	 * @see us.UsPackage#getUsElement_Type()
	 * @model
	 * @generated
	 */
	UsElementType getType();

	/**
	 * Sets the value of the '{@link us.UsElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see us.UsElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(UsElementType value);

} // UsElement
