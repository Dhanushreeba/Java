package com.xworkz.interfaceRunner;

import com.xworkz.functionalInterface.lambda.BankAcoount;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAcoount bank=(b,bn) -> {
			
			System.out.println("two parameter and double return type in BankAccount interface");
			System.out.println(b);
			System.out.println(bn);
			return 400.56;
			
		};
		double val=bank.savings(35.98,"SBI");
		System.out.println(val);
		
	}

}
