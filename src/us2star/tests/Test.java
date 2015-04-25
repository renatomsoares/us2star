package us2star.tests;
import java.io.FileNotFoundException;

import us.USModel;
import us.USNode;
import us.UsElement;
import us.UsFactory;
import us.impl.UsElementImpl;
import us.impl.UsFactoryImpl;
import us.util.UsAdapterFactory;
import us2star.xlsreader.UserStoriesParser;
import us2star.xlsreader.XLSReader;
import us2star.xlstoeditor.UsDataGenerator;

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
		
		UsDataGenerator dataGenerator = new UsDataGenerator("\\test.xls");
		System.out.println(dataGenerator.getUs_elements().get(5).getDescription());
		
	}
}
