package br.com.us2star.mapping.istar;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.mapping.istar.command.Action2TaskCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyActorGoalCommand;
import br.com.us2star.mapping.istar.command.ConnectDependencyGoalTaskCommand;
import br.com.us2star.mapping.istar.command.ConnectLinkActorSystemActorCommand;
import br.com.us2star.mapping.istar.command.CopyModelNameCommand;
import br.com.us2star.mapping.istar.command.CreateSystemActorCommand;
import br.com.us2star.mapping.istar.command.Goal2GoalCommand;
import br.com.us2star.mapping.istar.command.IMappingCommand;
import br.com.us2star.mapping.istar.command.Role2ActorCommand;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.us.UsElementType;

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

		mapping = new ConnectLinkActorSystemActorCommand(usData, istarData);
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


	private void directTransformations() {
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {


			if (!istarData.actorExists(usData.getUsList().get(i).getElements().get(0).getDescription())){
				mapping = new Role2ActorCommand(istarData, usData.getUsList().get(i).getElements().get(0));
				mapping.execute();
			}



			if (!istarData.goalExists(usData.getUsList().get(i).getElements().get(2).getDescription())){
				mapping = new Goal2GoalCommand(istarData, usData.getUsList().get(i).getElements().get(2));
				mapping.execute();
			}


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