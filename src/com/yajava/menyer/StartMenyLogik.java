package com.yajava.menyer;

import java.util.Arrays;
import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class StartMenyLogik {
	
	static char ae = 228, ao = 229, o = 246;
	private Scanner sc;

	public StartMenyLogik(Scanner s) {
		super();
		this.sc = s;
	}
	
	/**
	 * Meny samt Logik för startmenyn 
	 * @param akarLista - Array av aktuella Åkare
	 * @return
	 */
	public Akare[] startMeny(Akare[] akarLista) {

		int val = 0;
		boolean regKlar = false;
		
		while (!regKlar) {

			MenyerSkrivare.startMenyn();
			val = InputSafety.inputInt(sc);

			if ( val < 1 || val > 4 ) {
				System.out.println("mata bara in 1 - 4 tack!");
				sc.nextLine();
				val = InputSafety.inputInt(sc);
			}

			switch (val) {
				case 1 -> akarLista = nyAkare(akarLista); // Registrera ny åkare
				case 2 -> PrintOut.visaStartListan(akarLista); // Visa aktuell startlista
				case 3 -> System.out.println("Alla " + ao + "kare " + ae + "r registrerade, g" + o + "r er redo f" + o + "r start"); // Markera registreringstid som
				case 4 -> System.exit(0);
			}
			regKlar = val == 3 ? true : false;
		}
		return akarLista;
	}

	private Akare[] nyAkare(Akare[] akarLista) {
		System.out.print("Ange f" + o + "rnamnet:");
		String fNamn = sc.next();
		System.out.print("Ange efternamnet:");
		String eNamn = sc.next();
		Akare nyAkare = new Akare(fNamn, eNamn);

		Akare[] tempArray = Arrays.copyOf(akarLista, akarLista.length);
		akarLista = Arrays.copyOf(tempArray, tempArray.length + 1);
		akarLista[akarLista.length - 1] = nyAkare;
		System.out.println("\n\tEn ny " + ao + "kare " + ae + "r nu registrerad.");
		System.out.println("\t``````````````````````````````");
		return akarLista;
	}
}
