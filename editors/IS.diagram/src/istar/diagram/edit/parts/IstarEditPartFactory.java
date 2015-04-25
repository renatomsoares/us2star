/*
 * 
 */
package istar.diagram.edit.parts;

import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class IstarEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (IstarVisualIDRegistry.getVisualID(view)) {

			case IstarModelEditPart.VISUAL_ID:
				return new IstarModelEditPart(view);

			case IstarElementEditPart.VISUAL_ID:
				return new IstarElementEditPart(view);

			case IstarElementNameEditPart.VISUAL_ID:
				return new IstarElementNameEditPart(view);

			case IstarCompartmentEditPart.VISUAL_ID:
				return new IstarCompartmentEditPart(view);

			case IstarCompartmentNameEditPart.VISUAL_ID:
				return new IstarCompartmentNameEditPart(view);

			case IstarElement2EditPart.VISUAL_ID:
				return new IstarElement2EditPart(view);

			case IstarElementName2EditPart.VISUAL_ID:
				return new IstarElementName2EditPart(view);

			case IstarCompartmentIstarCompartmentElementsCompartmentEditPart.VISUAL_ID:
				return new IstarCompartmentIstarCompartmentElementsCompartmentEditPart(
						view);

			case IstarActorLinkEditPart.VISUAL_ID:
				return new IstarActorLinkEditPart(view);

			case IstarActorLinkTypeEditPart.VISUAL_ID:
				return new IstarActorLinkTypeEditPart(view);

			case IstarDependencyLinkEditPart.VISUAL_ID:
				return new IstarDependencyLinkEditPart(view);

			case IstarMeanEndLinkEditPart.VISUAL_ID:
				return new IstarMeanEndLinkEditPart(view);

			case IstarTaskDecompositionEditPart.VISUAL_ID:
				return new IstarTaskDecompositionEditPart(view);

			case IstarContributionLinkEditPart.VISUAL_ID:
				return new IstarContributionLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
