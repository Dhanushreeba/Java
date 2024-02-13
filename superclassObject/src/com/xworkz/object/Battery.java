package com.xworkz.object;

public class Battery {

	public String type="Removable";
	public String color="Black";
	public String brand="Asaskai";
	
	
	@Override
	public String toString() {
		System.out.println("running in Battery");
		return "Type: "+type+  "Color: "+color+  "Brand: "+brand;
	}
}
