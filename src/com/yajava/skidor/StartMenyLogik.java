package com.yajava.skidor;

import java.util.Arrays;
import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class StartMenyLogik {
	private Scanner s;

	public StartMenyLogik(Scanner s) {
		super();
		this.s = s;
	}

	public Akare[] startMeny(Akare[] tempAkare) {

		int tempInt;
		boolean condition = true;
		boolean regKlar = true;
		do {
			do {
				tempInt = InputSafety.inputInt(s);
				if (tempInt <= 4 && tempInt > 0) {
					condition = true;
				} else {
					System.out.println("mata bara in 1 - 4 tack!");
					condition = false;
					s.nextLine();
				}
			} while (!condition);
			if (tempInt == 3) {
				regKlar = false;
			}

			switch (tempInt) {
			case 1 -> {
				System.out.print("Ange förnamnet:");
				String fNamn = s.next();
				System.out.print("Ange efternamnet:");
				String eNamn = s.next();
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
