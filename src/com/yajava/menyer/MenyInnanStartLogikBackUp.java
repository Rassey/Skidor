package com.yajava.menyer;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class MenyInnanStartLogikBackUp {
	private Scanner sc;

	public MenyInnanStartLogikBackUp(Scanner sc) {
		super();
		this.sc = sc;
	}
	/**
	 * Meny samt logik för meny innan lopp
	 * @param tempAkare - Array av aktuella åkare
	 */
	public void innanstart(Akare[] tempAkare) {
		int val;
		boolean condition = true;
		boolean lopStart = true;
		
		do {
			MenyerSkrivare.loppStart();
			do {
				val = InputSafety.inputInt(sc);
				if (val <= 2 && val > 0) {
					condition = true;
				} else {
					System.out.println("mata bara in 1-2 tack!");
					condition = false;
					sc.nextLine();
				}

			} while (!condition);
			if (val == 2) {
				lopStart = false;
			}
				switch (val) {
				case 1 -> PrintOut.visaStartListan(tempAkare);
				case 2 -> System.out.println("\n\ttävlingen starta snart, gör er redo!");
				}
		} while (lopStart);
	}
}
