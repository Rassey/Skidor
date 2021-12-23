package com.yajava.akare;

import java.time.LocalTime;
import java.util.Objects;

/**
	 * Håller kolla på mellanTid, starttid, sluttid samt startnummer
	 * Stämpeldyan för åkare
	 */
public class Akare extends Person implements Comparable<Akare>{

	public Akare(String fNamn, String eNamn) {
		super(fNamn, eNamn);
	}
	
	private LocalTime mellanTid;
	private LocalTime startTid;
	private LocalTime slutTid;
	private int startNr;

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
	public int hashCode() {
		return Objects.hash(slutTid, startNr);
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
		return Objects.equals(slutTid, other.slutTid) && startNr == other.startNr;
	}

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















