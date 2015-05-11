/**
 */
package br.com.us2star.istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.us2star.istar.IstarElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.us2star.istar.IstarPackage#getIstarElement()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface IstarElement extends IstarIntentionalElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.us2star.istar.IstarElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarElementType
	 * @see #setType(IstarElementType)
	 * @see br.com.us2star.istar.IstarPackage#getIstarElement_Type()
	 * @model
	 * @generated
	 */
	IstarElementType getType();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(IstarElementType value);

} // IstarElement
