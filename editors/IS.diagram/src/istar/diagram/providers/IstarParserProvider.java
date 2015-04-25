/*
 * 
 */
package istar.diagram.providers;

import istar.IstarPackage;
import istar.diagram.edit.parts.IstarActorLinkTypeEditPart;
import istar.diagram.edit.parts.IstarCompartmentNameEditPart;
import istar.diagram.edit.parts.IstarElementName2EditPart;
import istar.diagram.edit.parts.IstarElementNameEditPart;
import istar.diagram.parsers.MessageFormatParser;
import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class IstarParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser istarElementName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getIstarElementName_5001Parser() {
		if (istarElementName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getIstarNodeObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			istarElementName_5001Parser = parser;
		}
		return istarElementName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser istarCompartmentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getIstarCompartmentName_5003Parser() {
		if (istarCompartmentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getIstarNodeObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			istarCompartmentName_5003Parser = parser;
		}
		return istarCompartmentName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser istarElementName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getIstarElementName_5002Parser() {
		if (istarElementName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getIstarNodeObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			istarElementName_5002Parser = parser;
		}
		return istarElementName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser istarActorLinkType_6001Parser;

	/**
	 * @generated
	 */
	private IParser getIstarActorLinkType_6001Parser() {
		if (istarActorLinkType_6001Parser == null) {
			EAttribute editableFeature = IstarPackage.eINSTANCE
					.getIstarActorLink_Type();
			EnumParser parser = new EnumParser(editableFeature);
			istarActorLinkType_6001Parser = parser;
		}
		return istarActorLinkType_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IstarElementNameEditPart.VISUAL_ID:
			return getIstarElementName_5001Parser();
		case IstarCompartmentNameEditPart.VISUAL_ID:
			return getIstarCompartmentName_5003Parser();
		case IstarElementName2EditPart.VISUAL_ID:
			return getIstarElementName_5002Parser();

		case IstarActorLinkTypeEditPart.VISUAL_ID:
			return getIstarActorLinkType_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(IstarVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(IstarVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (IstarElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
