package com.yajava.berakning;

import java.time.LocalTime;
import java.util.List;
import com.yajava.Utskrifter.OtherPrintOut;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;

public class IndividuellLogik {
	
	static char ae = 228, ao = 229, o = 246, aO = 197;

	/**
	 * Logiken för Individuell lopp
	 * 
	 * @param akarListan - Array av dom aktuella åkarna
	 * @return
	 */
	public static void loppStart(List<Akare> akarListan) {
		mellantid();									 // meny för visa startlista innan mellantid (med sökning av åkare)
		TidGenerator.generateMellanTid(akarListan);
		malgang();										// meny visa aktuel placering i loppet / innan målgång (med sökning av åkare)
		TidGenerator.generateSlutTid(akarListan);
		PrintOut.visaResultatListan(akarListan); 		// meny efter loppet
	}

	/**
	 * sätter starttiden för åkarna i startnummer ordning
	 * 
	 * @param akarListan - Array av dom aktuella åkarna
	 * @return
	 */
	public static void generateStartTider(List<Akare> akarListan) {
		LocalTime startTime = LocalTime.of(0, 0, 0);
		for( Akare akare : akarListan) {
			akare.setStartTid(startTime);
			startTime = startTime.plusSeconds(30);
		}
	}

	private static void mellantid() {
		OtherPrintOut.call("", true);
		OtherPrintOut.call("\tLoppet har startat ", false);
		OtherPrintOut.call("\n\tVi har en " + ao + "kare som n" + ae + "rmar sig f" + o + "rsta mellantiden ", false);
	}

	private static void malgang() {
		OtherPrintOut.call("\t" + aO + "karna n" + ae + "rmar sig m" + ao + "llinjen ", false);
		OtherPrintOut.call("\n\tdet " + ae + "r j" + ae + "mt men vem kommer vinna ", false);
		OtherPrintOut.call("", true);
		System.out.println();
	}

}
