package com.xworkz.CollectionDTO;

import java.io.Serializable;

public class HouseDTO implements Serializable {

	private String houseName;
	private int houseNo;
	private String area;
	private int rooms;
	
	public HouseDTO() {
		System.out.println("no-grgu-Constr");
		
	}

	public HouseDTO(String houseName, int houseNo, String area, int rooms) {
		super();
		this.houseName = houseName;
		this.houseNo = houseNo;
		this.area = area;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "HouseDTO [houseName=" + houseName + ", houseNo=" + houseNo + ", area=" + area + ", rooms=" + rooms
				+ "]";
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	

}
