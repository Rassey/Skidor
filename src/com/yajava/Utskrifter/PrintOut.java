package com.yajava.Utskrifter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yajava.akare.Akare;

public class PrintOut {
	
	static char ae = 228, ao = 229, o = 246;
	
	/**
	 * skriver ut startlista med startnummer 
	 * @param akareList - Array av aktuella åkare
	 */
	public static void visaStartListan(List<Akare> akarListan) {
		
		OtherPrintOut.printHeader();
		akarListan.forEach(akara -> System.out.println(akara));
	}
	
	/**
	 * skriver ut resultatet med all information
	 * @param resultatList - Array av aktuella åkare
	 */
	public static void visaResultatListan(List<Akare> akarListan) {
		System.out.println("\n\t\tSorted acordning to start number\n");
		OtherPrintOut.printHeader();
		Collections.sort(akarListan);
		akarListan.forEach(akara -> System.out.println(akara));
		
		printSortedSluttid(akarListan);  // sortera listan efter sluttiden
	}
	
	private static void printSortedSluttid(List<Akare> akarListan) {
		System.out.println("\n\tSorterad efter sluttis\n\t----------------------");
		OtherPrintOut.printHeader();
		
		Collections.sort(akarListan, new Comparator<Akare>(){
            public int compare(Akare e1, Akare e2){
                return e1.getSlutTid().compareTo(e2.getSlutTid());
            }
        });
		
		akarListan.forEach(x ->{
			if(akarListan.indexOf(x) == 0) System.out.println(x + " -> Vinnare");
			else System.out.println(x);
		});
	}
	
	public static void welcome() {
		
		String text = "V" +ae+ "lkommen till l" + ae + "ngdskidt" + ae + "vling";
		System.out.print("\n\t");
		for(int i = 0; i < text.length(); i++) {
			System.out.print(text.toCharArray()[i]);
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print('\t');
		for(int i = 0; i < text.length(); i++) {
			System.out.print('=');
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

