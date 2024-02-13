package com.xworkz.heirarchy;

public class Jeera {
	
	public void UnibicBiscuit(UnibicBiscuit biscuit) {
		
		System.out.println(biscuit.price);
		biscuit.eat();
		
		if(biscuit instanceof Cashew) {
			Cashew cashew=(Cashew)biscuit;
			System.out.println(cashew.dietType);
			cashew.nutrition();
		}
		if(biscuit instanceof Chocolate) {
			Chocolate chocolate=(Chocolate)biscuit;
			System.out.println(chocolate.itemForm);
			chocolate.texture();
		}
		if(biscuit instanceof GingerNut) {
			GingerNut gingerNut=(GingerNut)biscuit;
			System.out.println(gingerNut.NetQuantity);
			gingerNut.variety();
		}
		if(biscuit instanceof PistaBadam) {
			PistaBadam pistaBadam=(PistaBadam)biscuit;
			System.out.println(pistaBadam.numberOfPieces);
			pistaBadam.diet();
		}
	}

}
