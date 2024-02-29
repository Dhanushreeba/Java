package com.xworkz.runner;

import com.xworkz.exception.SignalNotFoundException;
import com.xworkz.exception.TrafficSignal;

public class TrafficSignalRunner {
	
	public static void main(String[] args) throws Exception {
		
		try {
			TrafficSignal signal=new TrafficSignal();
			System.out.println("before light");
			signal.colorLight("Red");
			System.out.println("after light");
		}
		catch(SignalNotFoundException sn){
			System.err.println("handling exception :"+sn.getMessage());
			System.out.println(sn.getClass());
			System.out.println(sn.getStackTrace());
		}
	}

}
