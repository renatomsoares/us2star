package br.com.us2star.mapping.us;

import java.io.IOException;
import java.util.ArrayList;

import br.com.us2star.reader.xls.UserStoriesParser;
import br.com.us2star.reader.xls.UserStory;
import br.com.us2star.reader.xls.XLSReader;
import br.com.us2star.us.USModel;
import br.com.us2star.us.USNode;
import br.com.us2star.us.UsElement;
import br.com.us2star.us.UsElementType;
import br.com.us2star.us.UsFactory;
import br.com.us2star.us.impl.UsFactoryImpl;

public class EB2UsData {

	private ArrayList<UserStory> userStories;
	private XLSReader reader;
	private UserStoriesParser usp;
	private UsData usData;

	public EB2UsData(String filePath) throws IOException {

		this.reader = new XLSReader(filePath);
		this.usp = new UserStoriesParser(reader);
		this.userStories = usp.getUserStoriesParsed();
		this.usData = new UsData();
		
		generateModel();
		generateNodes();
		generateElements();
	}

	private void setModelName(){
		usData.getUs_model().setName(reader.getBacklogName());
	}

	private void generateModel() {
		usData.setUs_model(usData.getUs_factory().createUSModel());
		setModelName();
	}

	private void generateNodes() {
		for (int i = 0 ; i < this.userStories.size() ; i++) {
			USNode node = usData.getUs_factory().createUSNode();
			node.setDescription("Story " + (i+1));
			node.setId(i+1);
			usData.getUs_model().getUss().add(node);
		}
	}

	private void generateElements() {

		for (int i = 0 ; i < this.userStories.size() ; i++) {

			UsElement role = usData.getUs_factory().createUsElement();
			role.setDescription(this.userStories.get(i).getRole());
			UsElement action = usData.getUs_factory().createUsElement();
			action.setDescription(this.userStories.get(i).getAction());
			UsElement goal = usData.getUs_factory().createUsElement();
			goal.setDescription(this.userStories.get(i).getGoal());

			role.setType(UsElementType.ROLE);
			action.setType(UsElementType.ACTION);
			goal.setType(UsElementType.GOAL);

			usData.getUs_model().getUss().get(i).getElements().add(role);
			usData.getUs_model().getUss().get(i).getElements().add(action);
			usData.getUs_model().getUss().get(i).getElements().add(goal);
			//usData.getUs_elements().add(role);
			//usData.getUs_elements().add(action);
			//usData.getUs_elements().add(goal);
		}
	}

	public UsData getUsData() {
		return usData;
	}

	public void setUsData(UsData usData) {
		this.usData = usData;
	}
}
