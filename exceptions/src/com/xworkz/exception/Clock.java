package com.xworkz.exception;

public class Clock {
	
	public void showsTime(int price) throws ClockException {
		if(price <=2000) {
			System.out.println("price is Reasonable");
		}
		else {
			System.out.println("price is not reasonable");
			throw new ClockException("price is more than expected");
		}
		
	}

}
