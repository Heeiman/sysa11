package org.lu.ics.labbar;

import java.util.Scanner;
import java.util.*;

public class MyClass {
   public static void main(String args[]) {
       
	   Scanner scan = new Scanner(System.in);
		
		double tal = 0;
		
		double storst = 0;
		double min = 0;
		
		for (double i = 0; i < 5; i++)
			{
		    	System.out.println("Ange tal:");
		    	tal = scan.nextDouble();  
		    	if (tal > storst) {
		    		storst = tal;
		    		
		    	} 
		    	if (tal < storst || i == 0) {
		    		    min = tal;
		    	}
		    }

		System.out.print("Det största talet är: " + storst + " och det minsta är " + min);
		
		scan.close();
   }
}