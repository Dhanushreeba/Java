package com.xworkz.exception;

public class Movie {
	
	public void sellMovieTicket(int ticketNo) throws Exception {
		if(ticketNo > 0) {
			System.out.println("Valid ticketNo");
		}
		else if(ticketNo <= 5000) {
			System.out.println("Valid ticketNo");
		}
		else {
			System.out.println("Invalid ticketNo");
			throw new ValidTicketNoException("ticketNo is Not available");
		}
		
	}
	

}
