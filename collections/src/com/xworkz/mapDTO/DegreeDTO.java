package com.xworkz.mapDTO;

import java.io.Serializable;


public class DegreeDTO implements Serializable,Comparable<DegreeDTO>{

	private String name;
	private String stream;
	private Double percentage;
	private String yop;
	
	public DegreeDTO() {

		System.out.println("no argu constr");
	}

	public DegreeDTO(String name, String stream, Double percentage, String yop) {
		super();
		this.name = name;
		this.stream = stream;
		this.percentage = percentage;
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "DegreeDTO [name=" + name + ", stream=" + stream + ", percentage=" + percentage + ", yop=" + yop + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			
			if(obj instanceof DegreeDTO) {
			//	System.out.println("running degree in DTO");
				DegreeDTO d=(DegreeDTO)obj;
				System.out.println(d);
				return true;				
			}
		}

		return false;
	}

	@Override
	public int compareTo(DegreeDTO o) {
		System.out.println("running companyDTO");
		return 1;
	}
}
