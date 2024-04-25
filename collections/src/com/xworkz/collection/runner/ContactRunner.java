package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class ContactRunner {

	public static void main(String[] args) {

		Collection<Long> contact=new ArrayList<Long>();
		contact.add(9876543210l);
		contact.add(9878743210l);
		contact.add(8976543210l);
		contact.add(7976543210l);
		contact.add(8676543223l);
		contact.add(6076543210l);
		contact.add(9977543210l);
		contact.add(8176543210l);
		contact.add(9026543210l);
		
		System.out.println("Total contact is :"+contact.size());
		
		for(Long c:contact) {
			System.out.println(c);
		}
	}

}
