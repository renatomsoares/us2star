/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mean End Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.IstarMeanEndLink#getSource <em>Source</em>}</li>
 *   <li>{@link istar.IstarMeanEndLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getIstarMeanEndLink()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' width='2'"
 * @generated
 */
public interface IstarMeanEndLink extends IstarRelationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IstarIntentionalElement)
	 * @see istar.IstarPackage#getIstarMeanEndLink_Source()
	 * @model
	 * @generated
	 */
	IstarIntentionalElement getSource();

	/**
	 * Sets the value of the '{@link istar.IstarMeanEndLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IstarIntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IstarIntentionalElement)
	 * @see istar.IstarPackage#getIstarMeanEndLink_Target()
	 * @model
	 * @generated
	 */
	IstarIntentionalElement getTarget();

	/**
	 * Sets the value of the '{@link istar.IstarMeanEndLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IstarIntentionalElement value);

} // IstarMeanEndLink
