package com.xworkz.encapsulation;

public class Box {

	String shape;
	String capacity;
	String material;
	int price;
	String color;
	
	@Override
	public String toString() {
		System.out.println("running box");
		return "Box= shape:" +this.shape+ ",capacity" +this.capacity+ ",material" +this.material+ ",price" +this.price+ ",color" +this.color;
	}
	public String getShape() {
		return this.shape;
	}
	public String getCapacity() {
		 return this.capacity;
	}
	public String getMaterial() {
		return this.material;

	}
	public int getPrice() {
		return this.price;
		
	}
	public String getColor() {
		return this.color;
	}
	public void setShape(String shape) {
		this.shape=shape;
	}
	public void setCapacity(String capacity) {
		this.capacity=capacity;
	}
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public boolean equals(Object obj) {
		System.out.println("running object in Box");
		System.out.println(this);
		if(obj!=null && obj instanceof Box) {
			Box box=(Box)obj;
			Box box1=(Box)obj;
			
			if(this.capacity.equals(box.capacity) && this.price==box1.price) {
				System.out.println("running capacity and price in Box");
				return false;
			}
			if(this.material.equals(box1.material) || this.shape.endsWith(shape)) {
				System.out.println("running material and shape in box");
				return true;
			}
		}
		return false;
	}
	
}
