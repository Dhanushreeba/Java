package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Charger;
import com.xworkz.functionalInterface.lambda.Fan;

public class ChargerRunner {

	public static void main(String[] args) {
		
		System.out.println("Charger running in Charger Runner having one parameter and no return type");

		Charger c=(v) -> {
			
			System.out.println(v);
		};
		
		c.electricity(50);
	}

}
