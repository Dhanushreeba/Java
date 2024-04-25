package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;

public class VoterIdRunner {

	public static void main(String[] args) {

		Collection<Integer> vote=VoterRunner.getVoterIds();
		Iterator<Integer> itr=vote.iterator();
		while(itr.hasNext())
		{
			Integer id =itr.next();
			if(id.equals(4432638))
			{
				System.out.println("no of voterid's before remove:"+vote.size());
				
				itr.remove();
				System.out.println("no of voterid's after remove:"+vote.size());
			}
		}
		
	}

}
