package com.xworkz.method;

public class Peacock extends Bird {

	public void itWillDance(){
		
		System.out.println("Peacock dance");
	}
	public void longFeather(){
	
		System.out.println("It has LongFeather");
	}
	public void sleep() {
	
		System.out.println("It will sleep");
	}
	
	@Override
	public void fly(){
		
		System.out.println("It will Fly");
	}
	@Override
	public void makesSound(){
	
	System.out.println("it makes Sound");
	}
	@Override
	public void eat() {
		
		System.out.println("Eat food");
	}
}
