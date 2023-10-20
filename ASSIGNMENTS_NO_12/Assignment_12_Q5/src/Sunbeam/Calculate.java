package Sunbeam;
public class Calculate 
{
	static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int count = 0;
		for(T ele : arr)
		{
			if(c.compare(ele,key));
			count++;

		}	
		return count;
	}
	
	public static void main(String args[])
	{
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
		
		Double[]arr1= {1.1,1.2,1.3,1.4,1.5,1.2};
		Double key1 = 1.2;
		int cnt1 = countIf(arr,key,(e,k)->e.equals(k));
		System.out.println(cnt);		
		
	}

}
