package com.yajava.Utskrifter;

public class OtherPrintOut {
	
	static char ae = 228, ao = 229, o = 246;
	
	public static void printRegistrerade() {
		System.out.println("Alla " + ao + "kare " + ae 
						 + "r registrerade, g" + o + "r er redo f" 
						 + o + "r start\n");
	}
	
	public static void printNyAkareRegged() {
		System.out.println("\n\tEn ny " + ao + "kare " + ae + "r nu registrerad.");
		System.out.println("\t``````````````````````````````");
	}
	
	public static void printHeader() {
		System.out.println("StartNummer" 
							+ "\t" + "F" + o + "rnamn" 
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
			// System.out.print(text);

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
