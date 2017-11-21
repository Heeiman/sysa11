package org.lu.ics.labbar;

import java.util.Scanner;

public class Ovn3_231 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int antalTal = 0;
		int talIn = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int i = 0;
		
		System.out.println("Hur många tal vill du fylla i? ");
		antalTal = reader.nextInt();
		
		while (talIn != 0 && antalTal > 0) {
			System.out.println("Ange ett tal: ");
			talIn = reader.nextInt();
			antalTal--;
			i++;
			if (talIn < min) {
				min = talIn;
			}
			if (talIn > max) {
				max = talIn;
			}
			if (i == 1 && talIn == 0) {
				System.out.println("Inget tal inläst ");
				break;
			}
			
			
		}
		System.out.println("Det största talet är " + max + " och det minsta är " + min);

	}

}
