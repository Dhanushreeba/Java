package com.xworkz.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.xworkz.mapDTO.DegreeDTO;

public class PersonEduDetails {

	public static void main(String[] args) {
		
		Collection<DegreeDTO> degreeCollection=new ArrayList<DegreeDTO>();
		DegreeDTO degree1=new DegreeDTO("Dhanu", "CSE", 80.4D, "2021");
		DegreeDTO degree2=new DegreeDTO("Chandu", "BscAg", 90.05D, "2022");
		DegreeDTO degree3=new DegreeDTO("Varsha", "CS", 92.04D, "2023");
		DegreeDTO degree4=new DegreeDTO("Sanju", "EEE", 79.5D, "2024");
		
		degreeCollection.add(degree1);
		degreeCollection.add(degree2);
		degreeCollection.add(degree3);
		degreeCollection.add(degree4);
		
		for(DegreeDTO d:degreeCollection) {
			System.out.println("running degree collection...");
			System.out.println(d);
		}
		
		System.out.println("********************");
		Map<String, DegreeDTO> map=new HashMap<String, DegreeDTO>();
		map.put("GMIT",degree1);
		map.put("PES",degree2);
		map.put("SJBIT",degree3);
		map.put("RV",degree4);
		
		map.forEach((name,DegreeDTO)->System.out.println(name + ":" +DegreeDTO));
		
		
		
	}

}
