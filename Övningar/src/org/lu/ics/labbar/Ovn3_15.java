package org.lu.ics.labbar;


		import java.util.Scanner;
		public class Ovn3_15 {
		 public static void main (String[] args){
		 Scanner scan = new Scanner(System.in);
		 double summa = 0;
		 double medeltal = 0;
		 int antalTal = 0;
		 int tal;

		 System.out.print("Skriv in ett heltal: ");
		 tal = scan.nextInt();

		 while (tal != 0){
		 System.out.print ("Skriv in ett heltal: ");
		 tal = scan.nextInt();
		 summa += tal;
		 antalTal++;
		 }
		 if (antalTal != 0) {
		 medeltal = summa / antalTal;
		 }
		 System.out.println ("Medeltal: " + medeltal );
		 }
		}
