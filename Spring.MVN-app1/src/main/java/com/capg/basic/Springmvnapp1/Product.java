package com.capg.basic.Springmvnapp1;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private int id;
	private String name;
	private int cost;
	private int starRating;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, int cost, int starRating) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.starRating = starRating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getStarRating() {
		return starRating;
	}


	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", starRating=" + starRating + "]";
	}
	
	
}
