package com.xworkz.mapDTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private String name;
	private String designation;
	private Integer salary;
	
	public EmployeeDTO() {
		System.out.println("no argu constr");
	}

	public EmployeeDTO(String name, String designation, Integer salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
					
					if(obj instanceof EmployeeDTO) {
						System.out.println("running degree in DTO");
						EmployeeDTO e=(EmployeeDTO)obj;
						System.out.println(e);
						return true;				
					}
				}

				return false;
		}

}
