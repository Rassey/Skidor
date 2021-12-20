package com.yajava.Data;

import com.yajava.akare.Akare;

public class Startlista {

	private Akare[] startLista = new Akare[5];

	public void initiateStartLista() {
		startLista[0] = new Akare("Jack", "Nilsson", true);
		startLista[1] = new Akare("Emil", "Lundqvist", true);
		startLista[2] = new Akare("Nils", "Magnusson", true);
		startLista[3] = new Akare("Björn", "Ojail", true);
		startLista[4] = new Akare("Nicklas", "Rosenblad", true);
	}

	public Akare[] getStartLista() {
		return startLista;
	}

	public void setStartLista(Akare[] startLista) {
		this.startLista = startLista;
	}
}
