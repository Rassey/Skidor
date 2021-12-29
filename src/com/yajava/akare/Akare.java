package com.yajava.akare;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
	 * Håller kolla på mellanTid, starttid, sluttid samt startnummer
	 * Stämpeldyan för åkare
	 */
public class Akare extends Person implements Comparable<Akare>{
	
	// konstruktör
	public Akare(String fNamn, String eNamn) {
		super(fNamn, eNamn);
		this.dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // få tid i form av HH:mm:ss
	}
	
	private DateTimeFormatter dtf;
	private LocalTime mellanTid, startTid, slutTid;
	private int startNr;
	
	@Override
	public String toString() {
		
		return ((this.startNr == 0) ? " --" : " " + String.format("%02d", this.startNr)) 
				+ "\t\t" + getFormatedName(super.getfNamn()) 
				+ "\t\t" + getFormatedName(super.geteNamn()) 
				+ "\t\t" + getFormatedTime(this.startTid) 
				+ "\t\t" + getFormatedTime(this.mellanTid)
				+ "\t\t" + getFormatedTime(this.slutTid);
	}
	
	
	/**
	 * formaterar Local str�ngen enligt dess v�rde
	 * @param time
	 * @return
	 */
	private String getFormatedTime(LocalTime time) {
		return time == null ? "--:--:--" : time.format(dtf);
	}
	
	
	/**
	 * formaterar namnstr�ngen enligt dess l�ngd
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


	@Override
	public int hashCode() {
		return Objects.hash(this.slutTid, this.startNr);
	}

	@Override
	/**
	 * j�mf�r objekt med varandra
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Akare other = (Akare) obj;
		return Objects.equals(this.slutTid, other.slutTid) && this.startNr == other.startNr;
	}
	
	// j�mf�r startnummer
	@Override
	public int compareTo(Akare o) {
		if(this.startNr == o.startNr) {
			return 0;
		}else if (this.startNr > o.startNr) {
			return 1;
		}else {
			return -1;
		}
	}
}

