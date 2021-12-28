package com.yajava.Utskrifter;

import java.util.Collections;
import java.util.List;
import com.yajava.Data.AkarList;
import com.yajava.akare.Akare;

public class PrintOut {
	
	static char ae = 228;
	
	// skriver ut äkarlistan
	public static void visaListan(List<Akare> akarListan) {
		
		Collections.sort(akarListan);
		OtherPrintOut.printHeader();
		akarListan.forEach(akara -> System.out.println(akara));
	}
	
	// skriver ut resultatet
	public static void visaResultatListan(AkarList akarList) {
		
		Collections.sort(akarList.getArakeLista());						// sortera enligt startnummer
		System.out.println("\nSorted acordning to start number"
						 + "\n---------------------------------------");
		OtherPrintOut.printHeader();
		visaListan(akarList.getArakeLista());							// skriver ut sorterad listan
		
		akarList.sortSlutTid(akarList.getArakeLista());					// sortera enligt sluttid
		System.out.println("\nSorterad efter sluttid"
						 + "\n----------------------");
		OtherPrintOut.printHeader();
		visaListan(akarList.getArakeLista());							// skriver ut sorterad listan
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

