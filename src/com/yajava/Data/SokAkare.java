package com.yajava.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.yajava.Utskrifter.PrintOut;
import com.yajava.akare.Akare;
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
			System.out.println("\n\tVill du söka efter en åkare? (y/n)");
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
			System.out.println("\n\tVill du sätta en måltid för en åkare? (y/n)");
			String svar = sc.nextLine();
			if (svar.equalsIgnoreCase("y")) {
				System.out.println("\n\tSkriv ut startnummer: ");
				int str = InputSafety.inputInt(sc);
				boolean isInLista = false;

				for (Akare akare : akarList.getAkarLista()) {
					if (akare.getStartNr() == str)
						isInLista = true;
				}
				while (!isInLista) {
					System.out.println("\tFel startnummer, försök igen ");
					str = InputSafety.inputInt(sc);

					for (Akare xakare : akarList.getAkarLista()) {
						if (xakare.getStartNr() == str)
							isInLista = true;
					}
				}
				for (Akare xakare : akarList.getAkarLista()) {
					if (xakare.getStartNr() == str) {
						xakare.setSlutTid(LocalTime.now());
						System.out.println("\tSluttid angiven");
					}
				}
				stopp = false;
				sc.nextLine();
			} else {
				stopp = true;
			}
		}
	}

	private static void sokAkare(AkarList akarList, Scanner sc, boolean medanLopp) {

		System.out.println("\n\tSök åkare efter startnummer:");
		System.out.print("\tSkriv ett startnummer ");
		int sokStartNr = InputSafety.inputInt(sc);
		boolean isInLista = false;

		for (Akare akare : akarList.getAkarLista()) {
			if (akare.getStartNr() == sokStartNr)
				isInLista = true;
		}

		while (!isInLista) {
			System.out.println("\tFel startnummer, försök igen ");
			sokStartNr = InputSafety.inputInt(sc);

			for (Akare akare : akarList.getAkarLista()) {
				if (akare.getStartNr() == sokStartNr)
					isInLista = true;
			}
		}

		final int o = sokStartNr;

		AkarList tempAkarList = new AkarList();
		List<Integer> indexer = new ArrayList<>();

		if (medanLopp) {
			akarList.sortMellan();
			akarList.getAkarLista().get(0).setDiffTidMedanLopp(LocalTime.of(0, 0, 0));
			setDiffMedanLopp(akarList, tempAkarList, indexer, o);
			PrintOut.visaListanMedanLopp(tempAkarList);
		} else {
			akarList.sortAktid();
			akarList.getAkarLista().get(0).setDiffTidEfterLopp(LocalTime.of(0, 0, 0));
			setDiffEfterLopp(akarList, tempAkarList, indexer, o);
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
