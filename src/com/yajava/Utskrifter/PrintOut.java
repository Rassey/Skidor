package com.yajava.Utskrifter;

import java.util.Collections;
import java.util.List;
import com.yajava.Data.AkarList;
import com.yajava.akare.Akare;
/**
 * Class som innehåller texter som spelas upp under loppets gång
 * @author Anna poff
 *
 */
public class PrintOut {
	
	
	// skriver ut åkarlistan
	public static void visaListan(List<Akare> akarListan) {
		
		OtherPrintOut.printHeader();
		akarListan.forEach(akare -> System.out.println(akare));
	}
	
	// skriver ut resultatet
	public static void visaResultatListan(AkarList akarList) {
		
		Collections.sort(akarList.getAkarLista());						// sortera enligt startnummer
		System.out.println("\nSorterar efter startnummer"
						 + "\n---------------------------------------");
		visaListan(akarList.getAkarLista());							// skriver ut sorterad listan
		
		akarList.sortAktid(akarList.getAkarLista());					// sortera enligt sluttid
		System.out.println("\nSorterad efter sluttid"
						 + "\n----------------------");
		visaListan(akarList.getAkarLista());							// skriver ut sorterad listan
	}
	
	public static void welcome() {
		
		String text = "Välkommen till längdskidtävling";
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

