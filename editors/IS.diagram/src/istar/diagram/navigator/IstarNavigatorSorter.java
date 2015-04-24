/*
 * 
 */
package istar.diagram.navigator;

import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class IstarNavigatorSorter extends ViewerSorter {

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
		if (element instanceof IstarNavigatorItem) {
			IstarNavigatorItem item = (IstarNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return IstarVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
