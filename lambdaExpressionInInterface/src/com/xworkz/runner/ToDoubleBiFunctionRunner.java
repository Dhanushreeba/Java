package com.xworkz.runner;

import com.xworkz.functionalInterface.Methods.ToDoubleBiFunction;

public class ToDoubleBiFunctionRunner {

	public static void main(String[] args) {

		ToDoubleBiFunction <String,Integer> toDouble=(T,U)->
		{
			System.out.println("The attributes are");
			
		};
		toDouble.run("Move",56);
		
		ToDoubleBiFunction fun=new ToDoubleBiFunction();
		fun.run();
	}

}
