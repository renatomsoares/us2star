/**
 */
package br.com.us2star.istar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarActorLinkType;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.us2star.istar.impl.IstarActorLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.com.us2star.istar.impl.IstarActorLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link br.com.us2star.istar.impl.IstarActorLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IstarActorLinkImpl extends IstarRelationshipImpl implements IstarActorLink {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IstarActorLinkType TYPE_EDEFAULT = IstarActorLinkType.ISA;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IstarActorLinkType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IstarCompartment source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IstarCompartment target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarActorLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarPackage.Literals.ISTAR_ACTOR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarActorLinkType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IstarActorLinkType newType) {
		IstarActorLinkType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_ACTOR_LINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartment getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IstarCompartment)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.ISTAR_ACTOR_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartment basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IstarCompartment newSource) {
		IstarCompartment oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_ACTOR_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartment getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IstarCompartment)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.ISTAR_ACTOR_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartment basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IstarCompartment newTarget) {
		IstarCompartment oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_ACTOR_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarPackage.ISTAR_ACTOR_LINK__TYPE:
				return getType();
			case IstarPackage.ISTAR_ACTOR_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IstarPackage.ISTAR_ACTOR_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IstarPackage.ISTAR_ACTOR_LINK__TYPE:
				setType((IstarActorLinkType)newValue);
				return;
			case IstarPackage.ISTAR_ACTOR_LINK__SOURCE:
				setSource((IstarCompartment)newValue);
				return;
			case IstarPackage.ISTAR_ACTOR_LINK__TARGET:
				setTarget((IstarCompartment)newValue);
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
			case IstarPackage.ISTAR_ACTOR_LINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IstarPackage.ISTAR_ACTOR_LINK__SOURCE:
				setSource((IstarCompartment)null);
				return;
			case IstarPackage.ISTAR_ACTOR_LINK__TARGET:
				setTarget((IstarCompartment)null);
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
			case IstarPackage.ISTAR_ACTOR_LINK__TYPE:
				return type != TYPE_EDEFAULT;
			case IstarPackage.ISTAR_ACTOR_LINK__SOURCE:
				return source != null;
			case IstarPackage.ISTAR_ACTOR_LINK__TARGET:
				return target != null;
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

} //IstarActorLinkImpl
