package com.xworkz.objectMethods;

public class Plate {

	public String material;
	public String brand;
	public String occasion;
	public int length;
	public int price;
	public String style;
	public String shape;
	public int weight;
	
	@Override
	public String toString() {
		System.out.println("Compare Plate");
		return "Plate: material"+this.material+ ",brand: "+this.brand+ ",occasion: "+this.occasion+ ",length "+this.length+ ",price: "+this.price+ ",style: "+style+ ",shape: "+this.shape+ ",weight:"+this.weight;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Plate");
		System.out.println(this);
		if(obj!=null && obj instanceof Plate) {
			Plate p=(Plate)obj;
			Plate p1=(Plate)obj;
			Plate p2=(Plate)obj;
			
			if(this.price==p.price ||this.material.equals(p.material)) {
				System.out.println("running price and material");
				return true;
			}
			if(this.weight==p1.weight && this.brand.equals(p1.brand) ||this.length==p2.length) {
				System.out.println("running pattren and shape");
				return false;
			}
			if(this.weight==p2.weight && this.brand.equals(p2.brand)){
				System.out.println("running weight and brand");
				return false;
			}
		}
		return false;
	}
	
}
