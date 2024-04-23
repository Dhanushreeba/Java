package com.xworkz.functionalInterface.Methods;

public class Supplier<T> {
	
	private Supplier <Integer> supplier;
	
	public Supplier(Supplier <Integer> supplier) {
		
		this.supplier=supplier;
	}

	public Supplier(Object supplier2) {
		// TODO Auto-generated constructor stub
	}

	public void run() {

		System.out.println("running run in Supplier Method");
		//supplier.get();
	}


}
