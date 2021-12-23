package com.yajava.Utskrifter;

public class MenyerSkrivare {
	
	static char ae = 228, ao = 229;
	static String menyText;
	
	public static void startMenyn() {
		menyText = "\n\t[1] Registrera ny " + ao + "kare" 
					+ "\n\t[2] Visa aktuell startlista"
					+ "\n\t[3] Markera registreringstid som slut" 
					+ "\n\t[4] Avsluta programmet";
		
		System.out.println(menyText);
	}

	public static void forstaloppVal() {
		
		menyText = "\n\t[1] Massstart" 
					+ "\n\t[2] Individuell start" 
					+ "\n\t[3] Avsluta programmet";
		
		System.out.println("V" + ae + "lj typ av lopp");
		System.out.println(menyText);
	}

	public static void loppStart() {
		
		menyText = "\n\t[1] Visa Startlista med startnummer" 
					+ "\n\t[2] Starta loppet" 
					+ "\n\t[3] Avsluta programmet";
		
		System.out.println(menyText);
	}
}