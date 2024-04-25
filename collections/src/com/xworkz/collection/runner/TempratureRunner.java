package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

public class TempratureRunner {

	public static void main(String[] args) {

		Collection<Double> temp= TempRunner.getTemparature();
		for(Double d:temp)
		{
			if(d>20)
				System.out.println("Temperature greater than 20 is: "+d);
		//		System.out.println("Print:"+TempRunner.getTemparature());
				
			if(d<20)
				System.out.println("Temperature less than 20 is: "+d);
		}
		for(Double a:temp)
		{
			if(a>15)
				temp.remove(a);
		
		}
//		will get Exception in thread "main" while we use above that is  "java.util.ConcurrentModificationException" so we have to use  iterator method
		
				Iterator<Double> temp1=temp.iterator();
				while (temp1.hasNext()) {
					Double d = temp1.next();
					if (d < 15) {
						temp1.remove();
					}
				}
				
			}

}
