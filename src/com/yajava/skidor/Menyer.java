package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.akare.Akare;


public class Menyer {
	public static Akare[] Meny1(Scanner s,Akare[] tempAkare) {
		String meny1 = "\n\t[1] Registrera ny åkare" + 
						"\n\t[2] Visa Startlistan" + 
						"\n\t[3] Alla åkare är registrerade" +
						"\n\t[4] EXIT";
		System.out.println(meny1);
		tempAkare = MenyerVal.Meny1(s,tempAkare);
		return tempAkare;
	}

	public static int Meny2(Scanner s) {
		String meny2 = "\n\t[1] Mass star" + 
						"\n\t[2] Individuel start" + 
						"\n\t[3] Jaktstart";
		System.out.println(meny2);
		int loppVal = MenyerVal.Meny2(s);
		return loppVal;
	}

	public static void Meny3(Scanner s,Akare[] tempAkare) {
		String meny3 = "\n\t[1] Visa Startlista" + 
				"\n\t[2] Starta loppet";
		System.out.println(meny3);
		MenyerVal.Meny3(s, tempAkare);
	}

	public static void Meny4() {

	}
}
