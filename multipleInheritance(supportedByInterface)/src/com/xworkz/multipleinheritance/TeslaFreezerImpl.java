package com.xworkz.multipleinheritance;

public class TeslaFreezerImpl implements TeslaFreezer{

	@Override                         //extra method
	public void lgCool() {
		System.out.println("Running lgcool in TeslaFreezerImpl");
	}

	@Override
	public void autoCool() {

		System.out.println("running autocool in TeslaFreezerImpl");
	}
	
	

}
