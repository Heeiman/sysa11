package org.lu.ics.labbar;

import java.util.*;

public class Person {
	
	private ArrayList<Account> accounts;
	private String pNbr;
	private String name;
	
	public Person () {
		this.setAccount(new ArrayList<Account>());
	}
	
	public String getPNbr () {
		return pNbr;
	}
	
	public void setPNbr (String newPnbr) {
		pNbr = newPnbr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name =newName;
	}
	
	public ArrayList<Account> getOwnAccounts () {
		return accounts;
	}
	public void setAccount(ArrayList<Account> newAccounts) {
		accounts = newAccounts;
	}

	public void addAccount (Account anAccount) {
		this.getOwnAccounts().add(anAccount);
	}
}
