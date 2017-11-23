package org.lu.ics.uppgift;

import javax.swing.JFrame;

import java.util.*;

public class Controller  {
	PersonRegister persons;
    JFrame frame;
	
	public Controller (PersonRegister persons, JFrame frame) {
		this.persons=persons;
		this.frame=frame;
	}
	
	public void addPerson(String pNbr, String name) {
        Person newPerson = new Person (pNbr, name);
            this.persons.addPerson(newPerson);
        }
	
	public void addPersonAccount (String pNbr, String nbr) {
		Person newPerson = persons.findPerson(pNbr);
		Account account = new Account(nbr);
		newPerson.addAccount(account);
		account.setOwner(newPerson);
		persons.addPerson(newPerson);
	}
	
		public void addAccount(String pNbr, String nbr) {
        Person newPerson;
        Account newAccount = new Account(nbr);
        newPerson = persons.findPerson(pNbr);
        if (newPerson != null) {
            newPerson.addAccount(newAccount);
        }
    }
	
	 public void removePerson(String pRemove) {
	 this.persons.removePerson(pRemove);
	 }
	 
	 
	 public String findPerson(String pNbr) {
	        Person newPerson;
	        newPerson = persons.findPerson(pNbr);
	        if (newPerson != null) {
	            return newPerson.getName();
	        }
	        return null;
	    }
	 
	 public LinkedList<Account> showAccounts(String pNbr) {
	        Person newPerson;
	        newPerson = persons.findPerson(pNbr);
	        if (newPerson != null) {
	            return newPerson.getAccounts();
	        }
	        return null;
	    }

}