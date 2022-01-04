package com.yajava.menyer;

import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.Data.AkarList;
import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class StartMenyLogik {
	
	// Skriver ut startmenyn samt kör dess logik
	public static void startMeny(AkarList akarList, Scanner sc) {

		int val = 0;
		boolean regKlar = false; //Boolean för att se om registering är gjord
		
		while (!regKlar) {

			MenyerSkrivare.startMenyn();		// skriv ut menyn
			val = InputSafety.inputInt(sc);		// ta emot valen

			if ( val < 1 || val > 4 ) {
				System.out.println("Mata bara in 1 - 4 tack!");
				sc.nextLine();
				val = InputSafety.inputInt(sc);
			}

			switch (val) {
				case 1 -> nyAkare(akarList.getAkarLista(),sc); 					// Registrera ny åkare
				case 2 -> PrintOut.visaListanInnanLopp(akarList); 	// Visa aktuell åkarlista
				case 3 -> OtherPrintOut.printRegistrerade(); 		// Markera registreringstid som slut
				case 4 -> System.exit(0);
			}
			regKlar = val == 3 ? true : false;
		}
	}
	
	// Registrera ny åkare
	private static void nyAkare(List<Akare> akarListan, Scanner sc) {
		System.out.print("Ange förnamnet: ");
		String fNamn = sc.next();
		System.out.print("Ange efternamnet: ");
		String eNamn = sc.next();
		
		akarListan.add(new Akare(fNamn, eNamn));

		OtherPrintOut.printNyAkareRegged();
	}
}
