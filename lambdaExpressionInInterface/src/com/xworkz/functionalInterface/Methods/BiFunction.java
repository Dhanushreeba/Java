package com.xworkz.functionalInterface.Methods;


public class BiFunction<T,U,R> {
	
	private BiFunction<Integer,String,Integer> biFunction;
	
	public BiFunction(BiFunction<Integer,String,Integer> biFunction) {
		
		this.biFunction=biFunction;
	}
	
	public BiFunction(Object biFunction2) {
		

	}

	public void run()
	{
		System.out.println("running run in BiFunction Method");
	}
	

}
