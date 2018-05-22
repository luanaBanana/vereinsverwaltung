package prg.vereinverwaltung.domain;

import java.time.LocalDate;

public class Person {

	private String name;
	private String vorname;
	private LocalDate geburtsdatum;
	private int mitgliedsnummer;
	private Kontakt kontakt;
	private Adresse adresse;

	public Person(String name, String vorname, LocalDate geburtsdatum, int mitgliedsnummer, 
			int telefon, String email, int plz, String strasse, String ort) {
		this.kontakt = new Kontakt(telefon, email);
		this.adresse = new Adresse(plz, strasse, ort);
		this.name = name;
		this. vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.mitgliedsnummer = mitgliedsnummer;	
	}

	
	
	
	public Kontakt getKontakt() {
		return kontakt;
	}

	public void setKontakt(Kontakt kontakt) {
		this.kontakt = kontakt;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	
	public int getMitgliedsnummer() {
		return mitgliedsnummer;
	}

	public void setMitgliedsnummer(int mitgliedsnummer) {
		this.mitgliedsnummer = mitgliedsnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

}
