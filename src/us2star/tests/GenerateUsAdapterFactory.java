package us2star.tests;

import org.eclipse.emf.common.notify.Adapter;

import us.util.UsAdapterFactory;

public class GenerateUsAdapterFactory {

	UsAdapterFactory factory;
	
	
	public GenerateUsAdapterFactory() {
		UsAdapterFactory factory = new UsAdapterFactory();
		Adapter adapter = factory.createUSModelAdapter();

	}

	public UsAdapterFactory getFactory() {
		return factory;
	}

	public void setFactory(UsAdapterFactory factory) {
		this.factory = factory;
	}
}
