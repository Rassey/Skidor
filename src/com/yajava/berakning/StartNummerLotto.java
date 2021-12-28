package com.yajava.berakning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.yajava.akare.Akare;

public class StartNummerLotto {
	
	// Lottar ut startnummer för åkarna
	public static void geStartNummer(List<Akare> akarListan) {
				
		Random rnd = new Random();
		List<Integer> startNumbers = new ArrayList<>();
		akarListan.forEach(x->startNumbers.add(rnd.nextInt(99) + 1));
		
		boolean isUnique = true;
		
		for( Integer x : startNumbers) {
			if(!isUnique(startNumbers, x)) isUnique = false;
		}
		
		while (!isUnique) {
			for( Integer x : startNumbers) {
				if(!isUnique(startNumbers, x)) {
					x = rnd.nextInt(99) + 1;
				}
			}
			for( Integer x : startNumbers) {
				if(!isUnique(startNumbers, x)) isUnique = false;
			}
		}
		
		for ( Akare akare : akarListan) {
			akare.setStartNr(startNumbers.get(  akarListan.indexOf(akare)  ) );
		}
	}
	
	private static boolean isUnique(List<Integer> list, int x) {
		
		long count = list.stream()
						 .filter(e -> e == x)
						 .count();
		
		return count <= 1;
	}
}
