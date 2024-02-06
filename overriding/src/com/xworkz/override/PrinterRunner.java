package com.xworkz.override;

import com.xworkz.method.CanonPrinter;
import com.xworkz.method.Printer;
import com.xworkz.method.SmartCanonPrinter;

public class PrinterRunner {

	public static void main(String[] args) {
		
		Printer printer=new Printer();
		printer.print();
		printer.scan();
		printer.copy();
		
		System.out.println("-------------------------------------");
		CanonPrinter canon=new CanonPrinter();
		canon.connectToWifi();
		canon.print();
		canon.scan();
		canon.copy();
		
		Printer p=new CanonPrinter();
		p.print();
		p.scan();
		p.copy();
		System.out.println("********************************************");
		
		SmartCanonPrinter smart=new SmartCanonPrinter();
		smart.connectToMobile();
		smart.connectToWifi();
		smart.print();
		smart.scan();
		smart.copy();
		System.out.println("-------------------------------------");

	
	
		CanonPrinter c=new SmartCanonPrinter();
		c.print();
		c.scan();
		c.copy();
		c.connectToWifi();
		System.out.println("********************************************");
		
		Printer pnt=new SmartCanonPrinter();
		pnt.print();
		pnt.scan();
		pnt.copy();
	
		System.out.println("********************************************");
		CanonPrinter cp=(CanonPrinter)c;
		cp.print();
		cp.scan();
		cp.copy();
		cp.connectToWifi();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		SmartCanonPrinter sp=(SmartCanonPrinter)pnt;
		sp.print();
		sp.scan();
		sp.copy();
		sp.connectToWifi();
		sp.connectToMobile();

}
}
