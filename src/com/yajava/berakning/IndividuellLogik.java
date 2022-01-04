package com.yajava.berakning;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.yajava.Data.AkarList;
import com.yajava.Data.SokAkare;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
/**
 * En klass för inviduellt lopp o dess logik för att genomföras
 * @author Anna
 *
 */
public class IndividuellLogik {


	// Logiken för Individuell lopp
	public static void loppStart(AkarList akarList, Scanner sc) {
		mellantid();									 			// simulera tävlingen 
		TidGenerator.generateMellanTid(akarList.getAkarLista());	// slumpa mellantiderna
		sc.nextLine();
		SokAkare.menySokAkare(akarList, sc, true);
		malgang();													// simulera tävlingen 
		TidGenerator.generateSlutTid(akarList.getAkarLista());		// slumpa sluttiderna
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
	
	// simulera tävlingen
	private static void mellantid() {
		OtherPrintOut.call("", true);
		OtherPrintOut.call("\tLoppet har startat ", false);
		OtherPrintOut.call("\n\tVi har en åkare som närmar sig den första mellantiden ", false);
	}
	
	// simulera tävlingen
	private static void malgang() {
		OtherPrintOut.call("\tÅkarna närmar sig mållinjen ", false);
		OtherPrintOut.call("\n\tDet är jämt men vem kommer vinna :o ", false);
		OtherPrintOut.call("", true);
		System.out.println();
	}

}
