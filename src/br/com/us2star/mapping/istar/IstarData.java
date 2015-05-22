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
	
	public IstarData() {
		this.istar_factory = new IstarFactoryImpl();
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

	public IstarCompartment searchActor(String actor) {
		IstarCompartment actorReturn = null;
		for (int i = 0 ; i < getIstar_model().getCompartments().size() ; i++) {
			if (getIstar_model().getCompartments().get(i).getName().equals(actor)) {
				actorReturn = getIstar_model().getCompartments().get(i);
				break;
			}
		}
		return actorReturn;
	}

	public IstarElement searchGoal(String goal) {
		IstarElement goalReturn = null;
		for (int i = 0 ; i < getIstar_model().getElements().size() ; i++) {
			if (getIstar_model().getElements().get(i).getName().equals(goal)) {
				goalReturn = getIstar_model().getElements().get(i);
				break;
			}
		}
		return goalReturn;
	}
	
	public IstarElement searchTask(String task) {
		IstarElement taskReturn = null;
		
		for (int i = 0 ; i < getIstar_model().getCompartments().get(0).getElements().size() ; i++) {
			if (getIstar_model().getCompartments().get(0).getElements().get(i).getName().equals(task)) {
				taskReturn = getIstar_model().getCompartments().get(0).getElements().get(i);
				break;
			}
		}
		
		return taskReturn;
	}

	public boolean actorLinkExists(String actorSource, String actorTarget) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_model().getActorLinks().size() ; i++) {
			if ((getIstar_model().getActorLinks().get(i).getSource().getName().equals(actorSource)) &&
					(getIstar_model().getActorLinks().get(i).getTarget().getName().equals(actorTarget))){
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean actorExists(String actorName) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_model().getCompartments().size() ; i++) {
			if (getIstar_model().getCompartments().get(i).getName().equals(actorName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean dependencyLinkExists(String source, String target) {
		boolean exists = false;
		for (int i = 0 ; i < getIstar_model().getDependencyLinks().size() ; i++) {
			if ((getIstar_model().getDependencyLinks().get(i).getSource().getName().equals(source)) &&
					(getIstar_model().getDependencyLinks().get(i).getTarget().getName().equals(target))){
				exists = true;
			}
		}
		return exists;
	}
	
	public boolean goalExists(String goalName) {
		boolean exists = false;

		for (int i = 0 ; i < getIstar_model().getElements().size() ; i++) {
			if (getIstar_model().getElements().get(i).getName().equals(goalName)) {
				exists = true;
			}
		}
		return exists;
	}
}