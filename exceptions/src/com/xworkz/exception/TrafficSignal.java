package com.xworkz.exception;

public class TrafficSignal {
	
	public void colorLight(String color) throws Exception {
		
		if(color.equals("Red")) {
			System.out.println("Vehicals Stops");
		}
		else if(color.equals("Orange")) {
			System.out.println("Vehicals get ready");
		}
		else if(color.equals("Green")) {
			System.out.println("Vehicals move");
			throw new SignalNotFoundException("Invalid light");
		}
		
	}
	
		

}
