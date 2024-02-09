package com.xworkz.casting.runner;

import com.xworkz.casting.HomeTheater;
import com.xworkz.casting.SmartTv;
import com.xworkz.casting.Television;
import com.xworkz.casting.Tv;

public class TelevisionRunner {

	public static void main(String[] args) {
		
		Tv tv=new Tv();
		
		Television tel=new Television();
		tv.Television(tel);
		
		SmartTv smart=new SmartTv();
		tv.Television(smart);
		
		HomeTheater homeTheater=new HomeTheater();
		tv.Television(homeTheater);
		
		
	}

}
