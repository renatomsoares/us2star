/**
 */
package br.com.us2star.istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.us2star.istar.IstarDependencyLink#getType <em>Type</em>}</li>
 *   <li>{@link br.com.us2star.istar.IstarDependencyLink#getSource <em>Source</em>}</li>
 *   <li>{@link br.com.us2star.istar.IstarDependencyLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.us2star.istar.IstarPackage#getIstarDependencyLink()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' width='2'"
 * @generated
 */
public interface IstarDependencyLink extends IstarRelationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.com.us2star.istar.IstarDependencyLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarDependencyLinkType
	 * @see #setType(IstarDependencyLinkType)
	 * @see br.com.us2star.istar.IstarPackage#getIstarDependencyLink_Type()
	 * @model
	 * @generated
	 */
	IstarDependencyLinkType getType();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarDependencyLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see br.com.us2star.istar.IstarDependencyLinkType
	 * @see #getType()
	 * @generated
	 */
	void setType(IstarDependencyLinkType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IstarNodeObject)
	 * @see br.com.us2star.istar.IstarPackage#getIstarDependencyLink_Source()
	 * @model
	 * @generated
	 */
	IstarNodeObject getSource();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarDependencyLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IstarNodeObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IstarNodeObject)
	 * @see br.com.us2star.istar.IstarPackage#getIstarDependencyLink_Target()
	 * @model
	 * @generated
	 */
	IstarNodeObject getTarget();

	/**
	 * Sets the value of the '{@link br.com.us2star.istar.IstarDependencyLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IstarNodeObject value);

} // IstarDependencyLink
