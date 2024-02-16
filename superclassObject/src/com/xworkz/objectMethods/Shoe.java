package com.xworkz.objectMethods;

public class Shoe {
	
	public int warranty;
	public String paymentType;
	public String shoppingType;
	public String laceColor;
	public int price;
	public int size;
	public double width;
	public String weight;
	
	@Override
	public String toString() {
		System.out.println("Compare Shoe");
		return "Shoe: warranty"+this.warranty+ ",paymentType: "+this.paymentType+ ",shoppingType: "+this.shoppingType+ ",laceColor "+this.laceColor+ ",price: "+this.price+ ",size: "+size+ ",width: "+this.width+ ",weight:"+this.weight;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Shoe");
		System.out.println(this);
		if(obj!=null && obj instanceof Shoe) {
			Shoe sh=(Shoe)obj;
			Shoe sh1=(Shoe)obj;
			Shoe sh2=(Shoe)obj;
			
			if(this.price==sh.price ||this.shoppingType.equals(sh1.shoppingType)) {
				System.out.println("running price and shoppingType");
				return false;
			}
			if(this.laceColor.equals(sh1.laceColor) ||this.weight==sh2.weight) {
				System.out.println("running laceColor and weight");
				return true;
			}
			if(this.warranty==sh1.warranty && this.paymentType.equals(sh2.paymentType)){
				System.out.println("running warranty and paymentType");
				return false;
			}
		}
		return true;
	}

}
