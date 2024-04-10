package com.xworkz.runner;

//import com.xworkz.rules.BanashankariMetroRulesimpl;
import com.xworkz.rules.MetroRules;

public class MetroAdmin {
	
	private MetroRules metro;
	
	//private BanashankariMetroRulesimpl banashankari;
	
	
	public MetroAdmin(MetroRules metro) {
		
		this.metro=metro;
				
	}
	public void metroAdmin() {
		if(metro!=null)
		{
//			if(metro.cleaniness() && metro.excessLuggage()) 
			
			if(metro.cleaniness()){
				
				System.out.println("lines are working good...");
			}
			else
			{
				System.out.println("false");
			}
			if(metro.buyTicket()<=100) {
				System.out.println("affordable");
			}
			else{
				System.out.println("not affordable");
			}
		}
		
	}
	

}
