package com.yajava.Utskrifter;

import java.time.LocalTime;

import com.yajava.Data.AkarList;
import com.yajava.akare.Akare;
import com.yajava.berakning.TidRaknare;
/**
 * Class som innehåller texter som spelas upp under loppets gång
 * @author Anna poff
 *
 */
public class PrintOut {
	
	
	public static void visaListanInnanLopp(AkarList akarList) {
		
		OtherPrintOut.printHeaderInnanLopp();
		akarList.sortStartNr();
		akarList.getAkarLista().forEach(akare -> System.out.println(akare.toStringInnanLopp()));
		System.out.println();
	}
	
	public static void visaListanMedanLopp(AkarList akarList) {
		OtherPrintOut.printHeaderMedanLopp();
		akarList.sortMellan();
		akarList.getAkarLista().forEach(akare -> System.out.println(akare.toStringMedanLopp()));
	}
	
	
	// skriver ut resultatet
	public static void visaResultatListan(AkarList akarList) {
		
		System.out.println("\n");
		akarList.sortStartNr();												// sortera enligt startnummer
		System.out.println("\nSorterar efter startnummer"
						 + "\n---------------------------------------");
		OtherPrintOut.printResultHeaderNoDiff();
		
		akarList.getAkarLista().forEach( akare -> System.out.println( akare.toStringEfterLoppNoDiff() ) );
		System.out.println("\n");
		
		akarList.sortAktid();												// sortera enligt åktiden
		
		for ( Akare akare : akarList.getAkarLista()) {
			if ( akarList.getAkarLista().get(0) == akare ){
				akare.setDiffTidEfterLopp(LocalTime.of(0, 0, 0));
			}else {
				akare.setDiffTidEfterLopp(TidRaknare.getTidSkillnad(akarList.getAkarLista().get(0).getAktid(), akare.getAktid()));
			}
		}
		
		System.out.println("\nSorterad efter åktiden"
						 + "\n----------------------");
		OtherPrintOut.printResultHeader();
		akarList.getAkarLista().forEach( akare -> System.out.println( akare.toStringEfterLopp() ) );
	}
	
	public static void visaSokEfterResultat(AkarList akarList) {
		
		System.out.println("\n");
		
		for ( Akare akare : akarList.getAkarLista()) {
			if ( akarList.getAkarLista().get(0) == akare ){
				akare.setDiffTidEfterLopp(LocalTime.of(0, 0, 0));
			}else {
				akare.setDiffTidEfterLopp(TidRaknare.getTidSkillnad(akarList.getAkarLista().get(0).getAktid(), akare.getAktid()));
			}
		}
		
		System.out.println("\nSorterad efter åktiden"
				+ "\n----------------------");
		OtherPrintOut.printResultHeader();
		akarList.getAkarLista().forEach( akare -> System.out.println( akare.toStringEfterLopp() ) );
	}
	
	public static void welcome() {
		
		String text = "Välkommen till längdskidtävling";
		System.out.print("\n\t");
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.toCharArray()[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print('\t');
		for(int i = 0; i < text.length(); i++) {
			System.out.print('=');
			try {
				Thread.sleep(90);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	/**
	 * För programavslut
	 */
	public static void goodbye() {
		
		String text = "Programmet avslutas ";
		System.out.print("\n\t");
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.toCharArray()[i]);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < text.length(); i++) {
			System.out.print('.');
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

