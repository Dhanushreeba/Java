package com.xworkz.listMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Numeric {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(10);	
		list.add(20);
		list.add(30);
		list.add(40);
	System.out.println("Before");	
		for(Integer i:list)
		{
			System.out.println(i);
		}
	ListIterator<Integer> listItr=list.listIterator();
	System.out.println("----------After removing 40---------------");

	while(listItr.hasNext())
	{
		Integer i1=listItr.next();
		if(i1==40)
		{
			listItr.remove();
			System.out.println(i1);

		}
		//System.out.println(i);
	}
	//System.out.println(list);
	System.out.println("----------After removing 40---------------");
	for(Integer m:list)
	{
		System.out.println(m);
	}
	System.out.println("----------After adding 50---------------");

	while(listItr.hasNext())
	{
		Integer f=listItr.next();
		//listItr.add(50);
		System.out.println(f);
	}
	listItr.add(50);

	System.out.println(list);

	}

}
