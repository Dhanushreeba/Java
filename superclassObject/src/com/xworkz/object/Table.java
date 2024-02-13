package com.xworkz.object;

public class Table {

	public String type="Wooden Table";
	public String color="Brown";
	public String price="1000 Rs";

	
	
	@Override
	public String toString() {
		System.out.println("running in Table");
		return "Type: "+type+  "Color: "+color+  "Price: "+price;
	}
}
