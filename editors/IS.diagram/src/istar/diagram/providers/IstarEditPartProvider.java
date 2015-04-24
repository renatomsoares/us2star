/*
 * 
 */
package istar.diagram.providers;

import istar.diagram.edit.parts.IstarEditPartFactory;
import istar.diagram.edit.parts.IstarModelEditPart;
import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class IstarEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public IstarEditPartProvider() {
		super(new IstarEditPartFactory(), IstarVisualIDRegistry.TYPED_INSTANCE,
				IstarModelEditPart.MODEL_ID);
	}

}
