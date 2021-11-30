package com.yajava.input;

import java.util.Scanner;

public class inputSafety {
	public static int inputInt(Scanner s) {
		int i = 0;
		boolean condition = true;
		do {
			try {
				i = s.nextInt();
				condition = true;
			} catch (Exception e) {
				System.out.println("fel inmatning");
				condition = false;
				s.nextLine();
			} 
		} while (!condition);
		return i;
	}
	public static double inputDou(Scanner s) {
		double i = 0;
		boolean condition = true;
		do {
			try {
				i = s.nextDouble();
				condition = true;
			} catch (Exception e) {
				System.out.println("fel inmatning");
				condition = false;
				s.nextLine();
			} 
		} while (!condition);
		return i;
	}
}
