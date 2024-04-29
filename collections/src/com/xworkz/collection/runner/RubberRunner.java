package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.CollectionDTO.RubberDTO;

public class RubberRunner {

	public static void main(String[] args) {

		RubberDTO rubber1=new RubberDTO("KAPGGRILA", "Blue", "Circular", "9 June 2023");
		RubberDTO rubber2=new RubberDTO("Prostuff.in", "Black", "Round", "12 Oct 2023");
		RubberDTO rubber3=new RubberDTO("Fapiwen", "Blue", "Ovel", "3 Jan 2024");
		RubberDTO rubber4=new RubberDTO("Flexi", "Green", "Rectangle", "23 march 2024");
		RubberDTO rubber5=new RubberDTO("Wolphin", "Grey", "Circule", "20 sep 2023");
		
		Collection<RubberDTO> rubber=new ArrayList<RubberDTO>();
		rubber.add(rubber1);
		rubber.add(rubber2);
		rubber.add(rubber3);
		rubber.add(rubber4);
		rubber.add(rubber5);
		
		System.out.println("Rubber size is :"+rubber.size());
		System.out.println(rubber);
		System.out.println("****************************************");
		
		rubber
		.stream()
		.sorted()
		.filter(r->r.getColor()=="Blue")
		.forEach(r->System.out.println(r));

	}

}
