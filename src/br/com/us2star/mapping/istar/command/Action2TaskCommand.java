package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.us.UsElement;

/**Classe que representa o mapeamento entre uma ação, das histórias de usuário, para uma tarefa, no modelo i*.
 * As tarefas são armazenadas dentro do Ator Sistema, do modelo i*.
 * @author Renato Mesquita
 * @version 1.00
 */
public class Action2TaskCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsElement usElement;
	
	public Action2TaskCommand(IstarData istarData, UsElement usElement) {
		super(istarData);
		this.usElement = usElement;
	}
	
	@Override
	public Object execute() {
		IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
		new_element.setName(this.usElement.getDescription());
		new_element.setType(IstarElementType.TASK);
		getIstarData().getIstar_model().getCompartments().get(0).getElements().add(new_element);
		//getIstarData().getIstar_elements().add(new_element);
		return true;
	}
}
