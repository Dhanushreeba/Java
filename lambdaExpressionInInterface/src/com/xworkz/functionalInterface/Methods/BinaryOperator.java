package com.xworkz.functionalInterface.Methods;

//import java.util.function.BinaryOperator;

public class BinaryOperator<T> {
	
	private BinaryOperator <String> binaryOperator;
	
	public BinaryOperator(BinaryOperator<String>biOperator) {
		
			this.binaryOperator=binaryOperator;
	}
	public void run() {
		
		System.out.println("running binaryOperator method");
		//binaryOperator.apply("Belt", "Fetch");
	}

}
