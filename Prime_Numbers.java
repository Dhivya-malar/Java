package com.Dhivya;

public class Prime_Numbers {
public static void main(String[]args) {
	int i,j;
	for(i=5; i<=16;i++) {
		if(i>1);
		for( j=2; j<i;j++) {
			if((i%j)==0)
			    break;
		}
		if(i==j) {
		       System.out.println(i);
		    }
	}
				
		}
}
	
	
