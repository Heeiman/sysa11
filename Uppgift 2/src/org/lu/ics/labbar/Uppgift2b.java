package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift2b {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
        
        System.out.println("Skriv in det f�rsta talet: ");
        int intOne = input.nextInt();
        if (intOne == 0) {
        System.out.println("Tackar.");
        input.close();
        break;
        
        }
        
        System.out.println("Skriv in det andra talet: ");
        int intTwo = input.nextInt();
        
        if (intOne > intTwo) {
        System.out.println(intOne + " �r st�rre �n " + intTwo);	
        }
        
        else if (intTwo > intOne) {
        System.out.println(intTwo + " �r st�rre �n " + intOne);	
        }
        
        else if (intOne == intTwo) {
        System.out.println("Talen �r lika ");
        }
        
        }
}
}
