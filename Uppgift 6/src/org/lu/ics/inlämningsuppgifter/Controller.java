package org.lu.ics.inlämningsuppgifter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controller  {
	private PersonTableModel persons;
	private JFrame frame;
	
	public Controller (PersonTableModel persons, JFrame frame) {
		this.persons=persons;
		this.frame=frame;
	}
	
	public void addPerson (String pNbr, String pName) {
		Person tmpPerson = new Person(pNbr, pName);
		persons.addPerson(tmpPerson);
	}
	
	public void addPersonAccount (String pNbr, String pName, String accNbr) {
		Person tmpPerson = new Person(pNbr, pName);
		Account account = new Account(accNbr);
		tmpPerson.addAccount(account);
		account.setOwner(tmpPerson);
		persons.addPerson(tmpPerson);
		
	}
	
	 public void removePerson(String pRemove) {
	 persons.removePerson(pRemove);
	 }

	public String[] findPerson(String pNbrFind) {
		 Person p;
		 String[] aPerson = null;
		 p = persons.findPerson(pNbrFind);
		 if (p != null && p.getAccounts() != null) {
		 aPerson = new String[4];
		 aPerson[0] = p.getPNbr();
		 aPerson[1] = p.getName();
		 } else if (p != null) {
		 aPerson = new String[2];
		 aPerson[0] = p.getPNbr();
		 aPerson[1] = p.getName();
		 }
		 return aPerson;
	}
	
	 public void updatePersonName(String pNbr, String newPName) {
	 persons.setPersonName(pNbr, newPName);
	 }
	

}
