package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.Individuell;

public class Lopp {
	public static void startLopp(Scanner s, Akare [] tempAkare, int loppVal) {
		switch (loppVal){
		case 1 ->{
			
		}
		case 2 ->{
			tempAkare = Individuell.individuellStartTest(tempAkare);
			PrintOut.visaStartListanTid(tempAkare);
		}
		case 3 ->{
			
		}
		}
	}
}
