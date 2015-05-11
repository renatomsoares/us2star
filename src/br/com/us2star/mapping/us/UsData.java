package br.com.us2star.mapping.us;

import java.util.ArrayList;

import br.com.us2star.reader.xls.UserStory;
import br.com.us2star.us.USModel;
import br.com.us2star.us.USNode;
import br.com.us2star.us.UsElement;
import br.com.us2star.us.UsFactory;
import br.com.us2star.us.impl.UsFactoryImpl;

public class UsData {

	private UsFactory us_factory;
	private USModel us_model;
	private ArrayList<USNode> us_nodes;
	private ArrayList<UsElement> us_elements;

	public UsData() {

		this.us_factory = new UsFactoryImpl();
		this.us_nodes = new ArrayList<USNode>();
		this.us_elements = new ArrayList<UsElement>();
	}

	public UsFactory getUs_factory() {
		return us_factory;
	}
	public void setUs_factory(UsFactory us_factory) {
		this.us_factory = us_factory;
	}
	public USModel getUs_model() {
		return us_model;
	}
	public void setUs_model(USModel us_model) {
		this.us_model = us_model;
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

}
