package com.crud.domain;

public class Decoration extends Product {
	
	private String material;
	
	public Decoration(String name, String material, double price) {
		
		super(name, price);
        this.material = material;
						
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Decoration [" +
                "Id = " + getId() +
                ", material = " + material +
                ", name = " + getName() +
                ", price =" + getPrice() +
                "]";
	}

}