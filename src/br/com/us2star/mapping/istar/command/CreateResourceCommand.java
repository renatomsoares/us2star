package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.istar.IstarNodeObject;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.us.UsElement;

/**
 * @author Renato Mesquita
 * @version 1.00
 */
public class CreateResourceCommand extends AbstractMappingCommand implements IMappingCommand {
	
	public CreateResourceCommand(IstarData istarData) {
		super(istarData);
	}
	
	@Override
	public Object execute() {		
		IstarNodeObject actor = null;
		IstarNodeObject task = null;

		for (int i = 0 ; i < getIstarData().getIstar_model().getDependencyLinks().size() ; i++) {
			if(getIstarData().dependencyLinkExists(getIstarData().getIstar_model().getDependencyLinks().get(i).getTarget(),
					getIstarData().getIstar_model().getDependencyLinks().get(i).getSource())) {

				if (getIstarData().searchActor(getIstarData().getIstar_model().getDependencyLinks().get(i).getSource().getName()) != null) {
					actor = getIstarData().getIstar_model().getDependencyLinks().get(i).getSource();
					task = getIstarData().getIstar_model().getDependencyLinks().get(i).getTarget();
				}

				IstarElement new_resource = getIstarData().getIstar_factory().createIstarElement();
				new_resource.setType(IstarElementType.RESOURCE);
				new_resource.setName(task.getName());

				if (getIstarData().searchResource(new_resource.getName()) == null) {
					getIstarData().getIstar_model().getElements().add(new_resource);
				}

				IstarDependencyLink new_dependency = getIstarData().getIstar_factory().createIstarDependencyLink();
				new_dependency.setSource(new_resource);
				new_dependency.setTarget(getIstarData().searchActor(actor.getName()));

				if (!getIstarData().dependencyLinkExists(new_dependency.getSource(), new_dependency.getTarget())) {
					getIstarData().getIstar_model().getDependencyLinks().add(new_dependency);
				}
			}
		}
		return null;
	}
}