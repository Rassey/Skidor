package com.yajava.Data;

import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

/**
 * En klass som gör det möjligt att söka åkare via startnr och som sedan visar
 * ut aktuell tid.
 * 
 * @author Anna
 *
 */
public class SokAkare {
	/**
	 * Den här metoden skriver ut menyn för sokAkare
	 * 
	 * @param akareLista
	 * @param sc
	 */
	public static void menySokAkare(List<Akare> akareLista, Scanner sc) {
		boolean stopp = false;
		while (!stopp) {
			System.out.println("\n\tVill du söka efter en åkare? (y/n)");
			String svar = sc.nextLine();
			if (svar.equalsIgnoreCase("y")) {
				sokAkare(akareLista, sc);
				sc.nextLine();
			} else {
				stopp = true;
			}
		}

//		do {
//			System.out.println("\n\tVill du söka efter en åkare? (y/n)");
//			String svar = sc.nextLine();

//				
//			} 
//			sokAkare(arakeLista, sc);
//		} while (!stopp);

	}

	private static void sokAkare(List<Akare> arakeLista, Scanner sc) {

		System.out.println("\n\tSök åkare efter startnummer:");
		System.out.print("\tSkriv ett startnummer ");
		int sokStartNr = InputSafety.inputInt(sc);
		boolean isInLista = false;

		for (Akare akare : arakeLista) {
			if (akare.getStartNr() == sokStartNr)
				isInLista = true;
		}

		while (!isInLista) {
			System.out.println("\tFel startnummer försök igen ");
			sokStartNr = InputSafety.inputInt(sc);

			for (Akare akare : arakeLista) {
				if (akare.getStartNr() == sokStartNr)
					isInLista = true;
			}
		}

		final int o = sokStartNr;
		OtherPrintOut.printHeader();
		arakeLista.stream().filter(x -> x.getStartNr() == o).forEach(System.out::println);
		System.out.println();
	}
}
