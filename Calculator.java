package com.Dhivya;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("JAVA CALCULATOR");
		System.out.println("Enter the 1st number:");
		double num1;
		num1=sc.nextDouble();
		System.out.println("Enter the 2nd numer:");
		double num2;
		num2=sc.nextDouble();
		System.out.println("press 1 for Addition:");
	    System.out.println("press 2 for Subraction:");
		System.out.println("press 3 for Multiplication:");
		System.out.println("press 4 for Division:");
		System.out.println("Enter your choice:");
		double choice;
		choice=sc.nextDouble();
		if (choice==1)
		{
			System.out.println("Additon:"+num1 + num2);
		}
		else if (choice==2)
		{
			System.out.println("Subraction:"+(num1 - num2));
		}
		else if (choice==3)
		{
			System.out.println("Multiplication:"+(num1 * num2));
		}
		else if (choice==4)
		{
			System.out.println("Division:"+(num1 / num2));
		}
		else
		{
			System.out.println("Invalid Input!");
			}
	}
