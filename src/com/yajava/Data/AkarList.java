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
public class AkarList implements Sorter{
	
	private List<Akare> arakeLista;
	
	// konstruktÃ¶r
	 public AkarList() {
		this.arakeLista = new ArrayList<>();
	}
	 
	 // getter
	public List<Akare> getArakeLista() {
		return arakeLista;
	}
	
	// sorterar enligt slutTid (interface: Sorter)
	@Override
	public void sortSlutTid(List<Akare> akarListan) {
		Collections.sort(akarListan, new Comparator<Akare>(){
            public int compare(Akare e1, Akare e2){
                return e1.getSlutTid().compareTo(e2.getSlutTid());
            }
        });
	}

}