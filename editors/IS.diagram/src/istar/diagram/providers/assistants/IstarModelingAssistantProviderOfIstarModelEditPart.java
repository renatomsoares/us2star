/*
 * 
 */
package istar.diagram.providers.assistants;

import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class IstarModelingAssistantProviderOfIstarModelEditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.IstarElement_2001);
		types.add(IstarElementTypes.IstarCompartment_2002);
		return types;
	}

}
