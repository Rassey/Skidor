package com.yajava.lopp;

import java.util.Scanner;

import com.yajava.Utskrifter.MenyerSkrivare;
import com.yajava.input.InputSafety;

public class LoppValLogik {

	/**
	 * menyn samt logik för loppval retuener en int
	 * @return
	 */
	public static int forstaLopp(Scanner sc) {

		MenyerSkrivare.forstaloppVal();
		int val = InputSafety.inputInt(sc);
		
		boolean condition = (val < 4 && val > 0) ? true : false;

		while (!condition) {
			System.out.println("mata bara in 1-2 tack!");
			sc.nextLine();
			val = InputSafety.inputInt(sc);
			condition = (val < 4 && val > 0) ? true : false;
		}
		
		if( val == 3) System.exit(0);
		
		String text = "";
		text = val == 1 ? "du har valt massstart" : "du har valt individuell start";
		System.out.println(text);

		return val;
	}
}
