package src.com.crud.domain;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
		
	private String name;
	private List<Product> stock = new ArrayList<>();
	
	public FlowerShop(String name){
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getStock() {
		return stock;
	}

	public void setStock(List<Product> stock) {
		this.stock = stock;
	}

	//adds a product to the stock
	public void addStock(Product itemStock) {
		stock.add(itemStock);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlowerShop [name=");
		builder.append(name);
		builder.append(", stock=");
		builder.append(stock.size());
		builder.append(" itens]");
		return builder.toString();
	}

}