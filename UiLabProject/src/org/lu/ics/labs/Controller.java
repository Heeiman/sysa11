
	package org.lu.ics.labs;
	import javax.swing.JFrame;
	public class Controller {
	 CustomerRegister customers; //Refererar till modellen ("kungregistret")
	 JFrame Frame; //Refererar till det grafiska gränssnittet


	 public Controller(CustomerRegister customerReg, JFrame Frame) {
	 this.customers = customerReg;
	 this.Frame = Frame;
	 }

	 public void addCustomer(String cNumber, String cName) {
	 Customer tmpCustomer = new Customer(cNumber, cName);
	 customers.addCustomer(tmpCustomer);
	 }

	 public void addCustomer(String nbr, String name, int cardN, String cardT) {
	 Customer tmpCustomer = new Customer(nbr, name);
	 Creditcard creditCard = new Creditcard(cardN, cardT);
	 tmpCustomer.setCreditcard(creditCard);
	 creditCard.setHolder(tmpCustomer);
	 customers.addCustomer(tmpCustomer);
	 }
	 public void removeCustomer(String cNumberRemove) {
	 customers.removeCustomer(cNumberRemove);
	 }

	 public String[] findCustomer(String cNumberFind) {
	 Customer c;
	 String[] aCust = null;
	 c = customers.findCustomer(cNumberFind);
	 if (c != null && c.getCreditcard() != null) {
	 aCust = new String[4];
	 aCust[0] = c.getCNumber();
	 aCust[1] = c.getCName();
	 aCust[2] = c.getCreditcard().getType();
	 aCust[3] = Integer.toString(c.getCreditcard().getCardNumber());
	 } else if (c != null) {
	 aCust = new String[2];
	 aCust[0] = c.getCNumber();
	 aCust[1] = c.getCName();
	 }
	 return aCust;
	 }

	 public void updateCustomerName(String cNumber, String newCName) {
	 customers.setCustomerName(cNumber, newCName);
	 }

	}



