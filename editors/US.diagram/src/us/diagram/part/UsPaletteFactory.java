/*
 * 
 */
package us.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import us.diagram.providers.UsElementTypes;

/**
 * @generated
 */
public class UsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createUSNode1CreationTool());
		paletteContainer.add(createUsElement2CreationTool());
		paletteContainer.add(createUsPart3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUSNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.USNode1CreationTool_title,
				Messages.USNode1CreationTool_desc,
				Collections.singletonList(UsElementTypes.USNode_2001));
		entry.setId("createUSNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UsElementTypes
				.getImageDescriptor(UsElementTypes.USNode_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUsElement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.UsElement2CreationTool_title,
				Messages.UsElement2CreationTool_desc,
				Collections.singletonList(UsElementTypes.UsElement_3001));
		entry.setId("createUsElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UsElementTypes
				.getImageDescriptor(UsElementTypes.UsElement_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUsPart3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.UsPart3CreationTool_title,
				Messages.UsPart3CreationTool_desc, null, null) {
		};
		entry.setId("createUsPart3CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
