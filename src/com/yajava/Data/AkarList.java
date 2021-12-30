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
	
	private List<Akare> arakeLista;
	
	// konstruktör
	 public AkarList() {
		this.arakeLista = new ArrayList<>();
	}
	 
	 // getter
	public List<Akare> getArakeLista() {
		return arakeLista;
	}
	
	// sorterar enligt differenstid (interface: Sortering)
	@Override
	public void sortAktid(List<Akare> akarListan) {
		Collections.sort(akarListan, new Comparator<Akare>(){
            public int compare(Akare e1, Akare e2){
                return e1.getDiffTid().compareTo(e2.getDiffTid());
            }
        });
	}
/**
 * Skapar vi en ny typ av sortering
 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}