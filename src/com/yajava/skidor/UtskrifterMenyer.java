package com.yajava.skidor;


public class UtskrifterMenyer {

	public static void startMenyn() {
		String startMenyn = "\n\t[1] Registrera ny åkare" + "\n\t[2] Visa aktuell startlista"
				+ "\n\t[3] Markera registreringstid som slut" + "\n\t[4] EXIT";
		System.out.println(startMenyn);
//		tempAkare = ValfranMeny.startMenynVal(s,tempAkare);
//		return tempAkare;
	}

	public static void forstaloppVal() {
		System.out.println("Välj typ av lopp");
		String startMenyn = "\n\t[1] Massstart" + "\n\t[2] Individuell start";
		System.out.println(startMenyn);
//		int loppVal = ValfranMeny.valFranLoppVal(s);
//		return loppVal;
	}

	public static void loppStart() {
		String meny3 = "\n\t[1] Visa Startlista med startnummer" + "\n\t[2] Starta loppet";
		System.out.println(meny3);
//		ValfranMeny.valFranLoppStart(s, tempAkare);
	}

	public static void Meny4() {

	}
}
