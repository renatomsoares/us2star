package br.com.us2star.mapping.istar;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarActorLinkType;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.mapping.istar.command.Action2TaskCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyActorGoalCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyGoalSystemActorCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyGoalTaskCommand;
import br.com.us2star.mapping.istar.command.CopyModelNameCommand;
import br.com.us2star.mapping.istar.command.CreateSystemActorCommand;
import br.com.us2star.mapping.istar.command.Goal2GoalCommand;
import br.com.us2star.mapping.istar.command.IMappingCommand;
import br.com.us2star.mapping.istar.command.Role2ActorCommand;
import br.com.us2star.mapping.us.UsData;

/**Classe responsável por fazer o mapeamento dos objetos do modelo de histórias de usuário para objetos do modelo i*.
 * @author Renato Mesquita
 * @version 1.00
 */
public class UsData2IstarData {

	private UsData usData;
	private IstarData istarData;
	private IMappingCommand mapping;

	public UsData2IstarData(UsData usData) {
		this.usData = usData;
		this.istarData = new IstarData();

		startRules();
	}

	private void startRules() {
		mapping = new CopyModelNameCommand(usData, istarData);
		mapping.execute();

		mapping = new CreateSystemActorCommand(istarData);
		mapping.execute();

		role2Actor();
		goal2Goal();
		action2Task();

		//directTransformations();

		mapping = new ConnectDependencyActorGoalCommand(usData, istarData);
		mapping.execute();

		mapping = new ConnectDependencyGoalTaskCommand(usData, istarData);
		mapping.execute();

		//mapping = new ConnectDependencyGoalSystemActorCommand(usData, istarData);
		//mapping.execute(); only to SD mapping


		decomposeActor();
	}	

	private void role2Actor() {
		for (int i = 0 ; i < usData.getUs_model().getUss().size() ; i++) {
			if (!istarData.actorExists(usData.getUsList().get(i).getElements().get(0).getDescription())) {
				mapping = new Role2ActorCommand(istarData, usData.getUsList().get(i).getElements().get(0));
				mapping.execute();
			}
		}
	}


	private void goal2Goal() {

		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			if (!istarData.goalExists(usData.getUsList().get(i).getElements().get(2).getDescription())) {
				mapping = new Goal2GoalCommand(istarData, usData.getUsList().get(i).getElements().get(2));
				mapping.execute();
			}
		}
	}

	private void decomposeActor() {

		istarData.getIstar_model().getElements().clear();

		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			if (!istarData.goalExists(usData.getUsList().get(i).getElements().get(2).getDescription())) {
				mapping = new Goal2GoalCommand(istarData, usData.getUsList().get(i).getElements().get(2));
				mapping.execute();

			} else {

				String actorName = istarData.getActorNameFromGoal(usData.getUsList().get(i).getElements().get(2).getDescription());

				if (actorName != null) {
					if (!actorName.equals(usData.getUsList().get(i).getElements().get(0).getDescription())) {

						System.out.println(actorName);
						System.out.println(usData.getUsList().get(i).getElements().get(0).getDescription());

						IstarCompartment new_compartment = getIstarData().getIstar_factory().createIstarCompartment();
						new_compartment.setName("{Generic by goal: " + usData.getUsList().get(i).getElements().get(2).getDescription() + "}");
						new_compartment.setType(IstarCompartmentType.AGENT);
						istarData.getIstar_model().getCompartments().add(new_compartment);

						IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
						new_dependencyLink.setSource(new_compartment);
						new_dependencyLink.setTarget(istarData.searchGoal(usData.getUsList().get(i).getElements().get(2).getDescription()));
						istarData.getIstar_model().getDependencyLinks().add(new_dependencyLink);

						IstarActorLink new_actorLink1 = getIstarData().getIstar_factory().createIstarActorLink();
						new_actorLink1.setSource(new_compartment);
						new_actorLink1.setTarget(istarData.searchActor(usData.getUsList().get(i).getElements().get(0).getDescription()));
						new_actorLink1.setType(IstarActorLinkType.ISA);
						istarData.getIstar_model().getActorLinks().add(new_actorLink1);

						IstarActorLink new_actorLink2 = getIstarData().getIstar_factory().createIstarActorLink();
						new_actorLink2.setSource(new_compartment);
						new_actorLink2.setTarget(istarData.searchActor(actorName));
						new_actorLink2.setType(IstarActorLinkType.ISA);
						istarData.getIstar_model().getActorLinks().add(new_actorLink2);

					}
				}
			}
		}
	}

	private void action2Task() {
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {
			mapping = new Action2TaskCommand(istarData, usData.getUsList().get(i).getElements().get(1));
			mapping.execute();
		}
	}

	public UsData getUsData() {
		return usData;
	}

	public IstarData getIstarData() {
		return istarData;
	}
}