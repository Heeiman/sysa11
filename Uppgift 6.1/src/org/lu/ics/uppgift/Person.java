package org.lu.ics.uppgift;

import java.util.*;

public class Person {

    private String pNbr;
    private String name;
    private LinkedList<Account> accounts = new LinkedList<Account>();

    public void setPNbr(String newPNbr) {
        this.pNbr = newPNbr;
    }

    public String getPNbr() {
        return this.pNbr;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAccount(LinkedList<Account> newAccount) {
        this.accounts = newAccount;
    }

    public LinkedList<Account> getAccounts() {
        return this.accounts;
    }

    public void addAccount(Account anAccount) {
        this.accounts.add(anAccount);
    }

    public Person(String pNbr, String name) {
        this.setPNbr(pNbr);
        this.setName(name);
        this.setAccount(new LinkedList<Account>());
    }
    public Person () {
    	
    }

}