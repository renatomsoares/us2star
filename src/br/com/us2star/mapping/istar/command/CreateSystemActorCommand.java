package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.mapping.istar.IstarData;

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
