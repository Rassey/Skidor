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
		
		// lägg till lite dummy data
		akarList.getArakeLista().add(new Akare("Jack", "Nilsson"));
		akarList.getArakeLista().add(new Akare("Emil", "Lundqvist"));
		akarList.getArakeLista().add(new Akare("Nils", "Magnusson"));
		akarList.getArakeLista().add(new Akare("Björn", "Ojail"));
		akarList.getArakeLista().add(new Akare("Nicklas", "Rosenblad"));
		
		PrintOut.welcome();
		StartMenyLogik.startMeny(akarList.getArakeLista(), sc);				// kör startmenyn
		StartNummerLotto.geStartNummer(akarList.getArakeLista());			// lottar ut startnummer

		MenyInnanStartLogik.innanstart(akarList.getArakeLista(), sc);		// kör menyn innan start
		
		IndividuellLogik.generateStartTider(akarList.getArakeLista());		// få starttider
		IndividuellLogik.loppStart(akarList);								// starta loppet
		SokAkare.sokAkare(akarList.getArakeLista(), sc);
		sc.close();
	}
}