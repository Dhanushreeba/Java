package com.xworkz.Runner;

import com.xworkz.heirarchy.Animal;
import com.xworkz.heirarchy.Cheetah;
import com.xworkz.heirarchy.Elephant;
import com.xworkz.heirarchy.Lion;
import com.xworkz.heirarchy.Tiger;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Tiger tiger=new Tiger();
		
		Animal animal=new Animal();
		tiger.Animal(animal);
		
		
		Lion lion=new Lion();
		tiger.Animal(lion);
		
		Cheetah cheetah=new Cheetah();
		tiger.Animal(cheetah);
		
		Elephant elephant=new Elephant();
		tiger.Animal(elephant);
	}

}
