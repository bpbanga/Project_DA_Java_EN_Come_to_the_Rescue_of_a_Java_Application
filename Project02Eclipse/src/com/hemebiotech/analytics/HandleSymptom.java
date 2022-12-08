package com.hemebiotech.analytics;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HandleSymptom implements IHandleSymptom {

	public HandleSymptom() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Integer> mapSymptoms(List<String> symptoms){
		Map<String, Integer> lesSymptoms = new TreeMap<String, Integer>();
		for (String leSymptom: symptoms) {
			if(lesSymptoms.get(leSymptom) != null) {
				
				lesSymptoms.computeIfPresent(leSymptom,(k,v)->v+1);
				
				
			}
			else {
				
				lesSymptoms.put(leSymptom, 1);
			}
		
		
		
		}
		return lesSymptoms;
		
	}
 
}
