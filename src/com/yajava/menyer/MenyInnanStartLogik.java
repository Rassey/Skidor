package com.yajava.menyer;

import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.Data.AkarList;
import com.yajava.Utskrifter.MenyerSkrivare;

import com.yajava.input.InputSafety;

public class MenyInnanStartLogik {

	// Meny samt logik för meny innan lopp
	public static void innanstart(AkarList akarList, Scanner sc) {

		int val = 0;
		boolean condition = false;
		boolean lopStart = false;

		while (!lopStart) {

			MenyerSkrivare.loppStart(); // skriv ut loppmenyn
			System.out.print("\tDitt val: ");
			val = InputSafety.inputInt(sc); // ta emot valen
			condition = (val < 4 && val > 0) ? true : false;

			while (!condition) {
				System.out.print("\tMata bara in 1-3, försök igen: ");
				//sc.nextLine();
				val = InputSafety.inputInt(sc);
				condition = (val < 4 && val > 0) ? true : false;
			}

			switch (val) {
			case 1 -> PrintOut.visaListanInnanLopp(akarList);
			case 2 -> System.out.println("\n\tTävlingen startar snart, gör er redo!");
			case 3 -> {
				PrintOut.goodbye();
				System.exit(0);
			}
			}

			lopStart = val == 2 ? true : false;
		}
	}

}
