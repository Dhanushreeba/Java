package com.xworkz.method;

public class WoodWindow extends Window {
	
	@Override
	public void open() {
		System.out.println("it is open");
	}
	
	@Override
	public void close() {
		System.out.println("it is close");
	}
	public void autoClose() {
		System.out.println("it is autoclosed");
	}
}
