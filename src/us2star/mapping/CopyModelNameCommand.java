package us2star.mapping;

import us2star.xlstoeditor.UsData;

public class CopyModelNameCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public CopyModelNameCommand(UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}
	@Override
	public Object execute() {
		getIstarData().getIstar_model().setTitle(usData.getUs_model().getName());
		return true;
	}

}
