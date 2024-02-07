package com.xworkz.casting.runner;

import com.xworkz.casting.Handwash;
import com.xworkz.casting.Home;
import com.xworkz.casting.Lux;
import com.xworkz.casting.Sanitizer;
import com.xworkz.casting.Soap;

public class HomeRunner {

	public static void main(String[] args) {
		
		Home home=new Home();
		
		Handwash handwash=new Handwash();
		home.runHandwash(handwash);
		
		Sanitizer sanitizer=new Sanitizer();
		home.Sanitizer(sanitizer);
		
		Soap soap=new Soap();
		home.Soap(soap);
		
		Lux lux=new Lux();
		home.Lux(lux);
	}

}
