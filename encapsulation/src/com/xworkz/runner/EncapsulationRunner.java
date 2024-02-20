package com.xworkz.runner;

import com.xworkz.encapsulation.Basket;
import com.xworkz.encapsulation.Box;
import com.xworkz.encapsulation.Cock;
import com.xworkz.encapsulation.Nailpolish;
import com.xworkz.encapsulation.Pot;

public class EncapsulationRunner {

	public static void main(String[] args) {
			
		Box box=new Box();
		String value=box.getShape();
		System.out.println(value);
		String value1=box.getCapacity();
		System.out.println(value1);//print null value
		box.setShape("Round");
		System.out.println(box.getShape());
		box.setCapacity("1500 Milliliters");
		System.out.println(box.getCapacity());
		box.setMaterial("Polypropylene");
		System.out.println(box.getColor());
		box.setPrice(100);
		String values2=box.getColor();
		System.out.println("Color : " +values2);
		box.setPrice(200);
		System.out.println(box.getPrice());

		Box box1=new Box();
		box1.setShape("Round");
		System.out.println(box1.getShape());
		box1.setCapacity("1000 Milliliters");
		System.out.println(box1.getCapacity());
		box1.setColor("Steel");
		System.out.println(box1.getColor());
		box1.setMaterial("Stainless steel");
		System.out.println(box1.getMaterial());
		box1.setPrice(300);
		System.out.println("Price : " +box1.getPrice());

		box.equals(box1);
		boolean ob=box.equals(box1);
		System.out.println(ob);
		
		Nailpolish nail=new Nailpolish();
		nail.setColor("Red");
		System.out.println(nail.getColor());
		nail.setBrand("Lakme");
		System.out.println(nail.getBrand());
		nail.setPrice(100);
		System.out.println(nail.getPrice());
		nail.setFinishType("Mat");
		System.out.println(nail.getFinishType());
		nail.setOcassion("Party");
		
		Nailpolish nail1=new Nailpolish();
		nail1.setColor("Red");
		System.out.println(nail1.getColor());
		nail1.setBrand("Lakme");
		System.out.println(nail1.getBrand());
		nail1.setPrice(100);
		System.out.println(nail1.getPrice());
		nail1.setFinishType("Glossy");
		System.out.println(nail1.getFinishType());
		nail1.setOcassion("Wedding");
		System.out.println(nail1.getOcassion());
		
		nail.equals(nail1);
		boolean ob1=nail.equals(nail1);
		System.out.println(ob1);
		
		Basket basket=new Basket();
		basket.setPrice(80);
		System.out.println(basket.getPrice());
		basket.setSize("Medium");
		System.out.println(basket.getSize());
		basket.setColor("Brown");
		System.out.println(basket.getColor());
		basket.setMaterial("Plastic");
		System.out.println(basket.getMaterial());
		basket.setBrand("Cutting Edge");
		System.out.println(basket.getBrand());
		
		Basket basket1=new Basket();
		basket1.setPrice(100);
		System.out.println(basket1.getPrice());
		basket1.setSize("Small");
		System.out.println(basket1.getSize());
		basket1.setColor("White");
		System.out.println(basket1.getColor());
		basket1.setMaterial("Fiber");
		System.out.println(basket1.getMaterial());
		basket1.setBrand("Cutting Edge");
		System.out.println(basket1.getBrand());
		
		basket.equals(basket1);
		boolean ob2=basket.equals(basket1);
		System.out.println(ob2);
		
		Pot pot=new Pot();
		pot.setDesign("Stripes");
		System.out.println(pot.getDesign());
		pot.setColor("Peach");
		System.out.println(pot.getColor());
		pot.setPrice(200);
		System.out.println(pot.getPrice());
		pot.setMaterial("Ceramic");
		System.out.println(pot.getMaterial());
		pot.setStyle("Modren");
		System.out.println(pot.getStyle());
		
		Pot pot1=new Pot();
		pot1.setDesign("Plane");
		System.out.println(pot1.getDesign());
		pot1.setColor("Peach");
		System.out.println(pot1.getColor());
		pot1.setPrice(100);
		System.out.println(pot1.getPrice());
		pot1.setMaterial("Ceramic");
		System.out.println(pot1.getMaterial());
		pot1.setStyle("Classic");
		System.out.println(pot1.getStyle());
		
		pot.equals(pot1);
		boolean ob3=pot.equals(pot1);
		System.out.println(ob3);
		
		Cock cock=new Cock();
		cock.setPrice(100);
		System.out.println(cock.getPrice());
		cock.setBrand("Generic");
		System.out.println(cock.getBrand());
		cock.setColor("White");
		System.out.println(cock.getColor());
		cock.setMaterial("Plastic");
		System.out.println(cock.getMaterial());
		cock.setSize("10 Count");
		System.out.println(cock.getSize());
		
		Cock cock1=new Cock();
		cock1.setPrice(100);
		System.out.println(cock1.getPrice());
		cock1.setBrand("Yonex Mavis");
		System.out.println(cock1.getBrand());
		cock1.setColor("Green");
		System.out.println(cock1.getColor());
		cock1.setMaterial("Plastic");
		System.out.println(cock1.getMaterial());
		cock1.setSize("6 Count");
		System.out.println(cock1.getSize());
		
		cock.equals(cock1);
		boolean ob4=cock.equals(cock1);
		System.out.println(ob4);
	}

		
		
	}

