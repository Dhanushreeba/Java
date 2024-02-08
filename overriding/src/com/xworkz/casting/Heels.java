package com.xworkz.casting;

public class Heels  {
	
	public void Footware(Footware footware) {
		
		System.out.println(footware.material);
		footware.Protect();
		
		if(footware instanceof Footware) {
			Footware footware1=(Footware)footware;
			System.out.println(footware1.material);
			footware1.Protect();
		}
	}
	
	
	public void Shoe(Shoe shoe) {
		
		System.out.println(shoe.brand);
		shoe.Comfortable();
		
		if(shoe instanceof Shoe) {
			Shoe shoe1=(Shoe)shoe;
			System.out.println(shoe1.brand);
			shoe1.Comfortable();
		}
		else if(shoe instanceof Footware) {
			Footware footware=(Footware)shoe;
			System.out.println(footware.material);
			footware.Protect();
			
			
		}
	}
	public void Flats(Flats flats) {
		
		System.out.println(flats.price);
		flats.Fixation();
		
		if(flats instanceof Flats) {
			Flats flats1=(Flats)flats;
			System.out.println(flats1.price);
			flats.Fixation();
		}
		
	}
	

	
}
