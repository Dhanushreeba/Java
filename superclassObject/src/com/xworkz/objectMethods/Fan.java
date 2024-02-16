package com.xworkz.objectMethods;

public class Fan {
	
	public String mountingType;
	public int price;
	public String color;
	public double weigth;
	public String design;
	public String style;
	public int wattage;
	public int length;
	
	@Override
	public String toString() {
		System.out.println("Compare Fan");
		return "Fan: mountingType"+this.mountingType+ ",price: "+this.price+ ",color: "+this.color+ ",weigth "+this.weigth+ ",design: "+this.design+ ",style: "+style+ ",wattage: "+this.wattage+ ",length:"+this.length;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Fan");
		System.out.println(this);
		if(obj!=null && obj instanceof Fan) {
			Fan f=(Fan)obj;
			Fan f1=(Fan)obj;
			Fan f2=(Fan)obj;
			
			if(this.price==f.price ||this.design.equals(f1.design)) {
				System.out.println("running price and material");
				return false;
			}
			if(this.mountingType.equals(f2.mountingType) ||this.wattage==f2.wattage) {
				System.out.println("running brand and noOfPlayers");
				return true;
			}
			if(this.weigth==f2.weigth && this.style.equals(f2.style)){
				System.out.println("running weight and brand");
				return false;
			}
		}
		return false;
	}

}
