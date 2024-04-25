package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class BellDTO implements Serializable{
	
	private String metalUsed;
	private String type;
	private double weight;
	private int width;
	private double height;
	private int price;
	
	public BellDTO() {
		System.out.println("no-grgu-Constr");
	}
	public BellDTO(String metalUsed, String type, double weight, int width, double height,int price) {
		super();
		this.metalUsed = metalUsed;
		this.type = type;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "BellDTO [metalUsed=" + metalUsed + ", type=" + type + ", weight=" + weight + ", width=" + width
				+ ", height=" + height + ", price=" +price +"]";
	}
	public String getMetalUsed() {
		return metalUsed;
	}
	public void setMetalUsed(String metalUsed) {
		this.metalUsed = metalUsed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
