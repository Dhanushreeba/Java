package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class MessageRunner {

	public static void main(String[] args) {

		Collection<String> message=new ArrayList<String>();
		message.add("Doing task in room");
		message.add("lets have a cup of T!!");
		message.add("Practice makes mans perfect???????????????");
		message.add("working on Collection");
		message.add("Friday is Election");
		message.add("Want to get job...");
		message.add("No festival in next month");
		message.add("it's almost evening now");
		message.add("I'm listening to music");
		message.add("Have to read more");
		
		System.out.println("total refernce of Message is :"+message.size());
		
		for(String m:message) {
			
			System.out.println(m);
			
		}
	}

	public static Collection<String> messageCollection() {

		Collection<String> message1=new ArrayList<String>();
		return message1;
	}

}
