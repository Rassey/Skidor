package com.yajava.berakning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.yajava.akare.Akare;
/**
 * Lottar ut startnummer till alla �kare n�r registreringstiden är slut
 * @author Anna
 *
 */
public class StartNummerLotto {
	
	// Lottar ut startnummer för åkarna
	public static void geStartNummer(List<Akare> akarListan) {
				
		Random rnd = new Random();
		// skapa en temp lista med slumpade startnummer
		List<Integer> startNumbers = new ArrayList<>();
		akarListan.forEach(x->startNumbers.add(rnd.nextInt(99) + 1));
		
		boolean isUnique = true;
		
		// använd metoden isUnique för att kolla dubbla värden
		for( Integer x : startNumbers) {
			if(!isUnique(startNumbers, x)) isUnique = false;
		}
		
		// om ett startnummer är inte unikt slumpa det igen och sedan kolla igen
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
		
		// efter att templistan är färdig tilldela startnummerna till åkarlistas objekten
		for ( Akare akare : akarListan) {
			akare.setStartNr(startNumbers.get(  akarListan.indexOf(akare)  ) );
		}
	}
	
	// ett startnummer ska finnas bara en gång i listan
	private static boolean isUnique(List<Integer> list, int x) {
		
		long count = list.stream()
						 .filter(e -> e == x)
						 .count();
		
		return count <= 1;
	}
}
