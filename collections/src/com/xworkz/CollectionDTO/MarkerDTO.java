package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class MarkerDTO implements Serializable{

	private String brand;
	private String color;
	private int price;
	private int size;
	
	public MarkerDTO() {
		System.out.println("no argu const");
	}
	public MarkerDTO(String brand, String color, int price, int size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "MarkerDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
