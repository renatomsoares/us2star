package br.com.us2star.writer.xmi;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;






import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.UserDataHandler;

import br.com.us2star.istar.IstarActorLink;
import br.com.us2star.mapping.istar.IstarData;

/**Classe responsável por fazer a escrita em um arquivo do tipo XMI.
 * @author Renato Mesquita
 * @version 1.00
 */
public class CreateIstarXmiToIstarTool {

	private IstarData isData;
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private Element rootElement;
	private String pathToSave;
	private int numTaksDecompositions;

	public CreateIstarXmiToIstarTool(IstarData isData, String pathToSave) throws ParserConfigurationException, TransformerException {
		this.isData = isData;
		this.docFactory = DocumentBuilderFactory.newInstance();
		this.docBuilder = docFactory.newDocumentBuilder();
		this.doc = docBuilder.newDocument();
		this.pathToSave = pathToSave;
		this.numTaksDecompositions = 0;

		writeXmiElements();
		writeContentIntoXmiFile();
	}

	private void writeXmiElements() {
		createRootElement();
		createElements();
		createActors();
		createSystemActorAndTaks();
		createDependencyLinks();
		createActorLinks();
	}

	private void createRootElement() {
		
		System.out.println("IstarModel:IstarModel");
		this.rootElement = doc.createElement("istar:Model");
		
		Attr title = doc.createAttribute("title");
		title.setNodeValue(isData.getIstar_model().getTitle());
		rootElement.setAttributeNode(title);
		rootElement.setTextContent("xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:istar=\"http://www.cin.ufpe.br/istar\"");
		doc.appendChild(rootElement);
	}

	private void createDependencyLinks() {
		for (int i = 0 ; i < isData.getIstar_model().getDependencyLinks().size() ; i++) {
			Element staff = doc.createElement("links");
			rootElement.appendChild(staff);
			
			Attr source = doc.createAttribute("source");
			Attr target = doc.createAttribute("target");
			Attr name = doc.createAttribute("name");
			Attr type = doc.createAttribute("type");
			
			
			if (getElementIdOutSA(isData.getIstar_model().getDependencyLinks().get(i).getSource().getName()) != -1) {
				source.setValue("//@elements." + getElementIdOutSA(isData.getIstar_model().getDependencyLinks().get(i).getSource().getName()));
			} else if (getActorId(isData.getIstar_model().getDependencyLinks().get(i).getSource().getName()) != -1) {
				source.setValue("//@actors." + getActorId(isData.getIstar_model().getDependencyLinks().get(i).getSource().getName()));
			}
			
			int SA_id = rootElement.getElementsByTagName("actors").getLength()-1;
			
			if(getElementIdInSA(isData.getIstar_model().getDependencyLinks().get(i).getTarget().getName()) != -1) {
				target.setValue("//@actors." + SA_id + "/@elements." + getElementIdInSA(isData.getIstar_model().getDependencyLinks().get(i).getTarget().getName()));
			} else if (getElementIdOutSA(isData.getIstar_model().getDependencyLinks().get(i).getTarget().getName()) != -1) {
				target.setValue("//@elements." + getElementIdOutSA(isData.getIstar_model().getDependencyLinks().get(i).getTarget().getName()));
			}
			
			name.setNodeValue("");
			type.setNodeValue("COMMITED");
			
			staff.setAttributeNode(name);
			staff.setAttributeNode(type);
			staff.setAttributeNode(source);
			staff.setAttributeNode(target);
		}
	}
	
	private void createActorLinks() {
		for (int i = 0 ; i < isData.getIstar_model().getActorLinks().size() ; i++) {
			Element staff = doc.createElement("associations");
			rootElement.appendChild(staff);
			
			Attr name = doc.createAttribute("name");
			name.setValue("ISA");
			staff.setAttributeNode(name);
			
			
			Attr source = doc.createAttribute("source");
			source.setValue("//@actors."+ getActorId(isData.getIstar_model().getActorLinks().get(i).getSource().getName()));
			
			Attr target = doc.createAttribute("target");
			target.setValue("//@actors."+ getActorId(isData.getIstar_model().getActorLinks().get(i).getTarget().getName()));
			
			staff.setAttributeNode(source);
			staff.setAttributeNode(target);
			
			//System.out.println(("teste"+rootElement.getElementsByTagName("actorLinks").item(0).getAttributes().item(0).getNodeValue()));
			//System.out.println(("teste" + rootElement.getElementsByTagName("actorLinks").item(0).getAttributes().getNamedItem("source").getNodeValue()));
			
		}
	}

