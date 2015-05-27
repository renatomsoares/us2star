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
public class CreateIstarXmiToOpenOME extends AbstractCreateIstarXmi {

	public CreateIstarXmiToOpenOME(IstarData isData, String pathToSave) throws ParserConfigurationException, TransformerException {
		super(isData, pathToSave);
	}
}