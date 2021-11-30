package com.yajava.akare;

public class Akare implements Comparable<Akare>{
	private String fNamn;
	private String eNamn;
	private double tid;
	private int startNr;

	public Akare(String fNamn, String eNamn, double tid, int startNr){
		super();
		this.fNamn = fNamn;
		this.eNamn = eNamn;
		this.tid = tid;
		this.startNr = startNr;
	}

	@Override
	public String toString() {
		return "Akare [fNamn=" + fNamn + ", eNamn=" + eNamn + ", tid=" + tid + ", startNr=" + startNr + "]";
	}

	public String getfNamn() {
		return fNamn;
	}

	public String geteNamn() {
		return eNamn;
	}

	public double getTid() {
		return tid;
	}

	public int getStartNr() {
		return startNr;
	}

	public void setStartNr(int startNr) {
		this.startNr = startNr;
	}

	@Override
	public int compareTo(Akare o) {
			
		return this.startNr - o.startNr;
	}
}
