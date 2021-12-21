package com.yajava.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HuvudMenyVal {
	/**
	 * används inte för tillfället - gammal kod
	 * @param sc
	 */

	public HuvudMenyVal(Scanner sc) {
		super();
		this.sc = sc;
	}

	private Scanner sc;

	public int val() {
		return getVal();
	}

	// här kollar vi om valet är giltigt
	private int getVal() {

		int output = -1;
		boolean valid = false;

		while (!valid) {
			try {
				output = sc.nextInt();
				valid = isValid(output);
			} catch (InputMismatchException e) {
				sc.next();
			}
			if (!valid)
				System.out.println("Ogiltigt val försök igen: (1-6)");
		}

		return output;
	}

	// valet ska vara mellan 1 och 7
	private boolean isValid(int val) {
		return (val > 0 && val < 8);
	}
}
