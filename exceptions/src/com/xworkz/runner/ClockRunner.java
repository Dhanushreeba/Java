package com.xworkz.runner;

import com.xworkz.exception.Clock;
import com.xworkz.exception.ClockException;

public class ClockRunner {

	public static void main(String[] args) {	
	
	Clock c=new Clock();
	try {
		System.out.println("Before check");
		c.showsTime(3000);
		System.out.println("After check");	
	}
	catch(ClockException ec) {
		System.err.println("handling exception :" +ec.getMessage());
	}
	finally {
		System.out.println("running finally in ClockRunner");
	}
}
}
