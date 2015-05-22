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
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			IstarCompartment actor = getIstarData().searchActor(usData.getUsList().get(i).getElements().get(0).getDescription());
			IstarElement goal = getIstarData().searchTaskOrGoal(usData.getUsList().get(i).getElements().get(2).getDescription());
			IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
			new_dependencyLink.setSource(actor);
			new_dependencyLink.setTarget(goal);
			//setar tipo de dependência
			getIstarData().getIstar_dependencyLinks().add(new_dependencyLink);
		}

		return true;
	}

}
