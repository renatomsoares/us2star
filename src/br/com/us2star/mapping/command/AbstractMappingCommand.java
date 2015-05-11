package br.com.us2star.mapping.command;

public abstract class AbstractMappingCommand {

	private IstarData istarData;
	
	public AbstractMappingCommand(IstarData istarData) {
		this.istarData = istarData;
	}
	
	protected IstarData getIstarData() {
		return istarData;
	}
}
