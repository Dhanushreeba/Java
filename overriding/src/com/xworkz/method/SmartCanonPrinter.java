package com.xworkz.method;

public class SmartCanonPrinter extends CanonPrinter {
	
	public void  connectToMobile() {
		System.out.println("Connected to Mobile");
	}
	
	@Override
	public void connectToWifi() {
		System.out.println("Connected to wifi");
	}
	
	@Override
	public void print() {
		System.out.println("Printing Method");
	}
	
	@Override
	public void scan() {
		System.out.println("Sacnning Method");
	}
	
	@Override
	public void copy() {
		System.out.println("copying Method");
	}

}
