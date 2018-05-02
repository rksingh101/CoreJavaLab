package com.cg;

import java.util.Comparator;

//import com.cg.util.EmployeePK;

public class ProductComparator implements Comparator<Product>
{
	public int compare(Product obj1, Product obj2) {
		double diff = obj1.getPrice() - obj2.getPrice();
		return (int)diff;
		}
}
