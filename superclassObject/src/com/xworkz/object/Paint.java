package com.xworkz.object;

public class Paint {

	public String color;
	public String brand;
	public String type;
	
	
	@Override
	public String toString() {
		System.out.println("running in Paint");
		//System.out.println("Color: "+color+  "Brand: "+brand+  "Type: "+type);
		return "Color: "+color+  "Brand: "+brand+  "Type: "+type;
	}
}
