package com.xworkz.method;

public class CanonPrinter extends Printer {
	
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
