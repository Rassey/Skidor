package com.yajava.Data;

import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class SokAkare {
	public static void sokAkare(List<Akare> arakeLista, Scanner sc ) {
		
		System.out.println("\nSök åkare efter startnummer:");
		System.out.print("Skriv ett startnummer ");
		int sokStartNr = InputSafety.inputInt(sc);
		boolean isInLista = false;
		
		for ( Akare akare : arakeLista) {
			if ( akare.getStartNr() == sokStartNr ) isInLista = true;
		}
		
		while ( !isInLista) {
			System.out.println("Fel startnummer försök igen ");
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
	}
}
