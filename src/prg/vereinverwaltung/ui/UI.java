package prg.vereinverwaltung.ui;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import prg.vereinverwaltung.business.api.Verwaltung;
import prg.vereinverwaltung.domain.Person;

/**
 * Diese Klasse stellt die Benutzerschnittstelle zur Verfügung.
 * 
 * @author jsucur
 * @version 1.0
 */
public class UI {

	private static Logger logger = LogManager.getLogger(UI.class);

	/* Menue-Konstanten */
	private static final String MENU_1_0_0 = "Person hinzufuegen [1]     Daten Laden [2]     Beenden [0]";
	
	private static final String MENU_2_0_0 = "Mitglied hinzufuegen [1]   Daten anzeigen [2]    Zurueck [3]";
	
	private static final String MENU_2_1_0 = "Mitglied-Nr. [1]     Name und Vorname [2]   Alle [3]  Zurueck [4]";
	
	private static final String MENU_2_1_1 = "Mitglied editieren[1]     Mitglied loeschen [2]    Zurueck [3]";
	
	private static final String MENU_2_1_2 = "Mitglied-Nr. [1]    Name und Vorname [2]   Exportieren [3]     Zurueck [4]";

	/* Start-Menu */
	private static String menu = MENU_1_0_0;

	/**
	 * Anwendungslogik-Komponente
	 */
	private Verwaltung verwaltung;

	public UI(Verwaltung verwaltung) {
		this.verwaltung = verwaltung;
	}

	/**
	 * Steuert die Ausführung des Programms
	 */
	public void execute() {

		Scanner sc = new Scanner(System.in);
	
	
		menu = MENU_1_0_0;
		int wahl = sc.nextInt();

		do {
						
			
			if (wahl == 1) {
				
				// Methode Person hinzufügen aufrufen
				personHinzufuegen(person);
				
				menu = MENU_2_0_0;
				
			}
								
			if (wahl == 2) {
				
			// Methode Daten laden	
				
				menu = MENU_2_0_0;
				int wahl1 = sc.nextInt();
				
				if (wahl1 == 1) {
					personHinzufuegen(person);

				}
				
				if (wahl1 == 2) {
					// Methode Daten anzeigen
					
					menu = MENU_2_1_0;
					int wahl2 = sc.nextInt();
					
					if (wahl2 == 1) {
						//Mitgliednummer eingeben, suchen und anzeigen
						finde(int);
						
						menu = MENU_2_1_1;
					}
					
					if (wahl2 == 2) {
						// Name und Vorname eingeben, suchen und anzeigen
						finde(String name, String vorname);

						menu = MENU_2_1_1;
					}
						
					if (wahl1 ==3) {
						// Alles
						finde(int;)
						finde(String name, String vorname);
					}
						
					if (wahl1 == 4)
						// Zurück
							
						menu = MENU_2_0_0;
					
				}
				
				if (wahl1 == 3) {
					// Zurück 
					menu = MENU_1_0_0;
					
					
				}
			}
				
							
			
			
			
			

		} while (wahl != 0);

		System.out.println("\nProgramm wird beendet.\n");

	}

}
