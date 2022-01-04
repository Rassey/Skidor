package com.yajava.Utskrifter;
/**
 * Class för övriga texter som skrivs ut
 * @author Anna
 *
 */
public class OtherPrintOut {
	
	
	public static void printRegistrerade() {
		System.out.println("\tAlla åkare är registrerade, gör er redo för start");
	}
	
	public static void printNyAkareRegged() {
		System.out.println("\n\tEn ny åkare är nu registrerad.");
		System.out.println("\t``````````````````````````````");
	}
	
	
	public static void printHeaderInnanLopp() {
		
		System.out.println("\n\tStartnummer" 
				+ "\t" + "Förnamn" 
				+ "\t\t\t" + "Efternamn");
		System.out.print("\t");
		for(int i = 0; i < 50; i++) {
			System.out.print('=');
		}
		System.out.println();
	}
	
	public static void printHeaderMedanLopp() {
		System.out.println("\n\nStartnummer" 
						 + "\t" + "Förnamn" 
						 + "\t\t" + "Efternamn"
						 + "\t" + "Starttid"
						 + "\t" + "Mellantid"
						 + "\t" + "Differens tid");
		
		for(int i = 0; i < 93; i++) {
			System.out.print('=');
		}
		System.out.println();
	}

	public static void printResultHeader() {
		System.out.println("Startnummer" 
						 + "\t" + "Förnamn" 
						 + "\t\t" + "Efternamn" 
						 + "\t" + "Starttid" 
						 + "\t" + "Mellantid" 
						 + "\t" + "Sluttid" 
						 + "\t\t" + "Åktid" 
						 + "\t" + "Differens tid");

		for (int i = 0; i < 126; i++) {
			System.out.print('=');
		}
		System.out.println();
	}
	public static void printResultHeaderNoDiff() {
		System.out.println("Startnummer" 
				+ "\t" + "Förnamn" 
				+ "\t\t" + "Efternamn" 
				+ "\t" + "Starttid" 
				+ "\t" + "Mellantid" 
				+ "\t" + "Sluttid" 
				+ "\t\t" + "Åktid");
		
		for (int i = 0; i < 105; i++) {
			System.out.print('=');
		}
		System.out.println();
	}
	
	
	
	// skriver ut loppets gång i en spännande ordning
	public static void call(String text, boolean separator) {
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

			for (int j = 0; j < text.toCharArray().length; j++) {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(text.toCharArray()[j]);
			}

			for (int k = 0; k < 5; k++) {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(" ->");
			}
			System.out.println();
		}
	}
}
