package com.yajava.Data;

import com.yajava.akare.Akare;

public class Startlista {

	private Akare[] startLista = new Akare[5];

	public void initiateStartLista() {
		startLista[0] = new Akare("Jack", "Nilsson", 2.1, 0);
		startLista[1] = new Akare("Emil", "Lundqvist", 1.2, 0);
		startLista[2] = new Akare("Nils", "Magnusson", 3.2, 0);
		startLista[3] = new Akare("Björn", "Ojail", 8.2, 0);
		startLista[4] = new Akare("Nicklas", "Rosenblad", 4.2, 0);
	}

	public Akare[] getStartLista() {
		return startLista;
	}

	public void setStartLista(Akare[] startLista) {
		this.startLista = startLista;
	}
}
