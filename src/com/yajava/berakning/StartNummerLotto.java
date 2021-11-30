package com.yajava.berakning;

import java.util.Random;

import com.yajava.akare.Akare;

public class StartNummerLotto {
public static Akare[] randomNummer(Akare[] startNrLottning) {
	Random rand = new Random();
	int temp = -10;
	for (int i = 0; i < startNrLottning.length; i++) {
		boolean condition = true;
		do {
			temp = rand.nextInt(99) + 1;
			for (int j = 0; j < startNrLottning.length; j++) {
				if (temp != startNrLottning[j].getStartNr()) {
					condition = true;
				} else {
					condition = false;
				} 
			}
		} while (!condition);
		startNrLottning[i].setStartNr(temp);
	}
	return startNrLottning;
}
}
