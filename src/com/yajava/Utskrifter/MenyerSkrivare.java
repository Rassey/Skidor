package com.yajava.Utskrifter;
/**
 * Class för menyhantering
 * @author Anna
 *
 */
public class MenyerSkrivare {
	
	static String menyText;
	
	public static void startMenyn() {
		
		menyText = "\n\t[1] Registrera ny åkare" 
					+ "\n\t[2] Visa aktuell startlista"
					+ "\n\t[3] Markera registreringstid som slut" 
					+ "\n\t[4] Avsluta programmet";
		
		System.out.println(menyText);
	}

	public static void loppStart() {
		
		menyText = "\n\t[1] Visa Startlista med startnummer" 
					+ "\n\t[2] Starta loppet" 
					+ "\n\t[3] Avsluta programmet";
		
		System.out.println(menyText);
	}
}