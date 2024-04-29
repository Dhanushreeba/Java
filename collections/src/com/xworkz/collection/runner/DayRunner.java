package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.CollectionDTO.DayDTO;

public class DayRunner {

	public static void main(String[] args) {

		DayDTO day1=new DayDTO("Sunday", 3);
		DayDTO day2=new DayDTO("Monday", 5);
		DayDTO day3=new DayDTO("Tuesday", 2);
		DayDTO day4=new DayDTO("Wednesday", 1);
		DayDTO day5=new DayDTO("Thursday", 4);
		DayDTO day6=new DayDTO("Friday", 6);
		DayDTO day7=new DayDTO("Satday", 7);
		
		Collection<DayDTO> day=new ArrayList<DayDTO>();
		day.add(day1);
		day.add(day2);
		day.add(day3);
		day.add(day4);
		day.add(day5);
		day.add(day6);
		day.add(day7);
		
		System.out.println("Days size is :"+day.size());
		
		day
		.stream()
		.sorted()
		.forEach(d->System.out.println(d));

	}

}
