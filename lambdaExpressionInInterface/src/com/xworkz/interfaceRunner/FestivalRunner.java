package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.FestivalCheck;

public class FestivalRunner {

	public static void main(String[] args) {

		FestivalCheck check=new FestivalCheck((item,buy)->false);
		check.check();
		
		System.out.println("after main");
		
	}

}
