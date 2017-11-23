package org.lu.ics.inlämningsuppgifter;

import java.util.*;

public class Person {
	
	private String pNbr;
	private String name;
	private ArrayList<Account> accounts;
	
	public Person(String pNbr, String pName) {
		this.setPNbr(pNbr);
		this.setName(pName);
		accounts = new ArrayList<Account>();
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public void setPNbr(String newPNbr) {
		pNbr = newPNbr;
	}
	
	public String getPNbr() {
		return pNbr;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAccounts(ArrayList<Account> newAccounts) {
		accounts = newAccounts;
	}
	
	public void addAccount(Account anAccount) {
		this.getAccounts().add(anAccount);
	}


}