package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Crane;
import com.xworkz.functionalInterface.lambda.SolarWaterHeater;

public class CraneRunner {

	public static void main(String[] args) {

		Crane c=() ->"Fish";
		
		String ref=c.foodType();
		System.out.println("running foodtype of crane in runner");
		System.out.println(ref);
		
			return;
			
			
			
		}
		

}
