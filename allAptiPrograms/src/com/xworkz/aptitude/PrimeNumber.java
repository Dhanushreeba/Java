package com.xworkz.aptitude;


public class PrimeNumber {
	
	public static void main(String[] args)
	{
		//ex:7 = 1,2,3,4,5,6,7
		int num=3;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) //7/1=0
			{
				count++;
			}
		}
       if(count==2)
       {
    	   System.out.println(num +" is prime number");
       }
       else
       {
    	   System.out.println("not a prime number");
       }
}


	  

	}
	
	 
