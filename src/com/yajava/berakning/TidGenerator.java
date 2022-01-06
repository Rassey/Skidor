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
	 * Räknar ut mellantiden beroende på starttiden 
	 * @param akarListan
	 */
	public static void generateMellanTid(List<Akare> akarListan) {
		
		LocalTime tempTid = null;
		LocalTime mellanTid = null; 
		
		for ( Akare akare : akarListan) {
			
			tempTid = getRandomLocalTime(0,5,27);
			
			mellanTid = adderaTider(tempTid, akare.getStartTid());
			while(mellanTid.getMinute()<2) {
				tempTid = getRandomLocalTime(0,5,27);
				mellanTid = adderaTider(tempTid, akare.getStartTid());
			}
			akare.setMellanTid(mellanTid);
		}
		
	}
	/**
	 * Räknar ut sluttiden
	 * @param akarListan
	 */
	public static void generateSlutTid(List<Akare> akarListan) {
		
		LocalTime tempTid = null;
		LocalTime slutTid = null; 
		
		for ( Akare akare : akarListan) {
			
			tempTid = getRandomLocalTime(0,23,31);
			
			slutTid = adderaTider(tempTid, akare.getMellanTid());
			while(slutTid.getMinute()<20) {
				tempTid = getRandomLocalTime(0,23,31);
				slutTid = adderaTider(tempTid, akare.getMellanTid());
			}
			akare.setSlutTid(slutTid);
		}
	}
	/**
	 * För felaktig inmatning samt kontroll för vilka tider som kan finnas
	 * @param hours
	 * @return
	 */
	public static LocalTime getRandomLocalTime(int hours, int min, int sec) {
		Random rnd = new Random();
		if (hours > 24 || min >60 || sec > 60) {
			min= 5;
			sec=58;
			hours = 0;
		}
		return LocalTime.of( rnd.nextInt(hours + 1), rnd.nextInt(min+1), rnd.nextInt(sec+1));
	}
	/**
	 * För att beräkna summan av två tider
	 * @param target
	 * @param amountToAdd
	 * @return
	 */
	private static LocalTime adderaTider(LocalTime target, LocalTime amountToAdd) {

		target = target.plusSeconds(amountToAdd.getSecond());
		target = target.plusMinutes(amountToAdd.getMinute());
		target = target.plusHours(amountToAdd.getHour());
		return target;
	}
}




