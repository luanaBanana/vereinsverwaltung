package prg.vereinverwaltung.persister.api;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import prg.vereinverwaltung.domain.Person;

/**
 * Diese Schnittstelle gibt die Funktionalit�ten vor, welche f�r die
 * Persistierung von Pesonendaten ben�tigt werden.
 * 
 * @author jsucur
 * @version 1.0
 */
public interface Persister {

	/**
	 * Speichert die �bergebene Person.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	Person speichern(Person person) throws Exception;

	/**
	 * Aktualisiert die �bergebene Person.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	Person aktualisieren(Person person) throws Exception
	{
		
			
	}

	/**
	 * Entfernt die �bergehbene Person aus dem Datenbestand.
	 * 
	 * @param person
	 * @return
	 * @throws Exception
	 */
	boolean loeschen(Person person) throws Exception;

	/**
	 * Entfernt die Person f�r die �bergebene Person-Nummer aus dem Datenbestand.
	 * 
	 * @param personNummer
	 * @return
	 * @throws Exception
	 */
	boolean loeschen(int personNummer) throws Exception;

	/**
	 * Liefert die Personen f�r die �bergebenen Namen und Vornamen zur�ck.
	 * 
	 * @param name
	 * @param vorname
	 * @return
	 * @throws Exception
	 */
	List<Person> finde(String name, String vorname) throws Exception;

	/**
	 * Liefert die Person f�r die �bergebene Person-Nummer zur�ck.
	 * 
	 * @param personNummer
	 * @return
	 * @throws Exception
	 */
	Person finde(int personNummer) throws Exception;

	/**
	 * Liefert alle Personen zur�ck.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<Person> alle() throws Exception;
}
