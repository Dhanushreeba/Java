package com.xworkz.encapsulation;

public class Pot {

	String design;
	String color;
	int price;
	String material;
	String style;
	
	@Override
	public String toString() {
		System.out.println("running Pot");
		return "Pot=design:" +this.design+ ",color:" +this.color+ ",price:" +this.price+ ",material:" +this.material+ ",style:" +this.style;
	}
	public String getDesign() {
		return this.design;
	}
	public String getColor() {
		return this.color;
		
	}
	public int getPrice() {
		return this.price;
		
	}
	public String getMaterial() {
		return this.material;
		
	}
	public String getStyle() {
		return this.style;
		
	}
	public void setDesign(String design) {
		this.design=design;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setStyle(String style) {
		this.style=style;
	}
	
	public boolean equals(Object obj) {
		System.out.println(this);
		if(obj!=null && obj instanceof Pot) {
			Pot pot=(Pot)obj;
			Pot pot1=(Pot)obj;
			
			if(this.color.equals(pot1.color) || this.style.equals(pot.style)) {
				System.out.println("running color and style");
				return true;
			}
			if(this.price==pot1.price || this.material.equals(pot1.material)) {
				System.out.println("running price and material");
				return false;
			}
		}
		return false;
		
	}
}
