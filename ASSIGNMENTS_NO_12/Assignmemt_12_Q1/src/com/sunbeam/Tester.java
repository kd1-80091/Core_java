package com.sunbeam;

public class Tester {
	public static void main(String args[])
	{
		emp[] arr = new emp[3];
		
		arr[0] = new Manager(1200.2,500);
		arr[1] = new Clerk(15000);
		arr[2] = new Labour(5000,89);
		
		double TotalIncome = emp.calcTotalIncome(arr);
		System.out.println(TotalIncome);
	}

}
