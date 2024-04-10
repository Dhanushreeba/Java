package com.xworkz.multipleinheritance;

public interface LgFreezer extends Freezer{

	public void lgCool();
	
	@Override
	default void autoCool() {
		
	}
}
