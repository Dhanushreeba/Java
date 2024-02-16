package com.xworkz.objectMethods;

public class Lace {
	
	public String brand;
	public String netQuantity;
	public int weight;
	public String color;
	public int price;
	public int length;
	public String material;
	public String usedFor;
	
	@Override
	public String toString() {
		System.out.println("Compare Lace");
		return "Lace: brand"+this.brand+ ",netQuantity: "+this.netQuantity+ ",weight: "+this.weight+ ",color "+this.color+ ",price: "+this.price+ ",length: "+length+ ",material: "+this.material+ ",usedFor:"+this.usedFor;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Lace");
		System.out.println(this);
		if(obj!=null && obj instanceof Lace) {
			Lace la=(Lace)obj;
			Lace la1=(Lace)obj;
			Lace la2=(Lace)obj;
			
			if(this.price==la.price ||this.usedFor.equals(la1.usedFor)) {
				System.out.println("running price and usedFor");
				return false;
			}
			if(this.color.equals(la1.color) ||this.weight==la2.weight) {
				System.out.println("running laceColor and weight");
				return true;
			}
			if(this.netQuantity==la1.netQuantity && this.brand.equals(la2.brand)){
				System.out.println("running netQuantity and brand");
				return false;
			}
		}
		return true;
	}

}
