package com.cg;

import java.util.TreeSet;

public class Entry {
	public static void main(String[] args)
	{
		TreeSet tree1 = new TreeSet();
		TreeSet tree2 = new TreeSet(new ProductComparator());
		TreeSet tree3 = new TreeSet(new ProductComparatorDual());
		
		Product e1 = new Product(10,"Livon", 125.25);
		tree1.add(e1);
		//tree2.add(e1);
		//tree3.add(e1);
		System.out.println(e1 + " added");
		
		Product e2 = new Product(7,"Colgate", 147.0);
		tree1.add(e2);
		//tree2.add(e2);
		//tree3.add(e2);
		System.out.println(e2 + " added");
		
		Product e3 = new Product(14,"Dominos", 169.36);
		tree1.add(e3);
		//tree2.add(e3);
		//tree3.add(e3);
		System.out.println(e3 + " added");
		
		Product e4 = new Product(11,"Lays", 174.25);
		tree1.add(e4);
		//tree2.add(e4);
		//tree3.add(e4);
		System.out.println(e4 + " added");
		
		Product e5 = new Product(20,"Adidas", 80.76);
		tree1.add(e5);
		//tree2.add(e5);
		//tree3.add(e5);
		System.out.println(e5 + " added");
		
		tree2.addAll(tree1);
		tree3.addAll(tree1);
		
		
		System.out.println();
		System.out.println("Natural Order by ID:");
		System.out.println("Size of tree:"+tree1.size());
		for(Object ob : tree1){
		System.out.println(ob);
	    }
		
		System.out.println();
		System.out.println();
		System.out.println("Custom Order by price:");
		System.out.println("Size of tree:"+tree2.size());
		for(Object ob2 : tree2){
		System.out.println(ob2);
	    }
		
		System.out.println();
		System.out.println();
		System.out.println("Custom Order by name and price:");
		System.out.println("Size of tree:"+tree3.size());
		for(Object ob3 : tree3){
		System.out.println(ob3);
	    }
	}
}