	private void setSourcesTargetsActorLinks(IstarActorLink link) {
		String source = link.getSource().getName();
		String target = link.getTarget().getName();
	}
	
	private int getActorId(String compartment) {
		NodeList list = rootElement.getElementsByTagName("actors");
		for (int i = 0 ; i < list.getLength() ; i++) {
			System.out.println(list.item(i).getAttributes().getNamedItem("name").getNodeValue());
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(compartment)) {
				return i;				
			}
		}
		return -1;
	}
	
	private int getElementIdOutSA(String element) {
		NodeList list = rootElement.getElementsByTagName("elements");
		for (int i = 0 ; i < list.getLength() ; i++) {
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	private int getElementIdInSA(String element) {
		NodeList list = rootElement.getElementsByTagName("actors");
		list = list.item(list.getLength()-1).getChildNodes();
		for (int i = 0 ; i < list.getLength()-numTaksDecompositions ; i++) {
			
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	
	private void createElements() {
		for (int i = 0 ; i < isData.getIstar_model().getElements().size() ; i++) {
			Element staff = doc.createElement("elements");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(isData.getIstar_model().getElements().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(isData.getIstar_model().getElements().get(i).getType().getName());
			
			staff.setAttributeNode(name);

			staff.setAttributeNode(type);
			
		}
	}

	private void createActors() {
		for (int i = 1 ; i < isData.getIstar_model().getCompartments().size() ; i++) {
			Element staff = doc.createElement("actors");
			rootElement.appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(isData.getIstar_model().getCompartments().get(i).getName());

			Attr type = doc.createAttribute("type");
			type.setValue(isData.getIstar_model().getCompartments().get(i).getType().getName());

			staff.setAttributeNode(name);
			staff.setAttributeNode(type);
		}
	}
	
	private void createSystemActorAndTaks() {
		
		Element staff = doc.createElement("actors");
		rootElement.appendChild(staff);
		Attr name = doc.createAttribute("name");
		name.setValue(isData.getIstar_model().getCompartments().get(0).getName());
		Attr type = doc.createAttribute("type");
		type.setValue("ACTORBOUNDARY");
		staff.setAttributeNode(type);
		staff.setAttributeNode(name);
		
		for (int i = 0 ; i < isData.getIstar_model().getCompartments().get(0).getElements().size() ; i++) {
			Element element = doc.createElement("elements");
			staff.appendChild(element);
			
			Attr elementName = doc.createAttribute("name");
			elementName.setValue(isData.getIstar_model().getCompartments().get(0).getElements().get(i).getName());
			element.setAttributeNode(elementName);
			
			Attr elementType = doc.createAttribute("type");
			elementType.setValue(isData.getIstar_model().getCompartments().get(0).getElements().get(i).getType().getName());
			element.setAttributeNode(elementType);
		}
		
		for (int i = 0 ; i < isData.getIstar_model().getCompartments().get(0).getTasksDecompositions().size() ; i++) {
			Element element = doc.createElement("decompositionsTask");
			staff.appendChild(element);
			
			Attr source = doc.createAttribute("source");
			Attr target = doc.createAttribute("target");
			source.setValue("//@actors."+
							getActorId(rootElement.getElementsByTagName("actors")
							.item(rootElement.getElementsByTagName("actors")
							.getLength()-1).getAttributes().getNamedItem("name").getNodeValue())+"/@elements." +
							getElementIdInSA(isData.getIstar_model().getCompartments().get(0).getTasksDecompositions().get(i).getSource().getName()));
			
			target.setValue("//@actors."+
					getActorId(rootElement.getElementsByTagName("actors")
					.item(rootElement.getElementsByTagName("actors")
					.getLength()-1).getAttributes().getNamedItem("name").getNodeValue())+"/@elements." +
					getElementIdInSA(isData.getIstar_model().getCompartments().get(0).getTasksDecompositions().get(i).getTarget().getName()));
			
			
			element.setAttributeNode(source);
			element.setAttributeNode(target);
			numTaksDecompositions++;
		}
		
	}

	private void writeContentIntoXmiFile() throws TransformerException {

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(parsePathToSave()));
		transformer.transform(source, result);
	}

	private String parsePathToSave(){
		return pathToSave.substring(0, pathToSave.length()-4) + "_istar.istar";
	}
}