package src.com.crud.domain;

public class Flower extends Product {
	
	private String colour;
	
	public Flower(String name, String colour, double price) {
			
		super(name, price);
        this.colour = colour;
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Flower [colour=" + colour + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

}