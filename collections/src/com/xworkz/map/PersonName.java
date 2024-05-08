package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

public class PersonName {

	public static void main(String[] args) {

		Map<String, String> map=new HashMap<String, String>();
		map.put("dhanu@gmail.com", "Dhanushree");
		map.put("sanju@gmail.com", "Sanjana");
		map.put("charii@gmail.com", "Charitha");
		map.put("varsha@gmail.com", "Varshitha");
		map.put("chanu@gmail.com", "Chandrashekar");
		
		map.forEach((email,name)->System.out.println(email +": "+name));
	}

}
