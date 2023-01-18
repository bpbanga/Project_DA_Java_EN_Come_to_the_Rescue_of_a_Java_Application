package com.hemebiotech.analytics;

import java.util.List;
/**
 * everything that will allow the writing
 * of the elements of a map transformed into a string in a file
 * 
 */
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * 
	 * function allowing the writing of a list of symptoms in a given file
	 * @param listeSymptom map that is scanned and written back to a file
	 * try and catch to handle exceptions
	 */

	public void writeSymptom(Map<String, Integer>  listeSymptom);
	

	
}
