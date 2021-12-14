package com.yajava.skidor;

import java.util.Arrays;
import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;

public class MenyLogik {
	private Scanner s;

	public MenyLogik(Scanner s) {
		super();
		this.s = s;
	}
	public Akare[] startMeny(Akare[] tempAkare, int tempInt) {
		
		switch (tempInt) {
		case 1 ->{
			System.out.print("Ange förnamnet:");
			String fNamn = s.next();
			System.out.print("Ange efternamnet:");
			String eNamn = s.next();
			Akare nyAkare = new Akare(fNamn, eNamn);
			
			Akare[] tempArray = Arrays.copyOf(tempAkare, tempAkare.length);
			tempAkare = Arrays.copyOf(tempArray, tempArray.length + 1);
			tempAkare[tempAkare.length - 1] = nyAkare;
		}
		case 2->{
			PrintOut.visaStartListan(tempAkare);
		}
		case 3->{
			System.out.println("Alla åkare är registrerade, gör er redo för start");
		}
		case 4->{
			System.out.println("Hejdå");
			System.exit(0);
		}
		}
		return tempAkare;
	}

}
