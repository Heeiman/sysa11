package org.lu.ics.labbar;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];

    int sum = 0;
    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println("enter a number: ");
        numbers[i] = input.nextInt();
        sum = numbers[i];
        
    }
    
    double average = sum / 5;
    
    System.out.println("Average is " + average);
    input.close();
}
}

