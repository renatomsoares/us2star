/*
 * 
 */
package us.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import us.diagram.edit.commands.UsElementCreateCommand;
import us.diagram.providers.UsElementTypes;

/**
 * @generated
 */
public class USNodeUSNodeElementsCompartmentItemSemanticEditPolicy extends
		UsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public USNodeUSNodeElementsCompartmentItemSemanticEditPolicy() {
		super(UsElementTypes.USNode_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UsElementTypes.UsElement_3001 == req.getElementType()) {
			return getGEFWrapper(new UsElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
