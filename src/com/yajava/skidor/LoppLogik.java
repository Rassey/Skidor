package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.Individuell;
import com.yajava.berakning.IndividuellLogik;

public class LoppLogik {
	private Scanner sc;
	public LoppLogik(Scanner sc) {
		super();
		this.sc = sc;
	}
	private IndividuellLogik individLogik = new IndividuellLogik(sc);
	
	/**
	 * starta dom olika loppen
	 * @param tempAkare - array av aktuella åkare
	 * @param loppVal - vilket lopp som man har valt
	 * @return
	 */
	
	public Akare[] startLopp(Akare [] tempAkare, int loppVal) {
		
		switch (loppVal){
		case 1 ->{
			
		}
		case 2 ->{
			tempAkare = individLogik.startTider(tempAkare);
			tempAkare = individLogik.loppStart(tempAkare);

//			PrintOut.visaStartListanTid(tempAkare);
		}
		case 3 ->{
			
		}
		}
		return tempAkare;
	}

}
