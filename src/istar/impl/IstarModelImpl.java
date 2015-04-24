/**
 */
package istar.impl;

import istar.IstarActorLink;
import istar.IstarCompartment;
import istar.IstarDependencyLink;
import istar.IstarElement;
import istar.IstarModel;
import istar.IstarPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.IstarModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link istar.impl.IstarModelImpl#getDependencyLinks <em>Dependency Links</em>}</li>
 *   <li>{@link istar.impl.IstarModelImpl#getActorLinks <em>Actor Links</em>}</li>
 *   <li>{@link istar.impl.IstarModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link istar.impl.IstarModelImpl#getCompartments <em>Compartments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IstarModelImpl extends EObjectImpl implements IstarModel {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencyLinks() <em>Dependency Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarDependencyLink> dependencyLinks;

	/**
	 * The cached value of the '{@link #getActorLinks() <em>Actor Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarActorLink> actorLinks;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarElement> elements;

	/**
	 * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartments()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarCompartment> compartments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarPackage.Literals.ISTAR_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_MODEL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarDependencyLink> getDependencyLinks() {
		if (dependencyLinks == null) {
			dependencyLinks = new EObjectContainmentEList<IstarDependencyLink>(IstarDependencyLink.class, this, IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS);
		}
		return dependencyLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarActorLink> getActorLinks() {
		if (actorLinks == null) {
			actorLinks = new EObjectContainmentEList<IstarActorLink>(IstarActorLink.class, this, IstarPackage.ISTAR_MODEL__ACTOR_LINKS);
		}
		return actorLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<IstarElement>(IstarElement.class, this, IstarPackage.ISTAR_MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarCompartment> getCompartments() {
		if (compartments == null) {
			compartments = new EObjectContainmentEList<IstarCompartment>(IstarCompartment.class, this, IstarPackage.ISTAR_MODEL__COMPARTMENTS);
		}
		return compartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS:
				return ((InternalEList<?>)getDependencyLinks()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_MODEL__ACTOR_LINKS:
				return ((InternalEList<?>)getActorLinks()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_MODEL__COMPARTMENTS:
				return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarPackage.ISTAR_MODEL__TITLE:
				return getTitle();
			case IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS:
				return getDependencyLinks();
			case IstarPackage.ISTAR_MODEL__ACTOR_LINKS:
				return getActorLinks();
			case IstarPackage.ISTAR_MODEL__ELEMENTS:
				return getElements();
			case IstarPackage.ISTAR_MODEL__COMPARTMENTS:
				return getCompartments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IstarPackage.ISTAR_MODEL__TITLE:
				setTitle((String)newValue);
				return;
			case IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS:
				getDependencyLinks().clear();
				getDependencyLinks().addAll((Collection<? extends IstarDependencyLink>)newValue);
				return;
			case IstarPackage.ISTAR_MODEL__ACTOR_LINKS:
				getActorLinks().clear();
				getActorLinks().addAll((Collection<? extends IstarActorLink>)newValue);
				return;
			case IstarPackage.ISTAR_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends IstarElement>)newValue);
				return;
			case IstarPackage.ISTAR_MODEL__COMPARTMENTS:
				getCompartments().clear();
				getCompartments().addAll((Collection<? extends IstarCompartment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IstarPackage.ISTAR_MODEL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS:
				getDependencyLinks().clear();
				return;
			case IstarPackage.ISTAR_MODEL__ACTOR_LINKS:
				getActorLinks().clear();
				return;
			case IstarPackage.ISTAR_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case IstarPackage.ISTAR_MODEL__COMPARTMENTS:
				getCompartments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IstarPackage.ISTAR_MODEL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case IstarPackage.ISTAR_MODEL__DEPENDENCY_LINKS:
				return dependencyLinks != null && !dependencyLinks.isEmpty();
			case IstarPackage.ISTAR_MODEL__ACTOR_LINKS:
				return actorLinks != null && !actorLinks.isEmpty();
			case IstarPackage.ISTAR_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case IstarPackage.ISTAR_MODEL__COMPARTMENTS:
				return compartments != null && !compartments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //IstarModelImpl
