package com.xworkz.casting;

public class Home {

	
		public void runHandwash(Handwash handwash) {
			
		System.out.println(handwash.aroma);
        handwash.clean();
        
        
        if(handwash instanceof Handwash) {
        	Handwash handwash1=(Handwash)handwash;
        	System.out.println(handwash1.aroma);
        	handwash1.clean();
        	
        }
	}
        
        
        public void Sanitizer(Sanitizer sanitizer) {
        	
        	 System.out.println(sanitizer.quantity);
             sanitizer.disinfect();
             
             if(sanitizer instanceof Handwash) {
            	 Handwash handwash=(Handwash)sanitizer;
                 System.out.println(handwash.aroma);
                 handwash.clean();
         	}else if(sanitizer instanceof Sanitizer)
         	{
         		Sanitizer sanitizer1=(Sanitizer)sanitizer;
         		System.out.println(sanitizer1.quantity);
         		sanitizer1.disinfect();
         		
         	}
        
	}
        public void Soap(Soap soap) {
        	 System.out.println(soap.brand);
             soap.foam();
           
             if(soap instanceof Handwash) {
            	 Handwash handwash=(Handwash)soap;
                 System.out.println(handwash.aroma);
                 handwash.clean();
                 
         	}else if(soap instanceof Soap) {
         		Soap soap1=(Soap)soap;
                System.out.println(soap1.brand);
                soap1.foam();
        	}
        }
        
        public void Lux(Lux lux) {
        	 System.out.println(lux.price);
        	 lux.makeYoung();
        	 
        	 if(lux instanceof Soap) {
        		 Soap soap=(Soap)lux;
                 System.out.println(soap.brand);
                 soap.foam();
         	}
        	 
        }
	
}
