package com.capg.basic.Springmvnapp1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

// Manage Database

@Component
public class ProductDAOImpl {
	List<Product> list = new ArrayList<>();

	public ProductDAOImpl() {
		
		Product p1 = new Product(101, "HP-101",45000, 4);
		Product p2 = new Product(102, "HP-102",15000, 3);
		Product p3 = new Product(103, "HP-103",25000, 5);
		Product p4 = new Product(104, "HP-104",20000, 3);
		Product p5 = new Product(105, "HP-105",145000, 4);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
	}
	
	public List<Product> getAllProducts()
	{
		return list;
	}
	
	public List<Product> getProductsByRange(int range1, int range2){
		
		Comparator<Product> comp = (p1, p2)->p1.getCost()-p2.getCost();
		List<Product> pList = list.stream().
				filter((product)->product.getCost()>=range1 && product.getCost()<= range2).
				collect(Collectors.toList());
		return pList;
		
	}
	
	public Product getProductById(int id) {
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getId() == id)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	
	public List<Product> deleteProductById(int id) {
		Product p1 = null;
		for(Product p : list) {
			if(p.getId() == id) {
				 p1 = p;
			}
		}
		list.remove(p1);
		return list;
	}
	
	public List<Product> getProductsbyRating(int rating){
		boolean isIdFound = false;
		List<Product> tempList = new ArrayList<>();
		tempList.clear();
		for (Product product : list) {
			if(product.getStarRating() == rating)
			{
				isIdFound = true;
				tempList.add(product);
			}
		}
		return tempList;
	}
}
