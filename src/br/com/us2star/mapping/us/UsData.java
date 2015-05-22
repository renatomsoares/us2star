package br.com.us2star.mapping.us;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import br.com.us2star.reader.xls.UserStory;
import br.com.us2star.us.USModel;
import br.com.us2star.us.USNode;
import br.com.us2star.us.UsElement;
import br.com.us2star.us.UsFactory;
import br.com.us2star.us.impl.UsFactoryImpl;

public class UsData {

	private UsFactory us_factory;
	private USModel us_model;

	public UsData() {

		this.us_factory = new UsFactoryImpl();
	}
	
	public EList<USNode> getUsList() {
		return us_model.getUss();
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
	
	public USNode getUsById(int id) {
		for (int i = 0 ; i < us_model.getUss().size() ; i++) {
			if (us_model.getUss().get(i).getId() == id) {
				return us_model.getUss().get(i);
			}
		}
		return null;
	}	

}
