package org.yogahorseman.pferdeklassen;

public class Pferderasse {
	
	/**
	 *  
	 *  @author Ulrich
	 */
	
	// Attributes
	private String rassenname;	

	private String kathegorie;
	
	private String stockmass;
	
	private String farbe;
	
	private String ursprung;
	
	
	// getter and setter Methoden
	
	public String getRassenname() {
		return rassenname;
	}

	public void setRassenname(String rassenname) {
		this.rassenname = rassenname;
	}
	
	public String getKathegorie() {
		return kathegorie;
	}

	public void setKathegorie(String kathegorie) {
		this.kathegorie = kathegorie;
	}

	public String getStockmass() {
		return stockmass;
	}

	public void setStockmass(String stockmass) {
		this.stockmass = stockmass;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getUrsprung() {
		return ursprung;
	}

	public void setUrsprung(String ursprung) {
		this.ursprung = ursprung;
	}

	
	
	// to string
	public String toString() {
		return "Pferderasse:\n Rassenname: "+ rassenname +"\n Kategorie: "+ kathegorie + 
			"\n Stockma�: "+stockmass+"\n Farbe:"+farbe+"\n Ursprung: "+ursprung;
		
				
	}
	
	

}
