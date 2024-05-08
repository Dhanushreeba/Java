package com.xworkz.sets;

import java.io.Serializable;

import com.xworkz.CollectionDTO.SoapDTO;

public class BasketDTO implements Serializable{
	
	private String color;
	private Integer price;
	private String pattern;
	private String type;
	
	public BasketDTO() {
		System.out.println("no argu constr");
	}

	public BasketDTO(String color, Integer price, String pattern, String type) {
		super();
		this.color = color;
		this.price = price;
		this.pattern = pattern;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BasketDTO [color=" + color + ", price=" + price + ", pattern=" + pattern + ", type=" + type + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			
			if(obj instanceof BasketDTO) {
				
				BasketDTO b=(BasketDTO)obj;
				return this.getPrice()==b.getPrice();
			}
		}

		return false;
	}

}
