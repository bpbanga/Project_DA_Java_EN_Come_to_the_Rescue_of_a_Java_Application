package com.hemebiotech.analytics;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;
/**
 * 
 * 
 * main function of the application
 */
public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		ISymptomReader readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> reading = readSymptom.GetSymptoms();

		
		IHandleSymptom treatment = new HandleSymptom();
		Map<String, Integer> symptoms = treatment.mapSymptoms(reading);

		ISymptomWriter writeSymptom = new WriteSymptom ("result.out");
		writeSymptom.writeSymptom(symptoms);
		
		
	}
}
