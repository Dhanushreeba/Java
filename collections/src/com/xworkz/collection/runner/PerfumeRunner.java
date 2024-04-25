package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.CollectionDTO.PerfumeDTO;

public class PerfumeRunner {

	public static void main(String[] args) {


		PerfumeDTO perfume = new PerfumeDTO("AXE", "White", 600, "Ambrosia", 12);
		PerfumeDTO perfume1 = new PerfumeDTO("Engage", "Black", 500, "Blissful Breeze.", 8);
		PerfumeDTO perfume2 = new PerfumeDTO("Denver ", "Blue", 1000, "Blossom", 7);
		PerfumeDTO perfume3 = new PerfumeDTO("Fasttrack", "Pink", 600, "Ambrosia", 9);
		PerfumeDTO perfume4 = new PerfumeDTO("Bellavita", "White", 600, "Ambrosia", 2);
		PerfumeDTO perfume5 = new PerfumeDTO("Djokr", "Blue", 600, "Ambrosia", 6);
		PerfumeDTO perfume6 = new PerfumeDTO("Yardley", "Black", 600, "Ambrosia", 18);
		PerfumeDTO perfume7 = new PerfumeDTO("Park Avenue", "Black", 600, "Ambrosia", 19);
		PerfumeDTO perfume8 = new PerfumeDTO("Whattygirl", "Pink", 600, "Ambrosia", 4);
		PerfumeDTO perfume9 = new PerfumeDTO("Fogg", "Black", 600, "Ambrosia", 13);

		Collection<PerfumeDTO> collectionPerfume = new ArrayList<PerfumeDTO>();
		collectionPerfume.add(perfume);
		collectionPerfume.add(perfume1);
		collectionPerfume.add(perfume2);
		collectionPerfume.add(perfume3);
		collectionPerfume.add(perfume4);
		collectionPerfume.add(perfume5);
		collectionPerfume.add(perfume6);
		collectionPerfume.add(perfume7);
		collectionPerfume.add(perfume8);
		collectionPerfume.add(perfume9);
		
		System.out.println("Size:"+collectionPerfume.size());
		
		Iterator<PerfumeDTO> iterator=collectionPerfume.iterator();
		while(iterator.hasNext())
		{
			PerfumeDTO p=iterator.next();
			if(p.getColor().equals("Black"))
			{
				iterator.remove();
				//System.out.println("Removed Color:"+perfume.getBrnadname());
			}
		}
		System.out.println("#########After Removing#########");
		System.out.println("Size:"+collectionPerfume.size());
	
		for(PerfumeDTO pdto:collectionPerfume)
		{
		System.out.println(pdto.getColor());
		}
	
	
	}

}
