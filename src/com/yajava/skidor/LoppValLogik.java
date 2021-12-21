package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.input.InputSafety;

public class LoppValLogik {
	private Scanner sc;
	private int val;

	public LoppValLogik(Scanner sc) {
		super();
		this.sc = sc;
	}
	
	/**
	 * menyn samt logik för loppval
	 * retuener en int
	 * @return
	 */
	
	public int forstaLopp() {
		UtskrifterMenyer.forstaloppVal();
		boolean condition = true;
		do {
			val = InputSafety.inputInt(sc);
			if (val < 3 && val > 0) {
				condition = true;
			} else {
				System.out.println("mata bara in 1-2 tack!");
				condition = false;
				sc.nextLine();
			}
		} while (!condition);
		switch (val) {
		case 1 -> {
			System.out.println("du har valt massstart");
		}
		case 2 -> {
			System.out.println("du har valt individuell start");
		}
		}
		return val;
	}
}
