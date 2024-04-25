package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Passbook {

	public static void main(String[] args) {

		Collection<Long> passbookNo=new ArrayList<Long>();
		passbookNo.add(3874300987452l);
		passbookNo.add(5875000892121l);
		passbookNo.add(4575980067084l);
		passbookNo.add(4573807430092l);
		passbookNo.add(9874698564027l);
		passbookNo.add(3884007434792l);
		passbookNo.add(6738387434492l);
		passbookNo.add(4859859092009l);
		passbookNo.add(4762134253787l);
		passbookNo.add(7900078000083l);
		passbookNo.add(1855567182098l);
		passbookNo.add(4756684958262l);
		
		System.out.println("Total refrence passbookNo is :"+passbookNo.size());
		
		for(Long p:passbookNo) {
			
			System.out.println(p);
		}
		
	}

	public static Collection<Long> passBookNo() {
		
		Collection<Long> ref=new ArrayList<Long>();
		return ref;
	}
	
	

}
