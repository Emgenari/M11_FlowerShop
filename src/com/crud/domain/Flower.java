package com.crud.domain;

public class Flower extends Product {
	
	private String colour;

	//construcor
	public Flower(String name, String colour, double price) {
			
		super(name, price);
        this.colour = colour;
		
	}

	//getters & setters

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Flower [" +
                "Id = " + getId() +
                ", colour=" + colour +
                ", name = " + getName() +
                ", price =" + getPrice() +
                "]";
	}
}