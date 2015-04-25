/*
 * 
 */
package us.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import us.USModel;
import us.USNode;
import us.UsElement;
import us.diagram.edit.parts.USModelEditPart;
import us.diagram.edit.parts.USNodeEditPart;
import us.diagram.edit.parts.USNodeUSNodeElementsCompartmentEditPart;
import us.diagram.edit.parts.UsElementEditPart;

/**
 * @generated
 */
public class UsDiagramUpdater {

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
	public static List<UsNodeDescriptor> getSemanticChildren(View view) {
		switch (UsVisualIDRegistry.getVisualID(view)) {
		case USModelEditPart.VISUAL_ID:
			return getUSModel_1000SemanticChildren(view);
		case USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID:
			return getUSNodeUSNodeElementsCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsNodeDescriptor> getUSModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		USModel modelElement = (USModel) view.getElement();
		LinkedList<UsNodeDescriptor> result = new LinkedList<UsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUss().iterator(); it.hasNext();) {
			USNode childElement = (USNode) it.next();
			int visualID = UsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == USNodeEditPart.VISUAL_ID) {
				result.add(new UsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsNodeDescriptor> getUSNodeUSNodeElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		USNode modelElement = (USNode) containerView.getElement();
		LinkedList<UsNodeDescriptor> result = new LinkedList<UsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			UsElement childElement = (UsElement) it.next();
			int visualID = UsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UsElementEditPart.VISUAL_ID) {
				result.add(new UsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getContainedLinks(View view) {
		switch (UsVisualIDRegistry.getVisualID(view)) {
		case USModelEditPart.VISUAL_ID:
			return getUSModel_1000ContainedLinks(view);
		case USNodeEditPart.VISUAL_ID:
			return getUSNode_2001ContainedLinks(view);
		case UsElementEditPart.VISUAL_ID:
			return getUsElement_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getIncomingLinks(View view) {
		switch (UsVisualIDRegistry.getVisualID(view)) {
		case USNodeEditPart.VISUAL_ID:
			return getUSNode_2001IncomingLinks(view);
		case UsElementEditPart.VISUAL_ID:
			return getUsElement_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getOutgoingLinks(View view) {
		switch (UsVisualIDRegistry.getVisualID(view)) {
		case USNodeEditPart.VISUAL_ID:
			return getUSNode_2001OutgoingLinks(view);
		case UsElementEditPart.VISUAL_ID:
			return getUsElement_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUSModel_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUSNode_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUsElement_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUSNode_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUsElement_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUSNode_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UsLinkDescriptor> getUsElement_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<UsNodeDescriptor> getSemanticChildren(View view) {
			return UsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<UsLinkDescriptor> getContainedLinks(View view) {
			return UsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<UsLinkDescriptor> getIncomingLinks(View view) {
			return UsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<UsLinkDescriptor> getOutgoingLinks(View view) {
			return UsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
