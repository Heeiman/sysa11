package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		Bankkonto konto = new Bankkonto();
		
		while (true) {
			System.out.println("Insättning eller uttag (0-insättning, 1-uttag: )");
			if (reader.nextInt() == 0) {
				System.out.println("Ange belopp: ");
				konto.credit(reader.nextInt());
				System.out.println("Saldo " + konto.getBalance() + "\nVill du avsluta? ");
			}
			else {
				System.out.println("Ange belopp");
				konto.withdraw(reader.nextInt());
				System.out.println("Saldo " + konto.getBalance() + "\nVill du avsluta? ");
			}
			
			if (reader.next().equals("J")) break; 
			
		}

	}

}
