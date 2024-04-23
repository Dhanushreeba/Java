package com.xworkz.runner;

import java.util.function.BinaryOperator;

public class BinaryOperatorRunner {

	public static void main(String[] args) {

//		BinaryOperator <String> operator =<a> ->
//		{
//			System.out.println("String for a is ...");
//		};
//		BinaryOperator.maxBy("box");
//		
//		BinaryOperator bi=new BinaryOperator(operator);
//		bi.run();
//	}
		
		BinaryOperator operator=new BinaryOperator((String t)->{
			System.out.println("String of a BinaryOperator");
		});
		operator.andThen(null);

}
}
