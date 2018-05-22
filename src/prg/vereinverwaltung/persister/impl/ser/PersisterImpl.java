package prg.vereinverwaltung.persister.impl.ser;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import prg.vereinverwaltung.domain.Person;
import prg.vereinverwaltung.persister.api.Persister;

/**
 * Diese Klasse stellt eine konkrete Implementierung der Schnittstelle
 * 'Persister' dar. Die Persisteirung wird dabe mit Hilfe der Serialisierung
 * realisiert.
 * 
 * @author jsucur
 * @version 1.0
 */
public class PersisterImpl implements Persister {

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#speichern(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public Person speichern(Person person) throws Exception {
		// TODO Auto-generated method stub
		
		String fileName = "mitgliederdatenbank";
		File mitgliederdatenbank = new File(fileName);
		try
		{
			if (file.exists())	
			{
				FileWriter writer = new FileWriter(fileName, true);
				writer.append(person.getName());
				writer.append(person.getVorname());
				writer.append(person.getGeburtsdatum());
				writer.append(person.getMitgliedsnummer());
				writer.append(person.getAdresse().getStrasse());
				writer.append(person.getAdresse().getOrt());
				writer.append(person.getAdresse().getPlz());
				writer.append(person.getKontakt().getEmail());
				writer.append(person.getKontakt().getTelefon());
			}
		

		return null;
	};

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#aktualisieren(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public Person aktualisieren(Person person) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#loeschen(prg.
	 * vereinverwaltung.domain.Person)
	 */
	@Override
	public boolean loeschen(Person person) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#loeschen(int)
	 */
	@Override
	public boolean loeschen(int personNummer) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#finde(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<Person> finde(String name, String vorname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#finde(int)
	 */
	@Override
	public Person finde(int personNummer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see prg.vereinverwaltung.persister.api.Persister#alle()
	 */
	@Override
	public List<Person> alle() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
