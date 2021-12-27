package com.yajava.Utskrifter;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import com.yajava.akare.Akare;

public class PrintOut {

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
	 * skriver ut resultatet med all information
	 * @param resultatList - Array av aktuella åkare
	 */
	public static void visaResultatListan(Akare[] resultatList) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		Arrays.sort(resultatList);
		System.out.println("StartNummer" + "\t" + "Förnamn" + "\t\t" + "Efternamn" + "\t\t" + "mellantid" + "\t\t" + "sluttid");
		for(int i = 0; i < 89; i++) {
			System.out.print('=');
		}
		System.out.println();
		for (int i = 0; i < resultatList.length; i++) {
			
			String text = " " + resultatList[i].getStartNr()
					+ "\t\t" + resultatList[i].getfNamn()
					+ "\t\t"+ resultatList[i].geteNamn()
					+ "\t\t" + resultatList[i].getMellanTid().format(dtf)
					+ "\t\t" + resultatList[i].getSlutTid().format(dtf);
			System.out.println(text);
		}
	}
}
