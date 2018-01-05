package org.lu.ics.uppgift;

public class Account {

    private String nbr;
    private double balance;
    private Person owner;

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person newOwner) {
        this.owner = newOwner;
    }

    public void setNbr(String newNbr) {
        this.nbr = newNbr;
    }

    public String getNbr() {
        return this.nbr;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
    }

    public Account(String nbr) {
        this.setNbr(nbr);
        this.balance=0;
    }
    public Account () {
    	
    }

    @Override
    public String toString() {
        return this.getNbr() + " " + this.getBalance();
    }


}	