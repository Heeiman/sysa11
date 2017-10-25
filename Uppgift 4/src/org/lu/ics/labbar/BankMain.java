package org.lu.ics.labbar;

public class BankMain {

	public static void main(String[] args) {
		
		Bankkonto kund1 = new Bankkonto(); //Skapa ett bankkonto objekt
		kund1.credit(500); //Skapa kund 1
		
		//Skapa kund 2
		Bankkonto kund2 = new Bankkonto();
		kund2.withdraw(400);
		
		System.out.print("Kund 1 har: ");
		System.out.println(kund1.getBalance());
		
		System.out.print("Kund 2 har: ");
		System.out.println(kund2.getBalance());

	}

}
