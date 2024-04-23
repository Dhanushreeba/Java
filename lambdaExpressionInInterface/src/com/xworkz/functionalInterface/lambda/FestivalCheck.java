package com.xworkz.functionalInterface.lambda;

public class FestivalCheck {

	private Festival festival;
	
	public FestivalCheck(Festival festival) {
		
		this.festival=festival;
	}
	
	public void check() {
		
		
		System.out.println("running FestivalCheck ");
		boolean value=this.festival.prepare("Flower", "Camphor");
		
		if(value) {
			System.out.println("prepared");
		}
		else {
			System.out.println("Not prepared");
		}
	}
	
}
