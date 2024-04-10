package com.xworkz.rules;

public  class BanashankariMetroRulesimpl implements MetroRules{
	
	public BanashankariMetroRulesimpl() 
	{
		System.out.println("no param.. ..");
	}

	@Override
	public int buyTicket() {
		System.out.println("has Ticket..");
		return 20;
	}

	@Override
	public boolean cleaniness() {
		System.out.println("has cleaniness..");
		return true;
	}

	@Override
	public boolean excessLuggage() {
		System.out.println("has excessLuggage..");
		return false;
	}

	@Override
	public String getLine() {
		System.out.println("get into line..");
		return PURPLE_LINE;
	}
	

}
