package com.xworkz.Tree;


public class BiscuitsRunner {

	public static void main(String[] args) {
		
		Tree tree=new Tree();
		tree.name="Banyan";
		System.out.println(tree.name);
		tree.monkey=new Monkey();
		tree.monkey.age=35;
		tree.monkey.type="Gorrilla";
		System.out.println(tree.monkey.age);
		System.out.println(tree.monkey.type);
		tree.location=new Location();
		tree.location.area="BTM";
		tree.location.city="Bangalore";
		System.out.println(tree.location.area);
		System.out.println(tree.location.city);
		System.out.println();
		tree.monkey.biscuits=new Biscuits();
		tree.monkey.biscuits.brand="Parle-g";
		tree.monkey.biscuits.cost=12.098d;
		System.out.println(tree.monkey.biscuits.brand);
		System.out.println(tree.monkey.biscuits.cost);
		
		
		
		

	}

}
