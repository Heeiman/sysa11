package org.lu.ics.labbar;

public class bla {

	public static void main(String[] args) {
		int MAX = 5;
		 String[] colors = {"RED", "GREEN", "BLUE", "WHITE", "BLACK"};
		 for (int k=MAX-1; k>=0; k--) {
		 System.out.println("Color["+(k+1)+"] = " + colors[k]);
		 }
		 System.out.println();
		 colors[3+1] = colors[3] + colors[2];
		 int i = 2;
		 colors [i+1] = colors[2-1] + colors[2];
		 for (int k=0; k<MAX; k++) {
		 System.out.println("["+k+"] = " + colors[k]);
		 }
	}

}
