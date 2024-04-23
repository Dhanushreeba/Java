package com.xworkz.functionalInterface.Methods;

public class ObjDoubleConsumer<T> {
	
	private ObjDoubleConsumer objDoubleConsumer;
	
	public ObjDoubleConsumer(ObjDoubleConsumer<T> objDoubleConsumer) {
		
		this.objDoubleConsumer=objDoubleConsumer;
	}
	public void run()
	{
		System.out.println("running run in objDoubleConsumer Method");
	}
	


}
