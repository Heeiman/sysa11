package org.lu.ics.inlämningsuppgifter;

public class Account {
	
	private String nbr;
	private double balance;	
	private Person owner;
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public void setNbr(String newNbr) {
		nbr = newNbr;
	}
	
	public String getNbr() {
		return nbr;
	}
	
	public Account (String nbr) {
		balance = 0.00;
		this.setNbr(nbr);
		this.nbr=nbr;
		
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
		this.setBalance(newBalance);
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	

}

