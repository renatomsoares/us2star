package us2star.xmicreator;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;



import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import us2star.mapping.IstarData;

public class CreateIstarXMI {

	private IstarData is_Data;
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private Element rootElement;
	private String pathToSave;

	public CreateIstarXMI(IstarData is_Data, String pathToSave) throws ParserConfigurationException, TransformerException {
		this.is_Data = is_Data;
		this.docFactory = DocumentBuilderFactory.newInstance();
		this.docBuilder = docFactory.newDocumentBuilder();
		this.doc = docBuilder.newDocument();
		this.pathToSave = pathToSave;


		writeXmiElements();
		writeContentIntoXmiFile();
	}

	private void writeXmiElements() {
		createRootElement();
		createDependencyLinks();
		createElements();
		createCompartments();
	}

	private void createRootElement() {
		this.rootElement = doc.createElement("IstarModel:IstarModel");
		doc.appendChild(rootElement);
	}

	private void createDependencyLinks() {
		for (int i = 0 ; i < is_Data.getIstar_dependencyLinks().size() ; i++) {
			Element staff = doc.createElement("dependencyLinks");
			rootElement.appendChild(staff);

			Attr source = doc.createAttribute("source");
			source.setValue("setar source");

			Attr target = doc.createAttribute("target");
			target.setValue("setar target");

			staff.setAttributeNode(source);
			staff.setAttributeNode(target);
		}
	}

	private void createElements() {
		for (int i = 0 ; i < is_Data.getIstar_elements().size() ; i++) {
			Element staff = doc.createElement("elements");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(is_Data.getIstar_elements().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(is_Data.getIstar_elements().get(i).getType().getName());

			staff.setAttributeNode(name);
			staff.setAttributeNode(type);
		}
	}

	private void createCompartments() {
		for (int i = 0 ; i < is_Data.getIstar_compartments().size() ; i++) {
			Element staff = doc.createElement("compartments");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(is_Data.getIstar_compartments().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(is_Data.getIstar_compartments().get(i).getType().getName());

			staff.setAttributeNode(name);
			staff.setAttributeNode(type);
		}
	}

	private void writeContentIntoXmiFile() throws TransformerException {

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(parsePathToSave()));
		transformer.transform(source, result);
	}

	private String parsePathToSave(){
		return pathToSave.substring(0, pathToSave.length()-4) + "_istar.xmi";
	}
}