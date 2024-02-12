package com.xworkz.heirarchy;

public class Squirrel {
	
//	public void work(Object object)throws Throwable{
//		object.clone();
//		object.finalize();
//		object.getClass();
//		object.hashCode();
//		object.notify();
//		object.notifyAll();
//		object.toString();
//		object.wait();
//		object.wait(0);
//		object.wait(0, 0);
//		object.equals(object);
//	}
	
	public void run(java.lang.Object object) {
		if(object instanceof Animal)
		{
		Animal animal=(Animal)object;	
		System.out.println(animal.name);
		animal.migration();
		}
		
		if(object instanceof Lion) {
			Lion lion=(Lion)object;
			System.out.println(lion.foodType);
			lion.eat();
			
		}
		if(object instanceof Tiger) {
			Tiger tiger=(Tiger)object;
			System.out.println(tiger.color);
			tiger.sleep();
			
		}
		if(object instanceof Cheetah) {
			Cheetah cheetah=(Cheetah)object;
			System.out.println(cheetah.age);
			cheetah.hunting();
			
		}
		if(object instanceof Elephant) {
			Elephant elephant=(Elephant)object;
			System.out.println(elephant.type);
			elephant.makeSound();
			
		}
		if(object instanceof Monkey) {
			Monkey monkey=(Monkey)object;
			System.out.println(monkey.speciesName);
			monkey.mimicry();
			
		}
		if(object instanceof Dog) {
			Dog dog=(Dog)object;
			System.out.println(dog.soundType);
			dog.waggingTail();
			
		}
		if(object instanceof Bear) {
			Bear bear=(Bear)object;
			System.out.println(bear.livingType);
			bear.defensiveBehaviors();
			
		}
		if(object instanceof Cat) {
			Cat cat=(Cat)object;
			System.out.println(cat.eyeColor);
			cat.run();
			
		}
		if(object instanceof Horse) {
			Horse horse=(Horse)object;
			System.out.println(horse.scientificName);
			horse.Aggression();
			
		}
		if(object instanceof Penguin) {
			Penguin penguin=(Penguin)object;
			System.out.println(penguin.legType);
			penguin.avoidance();
	
		}
		if(object instanceof Cow) {
			Cow cow=(Cow)object;
			System.out.println(cow.tailType);
			cow.parentalCare();
			
		}
		if(object instanceof Donkey) {
			Donkey donkey=(Donkey)object;
			System.out.println(donkey.lifeSpan);
			donkey.sleepPattern();
			
		}
	
	}
}
