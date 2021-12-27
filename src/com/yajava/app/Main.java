package com.yajava.app;

import java.util.Scanner;
import com.yajava.Data.AkarList;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.berakning.StartNummerLotto;
import com.yajava.lopp.LoppLogik;
import com.yajava.lopp.LoppValLogik;
import com.yajava.menyer.MenyInnanStartLogik;
import com.yajava.menyer.StartMenyLogik;

public class Main {

	public static void main(String[] args) {
		
		AkarList akarList = new AkarList();
		Scanner sc = new Scanner(System.in);
		akarList.laggTillDummyData(akarList.getArakeLista());					// initiera akarListan
		
		PrintOut.welcome();
		StartMenyLogik.startMeny(akarList.getArakeLista(), sc);				// kör startmenyn
		
		int lopp = LoppValLogik.forstaLopp(sc);
		StartNummerLotto.geStartNummer(akarList.getArakeLista());				// lottar ut startnummer

		MenyInnanStartLogik.innanstart(akarList.getArakeLista(), sc);			// kör menyn innan start
		LoppLogik.startLopp(akarList.getArakeLista(), lopp, akarList);			// starta loppet
		sc.close();
	}
}
