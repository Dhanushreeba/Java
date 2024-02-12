package com.xworkz.Runner;

import com.xworkz.heirarchy.Animal;
import com.xworkz.heirarchy.Bear;
import com.xworkz.heirarchy.Cat;
import com.xworkz.heirarchy.Cheetah;
import com.xworkz.heirarchy.Cow;
import com.xworkz.heirarchy.Dog;
import com.xworkz.heirarchy.Donkey;
import com.xworkz.heirarchy.Elephant;
import com.xworkz.heirarchy.Horse;
import com.xworkz.heirarchy.Lion;
import com.xworkz.heirarchy.Monkey;
import com.xworkz.heirarchy.Penguin;
import com.xworkz.heirarchy.Squirrel;
import com.xworkz.heirarchy.Tiger;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
	

	Squirrel squirrel=new Squirrel();
	
	Object object=new Object();
	squirrel.run(object);
	
	Object obj=new Animal();
	squirrel.run(obj);
	
	Object obj1=new Lion();
	squirrel.migration(obj1);
	
	Tiger obj2=new Tiger();
	squirrel.Animal(obj2);
	
	Cheetah obj3=new Cheetah();
	squirrel.Animal(obj3);
	
	Elephant obj4=new Elephant();
	squirrel.Animal(obj4);
	
	Monkey obj5=new Monkey();
	squirrel.Animal(obj5);
	
	Donkey obj6=new Donkey();
	squirrel.Animal(obj6);
	
	Bear obj7=new Bear();
	squirrel.Animal(obj7);
	
	Dog obj8=new Dog();
	squirrel.Animal(obj8);
	
	Horse obj9=new Horse();
	squirrel.Animal(obj9);
	
	Cat obj10=new Cat();
	squirrel.Animal(obj10);
	
	Penguin obj11=new Penguin();
	squirrel.Animal(obj11);
	
	Cow obj12=new Cow();
	squirrel.Animal(obj12);
	
	}	
}