package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.CollectionDTO.BoxDTO;

public class BoxRunner {

	public static void main(String[] args) {

		BoxDTO box = new BoxDTO(150, "Red", 10, "wood");
		BoxDTO box1 = new BoxDTO(100, "Blue", 52, "Plastic");
		BoxDTO box2 = new BoxDTO(200, "Orange", 31, "Paper Craft");
		BoxDTO box3 = new BoxDTO(360, "Green", 40, "Steel");
		BoxDTO box4 = new BoxDTO(430, "Yellow", 61, "Glass");
		BoxDTO box5 = new BoxDTO(160, "Green", 27, "Ceramic");
		BoxDTO box6 = new BoxDTO(400, "Grey", 23, "Leather");
		BoxDTO box7 = new BoxDTO(740, "Red", 78, "Fabric");
		BoxDTO box8 = new BoxDTO(300, "Red", 9, "PaperBoard");
		BoxDTO box9 = new BoxDTO(500, "Green", 43, "wood");

		Collection<BoxDTO> collectionBox = new ArrayList<BoxDTO>();
		collectionBox.add(box);
		collectionBox.add(box1);
		collectionBox.add(box2);
		collectionBox.add(box3);
		collectionBox.add(box4);
		collectionBox.add(box5);
		collectionBox.add(box6);
		collectionBox.add(box7);
		collectionBox.add(box8);
		collectionBox.add(box9);

		System.out.println("Size:" + collectionBox.size());
		System.out.println("--------------------------------");

		for (BoxDTO boxdto : collectionBox) {

			if (boxdto.getColor().equals("Red")) {

				System.out.println("Which has Red Color:" + boxdto.getMaterial());
			}
		}

		System.out.println("**********Green Color********************");

		Iterator<BoxDTO> iterator = collectionBox.iterator();

		while (iterator.hasNext()) {
			BoxDTO bdto = iterator.next();
			if (bdto.getColor().equals("Green")) {
				iterator.remove();
				// System.out.println("Colors"+bt.getColor());
				System.out.println("Green color Box:" + bdto.getMaterial());
			}
		}
		System.out.println("*************After removing box color*************");

		for (BoxDTO bdto : collectionBox) {
			System.out.println(bdto);
		}
		System.out.println("After size:" + collectionBox.size());
	}

}
