package com.xworkz.specifiers;

public class Sand {
		
	String color;
	float quantity;
	int size; 
	
	public Sand(String color) {
		
		this.color=color;
	}
	
	private Sand(float quantity) {
		
		this.quantity=quantity;
	}
	
	protected Sand(int size) {
		this.size=size;
		
	}

	Sand(){
		
		System.out.println("Sand");
	}
}
