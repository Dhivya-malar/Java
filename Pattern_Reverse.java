package com.Dhivya;

public class Pattern_Reverse {
	public static void main(String args[]) {
    for (int row = 5, x = 0; row >= 1; row--, x += 2) {
        for (int col = 1; col<= row; col++) {
            System.out.print(col);
        }
        for (int col= 1; col<= x; col++) {
            System.out.print(' ');
        }
        for (int col = row; col >= 1; col--) {
            System.out.print(col);
        }
         System.out.println();
    }
}
}

