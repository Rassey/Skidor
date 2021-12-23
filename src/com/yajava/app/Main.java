package com.yajava.app;

import java.util.Scanner;

import com.yajava.Data.Startlista;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.StartNummerLotto;
import com.yajava.lopp.LoppLogik;
import com.yajava.lopp.LoppValLogik;
import com.yajava.menyer.MenyInnanStartLogik;
import com.yajava.menyer.StartMenyLogik;

public class Main {

	public static void main(String[] args) {
		
		PrintOut.welcome();
		
		Scanner sc = new Scanner(System.in);
		
		Startlista startLista = new Startlista();
		StartMenyLogik startMeny = new StartMenyLogik(sc);

		Akare[] akarListan = startLista.getStartLista(); 			// skapar Array av Akare

		akarListan = startMeny.startMeny(akarListan); 				// kör startmenyn
		int lopp = LoppValLogik.forstaLopp(sc);

		akarListan = StartNummerLotto.geStartNummer(akarListan); 	// lottar ut startnummer

		MenyInnanStartLogik.innanstart(akarListan, sc); 	// kör menyn innan start
		LoppLogik.startLopp(akarListan, lopp); 			// starta loppet

		sc.close();
	}
}
