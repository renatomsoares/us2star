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
public class CreateIstarXmiToEuGENiaEditor extends AbstractCreateIstarXmi{

	public CreateIstarXmiToEuGENiaEditor(IstarData isData, String pathToSave) throws ParserConfigurationException, TransformerException {
		super(isData, pathToSave);

		writeXmiElements();
		writeContentIntoXmiFile();
	}

	private void writeXmiElements() {
		createRootElement();
		createElements();
		createCompartments();
		createSystemActorAndTaks();
		createDependencyLinks();
		createActorLinks();
	}

	private void createRootElement() {
		
		System.out.println("IstarModel:IstarModel");
		setRootElement(doc.createElement("IstarModel:IstarModel"));
		
		//Attr t = doc.createTextNode("xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:IstarModel="IstarModel"")
		doc.appendChild(getRootElement());
	}

	private void createDependencyLinks() {
		for (int i = 0 ; i < getIsData().getIstar_model().getDependencyLinks().size() ; i++) {
			Element staff = doc.createElement("dependencyLinks");
			getRootElement().appendChild(staff);
			
			Attr source = doc.createAttribute("source");
			Attr target = doc.createAttribute("target");
			
			
			if (getElementIdOutSA(getIsData().getIstar_model().getDependencyLinks().get(i).getSource().getName()) != -1) {
				source.setValue("//@elements." + getElementIdOutSA(getIsData().getIstar_model().getDependencyLinks().get(i).getSource().getName()));
			} else if (getActorId(getIsData().getIstar_model().getDependencyLinks().get(i).getSource().getName()) != -1) {
				source.setValue("//@compartments." + getActorId(getIsData().getIstar_model().getDependencyLinks().get(i).getSource().getName()));
			}
			
			int SA_id = getRootElement().getElementsByTagName("compartments").getLength()-1;
			
			if(getElementIdInSA(getIsData().getIstar_model().getDependencyLinks().get(i).getTarget().getName()) != -1) {
				target.setValue("//@compartments." + SA_id + "/@elements." + getElementIdInSA(getIsData().getIstar_model().getDependencyLinks().get(i).getTarget().getName()));
			} else if (getElementIdOutSA(getIsData().getIstar_model().getDependencyLinks().get(i).getTarget().getName()) != -1) {
				target.setValue("//@elements." + getElementIdOutSA(getIsData().getIstar_model().getDependencyLinks().get(i).getTarget().getName()));
			}
			
			staff.setAttributeNode(source);
			staff.setAttributeNode(target);
		}
	}
	
	private void createActorLinks() {
		for (int i = 0 ; i < getIsData().getIstar_model().getActorLinks().size() ; i++) {
			Element staff = doc.createElement("actorLinks");
			getRootElement().appendChild(staff);
			
			
			Attr source = doc.createAttribute("source");
			source.setValue("//@compartments."+ getActorId(getIsData().getIstar_model().getActorLinks().get(i).getSource().getName()));
			
			Attr target = doc.createAttribute("target");
			target.setValue("//@compartments."+ getActorId(getIsData().getIstar_model().getActorLinks().get(i).getTarget().getName()));
			
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
		NodeList list = getRootElement().getElementsByTagName("compartments");
		for (int i = 0 ; i < list.getLength() ; i++) {
			System.out.println(list.item(i).getAttributes().getNamedItem("name").getNodeValue());
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(compartment)) {
				return i;				
			}
		}
		return -1;
	}
	
	private int getElementIdOutSA(String element) {
		NodeList list = getRootElement().getElementsByTagName("elements");
		for (int i = 0 ; i < list.getLength() ; i++) {
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	private int getElementIdInSA(String element) {
		NodeList list = getRootElement().getElementsByTagName("compartments");
		list = list.item(list.getLength()-1).getChildNodes();
		for (int i = 0 ; i < list.getLength()-getNumTasksDecompositions() ; i++) {
			
			if (list.item(i).getAttributes().getNamedItem("name").getNodeValue().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	
	private void createElements() {
		for (int i = 0 ; i < getIsData().getIstar_model().getElements().size() ; i++) {
			Element staff = doc.createElement("elements");
			getRootElement().appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(getIsData().getIstar_model().getElements().get(i).getName());

			//Attr type = doc.createAttribute("type");
			//type.setValue(isData.getIstar_model().getElements().get(i).getType().getName());
			
			staff.setAttributeNode(name);

			//staff.setAttributeNode(type);
			
		}
	}

	private void createCompartments() {
		for (int i = 1 ; i < getIsData().getIstar_model().getCompartments().size() ; i++) {
			Element staff = doc.createElement("compartments");
			getRootElement().appendChild(staff);

			Attr name = doc.createAttribute("name");
			name.setValue(getIsData().getIstar_model().getCompartments().get(i).getName());

			//Attr type = doc.createAttribute("type");
			//type.setValue(isData.getIstar_model().getCompartments().get(i).getType().getName());

			staff.setAttributeNode(name);
			//staff.setAttributeNode(type);
		}
	}
	
	private void createSystemActorAndTaks() {
		
		Element staff = doc.createElement("compartments");
		getRootElement().appendChild(staff);
		Attr name = doc.createAttribute("name");
		name.setValue(getIsData().getIstar_model().getCompartments().get(0).getName());
		staff.setAttributeNode(name);
		
		for (int i = 0 ; i < getIsData().getIstar_model().getCompartments().get(0).getElements().size() ; i++) {
			Element element = doc.createElement("elements");
			staff.appendChild(element);
			
			Attr elementName = doc.createAttribute("name");
			elementName.setValue(getIsData().getIstar_model().getCompartments().get(0).getElements().get(i).getName());
			element.setAttributeNode(elementName);
			
			Attr elementType = doc.createAttribute("type");
			elementType.setValue(getIsData().getIstar_model().getCompartments().get(0).getElements().get(i).getType().getName());
			element.setAttributeNode(elementType);
		}
		
		for (int i = 0 ; i < getIsData().getIstar_model().getCompartments().get(0).getTasksDecompositions().size() ; i++) {
			Element element = doc.createElement("tasksDecompositions");
			staff.appendChild(element);
			
			Attr source = doc.createAttribute("source");
			Attr target = doc.createAttribute("target");
			source.setValue("//@compartments."+
							getActorId(getRootElement().getElementsByTagName("compartments")
							.item(getRootElement().getElementsByTagName("compartments")
							.getLength()-1).getAttributes().getNamedItem("name").getNodeValue())+"/@elements." +
							getElementIdInSA(getIsData().getIstar_model().getCompartments().get(0).getTasksDecompositions().get(i).getSource().getName()));
			
			target.setValue("//@compartments."+
					getActorId(getRootElement().getElementsByTagName("compartments")
					.item(getRootElement().getElementsByTagName("compartments")
					.getLength()-1).getAttributes().getNamedItem("name").getNodeValue())+"/@elements." +
					getElementIdInSA(getIsData().getIstar_model().getCompartments().get(0).getTasksDecompositions().get(i).getTarget().getName()));
			
			
			element.setAttributeNode(source);
			element.setAttributeNode(target);
			incNumTasksDecompositions();
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
		return getPathToSave().substring(0, getPathToSave().length()-4) + "_istar.xmi";
	}
}