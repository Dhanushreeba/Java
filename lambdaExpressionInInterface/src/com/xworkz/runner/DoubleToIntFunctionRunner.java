package com.xworkz.runner;

import com.xworkz.functionalInterface.Methods.DoubleToIntFunctionAss;

public class DoubleToIntFunctionRunner {

	public static void main(String[] args) {

		DoubleToIntFunctionAss asosiated=new DoubleToIntFunctionAss(()->false);
		asosiated.check();
		
		System.out.println("after main");
		
	}
	
}
