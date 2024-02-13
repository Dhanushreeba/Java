package com.xworkz.object;

public class Ring {

	public String type;
	public String price;
	public String color;
	
	
	
	
	@Override
	public String toString() {
		
		System.out.println("running in ring");
		System.out.println( "Price: "+price+" Type:" +type+" Color:" +color);
		return super.toString();
	}
	
	
	
}
