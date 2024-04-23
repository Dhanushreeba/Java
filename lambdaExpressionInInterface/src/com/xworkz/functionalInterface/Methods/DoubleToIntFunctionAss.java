package com.xworkz.functionalInterface.Methods;

public class DoubleToIntFunctionAss {

	private DoubleToIntFunctionAss doubleToIntFunctionAss;
	
	public DoubleToIntFunctionAss(DoubleToIntFunctionAss doubleToIntFunctionAss) {
		
		this.doubleToIntFunctionAss=doubleToIntFunctionAss;
	}

	public DoubleToIntFunctionAss(Object doubleToIntFunctionAss2) {
		// TODO Auto-generated constructor stub
	}

	public void check() {
		
		
		System.out.println("running LongSupplierAss");
		boolean value=this.doubleToIntFunctionAss.click();
		
		if(value) {
			System.out.println("good");
		}
		else {
			System.out.println("Not good");
		}
	}

	
}
