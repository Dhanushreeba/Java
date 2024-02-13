package com.xworkz.heirarchy;

public class Tiger {

	public void Animal(Animal animal) {
		
		System.out.println(animal.type);
		animal.eat();
		
		if(animal instanceof Lion) {
			Lion lion=(Lion)animal;
			System.out.println(lion.foodType);
			lion.makeSound();
		}
		if(animal instanceof Cheetah) {
			Cheetah cheetah=(Cheetah)animal;
			System.out.println(cheetah.age);
			cheetah.hunting();
		}
		
		if(animal instanceof Elephant) {
			Elephant elephant=(Elephant)animal;
			System.out.println(elephant.scientificName);
			elephant.Aggression();
		}
	}
}
