/*
 * 
 */
package istar.diagram.navigator;

import istar.IstarContributionLink;
import istar.IstarDependencyLink;
import istar.IstarModel;
import istar.diagram.edit.parts.IstarActorLinkEditPart;
import istar.diagram.edit.parts.IstarActorLinkTypeEditPart;
import istar.diagram.edit.parts.IstarCompartmentEditPart;
import istar.diagram.edit.parts.IstarCompartmentNameEditPart;
import istar.diagram.edit.parts.IstarContributionLinkEditPart;
import istar.diagram.edit.parts.IstarDependencyLinkEditPart;
import istar.diagram.edit.parts.IstarElement2EditPart;
import istar.diagram.edit.parts.IstarElementEditPart;
import istar.diagram.edit.parts.IstarElementName2EditPart;
import istar.diagram.edit.parts.IstarElementNameEditPart;
import istar.diagram.edit.parts.IstarMeanEndLinkEditPart;
import istar.diagram.edit.parts.IstarModelEditPart;
import istar.diagram.edit.parts.IstarTaskDecompositionEditPart;
import istar.diagram.part.IstarDiagramEditorPlugin;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class IstarNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		IstarDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		IstarDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof IstarNavigatorItem
				&& !isOwnView(((IstarNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof IstarNavigatorGroup) {
			IstarNavigatorGroup group = (IstarNavigatorGroup) element;
			return IstarDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof IstarNavigatorItem) {
			IstarNavigatorItem navigatorItem = (IstarNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?IstarModel?IstarModel", IstarElementTypes.IstarModel_1000); //$NON-NLS-1$
		case IstarElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?IstarModel?IstarElement", IstarElementTypes.IstarElement_2001); //$NON-NLS-1$
		case IstarCompartmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?IstarModel?IstarCompartment", IstarElementTypes.IstarCompartment_2002); //$NON-NLS-1$
		case IstarElement2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?IstarModel?IstarElement", IstarElementTypes.IstarElement_3001); //$NON-NLS-1$
		case IstarActorLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?IstarModel?IstarActorLink", IstarElementTypes.IstarActorLink_4001); //$NON-NLS-1$
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?IstarModel?IstarDependencyLink", IstarElementTypes.IstarDependencyLink_4002); //$NON-NLS-1$
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?IstarModel?IstarMeanEndLink", IstarElementTypes.IstarMeanEndLink_4003); //$NON-NLS-1$
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?IstarModel?IstarTaskDecomposition", IstarElementTypes.IstarTaskDecomposition_4004); //$NON-NLS-1$
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?IstarModel?IstarContributionLink", IstarElementTypes.IstarContributionLink_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = IstarDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& IstarElementTypes.isKnownElementType(elementType)) {
			image = IstarElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof IstarNavigatorGroup) {
			IstarNavigatorGroup group = (IstarNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof IstarNavigatorItem) {
			IstarNavigatorItem navigatorItem = (IstarNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case IstarModelEditPart.VISUAL_ID:
			return getIstarModel_1000Text(view);
		case IstarElementEditPart.VISUAL_ID:
			return getIstarElement_2001Text(view);
		case IstarCompartmentEditPart.VISUAL_ID:
			return getIstarCompartment_2002Text(view);
		case IstarElement2EditPart.VISUAL_ID:
			return getIstarElement_3001Text(view);
		case IstarActorLinkEditPart.VISUAL_ID:
			return getIstarActorLink_4001Text(view);
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return getIstarDependencyLink_4002Text(view);
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return getIstarMeanEndLink_4003Text(view);
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return getIstarTaskDecomposition_4004Text(view);
		case IstarContributionLinkEditPart.VISUAL_ID:
			return getIstarContributionLink_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIstarModel_1000Text(View view) {
		IstarModel domainModelElement = (IstarModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTitle();
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarElement_2001Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.IstarElement_2001,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(IstarElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarCompartment_2002Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.IstarCompartment_2002,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(IstarCompartmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarElement_3001Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.IstarElement_3001,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(IstarElementName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarActorLink_4001Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.IstarActorLink_4001,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(IstarActorLinkTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarDependencyLink_4002Text(View view) {
		IstarDependencyLink domainModelElement = (IstarDependencyLink) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIstarMeanEndLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIstarTaskDecomposition_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIstarContributionLink_4005Text(View view) {
		IstarContributionLink domainModelElement = (IstarContributionLink) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return IstarModelEditPart.MODEL_ID.equals(IstarVisualIDRegistry
				.getModelID(view));
	}

}
