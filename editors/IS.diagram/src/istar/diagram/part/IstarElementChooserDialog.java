/*
 * 
 */
package istar.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.part.DefaultElementChooserDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;

/**
 * @generated
 */
public class IstarElementChooserDialog extends DefaultElementChooserDialog {

	/**
	 * @generated
	 */
	public IstarElementChooserDialog(Shell parentShell, View view) {
		this(parentShell, view, false);
	}

	/**
	 * @generated
	 */
	public IstarElementChooserDialog(Shell parentShell, View view,
			boolean allowMultiSelection) {
		super(parentShell, view, new IstarElementChooserDialogContextImpl(
				allowMultiSelection));
	}

	/**
	 * @generated
	 */
	private static class IstarElementChooserDialogContextImpl implements
			DefaultElementChooserDialog.Context {

		/**
		 * @generated
		 */
		private static final String[] FILE_EXTENSIONS = new String[] { "istar" };

		/**
		 * @generated
		 */
		private final boolean myAllowMultiSelection;

		/**
		 * @generated
		 */
		private IstarElementChooserDialogContextImpl(boolean allowMultiSelection) {
			myAllowMultiSelection = allowMultiSelection;
		}

		/**
		 * @generated
		 */
		@Override
		public AdapterFactory getAdapterFactory() {
			return IstarDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory();
		}

		/**
		 * @generated
		 */
		@Override
		public PreferencesHint getPreferenceHint() {
			return IstarDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		 * @generated
		 */
		@Override
		public String[] getFileExtesions() {
			return FILE_EXTENSIONS.clone();
		}

		/**
		 * @generated
		 */
		@Override
		public String getDialogTitle() {
			return Messages.IstarElementChooserDialog_SelectModelElementTitle;
		}

		/**
		 * @generated
		 */
		@Override
		public ITreeContentProvider getTreeContentProvider() {
			return new BaseWorkbenchContentProvider();
		}

		/**
		 * @generated
		 */
		public boolean allowMultiSelection() {
			return myAllowMultiSelection;
		}

	}

}
