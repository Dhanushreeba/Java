package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.CollectionDTO.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {

		HouseDTO house=new HouseDTO("Dhanu",270,"Mandya",4);
		HouseDTO house1=new HouseDTO("Varsha",271,"Bangalore",4);
		HouseDTO house2=new HouseDTO("Chandu",272,"Mysore",4);
		HouseDTO house3=new HouseDTO("Sanju",273,"Ramanagar",4);
		HouseDTO house4=new HouseDTO("Charii",274,"Germany",4);
		HouseDTO house5=new HouseDTO("Arpitha",275,"Dehli",4);
		HouseDTO house6=new HouseDTO("Amrutha",276,"Mumbai",4);
		HouseDTO house7=new HouseDTO("Jyotsna",277,"Dubai",4);
		HouseDTO house8=new HouseDTO("Hitha",278,"Kolkata",4);
		HouseDTO house9=new HouseDTO("Kavi",279,"Hydrabad",4);
		
		
		Collection<HouseDTO> collectionHouse=new ArrayList<HouseDTO>();
		collectionHouse.add(house);
		collectionHouse.add(house1);
		collectionHouse.add(house2);
		collectionHouse.add(house3);
		collectionHouse.add(house4);
		collectionHouse.add(house5);
		collectionHouse.add(house6);
		collectionHouse.add(house7);
		collectionHouse.add(house8);
		collectionHouse.add(house9);
		
		System.out.println("Size:"+collectionHouse.size());
		
		for(HouseDTO h:collectionHouse) {
			System.out.println(h);
		}
		
		
	}

}
