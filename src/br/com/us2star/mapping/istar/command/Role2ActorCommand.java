package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.us.UsElement;

public class Role2ActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsElement usElement;
	
	public Role2ActorCommand(IstarData istarData, UsElement usElement) {
		super(istarData);
		this.usElement = usElement;
	}
	
	@Override
	public Object execute() {
		IstarCompartment new_compartment = getIstarData().getIstar_factory().createIstarCompartment();
		new_compartment.setName(this.usElement.getDescription());
		new_compartment.setType(IstarCompartmentType.ACTOR);
		new_compartment.setId(5);
		getIstarData().getIstar_compartments().add(new_compartment);
		return true;
	}


}
