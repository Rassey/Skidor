package com.yajava.Data;

import java.util.List;
import com.yajava.akare.Akare;

public class Startlista {
	
	 // Skapar åkare till startlistan
	public static void initiateStartLista(List<Akare> arakeLista) {
		arakeLista.add(new Akare("Jack", "Nilsson"));
		arakeLista.add(new Akare("Emil", "Lundqvist"));
		arakeLista.add(new Akare("Nils", "Magnusson"));
		arakeLista.add(new Akare("Björn", "Ojail"));
		arakeLista.add(new Akare("Nicklas", "Rosenblad"));
	}
}
