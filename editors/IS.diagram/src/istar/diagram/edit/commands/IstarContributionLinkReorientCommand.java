/*
 * 
 */
package istar.diagram.edit.commands;

import istar.IstarCompartment;
import istar.IstarContributionLink;
import istar.IstarIntentionalElement;
import istar.diagram.edit.policies.IstarBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class IstarContributionLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public IstarContributionLinkReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof IstarContributionLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof IstarIntentionalElement && newEnd instanceof IstarIntentionalElement)) {
			return false;
		}
		IstarIntentionalElement target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof IstarCompartment)) {
			return false;
		}
		IstarCompartment container = (IstarCompartment) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIstarContributionLink_4005(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof IstarIntentionalElement && newEnd instanceof IstarIntentionalElement)) {
			return false;
		}
		IstarIntentionalElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof IstarCompartment)) {
			return false;
		}
		IstarCompartment container = (IstarCompartment) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistIstarContributionLink_4005(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected IstarContributionLink getLink() {
		return (IstarContributionLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected IstarIntentionalElement getOldSource() {
		return (IstarIntentionalElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected IstarIntentionalElement getNewSource() {
		return (IstarIntentionalElement) newEnd;
	}

	/**
	 * @generated
	 */
	protected IstarIntentionalElement getOldTarget() {
		return (IstarIntentionalElement) oldEnd;
	}

	/**
	 * @generated
	 */
	protected IstarIntentionalElement getNewTarget() {
		return (IstarIntentionalElement) newEnd;
	}
}
