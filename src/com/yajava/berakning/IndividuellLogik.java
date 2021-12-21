package com.yajava.berakning;

import java.time.LocalTime;
import java.util.Scanner;

import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;

public class IndividuellLogik {
	private Scanner sc;
	public IndividuellLogik(Scanner sc) {
		super();
		this.sc = sc;
	}
	private Mellantider mellantid = new Mellantider();
	/**
	 * Logiken för Individuell lopp
	 * @param tempAkare - Array av dom aktuella åkarna 
	 * @return
	 */
	public Akare[] loppStart(Akare[] tempAkare) {
		// meny för visa startlista innan mellantid (med sökning av åkare)
		mellantid();
		tempAkare = mellantid.mellanTider(tempAkare);
		// meny visa aktuel placering i loppet / innan målgång (med sökning av åkare)
		malgang();
		tempAkare = mellantid.slutTider(tempAkare);
		// meny efter loppet
		PrintOut.visaResultatListan(tempAkare);
		return tempAkare;
	}
	/**
	 * sätter starttiden för åkarna i startnummer ordning
	 * @param tempAkare - Array av dom aktuella åkarna
	 * @return
	 */
	public Akare[] startTider(Akare[] tempAkare) {
		LocalTime startTime = LocalTime.of(0, 0, 0);
		for(int i = 0 ; i < tempAkare.length; i++) {
			if (i == 0) {
				tempAkare[i].setStartTid(startTime);
			}else {
				startTime = startTime.plusSeconds(30);
				tempAkare[i].setStartTid(startTime);
			}
		}
		return tempAkare;
	}
	public void mellantid() {
		call("Loppet har startat");
		call("Vi har en �kare som n�rmar sig f�rsta mellantiden");
		
	}
	public void malgang() {
		
		call("Åkarna n�rmar sig m�llinjen");
		call("det är jämt men vem kommer vinna");
		
	}
	
	/**
	 * skriver ut loppets gång i en spännande ordning
	 * @param text - text som matas in i call metoden
	 */
	private void call(String text) {
		System.out.println();
		StringBuilder sb = new StringBuilder();
		System.out.print(text);
		for(int i = 0; i < 4 ; i++) {
			sb.append('-');
			System.out.print(sb);
			try {
				Thread.sleep(600);
			} catch (Exception e) {
			}
		}
		System.out.println("\n");
	}
}
