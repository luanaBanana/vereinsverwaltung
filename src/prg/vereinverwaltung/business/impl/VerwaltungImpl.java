package prg.vereinverwaltung.business.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Comparator;

import prg.vereinverwaltung.business.api.Verwaltung;
import prg.vereinverwaltung.domain.Person;
import prg.vereinverwaltung.persister.api.Persister;
import prg.vereinverwaltung.persister.impl.plaintext.PersisterImpl;

/**
 * Diese Klasse stellt eine konkrete Implementierung der Schnittstelle
 * 'Verwaltung' dar.
 * 
 * @author jsucur
 * @version 1.0
 */
public class VerwaltungImpl implements Verwaltung {

	/**
	 * Persister-Komponente
	 */
	private Persister persister;

	public VerwaltungImpl(Persister persister) {
		this.persister = persister;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#personHinzuguefen(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public Person personHinzuguefen(Person person) throws Exception {
		persister.speichern(person);
		return person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#personAktualisieren(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public Person personAktualisieren(Person person) throws Exception {
		persister.aktualisieren(person);
		return person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#personLoeschen(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public boolean personLoeschen(Person person) throws Exception {
		persister.loeschen(person);
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#finde(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<Person> finde(String name, String vorname) throws Exception {
		persister.finde(name, vorname);
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#finde(int)
	 */
	@Override
	public Person finde(int personNummer) throws Exception {
		persister.finde(personNummer);
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.business.api.Verwaltung#alle()
	 */
	@Override
	public List<Person> alle() throws Exception {
		persister.alle();
		return null;
	}
}
