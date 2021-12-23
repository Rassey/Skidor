package com.yajava.lopp;

import com.yajava.akare.Akare;
import com.yajava.berakning.IndividuellLogik;

public class LoppLogik {

	/**
	 * starta dom olika loppen
	 * 
	 * @param akarListan - array av aktuella åkare
	 * @param loppVal   - vilket lopp som man har valt
	 * @return
	 */

	public static void startLopp(Akare[] akarListan, int loppVal) {
		
		IndividuellLogik individLogik = new IndividuellLogik();
		
		switch (loppVal) {
			case 1 -> {
				System.out.println("MassStart - next version feature");
				}
			case 2 -> {
				individLogik.startTider(akarListan);
				individLogik.loppStart(akarListan);
				}
		}
	}
}
