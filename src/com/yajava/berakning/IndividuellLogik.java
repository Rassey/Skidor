package com.yajava.berakning;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.yajava.Data.AkarList;
import com.yajava.Data.SokAkare;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;

public class IndividuellLogik {
	
	static char ae = 228, ao = 229, o = 246, aO = 197;

	// Logiken för Individuell lopp
	public static void loppStart(AkarList akarList, Scanner sc) {
		mellantid();									 			// simulera tävlingen 
		TidGenerator.generateMellanTid(akarList.getArakeLista());	// slumpa mellantiderna
		sc.nextLine();
		sok(akarList, sc);
		malgang();													// simulera tävlingen 
		TidGenerator.generateSlutTid(akarList.getArakeLista());		// slumpa sluttiderna
		PrintOut.visaResultatListan(akarList); 						// skriv ut resultatet
	}

	// sätter starttiden för åkarna
	public static void generateStartTider(List<Akare> akarListan) {
		LocalTime startTime = LocalTime.of( 00, 00, 00 );
		for( Akare akare : akarListan) {
			akare.setStartTid(startTime);
			startTime = startTime.plusSeconds(30);
		}
	}
	
	private static void sok(AkarList akarList, Scanner sc) {
		
		System.out.println("Vill du söka en åkare? y/n");
		String svar = sc.nextLine();
		if ( svar.equalsIgnoreCase("y")) SokAkare.sokAkare(akarList.getArakeLista(), sc);		
	}
	
	// simulera tävlingen
	private static void mellantid() {
		OtherPrintOut.call("", true);
		OtherPrintOut.call("\tLoppet har startat ", false);
		OtherPrintOut.call("\n\tVi har en " + ao + "kare som n" + ae + "rmar sig f" + o + "rsta mellantiden ", false);
	}
	
	// simulera tävlingen
	private static void malgang() {
		OtherPrintOut.call("\t" + aO + "karna n" + ae + "rmar sig m" + ao + "llinjen ", false);
		OtherPrintOut.call("\n\tdet " + ae + "r j" + ae + "mt men vem kommer vinna ", false);
		OtherPrintOut.call("", true);
		System.out.println();
	}

}
