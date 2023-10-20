/*Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
expression (in arg3) to perform addition, subtraction, multiplication and division operations.
*/

package com.sunbeam;

import java.util.Scanner;

public class Calculate implements Arithmatic
{
	
	public static void main(String args[])
	{
		int choice,num1,num2=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second number");
		num2=sc.nextInt();
		
		do
		{
			System.out.println("*****menu******");

			  System.out.println("0.Exit");
			  System.out.println("1.Addition");
			  System.out.println("2.Subtraction");
			  System.out.println("3.Multiplication");
			  System.out.println("4.Divide");
			  System.out.println("Enter your choice");
			  choice = sc.nextInt();
			  
			  switch(choice)
			  {
			  case 1:
				  calculate(num1, num2, (x, y) -> x + y);
				  break;
			  case 2:
				  calculate(num1, num2, (x, y) -> x - y);
				  break;
			  case 3:
				  calculate(num1, num2, (x, y) -> x * y);
				  break;
			  case 4:
				  calculate(num1, num2, (x, y) -> x / y);
				  break;
			  default:
				  System.out.println("wrong choice......  please try again");
			  }
		  }while(choice!=0);
	}
	
	static void calculate(double num1, double num2, Arithmetic op) 
	{
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
	}

}
