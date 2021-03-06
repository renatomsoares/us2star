package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.us.UsElementType;

/**Esta classe representa a conex�o entre as metas e o Ator Sistema.
 * Como a US2Star fornece o mapeamento do resultado da jun��o dos modelos SD e SR, este mapeamento foi desnecess�rio,
 * uma vez que essa liga��o de depend�ncia � ilustrada com a liga��o das metas com as tarefas, que se encontram dentro do Ator Sistema.
 * A classe pode ser necess�ria numa poss�vel melhoria da ferramenta, para representar separadamente os modelos SD e SR.
 * @author Renato Mesquita
 * @version 1.00
 */
public class ConnectDependencyGoalSystemActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;

	public ConnectDependencyGoalSystemActorCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}

	@Override
	public Object execute() {
		
		/*for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			IstarCompartment actor = getIstarData().searchActor(usData.getUsList().get(i).getElements().get(0).getDescription());
			if (!getIstarData().actorLinkExists(actor.getName(), "SystemActor")) {
				IstarCompartment systemActor = getIstarData().searchActor("SystemActor");
				IstarActorLink new_actorLink = getIstarData().getIstar_factory().createIstarActorLink();
				new_actorLink.setSource(actor);
				new_actorLink.setTarget(systemActor);
				//setar tipo de link
				getIstarData().getIstar_model().getActorLinks().add(new_actorLink);
			}
		}*/
		
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {
			
			IstarElement goal = getIstarData().searchGoal(usData.getUsList().get(i).getElements().get(2).getDescription());
			IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
			new_dependencyLink.setSource(goal);
			new_dependencyLink.setTarget(getIstarData().getIstar_model().getCompartments().get(0));
			//setar tipo de depend�ncia
			getIstarData().getIstar_model().getDependencyLinks().add(new_dependencyLink);
		}
		return true;
	}

}
