package com.Dhivya;

public class ArmstrongNumber {
	public static void main(String[] args) {
     int a=370;
     int temp=a;
     int r,sum=0;
     while(a>0) {
     r= a%10;     // modulus 10 gives the remainder of a.
     a=a/10;      
     sum=sum+r*r*r;
     }
     if(temp==sum)
     System.out.println("It is an Armstrong number");
     else
     System.out.println("It is not an Armstrong number");			
	}

}
