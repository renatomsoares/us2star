package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.us.UsElement;

/**Classe responsável por criar objetos do tipo ACTOR, no modelo i*, com base nos papéis das histórias de usuário.
 * @author Renato Mesquita
 * @version 1.00
 */
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
		new_compartment.setId(this.usElement.getId());
		new_compartment.setType(IstarCompartmentType.ACTOR);
		getIstarData().getIstar_model().getCompartments().add(new_compartment);
		return true;
	}


}
