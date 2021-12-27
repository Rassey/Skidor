package com.yajava.Data;

import com.yajava.akare.Akare;

public class Startlista {

	private Akare[] startLista = new Akare[5];
	
	/**
	 * Skapar NonPlayerCaracter åkare till startlistan
	 */
	
	public void initiateStartLista() {
		startLista[0] = new Akare("Jack", "Nilsson\t");
		startLista[1] = new Akare("Emil", "Lundqvist");
		startLista[2] = new Akare("Nils", "Magnusson");
		startLista[3] = new Akare("Björn", "Ojail\t");
		startLista[4] = new Akare("Nicklas", "Rosenblad");
	}

	public Akare[] getStartLista() {
		return startLista;
	}
}
