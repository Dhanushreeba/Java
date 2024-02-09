package com.xworkz.casting;

public class Tv {
	
	public void Television(Television tel) {
		
		System.out.println(tel.price);
		tel.display();
		
		if(tel instanceof SmartTv) {
			
			SmartTv smart=(SmartTv)tel;
			System.out.println(smart.smartTvType);
			smart.quality();
		}
			
		if(tel instanceof HomeTheater) {
			
			HomeTheater homeTheater=(HomeTheater)tel;
			System.out.println(homeTheater.screenSize);
			homeTheater.entertainment();
		}
		
	}

}
