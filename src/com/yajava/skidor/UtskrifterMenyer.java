package com.yajava.skidor;


public class UtskrifterMenyer {

	public static void startMenyn() {
		String startMenyn = "\n\t[1] Registrera ny åkare" + "\n\t[2] Visa aktuell startlista"
				+ "\n\t[3] Markera registreringstid som slut" + "\n\t[4] EXIT";
		System.out.println(startMenyn);
	}

	public static void forstaloppVal() {
		System.out.println("Välj typ av lopp");
		String startMenyn = "\n\t[1] Massstart" + "\n\t[2] Individuell start";
		System.out.println(startMenyn);
	}

	public static void loppStart() {
		String meny3 = "\n\t[1] Visa Startlista med startnummer" + "\n\t[2] Starta loppet";
		System.out.println(meny3);
	}

	public static void Meny4() {

	}
}
