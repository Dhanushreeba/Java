package com.xworkz.runner;

import com.xworkz.functionalInterface.Methods.ToLongBiFunction;
import com.xworkz.functionalInterface.lambda.FestivalCheck;

public class ToLongBiFunctionRunner {

	public static void main(String[] args) {

		ToLongBiFunction <String,Double> toLong=(T,U)->
		{
			System.out.println("The attributes are");
			
		};
		
		toLong.run("Move",23.4d);
		
		ToLongBiFunction fun=new ToLongBiFunction();
		fun.run();
	}


}
