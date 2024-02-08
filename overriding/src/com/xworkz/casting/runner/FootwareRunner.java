package com.xworkz.casting.runner;

import com.xworkz.casting.Flats;
import com.xworkz.casting.Footware;
import com.xworkz.casting.Heels;
import com.xworkz.casting.Shoe;

public class FootwareRunner {

	public static void main(String[] args) {
		
		Heels heels=new Heels();
		
		Footware footware=new Footware();
		heels.Footware(footware);
		
		
		Shoe shoe=new Shoe();
		heels.Footware(shoe);
		
		
		Flats flats=new Flats();
		heels.Footware(flats);
		
		

	}

}
