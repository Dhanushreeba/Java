package com.xworkz.CollectionDTO;

import java.io.Serializable;
import java.util.Comparator;

public class BrushDTO implements Serializable,Comparable<BrushDTO>{
	
	private String brand;
	private Integer price;
	private String material;
	private String type;
	
	public BrushDTO() {
		
		System.out.println("no arg Constr");
	}

	public BrushDTO(String brand, int price, String material, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "BrushDTO [brand=" + brand + ", price=" + price + ", material=" + material + ", type=" + type + "]";
	}
	
	@Override
	public int compareTo(BrushDTO ref) {
		System.out.println("running compare to in BrushDTO");
		return (this.price.compareTo(ref.price)) ;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
