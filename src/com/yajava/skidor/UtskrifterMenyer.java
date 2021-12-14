package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.akare.Akare;


public class UtskrifterMenyer {
	/**
	 * det här är start menyn för loppet
	 * @param s - inmatad scanner
	 * @param tempAkare - temporar array med åkare för att ändra
	 * @return - retunerar ändringar
	 */
	public void startMenyn() {
		String meny1 = "\n\t[1] Registrera ny åkare" + 
						"\n\t[2] Visa Startlistan" + 
						"\n\t[3] Alla åkare är registrerade" +
						"\n\t[4] EXIT";
		System.out.println(meny1);
//		tempAkare = ValfranMeny.startMenynVal(s,tempAkare);
//		return tempAkare;
	}

	public static int loppVal(Scanner s) {
		String meny2 = "\n\t[1] Mass star" + 
						"\n\t[2] Individuel start" + 
						"\n\t[3] Jaktstart";
		System.out.println(meny2);
		int loppVal = ValfranMeny.valFranLoppVal(s);
		return loppVal;
	}

	public static void loppStart(Scanner s,Akare[] tempAkare) {
		String meny3 = "\n\t[1] Visa Startlista" + 
				"\n\t[2] Starta loppet";
		System.out.println(meny3);
		ValfranMeny.valFranLoppStart(s, tempAkare);
	}

	public static void Meny4() {

	}
}
