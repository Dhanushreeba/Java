package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class StateDTO implements Serializable{
	
	public enum Direction{
		
		NORTH,SOUTH,EAST,WEST
      
	}
	
	private String name;
	private Double population;
	private Direction direction;
	private String chiefMinsiter;
	private Double revenue;
	private Double budget;
	
	public StateDTO() {
		System.out.println("No argu const");	
	}

	public StateDTO(String name, Double population, Direction direction, String chiefMinsiter, Double revenue,
			Double budget) {
		super();
		this.name = name;
		this.population = population;
		this.direction = direction;
		this.chiefMinsiter = chiefMinsiter;
		this.revenue = revenue;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "StateDTO [name=" + name + ", population=" + population + ", direction=" + direction + ", chiefMinsiter="
				+ chiefMinsiter + ", revenue=" + revenue + ", budget=" + budget + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPopulation() {
		return population;
	}

	public void setPopulation(Double population) {
		this.population = population;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String getChiefMinsiter() {
		return chiefMinsiter;
	}

	public void setChiefMinsiter(String chiefMinsiter) {
		this.chiefMinsiter = chiefMinsiter;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
}
