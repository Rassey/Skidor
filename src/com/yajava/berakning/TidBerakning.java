package com.yajava.berakning;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

import com.yajava.akare.Akare;

public class TidBerakning {
	
	//getTiming
	
	public LocalTime getFinishTime(Akare akare) {
		// slumpa finish time
		LocalTime malTid = getRandomFinishTime();
		// kolla om finish time är lika med eller förr start time
		while (malTid.isBefore(akare.getStartTid()) || malTid.equals(akare.getStartTid())) {
			malTid = getRandomFinishTime();
		}
		return malTid;
	}
	
	
	private LocalTime getRandomFinishTime() {
		Random rnd = new Random();
		LocalTime outputTime = LocalTime.of( 0, rnd.nextInt(59 - 21), rnd.nextInt(59) );
		return outputTime;
	}
	
	/**
	 * duration : the duration between start and finish times
	 * @return - the method returns a LocalTime object
	 */
	public LocalTime calculateTiming(Akare akare) {
		Duration duration = Duration.between(akare.getStartTid(), akare.getSlutTid());
		int seconds = duration.toSecondsPart();
		int minutes = duration.toMinutesPart();
		int hours = duration.toHoursPart();
		
		return LocalTime.of(hours, minutes, seconds);
	}
}
