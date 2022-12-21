package com.Dhivya;
import java.util.Scanner;
public class SeriesOfAddition {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1,a=9;i<=n;i++,a=a+4) {
			sum=sum+a;
		}
		System.out.print("The sum is:" +sum);
	}

}