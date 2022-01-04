package com.yajava.berakning;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import com.yajava.akare.Akare;

/**
 * Slumpar mellan / sluttiderna
 */
public class TidGenerator {
	
	/**
	 * Räknar ut mellantiden beroende på starttiden (mellantid - starttid = ny mellantid)
	 * @param akarListan
	 */
	public static void generateMellanTid(List<Akare> akarListan) {
		Random rnd = new Random();
		LocalTime tempTid = LocalTime.of( 0, rnd.nextInt(15 + 15), rnd.nextInt(59));
		akarListan.forEach(akare -> {
			akare.setMellanTid(TidRaknare.getTidSkillnad(akare.getStartTid(), tempTid));
		
		}); 
	}
	public static void generateSlutTid(List<Akare> akarListan) {
		Random rnd = new Random();
		akarListan.forEach(akare -> akare.setSlutTid(LocalTime.of( 1, rnd.nextInt(59 - 21), rnd.nextInt(59) )));

	}
}
