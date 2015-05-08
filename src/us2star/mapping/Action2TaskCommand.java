package us2star.mapping;

import istar.IstarElement;
import istar.IstarElementType;
import us2star.xlstoeditor.UsData;

public class Action2TaskCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	private int index;
	
	public Action2TaskCommand(UsData usData, IstarData istarData, int index) {
		super(istarData);
		this.usData = usData;
		this.index = index;
	}
	
	@Override
	public Object execute() {
		IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
		new_element.setName(usData.getUs_elements().get(index).getDescription());
		new_element.setType(IstarElementType.TASK);
		getIstarData().getIstar_elements().add(new_element);
		return true;
	}
}
