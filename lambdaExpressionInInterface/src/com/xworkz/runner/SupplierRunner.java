package com.xworkz.runner;

import java.util.function.BinaryOperator;

import com.xworkz.functionalInterface.Methods.Supplier;

public class SupplierRunner {

	public static void main(String[] args) {

		Supplier <Integer> supplier=() ->
		{
			System.out.println("The attributes are");
			
		};
		supplier.run();
		
//		Supplier supplier=new Supplier((Integer t)->
//		{
//		
//		System.out.println("Inetger of Supplier"); 
//			
//	});
		supplier.run();

}
}

