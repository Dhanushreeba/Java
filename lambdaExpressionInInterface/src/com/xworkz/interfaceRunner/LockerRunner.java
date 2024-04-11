package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Locker;

public class LockerRunner {

	public static void main(String[] args) {

		Locker lock=(price)-> {
			
			System.out.println("one parameter with boolean return type in Locker Runner");
			System.out.println(price);
			return true;
		};
		boolean ref=lock.smartLock(500000);
		System.out.println(ref);
		
	}

}
