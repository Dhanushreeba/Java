package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Charger;
import com.xworkz.functionalInterface.lambda.Fan;

public class ChargerRunner {

	public static void main(String[] args) {
		
		System.out.println("Charger running in Charger Runner");

		Charger c=(ref)->electricity();
	
		
	}

	private static Object electricity() {
		// TODO Auto-generated method stub
		return null;
	}

}
