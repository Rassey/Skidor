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
	/**
	 * En char för ascii när man skriver ut text ??
	 */
	static char ae = 228, ao = 229, o = 246, aO = 197;

	// Logiken fÃ¶r Individuell lopp
	public static void loppStart(AkarList akarList, Scanner sc) {
		mellantid();									 			// simulera tÃ¤vlingen 
		TidGenerator.generateMellanTid(akarList.getArakeLista());	// slumpa mellantiderna
		sc.nextLine();
		SokAkare.sokAkare(akarList.getArakeLista(), sc);
		malgang();													// simulera tÃ¤vlingen 
		TidGenerator.generateSlutTid(akarList.getArakeLista());		// slumpa sluttiderna
		PrintOut.visaResultatListan(akarList); 						// skriv ut resultatet
	}

	// sÃ¤tter starttiden fÃ¶r Ã¥karna
	public static void generateStartTider(List<Akare> akarListan) {
		LocalTime startTime = LocalTime.of( 00, 00, 00 );
		for( Akare akare : akarListan) {
			akare.setStartTid(startTime);
			startTime = startTime.plusSeconds(30);
		}
	}
	
	// simulera tÃ¤vlingen
	private static void mellantid() {
		OtherPrintOut.call("", true);
		OtherPrintOut.call("\tLoppet har startat ", false);
		OtherPrintOut.call("\n\tVi har en " + ao + "kare som n" + ae + "rmar sig f" + o + "rsta mellantiden ", false);
	}
	
	// simulera tÃ¤vlingen
	private static void malgang() {
		OtherPrintOut.call("\t" + aO + "karna n" + ae + "rmar sig m" + ao + "llinjen ", false);
		OtherPrintOut.call("\n\tdet " + ae + "r j" + ae + "mt men vem kommer vinna ", false);
		OtherPrintOut.call("", true);
		System.out.println();
	}

}
