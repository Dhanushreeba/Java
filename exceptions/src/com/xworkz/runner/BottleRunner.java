package com.xworkz.runner;

import com.xworkz.exception.Bottle;
import com.xworkz.exception.InvalidLengthException;
import com.xworkz.exception.ValidLengthException;

public class BottleRunner {

	public static void main(String[] args) {
		
		Bottle b=new Bottle();
		try {
			System.out.println("before execution");
			b.filledWater(45.30);
			b.empty(4);
			System.out.println("after execution");
		}
		catch(InvalidLengthException | ValidLengthException in) {
			System.err.println("handling exception :" +in.getMessage());
			
		}

	}
}
