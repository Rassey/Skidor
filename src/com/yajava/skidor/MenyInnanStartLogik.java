package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class MenyInnanStartLogik {
	private Scanner sc;

	public MenyInnanStartLogik(Scanner sc) {
		super();
		this.sc = sc;
	}
	/**
	 * 
	 * @param tempAkare - Åkarelistan som matas med
	 */
	public void innanstart(Akare[] tempAkare) {
		int tempval;
		boolean condition = true;
		boolean lopStart = true;
		do {
			UtskrifterMenyer.loppStart();
			do {
				tempval = InputSafety.inputInt(sc);
				if (tempval <= 2 && tempval > 0) {
					condition = true;
				} else {
					System.out.println("mata bara in 1-2 tack!");
					condition = false;
					sc.nextLine();
				}

			} while (!condition);
			if (tempval == 2) {
				lopStart = false;
			}
				switch (tempval) {
				case 1 ->{
					PrintOut.visaStartListan(tempAkare);
				}
				case 2 ->{
					System.out.println("tävlingen starta snart, gör er redo!");
				}
				}
			
			
		} while (lopStart);
	}
}
