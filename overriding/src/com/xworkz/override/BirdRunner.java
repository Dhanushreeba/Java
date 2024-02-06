package com.xworkz.override;

import com.xworkz.method.Bird;
import com.xworkz.method.Eagle;
import com.xworkz.method.Peacock;

public class BirdRunner {

	public static void main(String[] args) {
		
		Bird bird=new Bird();
		bird.eat();
		bird.fly();
		bird.makesSound();
		System.out.println("*********************************");
		
		Peacock peacock=new Peacock();
		peacock.itWillDance();
		peacock.longFeather();
		peacock.sleep();
		peacock.eat();
		peacock.fly();
		peacock.makesSound();
		System.out.println("*********************************");
		
		
		
		Eagle eagle=new Eagle();
		eagle.hunt();
		eagle.sharpEye();
		eagle.buildNest();
		eagle.eat();
		eagle.fly();
		eagle.makesSound();
		eagle.itWillDance();
		eagle.longFeather();
		eagle.sleep();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		Peacock pe=new Eagle();
		pe.eat();
		pe.fly();
		pe.makesSound();
		pe.itWillDance();
		pe.longFeather();
		pe.sleep();
		
		
		Bird b=new Peacock();
		b.eat();
		b.fly();
		b.makesSound();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		

		Bird bi=(Peacock)peacock;
		bi.eat();
		bi.fly();
		bi.makesSound();
		System.out.println("###########################################");
		
		Peacock p=(Eagle)eagle;
		p.eat();
		p.fly();
		p.makesSound();
		p.itWillDance();
		p.longFeather();
		p.sleep();
		
		Eagle e=(Eagle)eagle;
		e.eat();
		e.fly();
		e.makesSound();
		e.itWillDance();
		e.longFeather();
		e.sleep();
		e.hunt();
		e.sharpEye();
		e.buildNest();
		

	}

}
