package com.Dhivya;

public class Patterns_Alphabet {
	public static void main(String[] args) {
		int assci=65;
		for(int i=1; i<=6;i++) {
			for (int j=1; j<=i;j++) {
				char value=(char) (assci);
				System.out.print(value);
				assci=assci+1;
				}
			System.out.println();
		}
	}
}
