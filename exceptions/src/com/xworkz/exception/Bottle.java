package com.xworkz.exception;

public class Bottle {
	
	public void filledWater(double length)throws InvalidLengthException{
		
		if(length <= 56.00) {
			System.out.println("length is available");
		}
		else {
			System.out.println("length is not available");
			throw new InvalidLengthException("not found");
		}
	}
	public void empty(double height)throws ValidLengthException{
		
		if(height <= 5) {
			System.out.println("length is available");
		}
		else {
			System.out.println("length is not available");
			throw new ValidLengthException("not found");
		}
	}
	

}
