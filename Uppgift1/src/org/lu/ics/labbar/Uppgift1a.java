package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        String question1 = "Skriv ett ord: ";
        System.out.println(question1);
        String answer1 = input.nextLine();
        
        String question2 = "Skriv ytterligare ett ord: ";
        System.out.println(question2);
        String answer2 = input.nextLine();
        
        String answer3 = answer1 + " " + answer2;
        System.out.println(answer3);
        System.out.println(answer3.length());
        input.close();
	}

}
