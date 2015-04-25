/*
 * 
 */
package us.diagram.providers;

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

import us.UsPackage;
import us.diagram.edit.parts.USNodeDescriptionEditPart;
import us.diagram.edit.parts.UsElementDescriptionEditPart;
import us.diagram.parsers.MessageFormatParser;
import us.diagram.part.UsVisualIDRegistry;

/**
 * @generated
 */
public class UsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser uSNodeDescription_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUSNodeDescription_5002Parser() {
		if (uSNodeDescription_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UsPackage.eINSTANCE
					.getUsPart_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			uSNodeDescription_5002Parser = parser;
		}
		return uSNodeDescription_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser usElementDescription_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUsElementDescription_5001Parser() {
		if (usElementDescription_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UsPackage.eINSTANCE
					.getUsPart_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			usElementDescription_5001Parser = parser;
		}
		return usElementDescription_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case USNodeDescriptionEditPart.VISUAL_ID:
			return getUSNodeDescription_5002Parser();
		case UsElementDescriptionEditPart.VISUAL_ID:
			return getUsElementDescription_5001Parser();
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
			return getParser(UsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UsElementTypes.getElement(hint) == null) {
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
