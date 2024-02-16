package com.xworkz.objectMethods;

public class Carrom {
	
	public String brand;
	public int price;
	public String material;
	public double length;
	public String theme;
	public String genre;
	public int noOfPlayers;
	public int weight;
	
	@Override
	public String toString() {
		System.out.println("Compare Carrom");
		return "Carrom: brand"+this.brand+ ",price: "+this.price+ ",material: "+this.material+ ",length "+this.length+ ",theme: "+this.theme+ ",genre: "+genre+ ",noOfPlayers: "+this.noOfPlayers+ ",weight:"+this.weight;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Carrom");
		System.out.println(this);
		if(obj!=null && obj instanceof Carrom) {
			Carrom c=(Carrom)obj;
			Carrom c1=(Carrom)obj;
			Carrom c2=(Carrom)obj;
			
			if(this.price==c.price ||this.material.equals(c1.material)) {
				System.out.println("running price and material");
				return false;
			}
			if(this.brand.equals(c2.brand) ||this.noOfPlayers==c2.noOfPlayers) {
				System.out.println("running brand and noOfPlayers");
				return true;
			}
			if(this.weight==c2.weight && this.brand.equals(c2.brand)){
				System.out.println("running weight and brand");
				return false;
			}
		}
		return true;
	}

}
