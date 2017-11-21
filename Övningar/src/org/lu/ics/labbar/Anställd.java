package org.lu.ics.labbar;

public class Anställd {
	
	private String namn;
	private String personnummer;
	private int timlon;
	private int arbetadeTimmar;
	
	
	public String getNamn () {
		return namn;
	}
	public void setNamn (String newNamn) {
		namn = newNamn;
	}
	public String getPersonnummer () {
		return personnummer;
	}
	public void setPersonnummer (String newPersonnummer) {
		personnummer = newPersonnummer;
	}
	public void manadslon (int manadslon) {
		manadslon = timlon * arbetadeTimmar;
	}

   	

	



}
