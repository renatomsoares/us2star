package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.us.UsElementType;

public class ConnectLinkActorSystemActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;

	public ConnectLinkActorSystemActorCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}

	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			IstarCompartment actor = getIstarData().searchActor(usData.getUsList().get(i).getElements().get(0).getDescription());
			if (!getIstarData().actorLinkExists(actor.getName(), "SystemActor")) {
				IstarCompartment systemActor = getIstarData().searchActor("SystemActor");
				IstarActorLink new_actorLink = getIstarData().getIstar_factory().createIstarActorLink();
				new_actorLink.setSource(actor);
				new_actorLink.setTarget(systemActor);
				//setar tipo de link
				getIstarData().getIstar_model().getActorLinks().add(new_actorLink);
			}
		}
		return true;
	}

}
