package org.lu.ics.labbar;

public class Bankkonto {
	
	private String nbr;
	private double balance;
	
	public Bankkonto () {
		balance = 0.00;
	}
	
	public void credit (double amount) {
		balance = balance + amount;
	}
	
	public void withdraw (double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}



}
 