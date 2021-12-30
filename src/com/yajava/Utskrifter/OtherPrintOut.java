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
	
	public static void printHeader() {
		System.out.println("StartNummer" 
							+ "\t" + "Förnamn" 
							+ "\t\t\t" + "Efternamn" 
							+ "\t\t" + "Starttid"
							+ "\t\t" +"mellantid" 
							+ "\t\t" + "sluttid");
		for(int i = 0; i < 120; i++) {
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
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(text.toCharArray()[j]);
			}

			for (int k = 0; k < 5; k++) {
				try {
					Thread.sleep(180);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(" ->");
			}
			System.out.println();
		}
	}
}
