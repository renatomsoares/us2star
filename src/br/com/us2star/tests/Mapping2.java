package br.com.us2star.tests;

import java.util.ArrayList;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.istar.IstarFactory;
import br.com.us2star.istar.IstarModel;
import br.com.us2star.istar.impl.IstarFactoryImpl;
import br.com.us2star.mapping.us.EB2UsData;
import br.com.us2star.us.UsElementType;

public class Mapping2 {

	private EB2UsData usData;
	private IstarFactory istar_factory;
	private IstarModel istar_model;
	private ArrayList<IstarCompartment> istar_actors;
	private ArrayList<IstarElement> istar_tasks;
	private ArrayList<IstarElement> istar_goals;
	private ArrayList<IstarDependencyLink> istar_dependencyLinks;
	private ArrayList<IstarActorLink> istar_actorLinks;
	private IstarCompartment systemActor;

	public Mapping2(EB2UsData usData) {
		this.usData = usData;
		this.istar_factory = new IstarFactoryImpl();
		this.istar_actors = new ArrayList<IstarCompartment>();
		this.istar_tasks = new ArrayList<IstarElement>();
		this.istar_goals = new ArrayList<IstarElement>();
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
		this.systemActor = istar_factory.createIstarCompartment();
		systemActor.setName("SystemActor");
		systemActor.setType(IstarCompartmentType.ACTOR);
	}

	private void role2Actor(int index) {
		IstarCompartment new_actor = istar_factory.createIstarCompartment();
		new_actor.setName(usData.getUs_elements().get(index).getDescription());
		new_actor.setType(IstarCompartmentType.ACTOR);
		istar_actors.add(new_actor);
	}

	private void goal2Goal(int index) {
		IstarElement new_goal = istar_factory.createIstarElement();
		new_goal.setName(usData.getUs_elements().get(index).getDescription());
		new_goal.setType(IstarElementType.GOAL);
		istar_goals.add(new_goal);
	}

	private void action2Task(int index) {
		IstarElement new_task = istar_factory.createIstarElement();
		new_task.setName(usData.getUs_elements().get(index).getDescription());
		new_task.setType(IstarElementType.TASK);
		istar_tasks.add(new_task);
	}


	private boolean goalExists(String goalName) {
		boolean exists = false;

		for (int i = 0 ; i < istar_goals.size() ; i++) {
			if (istar_goals.get(i).getName().equals(goalName)) {
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
		for (int i = 0 ; i < istar_actors.size() ; i++) {
			if (istar_actors.get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}


	private void connectDependencyBetweenActorAndGoal() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = searchActor(usData.getUs_elements().get(i).getDescription());
				IstarElement goal = searchGoal(usData.getUs_elements().get(i+2).getDescription());
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
				IstarElement goal = searchGoal(usData.getUs_elements().get(i).getDescription());
				IstarElement task = searchTask(usData.getUs_elements().get(i-1).getDescription());
				IstarDependencyLink new_dependencyLink = istar_factory.createIstarDependencyLink();
				new_dependencyLink.setSource(goal);
				new_dependencyLink.setTarget(task);
				//setar tipo de dependência
				istar_dependencyLinks.add(new_dependencyLink);
			}
		}
	}

	private void connectLinkBetWeenActorAndSystemActor() {
		for (int i = 0 ; i < istar_actors.size() ; i++) {

			if (!actorLinkExists(istar_actors.get(i).getName(), "SystemActor")) {

				IstarActorLink new_actorLink = istar_factory.createIstarActorLink();
				new_actorLink.setSource(istar_actors.get(i));
				new_actorLink.setTarget(systemActor);
				//setar tipo de link
				istar_actorLinks.add(new_actorLink);
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
		for (int i = 0 ; i < istar_actors.size() ; i++) {
			if (istar_actors.get(i).getName().equals(actor)) {
				actorReturn = istar_actors.get(i);
				break;
			}
		}
		return actorReturn;
	}

	private IstarElement searchTask(String task) {
		IstarElement taskReturn = null;
		for (int i = 0 ; i < istar_tasks.size() ; i++) {
			if (istar_tasks.get(i).getName().equals(task)) {
				taskReturn = istar_tasks.get(i);
				break;
			}
		}
		return taskReturn;
	}

	private IstarElement searchGoal(String goal) {
		IstarElement goalReturn = null;
		for (int i = 0 ; i < istar_goals.size() ; i++) {
			if (istar_goals.get(i).getName().equals(goal)) {
				goalReturn = istar_goals.get(i);
				break;
			}
		}
		return goalReturn;
	}

	public IstarModel getIstar_model() {
		return istar_model;
	}

	public ArrayList<IstarActorLink> getIstar_actorLinks() {
		return istar_actorLinks;
	}

	public ArrayList<IstarDependencyLink> getIstar_dependencyLinks() {
		return istar_dependencyLinks;
	}

	public ArrayList<IstarCompartment> getIstar_actors() {
		return istar_actors;
	}

	public ArrayList<IstarElement> getIstar_tasks() {
		return istar_tasks;
	}

	public ArrayList<IstarElement> getIstar_goals() {
		return istar_goals;
	}

	public IstarCompartment getSystemActor() {
		return systemActor;
	}
}