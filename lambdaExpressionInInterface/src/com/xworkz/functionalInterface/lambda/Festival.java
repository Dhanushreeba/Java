package com.xworkz.functionalInterface.lambda;


@FunctionalInterface
public interface Festival {
	
	boolean prepare(String item,String buyItem);
	
	default void fry() {
		
		
	}

}
