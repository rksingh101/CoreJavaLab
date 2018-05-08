package com.seed.beans;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Enumeration;

//TODO:0	Modification required
public class ShoppingCart {
	private java.util.Collection<Integer> productIds;	
    
	
	public ShoppingCart() 
	{
//		TODO:1 Create object of LinkedList,
//		which will be referred using member variable "productIds"
	    LinkedList list = new LinkedList();
	    productIds =((Collection)list);
	    
	}	
	
	public java.util.Set<Integer> getProductSet() {
		//		TODO:2 return set of product ids stored in this shopping cart
		HashSet<Integer> productSet = new HashSet<Integer>();
		productSet.addAll(productIds);
		return productSet;
	}

	public void setProductList(String[] newProductIds) {
//		TODO:3	add newProductIds into existing list of product ids
	      for(String newProductId: newProductIds)
	      {
	    	  productIds.add(Integer.parseInt(newProductId));
	      }
	}	
}
