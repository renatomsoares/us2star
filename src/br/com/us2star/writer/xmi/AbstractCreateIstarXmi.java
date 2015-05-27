package br.com.us2star.writer.xmi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import br.com.us2star.mapping.istar.IstarData;

public abstract class AbstractCreateIstarXmi {

	private IstarData isData;
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	protected Document doc;
	private Element rootElement;
	private String pathToSave;
	private int numTasksDecompositions;
	
	public AbstractCreateIstarXmi(IstarData isData, String pathToSave) throws ParserConfigurationException, TransformerException {
		this.isData = isData;
		this.docFactory = DocumentBuilderFactory.newInstance();
		this.docBuilder = docFactory.newDocumentBuilder();
		this.doc = docBuilder.newDocument();
		this.pathToSave = pathToSave;
		this.numTasksDecompositions = 0;
	}

	public IstarData getIsData() {
		return isData;
	}

	public void setIsData(IstarData isData) {
		this.isData = isData;
	}

	public DocumentBuilderFactory getDocFactory() {
		return docFactory;
	}

	public void setDocFactory(DocumentBuilderFactory docFactory) {
		this.docFactory = docFactory;
	}

	public DocumentBuilder getDocBuilder() {
		return docBuilder;
	}

	public void setDocBuilder(DocumentBuilder docBuilder) {
		this.docBuilder = docBuilder;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public Element getRootElement() {
		return rootElement;
	}

	public void setRootElement(Element rootElement) {
		this.rootElement = rootElement;
	}

	public String getPathToSave() {
		return pathToSave;
	}

	public void setPathToSave(String pathToSave) {
		this.pathToSave = pathToSave;
	}

	public int getNumTasksDecompositions() {
		return numTasksDecompositions;
	}

	public void setNumTasksDecompositions(int numTaksDecompositions) {
		this.numTasksDecompositions = numTaksDecompositions;
	}
	
	public void incNumTasksDecompositions() {
		this.numTasksDecompositions++;
	}

}
