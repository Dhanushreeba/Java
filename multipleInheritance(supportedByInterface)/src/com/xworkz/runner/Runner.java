package com.xworkz.runner;

import com.xworkz.multipleinheritance.Freezer;
import com.xworkz.multipleinheritance.LgFreezerAssocation;
import com.xworkz.multipleinheritance.SamsungFreezer;
import com.xworkz.multipleinheritance.TeslaFreezer;
import com.xworkz.multipleinheritance.TeslaFreezerImpl;

public class Runner {

	public static void main(String[] args) {

		Freezer fz=new TeslaFreezerImpl();
		fz.autoCool();
		
//		TeslaFreezerImpl tesla=new TeslaFreezerImpl();
//		tesla.autoCool();
		
		TeslaFreezerImpl lg=new TeslaFreezerImpl();
		
		LgFreezerAssocation lG = new LgFreezerAssocation(lg);
	
		
		TeslaFreezer t=new TeslaFreezerImpl();
		
		SamsungFreezer samsung=new TeslaFreezerImpl();
		
		//TeslaFreezer tesla=new TeslaFreezer(); //cannot be instantiate
		
		TeslaFreezer tesla=new TeslaFreezerImpl();
		
		LgFreezerAssocation lgFreezer=new LgFreezerAssocation(lg);
		lgFreezer.autoCool();
		
		samsung.autoCool();
		
		lgFreezer.lgCool();
	}

}
