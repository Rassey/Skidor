package com.yajava.berakning;

import java.time.LocalTime;
import java.util.Arrays;

import com.yajava.akare.Akare;

public class Individuell {
	
	private TidBerakning tidBerakning = new TidBerakning();

	public Akare[] individuellStart(Akare[] akare, Akare nyAkare) {

		// sätt starttid till nyaÅkaren
		// 30 sekunder intervall till nästa åkare
		LocalTime startTime;
		if (akare.length == 0)
			startTime = LocalTime.of(0, 0, 0);
		else
			startTime = akare[akare.length - 1].getStartTid().plusSeconds(30);

		nyAkare.setStartTid(startTime);

		// innan tävlingen startar kan man sätta finish time till 0
		nyAkare.setSlutTid(LocalTime.of(0, 0, 0));

		Akare[] output = Arrays.copyOf(akare, akare.length + 1);
		output[output.length - 1] = nyAkare;

		return output;
	}

	public void updateList(Akare[] akare) {

		for (Akare akr : akare) {
			akr.setSlutTid(tidBerakning.getFinishTime(akr));
			akr.setTid(tidBerakning.calculateTiming(akr));
		}
	}
}
