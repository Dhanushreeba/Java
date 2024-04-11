package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Light;

public class LightRunner {

	public static void main(String[] args) {

		Light l=(t,c,q) -> {
		
		System.out.println("running in lightRunner having 3 parametr and no return type");
	
		System.out.println(t);
		System.out.println(c);
		System.out.println(q);
		
		};

			l.brightness("wall", "white", 1);
	
	}
	

}
