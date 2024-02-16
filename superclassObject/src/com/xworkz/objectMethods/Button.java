package com.xworkz.objectMethods;

public class Button {
	
	public String brand;
	public String shape;
	public String color;
	public String size;
	public int price;
	public int noOfHoles;
	public String material;
	public int netQuantity;
	
	@Override
	public String toString() {
		System.out.println("Compare Button");
		return "Button: brand"+this.brand+ ",shape: "+this.shape+ ",color: "+this.color+ ",size "+this.size+ ",price: "+this.price+ ",noOfHoles: "+this.noOfHoles+ ",material: "+this.material+ ",netQuantity:"+this.netQuantity;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Button");
		System.out.println(this);
		if(obj!=null && obj instanceof Button) {
			Button b=(Button)obj;
			Button b1=(Button)obj;
			Button b2=(Button)obj;
			
			if(this.price==b.price ||this.material.equals(b1.material)) {
				System.out.println("running price and material");
				return false;
			}
			if(this.netQuantity==b2.netQuantity && this.shape.equals(b1.shape)) {
				System.out.println("running pattren and shape");
				return true;
			}
			if(this.price==b2.price && this.size.equals(b2.size)){
				System.out.println("running weight and brand");
				return false;
			}
		}
		return false;
	}

}
