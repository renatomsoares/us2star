/*
 * 
 */
package us.diagram.providers;

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

import us.UsPackage;
import us.diagram.edit.parts.USModelEditPart;
import us.diagram.edit.parts.USNodeEditPart;
import us.diagram.edit.parts.UsElementEditPart;
import us.diagram.part.UsDiagramEditorPlugin;

/**
 * @generated
 */
public class UsElementTypes {

	/**
	 * @generated
	 */
	private UsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UsDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType USModel_1000 = getElementType("US.diagram.USModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType USNode_2001 = getElementType("US.diagram.USNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UsElement_3001 = getElementType("US.diagram.UsElement_3001"); //$NON-NLS-1$

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

			elements.put(USModel_1000, UsPackage.eINSTANCE.getUSModel());

			elements.put(USNode_2001, UsPackage.eINSTANCE.getUSNode());

			elements.put(UsElement_3001, UsPackage.eINSTANCE.getUsElement());
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
			KNOWN_ELEMENT_TYPES.add(USModel_1000);
			KNOWN_ELEMENT_TYPES.add(USNode_2001);
			KNOWN_ELEMENT_TYPES.add(UsElement_3001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case USModelEditPart.VISUAL_ID:
			return USModel_1000;
		case USNodeEditPart.VISUAL_ID:
			return USNode_2001;
		case UsElementEditPart.VISUAL_ID:
			return UsElement_3001;
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
			return us.diagram.providers.UsElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return us.diagram.providers.UsElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return us.diagram.providers.UsElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
