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

public class IstarData {

	private IstarFactory istar_factory;
	private IstarModel istar_model;
	private IstarPackage istar_package;
	private ArrayList<IstarCompartment> istar_compartments;
	private ArrayList<IstarElement> istar_elements;
	private ArrayList<IstarDependencyLink> istar_dependencyLinks;
	private ArrayList<IstarActorLink> istar_actorLinks;
	
	public IstarData() {
		this.istar_factory = new IstarFactoryImpl();
		this.istar_compartments = new ArrayList<IstarCompartment>();
		this.istar_elements = new ArrayList<IstarElement>();
		this.istar_dependencyLinks = new ArrayList<IstarDependencyLink>();
		this.istar_actorLinks = new ArrayList<IstarActorLink>();
		this.istar_model = istar_factory.createIstarModel();
	}
	
	public IstarFactory getIstar_factory() {
		return istar_factory;
	}
	
	public void setIstar_factory(IstarFactory istar_factory) {
		this.istar_factory = istar_factory;
	}
	
	public IstarModel getIstar_model() {
		return istar_model;
	}
	
	public void setIstar_model(IstarModel istar_model) {
		this.istar_model = istar_model;
	}
	
	public IstarPackage getIstar_package() {
		return istar_package;
	}
	
	public void setIstar_package(IstarPackage istar_package) {
		this.istar_package = istar_package;
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
	
	public ArrayList<IstarDependencyLink> getIstar_dependencyLinks() {
		return istar_dependencyLinks;
	}
	
	public void setIstar_dependencyLinks(
			ArrayList<IstarDependencyLink> istar_dependencyLinks) {
		this.istar_dependencyLinks = istar_dependencyLinks;
	}
	
	public ArrayList<IstarActorLink> getIstar_actorLinks() {
		return istar_actorLinks;
	}
	
	public void setIstar_actorLinks(ArrayList<IstarActorLink> istar_actorLinks) {
		this.istar_actorLinks = istar_actorLinks;
	}

	public IstarCompartment searchActor(String actor) {
		IstarCompartment actorReturn = null;
		for (int i = 0 ; i < getIstar_compartments().size() ; i++) {
			if (getIstar_compartments().get(i).getName().equals(actor)) {
				actorReturn = getIstar_compartments().get(i);
				break;
			}
		}
		return actorReturn;
	}

	public IstarElement searchTaskOrGoal(String actionOrGoal) {
		IstarElement actorOrGoalReturn = null;
		for (int i = 0 ; i < getIstar_elements().size() ; i++) {
			if (getIstar_elements().get(i).getName().equals(actionOrGoal)) {
				actorOrGoalReturn = getIstar_elements().get(i);
				break;
			}
		}
		return actorOrGoalReturn;
	}

	public boolean actorLinkExists(String actorSource, String actorTarget) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_actorLinks().size() ; i++) {
			if ((getIstar_actorLinks().get(i).getSource().getName().equals(actorSource)) &&
					(getIstar_actorLinks().get(i).getTarget().getName().equals(actorTarget))){
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean actorExists(String actorName) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_compartments().size() ; i++) {
			if (getIstar_compartments().get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean dependencyLinkExists(String source, String target) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_dependencyLinks().size() ; i++) {
			if ((getIstar_dependencyLinks().get(i).getSource().getName().equals(source)) &&
					(getIstar_dependencyLinks().get(i).getTarget().getName().equals(target))){
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean goalExists(String goalName) {
		boolean exists = false;

		for (int i = 0 ; i < getIstar_elements().size() ; i++) {
			if (getIstar_elements().get(i).getName().equals(goalName)) {
				exists = true;
			}
		}
		return exists;
	}
}
