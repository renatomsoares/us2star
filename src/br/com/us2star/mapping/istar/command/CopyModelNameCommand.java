package br.com.us2star.mapping.istar.command;

import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;

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
