package com.sunbeam;

import java.util.function.Predicate;

public class StringWithLenght
{
	public static void main(String[] args)
	{
		
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
		// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
		int cnt = countIf(arr, new Predicate<String>() {
		public boolean test(String s) {
		return s.length() > 6;
		}
		});
		System.out.println("Result: " + cnt);
		
		System.out.println("Result using Anynomus Class : ");
		
		
		
		int count = countIf(arr,s -> s.length()>6);
		System.out.println("count number of strings have length more than 6 -- using lambda expressions"+count);
		
		
		 
		
	}
	
	public static int countIf(String[] arr, Predicate<String> cond)
	{
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
	}


}
