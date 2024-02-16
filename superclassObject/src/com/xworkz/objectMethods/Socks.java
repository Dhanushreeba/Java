package com.xworkz.objectMethods;

public class Socks {

	public String brand;
	public String size;
	public int price;
	public String color;
	public int length;
	public String careInstructions;
	public String materialComposition;
	public int width;
	
	@Override
	public String toString() {
		System.out.println("Compare Socks");
		return "Socks: brand"+this.brand+ ",size: "+this.size+ ",price: "+this.price+ ",color "+this.color+ ",length: "+this.length+ ",careInstructions: "+this.careInstructions+ ",materialComposition: "+this.materialComposition+ ",width:"+this.width;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Socks");
		System.out.println(this);
		if(obj!=null && obj instanceof Socks) {
			Socks sc=(Socks)obj;
			Socks sc1=(Socks)obj;
			Socks sc2=(Socks)obj;
			
			if(this.price==sc.price ||this.materialComposition.equals(sc1.materialComposition)) {
				System.out.println("running price and materialComposition");
				return true;
			}
			if(this.length==sc1.length && this.size.equals(sc2.size)) {
				System.out.println("running length and size");
				return false;
			}
			if(this.width==sc2.width && this.color.equals(sc1.color)){
				System.out.println("running width and color");
				return false;
			}
		}
		return true;
	}
}
