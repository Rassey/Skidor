package com.yajava.Utskrifter;

import java.util.Arrays;

import com.yajava.akare.Akare;

public class PrintOut {

	public void visaHuvudMeny() {
		String text = "\n\t[1] Registrera ny åkare"
					+ "\n\t[2] Visa Startlistan"
					+ "\n\t[3] Visa Resultatlistan"
					+ "\n\t[4] Skriv ut mellantider"
					+ "\n\t[5] Sokakare"
					+ "\n\t[6] Avsluta"
					+ "\n\t[7] test kör efter meny 1 är klar"
					+ "\nDitt val:";
		System.out.println(text);
	}
	/**
	 * skriver ut startlista med startnummer 
	 * @param akareList - Array av aktuella åkare
	 */
	public static void visaStartListan(Akare[] akareList) {
		// ett förslag (temp för att se hur det kan se ut)
		System.out.println("Här kan vi skriva ut startlistan");
		System.out.println("StartNummer" + "\t" + "Förnamn" + "\t\t" + "Efternamn");
		for(int i = 0; i < akareList.length; i++) {
			String text = akareList[i].getStartNr() 
						+ "\t\t" + akareList[i].getfNamn() 
						+ "\t\t" + akareList[i].geteNamn();
			System.out.println(text);
		}
	}
	/**
	 * skriver ut startlista med tid
	 * @param akareList - Array av aktuella åkare
	 */
	public static void visaStartListanTid(Akare[] akareList) {
		// ett förslag (temp för att se hur det kan se ut)
		System.out.println("Här kan vi skriva ut startlistan");
		System.out.println("StartNummer" + "\t" + "Förnamn" + "\t\t" + "Efternamn" + "\t\t" + "Tid");
		for(int i = 0; i < akareList.length; i++) {
			String text = akareList[i].getStartNr() 
						+ "\t\t" + akareList[i].getfNamn() 
						+ "\t\t" + akareList[i].geteNamn()
						+ "\t\t" + akareList[i].getStartTid();
			System.out.println(text);
		}
	}
	/**
	 * skriver ut resultatet med all information
	 * @param resultatList - Array av aktuella åkare
	 */
	public static void visaResultatListan(Akare[] resultatList) {
		Arrays.sort(resultatList);
		System.out.println("StartNummer" + "\t" + "Förnamn" + "\t\t" + "Efternamn" + "\t\t" + "mellantid" + "\t\t" + "sluttid");
		for (int i = 0; i < resultatList.length; i++) {
			String text = resultatList[i].getStartNr()
					+ "\t\t" + resultatList[i].getfNamn()
					+ "\t\t"+ resultatList[i].geteNamn()
					+ "\t\t" + resultatList[i].getMellanTid()
					+ "\t\t" + resultatList[i].getSlutTid();
			System.out.println(text);
		}
	}
	
	public void visaMellanTider() {
		System.out.println("Skriv ut mellan tider");
	}
}
