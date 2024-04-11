package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.Belt;

public class BeltRunner {

	public static void main(String[] args) {

		Belt b=(ref,ref1)->flexibility();
		System.out.println("flexibility belt running in runner");
	}

	private static Object flexibility() {

		System.out.println("running belt in runner");
		return null;
	}

}
