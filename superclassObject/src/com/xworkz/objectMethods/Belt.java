package com.xworkz.objectMethods;

public class Belt {

	public double length;
	public String type;
	public int price;
	public String material;
	public String beltWearerName;
	public int weight;
	public String paymentType;
	public String modelNumber;
	
	public Belt() {
		System.out.println("no-argu constructor");
	}
	
	@Override
	public String toString() {
		System.out.println("compare Belt");
		return "Belt: length"+this.length+ ",type: "+this.type+ ",price: "+this.price+ ",material "+this.material+ ",beltWearerName: "+this.beltWearerName+ ",weight: "+weight+ ",paymentType: "+this.paymentType+ ",modelNumber:"+this.modelNumber;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Belt");
		System.out.println(this);
		if(obj!=null && obj instanceof Belt) {
			Belt belt=(Belt)obj;
			Belt belt1=(Belt)obj;
			Belt belt2=(Belt)obj;
			
			if(this.length==belt.length ||this.modelNumber.equals(belt1.modelNumber)) {
				System.out.println("running length and modelNumber");
				return true;
			}
			if(this.type.equals(belt1.type) ||this.weight==belt2.weight) {
				System.out.println("running type and weight");
				return false;
			}
			if(this.price==belt1.price && this.paymentType.equals(belt2.paymentType)){
				System.out.println("running price and paymentType");
				return false;
			}
		}
		return true;
	}

}


