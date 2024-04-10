package com.xworkz.rules;

public interface MetroRules {

	String GREEN_LINE = "green";
	String PURPLE_LINE = "purple";
	String YELLOW_LINE = "yellow";

	public int buyTicket();

	public boolean cleaniness();

	public boolean excessLuggage();

	public String getLine();

}
