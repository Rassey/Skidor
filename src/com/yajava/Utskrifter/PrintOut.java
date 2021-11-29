package com.yajava.Utskrifter;

import com.yajava.akare.Akare;

public class PrintOut {

	public void visaHuvudMeny() {
		String text = "\n\t[1] Visa Startlistan"
					+ "\n\t[2] Visa Resultatlistan"
					+ "\n\t[3] Skriv ut mellantider"
					+ "\n\t[4] Sokakare"
					+ "\n\t[5] Avsluta"
					+ "\nDitt val:";
		System.out.println(text);
	}
	
	public void visaStartListan(Akare[] akareList) {
		// ett förslag (temp för att se hur det kan se ut)
		System.out.println("Här kan vi skriva ut startlistan");
		System.out.println("StartNummer" + "\t" + "Förnamn Efternamn" + "\tTid");
		for(int i = 0; i < akareList.length; i++) {
			String text = akareList[i].getStartNr() 
						+ "\t\t" + akareList[i].getfNamn() 
						+ "\t" + akareList[i].geteNamn() 
						+ "\t\t" + akareList[i].getTid();
			System.out.println(text);
		}
	}
	
	public void visaResultatListan(Akare[] resultatList) {
		for(int i = 0; i < resultatList.length; i++) {
			System.out.println("Här kan vi skriva ut resultatlistan");
		}
	}
	
	public void visaMellanTider() {
		System.out.println("Skriv ut mellan tider");
	}
}
