package br.com.us2star.reader.xls;

/**Entidade reponsável por armazenar os textos dos campos referentes às histórias de usuário, no arquivo XLS importado
 * @author Renato Mesquita
 * @version 1.00
 */
public class UserStory {
	
	private String role;
	private String action;
	private String goal;
	
	public UserStory(String role, String action, String goal) {
		this.role = role;
		this.action = action;
		this.goal = goal;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getGoal() {
		return goal;
	}
	
	public void setGoal(String goal) {
		this.goal = goal;
	}

}
