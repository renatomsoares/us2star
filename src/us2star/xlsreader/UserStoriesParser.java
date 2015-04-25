package us2star.xlsreader;
import java.util.ArrayList;

public class UserStoriesParser {

	private ArrayList<UserStory> parsedUserStories;
	private XLSReader reader;

	public UserStoriesParser(XLSReader reader) {
		this.parsedUserStories = new ArrayList<UserStory>();
		this.reader = reader;
		parse();
	}

	private void parse() {

		for (int i = 0 ; i < reader.getUserStories().size() ; i++) {
			
			String[] split1 = reader.getUserStories().get(i).split("Eu quero");
			String split1ToRole = split1[0].substring(5);
			String role = split1ToRole.substring(0, split1ToRole.length()-3);

			String[] split2 = split1[1].split("Para que");
			String split2ToAction = split2[0];
			String action = split2ToAction.substring(1, split2ToAction.length()-3);

			String split2ToGoal = split2[1];
			String goal = split2ToGoal.substring(1);

			//System.out.println(role);
			//System.out.println(action);
			//System.out.println(goal);

			UserStory us = new UserStory(role, action, goal);
			parsedUserStories.add(us);
		}
	}

	public ArrayList<UserStory> getUserStoriesParsed() {
		return parsedUserStories;
	}

	public void setUserStoriesParsed(ArrayList<UserStory> userStoriesParsed) {
		this.parsedUserStories = userStoriesParsed;
	}
	
	public void printParsedStories(){
		
		for (int i = 0 ; i < parsedUserStories.size() ; i++) {
			System.out.println("---------- Story " + (i+1) + " ----------");
			System.out.println("Role: " + parsedUserStories.get(i).getRole());
			System.out.println("Action: " + parsedUserStories.get(i).getAction());
			System.out.println("Goal: " + parsedUserStories.get(i).getGoal());
		}
	}
}
