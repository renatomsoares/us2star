/**
 */
package istar.provider;


import istar.IstarCompartment;
import istar.IstarFactory;
import istar.IstarPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link istar.IstarCompartment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarCompartmentItemProvider extends IstarNodeObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarCompartmentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IstarCompartment_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IstarCompartment_type_feature", "_UI_IstarCompartment_type"),
				 IstarPackage.Literals.ISTAR_COMPARTMENT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(IstarPackage.Literals.ISTAR_COMPARTMENT__MEAN_END_LINKS);
			childrenFeatures.add(IstarPackage.Literals.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS);
			childrenFeatures.add(IstarPackage.Literals.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS);
			childrenFeatures.add(IstarPackage.Literals.ISTAR_COMPARTMENT__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns IstarCompartment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IstarCompartment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IstarCompartment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IstarCompartment_type") :
			getString("_UI_IstarCompartment_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IstarCompartment.class)) {
			case IstarPackage.ISTAR_COMPARTMENT__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IstarPackage.ISTAR_COMPARTMENT__MEAN_END_LINKS:
			case IstarPackage.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS:
			case IstarPackage.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS:
			case IstarPackage.ISTAR_COMPARTMENT__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR_COMPARTMENT__MEAN_END_LINKS,
				 IstarFactory.eINSTANCE.createIstarMeanEndLink()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR_COMPARTMENT__TASKS_DECOMPOSITIONS,
				 IstarFactory.eINSTANCE.createIstarTaskDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR_COMPARTMENT__CONTRIBUTION_LINKS,
				 IstarFactory.eINSTANCE.createIstarContributionLink()));

		newChildDescriptors.add
			(createChildParameter
				(IstarPackage.Literals.ISTAR_COMPARTMENT__ELEMENTS,
				 IstarFactory.eINSTANCE.createIstarElement()));
	}

}
