package us2star.mapping;

import istar.IstarCompartment;
import istar.IstarCompartmentType;
import us2star.xlstoeditor.UsData;

public class Role2ActorCommand implements IMappingCommand {

	private UsData usData;
	private IstarData istarData;
	private int index;
	
	public Role2ActorCommand(UsData usData, IstarData istarData, int index) {
		this.usData = usData;
		this.istarData = istarData;
		this.index = index;
	}
	
	@Override
	public Object execute() {
		IstarCompartment new_compartment = istarData.getIstar_factory().createIstarCompartment();
		new_compartment.setName(usData.getUs_elements().get(index).getDescription());
		new_compartment.setType(IstarCompartmentType.ACTOR);
		istarData.getIstar_compartments().add(new_compartment);
		return true;
	}


}
