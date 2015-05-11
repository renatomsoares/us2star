package br.com.us2star.mapping.command;

import java.util.ArrayList;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarFactory;
import br.com.us2star.istar.IstarModel;
import br.com.us2star.istar.IstarPackage;
import br.com.us2star.istar.impl.IstarFactoryImpl;
import br.com.us2star.mapping.UsData;
import br.com.us2star.us.UsElementType;

public class IstarData {

	private UsData usData;
	private IstarFactory istar_factory;
	private IstarModel istar_model;
	private IstarPackage istar_package;
	private ArrayList<IstarCompartment> istar_compartments;
	private ArrayList<IstarElement> istar_elements;
	private ArrayList<IstarDependencyLink> istar_dependencyLinks;
	private ArrayList<IstarActorLink> istar_actorLinks;
	private IMappingCommand mapping;

	public IstarData(UsData usData) {
		this.usData = usData;
		this.istar_factory = new IstarFactoryImpl();
		this.istar_compartments = new ArrayList<IstarCompartment>();
		this.istar_elements = new ArrayList<IstarElement>();
		this.istar_dependencyLinks = new ArrayList<IstarDependencyLink>();
		this.istar_actorLinks = new ArrayList<IstarActorLink>();
		this.istar_model = istar_factory.createIstarModel();
		
		startRules();
	}
	
	private void startRules() {
		mapping = new CopyModelNameCommand(usData, this);
		mapping.execute();
		
		mapping = new CreateSystemActorCommand(this);
		mapping.execute();
		
		directTransformations();
		
		mapping = new ConnectDependencyActorGoalCommand(usData, this);
		mapping.execute();

		mapping = new ConnectDependencyGoalTaskCommand(usData, this);
		mapping.execute();
	
		mapping = new ConnectLinkActorSystemActorCommand(usData, this);
		mapping.execute();
	}	


	private boolean goalExists(String goalName) {
		boolean exists = false;

		for (int i = 0 ; i < istar_elements.size() ; i++) {
			if (istar_elements.get(i).getName().equals(goalName)) {
				exists = true;
			}
		}
		return exists;
	}

	public boolean actorLinkExists(String actorSource, String actorTarget) {
		boolean exists = false;
		for (int i = 0 ; i < istar_actorLinks.size() ; i++) {
			if ((istar_actorLinks.get(i).getSource().getName().equals(actorSource)) &&
					(istar_actorLinks.get(i).getTarget().getName().equals(actorTarget))){
				exists = true;
			}
		}
		return exists;
	}
	
	private boolean dependencyLinkExists(String source, String target) {
		boolean exists = false;
		for (int i = 0 ; i < istar_dependencyLinks.size() ; i++) {
			if ((istar_dependencyLinks.get(i).getSource().getName().equals(source)) &&
					(istar_dependencyLinks.get(i).getTarget().getName().equals(target))){
				exists = true;
			}
		}
		return exists;
	}
	
	private boolean actorExists(String actorName) {
		boolean exists = false;
		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	private void directTransformations() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {

			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				if (!actorExists(usData.getUs_elements().get(i).getDescription())) {
					mapping = new Role2ActorCommand(usData, this, i);
					mapping.execute();
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL){

				if (!goalExists(usData.getUs_elements().get(i).getDescription())) {
					mapping = new Goal2GoalCommand(usData, this, i);
					mapping.execute();
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.ACTION) {
				mapping = new Action2TaskCommand(usData, this, i);
				mapping.execute();
			}
		}
	}

	public IstarCompartment searchActor(String actor) {
		IstarCompartment actorReturn = null;
		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals(actor)) {
				actorReturn = istar_compartments.get(i);
				break;
			}
		}
		return actorReturn;
	}
	
	public IstarElement searchTaskOrGoal(String actionOrGoal) {
		IstarElement actorOrGoalReturn = null;
		for (int i = 0 ; i < istar_elements.size() ; i++) {
			if (istar_elements.get(i).getName().equals(actionOrGoal)) {
				actorOrGoalReturn = istar_elements.get(i);
				break;
			}
		}
		return actorOrGoalReturn;
	}
	
	public IstarModel getIstar_model() {
		return istar_model;
	}

	public ArrayList<IstarCompartment> getIstar_compartments() {
		return istar_compartments;
	}

	public ArrayList<IstarElement> getIstar_elements() {
		return istar_elements;
	}

	public ArrayList<IstarActorLink> getIstar_actorLinks() {
		return istar_actorLinks;
	}

	public ArrayList<IstarDependencyLink> getIstar_dependencyLinks() {
		return istar_dependencyLinks;
	}

	public UsData getUsData() {
		return usData;
	}

	public IstarFactory getIstar_factory() {
		return istar_factory;
	}

	public IstarPackage getIstar_package() {
		return istar_package;
	}
}