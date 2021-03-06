package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.us.UsElementType;

/**Esta classe representa a conex�o entre as metas e as tarefas, que est�o dentro do Ator Sistema.
 * @author Renato Mesquita
 * @version 1.00
 */
public class ConnectDependencyGoalTaskCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;

	public ConnectDependencyGoalTaskCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}

	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {
			
			IstarElement goal = getIstarData().searchGoal(usData.getUsList().get(i).getElements().get(2).getDescription());
			IstarElement task = getIstarData().searchTask(usData.getUsList().get(i).getElements().get(1).getDescription());
			
			
			IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
			new_dependencyLink.setSource(goal);
			new_dependencyLink.setTarget(task);

			if (!getIstarData().dependencyLinkExists(new_dependencyLink.getSource(), new_dependencyLink.getTarget())) {
				getIstarData().getIstar_model().getDependencyLinks().add(new_dependencyLink);
			}
			
		}

		return true;
	}

}
