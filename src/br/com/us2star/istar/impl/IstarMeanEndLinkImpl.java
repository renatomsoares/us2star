/**
 */
package br.com.us2star.istar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import br.com.us2star.istar.IstarIntentionalElement;
import br.com.us2star.istar.IstarMeanEndLink;
import br.com.us2star.istar.IstarPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mean End Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.us2star.istar.impl.IstarMeanEndLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link br.com.us2star.istar.impl.IstarMeanEndLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IstarMeanEndLinkImpl extends IstarRelationshipImpl implements IstarMeanEndLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IstarIntentionalElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IstarIntentionalElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarMeanEndLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IstarPackage.Literals.ISTAR_MEAN_END_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarIntentionalElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IstarIntentionalElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.ISTAR_MEAN_END_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarIntentionalElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IstarIntentionalElement newSource) {
		IstarIntentionalElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_MEAN_END_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarIntentionalElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IstarIntentionalElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IstarPackage.ISTAR_MEAN_END_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarIntentionalElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IstarIntentionalElement newTarget) {
		IstarIntentionalElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IstarPackage.ISTAR_MEAN_END_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IstarPackage.ISTAR_MEAN_END_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case IstarPackage.ISTAR_MEAN_END_LINK__TARGET:
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
			case IstarPackage.ISTAR_MEAN_END_LINK__SOURCE:
				setSource((IstarIntentionalElement)newValue);
				return;
			case IstarPackage.ISTAR_MEAN_END_LINK__TARGET:
				setTarget((IstarIntentionalElement)newValue);
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
			case IstarPackage.ISTAR_MEAN_END_LINK__SOURCE:
				setSource((IstarIntentionalElement)null);
				return;
			case IstarPackage.ISTAR_MEAN_END_LINK__TARGET:
				setTarget((IstarIntentionalElement)null);
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
			case IstarPackage.ISTAR_MEAN_END_LINK__SOURCE:
				return source != null;
			case IstarPackage.ISTAR_MEAN_END_LINK__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //IstarMeanEndLinkImpl
