package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class SoapDTO implements Serializable,Comparable<SoapDTO>{

			private String brand;
			private Integer price;
			private String color;
			private String aroma;
			private Double weight;
			private String shape;

			public SoapDTO() {

				System.out.println("No-argu constr");
			
			}

			public SoapDTO(String brand, Integer price, String color, String aroma, Double weight, String shape) {
				super();
				this.brand = brand;
				this.price = price;
				this.color = color;
				this.aroma = aroma;
				this.weight = weight;
				this.shape = shape;
			}

			@Override
			public String toString() {
				return "SoapDTO [brand=" + brand + ", price=" + price + ", color=" + color + ", aroma=" + aroma
						+ ", weight=" + weight + ", shape=" + shape + "]";
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public Integer getPrice() {
				return price;
			}

			public void setPrice(Integer price) {
				this.price = price;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getAroma() {
				return aroma;
			}

			public void setAroma(String aroma) {
				this.aroma = aroma;
			}

			public Double getWeight() {
				return weight;
			}

			public void setWeight(Double weight) {
				this.weight = weight;
			}

			public String getShape() {
				return shape;
			}

			public void setShape(String shape) {
				this.shape = shape;
			}
	
			@Override
			public boolean equals(Object obj) {

				if(obj!=null) {
					
					if(obj instanceof SoapDTO) {
						
						SoapDTO s=(SoapDTO)obj;
						return this.getBrand().equalsIgnoreCase(s.getBrand()) && this.getWeight()==s.getWeight();
					}
				}
				
				return false;
			}

			@Override
			public int compareTo(SoapDTO o) {
				System.out.println("running comparable in SoapDTO");
				return this.getBrand().compareToIgnoreCase(o.getBrand());
			}

}
