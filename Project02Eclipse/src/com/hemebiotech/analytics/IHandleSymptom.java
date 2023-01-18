package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 everything that will process lists of strings and transform them into a map containing an ordered list of strings
 * with the number of occurrences
 * of each string and therefore without duplicates.
 */


public interface IHandleSymptom {  
	/**
	 * 
	 * function allowing the processing of a list and returning a map
	 * @param symptoms list of strings searched
	 * @return lesSymtoms map containing a list of symptoms ordered with the number of occurrences of each symptom
	 */

	
	public Map<String, Integer> mapSymptoms(List<String> symptoms);

}
