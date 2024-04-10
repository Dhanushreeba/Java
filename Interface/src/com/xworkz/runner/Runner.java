package com.xworkz.runner;

import com.xworkz.rules.BanashankariMetroRulesimpl;
import com.xworkz.rules.MetroRules;

public class Runner {
	
	public static void main(String[] args) {
		
		MetroRules ref=new BanashankariMetroRulesimpl();
		ref.getLine();
		
		BanashankariMetroRulesimpl ref1=new BanashankariMetroRulesimpl();
		//ref1.buyTicket();
		
		//Object ref2=new MetroAdmin(ref1);
		
		MetroAdmin admin=new MetroAdmin(ref);
		admin.metroAdmin();
		
	}

}
