package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MethodRunner {

	public static void main(String[] args) {

		Collection<String> collection=new ArrayList<String>();
		collection.add("Black");//implicit refrence
		collection.add("White");
		collection.add("Blue");
		collection.add("Pink");
		collection.add("Red");
		collection.add("Yellow");
		collection.add("Orange");
		collection.add("Green");
		collection.add("Skyblue");
		collection.add("Peach");
		
		System.out.println("total color :"+collection.size());
		
		for(String color:collection) {
			System.out.println(color);//explicit refrence
		}
		
		System.out.println("_______________________________");
		
		Collection<String> collection1=new ArrayList<String>();
		
		collection1.add("Ram Nath Kovind");
		collection1.add("Pranab Mukherjee");
		collection1.add("Pratibha Devisingh Pati");
		collection1.add("DR. A.P.J. Abdul Kalam");
		collection1.add("Droupadi Murmu");
		collection1.add("Shankar Dayal Sharma");
		
		System.out.println("total president :"+collection1.size());
		
		for(String presidents:collection) {
			
			System.out.println(presidents);
		}
		
		System.out.println("------------------------------------");
		
		Collection<String> adrress=new LinkedList<String>();
		adrress.add("Kokkare Bellur");
		adrress.add("Maddur");
		adrress.add("Chanpatna");
		adrress.add("Ramanagara");
		adrress.add("Bidadi");
		adrress.add("Kumbalagudu");
		adrress.add("Kengeri");
		adrress.add("Banashankari");
		adrress.add("BTM");
		adrress.add("Bangalore");
		
		System.out.println("Total address :"+adrress.size());
		
		for(String address:collection) {
			
			System.out.println(address);
		}


	}

}
