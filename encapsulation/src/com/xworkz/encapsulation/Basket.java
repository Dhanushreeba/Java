package com.xworkz.encapsulation;

public class Basket {

	int price;
	String size;
	String color;
	String material;
	String brand;
	
	@Override
	public String toString() {
		System.out.println("running basket");
		return "Basket=price:" +this.price+ ",size" +this.size+ ",color" +this.color+ ",material" +this.material+ ",brand" +this.brand;
	}
	public int getPrice() {
		return this.price;
	}
	public String getSize() {
		return this.size;
		
	}
	public String getColor() {
		return this.color;
		
	}
	public String getMaterial() {
		return this.material;
		
	}
	public String getBrand() {
		return this.brand;
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setSize(String size) {
		this.size=size;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Basket) {
			Basket basket=(Basket)obj;
			Basket basket1=(Basket)obj;
			
			if(this.size.equals(basket1.size) && this.color.equals(basket.color)) {
				System.out.println("running size and color");
				return true;
			}
			if(this.price==basket.price || this.brand.equals(basket1.brand)) {
				System.out.println("running price and brand");
				return false;
			}
		}
		return false;
		
	}
}
