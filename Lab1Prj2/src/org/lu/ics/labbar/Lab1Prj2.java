package org.lu.ics.labbar;

import java.util.Scanner;

public class Lab1Prj2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner inPut = new Scanner(System.in);
	      
	      System.out.println("Vad heter du i f�rnamn? ");
	      String firstName = inPut.nextLine() ;
	      
	      System.out.println("Vad heter du i efternamn? ");
	      String lastName = inPut.nextLine();
	      
	      System.out.println("Du heter allts�: " + lastName + " " + firstName );
	      
	      inPut.close();
	      
	      		  
	        
	}

}
