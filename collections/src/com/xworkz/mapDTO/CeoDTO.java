package com.xworkz.mapDTO;

import java.io.Serializable;


public class CeoDTO implements Serializable{
	
	private String name;
	private Integer experience;
	private String place;
	private Integer salary;
	
	public CeoDTO() {
		System.out.println("no argu constr");
	}

	public CeoDTO(String name, Integer experience, String place, Integer salary) {
		super();
		this.name = name;
		this.experience = experience;
		this.place = place;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CeoDTO [name=" + name + ", experience=" + experience + ", place=" + place + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	 @Override
		public boolean equals(Object obj) {
			 if(obj!=null) {
					
					if(obj instanceof CeoDTO) {
					//	System.out.println("running degree in DTO");
						CeoDTO ceo=(CeoDTO)obj;
						System.out.println(ceo);
						return true;				
					}
				}

				return false;
		}
}
