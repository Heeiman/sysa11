package org.lu.ics.labbar;

import java.util.Scanner;

public class Ovn3_23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number = 1;
		int tal = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int i = 0;
				
		while (number != 0) {
			System.out.println("Ange ett nummer: ");
			number = reader.nextInt();
			i++;
			 
			 if ( i == 1 && number == 0) {
				 System.out.println("Inget tal inläst");
				 break;
				
			 }
			
			 else if (number > max) {
				 max = number;
			 }
			 else if (number < min) {
				 min = number;
			 }

		}
		System.out.println("Minsta värdet är: " + min);
		System.out.println("Största värdet är: " + max);

	}

}
