package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppg3 {
public static void main(String[] args) {
	
	// Introducerar Scannern och Arrayet.
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    
    // Initierar variablen "sum", fr�gar efter input och l�gger till inmatade siffror i "sum".
    double sum = 0;
    for (int i = 0; i < 5; i++)
    {
        System.out.println("enter a number: ");
        numbers[i] = input.nextInt();
        sum += numbers[i];       
    }
    
    // R�knar ut maxv�rdet.
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
    	if (max < numbers[i])
    	{
    		max =numbers[i];
    	}
    }
    
    // R�knar ut medelv�rdet och presenterar all information.
    double average =  sum / 5;
    
    System.out.println("Average is: " + average);
    
    System.out.println("The sum is: " + sum);
    
    System.out.println("Maxv�rdet �r: " +max);
    input.close();
}
}

