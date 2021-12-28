package com.yajava.akare;

public abstract class Person {
	
	private String fNamn, eNamn;
	
	public Person(String fNamn, String eNamn) {
		super();
		this.fNamn = fNamn;
		this.eNamn = eNamn;
	}

	public String getfNamn() {
		return fNamn;
	}

	public String geteNamn() {
		return eNamn;
	}
}
