package com.xworkz.multipleinheritance;

public class LgFreezerAssocation {
	
	private LgFreezer lg;
	
	public LgFreezerAssocation(LgFreezer lg) {
		
		this.lg=lg; //instance variable initialization
	}
	
//	public void lgFreezer() {
//		
//		if(lg!=null) {
//			System.out.println("lgFreezer");
//		}
//	}
	
	public void autoCool() {
		if(lg!=null) {
			System.out.println("lgfreezer");
		}
	}
	
	public void lgCool() {
		System.out.println("lg cool");
	}

}
