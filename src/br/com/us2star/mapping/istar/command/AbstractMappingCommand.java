package br.com.us2star.mapping.istar.command;

import br.com.us2star.mapping.istar.IstarData;

/**Classe abstrata para definir atributos comuns nos commands que representam as heurísticas.
 * @author Renato Mesquita
 * @version 1.00
 */
public abstract class AbstractMappingCommand {

	private IstarData istarData;
	
	public AbstractMappingCommand(IstarData istarData) {
		this.istarData = istarData;
	}
	
	protected IstarData getIstarData() {
		return istarData;
	}
}
