package com.xworkz.object;

public class SwitchBoard {
	
	public String brand;
	public String type;
	public String noOfSockets;
	
	
	
	@Override
	public String toString() {
		System.out.println("running in Switchboard");
		return "Brand: "+brand+  "Type: "+type+  "NoOfSockets: "+noOfSockets;

	}

}
