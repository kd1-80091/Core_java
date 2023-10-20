package com.sunbeam;

public class Labour implements emp
{
	private double hrs,rate;

	public Labour(double hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Labour [hrs=" + hrs + ", rate=" + rate + "]";
	}

	@Override
	public double getSal() {
		
		return hrs*rate;
	}
	
	public double calcIncentives()
	{
		if(hrs>300)
			return 5/100*hrs*rate;
		return 0.0;
	}
	

}
