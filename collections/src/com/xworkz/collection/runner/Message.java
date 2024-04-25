package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

public class Message {

	public static void main(String[] args) {

		
		Collection<String> message=MessageRunner.messageCollection();
	      
	    //  System.out.println("size Before:"+message.size());
	      
	      for(String s:message)
	      {
	    	  System.out.println(s);
	      }
	      
	      Iterator<String> iterator=message.iterator();
	      
	     while(iterator.hasNext()) //this method will always return boolean
	      {
	    	  String itr=iterator.next();
	    	  
	    	  if(itr.length()>30)
	    	  {
	    		  
	    		  iterator.remove();
	    		  
	    	  }
	    	  itr= itr.replaceAll("[^a-zA-Z0-9]"," ");
	     	 System.out.println("after removing special charectors: "+itr);
	     	
	      }
	

}
}
