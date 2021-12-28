package com.yajava.berakning;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import com.yajava.akare.Akare;

/**
 * Slumpar mellan / sluttiderna
 */
public class TidGenerator {
	
	public static void generateMellanTid(List<Akare> akarListan) {
		Random rnd = new Random();
		akarListan.forEach(akare -> akare.setMellanTid(LocalTime.of( 0, rnd.nextInt(59 - 21), rnd.nextInt(59) )));
	}
	public static void generateSlutTid(List<Akare> akarListan) {
		Random rnd = new Random();
		akarListan.forEach(akare -> akare.setSlutTid(LocalTime.of( 1, rnd.nextInt(59 - 21), rnd.nextInt(59) )));

	}
}
