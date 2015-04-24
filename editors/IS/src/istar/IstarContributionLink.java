/**
 */
package istar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istar.IstarContributionLink#getType <em>Type</em>}</li>
 *   <li>{@link istar.IstarContributionLink#getSource <em>Source</em>}</li>
 *   <li>{@link istar.IstarContributionLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see istar.IstarPackage#getIstarContributionLink()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' width='2'"
 * @generated
 */
public interface IstarContributionLink extends IstarRelationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link istar.IstarContributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see istar.IstarContributionType
	 * @see #setType(IstarContributionType)
	 * @see istar.IstarPackage#getIstarContributionLink_Type()
	 * @model
	 * @generated
	 */
	IstarContributionType getType();

	/**
	 * Sets the value of the '{@link istar.IstarContributionLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see istar.IstarContributionType
	 * @see #getType()
	 * @generated
	 */
	void setType(IstarContributionType value);

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
	 * @see istar.IstarPackage#getIstarContributionLink_Source()
	 * @model
	 * @generated
	 */
	IstarIntentionalElement getSource();

	/**
	 * Sets the value of the '{@link istar.IstarContributionLink#getSource <em>Source</em>}' reference.
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
	 * @see istar.IstarPackage#getIstarContributionLink_Target()
	 * @model
	 * @generated
	 */
	IstarIntentionalElement getTarget();

	/**
	 * Sets the value of the '{@link istar.IstarContributionLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IstarIntentionalElement value);

} // IstarContributionLink
