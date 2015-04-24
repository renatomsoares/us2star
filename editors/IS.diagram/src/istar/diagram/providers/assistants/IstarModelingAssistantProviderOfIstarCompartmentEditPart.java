/*
 * 
 */
package istar.diagram.providers.assistants;

import istar.diagram.edit.parts.IstarCompartmentEditPart;
import istar.diagram.edit.parts.IstarElement2EditPart;
import istar.diagram.edit.parts.IstarElementEditPart;
import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarModelingAssistantProvider;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class IstarModelingAssistantProviderOfIstarCompartmentEditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((IstarCompartmentEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			IstarCompartmentEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.IstarActorLink_4001);
		types.add(IstarElementTypes.IstarDependencyLink_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(IstarCompartmentEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			IstarCompartmentEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IstarCompartmentEditPart) {
			types.add(IstarElementTypes.IstarActorLink_4001);
		}
		if (targetEditPart instanceof IstarElementEditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		if (targetEditPart instanceof IstarCompartmentEditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		if (targetEditPart instanceof IstarElement2EditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((IstarCompartmentEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			IstarCompartmentEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.IstarActorLink_4001) {
			types.add(IstarElementTypes.IstarCompartment_2002);
		} else if (relationshipType == IstarElementTypes.IstarDependencyLink_4002) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarCompartment_2002);
			types.add(IstarElementTypes.IstarElement_3001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((IstarCompartmentEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			IstarCompartmentEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.IstarActorLink_4001);
		types.add(IstarElementTypes.IstarDependencyLink_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((IstarCompartmentEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			IstarCompartmentEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.IstarActorLink_4001) {
			types.add(IstarElementTypes.IstarCompartment_2002);
		} else if (relationshipType == IstarElementTypes.IstarDependencyLink_4002) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarCompartment_2002);
			types.add(IstarElementTypes.IstarElement_3001);
		}
		return types;
	}

}
