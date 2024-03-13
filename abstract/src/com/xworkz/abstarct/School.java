package com.xworkz.abstarct;

public  class School {
	
	public int noOfStudents;
	public String schoolName;
	public int fees;
	
	public void teaching() {
		
	}
	
	School(){
		System.out.println("no param constructor");
	}
	School(int noOfStudents,String schoolName,int fees){
		this.noOfStudents=noOfStudents;
		this.schoolName=schoolName;
		this.fees=fees;
		
		System.out.println("with param constructors");
	}
	public void display() {
		System.out.println("noOfStudents :" +noOfStudents);
		System.out.println("schoolName :" +schoolName);
		System.out.println("fees :" +fees);
		
	}

}
