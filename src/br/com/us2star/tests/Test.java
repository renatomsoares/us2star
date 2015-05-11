package br.com.us2star.tests;
import java.io.FileNotFoundException;

import br.com.us2star.mapping.UsData;
import br.com.us2star.reader.xls.UserStoriesParser;
import br.com.us2star.reader.xls.XLSReader;
import br.com.us2star.us.USModel;
import br.com.us2star.us.USNode;
import br.com.us2star.us.UsElement;
import br.com.us2star.us.UsFactory;
import br.com.us2star.us.impl.UsElementImpl;
import br.com.us2star.us.impl.UsFactoryImpl;
import br.com.us2star.us.util.UsAdapterFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*XLSReader reader = new XLSReader();
		UserStoriesParser usp = new UserStoriesParser(reader);		
		//usp.printParsedStories();	
		
		UsFactory factory = new UsFactoryImpl();
		
		USModel model = factory.createUSModel();
		
		USNode node1 = factory.createUSNode();
		
		UsElement element1 = factory.createUsElement();
		
		model.setName("Teste");
		System.out.println(model.getName());*/
		UsAdapterFactory newfactory = new UsAdapterFactory();
		
		UsData dataGenerator = new UsData("\\test.xls");
		System.out.println(dataGenerator.getUs_elements().get(5).getDescription());
		
	}
}
