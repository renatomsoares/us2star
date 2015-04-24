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
import istar.IstarNodeObject;
import istar.impl.IstarFactoryImpl;
import us.UsElementType;
import us2star.xlstoeditor.UsDataGenerator;

public class IstarMapping {

	private UsDataGenerator usData;
	private IstarFactory istar_factory;
	private IstarModel istar_model;
	private ArrayList<IstarCompartment> istar_compartments;
	private ArrayList<IstarElement> istar_elements;
	private ArrayList<IstarDependencyLink> istar_dependencyLinks;
	private ArrayList<IstarActorLink> istar_actorLinks;
	private ArrayList<UsStructure> uss;

	public IstarMapping(UsDataGenerator usData) {
		this.usData = usData;
		this.istar_factory = new IstarFactoryImpl();
		this.istar_compartments = new ArrayList<IstarCompartment>();
		this.istar_elements = new ArrayList<IstarElement>();
		this.istar_dependencyLinks = new ArrayList<IstarDependencyLink>();
		this.istar_actorLinks = new ArrayList<IstarActorLink>();
		this.istar_model = istar_factory.createIstarModel();
		
		int tam = usData.getUs_elements().size();
		this.uss = new ArrayList<UsStructure>();

		for (int i = 0 ; i < tam ; i++) {
			UsStructure us = new UsStructure();
			uss.add(us);
		}

		copyModelName();
		createSystemActor();
		directTransformations();

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

	private boolean actorExists(String actorName) {
		boolean exists = false;
		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}

	private IstarCompartment getActorObject(String actorName) {
		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals(actorName)) {
				return istar_compartments.get(i);
			}
		}
		return null;
	}

	private void connectActorWithSystemActor(IstarCompartment actor) {

		IstarActorLink new_actorlink = istar_factory.createIstarActorLink();
		new_actorlink.setSource(actor);
		IstarCompartment systemactor = null;

		for (int i = 0 ; i < istar_compartments.size() ; i++) {
			if (istar_compartments.get(i).getName().equals("SystemActor")) {
				systemactor = istar_compartments.get(i);
			}
		}
		new_actorlink.setTarget(systemactor);
		istar_actorLinks.add(new_actorlink);
	}

	private void directTransformations() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {

			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				if (!actorExists(usData.getUs_elements().get(i).getDescription())) {
					role2Actor(i);
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL){

				if (!actorLinkExists(usData.getUs_elements().get(i-2).getDescription(), "SystemActor")) {
					connectActorWithSystemActor(getActorObject(usData.getUs_elements().get(i-2).getDescription()));
				}

				if (!goalExists(usData.getUs_elements().get(i).getDescription())) {
					goal2Goal(i);
				}

			} else if (usData.getUs_elements().get(i).getType() == UsElementType.ACTION) {
				action2Task(i);
			}
		}
	}

	public IstarModel getIstar_model() {
		return istar_model;
	}

	public void setIstar_model(IstarModel istar_model) {
		this.istar_model = istar_model;
	}

	public ArrayList<IstarCompartment> getIstar_compartments() {
		return istar_compartments;
	}

	public void setIstar_compartments(ArrayList<IstarCompartment> istar_compartments) {
		this.istar_compartments = istar_compartments;
	}

	public ArrayList<IstarElement> getIstar_elements() {
		return istar_elements;
	}

	public void setIstar_elements(ArrayList<IstarElement> istar_elements) {
		this.istar_elements = istar_elements;
	}

	public ArrayList<IstarActorLink> getIstar_actorLinks() {
		return istar_actorLinks;
	}

	public void setIstar_actorLinks(ArrayList<IstarActorLink> istar_actorLinks) {
		this.istar_actorLinks = istar_actorLinks;
	}
}