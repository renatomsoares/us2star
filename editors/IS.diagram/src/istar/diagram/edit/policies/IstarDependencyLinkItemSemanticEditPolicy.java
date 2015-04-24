/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.providers.IstarElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class IstarDependencyLinkItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IstarDependencyLinkItemSemanticEditPolicy() {
		super(IstarElementTypes.IstarDependencyLink_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
