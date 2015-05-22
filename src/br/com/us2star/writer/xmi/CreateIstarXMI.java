package br.com.us2star.writer.xmi;

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

import br.com.us2star.mapping.istar.IstarData;

public class CreateIstarXMI {

	private IstarData isData;
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private Element rootElement;
	private String pathToSave;

	public CreateIstarXMI(IstarData isData, String pathToSave) throws ParserConfigurationException, TransformerException {
		this.isData = isData;
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
		
		System.out.println("IstarModel:IstarModel");
		this.rootElement = doc.createElement("IstarModel:IstarModel");
		doc.appendChild(rootElement);
	}

	private void createDependencyLinks() {
		for (int i = 0 ; i < isData.getIstar_dependencyLinks().size() ; i++) {
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
		for (int i = 0 ; i < isData.getIstar_elements().size() ; i++) {
			Element staff = doc.createElement("elements");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(isData.getIstar_elements().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(isData.getIstar_elements().get(i).getType().getName());

			staff.setAttributeNode(name);
			staff.setAttributeNode(type);
		}
	}

	private void createCompartments() {
		for (int i = 0 ; i < isData.getIstar_compartments().size() ; i++) {
			Element staff = doc.createElement("compartments");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(isData.getIstar_compartments().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(isData.getIstar_compartments().get(i).getType().getName());

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