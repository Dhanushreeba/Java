package com.xworkz.objectMethods;

public class Glass {
	
	public char size;
	public int length;
	public String shape;
	public double weight;
	public String brand;
	public int price;
	public String pattren; 
	public String theme;
	
	public  Glass() {
		System.out.println("no argu constrtr");
	}
	
	@Override
	public String toString() {
		System.out.println("Compare Glass");
		return "Glass: size"+this.size+ ",length: "+this.length+ ",shape: "+this.shape+ ",weight "+this.weight+ ",brand: "+this.brand+ ",price: "+price+ ",pattren: "+this.pattren+ ",theme:"+this.theme;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Glass");
		System.out.println(this);
		if(obj!=null && obj instanceof Glass) {
			Glass g=(Glass)obj;
			Glass g1=(Glass)obj;
			Glass g2=(Glass)obj;
			
			if(this.size==g.size ||this.pattren.equals(g.pattren)) {
				System.out.println("running size and Pattren");
				return true;
			}
			if(this.price==g1.price && this.size==g1.size ||this.brand.equals(g2.brand)) {
				System.out.println("running pattren and shape");
				return true;
			}
		}
		return false;
	}

}
