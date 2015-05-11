package br.com.us2star.mapping.istar;

import java.util.ArrayList;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarFactory;
import br.com.us2star.istar.IstarModel;
import br.com.us2star.istar.IstarPackage;
import br.com.us2star.istar.impl.IstarFactoryImpl;
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
		
		directTransformations();
		
		mapping = new ConnectDependencyActorGoalCommand(usData, istarData);
		mapping.execute();

		mapping = new ConnectDependencyGoalTaskCommand(usData, istarData);
		mapping.execute();
	
		mapping = new ConnectLinkActorSystemActorCommand(usData, istarData);
		mapping.execute();
	}	


	private boolean goalExists(String goalName) {
		boolean exists = false;

		for (int i = 0 ; i < istarData.getIstar_elements().size() ; i++) {
			if (istarData.getIstar_elements().get(i).getName().equals(goalName)) {
				exists = true;
			}
		}
		return exists;
	}

	public boolean actorLinkExists(String actorSource, String actorTarget) {
		boolean exists = false;
		for (int i = 0 ; i < istarData.getIstar_actorLinks().size() ; i++) {
			if ((istarData.getIstar_actorLinks().get(i).getSource().getName().equals(actorSource)) &&
					(istarData.getIstar_actorLinks().get(i).getTarget().getName().equals(actorTarget))){
				exists = true;
			}
		}
		return exists;
	}
	
	private boolean dependencyLinkExists(String source, String target) {
		boolean exists = false;
		for (int i = 0 ; i < istarData.getIstar_dependencyLinks().size() ; i++) {
			if ((istarData.getIstar_dependencyLinks().get(i).getSource().getName().equals(source)) &&
					(istarData.getIstar_dependencyLinks().get(i).getTarget().getName().equals(target))){
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean actorExists(String actorName) {
		boolean exists = false;
		for (int i = 0 ; i < istarData.getIstar_compartments().size() ; i++) {
			if (istarData.getIstar_compartments().get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	private void directTransformations() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {

			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				if (!actorExists(usData.getUs_elements().get(i).getDescription())) {
					mapping = new Role2ActorCommand(usData, istarData, i);
					mapping.execute();
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL){

				if (!goalExists(usData.getUs_elements().get(i).getDescription())) {
					mapping = new Goal2GoalCommand(usData, istarData, i);
					mapping.execute();
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.ACTION) {
				mapping = new Action2TaskCommand(usData, istarData, i);
				mapping.execute();
			}
		}
	}

	public IstarCompartment searchActor(String actor) {
		IstarCompartment actorReturn = null;
		for (int i = 0 ; i < istarData.getIstar_compartments().size() ; i++) {
			if (istarData.getIstar_compartments().get(i).getName().equals(actor)) {
				actorReturn = istarData.getIstar_compartments().get(i);
				break;
			}
		}
		return actorReturn;
	}
	
	public IstarElement searchTaskOrGoal(String actionOrGoal) {
		IstarElement actorOrGoalReturn = null;
		for (int i = 0 ; i < istarData.getIstar_elements().size() ; i++) {
			if (istarData.getIstar_elements().get(i).getName().equals(actionOrGoal)) {
				actorOrGoalReturn = istarData.getIstar_elements().get(i);
				break;
			}
		}
		return actorOrGoalReturn;
	}
	

	public UsData getUsData() {
		return usData;
	}

	public IstarData getIstarData() {
		return istarData;
	}

	public void setIstarData(IstarData istarData) {
		this.istarData = istarData;
	}

}