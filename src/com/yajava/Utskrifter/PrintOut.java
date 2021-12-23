package com.yajava.Utskrifter;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import com.yajava.akare.Akare;

public class PrintOut {
	
	static char ae = 228;
	static char ao = 229;
	static char o = 246;
	
	/**
	 * skriver ut startlista med startnummer 
	 * @param akareList - Array av aktuella åkare
	 */
	public static void visaStartListan(Akare[] akareList) {
		
		System.out.println("StartNummer" + "\t" + "F" + o + "rnamn" + "\t\t" + "Efternamn");
		
		for(int j = 0; j < 42; j++) {
			System.out.print('=');
		}
		System.out.println();
		
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
		
		System.out.println("StartNummer" + "\t" + "F" + o + "rnamn" 
							+ "\t\t\t" + "Efternamn" + "\t\t" 
							+ "mellantid" + "\t\t" + "sluttid");
		
		for(int i = 0; i < 97; i++) {
			System.out.print('=');
		}
		System.out.println();
		
		Arrays.sort(resultatList);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		for (int i = 0; i < resultatList.length; i++) {
			String text = " " + resultatList[i].getStartNr()
						+ "\t\t" + okText(resultatList[i].getfNamn())
						+ "\t\t"+ okText(resultatList[i].geteNamn())
						+ "\t\t" + resultatList[i].getMellanTid().format(dtf)
						+ "\t\t" + resultatList[i].getSlutTid().format(dtf);
			System.out.println(text);
		}
	}
	
	// fixar utskrift av korta namn
	private static String okText(String text) {
		if(text.length() <= 7) text = text + "\t";
		return text;
	}
	
	public static void welcome() {
		
		String text = "V" +ae+ "lkommen till l" + ae + "ngdskidt" + ae + "vling";
		System.out.print("\n\t");
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.toCharArray()[i]);
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print('\t');
		for(int i = 0; i < text.length(); i++) {
			System.out.print('=');
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

