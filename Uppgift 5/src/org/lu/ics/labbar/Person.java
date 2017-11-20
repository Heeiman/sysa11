package org.lu.ics.labbar;

import java.util.*;

public class Person {
	
	private LinkedList<Account> ownAccounts;
	private String pNbr;
	private String name;
	
	public Person () {
		this.setOwnAccounts (new LinkedList<Account>());
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
	
	public LinkedList<Account> getOwnAccounts () {
		return ownAccounts;
	}
	public void setOwnAccounts(LinkedList<Account> newOwnAccounts) {
		ownAccounts = newOwnAccounts;
	}

	public void addAccount (Account anAccount) {
		this.getOwnAccounts().add(anAccount);
	}
}
