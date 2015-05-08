package us2star.mapping;

import istar.IstarDependencyLink;
import istar.IstarElement;
import us.UsElementType;
import us2star.xlstoeditor.UsData;

public class ConnectDependencyGoalTaskCommand implements IMappingCommand {

	private UsData usData;
	private IstarData istarData;
	
	public ConnectDependencyGoalTaskCommand (UsData usData, IstarData istarData) {
		this.usData = usData;
		this.istarData = istarData;
	}
	
	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL) {
				IstarElement goal = istarData.searchTaskOrGoal(usData.getUs_elements().get(i).getDescription());
				IstarElement task = istarData.searchTaskOrGoal(usData.getUs_elements().get(i-1).getDescription());
				IstarDependencyLink new_dependencyLink = istarData.getIstar_factory().createIstarDependencyLink();
				new_dependencyLink.setSource(goal);
				new_dependencyLink.setTarget(task);
				//setar tipo de dependência
				istarData.getIstar_dependencyLinks().add(new_dependencyLink);
			}
		}
		return true;
	}

}
