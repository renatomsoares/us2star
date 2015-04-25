/*
 * 
 */
package us.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import us.USModel;
import us.UsPackage;
import us.diagram.edit.parts.USModelEditPart;
import us.diagram.edit.parts.USNodeDescriptionEditPart;
import us.diagram.edit.parts.USNodeEditPart;
import us.diagram.edit.parts.USNodeUSNodeElementsCompartmentEditPart;
import us.diagram.edit.parts.UsElementDescriptionEditPart;
import us.diagram.edit.parts.UsElementEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "US.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (USModelEditPart.MODEL_ID.equals(view.getType())) {
				return USModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return us.diagram.part.UsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				UsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UsPackage.eINSTANCE.getUSModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((USModel) domainElement)) {
			return USModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = us.diagram.part.UsVisualIDRegistry
				.getModelID(containerView);
		if (!USModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"us".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (USModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = us.diagram.part.UsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = USModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case USModelEditPart.VISUAL_ID:
			if (UsPackage.eINSTANCE.getUSNode().isSuperTypeOf(
					domainElement.eClass())) {
				return USNodeEditPart.VISUAL_ID;
			}
			break;
		case USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID:
			if (UsPackage.eINSTANCE.getUsElement().isSuperTypeOf(
					domainElement.eClass())) {
				return UsElementEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = us.diagram.part.UsVisualIDRegistry
				.getModelID(containerView);
		if (!USModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"us".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (USModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = us.diagram.part.UsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = USModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case USModelEditPart.VISUAL_ID:
			if (USNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case USNodeEditPart.VISUAL_ID:
			if (USNodeDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsElementEditPart.VISUAL_ID:
			if (UsElementDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID:
			if (UsElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(USModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case USModelEditPart.VISUAL_ID:
			return false;
		case UsElementEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return us.diagram.part.UsVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return us.diagram.part.UsVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return us.diagram.part.UsVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return us.diagram.part.UsVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return us.diagram.part.UsVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return us.diagram.part.UsVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
