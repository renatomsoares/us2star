package us2star.mapping;

import istar.IstarElement;
import istar.IstarElementType;
import us2star.xlstoeditor.UsData;

public class Goal2GoalCommand implements IMappingCommand {

	private UsData usData;
	private IstarData istarData;
	private int index;
	
	public Goal2GoalCommand(UsData usData, IstarData istarData, int index) {
		this.usData = usData;
		this.istarData = istarData;
		this.index = index;
	}
	
	@Override
	public Object execute() {
		IstarElement new_element = istarData.getIstar_factory().createIstarElement();
		new_element.setName(usData.getUs_elements().get(index).getDescription());
		new_element.setType(IstarElementType.GOAL);
		istarData.getIstar_elements().add(new_element);
		return true;
	}


}
