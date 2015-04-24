/*
 * 
 */
package us.diagram.providers;

import us.diagram.part.UsDiagramEditorPlugin;

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
		ElementInitializers cached = UsDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			UsDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
