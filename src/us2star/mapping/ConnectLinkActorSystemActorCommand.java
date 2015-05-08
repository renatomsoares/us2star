package us2star.mapping;

import istar.IstarActorLink;
import istar.IstarCompartment;
import us.UsElementType;
import us2star.xlstoeditor.UsData;

public class ConnectLinkActorSystemActorCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;
	
	public ConnectLinkActorSystemActorCommand (UsData usData, IstarData istarData) {
		super(istarData);
		this.usData = usData;
	}
	
	@Override
	public Object execute() {
		for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {
			if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
				IstarCompartment actor = getIstarData().searchActor(usData.getUs_elements().get(i).getDescription());
				if (!getIstarData().actorLinkExists(actor.getName(), "SystemActor")) {
					IstarCompartment systemActor = getIstarData().searchActor("SystemActor");
					IstarActorLink new_actorLink = getIstarData().getIstar_factory().createIstarActorLink();
					new_actorLink.setSource(actor);
					new_actorLink.setTarget(systemActor);
					//setar tipo de link
					getIstarData().getIstar_actorLinks().add(new_actorLink);
				}
			}
		}
		return true;
	}

}
