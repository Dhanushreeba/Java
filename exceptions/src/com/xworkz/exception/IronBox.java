package com.xworkz.exception;

public class IronBox {

	public void doesIron(String brand) throws IronBoxException {
		if(brand.equals("Havells")) {
			System.out.println(" first brand ");
		}
		else if(brand.equals("Sky")) {
			System.out.println("another brand");
		}
		else {
			System.out.println("brand is not matched");
			throw new IronBoxException("not our brand");
		}
	}

}
