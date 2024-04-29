package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class RubberDTO implements Serializable,Comparable<RubberDTO>{
	
	private String brand;
	private String color;
	private String shape;
	private String manfDate;

	public RubberDTO() {
		System.out.println("no argu Constr");
	}

	public RubberDTO(String brand, String color, String shape, String manfDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.shape = shape;
		this.manfDate = manfDate;
	}


	@Override
	public String toString() {
		return "RubberDTO [brand=" + brand + ", color=" + color + ", shape=" + shape + ", manfDate=" + manfDate + "]";
	}
	
	@Override
	public int compareTo(RubberDTO ref1) {
		
		return (this.brand.compareTo(ref1.brand));
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getManfDate() {
		return manfDate;
	}

	public void setManfDate(String manfDate) {
		this.manfDate = manfDate;
	}
	
}
