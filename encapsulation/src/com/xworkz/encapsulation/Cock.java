package com.xworkz.encapsulation;

public class Cock {

	int price;
	String brand;
	String color;
	String material;
	String size;
	
	@Override
	public String toString() {
		System.out.println("running Pot");
		return "Cock=price:" +this.price+ ",brand:" +this.brand+ ",color:" +this.color+ ",material:" +this.material+ ",size:" +this.size;
	}
	public int getPrice() {
		return this.price;
		
	}
	public String getBrand() {
		return this.brand;
	}
	public String getColor() {
		return this.color;
		
	}
	public String getMaterial() {
		return this.material;
		
	}
	public String getSize() {
		return this.size;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setSize(String size) {
		this.size=size;
	}
	
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Cock) {
			Cock cock=(Cock)obj;
			Cock cock1=(Cock)obj;
			
			if(this.brand.equals(cock1.brand) || this.size.equals(cock.size)) {
				System.out.println("running color and style");
				return true;
			}
			if(this.price==cock1.price || this.material.equals(cock1.material)) {
				System.out.println("running price and material");
				return false;
			}
		}
		return false;
		
	}
}
