package org.lu.ics.uppgift;


public class Test {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.setName("Bill");
		person1.setPNbr("1111");
		
		Person person2 = new Person();
		
		person2.setName("Bull");
		person2.setPNbr("2222");
		
		Account account1 = new Account();
		
		account1.setNbr("1");
		account1.setBalance(1000);
		account1.setOwner(person1);
		
		Account account2 = new Account();
		
		account2.setNbr("2");
		account2.setBalance(1000);
		account2.setOwner(person1);
		
		person1.addAccount(account1);
		person1.addAccount(account2);
		
		Account account3 = new Account();
		
		account3.setNbr("3");
		account3.setBalance(1000);
		account3.setOwner(person2);
		
		Account account4 = new Account();
		
		account4.setNbr("4");
		account4.setBalance(1000);
		account4.setOwner(person2);
		
		person2.addAccount(account3);
		person2.addAccount(account4);
		
		PersonRegister register = new PersonRegister();
		
		register.addPerson(person1);
		register.addPerson(person2);
		
		System.out.println(register.findPerson("1111").getName());
		System.out.println(register.findPerson("2222").getName());
				
		System.out.println(account1.getOwner().getName() + "\n" + account1.getNbr() + "\n" + account1.getBalance() + "\n" + register.findPerson("2222").getName());
		System.out.println(account2.getOwner().getName() + "\n" + account2.getNbr() + "\n" + account2.getBalance());
		//System.out.println(account3.getOwner().getName() + "\n" + account3.getNbr() + "\n" + account3.getBalance());
		//System.out.println(account4.getOwner().getName() + "\n" + account4.getNbr() + "\n" + account4.getBalance());
		
	}

}