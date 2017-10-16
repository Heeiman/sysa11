package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppg3 {
public static void main(String[] args) {
	
	// Introducerar Scannern och Arrayet.
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    
    // Initierar variablen "sum", frågar efter input och lägger till inmatade siffror i "sum".
    double sum = 0;
    for (int i = 0; i < 5; i++)
    {
        System.out.println("enter a number: ");
        numbers[i] = input.nextInt();
        sum += numbers[i];       
    }
    
    // Räknar ut maxvärdet.
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
    	if (max < numbers[i])
    	{
    		max =numbers[i];
    	}
    }
    
    // Räknar ut medelvärdet och presenterar all information.
    double average =  sum / 5;
    
    System.out.println("Average is: " + average);
    
    System.out.println("The sum is: " + sum);
    
    System.out.println("Maxvärdet är: " +max);
    input.close();
}
}

