package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message {

	public static void main(String[] args) {
		
	 
	     Collection<String> collection = MessageRunner.messageCollection();

			System.out.println("Total Messages:" + collection.size());

			Iterator<String> itr = collection.iterator();

			while (itr.hasNext()) {
				String msg = itr.next();

				System.out.println("Messages:" + msg);

				if (msg.length() > 30) {
					itr.remove();
				}
			}
			System.out.println();
			System.out.println("Special Charactered Message");

			Iterator<String> itr1 = collection.iterator();

			while (itr1.hasNext()) //this method will always return boolean
			{
				String msg = itr1.next();

				System.out.println(msg);

				Pattern special = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
				Matcher matcher = special.matcher(msg);// name does not contain special characters
				// matcher performs against the pattern
				// System.out.println("Messages:"+msg);

				if (matcher.find()) {
					System.out.println(msg + "Message having Spcial Characters");
				}
			}
			System.out.println();
			System.out.println("After Total Messages:" + collection.size());

			for (String msg : collection) {
				System.out.println(msg);
			}


}
}
