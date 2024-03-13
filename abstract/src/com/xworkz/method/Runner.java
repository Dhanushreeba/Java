package com.xworkz.method;

import com.xworkz.abstarct.BMRCL;
import com.xworkz.abstarct.Dubai;
import com.xworkz.abstarct.Duplex;
import com.xworkz.abstarct.Factory;
import com.xworkz.abstarct.Factory1;
import com.xworkz.abstarct.Home;
import com.xworkz.abstarct.Metro;
import com.xworkz.abstarct.PrimarySchool;
import com.xworkz.abstarct.School;
import com.xworkz.abstarct.SugarFactory;
import com.xworkz.abstarct.Travel;

public class Runner {

	public static void main(String[] args) {

		//Home h=new Home();//cannot instatiate for abstract class
		Home h=new Duplex();
		Duplex d=new Duplex();
		
		System.out.println("___________________________________");
		
		//Metro metro=new Metro();
		BMRCL bmrcl=new BMRCL();
		Metro metro=new BMRCL();
		bmrcl.build();
		metro.build();
		
		System.out.println("______________________________________");
		
		//Factory factory=new Factory();           can't instatiate for abstract classes
		//Factory1 factory1=new Factory1();
		//SugarFactory sugar=new SugarFactory();
		//factory.price();
		//factory1.running();
		
		//Travel travel=new Travel();
		//Dubai dubai=new Dubai();
		//Travel travel=new Dubai();
		
		//School school=new School();
		PrimarySchool primary=new PrimarySchool();
		School school=new PrimarySchool();
		primary.display();
		school.schoolName="RK";
			
		}
	}


