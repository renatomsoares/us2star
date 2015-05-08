package us2star.mapping;

import istar.IstarCompartment;
import istar.IstarCompartmentType;

public class CreateSystemActorCommand extends AbstractMappingCommand implements IMappingCommand {
	
	public CreateSystemActorCommand (IstarData istarData) {
		super(istarData);
	}
	
	@Override
	public Object execute() {
		IstarCompartment systemactor = getIstarData().getIstar_factory().createIstarCompartment();
		systemactor.setName("SystemActor");
		systemactor.setType(IstarCompartmentType.ACTOR);
		getIstarData().getIstar_compartments().add(systemactor);
		return true;
	}
}
