package com.xworkz.override;

import com.xworkz.method.Window;
import com.xworkz.method.WoodWindow;

public class WindowRunner {
	
	public static void main(String[] args) {
		
		Window window=new Window();
		window.open();
		window.close();
		window.semiClose();
		System.out.println("*************************");
		
		WoodWindow win=new WoodWindow();
		win.open();
		win.close();
		win.autoClose();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		Window w=new WoodWindow();
		w.open();
		w.close();
		w.semiClose();
//      w.autoclose();
		
		//Type casting
		WoodWindow wind=(WoodWindow)win;
		wind.autoClose();
				
		
	}

}
