package com.capg.basic.Springmvnapp1;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MyRestController{
	
	
	@Autowired
	ProductDAOImpl dao;
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Welcome to Spring";
	}
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi, Spring";
	}
	
	@GetMapping("/product/{range1}/{range2}")
	public List<Product> getProductsByRange(@PathVariable int range1, @PathVariable int range2){
		return dao.getProductsByRange(range1, range2);
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return dao.getProductById(id);
	}
	
	@GetMapping("/product/delete/{id}")
	public List<Product> deleteProductBtId(@PathVariable int id){
		return dao.deleteProductById(id);
	}
	
	@GetMapping("/product/ratings/{rating}")
	public List<Product> getProductsByRating(@PathVariable int rating){
		return dao.getProductsbyRating(rating);
	}
}


