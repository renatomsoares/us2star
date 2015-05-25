package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarActorLinkType;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;

/**
 * @author Renato Mesquita
 * @version 1.00
 */
public class DecomposeActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public DecomposeActorCommand(IstarData istarData, UsData usData) {
		super(istarData);
		this.usData = usData;
	}
	
	@Override
	public Object execute() {		
		getIstarData().getIstar_model().getElements().clear();

		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			if (!getIstarData().goalExists(usData.getUsList().get(i).getElements().get(2).getDescription())) {
				IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
				new_element.setName(usData.getUsList().get(i).getElements().get(2).getDescription());
				new_element.setId(usData.getUsList().get(i).getElements().get(2).getId());
				new_element.setType(IstarElementType.GOAL);
				getIstarData().getIstar_model().getElements().add(new_element);

			} else {

				String goal = usData.getUsList().get(i).getElements().get(2).getDescription();
				String actorName = getIstarData().getActorNameFromGoal(goal);

				if (actorName != null) {
					if (!actorName.equals(usData.getUsList().get(i).getElements().get(0).getDescription())) {

						System.out.println(actorName);
						System.out.println(usData.getUsList().get(i).getElements().get(0).getDescription());

						IstarCompartment new_compartment = getIstarData().getIstar_factory().createIstarCompartment();
						new_compartment.setName("{Generic ACTOR by goal: " + usData.getUsList().get(i).getElements().get(2).getDescription() + "}");
						new_compartment.setType(IstarCompartmentType.AGENT);
						getIstarData().getIstar_model().getCompartments().add(new_compartment);

						IstarDependencyLink new_dependencyLink = getIstarData().getIstar_factory().createIstarDependencyLink();
						new_dependencyLink.setSource(new_compartment);
						new_dependencyLink.setTarget(getIstarData().searchGoal(usData.getUsList().get(i).getElements().get(2).getDescription()));
						getIstarData().getIstar_model().getDependencyLinks().add(new_dependencyLink);

						IstarActorLink new_actorLink1 = getIstarData().getIstar_factory().createIstarActorLink();
						new_actorLink1.setSource(new_compartment);
						new_actorLink1.setTarget(getIstarData().searchActor(usData.getUsList().get(i).getElements().get(0).getDescription()));
						new_actorLink1.setType(IstarActorLinkType.ISA);
						getIstarData().getIstar_model().getActorLinks().add(new_actorLink1);

						IstarActorLink new_actorLink2 = getIstarData().getIstar_factory().createIstarActorLink();
						new_actorLink2.setSource(new_compartment);
						new_actorLink2.setTarget(getIstarData().searchActor(actorName));
						new_actorLink2.setType(IstarActorLinkType.ISA);
						getIstarData().getIstar_model().getActorLinks().add(new_actorLink2);
						
						getIstarData().removeDependencyLink(actorName, goal);
						getIstarData().removeDependencyLink(usData.getUsList().get(i).getElements().get(0).getDescription(), goal);

					}
				}
			}
		}
		return true;
	}


}