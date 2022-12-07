package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	
	
	@Override
	
	
	
	public List<String> GetSymptoms() {
		
		ArrayList<Symptom> lesSymptoms = new ArrayList<Symptom>();
		ArrayList<String> result= new ArrayList<String>();
		
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					Boolean symptomTrouve = false;
					for(Symptom leSymptom : lesSymptoms) {
						if(line.equals(leSymptom.getNomSyptom())) {
							leSymptom.setOccurence(leSymptom.getOccurence() + 1);
							symptomTrouve = true;
							break;
						}
						
					}
					if (!symptomTrouve ) {
					
					lesSymptoms.add( new Symptom (line , 1));
					}
					line = reader.readLine();
				}
				reader.close();
				for(Symptom leSymptom : lesSymptoms) {
					result.add(leSymptom.toString());
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(result);
		return result;
	}
	

}
