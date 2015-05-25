package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.us.UsElement;

/**Classe responsável por criar objetos que representam as metas, no modelo i*, com base nas metas do modelo de histórias de usuário.
 * @author Renato Mesquita
 * @version 1.00
 */
public class Goal2GoalCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsElement usElement;
	
	public Goal2GoalCommand(IstarData istarData, UsElement usElement) {
		super(istarData);
		this.usElement = usElement;
	}
	
	@Override
	public Object execute() {		
		IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
		new_element.setName(this.usElement.getDescription());
		new_element.setId(this.usElement.getId());
		new_element.setType(IstarElementType.GOAL);
		getIstarData().getIstar_model().getElements().add(new_element);
		return true;
	}


}
