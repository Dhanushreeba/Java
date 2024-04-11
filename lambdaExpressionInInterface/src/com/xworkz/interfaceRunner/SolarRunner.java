package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.SolarWaterHeater;

public class SolarRunner {

	public static void main(String[] args) {

		 SolarWaterHeater solar = () -> {
	            return 2;
	        };

	        int value = solar.capacity();
	        System.out.println(value);
	}

}
