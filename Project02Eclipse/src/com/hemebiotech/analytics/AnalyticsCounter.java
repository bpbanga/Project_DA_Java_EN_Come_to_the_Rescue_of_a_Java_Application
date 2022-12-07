package com.hemebiotech.analytics;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[])
			
			throws Exception {
		ReadSymptomDataFromFile readSymptom = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptom writeSymptom = new WriteSymptom ("result.out");
		writeSymptom.ecritSymptom(readSymptom.GetSymptoms());
		
		
	}
}
