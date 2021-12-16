package com.yajava.skidor;


public class UtskrifterMenyer {

	public static void startMenyn() {
		String startMenyn = "\n\t[1] Registrera ny åkare" + "\n\t[2] Visa Startlistan"
				+ "\n\t[3] Alla åkare är registrerade" + "\n\t[4] EXIT";
		System.out.println(startMenyn);
//		tempAkare = ValfranMeny.startMenynVal(s,tempAkare);
//		return tempAkare;
	}

	public static void forstaloppVal() {
		String startMenyn = "\n\t[1] Mass star" + "\n\t[2] Individuel start";
		System.out.println(startMenyn);
//		int loppVal = ValfranMeny.valFranLoppVal(s);
//		return loppVal;
	}

	public static void loppStart() {
		String meny3 = "\n\t[1] Visa Startlista" + "\n\t[2] Starta loppet";
		System.out.println(meny3);
//		ValfranMeny.valFranLoppStart(s, tempAkare);
	}

	public static void Meny4() {

	}
}
