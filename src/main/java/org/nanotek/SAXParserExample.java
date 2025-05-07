package org.nanotek;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;

/**
 * AI Generated code from copilot.
 * 
 */
public class SAXParserExample {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("/home/jose/git/persistence-model/dict/gcide_b.xml"); // Replace with your XML file path
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean isTargetElement = false; // Change this flag as needed

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("ent")) { // Replace with actual element tag
                        isTargetElement = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (isTargetElement) {
                        System.out.println("Element value: " + new String(ch, start, length));
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    if (qName.equalsIgnoreCase("ent")) {
                        isTargetElement = false;
                    }
                }
            };

            saxParser.parse(xmlFile, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
