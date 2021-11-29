package com.yajava.meny;

import java.util.Scanner;

public class Huvudmeny {

	String operator = "";
	String retry = "";
	
	// New Scanner. repeatCalc is used for the repeat code, just to make it a bit simpler on what it does.
	Scanner in = new Scanner (System.in);
	Scanner repeatIn = new Scanner (System.in); {
	
	// Do-While Loop that loops the code back here when you finish with the equation.
	do {
		
	boolean repeatOp = true;
	
    System.out.println("|                                        |");
    System.out.println("|\t[1]\t Lägg till åkare                   |");
    System.out.println("|\t[2]\t Sök åkare               |");
    System.out.println("|\t[3]\t Visa startlista             |");
    System.out.println("|\t[4]\t Visa resultatlista          |");
    System.out.println("|\t[5]\t Visa mellantid          |");
    System.out.println("|\t[6]\t Visa lopp          |");
    System.out.println("|                                        |");
    System.out.println("|\t[7]\t Avsluta                         |");

    System.out.println("|                                        |");
    System.out.println("|\tSelect an option!:               |");
    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    
    int choice=in.nextInt();
	
	switch (choice) {
	case 1:
		System.out.println("");
		break;
	case 2:
		System.out.println("");
		break;
	case 3:
		System.out.println("");
		break;
	case 4:
		System.out.println("");
		break;
		
	}
	// Asks user if they want to continue. Typing Y or y loops you back to the top where the 'do' is.
	System.out.println("[2]");
	retry = repeatIn.nextLine();
	
	}
	// Loops the code back to do. If anything else but Y or y is typed, the application will say goodbye.
	while(retry.equalsIgnoreCase("y"));
	System.out.println("Goodbye.");
}
}
