package com.yajava.akare;

public class Akare {
private String fNamn;
private String eNamn;
private double tid;
private int startNr;
public Akare(String fNamn, String eNamn, double tid, int startNr) {
	super();
	this.fNamn = fNamn;
	this.eNamn = eNamn;
	this.tid = tid;
	this.startNr = startNr;
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
}
