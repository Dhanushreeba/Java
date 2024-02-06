package com.xworkz.method;

public class Eagle extends Peacock {
	
	public void hunt() {
		
		System.out.println("Hunt for a Food");
	}

	
	public void sharpEye() {
		
		System.out.println("Eagle has sharp eye");
	}
	
	
	public void buildNest() {
		
		System.out.println("It build nest");
	}
	
	@Override
	public void itWillDance(){
		
		System.out.println("Peacock dance");
	}
	
	@Override
	public void longFeather(){
	
		System.out.println("It has LongFeather");
	}
	
	@Override
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
