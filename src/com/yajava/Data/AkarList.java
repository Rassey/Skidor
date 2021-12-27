package com.yajava.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.yajava.akare.Akare;

public class AkarList implements Sorter{
	
	private List<Akare> arakeLista;
	
	 public AkarList() {
		this.arakeLista = new ArrayList<>();
	}

	public List<Akare> getArakeLista() {
		return arakeLista;
	}

	// Skapar åkare till startlistan
	public void laggTillDummyData(List<Akare> arakeLista) {
		arakeLista.add(new Akare("Jack", "Nilsson"));
		arakeLista.add(new Akare("Emil", "Lundqvist"));
		arakeLista.add(new Akare("Nils", "Magnusson"));
		arakeLista.add(new Akare("Björn", "Ojail"));
		arakeLista.add(new Akare("Nicklas", "Rosenblad"));
	}

	@Override
	public void sortSlutTid(List<Akare> akarListan) {
		Collections.sort(akarListan, new Comparator<Akare>(){
            public int compare(Akare e1, Akare e2){
                return e1.getSlutTid().compareTo(e2.getSlutTid());
            }
        });
	}
}








