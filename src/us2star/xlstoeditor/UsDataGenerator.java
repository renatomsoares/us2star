package us2star.xlstoeditor;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import us.USModel;
import us.USNode;
import us.UsElement;
import us.UsElementType;
import us.UsFactory;
import us.impl.UsElementImpl;
import us.impl.UsFactoryImpl;
import us2star.xlsreader.UserStoriesParser;
import us2star.xlsreader.UserStory;
import us2star.xlsreader.XLSReader;

public class UsDataGenerator {

	private XLSReader reader;
	private UserStoriesParser usp;
	private ArrayList<UserStory> userStories;
	private UsFactory us_factory;
	private ArrayList<USNode> us_nodes;
	private ArrayList<UsElement> us_elements;
	private USModel us_model;

	public UsDataGenerator(String filePath) {

		this.reader = new XLSReader(filePath);
		this.usp = new UserStoriesParser(reader);
		this.userStories = usp.getUserStoriesParsed();
		this.us_factory = new UsFactoryImpl();
		this.us_nodes = new ArrayList<USNode>();
		this.us_elements = new ArrayList<UsElement>();

		generateModel();
		generateNodes();
		generateElements();	
	}

	private void setModelName(){
		us_model.setName(reader.getBacklogName());
	}

	private void generateModel() {
		this.us_model = us_factory.createUSModel();
		setModelName();
	}

	private void generateNodes() {
		for (int i = 0 ; i < userStories.size() ; i++) {
			USNode node = us_factory.createUSNode();
			node.setDescription("Story " + (i+1));
			us_nodes.add(node);
		}
	}

	private void generateElements() {

		for (int i = 0 ; i < userStories.size() ; i++) {

			UsElement role = us_factory.createUsElement();
			role.setDescription(userStories.get(i).getRole());
			UsElement action = us_factory.createUsElement();
			action.setDescription(userStories.get(i).getAction());
			UsElement goal = us_factory.createUsElement();
			goal.setDescription(userStories.get(i).getGoal());

			role.setType(UsElementType.ROLE);
			action.setType(UsElementType.ACTION);
			goal.setType(UsElementType.GOAL);

			us_elements.add(role);
			us_elements.add(action);
			us_elements.add(goal);
		}
	}

	public ArrayList<USNode> getUs_nodes() {
		return us_nodes;
	}

	public void setUs_nodes(ArrayList<USNode> us_nodes) {
		this.us_nodes = us_nodes;
	}

	public ArrayList<UsElement> getUs_elements() {
		return us_elements;
	}

	public void setUs_elements(ArrayList<UsElement> us_elements) {
		this.us_elements = us_elements;
	}

	public USModel getUs_model() {
		return us_model;
	}

	public void setUs_model(USModel us_model) {
		this.us_model = us_model;
	}
}