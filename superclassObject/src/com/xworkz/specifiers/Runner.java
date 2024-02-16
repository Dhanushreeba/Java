package com.xworkz.specifiers;

import com.xworkz.objectMethods.Button;
import com.xworkz.objectMethods.Carrom;
import com.xworkz.objectMethods.Fan;
import com.xworkz.objectMethods.Glass;
import com.xworkz.objectMethods.Lace;
import com.xworkz.objectMethods.Ladder;
import com.xworkz.objectMethods.Mug;
import com.xworkz.objectMethods.Plate;
import com.xworkz.objectMethods.Shoe;
import com.xworkz.objectMethods.Socks;
import com.xworkz.objectMethods.Stand;
import com.xworkz.objectMethods.Belt;

public class Runner {

	public static void main(String[] args) {
		
		Glass g=new Glass();
		 g.size='M';
		 g.length=6;
		 g.shape="Wide";
		 g.weight=1.2;
		 g.brand="Syanka";
		 g.price=700;
		 g.pattren="Solid"; 
		 g.theme="Wedding";
		 
		 Glass g1=new Glass();
		 g1.size='S';
		 g1.length=4;
		 g1.shape="Tall";
		 g1.weight=1.4;
		 g1.brand="pigeon";
		 g1.price=200;
		 g1.pattren="Floral";
		 g1.theme="Normal";
		 
		 Glass g2=new Glass();
		 g2.size='L';
		 g2.length=6;
		 g2.shape="Tall";
		 g2.weight=12.4;
		 g2.brand="Yera";
		 g2.price=200;
		 g2.pattren="Plane";
		 g2.theme="Fun";
		 
		 
		 g.equals(g1);
		 boolean o=g.equals(g1);
	 	 System.out.println(o);
			
		 g1.equals(g2);
	   	 boolean ob=g1.equals(g2);
		 System.out.println(ob);
			
			
			Ladder l=new Ladder();
			l.brand="‎Bathla";
			l.price=3000;
			l.material="‎Aluminium";
			l.color="Silver";
			l.weight="50";
			l.specialFetuare="‎Foldable";
			l.warranty=5;
			l.capacity=98;
			
			Ladder l1=new Ladder();
			l1.brand="‎Plantex";
			l1.price=200;
			l1.material="‎Aluminium";
			l1.color="Grey";
			l1.weight="40";
			l1.specialFetuare="‎Foldable";
			l1.warranty=4;
			l1.capacity=40;
			
			Ladder l2=new Ladder();
			l2.brand="‎Bathla";
			l2.price=200;
			l2.material="‎Alloy Steel";
			l2.color="Blue";
			l2.weight="60";
			l2.specialFetuare="‎Durable";
			l2.warranty=4;
			l2.capacity=50;
			
			
			l.equals(l1);
			boolean o1=l1.equals(l1);
			System.out.println(o1);
			
			l1.equals(l2);
			boolean ob1=l1.equals(l2);
			System.out.println(ob1);
			
		 
			Plate p=new Plate();
			p.material="‎Areca Leaf";
			p.brand="ECO SOUL";
			p.occasion="All Occasions";
			p.length=26;
			p.price=12;
			p.style="‎Modern";
			p.shape="Round";
			p.weight=500;
			
			Plate p1=new Plate();
			p1.material="‎Stainless Steel";
			p1.brand="Storehaus";
			p1.occasion="Wedding";
			p1.length=26;
			p1.price=13;
			p1.style="Contemporary";
			p1.shape="Round";
			p1.weight=30;
			
			Plate p2=new Plate();
			p2.material="‎Fiber";
			p2.brand="pigeon";
			p2.occasion="All Occasions";
			p2.length=26;
			p2.price=12;
			p2.style="‎Modern";
			p2.shape="Square";
			p2.weight=30;
			
			p.equals(p1);
			boolean o2=p1.equals(p1);
			System.out.println(o2);
			
			p1.equals(p2);
			boolean ob2=p1.equals(p2);
			System.out.println(ob2);
			
			
			Mug m=new Mug();
			m.brand="Earth Store";
			m.pattren="‎Letter Print";
			m.color="‎Dark Blue";
			m.height=10;
			m.price=250;
			m.specialFeture="Microwave Safe";
			m.material="Ceramic";
			m.netQuantity=1;
			
			Mug m1=new Mug();
			m1.brand="KiKiluxxa";
			m1.pattren="Solid";
			m1.color="‎Dark Blue";
			m1.height=20;
			m1.price=300;
			m1.specialFeture="Hot Drinks";
			m1.material="Glass";
			m1.netQuantity=1;
			
			Mug m2=new Mug();
			m2.brand="Earth Store";
			m2.pattren="‎Plane";
			m2.color="‎Blue";
			m2.height=10;
			m2.price=250;
			m2.specialFeture="Microwave Safe";
			m2.material="Dishwasher Safe";
			m2.netQuantity=2;
			
			
			m.equals(m1);
			boolean o3=m1.equals(m1);
			System.out.println(o3);
			
			m1.equals(m2);
			boolean ob3=m1.equals(m2);
			System.out.println(ob3);
			
			
			Carrom c=new Carrom();
			c.brand="‎Volatility";
			c.price=1500;
			c.material="Wood";
			//c.length=‎81.3;
			c.theme="Wood";
			c.genre="Family";
			c.noOfPlayers=4;
			c.weight=400;
			
			Carrom c1=new Carrom();
			c1.brand="‎Volatility";
			c1.price=1000;
			c1.material="Fibre";
			//c1.length=‎70.2;
			c1.theme="Engineered Wood";
			c1.genre="Friends";
			c1.noOfPlayers=2;
			c1.weight=300;
			
			Carrom c2=new Carrom();
			c2.brand="‎GSI";
			c2.price=1500;
			c2.material="Wood";
			//c2.length=‎5.22;
			c2.theme="Wood";
			c2.genre="Friends";
			c2.noOfPlayers=4;
			c2.weight=400;
			
			
			c.equals(c1);
			boolean o4=c1.equals(c1);
			System.out.println(o4);
			
			c1.equals(c2);
			boolean ob4=c1.equals(c2);
			System.out.println(ob4);
			
			
			Stand s=new Stand();
			s.color="Black";
			s.mountingType="Floor Stand";
			s.compatibleDevices="‎Cellphone";
			s.width=5.62;
			s.brand="Tygot";
			s.modelNumber="T-7feet";
			s.weight=265;
			s.length=35;
			
			Stand s1=new Stand();
			s1.color="Grey";
			s1.mountingType="Floor Stand";
			s1.compatibleDevices="‎Camera";
			s1.width=7.2;
			s1.brand="‎Furniture Cafe";
			s1.modelNumber="‎Set top box whitet";
			s1.weight=300;
			s1.length=35;
			
			Stand s2=new Stand();
			s2.color="White";
			s2.mountingType="Wall Mounted";
			s2.compatibleDevices="‎TV";
			s2.width=5.2;
			s2.brand="Tygot";
			s2.modelNumber="‎AVZ WASHING MACHINE ALLUMINIUM";
			s2.weight=305;
			s2.length=40;
			
			
			s.equals(s1);
			boolean o5=s1.equals(s1);
			System.out.println(o5);
			
			s1.equals(s1);
			boolean ob5=s1.equals(s2);
			System.out.println(ob5);
			
			
			Button b=new Button();
			b.brand="‎Dasya Enterprises";
			b.shape="Round";
			b.color="White";
			b.size="‎Pack of 500";
			b.price=600;
			b.noOfHoles=4;
			b.material="Plastic";
			b.netQuantity=1;
			
			Button b1=new Button();
			b1.brand="Ani Accessories";
			b1.shape="Round";
			b1.color="Gold";
			b1.size="Medium";
			b1.price=500;
			b1.noOfHoles=2;
			b1.material="Fiber";
			b1.netQuantity=2;
			
			Button b2=new Button();
			b2.brand="Ani Accessories";
			b2.shape="Square";
			b2.color="White";
			b2.size="Small";
			b2.price=600;
			b2.noOfHoles=2;
			b2.material="Plastic";
			b2.netQuantity=1;
			
			
			b.equals(b1);
			boolean o6=b1.equals(b);
			System.out.println(o6);
			
			b1.equals(b2);
			boolean ob6=b2.equals(b2);
			System.out.println(ob6);
			
			
			Fan f=new Fan();
			f.mountingType="Ceiling Fan";
			f.price=2000;
			f.color="Brown";
			f.weigth=4;
			f.design="Ceiling";
			f.style="Efficio Alpha";
			f.wattage=35;
			f.length=1;
			
			Fan f1=new Fan();
			f1.mountingType="Stand Fan";
			f1.price=1000;
			f1.color="Black";
			f1.weigth=3;
			f1.design="Stand";
			f1.style="Remote Control";
			f1.wattage=40;
			f1.length=12;
			
			Fan f2=new Fan();
			f2.mountingType="Ceiling Fan";
			f2.price=3000;
			f2.color="White";
			f2.weigth=2;
			f2.design="Ceiling";
			f2.style="On-Off";
			f2.wattage=36;
			f2.length=2;
			
			f.equals(f1);
			boolean o7=f1.equals(f);
			System.out.println(o7);
			
			f1.equals(f2);
			boolean ob7=f1.equals(f2);
			System.out.println(ob7);
			
			Shoe sh=new Shoe();
			sh.warranty=1;
			sh.paymentType="Online";
			sh.shoppingType="Offline";
			sh.laceColor="White";
			sh.price=4000;
			sh.size=5;
			sh.width=21;
			sh.weight="800 g";
			
			Shoe sh1=new Shoe();
			sh1.warranty=2;
			sh1.paymentType="Cash";
			sh1.shoppingType="Online";
			sh1.laceColor="Wood color";
			sh1.price=2000;
			sh1.size=6;
			sh1.width=20;
			sh.weight="700 g";
			
			Shoe sh2=new Shoe();
			sh2.warranty=1;
			sh2.paymentType="Cash";
			sh2.shoppingType="Offline";
			sh2.laceColor="Black";
			sh2.price=2000;
			sh2.size=5;
			sh2.width=21;
			sh2.weight="750 g";
			
			sh.equals(sh1);
			boolean o8=sh.equals(sh1);
			System.out.println(o8);
			
			sh1.equals(sh2);
			boolean ob8=sh1.equals(sh2);
			System.out.println(ob8);
			
			Socks sc=new Socks();
			sc.brand="Jockey";
			sc.size="Free Size";
			sc.price=120;
			sc.color="Black";
			sc.length=12;
			sc.careInstructions="Handwash Only";
			sc.materialComposition="Cotton, Spandex & Nylon";
			sc.width=10;
			
			Socks sc1=new Socks();
			sc1.brand="RC Royal";
			sc1.size="Free Size";
			sc1.price=300;
			sc1.color="Grey";
			sc1.length=10;
			sc1.careInstructions="Machine Wash";
			sc1.materialComposition="Woolen and Spandex";
			sc1.width=12;
			
			Socks sc2=new Socks();
			sc2.brand="Jockey";
			sc2.size="Free Size";
			sc2.price=100;
			sc2.color="White";
			sc2.length=13;
			sc2.careInstructions="Machine wash and Handwash";
			sc2.materialComposition="Cotton and Nylon";
			sc2.width=9;
			
			sc.equals(sc1);
			boolean o9=sc.equals(sc1);
			System.out.println(o9);
			
			sc1.equals(sc2);
			boolean ob9=sc1.equals(sc2);
			System.out.println(ob9);
			
			Lace la=new Lace();
			la.brand="Divara";
			la.netQuantity="0.5 Kilograms";
			la.weight=4;
			la.color="cream";
			la.price=260;
			la.length=5;
			la.material="Silk";
			la.usedFor="Saree";
			
			Lace la1=new Lace();
			la1.brand="	BR lace";
			la1.netQuantity="10 meter";
			la1.weight=1;
			la1.color="Pink";
			la1.price=200;
			la1.length=7;
			la1.material="Cotton";
			la1.usedFor="Shoe";
			
			Lace la2=new Lace();
			la2.brand="GOELX";
			la2.netQuantity="18 meter";
			la2.weight=2;
			la2.color="Copper";
			la2.price=260;
			la2.length=9;
			la2.material="Fabric";
			la2.usedFor="Dupatta";
			
			la.equals(la1);
			boolean o10=la1.equals(la1);
			System.out.println(o10);
			
			la1.equals(la2);
			boolean ob10=la1.equals(la2);
			System.out.println(ob10);
			
			Belt belt=new Belt();
			belt.length=7.88;
			belt.type="waist belt";
			belt.price=1000;
			belt.material="Leather";
			belt.beltWearerName="Sanjana";
			belt.weight=200;
			belt.paymentType="Cash";
			belt.modelNumber="COALT15-Tan-New";
			
			Belt belt1=new Belt();
			belt1.length=6.8;
			belt1.type="Stomach belt";
			belt1.price=500;
			belt1.material="Plastic";
			belt1.beltWearerName="Charitha";
			belt1.weight=100;
			belt1.paymentType="Online";
			belt1.modelNumber="SDWK-GLBL-01-03(BLK-CRM)";
			
			Belt belt2=new Belt();
			belt2.length=8.02;
			belt2.type="Stomach belt";
			belt2.price=600;
			belt2.material="Metal";
			belt2.beltWearerName="Dhanu";
			belt2.weight=300;
			belt2.paymentType="Offline";
			belt2.modelNumber="B07YNS2CPC";
			
			belt.equals(belt);
			boolean o11=belt1.equals(belt);
			System.out.println(o11);
			
			belt1.equals(belt2);
			boolean ob11=belt.equals(belt2);
			System.out.println(ob11);
			
	}

}
