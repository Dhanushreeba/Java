package com.xworkz.collection.runner;

import java.util.Collection;

public class PassBookNoRunner {

	public static void main(String[] args) {

		Collection<Long> passbookNo = Passbook.passBookNo();
		System.out.println("Pass Book number:" + passbookNo);
		System.out.println(" Size:" + passbookNo.size());
		

		int countStartsWithFour = 0;
		for (Long l: passbookNo) {
	
			String passBookNumber = String.valueOf(l);// In this case, it converts the Long value l into a String.

			if (passBookNumber.startsWith("4")) {
				System.out.println("Pass Book number starts with '4'  :" + passBookNumber);
				countStartsWithFour++;
			}

		}

		System.out.println("Count of whose number start with 4 is:" + countStartsWithFour);
		System.out.println("------------------------");
		
		int countWithZero = 0;
		for (Long longer : passbookNo) {
			String passBookNum = String.valueOf(longer);// In this , it converts the Long value longer into a String.
			if (passBookNum.contains("0")) {
				System.out.println("Whose number having '0' in it  :" + passBookNum);
				countWithZero++;
			}

		}
		System.out.println("count of whose passbookno having 0 is:" + countWithZero);
		System.out.println("after execution :"+passbookNo.size());
	}

}
