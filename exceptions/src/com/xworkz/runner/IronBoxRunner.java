package com.xworkz.runner;

import com.xworkz.exception.IronBox;
import com.xworkz.exception.IronBoxException;

public class IronBoxRunner {

	public static void main(String[] args) throws IronBoxException {
		
		IronBox iron=new IronBox();
		try {
			System.out.println("Before execution");
			iron.doesIron("Orient");
			System.out.println("After execution");
		}
		finally {
			System.out.println("running finally in IronBox");
		}

	}

}
