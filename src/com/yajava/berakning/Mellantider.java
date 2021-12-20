package com.yajava.berakning;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class Mellantider {
	private Scanner sc = new Scanner(System.in);
//	private Scanner sc;
//	
//	public Mellantider(Scanner sc) {
//		super();
//		this.sc = sc;
//	}
	private LocalTime npcMellanTider() {
		Random rnd = new Random();
		LocalTime outputTime = LocalTime.of( 0, rnd.nextInt(59 - 21), rnd.nextInt(59) );
		return outputTime;
	}
	private LocalTime npcSlutTider() {
		Random rnd = new Random();
		LocalTime outputTime = LocalTime.of( 1, rnd.nextInt(59 - 21), rnd.nextInt(59) );
		return outputTime;
	}
	public Akare[] mellanTider(Akare[] tempAkare) {
		for (int i = 0; i < tempAkare.length; i++) {
			if (tempAkare[i].isNpc() == true) {
				LocalTime tempTid = npcMellanTider();
				tempAkare[i].setMellanTid(tempTid);
			}else {
				System.out.println("Skriv in minuterna för mellantiden");
				int tempMin = InputSafety.inputInt(sc);
				System.out.println("Skriv in sekunderna för mellantiden");
				int tempSek = InputSafety.inputInt(sc);
				LocalTime tempTid = LocalTime.of(0, tempMin,tempSek);
				tempAkare[i].setMellanTid(tempTid);
			}
		}
		return tempAkare;
	}
	public Akare[] slutTider(Akare[] tempAkare) {
		for (int i = 0; i < tempAkare.length; i++) {
			if (tempAkare[i].isNpc() == true) {
				LocalTime tempTid = npcSlutTider();
				tempAkare[i].setSlutTid(tempTid);
			}else {
				System.out.println("skriv in timmarna för sluttiden");
				int tempTim = InputSafety.inputInt(sc);
				System.out.println("Skriv in minuterna för sluttiden");
				int tempMin = InputSafety.inputInt(sc);
				System.out.println("Skriv in sekunderna för sluttiden");
				int tempSek = InputSafety.inputInt(sc);
				LocalTime tempTid = LocalTime.of(tempTim, tempMin,tempSek);
				tempAkare[i].setSlutTid(tempTid);
			}
		}
		return tempAkare;
	}
}
