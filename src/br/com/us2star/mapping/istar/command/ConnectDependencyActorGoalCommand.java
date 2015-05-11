package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.us.UsElementType;

public class ConnectDependencyActorGoalCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public ConnectDependencyActorGoalCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}
	
	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = getIstarData().searchActor(usData.getUs_elements().get(i).getDescription());
				IstarElement goal = getIstarData().searchTaskOrGoal(usData.getUs_elements().get(i+2).getDescription());
				IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
				new_dependencyLink.setSource(actor);
				new_dependencyLink.setTarget(goal);
				//setar tipo de dependência
				getIstarData().getIstar_dependencyLinks().add(new_dependencyLink);
			}
		}
		return true;
	}

}
