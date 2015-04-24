/**
 */
package istar.impl;

import istar.IstarCompartment;
import istar.IstarCompartmentType;
import istar.IstarContributionLink;
import istar.IstarElement;
import istar.IstarMeanEndLink;
import istar.IstarPackage;
import istar.IstarTaskDecomposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istar.impl.IstarCompartmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link istar.impl.IstarCompartmentImpl#getMeanEndLinks <em>Mean End Links</em>}</li>
 *   <li>{@link istar.impl.IstarCompartmentImpl#getTasksDecompositions <em>Tasks Decompositions</em>}</li>
 *   <li>{@link istar.impl.IstarCompartmentImpl#getContributionLinks <em>Contribution Links</em>}</li>
 *   <li>{@link istar.impl.IstarCompartmentImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IstarCompartmentImpl extends IstarNodeObjectImpl implements IstarCompartment {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IstarCompartmentType TYPE_EDEFAULT = IstarCompartmentType.ACTOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IstarCompartmentType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeanEndLinks() <em>Mean End Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanEndLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarMeanEndLink> meanEndLinks;

	/**
	 * The cached value of the '{@link #getTasksDecompositions() <em>Tasks Decompositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasksDecompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarTaskDecomposition> tasksDecompositions;

	/**
	 * The cached value of the '{@link #getContributionLinks() <em>Contribution Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<IstarContributionLink> contributionLinks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarPackage.Literals.ISTAR_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartmentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IstarCompartmentType newType) {
		IstarCompartmentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_COMPARTMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarMeanEndLink> getMeanEndLinks() {
		if (meanEndLinks == null) {
			meanEndLinks = new EObjectContainmentEList<IstarMeanEndLink>(IstarMeanEndLink.class, this, IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS);
		}
		return meanEndLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarTaskDecomposition> getTasksDecompositions() {
		if (tasksDecompositions == null) {
			tasksDecompositions = new EObjectContainmentEList<IstarTaskDecomposition>(IstarTaskDecomposition.class, this, IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS);
		}
		return tasksDecompositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarContributionLink> getContributionLinks() {
		if (contributionLinks == null) {
			contributionLinks = new EObjectContainmentEList<IstarContributionLink>(IstarContributionLink.class, this, IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS);
		}
		return contributionLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IstarElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<IstarElement>(IstarElement.class, this, IstarPackage.ISTAR_COMPARTMENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
				return ((InternalEList<?>)getMeanEndLinks()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
				return ((InternalEList<?>)getTasksDecompositions()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
				return ((InternalEList<?>)getContributionLinks()).basicRemove(otherEnd, msgs);
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case IstarPackage.ISTAR_COMPARTMENT__TYPE:
				return getType();
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
				return getMeanEndLinks();
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
				return getTasksDecompositions();
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
				return getContributionLinks();
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				return getElements();
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
			case IstarPackage.ISTAR_COMPARTMENT__TYPE:
				setType((IstarCompartmentType)newValue);
				return;
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
				getMeanEndLinks().clear();
				getMeanEndLinks().addAll((Collection<? extends IstarMeanEndLink>)newValue);
				return;
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
				getTasksDecompositions().clear();
				getTasksDecompositions().addAll((Collection<? extends IstarTaskDecomposition>)newValue);
				return;
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
				getContributionLinks().clear();
				getContributionLinks().addAll((Collection<? extends IstarContributionLink>)newValue);
				return;
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends IstarElement>)newValue);
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
			case IstarPackage.ISTAR_COMPARTMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
				getMeanEndLinks().clear();
				return;
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
				getTasksDecompositions().clear();
				return;
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
				getContributionLinks().clear();
				return;
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				getElements().clear();
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
			case IstarPackage.ISTAR_COMPARTMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
				return meanEndLinks != null && !meanEndLinks.isEmpty();
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
				return tasksDecompositions != null && !tasksDecompositions.isEmpty();
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
				return contributionLinks != null && !contributionLinks.isEmpty();
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IstarCompartmentImpl
