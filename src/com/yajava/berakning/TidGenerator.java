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
		
		LocalTime tempTid = null;
		LocalTime mellanTid = null; 
		
		for ( Akare akare : akarListan) {
			
			tempTid = getRandomLocalTime(0);
			mellanTid = adderaTider(akare.getStartTid(), tempTid);
			akare.setMellanTid(mellanTid);
		}
		
	}
	public static void generateSlutTid(List<Akare> akarListan) {
		
		LocalTime tempTid = null;
		LocalTime slutTid = null; 
		
		for ( Akare akare : akarListan) {
			
			tempTid = getRandomLocalTime(1);
			slutTid = adderaTider(akare.getMellanTid(), tempTid);
			akare.setSlutTid(slutTid);
		}
	}
	
	public static LocalTime getRandomLocalTime(int hours) {
		Random rnd = new Random();
		if (hours > 24) {
			System.out.println("Det finns bara 24 timmar om dygnet!!!");
			hours = 24;
		}
		return LocalTime.of( rnd.nextInt(hours + 1), rnd.nextInt(60), rnd.nextInt(60));
	}
	
	private static LocalTime adderaTider(LocalTime target, LocalTime amountToAdd) {

		target = target.plusSeconds(amountToAdd.getSecond());
		target = target.plusMinutes(amountToAdd.getMinute());
		target = target.plusHours(amountToAdd.getHour());
		return target;
	}
}




