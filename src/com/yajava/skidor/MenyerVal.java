package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class MenyerVal {
	public static Akare[] Meny1(Scanner s,Akare[] tempAkare) {
		int temp;
		boolean condition = true;
		boolean regKlar = true;
		do {
			do {
				temp = InputSafety.inputInt(s);
				if (temp <= 4 && temp > 0) {
					condition = true;
				} else {
					System.out.println("mata bara in 1 - 4 tack!");
					condition = false;
					s.nextLine();
				}
			} while (!condition);
			tempAkare = MenyerSwitchcases.Meny1(s, tempAkare, temp);
			if(temp == 3) {
				regKlar = false;
			}
		} while (regKlar);
		return tempAkare;
	}

	public static int Meny2(Scanner s) {
		int temp;
		boolean condition = true;
		do {
			temp = InputSafety.inputInt(s);
			if (temp < 3 && temp > 0) {
				condition = true;
			} else {
				System.out.println("mata bara in 1-3 tack!");
				condition = false;
				s.nextLine();
			}
		} while (!condition);
		return temp;
	}

	public static void Meny3(Scanner s,Akare[] tempAkare) {
		int temp;
		boolean condition = true;
		do {
			temp = InputSafety.inputInt(s);
			if (temp < 2 && temp > 0) {
				condition = true;
			}else {
				System.out.println("mata bara in 1-2 tack!");
				condition = false;
				s.nextLine();
			}
			if (temp == 2) {
				condition = false;
			}
		} while (!condition);
		MenyerSwitchcases.meny3(s, tempAkare, temp);
	}

	public static void Meny4() {

	}
}
