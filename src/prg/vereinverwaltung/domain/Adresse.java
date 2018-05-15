package prg.vereinverwaltung.domain;

/**
 * Diese Klasse bildet eine Adresse ab.
 * 
 * @author jsucur
 * @version 1.0
 *
 */
public class Adresse {

	private int plz;
	private String strasse;
	private String ort;

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