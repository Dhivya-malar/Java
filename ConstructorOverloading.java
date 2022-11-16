package com.Dhivya;

public class ConstructorOverloading {
	int aadharNo,idNo,phNo,dateofbirth;
	String CustName;
	public ConstructorOverloading(String name, int dob, int phnno, int id, int aadhar) {
		// TODO Auto-generated constructor stub
		CustName=name;
		dateofbirth=dob;
		phNo=phnno;
		idNo=id;
		aadharNo=aadhar;
	}

	public ConstrucotrOverloading(String name, int aadhar) {
		// TODO Auto-generated constructor stub
		CustName=name;
		aadharNo=aadhar;
		
	}

	public static void main(String[] args) {
		Customer anbu=new Customer("anbu",18/2/22,90252845,155764,6894);
		Customer Selvam=new Customer("Selvam",5555);
		anbu.applyLoan();
		Selvam.applyLoan();
	}

	private void applyLoan() {
		// TODO Auto-generated method stub
		System.out.println("Customer Name is" +" " +CustName);
	
		
		
	}
}
