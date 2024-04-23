package com.xworkz.runner;

import java.util.function.DoubleConsumer;

public class DoubleConsumerRunner {

	public static void main(String[] args) {
		
		DoubleConsumer consumer=a->
			System.out.println(a*4);
			
			consumer.accept(2);

//		DoubleConsumerRunner cons =()->
//		{
//			System.out.println("double Consumer");
//		};
//		
//		cons.check(56.7d);;
//		
//	}
//	
//		
//	
//	private void check(double d) {
//		
	}
	
	 // Create a DoubleConsumer Instance
//    DoubleConsumer
//        display
//        = a -> System.out.println(a * 10);
//
//    // using accept() method
//    display.accept(3);
//}

}
