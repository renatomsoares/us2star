package us2star.mapping;

import istar.IstarCompartment;
import istar.IstarCompartmentType;
import us2star.xlstoeditor.UsData;

public class Role2ActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	private int index;
	
	public Role2ActorCommand(UsData usData, IstarData istarData, int index) {
		super(istarData);
		this.usData = usData;
		this.index = index;
	}
	
	@Override
	public Object execute() {
		IstarCompartment new_compartment = getIstarData().getIstar_factory().createIstarCompartment();
		new_compartment.setName(usData.getUs_elements().get(index).getDescription());
		new_compartment.setType(IstarCompartmentType.ACTOR);
		getIstarData().getIstar_compartments().add(new_compartment);
		return true;
	}


}
