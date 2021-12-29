package com.yajava.menyer;

import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class MenyInnanStartLogik {

	// Meny samt logik för meny innan lopp
	public static void innanstart(List<Akare> akarListan, Scanner sc) {
		
		char o = 246, ae = 228;
		int val = 0;
		boolean condition = false;
		boolean lopStart = false;

		while (!lopStart) {
			
			MenyerSkrivare.loppStart();							// skriv ut loppmenyn
			
			val = InputSafety.inputInt(sc);						// ta emot valen
			condition = (val < 4 && val > 0) ? true : false;
			
			while (!condition) {
				System.out.println("mata bara in 1-2 tack!");
				sc.nextLine();
				val = InputSafety.inputInt(sc);
				condition = (val < 4 && val > 0) ? true : false;
			}

			switch (val) {
			case 1 -> PrintOut.visaListan(akarListan);
			case 2 -> System.out.println("\n\tt" + ae + "vlingen starta snart, g" + o + "r er redo!");
			//H�r ska det g� att s�ka en �kare
			case 3 -> {
				System.out.println("S�k �kare via startnummer");
				sokAkare(akarListan);
			}
			
			
			case 4 -> System.exit(0);
			}
			
			lopStart = val == 2 ? true : false;
		}
	}
	public static void sokAkare(List<Akare> arakeLista) {
		System.out.println("S�k �kare efter startnummer.");
		System.out.println("Skriv ett startnummer");
		Scanner s = new Scanner(System.in);
		int sokStartNr=s.nextInt();
		//f�rs�k1
		for (int i = 0; i <arakeLista.size();i++) {
			if(arakeLista.get(i).getStartNr()==sokStartNr) {
				System.out.println(arakeLista.get(i));
			}
				
			}}
}
