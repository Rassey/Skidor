package com.yajava.input;

import java.util.Scanner;

public class InputSafety {
	/**
	 * felhantering vid int inmatning
	 * @param sc - Scanner
	 * @return
	 */
	public static int inputInt(Scanner sc) {
		int i = 0;
		boolean condition = true;
		do {
			try {
				i = sc.nextInt();
				condition = true;
			} catch (Exception e) {
				System.out.print("\tFel inmatning, försök igen: ");
				condition = false;
				sc.nextLine();
			} 
		} while (!condition);
		return i;
	}
}
