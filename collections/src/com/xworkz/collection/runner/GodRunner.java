package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.CollectionDTO.GodDTO;

public class GodRunner {

	public static void main(String[] args) {

		GodDTO god1=new GodDTO("Shiva", "Kailasa", "Male", "Kalabhairava", "Destroy EveryThing");
		GodDTO god2=new GodDTO("Vishnu", "Vaikunta", "Male", "Venkateshwara", "SudarshanaChakra");
		GodDTO god3=new GodDTO("Parvathi", "Kailasa", "Female", "Kempamma", "Nature");
		GodDTO god4=new GodDTO("Lakshmi", "Vaikunta", "Female", "AdrustaLakshmi", "Rich");
		GodDTO god5=new GodDTO("Bramha", "Air", "Male", "bramha", "Creater");
		GodDTO god6=new GodDTO("Indra", "IndraLokha", "Male", "Indra", "Protect");
		GodDTO god7=new GodDTO("Saraswathi", "Air", "Female", "VidyaSarsaswathi", "Education");
		GodDTO god8=new GodDTO("Surya", "SuryaLokha", "Male", "Sun", "Brightness");
		GodDTO god9=new GodDTO("Ganga", "River", "Female", "Water", "Give water to use");
		GodDTO god10=new GodDTO("vishnu", "Vaikunta", "Male", "Venkateshwara", "give vara");
		
		
		Collection<GodDTO> godCollection=new ArrayList<GodDTO>();
		godCollection.add(god1);
		godCollection.add(god2);
		godCollection.add(god3);
		godCollection.add(god4);
		godCollection.add(god5);
		godCollection.add(god6);
		godCollection.add(god7);
		godCollection.add(god8);
		godCollection.add(god9);
		godCollection.add(god10);
		
		System.out.println("god collection size is :"+godCollection.size());
		
		godCollection
		.stream()
		.map(g->g.getName())
		.sorted()
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
//		.map(g->g.getPlace())
		.sorted((g1,g2)->g1.getPlace().compareTo(g2.getPlace()))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
//		.map(g->g.getPlace())
		.sorted((g1,g2)->g2.getPlace().compareTo(g1.getPlace()))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
		.filter(g->g.getGender().equalsIgnoreCase("Male"))
		.sorted((g1,g2)->g1.getAvatar().compareTo(g2.getAvatar()))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
		.filter(g->g.getGender().equalsIgnoreCase("Female"))
		.sorted((g1,g2)->g1.getAvatar().compareTo(g2.getAvatar()))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
		.map(g->g.getPlace())
		.sorted((g1,g2)->g2.compareTo(g1))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
		.map(g->g.getSpecialPower())
		.sorted((g1,g2)->g2.compareTo(g1))
		.forEach(g->System.out.println(g));
		
		System.out.println("*****************************");
		
		godCollection
		.stream()
		.filter(g->g.getName().equals("Vishnu") && g.getPlace().equals("Vaikunta"))
//		.map(g->(g.getPlace()))
//		.sorted((g1,g2)->g1.getName().compareTo(g2.getName()))
		.map(g->g.getName()) // Combine name and place
//	    .sorted((g1,g2)->g1.compareTo(g2)) will get desc order only if we do equals ignore case
		.forEach(g->System.out.println(g));
	}

}
