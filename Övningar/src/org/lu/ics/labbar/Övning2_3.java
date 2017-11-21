package org.lu.ics.labbar;

import java.util.Scanner;

public class Övning2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
		String question1 = "Skriv en text: ";
		System.out.println(question1);
		String answer1 = input.nextLine();
		
		String replaceString = answer1.replace("m", "x");
		System.out.println(replaceString);
	    
		input.close();

	}

}
