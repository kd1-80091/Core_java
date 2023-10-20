package com.sunbeam;

public interface emp {
	double getSal();
	default double calcIncentives()
	{
		
		return 0.0;
	}
	
	static double calcTotalIncome(emp[] arr)
	{
		double total=0;
		for(emp ele : arr)
			total=ele.getSal()+ele.calcIncentives();
		return total;
	}
	

}
