package com.yajava.berakning;

import java.time.Duration;
import java.time.LocalTime;

public class TidRaknare {
	
	public static LocalTime getTidSkillnad(LocalTime time1, LocalTime time2) {
		Duration duration = Duration.between(time1, time2);
		int hours = duration.toHoursPart();
		int minutes = duration.toMinutesPart();
		int seconds = duration.toSecondsPart();
		return LocalTime.of(hours, minutes,seconds);
	}
}
