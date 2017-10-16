package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift2b {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        while (true)
        {
        
        System.out.println("Skriv in det första talet: ");
        int intOne = input.nextInt();
        if (intOne == 0) {
        System.out.println("Tackar.");
        input.close();
        break;
        
        }
        
        System.out.println("Skriv in det andra talet: ");
        int intTwo = input.nextInt();
        
        if (intOne > intTwo) {
        System.out.println(intOne + " är större än " + intTwo);	
        }
        
        else if (intTwo > intOne) {
        System.out.println(intTwo + " är större än " + intOne);	
        }
        
        else if (intOne == intTwo) {
        System.out.println("Talen är lika ");
        }
        
        }
}
}
