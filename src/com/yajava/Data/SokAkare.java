package com.yajava.Data;

import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;
/**
 * En klass som gör det möjligt att söka åkare via startnr och som sedan visar ut aktuell tid. 
 * @author Anna
 *
 */
public class SokAkare {
	public static void sokAkare(List<Akare> arakeLista, Scanner sc ) {
		
		System.out.println("\n\tVill du sÃ¶ka en Ã¥kare? y/n");
		String svar = sc.nextLine();
		if ( !svar.equalsIgnoreCase("y")) return;
		
		System.out.println("\n\tSÃ¶k Ã¥kare efter startnummer:");
		System.out.print("\tSkriv ett startnummer ");
		int sokStartNr = InputSafety.inputInt(sc);
		boolean isInLista = false;
		
		for ( Akare akare : arakeLista) {
			if ( akare.getStartNr() == sokStartNr ) isInLista = true;
		}
		
		while ( !isInLista) {
			System.out.println("\tFel startnummer fÃ¶rsÃ¶k igen ");
			sokStartNr = InputSafety.inputInt(sc);
			
			for ( Akare akare : arakeLista) {
				if ( akare.getStartNr() == sokStartNr ) isInLista = true;
			}
		}
		
		final int o = sokStartNr;
		OtherPrintOut.printHeader();
		arakeLista.stream()
					.filter( x -> x.getStartNr() == o)
					.forEach(System.out::println);
		System.out.println();
	}
}
