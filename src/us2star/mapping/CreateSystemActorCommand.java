package us2star.mapping;

import istar.IstarCompartment;
import istar.IstarCompartmentType;

public class CreateSystemActorCommand implements IMappingCommand {

	private IstarData istarData;
	
	public CreateSystemActorCommand (IstarData istarData) {
		this.istarData = istarData;
	}
	
	@Override
	public Object execute() {
		IstarCompartment systemactor = istarData.getIstar_factory().createIstarCompartment();
		systemactor.setName("SystemActor");
		systemactor.setType(IstarCompartmentType.ACTOR);
		istarData.getIstar_compartments().add(systemactor);
		return true;
	}
}
