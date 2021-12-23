package com.yajava.berakning;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import com.yajava.akare.Akare;
import com.yajava.input.InputSafety;

public class Mellantider {
	
	private Scanner sc = new Scanner(System.in);
	
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

	/**
	 * Klockar mellantider
	 * @param tempAkare - Array av åkarna som ändras och skickas tillbaka med ändringarna
	 * @return
	 */
	public Akare[] mellanTider(Akare[] tempAkare) {
		for (int i = 0; i < tempAkare.length; i++) {
			LocalTime tempTid = npcMellanTider();
			tempAkare[i].setMellanTid(tempTid);
		}
		return tempAkare;
	}
	
	/**
	 * Klockar slutiden
	 * @param tempAkare - Array av åkarna som ändras och skickas tillbaka med ändringarna
	 * @return
	 */
	public Akare[] slutTider(Akare[] tempAkare) {
		for (int i = 0; i < tempAkare.length; i++) {
			LocalTime tempTid = npcSlutTider();
				tempAkare[i].setSlutTid(tempTid);
		}
		return tempAkare;
	}
	
}
