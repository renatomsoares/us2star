package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.mapping.istar.IstarData;

/**Classe responsável por criar o Ator Sistema. É o elemento a ser inserido em compartments, do modelo.
 * Isso faz com que garanta que sempre o primeiro elemento será o Ator Sistema.
 * @author Renato Mesquita
 * @version 1.00
 */
public class CreateSystemActorCommand extends AbstractMappingCommand implements IMappingCommand {
	
	public CreateSystemActorCommand (IstarData istarData) {
		super(istarData);
	}
	
	@Override
	public Object execute() {
		IstarCompartment systemactor = getIstarData().getIstar_factory().createIstarCompartment();
		systemactor.setName("SystemActor");
		systemactor.setType(IstarCompartmentType.ACTOR);
		systemactor.setId(0);
		getIstarData().getIstar_model().getCompartments().add(0, systemactor);
		//getIstarData().getIstar_compartments().add(systemactor);
		return true;
	}
}
