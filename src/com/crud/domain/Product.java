package com.crud.domain;

public abstract class Product {
	
	private String name;
	private double price;
	private int id;
	private static int countId = 1;

	//constructor
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
		id = countId;
		Product.countId++;
	}

	//getters & setters
    public int getId() { return id; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}