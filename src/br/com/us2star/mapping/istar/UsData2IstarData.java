package br.com.us2star.mapping.istar;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.command.Action2TaskCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyActorGoalCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyGoalSystemActorCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyGoalTaskCommand;
import br.com.us2star.mapping.istar.command.CopyModelNameCommand;
import br.com.us2star.mapping.istar.command.CreateResourceCommand;
import br.com.us2star.mapping.istar.command.CreateSystemActorCommand;
import br.com.us2star.mapping.istar.command.DecomposeActorCommand;
import br.com.us2star.mapping.istar.command.DecomposeTaskCommand;
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

		copyModelName();
		createSystemActor();
		role2Actor();
		goal2Goal();
		action2Task();
		connectDependencyActorGoal();
		connectDependencyGoalTask();
		//connectDependencyGoalSystemActor();
		decomposeActor();
		createResource();	
		decomposeTask();
	}	
	
	private void copyModelName() {
		mapping = new CopyModelNameCommand(usData, istarData);
		mapping.execute();
	}

	private void createSystemActor() {
		mapping = new CreateSystemActorCommand(istarData);
		mapping.execute();
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

	private void action2Task() {
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {
			mapping = new Action2TaskCommand(istarData, usData.getUsList().get(i).getElements().get(1));
			mapping.execute();
		}
	}
	
	private void connectDependencyActorGoal() {
		mapping = new ConnectDependencyActorGoalCommand(usData, istarData);
		mapping.execute();
	}
	
	private void connectDependencyGoalTask() {
		mapping = new ConnectDependencyGoalTaskCommand(usData, istarData);
		mapping.execute();
	}
	
	private void connectDependencyGoalSystemActor() {
		mapping = new ConnectDependencyGoalSystemActorCommand(usData, istarData);
		mapping.execute();
	}
	
	private void decomposeActor() {
		mapping = new DecomposeActorCommand(istarData, usData);
		mapping.execute();
	}
	
	private void createResource() {
		mapping = new CreateResourceCommand(istarData);
		mapping.execute();
	}
	
	private void decomposeTask() {
		mapping = new DecomposeTaskCommand(istarData, usData);
		mapping.execute();
	}
	
	private void toTestResource() {
		IstarCompartment ator = getIstarData().getIstar_factory().createIstarCompartment();
		ator.setName("renato");
		ator.setType(IstarCompartmentType.ACTOR);
		istarData.getIstar_model().getCompartments().add(ator);

		IstarElement task = getIstarData().getIstar_factory().createIstarElement();
		task.setName("task algo");
		task.setType(IstarElementType.TASK);
		istarData.getIstar_model().getElements().add(task);

		IstarDependencyLink new_dependency1 = getIstarData().getIstar_factory().createIstarDependencyLink();
		new_dependency1.setSource(ator);
		new_dependency1.setTarget(task);

		IstarDependencyLink new_dependency2 = getIstarData().getIstar_factory().createIstarDependencyLink();
		new_dependency2.setSource(task);
		new_dependency2.setTarget(ator);

		istarData.getIstar_model().getDependencyLinks().add(new_dependency1);
		istarData.getIstar_model().getDependencyLinks().add(new_dependency2);
	}
	

	public UsData getUsData() {
		return usData;
	}

	public IstarData getIstarData() {
		return istarData;
	}
}