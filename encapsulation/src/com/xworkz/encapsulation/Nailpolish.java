package com.xworkz.encapsulation;

public class Nailpolish {

	String color;
	String brand;
	int price;
	String finishType;
	String ocassion;
	
	@Override
	public String toString() {
		System.out.println("running nailpolish");
		return "Nailpolish=color:" +this.color+ ",brand" +this.brand+ ",price" +this.price+ ",finishType" +this.finishType+ ",ocassion" +this.ocassion;
	}
	public String getColor() {
		return this.color;
		
	}
	public String getBrand() {
		return this.brand;
		
	}
	public int getPrice() {
		return this.price;
		
	}
	public String getFinishType() {
		return this.finishType;
		
	}
	public String getOcassion() {
		return this.ocassion;
		
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setFinishType(String finishType) {
		this.finishType=finishType;
	}
	public void setOcassion(String ocassion) {
		this.ocassion=ocassion;
	}
	public boolean equals(Object obj) {
		System.out.println("running object in nailpolish");
		System.out.println(this);
		if(obj!=null && obj instanceof Nailpolish) {
			Nailpolish nail=(Nailpolish)obj;
			Nailpolish nail1=(Nailpolish)obj;
			
			if(this.brand.equals(nail1.brand) && this.price==nail.price) {
				System.out.println("running brand and price");
				return true;
			}
			if(this.color.equals(nail1.color) && this.ocassion.equals(nail1.ocassion)) {
				System.out.println("running color and ocassion");
				return false;
			}
		}
		return false;
	}
	
}
