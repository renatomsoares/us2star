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
public class IstarModelingAssistantProviderOfIstarElement2EditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((IstarElement2EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(IstarElement2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(IstarElementTypes.IstarDependencyLink_4002);
		types.add(IstarElementTypes.IstarMeanEndLink_4003);
		types.add(IstarElementTypes.IstarTaskDecomposition_4004);
		types.add(IstarElementTypes.IstarContributionLink_4005);
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
				(IstarElement2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			IstarElement2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof IstarElementEditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		if (targetEditPart instanceof IstarCompartmentEditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		if (targetEditPart instanceof IstarElement2EditPart) {
			types.add(IstarElementTypes.IstarDependencyLink_4002);
		}
		if (targetEditPart instanceof IstarElementEditPart) {
			types.add(IstarElementTypes.IstarMeanEndLink_4003);
		}
		if (targetEditPart instanceof IstarElement2EditPart) {
			types.add(IstarElementTypes.IstarMeanEndLink_4003);
		}
		if (targetEditPart instanceof IstarElementEditPart) {
			types.add(IstarElementTypes.IstarTaskDecomposition_4004);
		}
		if (targetEditPart instanceof IstarElement2EditPart) {
			types.add(IstarElementTypes.IstarTaskDecomposition_4004);
		}
		if (targetEditPart instanceof IstarElementEditPart) {
			types.add(IstarElementTypes.IstarContributionLink_4005);
		}
		if (targetEditPart instanceof IstarElement2EditPart) {
			types.add(IstarElementTypes.IstarContributionLink_4005);
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
		return doGetTypesForTarget((IstarElement2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(IstarElement2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.IstarDependencyLink_4002) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarCompartment_2002);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarMeanEndLink_4003) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarTaskDecomposition_4004) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarContributionLink_4005) {
			types.add(IstarElementTypes.IstarElement_2001);
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
		return doGetRelTypesOnTarget((IstarElement2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(IstarElement2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(IstarElementTypes.IstarDependencyLink_4002);
		types.add(IstarElementTypes.IstarMeanEndLink_4003);
		types.add(IstarElementTypes.IstarTaskDecomposition_4004);
		types.add(IstarElementTypes.IstarContributionLink_4005);
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
		return doGetTypesForSource((IstarElement2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(IstarElement2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.IstarDependencyLink_4002) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarCompartment_2002);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarMeanEndLink_4003) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarTaskDecomposition_4004) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarElement_3001);
		} else if (relationshipType == IstarElementTypes.IstarContributionLink_4005) {
			types.add(IstarElementTypes.IstarElement_2001);
			types.add(IstarElementTypes.IstarElement_3001);
		}
		return types;
	}

}
