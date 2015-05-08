package us2star.mapping;

public abstract class AbstractMappingCommand {

	private IstarData istarData;
	
	public AbstractMappingCommand(IstarData istarData) {
		this.istarData = istarData;
	}
	
	protected IstarData getIstarData() {
		return istarData;
	}
}
