/**
 */
package istar.provider;

import istar.util.IstarAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarItemProviderAdapterFactory extends IstarAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarModelItemProvider istarModelItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarModelAdapter() {
		if (istarModelItemProvider == null) {
			istarModelItemProvider = new IstarModelItemProvider(this);
		}

		return istarModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarElementItemProvider istarElementItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarElementAdapter() {
		if (istarElementItemProvider == null) {
			istarElementItemProvider = new IstarElementItemProvider(this);
		}

		return istarElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarCompartment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarCompartmentItemProvider istarCompartmentItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarCompartment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarCompartmentAdapter() {
		if (istarCompartmentItemProvider == null) {
			istarCompartmentItemProvider = new IstarCompartmentItemProvider(this);
		}

		return istarCompartmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarActorLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarActorLinkItemProvider istarActorLinkItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarActorLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarActorLinkAdapter() {
		if (istarActorLinkItemProvider == null) {
			istarActorLinkItemProvider = new IstarActorLinkItemProvider(this);
		}

		return istarActorLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarDependencyLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarDependencyLinkItemProvider istarDependencyLinkItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarDependencyLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarDependencyLinkAdapter() {
		if (istarDependencyLinkItemProvider == null) {
			istarDependencyLinkItemProvider = new IstarDependencyLinkItemProvider(this);
		}

		return istarDependencyLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarNodeObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarNodeObjectItemProvider istarNodeObjectItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarNodeObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarNodeObjectAdapter() {
		if (istarNodeObjectItemProvider == null) {
			istarNodeObjectItemProvider = new IstarNodeObjectItemProvider(this);
		}

		return istarNodeObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarRelationshipItemProvider istarRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarRelationshipAdapter() {
		if (istarRelationshipItemProvider == null) {
			istarRelationshipItemProvider = new IstarRelationshipItemProvider(this);
		}

		return istarRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarMeanEndLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarMeanEndLinkItemProvider istarMeanEndLinkItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarMeanEndLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarMeanEndLinkAdapter() {
		if (istarMeanEndLinkItemProvider == null) {
			istarMeanEndLinkItemProvider = new IstarMeanEndLinkItemProvider(this);
		}

		return istarMeanEndLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarIntentionalElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarIntentionalElementItemProvider istarIntentionalElementItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarIntentionalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarIntentionalElementAdapter() {
		if (istarIntentionalElementItemProvider == null) {
			istarIntentionalElementItemProvider = new IstarIntentionalElementItemProvider(this);
		}

		return istarIntentionalElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarTaskDecomposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarTaskDecompositionItemProvider istarTaskDecompositionItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarTaskDecomposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarTaskDecompositionAdapter() {
		if (istarTaskDecompositionItemProvider == null) {
			istarTaskDecompositionItemProvider = new IstarTaskDecompositionItemProvider(this);
		}

		return istarTaskDecompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link istar.IstarContributionLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IstarContributionLinkItemProvider istarContributionLinkItemProvider;

	/**
	 * This creates an adapter for a {@link istar.IstarContributionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIstarContributionLinkAdapter() {
		if (istarContributionLinkItemProvider == null) {
			istarContributionLinkItemProvider = new IstarContributionLinkItemProvider(this);
		}

		return istarContributionLinkItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (istarModelItemProvider != null) istarModelItemProvider.dispose();
		if (istarElementItemProvider != null) istarElementItemProvider.dispose();
		if (istarCompartmentItemProvider != null) istarCompartmentItemProvider.dispose();
		if (istarActorLinkItemProvider != null) istarActorLinkItemProvider.dispose();
		if (istarDependencyLinkItemProvider != null) istarDependencyLinkItemProvider.dispose();
		if (istarNodeObjectItemProvider != null) istarNodeObjectItemProvider.dispose();
		if (istarRelationshipItemProvider != null) istarRelationshipItemProvider.dispose();
		if (istarMeanEndLinkItemProvider != null) istarMeanEndLinkItemProvider.dispose();
		if (istarIntentionalElementItemProvider != null) istarIntentionalElementItemProvider.dispose();
		if (istarTaskDecompositionItemProvider != null) istarTaskDecompositionItemProvider.dispose();
		if (istarContributionLinkItemProvider != null) istarContributionLinkItemProvider.dispose();
	}

}