package org.lu.ics.labbar;

import java.util.Arrays;
import java.util.Scanner;


public class Ovn3_21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] ettArray = new int[5];
		int max;
				
		System.out.println("Skriv in fem tal: ");
		
		for(int i = 0; i < 5; i++) {
				ettArray [i] = reader.nextInt();
				}
		max = ettArray[0];
		for (int i = 0; i < 5; i++) {
			if(max < ettArray[i]) {
				max = ettArray[i];
		}
		}
		

		System.out.println("Det största talet är: " +max);

	}

}

