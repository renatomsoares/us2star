/*
 * 
 */
package us.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import us.diagram.part.UsVisualIDRegistry;

/**
 * @generated
 */
public class UsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof UsNavigatorItem) {
			UsNavigatorItem item = (UsNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
