package com.xworkz.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BasketRunner {

	public static void main(String[] args) {

		Set<BasketDTO> basketDTOSet=new HashSet<BasketDTO>();
		BasketDTO basketDTO=new BasketDTO("green", 200, "Floral", "Temple");
		BasketDTO basketDTO1=new BasketDTO("Blue", 200, "Floral", "Temple");
		BasketDTO basketDTO2=new BasketDTO("green", 300, "Box", "Home");
		
		
		basketDTOSet.add(basketDTO);
		basketDTOSet.add(basketDTO1);
		basketDTOSet.add(basketDTO2);
		
		System.out.println("basket :"+basketDTOSet.size());
		
		basketDTO.equals(basketDTO1);
	//	System.out.println("working fine");
		
	}

}
