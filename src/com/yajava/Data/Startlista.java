package com.yajava.Data;

import com.yajava.akare.Akare;

public class Startlista {

	private Akare[] startLista = new Akare[5];

	public void initiateStartLista() {
		startLista[0] = new Akare("Jack", "Nilsson", 2.1, 1);
		startLista[1] = new Akare("Emil", "Lundqvist", 1.2, 2);
		startLista[2] = new Akare("Nils", "Magnusson", 3.2, 3);
		startLista[3] = new Akare("Björn", "Ojail", 8.2, 4);
		startLista[4] = new Akare("Nicklas", "Rosenblad", 4.2, 5);
	}

	public Akare[] getStartLista() {
		return startLista;
	}

	public void setStartLista(Akare[] startLista) {
		this.startLista = startLista;
	}
}
