package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class PerfumeDTO implements Serializable{
	
	private String brand;
	private String color;
	private int cost;
	private String fragnance;
	private int durationLast;
	
	public PerfumeDTO() {
		System.out.println("no argu constr");
	}
	public PerfumeDTO(String brand, String color, int cost, String fragnance, int durationLast) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
		this.fragnance = fragnance;
		this.durationLast = durationLast;
	}
	
	@Override
	public String toString() {
		return "PerfumeDTO [brand=" + brand + ", color=" + color + ", cost=" + cost + ", fragnance=" + fragnance
				+ ", durationLast=" + durationLast + "]";
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getFragnance() {
		return fragnance;
	}
	public void setFragnance(String fragnance) {
		this.fragnance = fragnance;
	}
	public int getDurationLast() {
		return durationLast;
	}
	public void setDurationLast(int durationLast) {
		this.durationLast = durationLast;
	}

	
}
