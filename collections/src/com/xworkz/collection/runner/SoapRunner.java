package com.xworkz.collection.runner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;

import com.xworkz.CollectionDTO.SoapDTO;
import com.xworkz.CollectionDTO.SoapMethods;

public class SoapRunner {

	public static void main(String[] args) {

		Collection<SoapDTO> soapCollection1=SoapMethods.run();
		
		System.out.println("---------add()----------");
		
		for(SoapDTO s1:soapCollection1) {
			
			System.out.println(s1);
		}
		System.out.println("**************before adding like in the below**************");
		
		SoapDTO soap5=new SoapDTO("Pears", 60, "Blue", "nice", 9d, "Ovel");
		soapCollection1.add(soap5);
		
		soapCollection1.add(new SoapDTO("Himalaya", 43, "Peach", "Very nice", 74d, "Star"));
		soapCollection1.add(new SoapDTO("Ponds", 20, "Pink", "Not bad", 35d, "Diamond"));
		soapCollection1.add(new SoapDTO("Dettol", 56, "White", "Better", 32d, "Sqaure"));
		
		for(SoapDTO s1:soapCollection1) {
			
			System.out.println(s1);
		}
		System.out.println("**************After adding like in the above***************");
		

		System.out.println("---------addall()----------");
		
		
		boolean a=Collections.addAll(soapCollection1);
		
		System.out.println("addall() :"+a);
		
		for(SoapDTO s1:soapCollection1) {
		
			System.out.println(s1);
		}
		System.out.println("**************After adding addall()***************");
		
		
		System.out.println("before remove size is :"+soapCollection1.size());
		
		for(SoapDTO s1:soapCollection1) {
			
			System.out.println(s1);
		}
		
		System.out.println("-----------------------------");
		
		SoapDTO temp=new SoapDTO("Ponds", 20, "Marron", "Not bad", 35d, "Diamond");
		soapCollection1.add(temp);
		
		boolean b=soapCollection1.remove(temp);
		
		System.out.println("remove of  data :" +b);
		
		System.out.println("after remove size is :"+soapCollection1.size());
		
		
		
		
//		System.out.println("************remove all()********************");
//	    System.out.println("size before collection1:"+soapCollection1.size());
//
//		
//		for(SoapDTO s1:soapCollection1) {
//			
//			System.out.println(s1);
//		}
//		System.out.println("------------------");
//		System.out.println("size before collection1:"+soapCollection1.size());
//		
//		for(SoapDTO s1:soapCollection1) {
//			
//			System.out.println(s1);
//		}
//		
//		boolean re=soapCollection1.removeAll(soapCollection1); // remove specified(reference)  all elements
//		System.out.println(re);                     //++will not remove twice(repeated element)++
//
//		    System.out.println("size after collection1:"+soapCollection1.size());
		
		System.out.println("-----------size()-------------------");
		
		for(SoapDTO s1:soapCollection1) {
			
			System.out.println(s1);
		}
		
		System.out.println("size of collections :"+soapCollection1.size());
		
		System.out.println("---------steam()--------------");
		
		soapCollection1
		.stream()
		.sorted()
		.forEach(s1->System.out.println(s1));
		
		System.out.println("-------------contains()--------------");
		
		SoapDTO temp1=new SoapDTO("Ponds", 20, "Marron", "Not bad", 35d, "Diamond");
		soapCollection1.add(temp1);//only if added then it return true or else false
		
		boolean b1=soapCollection1.contains(temp1);
		System.out.println("collection :"+b1);
		
//		Iterator<SoapDTO> itr=soapCollection1.iterator();--->it is just to check whether it is working or not
//		
//		while(itr.hasNext())
//		{
//			SoapDTO s1=itr.next();
//			if(s1.getColor().equals("White"))
//			{
//				boolean b2=soapCollection1.contains(s1);
//				System.out.println("contains :"+b2);
//			}
//		}
		
		System.out.println("---------------containsAll()--------------");
		
		boolean b2=soapCollection1.containsAll(soapCollection1);
		System.out.println("Collection containsAll() :"+b2);
		
		
		System.out.println("*****************iterator()****************");
		
		Iterator<SoapDTO> itr=soapCollection1.iterator();
		
		while(itr.hasNext()) {
			
			SoapDTO s1=itr.next();
			if(s1.getBrand().equals(s1.getColor())) 
				
				System.out.println(s1);
				else if(s1.getAroma().equals(s1.getShape()))
				System.out.println(s1);
		}
		
		 System.out.println("------------()----spliterator()-----------------------------------");
         /*
          * Iterator can be used to traverse only Collection types.
          *  But using Spliterator , you can traverse collections, arrays, and streams.
          *   Size of the Iterator is always unknown. 
          *   But, Spliterator can provide you the exact size
          *    ( getExactSizeIfKnown() method) or at least an estimate size ( estimateSize() method).
          */
         Spliterator<SoapDTO> split=soapCollection1.spliterator();

         Long g= split.estimateSize(); //give size ?
        System.out.println(g);
        
        System.out.println("*********************************");

       int f=split.characteristics();//i can use any method which comes after putting .
       System.out.println(f);  //16464 ?



        for(SoapDTO s1: soapCollection1)
	    {
	    	System.out.println(s1);
	    }
		
		
		System.out.println("------------isEmpty()---------------");
		
		System.out.println(soapCollection1.isEmpty());  //returns true if collection  is empty otherwise false
		
		System.out.println("Is empty method :"+soapCollection1);
		
		
		System.out.println("-----------------toArray()--------------------");
		
		Object[] obj=soapCollection1.toArray();
		
		System.out.println("to array :"+obj);// returns [Ljava.lang.Object;@5c0369c4
		
		System.out.println("*********************************");
		System.out.println("to array :"+Arrays.toString(obj));
		System.out.println("*********************************");
		System.out.println("to int :"+Arrays.toString(obj));
		
		System.out.println("-------------------hashcode()--------------------");
		
		int i=soapCollection1.hashCode();
		System.out.println(i);
		System.out.println("*******************************");
		int i1=soapCollection1.hashCode()&Integer.MAX_VALUE;//can be changed to min_value
		System.out.println(i1);

		
		System.out.println("-----------------------retainAll()---------------------");
		
		System.out.println("size before :"+soapCollection1.size());

	     for(SoapDTO s1: soapCollection1)
		    {
		    	System.out.println(s1);
		    }

	   boolean u=  soapCollection1.retainAll(soapCollection1);   //delete all elements but not duplicates
	   System.out.println(u);
	
	     System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

	   for(SoapDTO s1: soapCollection1)
	   {
	   	System.out.println(s1);
	   }

	     System.out.println("size after:"+soapCollection1.size());

	     
	     System.out.println("---------------removeAll()----------------");
	     
	     System.out.println("size soapCollection1 :"+soapCollection1.size());

	     for(SoapDTO s1: soapCollection1)
	     {
	     	System.out.println(s1);
	     }
	     System.out.println("------------------");

	     System.out.println("size soapCollection1 :"+soapCollection1.size());

	     for(SoapDTO s1: soapCollection1)
	     {
	     	System.out.println(s1);
	     }



	       boolean re1=soapCollection1.removeAll(soapCollection1); // remove specified(reference)  all elements
	   System.out.println(re1);                     //++will not remove twice(repeated element)++

	       System.out.println("size after collection1:"+soapCollection1.size());

	       for(SoapDTO s1: soapCollection1)
	       {
	       	System.out.println(s1);
	       }


	       System.out.println("size before soapCollection1:"+soapCollection1.size());
	       
	       
	       
	       System.out.println("----------------removeIf()-----------------------------------");

	       soapCollection1.removeIf(n1->n1.getPrice()==56); //condition

	       for(SoapDTO s1: soapCollection1)
	       {
	       	System.out.println("remove if :"+s1);
	       }


	       System.out.println("----------------clear()-----------------------------------");

	       System.out.println("size before collection:"+soapCollection1.size());

	       soapCollection1.clear();

	       System.out.println("size after collection:"+soapCollection1.size());
	     
	}
	

}
