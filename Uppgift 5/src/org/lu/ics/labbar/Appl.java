package org.lu.ics.labbar;

import java.util.*;

public class Appl {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Person1");
		p1.setPNbr("012345");
		
		
		Person p2 = new Person();
		p2.setName("Person2");
		p2.setPNbr("543210");
		
		Account a1 = new Account();
		a1.setBalance(300);
		a1.setNbr("100");
		a1.setOwner(p1);
		
		Account a2 = new Account();
		a2.setBalance(500);
		a2.setNbr("101");
		a1.setOwner(p1);
		
		Account a3 = new Account();
		a3.setBalance(1000);
		a3.setNbr("102");
		a3.setOwner(p2);
		
		Account a4 = new Account ();
		a3.setBalance(5000);
		a3.setNbr("103");
		a3.setOwner(p2);
		
		p1.addAccount(a1);
		p1.addAccount(a2);
		
		p2.addAccount(a3);
		p2.addAccount(a4);

        PersonRegister register = new PersonRegister();
		
		register.addPerson(p1);
		register.addPerson(p2);
		
		System.out.println(register.findPerson("012345").getName());
		System.out.println(register.findPerson("543210").getName());
				
		System.out.println(a1.getOwner().getName() + "\n" + a1.getNbr() + "\n" + a1.getBalance());
		//System.out.println(account2.getOwner().getName() + "\n" + account2.getNbr() + "\n" + account2.getBalance());
		//System.out.println(account3.getOwner().getName() + "\n" + account3.getNbr() + "\n" + account3.getBalance());
		//System.out.println(account4.getOwner().getName() + "\n" + account4.getNbr() + "\n" + account4.getBalance(

		
		

	}

}
