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
				System.out.println("fel inmatning");
				condition = false;
				sc.nextLine();
			} 
		} while (!condition);
		return i;
	}
	/**
	 * felhantering vid dubble inmatning
	 * @param sc - Scanner
	 * @return
	 */
	public static double inputDou(Scanner sc) {
		double i = 0;
		boolean condition = true;
		do {
			try {
				i = sc.nextDouble();
				condition = true;
			} catch (Exception e) {
				System.out.println("fel inmatning");
				condition = false;
				sc.nextLine();
			} 
		} while (!condition);
		return i;
	}
}
