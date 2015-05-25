package br.com.us2star.mapping.istar.command;

import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;

/**Esta classe copia o nome do modelo de histórias de usuário, importada pela EB, como sendo o nome do modelo i*.
 * @author Renato Mesquita
 * @version 1.00
 */
public class CopyModelNameCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public CopyModelNameCommand(UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}

	@Override
	public Object execute() {
		getIstarData().getIstar_model().setTitle(usData.getUs_model().getName());
		return true;
	}

}
