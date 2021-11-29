package com.yajava.skidor;

import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.input.HuvudMenyVal;
import com.yajava.lopp.Lopp;

/**
 * Klassen styr hela logiken
 * @author Mohamad
 *
 */
public class Logik {
	
	private Scanner sc = new Scanner(System.in);
	
	// skapa instanser av klasser
	private PrintOut print = new PrintOut();
	private HuvudMenyVal hMenyVal = new HuvudMenyVal(sc);
	private Lopp lopp = new Lopp();

	public void Start() {
		
		boolean exit = false; // används för att kolla om användaren vill avsluta
		
		while (!exit) {
			print.visaHuvudMeny(); // skriver ut menyn
			
			switch (hMenyVal.val()) {
			case 1 -> print.visaStartListan(lopp.createList()); // ett exempel bara jag tycker att vi ändrar metod namnet
			case 2 -> System.out.println("Här visar vi resultatlistan");
			case 3 -> System.out.println("Här visar vi mellantider");
			case 4 -> System.out.println("Här söker man åkaren");
			case 5 -> {
				System.out.println("Hejdå");
				exit = true;
			}
			}
		}
		sc.close();
	}
}
