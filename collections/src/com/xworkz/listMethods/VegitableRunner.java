package com.xworkz.listMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VegitableRunner {

	public static void main(String[] args) {
		
		List<String> vegitable=new ArrayList<String>();
		
		System.out.println("-------add()-----------");
		vegitable.add("Carrot");//0
		vegitable.add("Betroot");//1
		vegitable.add("Onion");//2
		vegitable.add("Beans");//3
		
		System.out.println("Before adding vegitable :"+vegitable);//[]array
		for(String v:vegitable) {
			
			System.out.println(v);
		}
		
		System.out.println("after adding vegitable :"+vegitable);
		
		//list2
		List<String> vegitable1=new ArrayList<String>();
		vegitable1.add("Cabbage");
		vegitable1.add("cauliflower");
		vegitable1.add("Brinjal");
		vegitable1.add("Tomato");
		
		System.out.println("----------list2 elements--------");
	//	System.out.println("before adding vegitable :"+vegitable1);
		for(String v1:vegitable1) {
			System.out.println(v1);
		}
		
		vegitable.addAll(2,vegitable1);
		System.out.println("--------addAll()....after Adding all elemnts ---------------------");
		for(String v:vegitable) {
			
			System.out.println(v);
		}
		
	//	System.out.println("after adding vegitable :"+vegitable);
		
		System.out.println("-----------get()...index based------------");
		vegitable.get(3);
		System.out.println(vegitable.get(3));
		
		System.out.println("---------set()....(update)index based-------------");
		vegitable1.set(2, "ginger");
		System.out.println(vegitable1);
		
		System.out.println("--------------indexOf()..index based------------");
		Integer i=vegitable.lastIndexOf("Tomato");
		System.out.println(i);
		
		System.out.println("-----------remove()....index based---------------");
		vegitable.remove(4);
		System.out.println(vegitable);
		
		System.out.println("-----------iterator----------------");
		System.out.println("_____________forward..has only remove()__________________");
		//iterator....it has forward direction only and has remove() methods only..
		Iterator<String> iterator=vegitable.iterator();
		while(iterator.hasNext())
		{
			String s=iterator.next();
			//if(d.va)
			System.out.println(s);
		}
		System.out.println("-----------listIterator----------------");
		System.out.println("-----------frw and bkd..has add and remove----------------");

		System.out.println("-----------forward..has add and remove----------------");
		ListIterator<String> listIterator=vegitable.listIterator();
		while(listIterator.hasNext())
		{
			String q=listIterator.next();
			System.out.println(q);
		}

		System.out.println("-----------Backward..has add and remove----------------");

		while(listIterator.hasPrevious())
		{
			String q=listIterator.previous();
			System.out.println(q);
		}


		System.out.println("-----------forward..with index based----------------");

		ListIterator<String> listIterator2=vegitable.listIterator(2);//index start from2
		while(listIterator2.hasNext())
		{
			String  l=listIterator2.next();
			//System.out.println(listIterator2.next());
			System.out.println(l);
		}

		System.out.println("-----------backward.with index based----------------");// doubt
		ListIterator<String> listIterator3 = vegitable.listIterator(5);// index start from2

		while (listIterator3.hasPrevious()) {
			String kl = listIterator3.previous();
			// System.out.println(listIterator2.next());
			System.out.println(kl);
		}

		System.out.println(" _____Forward Iteration using ListIterator:-----");
		ListIterator<String> listIterator5 = vegitable.listIterator(vegitable.size() -2);
		System.out.println("fruits:" + vegitable.size());

		while (listIterator5.hasNext()) {
			System.out.println(listIterator5.next());
		}

		System.out.println(" -----Backward Iteration using ListIterator:----");
		ListIterator<String> listIterator4 = vegitable.listIterator(vegitable.size() - 2);
		System.out.println("fruits:" + vegitable.size());

		while (listIterator4.hasPrevious()) {
			System.out.println(listIterator4.previous());
		}


	}
		

}
