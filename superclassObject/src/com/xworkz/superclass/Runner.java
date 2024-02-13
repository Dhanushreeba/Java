package com.xworkz.superclass;


import com.xworkz.object.Battery;
import com.xworkz.object.Colgate;
import com.xworkz.object.Paint;
import com.xworkz.object.Ring;
import com.xworkz.object.SwitchBoard;
import com.xworkz.object.Table;
import com.xworkz.object.Tie;


public class Runner {
	
	public static void main(String[] args) {
		
		Ring ring=new Ring();
		ring.type="Platinum";
		ring.price="10000 Rs";
		ring.type="Stainless Steel";
		System.out.println(ring);
		System.out.println("Updated values");
		System.out.println(ring.hashCode());
		ring.color="gold";
		ring.price="25000 Rs";
		ring.type="gold";
		System.out.println(ring);
		System.out.println(ring.hashCode());
		System.out.println("*******************************");
		
		SwitchBoard board = new SwitchBoard();
		board.brand="Panasonic";
		board.type="Fiber";
		board.noOfSockets="4 socket";
		System.out.println(board);
		System.out.println(board.hashCode());
		System.out.println("Updated values");
		board.brand="Hi-Fi";
		board.noOfSockets="2 socket";
		board.type="Plastic";
		System.out.println(board);
		System.out.println(board.hashCode());
		System.out.println("*******************************");
		
		Paint paint=new Paint();
		paint.color="Blue";
		paint.brand="Asian Paint";
		paint.type="Oil Paint";
		System.out.println(paint);
		System.out.println(paint.hashCode());
		System.out.println("Updated values");
		paint.brand="Nippon";
		paint.color="Yellow";
		paint.type="Wall Paint";
		System.out.println(paint);
		System.out.println(paint.hashCode());
		System.out.println("*******************************");
		
		Table table=new Table();
		table.type="Wooden Table";
		table.color="Brown";
		table.price="1000 Rs";
		System.out.println(table);
		System.out.println(table.hashCode());
		System.out.println("Updated values");
		table.color="Black-brown";
		table.price="2000 Rs";
		table.type="Plastic";
		System.out.println(table);
		System.out.println(table.hashCode());
		System.out.println("*******************************");
		
		Tie tie=new Tie();
		tie.color="Red";
		tie.pattern="Plane";
		tie.price="100 Rs";
		System.out.println(tie);
		System.out.println(tie.hashCode());
		System.out.println("Updated values");
		tie.color="Black";
		tie.pattern="Stripes";
		tie.price="200 Rs";
		System.out.println(tie);
		System.out.println(tie.hashCode());
		System.out.println("*******************************");
		
		Battery battery=new Battery();
		battery.type="Removable";
		battery.color="Black";
		battery.brand="Asaskai";
		System.out.println(battery);
		System.out.println(battery.hashCode());
		System.out.println("Updated values");
		battery.type="Rechargebale";
		battery.color="Grey";
		battery.brand="Askai";
		System.out.println(battery);
		System.out.println(battery.hashCode());
		System.out.println("*******************************");
		
		Colgate colgate=new Colgate();
		colgate.taste="Salt";
		colgate.price="10 Rs";
		colgate.color="White";
		System.out.println(colgate);
		System.out.println(colgate.hashCode());
		System.out.println("Updated values");
		colgate.taste="Sweet";
		colgate.price="20 Rs";
		colgate.color="Red";
		System.out.println(colgate);
		System.out.println(colgate.hashCode());
	}
}
