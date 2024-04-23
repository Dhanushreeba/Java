package com.xworkz.functionalInterface.Methods;

public class LongSupplierAss {
	
	private LongSupplier longSupplier;
	
	public LongSupplierAss(LongSupplier longSupplier) {
		
		this.longSupplier=longSupplier;
	}
	
	public void check() {
		
		
		System.out.println("running LongSupplierAss ");
		boolean value=this.longSupplier.walk();
		
		if(value) {
			System.out.println("empty");
		}
		else {
			System.out.println("Not empty");
		}
	}
	

}
