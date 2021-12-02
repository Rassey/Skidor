package com.yajava.akare;

import java.time.LocalTime;

public class Akare extends Person implements Comparable<Akare>{
	
	private LocalTime tid;
	private LocalTime startTid;
	private LocalTime slutTid;
	private int startNr;

	public Akare(String fNamn, String eNamn) {
		super(fNamn, eNamn);
	}

	@Override
	public String toString() {
		return "Akare [fNamn=" + super.getfNamn() + ", eNamn=" + super.geteNamn() + ", tid=" + tid + ", startNr=" + startNr + "]";
	}

	public LocalTime getTid() {
		return tid;
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

	public void setTid(LocalTime tid) {
		this.tid = tid;
	}

	@Override
	public int compareTo(Akare o) {
			
		return this.startNr - o.startNr;
	}
}
