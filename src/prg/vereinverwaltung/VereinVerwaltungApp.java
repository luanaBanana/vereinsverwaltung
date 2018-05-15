package prg.vereinverwaltung;

import prg.vereinverwaltung.business.api.Verwaltung;
import prg.vereinverwaltung.ui.UI;
import prg.vereinverwaltung.ui.dummi.VerwaltungDummy;

/**
 * Diese Klasse erm�glicht das Starten der Applikation.
 * 
 * @author jsucur
 * @version 1.0
 */
public class VereinVerwaltungApp {

	public static void main(String[] args) {

		/* ENTWEDER: Plaintext-Persister instantiieren */
		// Persister persister = new
		// prg.vereinverwaltung.persister.impl.plaintext.PersisterImpl();

		/* ODER: Serialiser-Persister instantiieren */
		// Persister persister = new
		// prg.vereinverwaltung.persister.impl.ser.PersisterImpl();

		/* Verwaltung-Komponente instantiieren */
		// Verwaltung verwaltung = new VerwaltungImpl(persister);

		/*
		 * Bis die finale Verwaltung-Implementierung zur Verf�gung steht, wird mit
		 * VerwaltungDummy-Klasse gearbeitet
		 */
		Verwaltung verwaltung = new VerwaltungDummy();

		/* UI-Komponente instantieeren */
		UI ui = new UI(verwaltung);

		/* Ausf�hrung starten */
		ui.execute();

		System.out.println("\nDie Programmausf�hrung wird beendet.\n");

	}
}
