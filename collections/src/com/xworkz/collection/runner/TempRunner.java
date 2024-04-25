package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class TempRunner {

	public static void main(String[] args) {

		Collection<Double> temp=new ArrayList<Double>();
		temp.add(10d);
		temp.add(26d);
		temp.add(25d);
		temp.add(15d);
		temp.add(19d);
		temp.add(12d);
		temp.add(26d);
		temp.add(28d);
		temp.add(30d);
		temp.add(38d);
		temp.add(17d);
		temp.add(16d);
		temp.add(13d);
		temp.add(11d);
		
		System.out.println("Total temprature is :"+temp.size());
		
		for(Double t:temp) {
			System.out.println(t);
		}
		
		
		
	}

	public static Collection<Double> getTemparature() {

		Collection<Double> ref=new ArrayList<Double>();
		return ref;
	}



}
