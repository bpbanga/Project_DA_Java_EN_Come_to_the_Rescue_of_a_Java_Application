package com.hemebiotech.analytics;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> l = readSymptom.GetSymptoms();

		
		HandleSymptom h = new HandleSymptom();
		Map<String, Integer> symptoms = h.mapSymptoms(l);

		WriteSymptom writeSymptom = new WriteSymptom ("result.out");
		writeSymptom.writeSymptom(symptoms);
		
		
	}
}
