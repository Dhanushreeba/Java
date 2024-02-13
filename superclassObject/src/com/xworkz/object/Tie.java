package com.xworkz.object;

public class Tie {

	public String color="Red";
	public String pattern="Plane";
	public String price="100 Rs";
	
	public void fix() {
		System.out.println("fixes");
	}
	
	public void outlook() {
		System.out.println("gives good outlook");
	}
	
	public void style() {
		System.out.println("used to style");
	}
	
	@Override
	public String toString() {
		System.out.println("running in Tie");
		return "Color: "+color+  "Pattern: "+pattern+  "Price: "+price;
	}
}
