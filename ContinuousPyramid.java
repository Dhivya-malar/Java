package com.Dhivya;

public class ContinousPyramid {
	public static void main(String[] args) {
		for (int row=1; row<=3;row++) {
			for (int col1=2; col1>=row;col1--)
			{
				System.out.print(" ");
			}
			for(int t1=1;t1<=row;t1++) {
				System.out.print(t1);
			}
			for(int t2=(row-1);t2>0;t2--) {
				System.out.print(t2);
			}
			for (int col2=2; col2>=row; col2--) {
				System.out.print(" ");
			}
			for(int col3=2;col3>=row; col3--) {
				System.out.print(" ");
			}
			for (int t3=1;t3<=row; t3++) {
				System.out.print(t3);
			}
			for(int t4=row-1; t4>0;t4--) {
				System.out.print(t4);
			}
		System.out.println();
		}
		
	}

}
