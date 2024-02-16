package com.xworkz.objectMethods;

public class Mug {
	
	public String brand;
	public String pattren;
	public String color;
	public int height;
	public int price;
	public String specialFeture;
	public String material;
	public int netQuantity;
	
	@Override
	public String toString() {
		System.out.println("Compare Mug");
		return "Mug: brand"+this.brand+ ",pattren: "+this.pattren+ ",color: "+this.color+ ",height "+this.height+ ",price: "+this.price+ ",specialFeture: "+this.specialFeture+ ",material: "+this.material+ ",netQuantity:"+this.netQuantity;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Mug");
		System.out.println(this);
		if(obj!=null && obj instanceof Mug) {
			Mug m=(Mug)obj;
			Mug m1=(Mug)obj;
			Mug m2=(Mug)obj;
			
			if(this.price==m.price ||this.material.equals(m1.material)) {
				System.out.println("running price and material");
				return false;
			}
			if(this.netQuantity==m2.netQuantity && this.pattren.equals(m1.pattren)) {
				System.out.println("running pattren and shape");
				return true;
			}
			if(this.price==m2.price && this.pattren.equals(m2.pattren)){
				System.out.println("running weight and brand");
				return false;
			}
		}
		return true;
	}

}
