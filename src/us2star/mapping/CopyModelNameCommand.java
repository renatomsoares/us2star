package us2star.mapping;

import us2star.xlstoeditor.UsData;

public class CopyModelNameCommand implements IMappingCommand {

	private UsData usData;
	private IstarData istarData;
	
	public CopyModelNameCommand(UsData usData, IstarData istarData) {
		this.usData = usData;
		this.istarData = istarData;
	}
	@Override
	public Object execute() {
		istarData.getIstar_model().setTitle(usData.getUs_model().getName());
		return true;
	}

}
