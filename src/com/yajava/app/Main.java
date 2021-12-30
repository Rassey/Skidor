package com.yajava.app;

import java.util.Scanner;
import com.yajava.Data.AkarList;
import com.yajava.Data.SokAkare;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.IndividuellLogik;
import com.yajava.berakning.StartNummerLotto;
import com.yajava.menyer.MenyInnanStartLogik;
import com.yajava.menyer.StartMenyLogik;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AkarList akarList = new AkarList();									// skapa instans
		
		// lägg till nagra akare i programmet som alltid finns
		akarList.getAkarLista().add(new Akare("Jack", "Nilsson"));
		akarList.getAkarLista().add(new Akare("Emil", "Lundqvist"));
		akarList.getAkarLista().add(new Akare("Nils", "Magnusson"));
		akarList.getAkarLista().add(new Akare("Björn", "Ojail"));
		akarList.getAkarLista().add(new Akare("Nicklas", "Rosenblad"));
		
		PrintOut.welcome();
		StartMenyLogik.startMeny(akarList.getAkarLista(), sc);				// kör startmenyn
		StartNummerLotto.geStartNummer(akarList.getAkarLista());			// lottar ut startnummer

		MenyInnanStartLogik.innanstart(akarList.getAkarLista(), sc);		// kör menyn innan start
		
		IndividuellLogik.generateStartTider(akarList.getAkarLista());		// få starttider
		IndividuellLogik.loppStart(akarList, sc);								// starta loppet
		SokAkare.menySokAkare(akarList.getAkarLista(), sc);
		sc.close();
	}
}