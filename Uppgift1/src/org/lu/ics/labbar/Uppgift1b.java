package org.lu.ics.labbar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uppgift1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        // St�ller fr�gorna i ordning och tilldelar svaren String och double vid siffror.
        String question1 = "Ange ditt namn: ";
        System.out.println(question1);
        String answer1 = input.nextLine();
        
        String question2 = "Ange din timl�n: ";
        System.out.println(question2);
        double answer2 = Double.parseDouble(input.nextLine());
        
        String question3 = "Ange antalet arbetade timmar: ";
        System.out.println(question3);
        double answer3 = Double.parseDouble(input.nextLine());
        
        //R�knar ut totala l�nen och omformatterar.
        double totalPay = answer2 * answer3;
    	DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    	String nyttFormat = decimalFormat.format(totalPay);
        
    	//"Inga meddelanden i System.out s� jag g�r dem till Strings.
        String words1 = " du tj�nade ";
        String words2 = " kr f�rra veckan. ";
        
        System.out.println(answer1.toUpperCase() + words1 + nyttFormat + words2 );
        input.close();
        
	}

}
