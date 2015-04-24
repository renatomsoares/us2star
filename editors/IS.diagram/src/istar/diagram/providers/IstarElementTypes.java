/*
 * 
 */
package istar.diagram.providers;

import istar.IstarPackage;
import istar.diagram.edit.parts.IstarActorLinkEditPart;
import istar.diagram.edit.parts.IstarCompartmentEditPart;
import istar.diagram.edit.parts.IstarContributionLinkEditPart;
import istar.diagram.edit.parts.IstarDependencyLinkEditPart;
import istar.diagram.edit.parts.IstarElement2EditPart;
import istar.diagram.edit.parts.IstarElementEditPart;
import istar.diagram.edit.parts.IstarMeanEndLinkEditPart;
import istar.diagram.edit.parts.IstarModelEditPart;
import istar.diagram.edit.parts.IstarTaskDecompositionEditPart;
import istar.diagram.part.IstarDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class IstarElementTypes {

	/**
	 * @generated
	 */
	private IstarElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			IstarDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType IstarModel_1000 = getElementType("IS.diagram.IstarModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarElement_2001 = getElementType("IS.diagram.IstarElement_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarCompartment_2002 = getElementType("IS.diagram.IstarCompartment_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarElement_3001 = getElementType("IS.diagram.IstarElement_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarActorLink_4001 = getElementType("IS.diagram.IstarActorLink_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarDependencyLink_4002 = getElementType("IS.diagram.IstarDependencyLink_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarMeanEndLink_4003 = getElementType("IS.diagram.IstarMeanEndLink_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarTaskDecomposition_4004 = getElementType("IS.diagram.IstarTaskDecomposition_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IstarContributionLink_4005 = getElementType("IS.diagram.IstarContributionLink_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(IstarModel_1000,
					IstarPackage.eINSTANCE.getIstarModel());

			elements.put(IstarElement_2001,
					IstarPackage.eINSTANCE.getIstarElement());

			elements.put(IstarCompartment_2002,
					IstarPackage.eINSTANCE.getIstarCompartment());

			elements.put(IstarElement_3001,
					IstarPackage.eINSTANCE.getIstarElement());

			elements.put(IstarActorLink_4001,
					IstarPackage.eINSTANCE.getIstarActorLink());

			elements.put(IstarDependencyLink_4002,
					IstarPackage.eINSTANCE.getIstarDependencyLink());

			elements.put(IstarMeanEndLink_4003,
					IstarPackage.eINSTANCE.getIstarMeanEndLink());

			elements.put(IstarTaskDecomposition_4004,
					IstarPackage.eINSTANCE.getIstarTaskDecomposition());

			elements.put(IstarContributionLink_4005,
					IstarPackage.eINSTANCE.getIstarContributionLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(IstarModel_1000);
			KNOWN_ELEMENT_TYPES.add(IstarElement_2001);
			KNOWN_ELEMENT_TYPES.add(IstarCompartment_2002);
			KNOWN_ELEMENT_TYPES.add(IstarElement_3001);
			KNOWN_ELEMENT_TYPES.add(IstarActorLink_4001);
			KNOWN_ELEMENT_TYPES.add(IstarDependencyLink_4002);
			KNOWN_ELEMENT_TYPES.add(IstarMeanEndLink_4003);
			KNOWN_ELEMENT_TYPES.add(IstarTaskDecomposition_4004);
			KNOWN_ELEMENT_TYPES.add(IstarContributionLink_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case IstarModelEditPart.VISUAL_ID:
			return IstarModel_1000;
		case IstarElementEditPart.VISUAL_ID:
			return IstarElement_2001;
		case IstarCompartmentEditPart.VISUAL_ID:
			return IstarCompartment_2002;
		case IstarElement2EditPart.VISUAL_ID:
			return IstarElement_3001;
		case IstarActorLinkEditPart.VISUAL_ID:
			return IstarActorLink_4001;
		case IstarDependencyLinkEditPart.VISUAL_ID:
			return IstarDependencyLink_4002;
		case IstarMeanEndLinkEditPart.VISUAL_ID:
			return IstarMeanEndLink_4003;
		case IstarTaskDecompositionEditPart.VISUAL_ID:
			return IstarTaskDecomposition_4004;
		case IstarContributionLinkEditPart.VISUAL_ID:
			return IstarContributionLink_4005;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return istar.diagram.providers.IstarElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return istar.diagram.providers.IstarElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return istar.diagram.providers.IstarElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
