package prg.vereinverwaltung.persister.impl.test;

import prg.vereinverwaltung.persister.api.Persister;

public class PersisterTest {

	public static void main(String[] args) {

		testPlainTextPersister();

		testSerializerPersister();

	}

	private static void testPlainTextPersister() {

		Persister txtPersister = new prg.vereinverwaltung.persister.impl.plaintext.PersisterImpl();

		// TODO - Speichern testen ...

		// TODO - Editieren testen

		// TODO - Löschen eines Mitglieds testen ...

		// TODO - Einlesen aller gespeicherten Personen testen ...

		// TODO - Suche nach Nummer testen ...

		// TODO - Suche nach Name und Vorname testen ...

	}

	private static void testSerializerPersister() {

		Persister serPersister = new prg.vereinverwaltung.persister.impl.ser.PersisterImpl();

		// TODO - Speichern testen ...

		// TODO - Editieren testen

		// TODO - Löschen eines Mitglieds testen ...

		// TODO - Einlesen aller gespeicherten Personen testen ...

		// TODO - Suche nach Nummer testen ...

		// TODO - Suche nach Name und Vorname testen ...

	}

}
