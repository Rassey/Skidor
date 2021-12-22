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
		System.out.println();
		call("", true);
		call("\tLoppet har startat ",false);
		call("\n\tVi har en åkare som närmar sig första mellantiden ",false);
	}
	public void malgang() {
		
		call("\tÅkarna närmar sig mållinjen ",false);
		call("\n\tdet är jämt men vem kommer vinna ",false);
		call("", true);
		System.out.println();
	}
	
	/**
	 * skriver ut loppets gång i en spännande ordning
	 * @param text - text som matas in i call metoden
	 * @throws InterruptedException 
	 */
	private void call(String text, boolean separator) {
		if (separator) {
			System.out.print("\t");
			for(int i = 0; i < 70; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print('-');
			}
			System.out.println();
		} else {
			//System.out.print(text);
			
			for(int i = 0; i<text.toCharArray().length;i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(text.toCharArray()[i]);
			}
			
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print(" ->");
			}
			System.out.println();
		}
	}
}
