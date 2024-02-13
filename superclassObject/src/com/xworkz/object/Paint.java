package com.xworkz.object;

public class Paint {

	public String color;
	public String brand;
	public String type;
	
	public void Decoration() {
		System.out.println("decorate house");
	}
	
	public void Look() {
		System.out.println("gives good outlook");
	}
	
	public void finish() {
		System.out.println("good finish");
	}
	
	@Override
	public String toString() {
		System.out.println("running in Paint");
		return "Color: "+color+  "Brand: "+brand+  "Type: "+type;
	}
}
