/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.edit.commands.IstarElement2CreateCommand;
import istar.diagram.providers.IstarElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class IstarCompartmentIstarCompartmentElementsCompartmentItemSemanticEditPolicy
		extends IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IstarCompartmentIstarCompartmentElementsCompartmentItemSemanticEditPolicy() {
		super(IstarElementTypes.IstarCompartment_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (IstarElementTypes.IstarElement_3001 == req.getElementType()) {
			return getGEFWrapper(new IstarElement2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
