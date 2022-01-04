package com.yajava.akare;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import com.yajava.berakning.TidRaknare;

/**
	 * Håller kolla på mellanTid, starttid, sluttid samt startnummer
	 * Stämpeldyan för åkare
	 */
public class Akare extends Person implements ToStringHantering{
	
	// konstruktör
	public Akare(String fNamn, String eNamn) {
		super(fNamn, eNamn);
		this.dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // få tid i form av HH:mm:ss
		this.startNr = 0;
	}
	
	
	// diffTidMedanLopp, diffTidEfterLopp används för att jämföra med en annan åkare
	// aktid är åkarens aktuell åktiden för att 
	private DateTimeFormatter dtf;
	private LocalTime mellanTid, startTid, slutTid, diffTidMedanLopp, diffTidEfterLopp, aktid;
	private int startNr;
	
	
	
	
	
	
	// Getter & Setters
	
	public LocalTime getMellanTid() {
		return mellanTid;
	}


	public void setMellanTid(LocalTime mellanTid) {
		this.mellanTid = mellanTid;
	}


	public LocalTime getStartTid() {
		return startTid;
	}


	public void setStartTid(LocalTime startTid) {
		this.startTid = startTid;
	}


	public LocalTime getSlutTid() {
		return slutTid;
	}


	public void setSlutTid(LocalTime slutTid) {
		this.slutTid = slutTid;
	}


	public LocalTime getDiffTidMedanLopp() {
		return diffTidMedanLopp;
	}


	public void setDiffTidMedanLopp(LocalTime diffTidMedanLopp) {
		this.diffTidMedanLopp = diffTidMedanLopp;
	}


	public LocalTime getDiffTidEfterLopp() {
		return diffTidEfterLopp;
	}


	public void setDiffTidEfterLopp(LocalTime diffTidEfterLopp) {
		this.diffTidEfterLopp = diffTidEfterLopp;
	}


	public LocalTime getAktid() {
		return TidRaknare.getTidSkillnad(this.startTid, this.slutTid);
	}


	public int getStartNr() {
		return startNr;
	}


	public void setStartNr(int startNr) {
		this.startNr = startNr;
	}


	
	
	
	/**
	 * formaterar LocalTime enligt dess värde
	 * @param LocalTime
	 * @return String
	 */
	private String formatTime(LocalTime time) {
		return time == null ? "--:--:--" : time.format(dtf);
	}


	
	
	
	/**
	 * formaterar namnsträngen enligt dess längd
	 * @param text
	 * @return
	 */
	private String formatName(String text) {
		return text.length() <= 7 ? text + "\t" : text;
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


	
	
	
	@Override
	public String toStringInnanLopp() {
		return (this.startNr == 0 ? "\t --" : "\t" + String.format("%02d", this.startNr) )
				+ "\t\t" + formatName(super.getfNamn()) 
				+ "\t\t" + formatName(super.geteNamn());
	}


	@Override
	public String toStringMedanLopp() {
		return String.format("%02d", this.startNr) 
				+ "\t\t" + formatName(super.getfNamn()) 
				+ "\t" + formatName(super.geteNamn()) 
				+ "\t" + formatTime(this.startTid) 
				+ "\t" + formatTime(this.getMellanTid())
				+ "\t" + formatTime(this.diffTidMedanLopp) + " +";
	}


	@Override
	public String toStringEfterLopp() {
		return String.format("%02d", this.startNr) 
				+ "\t\t" + formatName(super.getfNamn()) 
				+ "\t" + formatName(super.geteNamn()) 
				+ "\t" + formatTime(this.startTid) 
				+ "\t" + formatTime(this.getMellanTid())
				+ "\t" + formatTime(this.getSlutTid())
				+ "\t" + formatTime(this.getAktid())
				+ "\t" + formatTime(this.getDiffTidEfterLopp()) + " +";
	}


	@Override
	public String toStringEfterLoppNoDiff() {
		return String.format("%02d", this.startNr) 
				+ "\t\t" + formatName(super.getfNamn()) 
				+ "\t" + formatName(super.geteNamn()) 
				+ "\t" + formatTime(this.startTid) 
				+ "\t" + formatTime(this.getMellanTid())
				+ "\t" + formatTime(this.getSlutTid())
				+ "\t" + formatTime(this.getAktid());
	}
}

