/*
 * 
 */
package istar.diagram.part;

import istar.IstarActorLink;
import istar.IstarCompartment;
import istar.IstarContributionLink;
import istar.IstarDependencyLink;
import istar.IstarElement;
import istar.IstarIntentionalElement;
import istar.IstarMeanEndLink;
import istar.IstarModel;
import istar.IstarNodeObject;
import istar.IstarPackage;
import istar.IstarTaskDecomposition;
import istar.diagram.edit.parts.IstarActorLinkEditPart;
import istar.diagram.edit.parts.IstarCompartmentEditPart;
import istar.diagram.edit.parts.IstarCompartmentIstarCompartmentElementsCompartmentEditPart;
import istar.diagram.edit.parts.IstarContributionLinkEditPart;
import istar.diagram.edit.parts.IstarDependencyLinkEditPart;
import istar.diagram.edit.parts.IstarElement2EditPart;
import istar.diagram.edit.parts.IstarElementEditPart;
import istar.diagram.edit.parts.IstarMeanEndLinkEditPart;
import istar.diagram.edit.parts.IstarModelEditPart;
import istar.diagram.edit.parts.IstarTaskDecompositionEditPart;
import istar.diagram.providers.IstarElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class IstarDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getSemanticChildren(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarModelEditPart.VISUAL_ID:
			return getIstarModel_1000SemanticChildren(view);
		case IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID:
			return getIstarCompartmentIstarCompartmentElementsCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getIstarModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		IstarModel modelElement = (IstarModel) view.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			IstarElement childElement = (IstarElement) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IstarElementEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCompartments().iterator(); it
				.hasNext();) {
			IstarCompartment childElement = (IstarCompartment) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IstarCompartmentEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getIstarCompartmentIstarCompartmentElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IstarCompartment modelElement = (IstarCompartment) containerView
				.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			IstarElement childElement = (IstarElement) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IstarElement2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getContainedLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarModelEditPart.VISUAL_ID:
			return getIstarModel_1000ContainedLinks(view);
		case IstarElementEditPart.VISUAL_ID:
			return getIstarElement_2001ContainedLinks(view);
		case IstarCompartmentEditPart.VISUAL_ID:
			return getIstarCompartment_2002ContainedLinks(view);
		case IstarElement2EditPart.VISUAL_ID:
			return getIstarElement_3001ContainedLinks(view);
		case IstarActorLinkEditPart.VISUAL_ID:
			return getIstarActorLink_4001ContainedLinks(view);
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getIstarDependencyLink_4002ContainedLinks(view);
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getIstarMeanEndLink_4003ContainedLinks(view);
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getIstarTaskDecomposition_4004ContainedLinks(view);
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getIstarContributionLink_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIncomingLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarElementEditPart.VISUAL_ID:
			return getIstarElement_2001IncomingLinks(view);
		case IstarCompartmentEditPart.VISUAL_ID:
			return getIstarCompartment_2002IncomingLinks(view);
		case IstarElement2EditPart.VISUAL_ID:
			return getIstarElement_3001IncomingLinks(view);
		case IstarActorLinkEditPart.VISUAL_ID:
			return getIstarActorLink_4001IncomingLinks(view);
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getIstarDependencyLink_4002IncomingLinks(view);
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getIstarMeanEndLink_4003IncomingLinks(view);
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getIstarTaskDecomposition_4004IncomingLinks(view);
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getIstarContributionLink_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOutgoingLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarElementEditPart.VISUAL_ID:
			return getIstarElement_2001OutgoingLinks(view);
		case IstarCompartmentEditPart.VISUAL_ID:
			return getIstarCompartment_2002OutgoingLinks(view);
		case IstarElement2EditPart.VISUAL_ID:
			return getIstarElement_3001OutgoingLinks(view);
		case IstarActorLinkEditPart.VISUAL_ID:
			return getIstarActorLink_4001OutgoingLinks(view);
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getIstarDependencyLink_4002OutgoingLinks(view);
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getIstarMeanEndLink_4003OutgoingLinks(view);
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getIstarTaskDecomposition_4004OutgoingLinks(view);
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getIstarContributionLink_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarModel_1000ContainedLinks(
			View view) {
		IstarModel modelElement = (IstarModel) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IstarActorLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IstarDependencyLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarCompartment_2002ContainedLinks(
			View view) {
		IstarCompartment modelElement = (IstarCompartment) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IstarMeanEndLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IstarTaskDecomposition_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IstarContributionLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarActorLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarDependencyLink_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarMeanEndLink_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarTaskDecomposition_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarContributionLink_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_2001IncomingLinks(
			View view) {
		IstarElement modelElement = (IstarElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IstarDependencyLink_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarMeanEndLink_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarTaskDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarContributionLink_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarCompartment_2002IncomingLinks(
			View view) {
		IstarCompartment modelElement = (IstarCompartment) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IstarActorLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarDependencyLink_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_3001IncomingLinks(
			View view) {
		IstarElement modelElement = (IstarElement) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IstarDependencyLink_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarMeanEndLink_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarTaskDecomposition_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IstarContributionLink_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarActorLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarDependencyLink_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarMeanEndLink_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarTaskDecomposition_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarContributionLink_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_2001OutgoingLinks(
			View view) {
		IstarElement modelElement = (IstarElement) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IstarDependencyLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarMeanEndLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarTaskDecomposition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarContributionLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarCompartment_2002OutgoingLinks(
			View view) {
		IstarCompartment modelElement = (IstarCompartment) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IstarActorLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarDependencyLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarElement_3001OutgoingLinks(
			View view) {
		IstarElement modelElement = (IstarElement) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IstarDependencyLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarMeanEndLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarTaskDecomposition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IstarContributionLink_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarActorLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarDependencyLink_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarMeanEndLink_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarTaskDecomposition_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIstarContributionLink_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IstarActorLink_4001(
			IstarModel container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getActorLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarActorLink) {
				continue;
			}
			IstarActorLink link = (IstarActorLink) linkObject;
			if (IstarActorLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarCompartment dst = link.getTarget();
			IstarCompartment src = link.getSource();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarActorLink_4001,
					IstarActorLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IstarDependencyLink_4002(
			IstarModel container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getDependencyLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarDependencyLink) {
				continue;
			}
			IstarDependencyLink link = (IstarDependencyLink) linkObject;
			if (IstarDependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarNodeObject dst = link.getTarget();
			IstarNodeObject src = link.getSource();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarDependencyLink_4002,
					IstarDependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IstarMeanEndLink_4003(
			IstarCompartment container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getMeanEndLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarMeanEndLink) {
				continue;
			}
			IstarMeanEndLink link = (IstarMeanEndLink) linkObject;
			if (IstarMeanEndLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarMeanEndLink_4003,
					IstarMeanEndLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IstarTaskDecomposition_4004(
			IstarCompartment container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getTasksDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarTaskDecomposition) {
				continue;
			}
			IstarTaskDecomposition link = (IstarTaskDecomposition) linkObject;
			if (IstarTaskDecompositionEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarTaskDecomposition_4004,
					IstarTaskDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IstarContributionLink_4005(
			IstarCompartment container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getContributionLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarContributionLink) {
				continue;
			}
			IstarContributionLink link = (IstarContributionLink) linkObject;
			if (IstarContributionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarContributionLink_4005,
					IstarContributionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IstarActorLink_4001(
			IstarCompartment target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIstarActorLink_Target()
					|| false == setting.getEObject() instanceof IstarActorLink) {
				continue;
			}
			IstarActorLink link = (IstarActorLink) setting.getEObject();
			if (IstarActorLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarCompartment src = link.getSource();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IstarActorLink_4001,
					IstarActorLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IstarDependencyLink_4002(
			IstarNodeObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIstarDependencyLink_Target()
					|| false == setting.getEObject() instanceof IstarDependencyLink) {
				continue;
			}
			IstarDependencyLink link = (IstarDependencyLink) setting
					.getEObject();
			if (IstarDependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarNodeObject src = link.getSource();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IstarDependencyLink_4002,
					IstarDependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IstarMeanEndLink_4003(
			IstarIntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIstarMeanEndLink_Target()
					|| false == setting.getEObject() instanceof IstarMeanEndLink) {
				continue;
			}
			IstarMeanEndLink link = (IstarMeanEndLink) setting.getEObject();
			if (IstarMeanEndLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IstarMeanEndLink_4003,
					IstarMeanEndLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IstarTaskDecomposition_4004(
			IstarIntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIstarTaskDecomposition_Target()
					|| false == setting.getEObject() instanceof IstarTaskDecomposition) {
				continue;
			}
			IstarTaskDecomposition link = (IstarTaskDecomposition) setting
					.getEObject();
			if (IstarTaskDecompositionEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IstarTaskDecomposition_4004,
					IstarTaskDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IstarContributionLink_4005(
			IstarIntentionalElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIstarContributionLink_Target()
					|| false == setting.getEObject() instanceof IstarContributionLink) {
				continue;
			}
			IstarContributionLink link = (IstarContributionLink) setting
					.getEObject();
			if (IstarContributionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement src = link.getSource();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IstarContributionLink_4005,
					IstarContributionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IstarActorLink_4001(
			IstarCompartment source) {
		IstarModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof IstarModel) {
				container = (IstarModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getActorLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarActorLink) {
				continue;
			}
			IstarActorLink link = (IstarActorLink) linkObject;
			if (IstarActorLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarCompartment dst = link.getTarget();
			IstarCompartment src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarActorLink_4001,
					IstarActorLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IstarDependencyLink_4002(
			IstarNodeObject source) {
		IstarModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof IstarModel) {
				container = (IstarModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getDependencyLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarDependencyLink) {
				continue;
			}
			IstarDependencyLink link = (IstarDependencyLink) linkObject;
			if (IstarDependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarNodeObject dst = link.getTarget();
			IstarNodeObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarDependencyLink_4002,
					IstarDependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IstarMeanEndLink_4003(
			IstarIntentionalElement source) {
		IstarCompartment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof IstarCompartment) {
				container = (IstarCompartment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getMeanEndLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarMeanEndLink) {
				continue;
			}
			IstarMeanEndLink link = (IstarMeanEndLink) linkObject;
			if (IstarMeanEndLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarMeanEndLink_4003,
					IstarMeanEndLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IstarTaskDecomposition_4004(
			IstarIntentionalElement source) {
		IstarCompartment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof IstarCompartment) {
				container = (IstarCompartment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getTasksDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarTaskDecomposition) {
				continue;
			}
			IstarTaskDecomposition link = (IstarTaskDecomposition) linkObject;
			if (IstarTaskDecompositionEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarTaskDecomposition_4004,
					IstarTaskDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IstarContributionLink_4005(
			IstarIntentionalElement source) {
		IstarCompartment container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof IstarCompartment) {
				container = (IstarCompartment) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getContributionLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IstarContributionLink) {
				continue;
			}
			IstarContributionLink link = (IstarContributionLink) linkObject;
			if (IstarContributionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			IstarIntentionalElement dst = link.getTarget();
			IstarIntentionalElement src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IstarContributionLink_4005,
					IstarContributionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<IstarNodeDescriptor> getSemanticChildren(View view) {
			return IstarDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getContainedLinks(View view) {
			return IstarDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getIncomingLinks(View view) {
			return IstarDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getOutgoingLinks(View view) {
			return IstarDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
