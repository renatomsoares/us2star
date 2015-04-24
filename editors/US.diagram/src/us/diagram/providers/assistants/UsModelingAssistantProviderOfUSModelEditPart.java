/*
 * 
 */
package us.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import us.diagram.providers.UsElementTypes;
import us.diagram.providers.UsModelingAssistantProvider;

/**
 * @generated
 */
public class UsModelingAssistantProviderOfUSModelEditPart extends
		UsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UsElementTypes.USNode_2001);
		return types;
	}

}
