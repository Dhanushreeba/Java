package com.xworkz.CollectionDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SoapMethods {
	
	public static Collection<SoapDTO> run(){
		
		SoapDTO soap1=new SoapDTO("LifeBoy", 40, "Red", "Scent", 12.0d, "Rectangle");
		SoapDTO soap2=new SoapDTO("Santoor", 56, "Orange", "Good", 10d, "Ovel");
		SoapDTO soap3=new SoapDTO("Mysore Sandal", 85, "Gold", "Sandal", 15d, "Round");
		SoapDTO soap4=new SoapDTO("Medimix", 35, "Green", "veryGood", 11d, "Square");
		
		Collection<SoapDTO> soapCollection=new ArrayList<SoapDTO>();
		soapCollection.add(soap1);
		soapCollection.add(soap2);
		soapCollection.add(soap3);
		soapCollection.add(soap4);
		
		return soapCollection;
		
		
		
	}

}
