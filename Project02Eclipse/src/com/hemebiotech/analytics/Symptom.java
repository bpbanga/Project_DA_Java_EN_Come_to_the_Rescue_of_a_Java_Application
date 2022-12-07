package com.hemebiotech.analytics;

public class Symptom  {
	private String nomSyptom ;
	private int occurence = 0;
	 
	 public String getNomSyptom() {
		return nomSyptom;
	}

	public void setNomSyptom(String nomSyptom) {
		this.nomSyptom = nomSyptom;
	}

	public int getOccurence() {
		return occurence;
	}

	public void setOccurence(int occurence) {
		this.occurence = occurence;
	}

	
	
	Symptom (String nomsyptom , int occurence){
		this.nomSyptom = nomsyptom;
		this.occurence = occurence;
	}
	
	public String toString() {
		
		return this.nomSyptom + " =" + String.valueOf(this.occurence) ;
		
		
		
	}
	
	
}
