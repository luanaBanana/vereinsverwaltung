package prg.vereinverwaltung.domain;

import java.time.LocalDate;

/**
 * Diese Klasse bildet eine Person ab.
 * 
 * @author jsucur
 * @version 1.0
 */
public class Person {

		private String name;
		private String vorname;
		private LocalDate geburtsdatum;
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


