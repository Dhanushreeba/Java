package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Movie;

public class MovieRunner {

	public static void main(String[] args) {

		Movie m=()->good()?true:false;
		
		System.out.println("running movie Boolean good in runner");
		
		return;
	}

	private static boolean good() {

		System.out.println("running good");
		
		return true;
	}


}
