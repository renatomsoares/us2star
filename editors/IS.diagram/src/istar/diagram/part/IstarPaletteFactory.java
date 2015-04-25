/*
 * 
 */
package istar.diagram.part;

import istar.diagram.providers.IstarElementTypes;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class IstarPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createIstarCompartment1CreationTool());
		paletteContainer.add(createIstarElement2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createIstarActorLink1CreationTool());
		paletteContainer.add(createIstarContributionLink2CreationTool());
		paletteContainer.add(createIstarDependencyLink3CreationTool());
		paletteContainer.add(createIstarMeanEndLink4CreationTool());
		paletteContainer.add(createIstarTaskDecomposition5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarCompartment1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.IstarCompartment1CreationTool_title,
				Messages.IstarCompartment1CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarCompartment_2002));
		entry.setId("createIstarCompartment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarCompartment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarElement2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.IstarElement_2001);
		types.add(IstarElementTypes.IstarElement_3001);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.IstarElement2CreationTool_title,
				Messages.IstarElement2CreationTool_desc, types);
		entry.setId("createIstarElement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarElement_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarActorLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IstarActorLink1CreationTool_title,
				Messages.IstarActorLink1CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarActorLink_4001));
		entry.setId("createIstarActorLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarActorLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarContributionLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IstarContributionLink2CreationTool_title,
				Messages.IstarContributionLink2CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarContributionLink_4005));
		entry.setId("createIstarContributionLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarContributionLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarDependencyLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IstarDependencyLink3CreationTool_title,
				Messages.IstarDependencyLink3CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarDependencyLink_4002));
		entry.setId("createIstarDependencyLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarDependencyLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarMeanEndLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IstarMeanEndLink4CreationTool_title,
				Messages.IstarMeanEndLink4CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarMeanEndLink_4003));
		entry.setId("createIstarMeanEndLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarMeanEndLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIstarTaskDecomposition5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IstarTaskDecomposition5CreationTool_title,
				Messages.IstarTaskDecomposition5CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.IstarTaskDecomposition_4004));
		entry.setId("createIstarTaskDecomposition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IstarTaskDecomposition_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
