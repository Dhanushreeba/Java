package com.xworkz.Runner;

import com.xworkz.heirarchy.*;

public class UnibicRunner {

	public static void main(String[] args) {
		
		Jeera jeera=new Jeera();
		
		UnibicBiscuit biscuit=new UnibicBiscuit();
		jeera.UnibicBiscuit(biscuit);
		
		Cashew cashew=new Cashew();
		jeera.UnibicBiscuit(cashew);
		
		Chocolate chocolate=new Chocolate();
		jeera.UnibicBiscuit(chocolate);
		
		GingerNut gingerNut=new GingerNut();
		jeera.UnibicBiscuit(gingerNut);
		
		PistaBadam pistaBadam=new PistaBadam();
		jeera.UnibicBiscuit(pistaBadam);
		
	}
}
