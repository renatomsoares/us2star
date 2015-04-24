/*
 * 
 */
package istar.diagram.providers;

import istar.diagram.part.IstarDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = IstarDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			IstarDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
