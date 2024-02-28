package com.xworkz.runner;

import com.xworkz.exception.Movie;

public class MovieTicketNoRunner {

	public static void main(String[] args) {

		try {
			Movie movie=new Movie();
			System.out.println("Before checking");
			movie.sellMovieTicket(2000);
			System.out.println("After checking");
		}
		catch(Exception e) {
			System.err.println("handling exception: "+e.getMessage());
			System.out.println(e.getClass());
		}
		
	}

}
