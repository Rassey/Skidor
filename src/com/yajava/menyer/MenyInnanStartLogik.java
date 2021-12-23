package com.yajava.menyer;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class MenyInnanStartLogik {

	/**
	 * Meny samt logik för meny innan lopp
	 * @param tempAkare - Array av aktuella åkare
	 */
	public static void innanstart(Akare[] tempAkare, Scanner sc) {
		
		char o = 246, ae = 228;
		int val = 0;
		boolean condition = false;
		boolean lopStart = false;

		while (!lopStart) {
			
			MenyerSkrivare.loppStart();
			val = InputSafety.inputInt(sc);
			condition = (val < 4 && val > 0) ? true : false;
			
			while (!condition) {
				System.out.println("mata bara in 1-2 tack!");
				sc.nextLine();
				val = InputSafety.inputInt(sc);
				condition = (val < 4 && val > 0) ? true : false;
			}

			switch (val) {
			case 1 -> PrintOut.visaStartListan(tempAkare);
			case 2 -> System.out.println("\n\tt" + ae + "vlingen starta snart, g" + o + "r er redo!");
			case 3 -> System.exit(0);
			}
			
			lopStart = val == 2 ? true : false;
		}
	}
}
