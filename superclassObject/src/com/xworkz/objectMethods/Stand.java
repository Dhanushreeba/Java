package com.xworkz.objectMethods;

public class Stand {
	
	public String color;
	public String mountingType;
	public String compatibleDevices;
	public double width;
	public String brand;
	public String modelNumber;
	public int weight;
	public int length;
	
	@Override
	public String toString() {
		System.out.println("Compare Stand");
		return "Stand: color"+this.color+ ",mountingType: "+this.mountingType+ ",compatibleDevices: "+this.compatibleDevices+ ",brand "+this.brand+ ",modelNumber: "+this.modelNumber+ ",weight: "+weight+ ",length: "+this.length+ ",width:"+this.width;
		
	}
	public boolean equals(Object obj) {
		System.out.println("running in Stand");
		System.out.println(this);
		if(obj!=null && obj instanceof Stand) {
			Stand s=(Stand)obj;
			Stand s1=(Stand)obj;
			Stand s2=(Stand)obj;
			
			if(this.width==s1.width ||this.modelNumber.equals(s2.modelNumber)) {
				System.out.println("running width and modelNumber");
				return false;
			}
			if(this.color.equals(s2.color) ||this.length==s.length) {
				System.out.println("running color and length");
				return true;
			}
			if(this.weight==s2.weight && this.mountingType.equals(s.mountingType)){
				System.out.println("running weight and mountingType");
				return true;
			}
		}
		return true;
	}

}
