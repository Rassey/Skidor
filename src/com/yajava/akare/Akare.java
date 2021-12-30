package com.yajava.akare;

import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.time.Duration;

/**
	 * Håller kolla på mellanTid, starttid, sluttid samt startnummer
	 * Stämpeldyan för åkare
	 */
public class Akare extends Person implements Comparable <Akare>{
	
	// konstruktör
	public Akare(String fNamn, String eNamn) {
		super(fNamn, eNamn);
		this.dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // få tid i form av HH:mm:ss
		
		this.diffTid = calculateDiff();
		
	}
	
	private DateTimeFormatter dtf;
	private LocalTime mellanTid, startTid, slutTid, diffTid;
	private int startNr;
	
	@Override
	public String toString() {
		
		return ((this.startNr == 0) ? " --" : " " + String.format("%02d", this.startNr)) 
				+ "\t\t" + getFormatedName(super.getfNamn()) 
				+ "\t\t" + getFormatedName(super.geteNamn()) 
				+ "\t\t" + getFormatedTime(this.startTid) 
				+ "\t\t" + getFormatedTime(this.mellanTid)
				+ "\t\t" + getFormatedTime(this.slutTid)
				+ "\t\t" + getFormatedTime(calculateDiff());
	}
	
	
	/**
	 * formaterar LocalTime enligt dess värde
	 * @param LocalTime
	 * @return String
	 */
	private String getFormatedTime(LocalTime time) {
		return time == null ? "--:--:--" : time.format(dtf);
	}


	/**
	 * formaterar namnsträngen enligt dess längd
	 * @param text
	 * @return
	 */
	private String getFormatedName(String text) {
		return text.length() <= 7 ? text + "\t" : text;
	}

	public LocalTime getMellanTid() {
		return this.mellanTid;
	}

	public int getStartNr() {
		return this.startNr;
	}

	public void setStartNr(int startNr) {
		this.startNr = startNr;
	}

	public LocalTime getStartTid() {
		return this.startTid;
	}

	public void setStartTid(LocalTime startTid) {
		this.startTid = startTid;
	}

	public LocalTime getSlutTid() {
		return this.slutTid;
	}

	public void setSlutTid(LocalTime slutTid) {
		this.slutTid = slutTid;
	}

	public void setMellanTid(LocalTime tid) {
		this.mellanTid = tid;
	}
	
	public LocalTime getDiffTid() {
		return calculateDiff();
	}
	
	/**
	 * Denna metod r�knar ut åktiden
	 * @return LocalTime
	 */
	private LocalTime calculateDiff() {
		if(this.startTid==null || this.slutTid==null) {
			return null;
		} else {
			LocalTime tempTid=null;
			Duration x=Duration.between(startTid, slutTid);
			tempTid=LocalTime.of(x.toHoursPart(), x.toMinutesPart(), x.toSecondsPart());
			return tempTid;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(startNr);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Akare other = (Akare) obj;
		return startNr == other.startNr;
	}

	/**
	 * Anv�nder compareTo interfacet för att jämföra startnummer
	 * @param o
	 * @return int
	 */
	@Override
	public int compareTo(Akare o) {
		if(this.startNr == o.startNr) return 0;
		return (this.startNr > o.startNr)? 1: -1;
	}
}

