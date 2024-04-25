package com.xworkz.collection.runner;

import java.util.ArrayDeque;
import java.util.Collection;

import com.xworkz.CollectionDTO.BellDTO;

public class BellRunner {

	public static void main(String[] args) {

		BellDTO bell=new BellDTO("Gold","TempleBell",45d,23,3.5d,2000);
		BellDTO bell1=new BellDTO("Metal","Door",10d,24,3d,500);
		BellDTO bell2=new BellDTO("Silver","ShopBell",25d,10,6.5d,700);
		BellDTO bell3=new BellDTO("Bronze","RoomBell",5d,5,1.5d,1000);
		BellDTO bell4=new BellDTO("Aliminium","ChurchBell",60d,53,5.5d,5000);
		BellDTO bell5=new BellDTO("Brass","HandBell",45d,23,3.5d,200);
		BellDTO bell6=new BellDTO("Copper","SlighBell",45d,23,3.5d,1000);
		BellDTO bell7=new BellDTO("Steel","BicycelBell",45d,23,3.5d,100);
		BellDTO bell8=new BellDTO("Iron","SchoolBell",45d,23,3.5d,2000);
		BellDTO bell9=new BellDTO("Platinum","TempleBell",45d,23,3.5d,4000);
		
		Collection<BellDTO> collectionBell= new ArrayDeque<BellDTO>();
		collectionBell.add(bell);
		collectionBell.add(bell1);
		collectionBell.add(bell2);
		collectionBell.add(bell3);
		collectionBell.add(bell4);
		collectionBell.add(bell5);
		collectionBell.add(bell6);
		collectionBell.add(bell7);
		collectionBell.add(bell8);
		collectionBell.add(bell9);
		
		System.out.println("Size:"+collectionBell.size());
		
		for(BellDTO b:collectionBell)
		{
			System.out.println(b);
		}
		
		int bellcountgreaterthan1000=0;
		for(BellDTO b1:collectionBell)
		{
			
			if(b1.getPrice()>1000)
			{
				System.out.println("Bell cost  greater than 1000:"+b1.getMetalUsed());
				bellcountgreaterthan1000++;
			}
		}
		System.out.println("No_of Bell:"+bellcountgreaterthan1000);
		
		System.out.println("--------------------------------------");
		for(BellDTO b2:collectionBell)
		{
			if(b2.getMetalUsed().equals("Bronze"))
			{
				System.out.println("Bronze metal:"+b2.getMetalUsed());
			}
		}
		
		System.out.println("---------------------------------------");
		for(BellDTO b3:collectionBell)
		{
			if(b3.getHeight()==b3.getWeight())
			{
				System.out.println("Height and weight  has same:"+b3.getType());
			}
		}
		
	}

}
