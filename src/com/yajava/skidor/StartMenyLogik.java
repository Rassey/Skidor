package com.yajava.skidor;

import java.util.Arrays;
import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class StartMenyLogik {
	private Scanner sc;

	public StartMenyLogik(Scanner s) {
		super();
		this.sc = s;
	}
	
	/**
	 * Meny samt Logik för startmenyn 
	 * @param tempAkare - Array av aktuella Åkare
	 * @return
	 */
	
	public Akare[] startMeny(Akare[] tempAkare) {

		int tempInt;
		boolean condition = true;
		boolean regKlar = true;
		do {
			UtskrifterMenyer.startMenyn();
			do {
				tempInt = InputSafety.inputInt(sc);
				if (tempInt <= 4 && tempInt > 0) {
					condition = true;
				} else {
					System.out.println("mata bara in 1 - 4 tack!");
					condition = false;
					sc.nextLine();
				}
			} while (!condition);
			if (tempInt == 3) {
				regKlar = false;
			}

			switch (tempInt) {
			
			// lägger till en åkare
			
			case 1 -> {
				System.out.print("Ange förnamnet:");
				String fNamn = sc.next();
				System.out.print("Ange efternamnet:");
				String eNamn = sc.next();
				Akare nyAkare = new Akare(fNamn, eNamn);

				Akare[] tempArray = Arrays.copyOf(tempAkare, tempAkare.length);
				tempAkare = Arrays.copyOf(tempArray, tempArray.length + 1);
				tempAkare[tempAkare.length - 1] = nyAkare;
			}
			case 2 -> {
				PrintOut.visaStartListan(tempAkare);
			}
			case 3 -> {
				System.out.println("Alla åkare är registrerade, gör er redo för start");
			}
			case 4 -> {
				System.out.println("Hejdå");
				System.exit(0);
			}
			}
		} while (regKlar);

		return tempAkare;
	}

}
