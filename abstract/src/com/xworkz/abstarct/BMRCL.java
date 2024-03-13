package com.xworkz.abstarct;

public  class BMRCL extends Metro{
	
//	public BMRCL(){
//		
//	}
	public BMRCL(int age,String name){
		this.time=age;
		this.name=name;
		System.out.println(name);
	}
	public void build() {
		System.out.println("build a metro");
		
		
	}
	public BMRCL() {
		System.out.println("running BMRCL extends Metro");
	}

}
