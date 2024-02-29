package com.xworkz.runner;

import com.xworkz.exception.TShirt;
import com.xworkz.exception.TShirtNotValidException;

public class TShirtRunner {

	public static void main(String[] args) throws Exception {

		TShirt t=new TShirt();
		try {
		System.out.println("befor matched");
		t.protection(34);
		System.out.println("after matched");
	}
		catch(TShirtNotValidException ts){
			System.err.println("handling exception :" +ts.getMessage());
		} 
		try {
			System.out.println("size is correct");
			t.protection(30);
			System.out.println("size is Incorrect");
		}
		catch(TShirtNotValidException ts) {
			System.err.println("exception handling :" +ts.getStackTrace());
		}
}

}
