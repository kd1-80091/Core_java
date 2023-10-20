package com.sunbeam;

public class Clerk implements emp
{
	private double sal;
	
	

	public Clerk(double sal) {
		//super();
		this.sal = sal;
	}



	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Clerk [sal=" + sal + "]";
	}
	
	
	

}
