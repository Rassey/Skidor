package com.yajava.skidor;

import java.util.Arrays;
import java.util.Scanner;

import com.yajava.Data.Startlista;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.StartNummerLotto;
import com.yajava.input.AddNyAkare;
import com.yajava.input.HuvudMenyVal;

public class Logik {

	private Scanner sc = new Scanner(System.in);

	// skapa instanser av klasser
	private PrintOut print = new PrintOut();
	private HuvudMenyVal hMenyVal = new HuvudMenyVal(sc);
	private AddNyAkare addNyAkare = new AddNyAkare(sc);
	private Startlista startLista = new Startlista();
	private int loppVal;

	public void Start() {
		startLista.initiateStartLista();
		Akare[] startAkareListan = startLista.getStartLista();


		
		startAkareListan = UtskrifterMenyer.startMenyn(sc, startAkareListan); // går in i meny 1
		
		startAkareListan = StartNummerLotto.randomNummer(startAkareListan); // lottar fram start nummer
		Arrays.sort(startAkareListan);
		
		loppVal = UtskrifterMenyer.loppVal(sc); // går in i meny 2
		
		UtskrifterMenyer.loppStart(sc, startAkareListan); // går in i meny 3
		
		Lopp.startLopp(sc, startAkareListan, loppVal);

//		boolean exit = false; // används för att kolla om användaren vill avsluta
//		while (!exit) {
//
//			print.visaHuvudMeny(); // skriver ut menyn
//
//			switch (hMenyVal.val()) {
//			case 1 -> {
//				startLista.setStartLista(addNyAkare.addNy(startAkareListan)); // lägg till en åkare
//				startAkareListan = startLista.getStartLista(); // uppdatera startListan
//			}
//			case 2 -> print.visaStartListan(startAkareListan);
//			case 3 -> System.out.println("Här visar vi mellantider");
//			case 4 -> System.out.println("Här söker man åkaren");
//			case 5 -> System.out.println("Här söker man åkaren");
//			case 6 -> {
//				System.out.println("Hejdå");
//				exit = true;
//			}
//			case 7 -> {
//				startAkareListan = StartNummerLotto.randomNummer(startAkareListan);
//				for (int i = 0; i < startAkareListan.length; i++) {
//					System.out.println(startAkareListan[i].getStartNr());
//				}
//
//			}
//			}
//		}
		sc.close();
	}
}
