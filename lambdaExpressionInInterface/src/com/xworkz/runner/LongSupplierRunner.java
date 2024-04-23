package com.xworkz.runner;

import com.xworkz.functionalInterface.Methods.LongSupplierAss;

public class LongSupplierRunner {

	public static void main(String[] args) {

		LongSupplierAss ass=new LongSupplierAss(()->false);
		ass.check();
		
		System.out.println("after main");
		
	}

}
