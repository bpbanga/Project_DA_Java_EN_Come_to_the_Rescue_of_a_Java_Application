package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteSymptom implements ISymptomWriter {

	private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */

	public WriteSymptom(String filepath) {
		this.filepath = filepath;
	}


	@Override
	public void writeSymptom(Map<String, Integer>  listeSymptom) {
		// TODO Auto-generated method stub

		// next generate output a extraire
		try {
			FileWriter filewriter = new FileWriter(filepath);
			BufferedWriter writer = new BufferedWriter(filewriter);
			if (listeSymptom != null && !listeSymptom.isEmpty()) {
				Set set = listeSymptom.entrySet();
				Iterator i = set.iterator();
				while(i.hasNext()) {
					Map.Entry entry = (Map.Entry)i.next();
					writer.write(String.valueOf(entry.getKey() + " : " + entry.getValue()));
					writer.newLine();
				}
			} else {
				writer.write("Aucun résultat");
			}
				
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	

}
