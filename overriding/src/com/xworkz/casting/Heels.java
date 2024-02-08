package com.xworkz.casting;

public class Heels  {
	
	public void Footware(Footware footware) {
		
		System.out.println(footware.material);
		footware.protect();
		
		if(footware instanceof Shoe) {
			Shoe shoe=(Shoe)footware;
			System.out.println(shoe.brand);
			shoe.comfortable();
			
			if(footware instanceof Flats) {
				Flats flats=(Flats)footware;
				System.out.println(flats.price);
				flats.fixation();
				
			}
			
				if(footware instanceof Footware) {
					Footware footware1=(Footware)footware;
					System.out.println(footware1.material);
					footware.protect();
				}
		}
	}
	
	
	
}
