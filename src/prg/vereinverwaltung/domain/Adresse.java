package prg.vereinverwaltung.domain;

public class Adresse {
	
	private int plz;
	private String strasse;
	private String ort;
	
	public Adresse(int plz, String strasse, String ort) {
		this.plz=plz;
		this.strasse=strasse;
		this.ort=ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

}