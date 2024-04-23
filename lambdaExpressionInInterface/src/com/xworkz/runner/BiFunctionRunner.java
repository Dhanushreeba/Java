package com.xworkz.runner;

import java.util.function.DoubleConsumer;

import com.xworkz.functionalInterface.Methods.BiFunction;

public class BiFunctionRunner {

	public static void main(String[] args) {
		
		 BiFunction <Integer, String, Integer> biFunction =new BiFunction ((Inetger a,String b)->45);
		 biFunction.run();
		    
	};

//		BiFunction<String,Integer,String> fun = (a,b)->
//		{
//			System.out.println("The attributes are");
//			return String;
//		};
//		
//		BiFunction biFun=new BiFunction(biFun);
//		biFun.run();
//	}
		

}
