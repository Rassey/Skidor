package com.yajava.input;

import java.util.Arrays;
import java.util.Scanner;
import com.yajava.akare.Akare;

public class AddNyAkare {
	
	private Scanner sc;
	private Akare nyAkare;

	public AddNyAkare(Scanner sc) {
		this.sc = sc;
	}
	
	public Akare[] addNy(Akare[] startLista) {
		System.out.print("Ange förnamnet:");
		String fNamn = sc.next();
		System.out.print("Ange efternamnet:");
		String eNamn = sc.next();
		System.out.print("Ange tid:");
		double tid = inputSafety.inputDou(sc);
		System.out.println("Ange startnummer:");
		int startNummer = inputSafety.inputInt(sc);
		
		nyAkare = new Akare(fNamn, eNamn);
		
		Akare[] tempArray = Arrays.copyOf(startLista, startLista.length);
		startLista = Arrays.copyOf(tempArray, tempArray.length + 1);
		startLista[startLista.length - 1] = nyAkare;
		
		return startLista;
	}
}
