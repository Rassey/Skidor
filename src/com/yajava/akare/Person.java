package com.yajava.akare;

public class Person {
	/**
	 * håller koll på förnamn samt efternamn
	 */
	private String fNamn;
	private String eNamn;
	
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
