package com.yajava.berakning;

import java.time.LocalTime;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;

public class IndividuellLogik {
	
	static char ae = 228;
	static char ao = 229;
	static char o = 246;
	static char aO = 197;
	
	private Mellantider mellantid = new Mellantider();

	/**
	 * Logiken för Individuell lopp
	 * 
	 * @param akarListan - Array av dom aktuella åkarna
	 * @return
	 */
	public void loppStart(Akare[] akarListan) {

		mellantid();									 // meny för visa startlista innan mellantid (med sökning av åkare)
		akarListan = mellantid.mellanTider(akarListan);

		malgang(); 										// meny visa aktuel placering i loppet / innan målgång (med sökning av åkare)
		akarListan = mellantid.slutTider(akarListan);

		PrintOut.visaResultatListan(akarListan); 		// meny efter loppet
	}

	/**
	 * sätter starttiden för åkarna i startnummer ordning
	 * 
	 * @param akarListan - Array av dom aktuella åkarna
	 * @return
	 */
	public Akare[] startTider(Akare[] akarListan) {

		LocalTime startTime = LocalTime.of(0, 0, 0);

		for (int i = 0; i < akarListan.length; i++) {
			if (i == 0) {
				akarListan[i].setStartTid(startTime);
			} else {
				startTime = startTime.plusSeconds(30);
				akarListan[i].setStartTid(startTime);
			}
		}
		return akarListan;
	}

	public void mellantid() {
		call("", true);
		call("\tLoppet har startat ", false);
		call("\n\tVi har en " + ao + "kare som n" + ae + "rmar sig f" + o + "rsta mellantiden ", false);
	}

	public void malgang() {

		call("\t" + aO + "karna n" + ae + "rmar sig m" + ao + "llinjen ", false);
		call("\n\tdet " + ae + "r j" + ae + "mt men vem kommer vinna ", false);
		call("", true);
		System.out.println();
	}

	// skriver ut loppets gång i en spännande ordning
	private void call(String text, boolean separator) {
		if (separator) {
			System.out.print("\t");
			for (int i = 0; i < 70; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print('-');
			}
			System.out.println();
		} else {
			// System.out.print(text);

			for (int j = 0; j < text.toCharArray().length; j++) {
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(text.toCharArray()[j]);
			}

			for (int k = 0; k < 5; k++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(" ->");
			}
			System.out.println();
		}
	}
}
