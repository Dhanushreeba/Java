package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class DayDTO implements Serializable,Comparable<DayDTO>{

	private String name;
	private Integer order;
	
	public DayDTO() {
		System.out.println("no argu constr");
	}

	public DayDTO(String name, int order) {
		super();
		this.name = name;
		this.order = order;
	}

	@Override
	public int compareTo(DayDTO ref1) {
		return (this.order.compareTo(ref1.order));
	}
	
	@Override
	public String toString() {
		return "DayDTO [name=" + name + ", order=" + order + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	
}
