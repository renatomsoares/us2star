package us2star.mapping;

import java.util.ArrayList;

import istar.IstarActorLink;
import istar.IstarCompartment;
import istar.IstarCompartmentType;
import istar.IstarDependencyLink;
import istar.IstarElement;
import istar.IstarElementType;
import istar.IstarFactory;
import istar.IstarModel;
import istar.IstarPackage;
import istar.impl.IstarFactoryImpl;
import us.UsElementType;
import us2star.xlstoeditor.UsDataGenerator;

public class IstarMapping {

	private UsDataGenerator usData;
	private IstarFactory istar_factory;
	private IstarModel istar_model;
	private IstarPackage istar_package;
	private ArrayList<IstarCompartment> istar_compartments;
	private ArrayList<IstarElement> istar_elements;
	private ArrayList<IstarDependencyLink> istar_dependencyLinks;
	private ArrayList<IstarActorLink> istar_actorLinks;

	public IstarMapping(UsDataGenerator usData) {
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
		copyModelName();
		createSystemActor();
		directTransformations();
		connectDependencyBetweenActorAndGoal();
		connectDependencyBetweenGoalAndTask();
		connectLinkBetWeenActorAndSystemActor();
	}

	private void copyModelName() {
		this.istar_model.setTitle(usData.getUs_model().getName());
	}

	private void createSystemActor() {
		IstarCompartment systemactor = istar_factory.createIstarCompartment();
		systemactor.setName("SystemActor");
		systemactor.setType(IstarCompartmentType.ACTOR);
		istar_compartments.add(systemactor);
	}

	private void role2Actor(int index) {
		IstarCompartment new_compartment = istar_factory.createIstarCompartment();
		new_compartment.setName(usData.getUs_elements().get(index).getDescription());
		new_compartment.setType(IstarCompartmentType.ACTOR);
		istar_compartments.add(new_compartment);
	}

	private void goal2Goal(int index) {
		IstarElement new_element = istar_factory.createIstarElement();
		new_element.setName(usData.getUs_elements().get(index).getDescription());
		new_element.setType(IstarElementType.GOAL);
		istar_elements.add(new_element);
	}

	private void action2Task(int index) {
		IstarElement new_element = istar_factory.createIstarElement();
		new_element.setName(usData.getUs_elements().get(index).getDescription());
		new_element.setType(IstarElementType.TASK);
		istar_elements.add(new_element);
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

	private boolean actorLinkExists(String actorSource, String actorTarget) {
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

	
	private void connectDependencyBetweenActorAndGoal() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = searchActor(usData.getUs_elements().get(i).getDescription());
				IstarElement goal = searchTaskOrGoal(usData.getUs_elements().get(i+2).getDescription());
				IstarDependencyLink new_dependencyLink = istar_factory.createIstarDependencyLink();
				new_dependencyLink.setSource(actor);
				new_dependencyLink.setTarget(goal);
				//setar tipo de dependência
				istar_dependencyLinks.add(new_dependencyLink);
			}
		}
	}
	
	private void connectDependencyBetweenGoalAndTask() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL) {
				IstarElement goal = searchTaskOrGoal(usData.getUs_elements().get(i).getDescription());
				IstarElement task = searchTaskOrGoal(usData.getUs_elements().get(i-1).getDescription());
				IstarDependencyLink new_dependencyLink = istar_factory.createIstarDependencyLink();
				new_dependencyLink.setSource(goal);
				new_dependencyLink.setTarget(task);
				//setar tipo de dependência
				istar_dependencyLinks.add(new_dependencyLink);
			}
		}
	}
	
	private void connectLinkBetWeenActorAndSystemActor() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = searchActor(usData.getUs_elements().get(i).getDescription());
				if (!actorLinkExists(actor.getName(), "SystemActor")) {
					IstarCompartment systemActor = searchActor("SystemActor");
					IstarActorLink new_actorLink = istar_factory.createIstarActorLink();
					new_actorLink.setSource(actor);
					new_actorLink.setTarget(systemActor);
					//setar tipo de link
					istar_actorLinks.add(new_actorLink);
				}
			}
		}
	}
	
	private void directTransformations() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {

			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				if (!actorExists(usData.getUs_elements().get(i).getDescription())) {
					role2Actor(i);
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL){

				if (!goalExists(usData.getUs_elements().get(i).getDescription())) {
					goal2Goal(i);
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.ACTION) {
				action2Task(i);
			}
		}
	}

	private IstarCompartment searchActor(String actor) {
		IstarCompartment actorReturn = null;
		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals(actor)) {
				actorReturn = istar_compartments.get(i);
				break;
			}
		}
		return actorReturn;
	}
	
	private IstarElement searchTaskOrGoal(String actionOrGoal) {
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
}