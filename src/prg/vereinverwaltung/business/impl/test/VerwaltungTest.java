package prg.vereinverwaltung.business.impl.test;

import prg.vereinverwaltung.business.api.Verwaltung;
import prg.vereinverwaltung.business.dummy.PersisterDummy;
import prg.vereinverwaltung.business.impl.VerwaltungImpl;
import prg.vereinverwaltung.persister.api.Persister;

public class VerwaltungTest {

	public static void main(String[] args) {

		Persister persister = new PersisterDummy();
		Verwaltung verwaltung = new VerwaltungImpl(persister);

		/* TODO - Testen, ob das "Speichern" eines Mitglieds korrekt funktioniert */

		// TODO - Weitere Aktionen testen ...

	}
}
