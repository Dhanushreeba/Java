package com.xworkz.object;

public class Tie {

	public String color="Red";
	public String pattern="Plane";
	public String price="100 Rs";
	
	
	@Override
	public String toString() {
		System.out.println("running in Tie");
		//System.out.println("Color: "+color+  "Pattern: "+pattern+  "Price: "+price);
		return "Color: "+color+  "Pattern: "+pattern+  "Price: "+price;
	}
}
