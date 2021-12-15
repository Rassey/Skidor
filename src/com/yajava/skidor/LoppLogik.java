package com.yajava.skidor;

import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.Individuell;

public class LoppLogik {
	private Scanner sc;
	public LoppLogik(Scanner sc) {
		super();
		this.sc = sc;
	}
	public Akare[] startLopp(Akare [] tempAkare, int loppVal) {
		
		switch (loppVal){
		case 1 ->{
			
		}
		case 2 ->{
			tempAkare = Individuell.individuellStartTest(tempAkare);
			PrintOut.visaStartListanTid(tempAkare);
		}
		case 3 ->{
			
		}
		}
		return tempAkare;
	}
}
