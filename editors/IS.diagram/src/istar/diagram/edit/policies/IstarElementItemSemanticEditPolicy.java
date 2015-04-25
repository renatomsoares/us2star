/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.edit.commands.IstarContributionLinkCreateCommand;
import istar.diagram.edit.commands.IstarContributionLinkReorientCommand;
import istar.diagram.edit.commands.IstarDependencyLinkCreateCommand;
import istar.diagram.edit.commands.IstarDependencyLinkReorientCommand;
import istar.diagram.edit.commands.IstarMeanEndLinkCreateCommand;
import istar.diagram.edit.commands.IstarMeanEndLinkReorientCommand;
import istar.diagram.edit.commands.IstarTaskDecompositionCreateCommand;
import istar.diagram.edit.commands.IstarTaskDecompositionReorientCommand;
import istar.diagram.edit.parts.IstarContributionLinkEditPart;
import istar.diagram.edit.parts.IstarDependencyLinkEditPart;
import istar.diagram.edit.parts.IstarMeanEndLinkEditPart;
import istar.diagram.edit.parts.IstarTaskDecompositionEditPart;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.providers.IstarElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IstarElementItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IstarElementItemSemanticEditPolicy() {
		super(IstarElementTypes.IstarElement_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == IstarDependencyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == IstarMeanEndLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == IstarTaskDecompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(incomingLink) == IstarContributionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == IstarDependencyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == IstarMeanEndLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == IstarTaskDecompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (IstarVisualIDRegistry.getVisualID(outgoingLink) == IstarContributionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IstarElementTypes.IstarDependencyLink_4002 == req.getElementType()) {
			return getGEFWrapper(new IstarDependencyLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarMeanEndLink_4003 == req.getElementType()) {
			return getGEFWrapper(new IstarMeanEndLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarTaskDecomposition_4004 == req
				.getElementType()) {
			return getGEFWrapper(new IstarTaskDecompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarContributionLink_4005 == req
				.getElementType()) {
			return getGEFWrapper(new IstarContributionLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (IstarElementTypes.IstarDependencyLink_4002 == req.getElementType()) {
			return getGEFWrapper(new IstarDependencyLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarMeanEndLink_4003 == req.getElementType()) {
			return getGEFWrapper(new IstarMeanEndLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarTaskDecomposition_4004 == req
				.getElementType()) {
			return getGEFWrapper(new IstarTaskDecompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (IstarElementTypes.IstarContributionLink_4005 == req
				.getElementType()) {
			return getGEFWrapper(new IstarContributionLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new IstarDependencyLinkReorientCommand(req));
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new IstarMeanEndLinkReorientCommand(req));
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new IstarTaskDecompositionReorientCommand(req));
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new IstarContributionLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
