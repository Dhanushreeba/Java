package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.CollectionDTO.MarkerDTO;

public class MarkerRunner {

	public static void main(String[] args) {

		MarkerDTO marker = new MarkerDTO("Renylods", "Green", 100, 9);
		MarkerDTO marker1 = new MarkerDTO("Twin Marker", "Black", 55, 10);
		MarkerDTO marker2 = new MarkerDTO("Copic", "Pink", 90, 20);
		MarkerDTO marker3 = new MarkerDTO("Posca", "Red", 80, 8);
		MarkerDTO marker4 = new MarkerDTO("Pentel", "White", 90, 3);
		MarkerDTO marker5 = new MarkerDTO("Sharpie", "Pink", 50, 10);
		MarkerDTO marker6 = new MarkerDTO("Copic", "White", 60, 4);
		MarkerDTO marker7 = new MarkerDTO("Zig", "Orange", 45, 5);
		MarkerDTO marker8 = new MarkerDTO("Pentel", "Blue", 90, 6);
		MarkerDTO marker9 = new MarkerDTO("Prismacolor", "Yellow", 70, 6);

		Collection<MarkerDTO> collectionmarker = new ArrayList<MarkerDTO>();

		collectionmarker.add(marker);
		collectionmarker.add(marker1);
		collectionmarker.add(marker2);
		collectionmarker.add(marker3);
		collectionmarker.add(marker4);
		collectionmarker.add(marker5);
		collectionmarker.add(marker6);
		collectionmarker.add(marker7);
		collectionmarker.add(marker8);
		collectionmarker.add(marker9);
		
		System.out.println("Size:"+collectionmarker.size());
		
		Iterator<MarkerDTO> iterator=collectionmarker.iterator();
		
		while(iterator.hasNext())
		{
			MarkerDTO m=iterator.next();
			if(m.getBrand().equals("Pentel"))
			{
				iterator.remove();
				System.out.println("Removed Branda Name:"+m.getBrand());
			}
		}
		
		System.out.println("*******After Removing***********");
		
		System.out.println("Size:"+collectionmarker.size());
		
		for(MarkerDTO mdto:collectionmarker)
		{
			System.out.println(mdto);
		}
	}

}
