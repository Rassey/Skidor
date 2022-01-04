package com.yajava.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.yajava.akare.Akare;
/**
 * Skapar åkarlistan, samt gör en sortering av deras sluttider
 * @author Anna
 *
 */
public class AkarList implements Sortering{

	private List<Akare> akarLista;

	// konstruktör
	 public AkarList() {
		this.akarLista = new ArrayList<>();
	}

	 // getter
	public List<Akare> getAkarLista() {
		return akarLista;
	}

	@Override
	public void sortAktid() {
		Collections.sort(this.akarLista, new Comparator<Akare>(){
            @Override
			public int compare(Akare e1, Akare e2){
                return e1.getAktid().compareTo(e2.getAktid());
            }
        });
	}

	@Override
	public void sortMellan() {
		Collections.sort(this.akarLista, new Comparator<Akare>(){
            @Override
			public int compare(Akare e1, Akare e2){
                return e1.getMellanTid().compareTo(e2.getMellanTid());
            }
        });
	}

	@Override
	public void sortStartNr() {
		Collections.sort(this.akarLista, new Comparator<Akare>(){
            @Override
			public int compare(Akare e1, Akare e2){
            	if(e1.getStartNr() == e2.getStartNr()) return 0;
            	return e1.getStartNr() > e2.getStartNr() ? 1 : -1;
            }
        });
	}
}

