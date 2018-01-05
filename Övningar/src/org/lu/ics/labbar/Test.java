package org.lu.ics.labbar;

public class Test {
		 public static void main(String[] args) {
			 Customer c = new Customer();
			 c.setName("K1");

			 Customer c2 = c;
			 c.setNbrOf(4+1);
			 c2.setNbrOf(c.getNbrOf()+1);
			 int tal = c.getNbrOf()+5;
			 System.out.println("Namn: "+c.getName()+" ålder: "+c2.getNbrOf());
			 andra(c, ++tal);
			 System.out.println("Namn: "+c.getName()+" ålder: "+c.getNbrOf()+", Tal: "+tal);
			 }
			 public static void andra(Customer p, int tal) {
			 p.setName("K2");
			 tal=9;
			 p.setNbrOf(tal);
			 }
			}