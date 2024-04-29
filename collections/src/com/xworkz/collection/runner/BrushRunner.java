package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.CollectionDTO.BrushDTO;

public class BrushRunner {

	public static void main(String[] args) {

		BrushDTO brush1=new BrushDTO("Orale-b",70,"Plastic","Cup shape");
		BrushDTO brush2=new BrushDTO("Colgate",57,"Fiber","Straight");
		BrushDTO brush3=new BrushDTO("awenest",93,"Wooden","Circular");
		BrushDTO brush4=new BrushDTO("Sensodyne",60,"Plastic","Rectangle");
		BrushDTO brush5=new BrushDTO("Rusable",40,"wood","Straight");
		BrushDTO brush6=new BrushDTO("Orale-b",36,"Fiber","ZigZag");
		BrushDTO brush7=new BrushDTO("Colgate",12,"Plastic","Cup shape");
		BrushDTO brush8=new BrushDTO("Athelas",30,"Fiber","Rectangle");
		BrushDTO brush9=new BrushDTO("Sensodyne",38,"Fiber","ZigZag");
		BrushDTO brush10=new BrushDTO("Orale-b",34,"Plastic","Narrow");
		
		Collection<BrushDTO> brush=new ArrayList<BrushDTO>();
		brush.add(brush1);
		brush.add(brush2);
		brush.add(brush3);
		brush.add(brush4);
		brush.add(brush5);
		brush.add(brush6);
		brush.add(brush7);
		brush.add(brush8);
		brush.add(brush9);
		brush.add(brush10);
		
		System.out.println("size of Collection is :"+brush.size());
		System.out.println(brush);
		System.out.println("********************************");
		
		brush
		.stream()
		.sorted()
		.filter(b -> b.getPrice() > 50)
		.forEachOrdered(b->System.out.println(b));
	
		
	}

}
