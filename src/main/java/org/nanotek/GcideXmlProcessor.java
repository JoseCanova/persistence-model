package org.nanotek;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class GcideXmlProcessor {

	public static void main(String[] args) {
		XmlMapper xmlMapper = new XmlMapper();
		String fileLocation = "/home/jose/git/persistence-model/dict/gcide_b.xml";
		
		File xmlFile = new File(fileLocation);
		try {
			var xmlStream = new FileInputStream(xmlFile);
			byte[] bytes = xmlStream.readAllBytes();
			Map<?,?> theMap = xmlMapper.readValue(bytes, Map.class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
