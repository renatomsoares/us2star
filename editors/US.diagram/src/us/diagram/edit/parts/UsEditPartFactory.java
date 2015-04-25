/*
 * 
 */
package us.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import us.diagram.part.UsVisualIDRegistry;

/**
 * @generated
 */
public class UsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UsVisualIDRegistry.getVisualID(view)) {

			case USModelEditPart.VISUAL_ID:
				return new USModelEditPart(view);

			case USNodeEditPart.VISUAL_ID:
				return new USNodeEditPart(view);

			case USNodeDescriptionEditPart.VISUAL_ID:
				return new USNodeDescriptionEditPart(view);

			case UsElementEditPart.VISUAL_ID:
				return new UsElementEditPart(view);

			case UsElementDescriptionEditPart.VISUAL_ID:
				return new UsElementDescriptionEditPart(view);

			case USNodeUSNodeElementsCompartmentEditPart.VISUAL_ID:
				return new USNodeUSNodeElementsCompartmentEditPart(view);
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
