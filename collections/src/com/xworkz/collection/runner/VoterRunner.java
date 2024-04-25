package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class VoterRunner {

	public static void main(String[] args) {

		Collection<Integer> voterId=new ArrayList<Integer>();
		
		voterId.add(8479346);
		voterId.add(9874849);
		voterId.add(8479346);
		voterId.add(6474397);
		voterId.add(5479470);
		voterId.add(4432638);
		voterId.add(5479470);
		voterId.add(6456838);
		voterId.add(9868843);
		voterId.add(8479346);
		
		System.out.println("Total voterId is :"+voterId.size());
		
		for(Integer v:voterId) {
			System.out.println(v);
		}
		
	}

	public static Collection<Integer> getVoterIds() {

		Collection<Integer> voter=new ArrayList<Integer>();
		return voter;
	}

}
