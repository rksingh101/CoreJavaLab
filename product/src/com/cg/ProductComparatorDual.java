package com.cg;

import java.util.Comparator;

public class ProductComparatorDual implements Comparator<Product>
	{
		public int compare(Product obj1, Product obj2)
		{
			
			int diff = obj1.getName().compareTo(obj2.getName());
			
			if(diff != 0)
				return diff;
			else
			{
				 diff = (int) (obj1.getPrice() - obj2.getPrice());
			     return diff;
			}
		}
}
