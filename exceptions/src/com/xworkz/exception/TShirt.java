package com.xworkz.exception;

public class TShirt {
	
	public void protection(int size) throws Exception{
		
		if(size >=32) {
			System.out.println("size Matched");
		}
		else if(size <32){
			System.out.println("size not Matched");
		}
		else {
			System.out.println("size not Available");
			throw new TShirtNotValidException();
		}
	}

}
