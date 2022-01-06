package com.yajava.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
import com.yajava.berakning.TidGenerator;
import com.yajava.berakning.TidRaknare;
import com.yajava.input.InputSafety;

/**
 * En klass som gör det möjligt att söka åkare via startnr och som sedan visar
 * ut aktuell tid.
 * 
 * @author Anna
 *
 */
public class SokAkare {

	/**
	 * Den här metoden skriver ut menyn för sokAkare
	 * 
	 * @param akarList
	 * @param sc
	 * @param medanLopp true om man söker åkare medan loppet är igång
	 */
	public static void menySokAkare(AkarList akarList, Scanner sc, boolean medanLopp) {

		boolean stopp = false;
		while (!stopp) {
			System.out.print("\n\tVill du söka efter en åkare? (y/n) ");
			String svar = sc.nextLine();
			if (svar.equalsIgnoreCase("y")) {
				sokAkare(akarList, sc, medanLopp);
				sc.nextLine();
			} else {
				stopp = true;
			}
		}
	}
	
	
	public static void manuelSetSluttid(AkarList akarList, Scanner sc) {
		
		boolean stopp = false;
		
		while (!stopp) {
			
			System.out.print("\n\tVill du sätta en måltid för en åkare? (y/n) ");
			String svar = sc.nextLine();
			
			if (svar.equalsIgnoreCase("y")) {
				
				int strNr = getStartNr(akarList, sc);
				
				for (Akare akare : akarList.getAkarLista()) {
					if (akare.getStartNr() == strNr) {
						akare.setSlutTid(TidGenerator.getRandomLocalTime(0,23,31));
						while (akare.getSlutTid().getMinute() < 20) {
							akare.setSlutTid(TidGenerator.getRandomLocalTime(0,23,31));
						}
						System.out.println("\tSluttid angiven");
					}
				}
				
				sc.nextLine();
			} else {
				stopp = true;
			}
		}
	}

	private static int getStartNr(AkarList akarList, Scanner sc) {
		
		System.out.print("\n\tSkriv ett startnummer: ");
		int strNr = InputSafety.inputInt(sc);
		boolean isInLista = finns(akarList, strNr);
		
		while (!isInLista) {
			
			System.out.print("\tFel startnummer, försök igen ");
			strNr = InputSafety.inputInt(sc);
			isInLista = finns(akarList, strNr);
		}
		return strNr;
	}
	
	private static boolean finns(AkarList akarList, int strNr) {
		return akarList.getAkarLista().stream().anyMatch( x -> x.getStartNr() == strNr);
	}

	private static void sokAkare(AkarList akarList, Scanner sc, boolean medanLopp) {

		System.out.println("\n\tSök åkare efter startnummer:");
		int sokStartNr = getStartNr(akarList, sc);

		AkarList tempAkarList = new AkarList();
		List<Integer> indexer = new ArrayList<>();

		if (medanLopp) {
			akarList.sortMellan();
			akarList.getAkarLista().get(0).setDiffTidMedanLopp(LocalTime.of(0, 0, 0));
			setDiffMedanLopp(akarList, tempAkarList, indexer, sokStartNr);
			PrintOut.visaListanMedanLopp(tempAkarList);
		} else {
			akarList.sortAktid();
			akarList.getAkarLista().get(0).setDiffTidEfterLopp(LocalTime.of(0, 0, 0));
			setDiffEfterLopp(akarList, tempAkarList, indexer, sokStartNr);
			PrintOut.visaSokEfterResultat(tempAkarList);
		}

	}

	private static void setDiffMedanLopp(AkarList akarList, AkarList tempAkarList, List<Integer> indexer, int o) {

		if (akarList.getAkarLista().get(0).getStartNr() == o) {
			tempAkarList.getAkarLista().add(akarList.getAkarLista().get(0));
		} else {

			for (int i = 0; i < akarList.getAkarLista().size(); i++) {
				indexer.add(i);
				if (akarList.getAkarLista().get(i).getStartNr() == o)
					break;
			}

			for (Integer k : indexer) {
				tempAkarList.getAkarLista().add(akarList.getAkarLista().get(k));
			}

			for (int j = 1; j < tempAkarList.getAkarLista().size(); j++) {
				tempAkarList.getAkarLista().get(j).setDiffTidMedanLopp(
						TidRaknare.getTidSkillnad(tempAkarList.getAkarLista().get(0).getMellanTid(),
								tempAkarList.getAkarLista().get(j).getMellanTid()));
			}
		}
	}

	private static void setDiffEfterLopp(AkarList akarList, AkarList tempAkarList, List<Integer> indexer, int o) {

		if (akarList.getAkarLista().get(0).getStartNr() == o) {
			tempAkarList.getAkarLista().add(akarList.getAkarLista().get(0));
		} else {

			for (int i = 0; i < akarList.getAkarLista().size(); i++) {
				indexer.add(i);
				if (akarList.getAkarLista().get(i).getStartNr() == o)
					break;
			}

			for (Integer k : indexer) {
				tempAkarList.getAkarLista().add(akarList.getAkarLista().get(k));
			}

			// if after loppet
			for (int j = 1; j < tempAkarList.getAkarLista().size(); j++) {
				tempAkarList.getAkarLista().get(j).setDiffTidEfterLopp(TidRaknare.getTidSkillnad(
						tempAkarList.getAkarLista().get(0).getAktid(), tempAkarList.getAkarLista().get(j).getAktid()));
			}
		}
	}
}
