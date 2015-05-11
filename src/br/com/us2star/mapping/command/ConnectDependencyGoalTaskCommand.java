package br.com.us2star.mapping.command;

import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.mapping.UsData;
import br.com.us2star.us.UsElementType;

public class ConnectDependencyGoalTaskCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public ConnectDependencyGoalTaskCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}
	
	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL) {
				IstarElement goal = getIstarData().searchTaskOrGoal(usData.getUs_elements().get(i).getDescription());
				IstarElement task = getIstarData().searchTaskOrGoal(usData.getUs_elements().get(i-1).getDescription());
				IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
				new_dependencyLink.setSource(goal);
				new_dependencyLink.setTarget(task);
				//setar tipo de dependência
				getIstarData().getIstar_dependencyLinks().add(new_dependencyLink);
			}
		}
		return true;
	}

}
