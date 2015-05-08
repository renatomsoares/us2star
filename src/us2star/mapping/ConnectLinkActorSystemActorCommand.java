package us2star.mapping;

import istar.IstarActorLink;
import istar.IstarCompartment;
import us.UsElementType;
import us2star.xlstoeditor.UsData;

public class ConnectLinkActorSystemActorCommand implements IMappingCommand {

	private UsData usData;
	private IstarData istarData;
	
	public ConnectLinkActorSystemActorCommand (UsData usData, IstarData istarData) {
		this.usData = usData;
		this.istarData = istarData;
	}
	
	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = istarData.searchActor(usData.getUs_elements().get(i).getDescription());
				if (!istarData.actorLinkExists(actor.getName(), "SystemActor")) {
					IstarCompartment systemActor = istarData.searchActor("SystemActor");
					IstarActorLink new_actorLink = istarData.getIstar_factory().createIstarActorLink();
					new_actorLink.setSource(actor);
					new_actorLink.setTarget(systemActor);
					//setar tipo de link
					istarData.getIstar_actorLinks().add(new_actorLink);
				}
			}
		}
		return true;
	}

}
