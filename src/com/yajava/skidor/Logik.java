package com.yajava.skidor;

import java.util.Scanner;
import com.yajava.Data.Startlista;
import com.yajava.akare.Akare;
import com.yajava.berakning.StartNummerLotto;

public class Logik {

	private Scanner sc = new Scanner(System.in);

	// skapa instanser av klasser
	private Startlista startLista = new Startlista();
	private int lopp;
	private StartMenyLogik startMeny = new StartMenyLogik(sc);
	private LoppValLogik loppVal = new LoppValLogik(sc);
	private MenyInnanStartLogik menyVidStart = new MenyInnanStartLogik(sc);
	private LoppLogik loppStart = new LoppLogik(sc);
	private StartNummerLotto startNummerLotoo = new StartNummerLotto();

	/**
	 * körning av programet
	 */
	
	public void Start() {
		startLista.initiateStartLista();
		// skapar Array av Akare
		Akare[] startAkareListan = startLista.getStartLista();
		
		// kör startmenyn
		startAkareListan = startMeny.startMeny(startAkareListan);
		lopp = loppVal.forstaLopp();
		// lottar ut startnummer
		startAkareListan = startNummerLotoo.geStartNummer(startAkareListan);
		// sortera åkarna eftter startnummer
		//Arrays.sort(startAkareListan);
		// kör menyn innan start
		menyVidStart.innanstart(startAkareListan);
		// starta loppet
		loppStart.startLopp(startAkareListan, lopp);
		sc.close();
	}
}
