package com.yajava.akare;

import java.time.LocalTime;

public class Akare extends Person implements Comparable<Akare>{
	/**
	 * Håller kolla på mellanTid, starttid, sluttid samt startnummer
	 * Stämpeldyan för åkare
	 * 
	 */

	private LocalTime mellanTid;
	private LocalTime startTid;
	private LocalTime slutTid;
	private int startNr;
	// Npc = NonPlayerCaracter
	private boolean npc;

	public boolean isNpc() {
		return npc;
	}

	public void setNpc(boolean npc) {
		this.npc = npc;
	}

	public Akare(String fNamn, String eNamn, boolean npc) {
		super(fNamn, eNamn);
		this.npc = npc;
	}

	@Override
	public String toString() {
		return "Akare [fNamn=" + super.getfNamn() + ", eNamn=" + super.geteNamn() + ", tid=" + mellanTid + ", startNr=" + startNr + "]";
	}

	public LocalTime getMellanTid() {
		return mellanTid;
	}

	public int getStartNr() {
		return startNr;
	}

	public void setStartNr(int startNr) {
		this.startNr = startNr;
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

	public void setMellanTid(LocalTime tid) {
		this.mellanTid = tid;
	}

	@Override
	public int compareTo(Akare o) {
			
		return this.startNr - o.startNr;
	}
}
