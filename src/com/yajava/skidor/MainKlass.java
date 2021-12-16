package com.yajava.skidor;


/*
 * Grundl�ggande kravApplikationen ska kunna anv�ndas i huvudsak vid l�ngdskidt�vlingar
 *  f�r att supporter/ledare ska kunna ta mellantider p� �kare l�ngs skidsp�ret.
 *  
 *  L�ngdskidt�vlingar t�vlas antingen med individuell start d�r varje �kare startar med 15 sek eller 30 sek mellanrum, 
 *  genom masstart (dvs. alla �kare samtidigt) eller s�som jaktstart d�r �karna startar utifr�n resultatet i en f�reg�ende t�vling.
 *  
 *  I dess enklaste form ska applikationen kunna r�kna fram mellantiden f�r ett visst �karnummer vid den plats p� sp�ret som ledaren st�r vid.
 *   Om t.ex. f�rsta start �r kl 10:00 s� beh�ver kunna r�kna fram hur l�ng �ktidsomstartnummer 1 som startade 10:00:00har, 
 *   startnummer 2 som startade 10:00:30 och startnummer 3 som startade 10:01:00 etc. har vid en viss plats p� sp�ret.
 *    Om anv�ndaren matar in ett startnummer, s� ska aktuell �ktid samt placeringen i f�rh�llande till de som hittills passerat.
 *    
 *     Obs: Instruktionen �r vag med flit eftersom ni f�rv�ntas ut�va kravf�ngst genom att st�lla f�ljdfr�gor till mig. 
 */
public class MainKlass {
	
	
	
	public static void main(String[] args) {
		Logik logik = new Logik();
		logik.Start();
	}
}
