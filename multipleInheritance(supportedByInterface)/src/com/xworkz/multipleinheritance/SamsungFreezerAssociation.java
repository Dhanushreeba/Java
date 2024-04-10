package com.xworkz.multipleinheritance;

public class SamsungFreezerAssociation {
	
	private SamsungFreezer samsung;
	
	public SamsungFreezerAssociation(SamsungFreezer samsung) {
		
		this.samsung=samsung;
	}
	
	public void autoCool() {
		
		if(samsung!=null) {
			System.out.println("samsungFreezer");
		}
		else {
			System.out.println("false");
		}
	}

}
