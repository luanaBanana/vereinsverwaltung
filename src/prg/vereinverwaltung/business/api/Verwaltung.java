package prg.vereinverwaltung.business.api;

import java.util.List;

import prg.vereinverwaltung.domain.Person;


public interface Verwaltung {

	/**
	 * Diese Methode f�gt die �bergebene Person in den Datenbestand ein.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	Person personHinzuguefen(Person person) throws Exception;

	/**
	 * Diese Methode aktualisiert die �bergebene Person.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	Person personAktualisieren(Person person) throws Exception;

	/**
	 * Diese Methode entfernt die �bergebene Person aus dem Datenbestand.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	boolean personLoeschen(Person person) throws Exception;

	/**
	 * Diese Methode liefert alle Personen f�r die �bergebenen Namen und Vornamen
	 * zur�ck.
	 * 
	 * @param name
	 * @param vorname
	 * @return
	 * @throws Exception
	 */
	List<Person> finde(String name, String vorname) throws Exception;

	/**
	 * Diese Methode liefert die Personen f�r die �bergebene Person-Nummer zur�ck.
	 * 
	 * @param personNummer
	 * @return
	 * @throws Exception
	 */
	Person finde(int personNummer) throws Exception;

	/**
	 * Diese Methode liefert alle Personen zur�ck.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<Person> alle() throws Exception;
}
