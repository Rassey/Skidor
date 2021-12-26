package com.yajava.app;

import java.util.ArrayList;
import java.util.List;
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
		
		Scanner sc = new Scanner(System.in);
		List<Akare> akarListan = new ArrayList<>();		// skapar List av Akare
		Startlista.initiateStartLista(akarListan);		// initiera akarListan
		
		PrintOut.welcome();
		StartMenyLogik.startMeny(akarListan, sc);		// kör startmenyn
		
		int lopp = LoppValLogik.forstaLopp(sc);
		StartNummerLotto.geStartNummer(akarListan);		// lottar ut startnummer

		MenyInnanStartLogik.innanstart(akarListan, sc);	// kör menyn innan start
		LoppLogik.startLopp(akarListan, lopp);	// starta loppet
		sc.close();
	}
}
