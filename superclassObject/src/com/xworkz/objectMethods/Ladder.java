package com.xworkz.objectMethods;

public class Ladder {

	public String brand;
	public int price;
	public String material;
	public String color;
	public String weight;
	public String specialFetuare;
	public int warranty;
	public double capacity;
	
	@Override
	public String toString() {
		System.out.println("Compare Glass");
		return "Ladder: brand"+this.brand+ ",price: "+this.price+ ",material: "+this.material+ ",color "+this.color+ ",weight: "+this.weight+ ",specialFetuare: "+specialFetuare+ ",warranty: "+this.warranty+ ",capacity:"+this.capacity;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Ladder");
		System.out.println(this);
		if(obj!=null && obj instanceof Ladder) {
			Ladder l=(Ladder)obj;
			Ladder l1=(Ladder)obj;
			Ladder l2=(Ladder)obj;
			
			if(this.price==l.price ||this.material.equals(l.material)) {
				System.out.println("running price and material");
				return true;
			}
			if(this.warranty==l1.warranty && this.brand.equals(l1.brand) ||this.capacity==l2.capacity) {
				System.out.println("running pattren and shape");
				return true;
			}
		}
		return false;
	}
	
	
	
}
