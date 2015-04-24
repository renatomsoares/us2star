/*
 * 
 */
package istar.diagram.part;

import istar.IstarModel;
import istar.IstarPackage;
import istar.diagram.edit.parts.IstarActorLinkEditPart;
import istar.diagram.edit.parts.IstarActorLinkTypeEditPart;
import istar.diagram.edit.parts.IstarCompartmentEditPart;
import istar.diagram.edit.parts.IstarCompartmentIstarCompartmentElementsCompartmentEditPart;
import istar.diagram.edit.parts.IstarCompartmentNameEditPart;
import istar.diagram.edit.parts.IstarContributionLinkEditPart;
import istar.diagram.edit.parts.IstarDependencyLinkEditPart;
import istar.diagram.edit.parts.IstarElement2EditPart;
import istar.diagram.edit.parts.IstarElementEditPart;
import istar.diagram.edit.parts.IstarElementName2EditPart;
import istar.diagram.edit.parts.IstarElementNameEditPart;
import istar.diagram.edit.parts.IstarMeanEndLinkEditPart;
import istar.diagram.edit.parts.IstarModelEditPart;
import istar.diagram.edit.parts.IstarTaskDecompositionEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class IstarVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "IS.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (IstarModelEditPart.MODEL_ID.equals(view.getType())) {
				return IstarModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return istar.diagram.part.IstarVisualIDRegistry.getVisualID(view
				.getType());
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
				IstarDiagramEditorPlugin.getInstance().logError(
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
		if (IstarPackage.eINSTANCE.getIstarModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((IstarModel) domainElement)) {
			return IstarModelEditPart.VISUAL_ID;
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
		String containerModelID = istar.diagram.part.IstarVisualIDRegistry
				.getModelID(containerView);
		if (!IstarModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"istar".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (IstarModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = istar.diagram.part.IstarVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IstarModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case IstarModelEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getIstarElement().isSuperTypeOf(
					domainElement.eClass())) {
				return IstarElementEditPart.VISUAL_ID;
			}
			if (IstarPackage.eINSTANCE.getIstarCompartment().isSuperTypeOf(
					domainElement.eClass())) {
				return IstarCompartmentEditPart.VISUAL_ID;
			}
			break;
		case IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID:
			if (IstarPackage.eINSTANCE.getIstarElement().isSuperTypeOf(
					domainElement.eClass())) {
				return IstarElement2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = istar.diagram.part.IstarVisualIDRegistry
				.getModelID(containerView);
		if (!IstarModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"istar".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (IstarModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = istar.diagram.part.IstarVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = IstarModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case IstarModelEditPart.VISUAL_ID:
			if (IstarElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IstarCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IstarElementEditPart.VISUAL_ID:
			if (IstarElementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IstarCompartmentEditPart.VISUAL_ID:
			if (IstarCompartmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IstarElement2EditPart.VISUAL_ID:
			if (IstarElementName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID:
			if (IstarElement2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IstarActorLinkEditPart.VISUAL_ID:
			if (IstarActorLinkTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (IstarPackage.eINSTANCE.getIstarActorLink().isSuperTypeOf(
				domainElement.eClass())) {
			return IstarActorLinkEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getIstarDependencyLink().isSuperTypeOf(
				domainElement.eClass())) {
			return IstarDependencyLinkEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getIstarMeanEndLink().isSuperTypeOf(
				domainElement.eClass())) {
			return IstarMeanEndLinkEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getIstarTaskDecomposition().isSuperTypeOf(
				domainElement.eClass())) {
			return IstarTaskDecompositionEditPart.VISUAL_ID;
		}
		if (IstarPackage.eINSTANCE.getIstarContributionLink().isSuperTypeOf(
				domainElement.eClass())) {
			return IstarContributionLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(IstarModel element) {
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
		case IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID:
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
		case IstarModelEditPart.VISUAL_ID:
			return false;
		case IstarElementEditPart.VISUAL_ID:
		case IstarElement2EditPart.VISUAL_ID:
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
			return istar.diagram.part.IstarVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return istar.diagram.part.IstarVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return istar.diagram.part.IstarVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return istar.diagram.part.IstarVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return istar.diagram.part.IstarVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return istar.diagram.part.IstarVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
