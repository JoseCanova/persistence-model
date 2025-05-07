package org.nanotek;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.XMLEvent;

import java.io.FileInputStream;

public class StaxParserExample {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader reader = factory.createXMLEventReader(new FileInputStream("/home/jose/git/persistence-model/dict/gcide_b.xml")); // Replace with your XML file

            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();

                if (event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("ent")) { // Replace with actual element tag
                    System.out.println("Element value: " + reader.getElementText());
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
