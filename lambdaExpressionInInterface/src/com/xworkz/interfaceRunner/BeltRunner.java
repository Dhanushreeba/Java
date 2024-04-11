package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Belt;

public class BeltRunner {

	public static void main(String[] args) {

		Belt b=(ref,ref1) ->{
			
		System.out.println("flexibility belt running in runner having 2 parametr and no return type");
		System.out.println(ref);
		System.out.println(ref1);
	};
	
	b.flexibility("Flyer", 300);

	}

}
