package org.nanotek;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 
**/
public class BaseGcideDomProcessor {

	public static void main(String[] args) {
		
		String fileLocation = "/home/jose/git/persistence-model/dict/gcide_b.xml";
		
		File xmlFile = new File(fileLocation);
		
		try {
			
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            NodeList nodeList = document.getElementsByTagName("ent");
		
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Element value: " + element.getTextContent());
                }
            }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
