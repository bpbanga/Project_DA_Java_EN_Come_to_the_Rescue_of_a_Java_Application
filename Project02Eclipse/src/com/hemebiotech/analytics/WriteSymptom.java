package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSymptom implements ISymptomWriter {

	private String filepath;

	public WriteSymptom(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void ecritSymptom(List<String> listeSymptom) {
		// TODO Auto-generated method stub

		// next generate output a extraire
		try {
			FileWriter filewriter = new FileWriter(filepath);
			BufferedWriter writer = new BufferedWriter(filewriter);
			if (listeSymptom != null && !listeSymptom.isEmpty()) {
				for (String symptom : listeSymptom) {
					writer.write(symptom);
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
