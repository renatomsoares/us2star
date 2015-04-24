/*
 * 
 */
package us.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import us.diagram.edit.parts.USModelEditPart;
import us.diagram.edit.parts.UsEditPartFactory;
import us.diagram.part.UsVisualIDRegistry;

/**
 * @generated
 */
public class UsEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public UsEditPartProvider() {
		super(new UsEditPartFactory(), UsVisualIDRegistry.TYPED_INSTANCE,
				USModelEditPart.MODEL_ID);
	}

}
