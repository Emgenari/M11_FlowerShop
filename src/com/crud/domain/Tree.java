package com.crud.domain;

public class Tree extends Product {
	
	private double height;
	
	public Tree(String name, double height, double price) {
		
		super(name, price);
        this.height = height;
						
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tree [" +
                "Id = " + getId() +
                ", height =" + height +
                ", name =" + getName() +
                ", price =" + getPrice() +
                "]";
	}
}