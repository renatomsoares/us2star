/**
 */
package br.com.us2star.istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.us2star.istar.IstarActorLink#getType <em>Type</em>}</li>
 *   <li>{@link br.com.us2star.istar.IstarActorLink#getSource <em>Source</em>}</li>
 *   <li>{@link br.com.us2star.istar.IstarActorLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.us2star.istar.IstarPackage#getIstarActorLink()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' width='2' label='type'"
 * @generated
 */
public interface IstarActorLink extends IstarRelationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.us2star.istar.IstarActorLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarActorLinkType
	 * @see #setType(IstarActorLinkType)
	 * @see br.com.us2star.istar.IstarPackage#getIstarActorLink_Type()
	 * @model
	 * @generated
	 */
	IstarActorLinkType getType();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarActorLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarActorLinkType
	 * @see #getType()
	 * @generated
	 */
	void setType(IstarActorLinkType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IstarCompartment)
	 * @see br.com.us2star.istar.IstarPackage#getIstarActorLink_Source()
	 * @model
	 * @generated
	 */
	IstarCompartment getSource();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarActorLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IstarCompartment value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IstarCompartment)
	 * @see br.com.us2star.istar.IstarPackage#getIstarActorLink_Target()
	 * @model
	 * @generated
	 */
	IstarCompartment getTarget();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarActorLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IstarCompartment value);

} // IstarActorLink
