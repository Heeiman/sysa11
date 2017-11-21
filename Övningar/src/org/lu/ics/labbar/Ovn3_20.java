package org.lu.ics.labbar;

import java.util.Scanner;

public class Ovn3_20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Hur många alarm vill du ha? ");
		int antal = reader.nextInt();
		
		while (antal > 0) {
			System.out.println("ALARM!");
			antal--;
		}

	}

}
